
/*******************************************************
 * PROJETO SIMULADOR PARA TREINAMENTO DE OPERADORES DE *
 * SUBESTAÇAO.                                         *
 * PROJETISTA E DESENVOLVEDOR:                         *
 *          CARLOS MARDONIO BEZERRA MARTINS            * 
 *         BACHAREL EM SISTEMAS DE INFORMAÇAO          *
 *                                                     *
 * DATA - 18/08/2006                                   *
 * ATUALIZADO - 19/08/2008                            *
 *******************************************************
 * MODULO -   INTERFACERELATORIOS                      *
 ******************************************************/
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class Imagens1 extends JFrame {

    private final JLabel titulo, imagemLabel;
    private final Map<String, String> imagemMap = new HashMap<>();

    public Imagens1() {
        setTitle("Imagens dos Equipamentos");
        setLayout(null);
        setSize(800, 750);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // setLocation(150, 50);
        // setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Logo
        JLabel logo = new JLabel(new ImageIcon("ALBRAS1.JPG"));
        logo.setBounds(10, 5, 230, 38);
        add(logo);

        // Título
        titulo = new JLabel("Pátio de 230 kV");
        titulo.setFont(new Font("Arial", Font.BOLD, 36));
        titulo.setForeground(Color.BLUE);
        titulo.setBounds(300, 0, 500, 36);
        add(titulo);

        // Imagem principal
        imagemLabel = new JLabel(new ImageIcon("Patio.jpg"));
        imagemLabel.setBounds(40, 40, 700, 500); // melhor encaixe
        add(imagemLabel);

        // Inicializa mapa de imagens
        inicializarImagens();

        // Botões
        String[] nomes = {
                "Pátio de 230 KV", "Disjuntor de 230 KV", "CS230 Fechada", "CS 230 Aberta", "Trafo MT", "Trafo LVR",
                "Retificador", "Planta", "Capacitor", "Trafo 480VCA", "CCMs",
                "CCPs", "Geradores", "Estação", "Sair"
        };

        int larguraBotao = 135;
        int alturaBotao = 35;
        int espacamentoX = 10;
        int inicioX = 40;

        for (int i = 0; i < nomes.length; i++) {
            int linha;
            int coluna;

            if (i < 5) {
                linha = 560;
                coluna = inicioX + i * (larguraBotao + espacamentoX);
            } else if (i < 10) {
                linha = 605;
                coluna = inicioX + (i - 5) * (larguraBotao + espacamentoX);
            } else {
                linha = 650;
                coluna = inicioX + (i - 10) * (larguraBotao + espacamentoX);
            }

            JButton botao = new JButton(nomes[i]);
            botao.setFont(new Font("Dialog", Font.BOLD, 13));
            botao.setBounds(coluna, linha, larguraBotao, alturaBotao);
            add(botao);

            final String nomeBotao = nomes[i];
            botao.addActionListener(e -> {
                if (nomeBotao.equals("Sair")) {
                    dispose();
                } else {
                    trocarImagemETitulo(nomeBotao);
                }
            });
        }

        setVisible(true);
    }

    private void inicializarImagens() {
        imagemMap.put("Pátio de 230 KV", "Patio.jpg");
        imagemMap.put("Disjuntor de 230 KV", "Foto Disjuntor1.JPG");
        imagemMap.put("CS230 Fechada", "CS Fechada1.JPG");
        imagemMap.put("CS 230 Aberta", "CS Aberta 1.JPG");
        imagemMap.put("Trafo MT", "Foto MT.JPG");
        imagemMap.put("Trafo LVR", "TF LVR.JPG");
        imagemMap.put("Retificador", "RFT.JPG");
        imagemMap.put("Planta", "planta.JPG");
        imagemMap.put("Capacitor", "Capacitor1.JPG");
        imagemMap.put("Trafo 480VCA", "TF AUX.JPG");
        imagemMap.put("CCMs", "CCM.JPG");
        imagemMap.put("CCPs", "CCPs.JPG");
        imagemMap.put("Geradores", "Geradores.JPG");
        imagemMap.put("Estação", "Operador1.JPG");
    }

    private void trocarImagemETitulo(String chave) {
        String caminho = imagemMap.get(chave);
        if (caminho != null) {
            imagemLabel.setIcon(new ImageIcon(caminho));
            titulo.setText(tituloFormatado(chave));
        }
    }

    private String tituloFormatado(String nome) {
        switch (nome) {
            case "CS230 Fechada":
            case "CS 230 Aberta":
                return "Seccionadora 230 kV";
            case "TF 480VCA":
                return "Trafo de 480 VCA";
            case "CCMs":
                return "Centro de Controle de Motores";
            case "CCPs":
                return "Sala dos CCPs";
            case "Geradores":
                return "Geradores de Emergência";
            case "Estação":
                return "Estação de Operação";
            default:
                return nome;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Imagens1::new);
    }
}
