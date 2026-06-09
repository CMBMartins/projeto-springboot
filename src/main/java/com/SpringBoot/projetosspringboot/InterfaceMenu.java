
/*******************************************************
 * PROJETO SIMULADOR PARA TREINAMENTO DE OPERADORES DE *
 * SUBESTAÇÃO.                                         *
 * PROJETISTA E DESENVOLVEDOR:                         *
 *          CARLOS MARDONIO BEZERRA MARTINS            * 
 *         BACHAREL EM SISTEMAS DE INFORMAÇÃO          *
 *                                                     *
 * DATA - 18/08/2006                                   *
 * ATUALIZADOO - 19/08/2008                            *
 *******************************************************
 * MÓDULO -   INTERFACEMENU                            *
 ******************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.sql.*;
//import java.util.*;

public class InterfaceMenu extends JFrame implements ActionListener {
    JLabel gif, projeto;
    JPanel painel;

    JButton bBarraMTS;
    JButton bBarraMT1;
    JButton bBarraAL;
    JButton bBarraT1;
    JButton bBarraTr;
    JButton bBarraT2;
    JButton bBarraT3;
    JButton bBarraT4;
    JButton bSair;

    public InterfaceMenu() // --- Configuraçao do Frame
    {
        super("Acesso as Telas de Telecomando");
        Container container = getContentPane();
        container.setLayout(new BorderLayout()); // gerenciador de layout

        // Toolkit tk = Toolkit.getDefaultToolkit();
        // Dimension d = tk.getScreenSize();
        container.setBackground(new Color(180, 180, 180));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel l1 = new JLabel();
        l1.setFont(new Font("Arial", 1, 20));
        l1.setText("Barramentos de 230 kV");
        l1.setForeground(Color.green);
        l1.setBounds(240, 50, 350, 20);
        getContentPane().add(l1);

        JLabel l2 = new JLabel();
        l2.setFont(new Font("Arial", 1, 11));
        l2.setText("MT-1 Barra de 34.5kV");
        l2.setForeground(Color.green);
        l2.setBounds(10, 400, 130, 20);
        getContentPane().add(l2);

        JLabel l5 = new JLabel();
        l5.setFont(new Font("Arial", 1, 11));
        l5.setText("MT-R Barra de 34.5kV");
        l5.setForeground(Color.green);
        l5.setBounds(145, 400, 130, 20);
        getContentPane().add(l5);

        JLabel l6 = new JLabel();
        l6.setFont(new Font("Arial", 1, 11));
        l6.setText("MT-2 Barra de 34.5kV");
        l6.setForeground(Color.green);
        l6.setBounds(275, 400, 130, 20);
        getContentPane().add(l6);

        JLabel l7 = new JLabel();
        l7.setFont(new Font("Arial", 1, 11));
        l7.setText("MT-3 Barra de 34.5kV");
        l7.setForeground(Color.green);
        l7.setBounds(405, 400, 130, 20);
        getContentPane().add(l7);

        JLabel l8 = new JLabel();
        l8.setFont(new Font("Arial", 1, 11));
        l8.setText("MT-4 Barra de 34.5kV");
        l8.setForeground(Color.green);
        l8.setBounds(535, 400, 130, 20);
        getContentPane().add(l8);

        bBarraMTS = new JButton(""); // BOTAO PAINEL FRAME MENU DE TELECOMANDO
        bBarraMTS.setIcon(new javax.swing.ImageIcon("MTS3,4.gif"));
        bBarraMTS.addActionListener(this);
        bBarraMTS.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        bBarraMTS.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        bBarraMTS.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        // bBarraMTS.setBackground(new Color(0,0,0));//cor de fundo do botao
        bBarraMTS.setForeground(Color.black);// cor do titulo do botao
        bBarraMTS.setEnabled(true);
        bBarraMTS.setToolTipText("Pressione para a Tela dos Trafos MT-3 e MT-4");
        bBarraMTS.setMnemonic(KeyEvent.VK_B);
        bBarraMTS.setActionCommand("Barra MTS");// define o nome da acao
        bBarraMTS.setBounds(30, 80, 150, 80); // Coluna,Linha,Largura,Altura
        getContentPane().add(bBarraMTS);

        bBarraMT1 = new JButton(""); // BOTAO PAINEL FRAME MENU DE TELECOMANDO
        bBarraMT1.setIcon(new javax.swing.ImageIcon("Linhas.gif"));
        bBarraMT1.addActionListener(this);
        bBarraMT1.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        bBarraMT1.setVerticalTextPosition(AbstractButton.CENTER);// posiçao do texto
        bBarraMT1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        // bBarraMT1.setForeground(Color.black);//cor do titulo do bot�o
        bBarraMT1.setEnabled(true);
        bBarraMT1.setToolTipText("Pressione para acessar as Telas dos Trafos MT-1, MT-R, MT-2");
        bBarraMT1.setMnemonic(KeyEvent.VK_B);
        bBarraMT1.setActionCommand("Barra MT1");// define o nome da acao
        bBarraMT1.setBounds(190, 80, 330, 79); // Coluna,Linha,Largura,Altura
        getContentPane().add(bBarraMT1);

        bBarraAL = new JButton(""); // BOT�O PAINEL FRAME MENU DE TELECOMANDO
        bBarraAL.setIcon(new javax.swing.ImageIcon("AL.gif"));
        bBarraAL.addActionListener(this);
        bBarraAL.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        bBarraAL.setVerticalTextPosition(AbstractButton.CENTER);// posiçao do texto
        bBarraAL.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        // bBarraAL.setForeground(Color.black);//cor do titulo do botao
        bBarraAL.setEnabled(true);
        bBarraAL.setToolTipText("Pressione para acessar a tela do Bay do Alunorte");
        bBarraAL.setMnemonic(KeyEvent.VK_B);
        bBarraAL.setActionCommand("Barra AL");// define o nome da acao
        bBarraAL.setBounds(530, 80, 80, 80); // Coluna,Linha,Largura,Altura
        getContentPane().add(bBarraAL);

        bBarraT1 = new JButton(""); // BOT�O PAINEL FRAME MENU DE TELECOMANDO
        bBarraT1.setIcon(new javax.swing.ImageIcon("BarraT1.gif"));
        bBarraT1.addActionListener(this);
        bBarraT1.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        bBarraT1.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        bBarraT1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        // bBarraT1.setForeground(Color.black);//cor do titulo do botao
        bBarraT1.setEnabled(true);
        bBarraT1.setToolTipText("Pressione para a Tela da Barra T1 de 34,5 kV");
        bBarraT1.setMnemonic(KeyEvent.VK_B);
        bBarraT1.setActionCommand("Barra T1");// define o nome da acao
        bBarraT1.setBounds(20, 300, 106, 95); // Coluna,Linha,Largura,Altura
        getContentPane().add(bBarraT1);

        bBarraTr = new JButton(""); // BOTAO PAINEL FRAME MENU DE TELECOMANDO
        bBarraTr.setIcon(new javax.swing.ImageIcon("BarraTR.gif"));
        bBarraTr.addActionListener(this);
        bBarraTr.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        bBarraTr.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        bBarraTr.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        // bBarraTr.setForeground(Color.black);//cor do titulo do bot�o
        bBarraTr.setEnabled(true);
        bBarraTr.setToolTipText("Pressione para a Tela da Barra TR de 34,5 kV");
        bBarraTr.setMnemonic(KeyEvent.VK_B);
        bBarraTr.setActionCommand("Barra TR");// define o nome da acao
        bBarraTr.setBounds(150, 300, 106, 95); // Coluna,Linha,Largura,Altura
        getContentPane().add(bBarraTr);

        bBarraT2 = new JButton(""); // BOTAO PAINEL FRAME MENU DE TELECOMANDO
        bBarraT2.setIcon(new javax.swing.ImageIcon("BarraT2.gif"));
        bBarraT2.addActionListener(this);
        bBarraT2.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        bBarraT2.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        bBarraT2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        // bBarraT2.setForeground(Color.black);//cor do titulo do botao
        bBarraT2.setEnabled(true);
        bBarraT2.setToolTipText("Pressione para a Tela da Barra TR de 34,5 kV");
        bBarraT2.setMnemonic(KeyEvent.VK_B);
        bBarraT2.setActionCommand("Barra TR");// define o nome da acao
        bBarraT2.setBounds(280, 300, 106, 95); // Coluna,Linha,Largura,Altura
        getContentPane().add(bBarraT2);

        bBarraT3 = new JButton(""); // BOTAO PAINEL FRAME MENU DE TELECOMANDO
        bBarraT3.setIcon(new javax.swing.ImageIcon("BarraT3.gif"));
        bBarraT3.addActionListener(this);
        bBarraT3.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        bBarraT3.setVerticalTextPosition(AbstractButton.CENTER);// posiçao do texto
        bBarraT3.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        // bBarraT1.setBackground(new Color(0,0,0));//cor de fundo do bot�o
        bBarraT3.setForeground(Color.black);// cor do titulo do bot�o
        bBarraT3.setEnabled(true);
        bBarraT3.setToolTipText("Pressione para a Tela da Barra T3 de 34,5 kV");
        bBarraT3.setMnemonic(KeyEvent.VK_B);
        bBarraT3.setActionCommand("Barra TR");// define o nome da acao
        bBarraT3.setBounds(410, 300, 106, 95); // Coluna,Linha,Largura,Altura
        getContentPane().add(bBarraT3);

        bBarraT4 = new JButton(""); // BOTAO PAINEL FRAME MENU DE TELECOMANDO
        bBarraT4.setIcon(new javax.swing.ImageIcon("BarraT4.gif"));
        bBarraT4.addActionListener(this);
        bBarraT4.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        bBarraT4.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        bBarraT4.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        // bBarraT1.setBackground(new Color(0,0,0));//cor de fundo do bot�o
        bBarraT4.setForeground(Color.black);// cor do titulo do bot�o
        bBarraT4.setEnabled(true);
        bBarraT4.setToolTipText("Pressione para a Tela da Barra TR de 34,5 kV");
        bBarraT4.setMnemonic(KeyEvent.VK_B);
        bBarraT4.setActionCommand("Barra TR");// define o nome da acao
        bBarraT4.setBounds(540, 300, 106, 95); // Coluna,Linha,Largura,Altura
        getContentPane().add(bBarraT4);

        bSair = new JButton("");
        bSair.setIcon(new javax.swing.ImageIcon("Porta.jpg"));
        bSair.addActionListener(this);
        bSair.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        bSair.setToolTipText("Pressione para encerrar o programa");
        bSair.setHorizontalTextPosition(AbstractButton.CENTER);
        bSair.setVerticalTextPosition(AbstractButton.CENTER);
        bSair.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        bSair.setBounds(325, 540, 32, 58);
        getContentPane().add(bSair);

        JPanel painel = new JPanel();
        painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(new Color(0, 128, 128));
        painel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JPanel painel1 = new JPanel(); // Barra 34,5 kV
        painel1.setBounds(70, 270, 520, 3);
        painel1.setBackground(Color.orange);
        painel.add(painel1);

        JPanel painel2 = new JPanel(); // Barra MTS / BARRA 34,5 kV
        painel2.setBounds(280, 155, 3, 115);
        painel2.setBackground(Color.orange);
        painel.add(painel2);

        JPanel painel3 = new JPanel(); // MTS / BARRA T1 34,5 kV
        painel3.setBounds(70, 270, 3, 35);
        painel3.setBackground(Color.orange);
        painel.add(painel3);

        JPanel painel4 = new JPanel(); // MTS / BARRA TR 34,5 kV
        painel4.setBounds(200, 270, 3, 35);
        painel4.setBackground(Color.orange);
        painel.add(painel4);

        JPanel painel5 = new JPanel(); // MTS / BARRA T2 34,5 kV
        painel5.setBounds(330, 270, 3, 35);
        painel5.setBackground(Color.orange);
        painel.add(painel5);

        JPanel painel6 = new JPanel(); // MTS / BARRA T3 34,5 kV
        painel6.setBounds(460, 270, 3, 35);
        painel6.setBackground(Color.orange);
        painel.add(painel6);

        JPanel painel7 = new JPanel(); // MTS / BARRA T4 34,5 kV
        painel7.setBounds(590, 270, 3, 35);
        painel7.setBackground(Color.orange);
        painel.add(painel7);

        JPanel painel8 = new JPanel(); // MTS / BARRA T4 34,5 kV
        painel8.setBounds(500, 95, 30, 3);
        painel8.setBackground(Color.red);
        painel.add(painel8);

        JPanel painel9 = new JPanel(); // MTS / BARRA T4 34,5 kV
        painel9.setBounds(180, 95, 30, 3);
        painel9.setBackground(Color.red);
        painel.add(painel9);

        container.add(painel);
        container.setBackground(new Color(180, 180, 180));
        setSize(700, 650);
        // setLocation(550, 150);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        bBarraMTS.addActionListener(new ActionListener() // Ação do botao para chamar a classe MTS 3E4
        {
            public void actionPerformed(ActionEvent evt) {
                {
                    MTSActionPerformed(evt);
                }

            }
        });

        bBarraMT1.addActionListener(new ActionListener() // Açao do botao chamar a classe MTS 1,R,2
        {
            public void actionPerformed(ActionEvent evt) {
                {
                    MT1ActionPerformed(evt);
                }

            }
        });

        bBarraT1.addActionListener(new ActionListener() // Açao do botao chamar a BT1
        {
            public void actionPerformed(ActionEvent evt) {
                {
                    BT1ActionPerformed(evt);
                }

            }
        });

        bBarraTr.addActionListener(new ActionListener() // Açao do botao chamar aclasse BTR
        {
            public void actionPerformed(ActionEvent evt) {
                {
                    BTrActionPerformed(evt);
                }

            }
        });

        bBarraT2.addActionListener(new ActionListener() // Açao do botao para chamar a classe BT2
        {
            public void actionPerformed(ActionEvent evt) {
                {
                    BT2ActionPerformed(evt);
                }

            }
        });

        bBarraT3.addActionListener(new ActionListener() // Açao do botao para chamar a classe BT3
        {
            public void actionPerformed(ActionEvent evt) {
                {
                    BT3ActionPerformed(evt);
                }

            }
        });

        bBarraT4.addActionListener(new ActionListener() // Açao do botao para chamar a classe BT4
        {
            public void actionPerformed(ActionEvent evt) {
                {
                    BT4ActionPerformed(evt);
                }

            }
        });

        bBarraAL.addActionListener(new ActionListener() // Açao do botao para chamar a classe BAL
        {
            public void actionPerformed(ActionEvent evt) {
                {
                    BALActionPerformed(evt);
                }

            }
        });

        bSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setVisible(false);
            }
        });
    }

    // --- Metodo que aglutina os eventos dos Botoes
    public void actionPerformed(ActionEvent e) {
    }

    private void MT1ActionPerformed(ActionEvent evt) {
        new InterfaceTela230kv().setVisible(true);
        setVisible(false);
    }

    private void MTSActionPerformed(ActionEvent evt) {
        new InterfaceMTS3e4().setVisible(true);
        setVisible(false);
    }

    private void BT1ActionPerformed(ActionEvent evt) {
        new InterfaceMT1().setVisible(true);
        setVisible(false);
    }

    private void BTrActionPerformed(ActionEvent evt) {
        new InterfaceMTR().setVisible(true);
        setVisible(false);
    }

    private void BT2ActionPerformed(ActionEvent evt) {
        new InterfaceMT2().setVisible(true);
        setVisible(false);
    }

    private void BT3ActionPerformed(ActionEvent evt) {
        new InterfaceMT3().setVisible(true);
        setVisible(false);
    }

    private void BT4ActionPerformed(ActionEvent evt) {
        new InterfaceMT4().setVisible(true);
        setVisible(false);
    }

    private void BALActionPerformed(ActionEvent evt) {
        new InterfaceAlunorte().setVisible(true);
        setVisible(false);
        // this.hide();
    }

    public static void main(String args[]) {
        new InterfaceMenu().setVisible(true);
        // InterfaceMT1 application = new InterfaceMT1();
    }
}