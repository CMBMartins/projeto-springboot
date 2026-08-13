import cv2
import time
import os
import requests
from datetime import datetime


# ==========================================================
# CONFIGURAÇÕES
# ==========================================================
def criar_compartimentos():

    compartimentos = {}

    linhas = 3
    colunas = 5

    largura = 640 // colunas
    altura = 480 // linhas

    contador = 1

    for linha in range(linhas):

        for coluna in range(colunas):

            x1 = coluna * largura
            y1 = linha * altura

            x2 = x1 + largura
            y2 = y1 + altura

            nome = f"A{contador}"

            compartimentos[nome] = (x1, y1, x2, y2)

            contador += 1

    return compartimentos


# ==========================================================
# FUNÇÃO PARA ENVIAR MEDICAMENTO RETIRADO
# ==========================================================
COMPARTIMENTOS = criar_compartimentos()


def desenhar_compartimentos(frame):

    for nome, (x1, y1, x2, y2) in COMPARTIMENTOS.items():

        cv2.rectangle(frame, (x1, y1), (x2, y2), (0, 255, 0), 2)

        cv2.putText(
            frame,
            nome,
            (x1 + 5, y1 + 20),
            cv2.FONT_HERSHEY_SIMPLEX,
            0.6,
            (0, 255, 0),
            2,
        )


ESTADO_COMPARTIMENTOS = {nome: False for nome in COMPARTIMENTOS}


ESTADO_ANTERIOR = {nome: False for nome in COMPARTIMENTOS}

LIMIAR_AREA = 1000


# =====================================================
# Exibe cada compartimento separadamente
# =====================================================
def mostrar_compartimentos(frame):

    for nome, (x1, y1, x2, y2) in COMPARTIMENTOS.items():

        roi = frame[y1:y2, x1:x2]

        cv2.imshow(nome, roi)


def salvar_referencias(frame):

    print("===================================")
    print("SALVANDO REFERÊNCIAS")
    print("Pasta atual:", os.getcwd())

    pasta = os.path.join(os.getcwd(), "referencias")

    if not os.path.exists(pasta):
        os.makedirs(pasta)

    for nome, (x1, y1, x2, y2) in COMPARTIMENTOS.items():

        roi = frame[y1:y2, x1:x2]

        arquivo = os.path.join(pasta, f"{nome}.png")

        ok = cv2.imwrite(arquivo, roi)

        print(f"{arquivo} -> {ok}")

    print("Fim da gravação.")
    print("===================================")


# ==========================================================
# FUNÇÃO PARA DETECTAR MEDICAMENTO RETIRADO
# ==========================================================
def detectar_medicamento(frame):

    for nome, (x1, y1, x2, y2) in COMPARTIMENTOS.items():

        # Recorta apenas o compartimento
        roi = frame[y1:y2, x1:x2]

        # Converte para tons de cinza
        cinza = cv2.cvtColor(roi, cv2.COLOR_BGR2GRAY)

        # Suaviza a imagem
        blur = cv2.GaussianBlur(cinza, (5, 5), 0)

        # Cria a máscara
        _, mascara = cv2.threshold(blur, 120, 255, cv2.THRESH_BINARY_INV)

        # Procura os contornos
        contornos, _ = cv2.findContours(
            mascara, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE
        )

        maior_area = 0
        maior_contorno = None

        # Encontra o maior contorno
        for contorno in contornos:

            area = cv2.contourArea(contorno)

            if area > maior_area:
                maior_area = area
                maior_contorno = contorno

        # Verifica se há medicamento
        if maior_area > LIMIAR_AREA:

            estado_atual = True
            status = "OCUPADO"

            if maior_contorno is not None:
                cv2.drawContours(roi, [maior_contorno], -1, (0, 255, 0), 2)

        else:

            estado_atual = False
            status = "VAZIO"

        # Verifica mudança de estado
        estado_anterior = ESTADO_ANTERIOR[nome]

        if estado_anterior and not estado_atual:

            print(f"{nome}: POSSIVEL MEDICAMENTO RETIRADO!")

            enviar_para_api(nome)

        # Atualiza os estados
        ESTADO_COMPARTIMENTOS[nome] = estado_atual
        ESTADO_ANTERIOR[nome] = estado_atual

        print(f"{nome}: {status} - Área = {maior_area:.1f}")

        # cv2.imshow("Máscara " + nome, mascara)


ULTIMO_ENVIO = {}


# ==========================================================
# FUNÇÃO PARA ENVIAR API
# ==========================================================
def enviar_para_api(compartimento):

    agora = datetime.now()

    if compartimento in ULTIMO_ENVIO:

        diferenca = agora - ULTIMO_ENVIO[compartimento]

        if diferenca.total_seconds() < 5:
            return

    ULTIMO_ENVIO[compartimento] = agora

    dados = {"compartimento": compartimento, "dataHora": agora.isoformat()}
    try:

        resposta = requests.post(
            "https://projeto-springboot.onrender.com/saude/camera",
            json=dados,
            timeout=2,
        )

        print(compartimento, "=>", resposta.status_code)

    except Exception as e:

        print("Erro ao enviar:", e)


# ==========================================================
# FUNÇÃO PARA INFORMAR QUE A CÂMERA ESTÁ ONLINE
# ==========================================================
def enviar_status_camera():

    try:

        resposta = requests.post(
            "https://projeto-springboot.onrender.com/saude/camera/status",
            json={"status": "ONLINE"},
            timeout=5,
        )

        if resposta.ok:
            print("📷 Camera: ONLINE")
        else:
            print("⚠️ Erro ao enviar status:", resposta.status_code)

    except Exception as e:

        print("❌ Erro ao comunicar com o servidor:", e)


# =====================================================
# Programa principal
# =====================================================
# camera = cv2.VideoCapture(0)
camera = cv2.VideoCapture(0, cv2.CAP_DSHOW)

time.sleep(2)

if not camera.isOpened():

    print("Erro: Não foi possível acessar a webcam.")
    exit()

print("Webcam iniciada com sucesso!")

referencias_salvas = False
inicio = time.time()

ultimo_status = 0
INTERVALO_STATUS = 10

# ==========================================
# Loop principal
# ==========================================

while True:

    sucesso, frame = camera.read()

    if not sucesso or frame is None:

        print("Falha ao capturar. Tentando novamente...")

        time.sleep(0.2)

        continue

    # ==================================================
    # ATUALIZAÇÃO DO STATUS DA CÂMERA
    # ==================================================
    agora = time.time()

    if agora - ultimo_status >= INTERVALO_STATUS:

        enviar_status_camera()

        ultimo_status = agora

    # ==================================================
    # SALVA AS REFERÊNCIAS
    # ==================================================
    # Aguarda 5 segundos e salva as referências uma única vez
    if not referencias_salvas and (time.time() - inicio) >= 5:

        print("Salvando imagens de referência...")

        salvar_referencias(frame)

        referencias_salvas = True

    # ==================================================
    # PROCESSAMENTO DOS COMPARTIMENTOS
    # ==================================================
    desenhar_compartimentos(frame)

    detectar_medicamento(frame)

    # ------------------------------------------
    # MOSTRA A IMAGEM
    # ------------------------------------------
    cv2.imshow("Monitor de Medicamentos", frame)

    tecla = cv2.waitKey(1) & 0xFF

    if tecla == 27:
        break

# ==========================================================
# FINALIZAÇÃO
# ==========================================================
camera.release()
cv2.destroyAllWindows()
