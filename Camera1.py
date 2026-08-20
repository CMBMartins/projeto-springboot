import os
import queue
import threading
import time
from datetime import datetime
import cv2
import requests

# ==========================================================
# CONFIGURAÇÕES
# ==========================================================
URL_API = "https://projeto-springboot.onrender.com/saude/camera"
LIMIAR_AREA = 1000
INTERVALO_COOLDOWN = 5  # Segundos para evitar requisições duplicadas

# Fila assíncrona para envio de requisições HTTP sem travar o vídeo
fila_envio = queue.Queue()


def worker_envio_api():
    """Thread dedicada ao envio de dados para a API no Render."""
    session = requests.Session()
    while True:
        dados = fila_envio.get()
        if dados is None:
            break
        try:
            resposta = session.post(URL_API, json=dados, timeout=5)
            print(f"API [{dados['compartimento']}]: HTTP {resposta.status_code}")
        except Exception as e:
            print(f"Erro no envio do compartimento {dados['compartimento']}: {e}")
        finally:
            fila_envio.task_done()


# Inicializa a thread de envio em segundo plano
thread_api = threading.Thread(target=worker_envio_api, daemon=True)
thread_api.start()


def criar_compartimentos():
    compartimentos = {}
    linhas, colunas = 3, 5
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


COMPARTIMENTOS = criar_compartimentos()
ESTADO_ANTERIOR = {nome: False for nome in COMPARTIMENTOS}
ULTIMO_ENVIO = {}


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


def salvar_referencias(frame):
    print("===================================")
    print("SALVANDO REFERÊNCIAS")
    pasta = os.path.join(os.getcwd(), "referencias")
    os.makedirs(pasta, exist_ok=True)

    for nome, (x1, y1, x2, y2) in COMPARTIMENTOS.items():
        roi = frame[y1:y2, x1:x2]
        arquivo = os.path.join(pasta, f"{nome}.png")
        ok = cv2.imwrite(arquivo, roi)
        print(f"{arquivo} -> {ok}")
    print("Fim da gravação.\n===================================")


def agendar_envio_api(compartimento):
    agora = datetime.now()

    if compartimento in ULTIMO_ENVIO:
        if (agora - ULTIMO_ENVIO[compartimento]).total_seconds() < INTERVALO_COOLDOWN:
            return

    ULTIMO_ENVIO[compartimento] = agora
    dados = {"compartimento": compartimento, "dataHora": agora.isoformat()}
    fila_envio.put(dados)


def detectar_medicamento(frame):
    # Otimização: pré-processamento feito uma única vez na imagem inteira
    cinza = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    blur = cv2.GaussianBlur(cinza, (5, 5), 0)
    _, mascara_global = cv2.threshold(blur, 120, 255, cv2.THRESH_BINARY_INV)

    for nome, (x1, y1, x2, y2) in COMPARTIMENTOS.items():
        roi_mascara = mascara_global[y1:y2, x1:x2]
        roi_frame = frame[y1:y2, x1:x2]

        contornos, _ = cv2.findContours(
            roi_mascara, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE
        )

        maior_area = 0
        maior_contorno = None

        for contorno in contornos:
            area = cv2.contourArea(contorno)
            if area > maior_area:
                maior_area = area
                maior_contorno = contorno

        estado_atual = maior_area > LIMIAR_AREA

        if estado_atual and maior_contorno is not None:
            cv2.drawContours(roi_frame, [maior_contorno], -1, (0, 255, 0), 2)

        # Transição: Medicamento estava presente (True) e foi removido (False)
        estado_anterior = ESTADO_ANTERIOR[nome]
        if estado_anterior and not estado_atual:
            print(f"[{nome}] MEDICAMENTO RETIRADO!")
            agendar_envio_api(nome)

        ESTADO_ANTERIOR[nome] = estado_atual


# =====================================================
# PROGRAMA PRINCIPAL
# =====================================================
camera = cv2.VideoCapture(0, cv2.CAP_DSHOW)
time.sleep(2)

if not camera.isOpened():
    print("Erro: Não foi possível acessar a webcam.")
    exit()

print("Webcam iniciada com sucesso!")

referencias_salvas = False
inicio = time.time()

try:
    while True:
        sucesso, frame = camera.read()
        if not sucesso or frame is None:
            print("Falha ao capturar imagem.")
            continue

        detectar_medicamento(frame)
        desenhar_compartimentos(frame)

        if not referencias_salvas and (time.time() - inicio) >= 5:
            salvar_referencias(frame)
            referencias_salvas = True

        cv2.imshow("Monitor de Medicamentos", frame)

        if cv2.waitKey(1) & 0xFF == 27:  # Tecla ESC
            break
finally:
    camera.release()
    cv2.destroyAllWindows()
    fila_envio.put(None)  # Encerra a thread de envio
