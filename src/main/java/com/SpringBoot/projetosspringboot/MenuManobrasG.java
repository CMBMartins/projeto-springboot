
/*******************************************************
 * PROJETO SIMULADOR PARA TREINAMENTO DE OPERADORES DE *
 * SUBESTAÇAO.                                         *
 * PROJETISTA E DESENVOLVEDOR:                         *
 *          CARLOS MARDONIO BEZERRA MARTINS            * 
 *         BACHAREL EM SISTEMAS DE INFORMAÇAO          *
 *                                                     *
 * DATA - 18/08/2006                                   *
 * ATUALIZADO - 19/08/2008                             *
 *******************************************************
 * MODULO -   MENU MANOBRAS                            *
 ******************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuManobrasG extends JFrame implements ActionListener {
    private JLabel gif, projeto;

    JPanel jpPainel = new JPanel();

    public MenuManobrasG() // --- Configuraçao do Frame
    {
        super("Menu das Manobras");
        Container container = getContentPane();
        container.setLayout(new BorderLayout()); // gerenciador de layout

        setSize(420, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        // setLocation(380, 150);
        // setVisible(true);

        JLabel lbIndice;

        JButton bManEletronorte;
        JButton bMan230;
        JButton bManReduçao;
        JButton bManTransferencia;
        JButton bManGeradores;
        JButton bSair;
        // JButton bRetornar;

        JPanel painel = new JPanel();

        Icon imagem = new ImageIcon("linha.GIF");
        gif = new JLabel();
        gif.setIcon(imagem);
        painel.add(gif);

        projeto = new JLabel("Menu das Manobras", JLabel.CENTER);
        projeto.setFont(new Font("Arial", 1, 28));
        projeto.setForeground(Color.blue);
        painel.add(projeto);

        lbIndice = new JLabel("        Habilitar Classes de Manobras");
        lbIndice.setFont(new Font("Arial", 1, 20));
        lbIndice.setForeground(Color.black);
        lbIndice.setBounds(20, 70, 400, 40); // Coluna,Linha,Largura,Altura
        getContentPane().add(lbIndice);

        container.add(painel);

        bManEletronorte = new JButton("Manobras da ELETRONORTE"); // BOT�O TABELA DE EVENTOS
        bManEletronorte.setToolTipText("Pressione para chamar o Menu das Manobras da ELETRONORTE");
        bManEletronorte.setMnemonic(KeyEvent.VK_E);
        bManEletronorte.setActionCommand("ManobraEletronorte");// define o nome da acao
        bManEletronorte.setBounds(2, 110, 200, 40); // Coluna,Linha,Largura,Altura
        getContentPane().add(bManEletronorte);

        bMan230 = new JButton("Manobras de 230 kV");
        bMan230.setToolTipText("Pressione para chamar o Menu das Manobras de 230 kV");
        bMan230.setMnemonic(KeyEvent.VK_2);
        bMan230.setActionCommand("Manobra230");// define o nome da acao
        bMan230.setBounds(202, 110, 200, 40); // Coluna,Linha,Largura,Altura
        getContentPane().add(bMan230);

        bManReduçao = new JButton("Manobras da Reduçao");
        bManReduçao.setToolTipText("Pressione para chamar o Menu das Manobras da Reduçao");
        bManReduçao.setMnemonic(KeyEvent.VK_R);
        bManReduçao.setActionCommand("Redução");// define o nome da acao
        bManReduçao.setBounds(2, 149, 200, 40); // Coluna,Linha,Largura,Altura
        getContentPane().add(bManReduçao);

        bManTransferencia = new JButton("Manobras de Transferencia");
        bManTransferencia.setToolTipText("Pressione para chamar o Menu das Manobras de Transferencia");
        bManTransferencia.setMnemonic(KeyEvent.VK_T);
        bManTransferencia.setActionCommand("Transferencia");// define o nome da acao
        bManTransferencia.setBounds(202, 149, 200, 40); // Coluna,Linha,Largura,Altura
        getContentPane().add(bManTransferencia);

        bManGeradores = new JButton("Manobras Geradores");
        bManGeradores.setToolTipText("Pressione para chamar o Menu das Manobras dos Geradores");
        bManGeradores.setMnemonic(KeyEvent.VK_G);
        bManGeradores.setActionCommand("Geradores");// define o nome da acao
        bManGeradores.setBounds(2, 189, 200, 40); // Coluna,Linha,Largura,Altura
        getContentPane().add(bManGeradores);

        bSair = new JButton("         Sair         "); // BOT�O SAIR
        bSair.setForeground(Color.black);// cor do titulo do bot�o
        bSair.setEnabled(true);
        bSair.setToolTipText("Pressione para Sair");
        bSair.setMnemonic(KeyEvent.VK_B);
        bSair.setActionCommand("Sair");// define o nome da acao
        bSair.setBounds(202, 189, 200, 40); // Coluna,Linha,Largura,Altura
        getContentPane().add(bSair);

        bManEletronorte.setBackground(new Color(180, 180, 250));
        bMan230.setBackground(new Color(180, 180, 250));
        // bManReduçao.setBackground(new Color(180,180,250));
        // bManTransferencia.setBackground(new Color(180,180,250));
        // bManGeradores.setBackground(new Color(180,180,250));
        // bSair.setBackground(new Color(180,180,250));

        container.add(painel);

        bManEletronorte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MEActionPerformed(evt);
            }
        });

        bMan230.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                M2ActionPerformed(evt);
            }
        });

        bSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setVisible(false);
            }
        });
    }

    // --- Metodo que aglutina os eventos dos Bot�es
    public void actionPerformed(ActionEvent e) {
    }

    private void MEActionPerformed(ActionEvent evt) {
        // new MenuManobrasELN().setVisible(true);
        // setVisible(false);
        // this.hide();
    }

    private void M2ActionPerformed(ActionEvent evt) {
        // new MenuManobras().setVisible(true);
        // setVisible(false);
        // this.hide();
    }

    public static void main(String args[]) {
        MenuManobrasG menumanobrasg = new MenuManobrasG();
        menumanobrasg.setVisible(true);
    }
}