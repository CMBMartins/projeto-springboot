
/*******************************************************
 * PROJETO SIMULADOR PARA TREINAMENTO DE OPERADORES DE *
 * SUBESTAÇAO.                                         *
 * PROJETISTA E DESENVOLVEDOR:                         *
 *          CARLOS MARDONIO BEZERRA MARTINS            * 
 *         BACHAREL EM SISTEMAS DE INFORMAÇAO          *
 *                                                     *
 * DATA - 18/08/2006                                   *
 * ATUALIZAÇAO - 19/08/2008                            *
 *******************************************************
 * MODULO -   INTERFACE TELA MTS'S 3 & 4               *
 ******************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.SimpleDateFormat; //Carregar este pacote
import java.util.Date;
//import java.io.*;
//import java.net.*;

public class InterfaceMTS3e4 extends JFrame implements ActionListener {
    JLabel tap, valortap, tensao, trafo, barra1, barra2, tap1, tap2, tap3, valortap1, valortap2, valortap3, trafo1,
            trafo2, trafo3, subir, descer, Alarmes;
    JLabel mt1a, mt1b, mt2a, mt2b, l1a, l1b, l2a, l2b, l189, l289, l157, l1, l257, l2, bta, btb, bta57, btb57, mt152,
            mtr52, mt252, l152, l252, bt52, gif1, ta1;
    JLabel status, status1, status2, mt1, mtr, mt2, c1, c2, lvr1, rf6, rf5, rf3, rf4, bcc1, bcc2, pla1, pla2, rf5e,
            rf4e, rf3e, rf552, rf452, rf352;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23,
            b24, b25;
    JButton b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46,
            b47, b48, b49, b50, b51, b52, b53, b54, b55, b56, b57, b58;
    JTextField tfUsuario, tfPerfil, tfCodigo, tfData, enterField;

    SimpleDateFormat formato;
    String nome, senha, perfil, data, Usuario, usuario, tagequipamento, operacao, manobra, albras1 = "";
    int passo = 0;
    ImageIcon icone = new ImageIcon("");
    JPanel painel;

    public JLabel lbManobra, Label1, Label2, projeto, email, lbData;
    int origem = 0;
    int performance = 0;

    Equipamentos eqp = new Equipamentos();
    Equipamentos345kV eqp1 = new Equipamentos345kV();
    // BDadosUsuario U = new BDadosUsuario();
    BDadosAcesso BDE = new BDadosAcesso();
    BDOperaçoes BDO = new BDOperaçoes();
    BDEquipamentos BDEQ = new BDEquipamentos();
    Acesso acesso = new Acesso();
    ManobraInteligente manobrainteligente = new ManobraInteligente();
    ManobraPadrao MP = new ManobraPadrao();

    String seccionadora89l1fechada = "";
    String seccionadora89l1afechada = "";
    String seccionadora89l1bfechada = "";
    String seccionadora89l1aberta = "";
    String seccionadora89l1aaberta = "";
    String seccionadora89l1baberta = "";
    String seccionadora89l2fechada = "";
    String seccionadora89l2afechada = "";
    String seccionadora89alafechada = "";
    String seccionadora89l2bfechada = "";
    String seccionadora89l2aberta = "";
    String seccionadora89l2aaberta = "";
    String seccionadora89l2baberta = "";
    String seccionadora89albfechada = "";
    String seccionadora89albaberta = "";
    String seccionadora89btafechada = "";
    String seccionadora89btbfechada = "";
    String seccionadora89btaaberta = "";
    String seccionadora89btbaberta = "";
    String seccionadora89mt1afechada = "";
    String seccionadora89mt1aaberta = "";
    String seccionadora89mt1bfechada = "";
    String seccionadora89mt1baberta = "";
    String seccionadora89mtrafechada = "";
    String seccionadora89mtraaberta = "";
    String seccionadora89mtrbfechada = "";
    String seccionadora89mtrbaberta = "";
    String seccionadora89mt2afechada = "";
    String seccionadora89mt2aaberta = "";
    String seccionadora89mt2bfechada = "";
    String seccionadora89mt2baberta = "";
    String seccionadora89mt3afechada = "";
    String seccionadora89mt3aaberta = "";
    String seccionadora89mt3bfechada = "";
    String seccionadora89mt3baberta = "";
    String seccionadora89mt4afechada = "";
    String seccionadora89mt4aaberta = "";
    String seccionadora89mt4bfechada = "";
    String seccionadora89mt4baberta = "";
    String seccionadora89a2fechada = "";
    String seccionadora89a4fechada = "";
    String seccionadora89a6fechada = "";
    String seccionadora89a8fechada = "";
    String seccionadora89a2aberta = "";
    String seccionadora89a4aberta = "";
    String seccionadora89a6aberta = "";
    String seccionadora89a8aberta = "";
    String seccionadora89a2eaberta = "";
    String seccionadora89a4eaberta = "";
    String seccionadora89a6eaberta = "";
    String seccionadora89a8eaberta = "";
    String seccionadora89p1aberta = "";
    String seccionadora89lvrrefechada = "";
    String seccionadora89lvrrfechada = "";
    String seccionadora89lvrreaberta = "";
    String seccionadora89lvrraberta = "";
    String seccionadora89p1fechada = "";
    String seccionadora89p2fechada = "";
    String seccionadora89p3fechada = "";
    String seccionadora89p4fechada = "";
    String seccionadora89p5fechada = "";
    String seccionadora89p6fechada = "";
    String seccionadora89p2aberta = "";
    String seccionadora89p3aberta = "";
    String seccionadora89p4aberta = "";
    String seccionadora89p5aberta = "";
    String seccionadora89p6aberta = "";
    String seccionadora89a2efechada = "";
    String seccionadora89a4efechada = "";
    String seccionadora89a6efechada = "";
    String seccionadora89a8efechada = "";
    String seccionadora89p1efechada = "";
    String seccionadora89p2efechada = "";
    String seccionadora89p3efechada = "";
    String seccionadora89p4efechada = "";
    String seccionadora89p5efechada = "";
    String seccionadora89p6efechada = "";
    String seccionadora89p1eaberta = "";
    String seccionadora89p2eaberta = "";
    String seccionadora89p3eaberta = "";
    String seccionadora89p4eaberta = "";
    String seccionadora89p5eaberta = "";
    String seccionadora89p6eaberta = "";
    String seccionadora89tuefechada = "";
    String seccionadora89tueaberta = "";
    String seccionadora89c1aberta = "";
    String seccionadora89c2aberta = "";
    String seccionadora89c3aberta = "";
    String seccionadora89c4aberta = "";
    String seccionadora89c5aberta = "";
    String seccionadora89c6aberta = "";
    String seccionadora89c1fechada = "";
    String seccionadora89c2fechada = "";
    String seccionadora89c3fechada = "";
    String seccionadora89c4fechada = "";
    String seccionadora89c5fechada = "";
    String seccionadora89c6fechada = "";
    String seccionadora89c1eaberta = "";
    String seccionadora89c2eaberta = "";
    String seccionadora89c3eaberta = "";
    String seccionadora89c4eaberta = "";
    String seccionadora89c5eaberta = "";
    String seccionadora89c6eaberta = "";
    String seccionadora89c1efechada = "";
    String seccionadora89c2efechada = "";
    String seccionadora89c3efechada = "";
    String seccionadora89c4efechada = "";
    String seccionadora89c5efechada = "";
    String seccionadora89c6efechada = "";
    String seccionadora89r1fechada = "";
    String seccionadora89r2fechada = "";
    String seccionadora89r3fechada = "";
    String seccionadora89r4fechada = "";
    String seccionadora89r5fechada = "";
    String seccionadora89r6fechada = "";
    String seccionadora89r1aberta = "";
    String seccionadora89r2aberta = "";
    String seccionadora89r3aberta = "";
    String seccionadora89r4aberta = "";
    String seccionadora89r5aberta = "";
    String seccionadora89r6aberta = "";
    String seccionadora89r1eaberta = "";
    String seccionadora89r2eaberta = "";
    String seccionadora89r3eaberta = "";
    String seccionadora89r4eaberta = "";
    String seccionadora89r5eaberta = "";
    String seccionadora89r6eaberta = "";
    String seccionadora89r1efechada = "";
    String seccionadora89r2efechada = "";
    String seccionadora89r3efechada = "";
    String seccionadora89r4efechada = "";
    String seccionadora89r5efechada = "";
    String seccionadora89r6efechada = "";
    String disjuntor52l1fechado = "";
    String disjuntor52l1aberto = "";
    String disjuntor52l2fechado = "";
    String disjuntor52l2aberto = "";
    String disjuntor52alfechado = "";
    String disjuntor52alaberto = "";
    String disjuntor52btfechado = "";
    String disjuntor52btaberto = "";
    String disjuntor52mt1fechado = "";
    String disjuntor52mt1aberto = "";
    String disjuntor52mtrfechado = "";
    String disjuntor52mtraberto = "";
    String disjuntor52mt2fechado = "";
    String disjuntor52mt2aberto = "";
    String disjuntor52mt3fechado = "";
    String disjuntor52mt3aberto = "";
    String disjuntor52mt4fechado = "";
    String disjuntor52mt4aberto = "";
    String disjuntor52a1fechado = "";
    String disjuntor52a1aberto = "";
    String disjuntor52a2fechado = "";
    String disjuntor52a2aberto = "";
    String disjuntor52a3fechado = "";
    String disjuntor52a3aberto = "";
    String disjuntor52a4fechado = "";
    String disjuntor52a4aberto = "";
    String disjuntor52a5fechado = "";
    String disjuntor52a5aberto = "";
    String disjuntor52a6fechado = "";
    String disjuntor52a6aberto = "";
    String disjuntor52a7fechado = "";
    String disjuntor52a7aberto = "";
    String disjuntor52a8fechado = "";
    String disjuntor52a8aberto = "";
    String disjuntor52p1fechado = "";
    String disjuntor52p1aberto = "";
    String disjuntor52p2fechado = "";
    String disjuntor52p2aberto = "";
    String disjuntor52p3fechado = "";
    String disjuntor52p3aberto = "";
    String disjuntor52p4fechado = "";
    String disjuntor52p4aberto = "";
    String disjuntor52p5fechado = "";
    String disjuntor52p5aberto = "";
    String disjuntor52p6fechado = "";
    String disjuntor52p6aberto = "";
    String disjuntor52tufechado = "";
    String disjuntor52tuaberto = "";
    String disjuntor52lvr1fechado = "";
    String disjuntor52lvr1aberto = "";
    String disjuntor52c1fechado = "";
    String disjuntor52c1aberto = "";
    String disjuntor52c2fechado = "";
    String disjuntor52c2aberto = "";
    String disjuntor52c3fechado = "";
    String disjuntor52c3aberto = "";
    String disjuntor52c4fechado = "";
    String disjuntor52c4aberto = "";
    String disjuntor52c5fechado = "";
    String disjuntor52c5aberto = "";
    String disjuntor52c6fechado = "";
    String disjuntor52c6aberto = "";
    String disjuntor52c7fechado = "";
    String disjuntor52c7aberto = "";
    String disjuntor52c8fechado = "";
    String disjuntor52c8aberto = "";
    String disjuntor52r1fechado = "";
    String disjuntor52r1aberto = "";
    String disjuntor52r2fechado = "";
    String disjuntor52r2aberto = "";
    String disjuntor52r3fechado = "";
    String disjuntor52r3aberto = "";
    String disjuntor52r4fechado = "";
    String disjuntor52r4aberto = "";
    String disjuntor52r5fechado = "";
    String disjuntor52r5aberto = "";
    String disjuntor52r6fechado = "";
    String disjuntor52r6aberto = "";
    String disjuntor52r7fechado = "";
    String disjuntor52r7aberto = "";
    String disjuntor52r8fechado = "";
    String disjuntor52r8aberto = "";
    String disjuntor52g1fechado = "";
    String disjuntor52g1aberto = "";
    String disjuntor52g2fechado = "";
    String disjuntor52g2aberto = "";
    String EnerL1 = "";
    String EnerL2 = "";
    String DesenL1 = "";
    String DesenL2 = "";
    String EnerBayBT = "";
    String EnerL1BarraA = "";
    String EnerL2IntBarra = "";
    String EnerMT1BarraA = "";
    String EnerMTRBarraA = "";
    String EnerMT2BarraB = "";
    String EnerMT3BarraA = "";
    String EnerMT4BarraB = "";
    String DesenMT1BarraA = "";
    String DesenMTRBarraA = "";
    String DesenMT2BarraB = "";
    String DesenMT3BarraA = "";
    String DesenMT4BarraB = "";
    String DesenL1BarraA = "";
    String DesenL2IntBarra = "";
    String EnerAlbras = "";
    String DesenAlbras = "";
    String PrepAlbras = "";
    String EnerGerador = "";
    String NormRed1 = "";
    String NormRed2 = "";
    String NormRed3 = "";
    String NormRed4 = "";
    String DeslProgRed1 = "";
    String DeslProgRed2 = "";
    String DeslProgRed3 = "";
    String DeslProgRed4 = "";
    String TransfMT1MTR = "";
    String TransfMTRMT1 = "";
    String TransfMT2MTR = "";
    String TransfMTRMT2 = "";
    String TransfMT3MTR = "";
    String TransfMTRMT3 = "";
    String TransfMT4MTR = "";
    String TransfMTRMT4 = "";
    String EnergBarraEM = "";
    String EnergCargas = "";
    String DeslCargas = "";
    String DesenBarraEM = "";

    // ####################################### MÉTODO CONSTRUTOR DA CLASSE MTS 3 & 4

    public InterfaceMTS3e4() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout()); // gerenciador de layout

        Object[] options = { "Sim", "Nao", "Cancelar" };
        int n = JOptionPane.showOptionDialog(null,
                "Voce deseja habilitar alguma manobra para Simulação? ",
                "Habilitar", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        if (n == JOptionPane.YES_OPTION) {
            MenuManobrasG MM = new MenuManobrasG();
            MM.setVisible(true);
        }

        setTitle("Tela dos MT'S 3 e 4");
        setSize(770, 600);
        c.setBackground(new Color(0, 128, 128));
        // setLocation(350, 90);
        setLocationRelativeTo(null);
        // setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // JLabel status1 = new JLabel();

        JLabel l1 = new JLabel();
        l1.setFont(new Font("Arial", 1, 30));
        l1.setText("Barramento de 230 kV");
        l1.setForeground(Color.blue);

        Icon imagem1 = new ImageIcon("Carlos1.GIF");
        gif1 = new JLabel();
        gif1.setIcon(imagem1);
        gif1.setBounds(688, 470, 100, 100); // Coluna,Linha,Largura,Altura
        gif1.setBackground(new Color(192, 192, 192)); // cor de fundo do bot�o
        getContentPane().add(gif1);

        painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(new Color(0, 128, 128));
        painel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(0, 128, 128));
        p1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p1.add(l1);

        tfUsuario = new JTextField("        Default     ");
        tfUsuario.setEditable(false);
        tfUsuario.addActionListener(this);
        tfUsuario.setFont(new Font("Dialog", Font.BOLD, 16));
        tfUsuario.setBackground(new Color(0, 0, 0));// cor de fundo do bot�o
        tfUsuario.setForeground(Color.yellow);
        tfUsuario.setBounds(622, 5, 124, 27); // Coluna,Linha,Largura,Altura
        getContentPane().add(tfUsuario);

        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat(" dd/MM/yyyy hh:mm:ss"); // somente a data em um objeto separado
        String date = formato.format(data); // variavel date recebe o conteudo do objeto data
        tfData = new JTextField(date);
        tfData.setEditable(false);
        tfData.setFont(new Font("Dialog", Font.BOLD, 12));
        tfData.setBackground(new Color(0, 0, 0)); // cor de fundo do bot�o
        tfData.setForeground(Color.yellow);
        tfData.setBounds(892, 29, 124, 24); // Coluna,Linha,Largura,Altura

        b36 = new JButton(""); // BOTAO EFETUAR LOGIN
        b36.setIcon(new javax.swing.ImageIcon("botãoLogin.jpg"));
        b36.addActionListener(this);
        b36.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b36.setVerticalTextPosition(AbstractButton.CENTER); // posi��o do texto
        b36.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b36.setBackground(new Color(192, 192, 192)); // cor de fundo do botao
        b36.setForeground(Color.black); // cor do titulo do botao
        b36.setEnabled(true);
        b36.setToolTipText("Pressione para fazer Login e liberar a operaçao dos Equipamentos");
        b36.setMnemonic(KeyEvent.VK_B);
        b36.setActionCommand("Usuario");// define o nome da acao
        b36.setBounds(55, 2, 50, 48); // Coluna,Linha,Largura,Altura
        getContentPane().add(b36);

        b42 = new JButton(""); // BOTÃO PAINEL FRAME MENU DE TELECOMANDO
        b42.setIcon(new javax.swing.ImageIcon("telecomando.jpg"));
        b42.addActionListener(this);
        b42.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b42.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b42.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b42.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b42.setForeground(Color.black);// cor do titulo do bot�o
        b42.setEnabled(true);
        b42.setToolTipText("Pressione para Energizar na Configuraçaoo Padrão");
        b42.setMnemonic(KeyEvent.VK_B);
        b42.setActionCommand("Usuario");// define o nome da acao
        b42.setBounds(2, 0, 50, 50); // Coluna,Linha,Largura,Altura
        getContentPane().add(b42);

        c.add(p1, java.awt.BorderLayout.NORTH);

        // ���������������������������������������������� BARRAS A E B
        JPanel v = new JPanel(); // Barra A
        v.setBounds(10, 5, 650, 3);
        v.setBackground(Color.red);
        painel.add(v);

        JPanel v1 = new JPanel(); // Barra B
        v1.setBounds(10, 30, 650, 3);
        v1.setBackground(Color.red);
        painel.add(v1);

        barra1 = new JLabel("A"); // IDENTIFICAC�O DA BARRA A
        barra1.setForeground(Color.blue);
        barra1.setBounds(10, 0, 60, 30);
        painel.add(barra1);

        barra2 = new JLabel("B");
        barra2.setForeground(Color.blue);
        barra2.setBounds(10, 25, 60, 30); // IDENTIFICAC�O DA BARRA B
        painel.add(barra2);
        // ##################################### IDENTIFICAC�O DOS EQUIPAMENTOS
        mt1a = new JLabel("89 MT-4A");
        mt1a.setForeground(Color.blue);
        mt1a.setBounds(202, 40, 60, 30);
        painel.add(mt1a);
        mt1b = new JLabel("89 MT-4B");
        mt1b.setForeground(Color.blue);
        mt1b.setBounds(284, 40, 60, 30);
        painel.add(mt1b);
        mt2a = new JLabel("89 MT-3A");
        mt2a.setForeground(Color.blue);
        mt2a.setBounds(350, 40, 60, 30);
        painel.add(mt2a);
        mt2b = new JLabel("89 MT-3B");
        mt2b.setForeground(Color.blue);
        mt2b.setBounds(435, 40, 60, 30);
        painel.add(mt2b);
        mt152 = new JLabel("52 MT-4");
        mt152.setForeground(Color.blue);
        mt152.setBounds(260, 150, 60, 30);
        painel.add(mt152);
        mt252 = new JLabel("52 MT-3");
        mt252.setForeground(Color.blue);
        mt252.setBounds(410, 150, 60, 30);
        painel.add(mt252);
        tensao = new JLabel("Tensão de Linha:0 kV");
        tensao.setForeground(Color.blue);
        tensao.setBounds(465, 5, 200, 30);
        painel.add(tensao);
        subir = new JLabel("Sair");
        subir.setForeground(Color.blue);
        subir.setBounds(355, 470, 32, 40);
        painel.add(subir);

        // ������������������������������������������������� BAY TRAFO MT-3

        JPanel v13 = new JPanel(); // SECCIONADORA 89 MT-3A
        v13.setBounds(345, 8, 3, 55);
        v13.setBackground(Color.red);
        painel.add(v13);

        JPanel v14 = new JPanel(); // SECCIONADORA 89 MT-3A / DISJUNTOR 52 MT-3
        v14.setBounds(345, 103, 3, 23);
        v14.setBackground(Color.red);
        painel.add(v14);

        JPanel v15 = new JPanel(); // SECCIONADORA 89 MT-3B
        v15.setBounds(430, 30, 3, 33);
        v15.setBackground(Color.red);
        painel.add(v15);

        JPanel v16 = new JPanel(); // SECCIONADORA 89 MT-3B / DISJUNTOR
        v16.setBounds(430, 103, 3, 23);
        v16.setBackground(Color.red);
        painel.add(v16);

        JPanel v17 = new JPanel(); // DISJUNTOR / TRANSFORMADOR
        v17.setBounds(390, 185, 3, 43);
        v17.setBackground(Color.red);
        painel.add(v17);

        JPanel v18 = new JPanel(); // SECCIONADORA 89 MT-3A / SECCIONADORA 89 MT-3B
        v18.setBounds(345, 125, 88, 3);
        v18.setBackground(Color.red);
        painel.add(v18);

        JPanel v19 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v19.setBounds(390, 126, 3, 20);
        v19.setBackground(Color.red);
        painel.add(v19);

        JPanel v20 = new JPanel(); // TRANSFORMADOR / BARRA T3
        v20.setBounds(390, 272, 3, 114);
        v20.setBackground(Color.orange);
        painel.add(v20);

        JPanel v21 = new JPanel(); // BARRA T3
        v21.setBounds(325, 385, 130, 3);
        v21.setBackground(Color.orange);
        painel.add(v21);

        // �������������������������������������������� BAY MT-4

        JPanel v2 = new JPanel(); // Seccionadora 89 MT-4A
        v2.setBounds(195, 8, 3, 55);
        v2.setBackground(Color.red);
        painel.add(v2);

        JPanel v3 = new JPanel();
        v3.setBounds(195, 103, 3, 23); // Seccionadora 89 MT-4A / Disjuntor
        v3.setBackground(Color.red);
        painel.add(v3);

        JPanel v4 = new JPanel(); // Seccionadora 89 MT-4B
        v4.setBounds(280, 30, 3, 33);
        v4.setBackground(Color.red);
        painel.add(v4);

        JPanel v5 = new JPanel(); // SECCIONADORA 89 MT-4B / DISJUNTOR MT-4
        v5.setBounds(279, 103, 3, 23);
        v5.setBackground(Color.red);
        painel.add(v5);

        JPanel v6 = new JPanel(); // DISJUNTOR / TRANSFORMADOR
        v6.setBounds(240, 185, 3, 43);
        v6.setBackground(Color.red);
        painel.add(v6);

        JPanel v7 = new JPanel(); // SECCIONADORA MT-4A / SECCIONADORA MT-4B
        v7.setBounds(195, 125, 87, 3);
        v7.setBackground(Color.red);
        painel.add(v7);

        JPanel v8 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v8.setBounds(240, 126, 3, 20);
        v8.setBackground(Color.red);
        painel.add(v8);

        JPanel v9 = new JPanel(); // TRANSFORMADOR / BARRA T4
        v9.setBounds(240, 272, 3, 114);
        v9.setBackground(Color.orange);
        painel.add(v9);

        JPanel v10 = new JPanel(); // BARRA T4
        v10.setBounds(175, 385, 130, 3);
        v10.setBackground(Color.orange);
        painel.add(v10);

        // �������������������������������������� CRIA��O DO BOT�O 89 MT-3A

        b1 = new JButton(); // BOT�O CS 89 MT-3A
        b1.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
        b1.addActionListener(this);
        b1.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b1.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b1.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b1.setForeground(Color.black);// cor do titulo do bot�o
        b1.setEnabled(true);
        b1.setToolTipText("Pressione para operar a Seccionadora 89 MT-3A");
        b1.setMnemonic(KeyEvent.VK_B);
        b1.setActionCommand("89MT3A");// define o nome da acao
        b1.setBounds(330, 62, 33, 45);
        painel.add(b1);

        // �������������������������������������� CRIA��O DO BOT�O 52 MT-3

        b2 = new JButton(); // BOT�O DJ 52 MT-3
        b2.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b2.addActionListener(this);
        b2.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b2.setMnemonic(KeyEvent.VK_C);
        b2.setToolTipText("Pressione para operar o Disjuntor 52 MT-3");
        b2.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b2.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
        b2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b2.setBounds(375, 145, 33, 42);
        painel.add(b2);

        // ���������������������������������� CRIA��O DO BOT�O CS 89 MT-3B

        b3 = new JButton(); // BOT�O CS 89 MT-3B
        b3.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
        b3.addActionListener(this);
        b3.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b3.setToolTipText("Pressione para operar a Seccionadora 89 MT-3B");
        b3.setHorizontalTextPosition(AbstractButton.CENTER);
        b3.setVerticalTextPosition(AbstractButton.CENTER);
        b3.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b3.setBounds(415, 62, 33, 45);
        painel.add(b3);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO MT-3

        b4 = new JButton(); // BOT�O TRANSFORMADOR MT-3
        b4.setIcon(new javax.swing.ImageIcon("MT-3desenergizado.GIF"));
        b4.addActionListener(this);
        b4.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b4.setToolTipText("Pressione para comutar o Tap do Transformador MT-3");
        b4.setHorizontalTextPosition(AbstractButton.CENTER);
        b4.setVerticalTextPosition(AbstractButton.CENTER);
        b4.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b4.setBounds(361, 228, 52, 45);
        painel.add(b4);

        // ����������������������������������� CRIA��O DO BOT�ES DE CONTROLE DO TRAFO
        // MT-3

        b5 = new JButton("+"); // TAP MT-3
        b5.setBounds(425, 240, 41, 15);
        b5.addActionListener(this);
        painel.add(b5);

        b6 = new JButton("-"); // TAP MT-3
        b6.setBounds(425, 260, 41, 15);
        b6.addActionListener(this);
        painel.add(b6);

        tap2 = new JLabel("0 Kv"); // VALOR DE TENS�O DA BARRA T3
        tap2.setForeground(Color.blue);
        tap2.setBounds(375, 385, 60, 30);
        painel.add(tap2);

        valortap2 = new JLabel(eqp.getMostrarTapsmt1()); // VALOR TAP MT-3
        valortap2.setForeground(Color.blue);
        valortap2.setBounds(432, 270, 60, 30);
        painel.add(valortap2);

        trafo2 = new JLabel("Desenergizado"); // CONDI��O DO TRANSFORMADOR
        trafo2.setForeground(Color.blue);
        trafo2.setBounds(300, 202, 100, 30);
        painel.add(trafo2);

        c.add(painel, java.awt.BorderLayout.CENTER);

        // ���������������������������������������� CRIA��O DO BOT�O 89 MT-4A

        b7 = new JButton(); // BOT�O CS 89 MT-4A
        b7.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
        b7.addActionListener(this);
        b7.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b7.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b7.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b7.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b7.setForeground(Color.black);// cor do titulo do bot�o
        b7.setEnabled(true);
        b7.setToolTipText("Pressione para operar a Seccionadora 89 MT-4A");
        b7.setMnemonic(KeyEvent.VK_B);
        b7.setActionCommand("89MT4A");// define o nome da acao
        b7.setBounds(180, 62, 33, 45);
        painel.add(b7);

        // ���������������������������������������� CRIA��O DO BOT�O 52 MT-4

        b8 = new JButton(); // BOT�O DJ 52 MT-4
        b8.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b8.addActionListener(this);
        b8.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b8.setMnemonic(KeyEvent.VK_C);
        b8.setToolTipText("Pressione para operar o Disjuntor 52 MT-4");
        b8.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b8.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
        b8.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b8.setBounds(225, 145, 33, 42);
        painel.add(b8);

        // ��������������������������������������� CRIA��O DO BOT�O 89 MT-4B

        b9 = new JButton();
        b9.setIcon(new javax.swing.ImageIcon("Chave1.jpg")); // Bot�o 89 MT-RB
        b9.addActionListener(this);
        b9.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b9.setToolTipText("Pressione para operar a Seccionadora 89 MT-4B");
        b9.setHorizontalTextPosition(AbstractButton.CENTER);
        b9.setVerticalTextPosition(AbstractButton.CENTER);
        b9.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b9.setBounds(265, 62, 33, 45);
        painel.add(b9);

        // ��������������������������������������� CRIA��O DO BOT�O TRAFO MT-4

        b10 = new JButton(); // GIF TRANSFORMADOR MT-4
        b10.setIcon(new javax.swing.ImageIcon("MT-4desenergizado.GIF"));
        b10.addActionListener(this);
        b10.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b10.setToolTipText("Pressione para comutar o Tap do Transformador MT-4");
        b10.setHorizontalTextPosition(AbstractButton.CENTER);
        b10.setVerticalTextPosition(AbstractButton.CENTER);
        b10.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b10.setBounds(211, 228, 52, 45);
        painel.add(b10);

        // ��������������������������������������� CONTROLES DO TRAFO MT-4

        b11 = new JButton("+"); // TAP MT-4
        b11.setBounds(275, 240, 41, 15);
        b11.addActionListener(this);
        painel.add(b11);

        b12 = new JButton("-"); // TAP MT-4
        b12.setBounds(275, 260, 41, 15);
        b12.addActionListener(this);
        painel.add(b12);

        tap3 = new JLabel("0 Kv"); // VALOR DE TENS�O NA BARRA T4
        tap3.setForeground(Color.blue);
        tap3.setBounds(225, 385, 60, 25);
        painel.add(tap3);

        valortap3 = new JLabel(eqp.getMostrarTapsmt1()); // TAP MT-4
        valortap3.setForeground(Color.blue);
        valortap3.setBounds(280, 277, 40, 15);
        painel.add(valortap3);

        trafo3 = new JLabel("Desenergizado"); // CONDI��O DO TRANSFORMADOR
        trafo3.setForeground(Color.blue);
        trafo3.setBounds(150, 200, 100, 30);
        painel.add(trafo3);

        // ��������������������������������������� CRIA��O DO BOT�O SAIR

        b34 = new JButton("");
        b34.setIcon(new javax.swing.ImageIcon("Porta.jpg"));
        b34.addActionListener(this);
        b34.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b34.setToolTipText("Pressione para encerrar o programa");
        b34.setHorizontalTextPosition(AbstractButton.CENTER);
        b34.setVerticalTextPosition(AbstractButton.CENTER);
        b34.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b34.setBounds(350, 440, 32, 58);
        painel.add(b34);

        // ��������������������������������������� BOT�O SETA

        b40 = new JButton("");
        b40.setIcon(new javax.swing.ImageIcon("Seta.jpg"));
        b40.addActionListener(this);
        b40.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b40.setToolTipText("Pressione para retornar ao Menu das Telas MTS");
        b40.setHorizontalTextPosition(AbstractButton.CENTER);
        b40.setVerticalTextPosition(AbstractButton.CENTER);
        b40.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b40.setBounds(80, 240, 30, 30);
        painel.add(b40);

        // atualizaConfiguracao();
    }

    // ############################## CLASSE PERFIL PARA REALIZAR LOGIN
    public class Perfil extends JFrame implements ActionListener {

        // ---- Definiçao dos Objetos a serem Usados
        BDadosUsuario objBDLogin = new BDadosUsuario();

        private JLabel jlLogin;
        private JLabel jlSenha;
        private JLabel jlPerfil;
        private JLabel jlDistancia;
        JLabel gif, projeto, lbindice;

        private JTextField jtfLogin;
        private JPasswordField jtfSenha;
        private JTextField jtfPerfil;

        private JButton bConsultar;
        private JButton bSair;

        private JPanel jpPainel = new JPanel();

        public Perfil() {
            // --- Configuraçao do Frame
            setTitle("EfetuarLogin");
            setSize(210, 340);
            // setLocation(440, 200);
            setLocationRelativeTo(null);
            setResizable(false);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            Container container = getContentPane();
            container.setLayout(new BorderLayout());
            setResizable(false);

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            jpPainel.add(gif);
            projeto = new JLabel("Efetuar Login", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 27));
            projeto.setForeground(Color.blue);
            jpPainel.add(projeto);
            container.add(jpPainel);

            // --- Configuraçao dos objetos do Frame
            jlLogin = new JLabel("   Login   ");
            jlSenha = new JLabel("   Senha   ");
            jlPerfil = new JLabel("   Perfil  ");
            jlDistancia = new JLabel(
                    "                                                                                                           ");

            jtfLogin = new JTextField(16);
            jtfSenha = new JPasswordField(16);
            jtfPerfil = new JTextField("Administrador", 16);
            jtfPerfil.addActionListener(this);

            // --- Definiçao dos Botoes e seus eventos
            bConsultar = new JButton("Autenticar");
            bConsultar.addActionListener(this);
            bSair = new JButton("     Sair    ");
            bSair.addActionListener(this);

            // --- Adicionando os Objetos para o Painel
            jpPainel.add(jlLogin);
            jpPainel.add(jtfLogin);
            jpPainel.add(jlSenha);
            jpPainel.add(jtfSenha);
            jpPainel.add(jlPerfil);
            jpPainel.add(jtfPerfil);
            jpPainel.add(jlDistancia);

            jpPainel.add(bConsultar);
            jpPainel.add(bSair);

            getContentPane().add(jpPainel);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bConsultar || e.getSource() == jtfPerfil) {
                objBDLogin.ConectarBD();
                String login = jtfLogin.getText();
                String senha = new String(jtfSenha.getPassword());
                String perfil = jtfPerfil.getText();

                if (objBDLogin.consultaLogin(login, senha, perfil)) {
                    setVisible(false);
                    tfUsuario.setText(login);
                    jtfSenha.setText(senha);
                    tfPerfil.setText(perfil);
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou Senha Invalidos!");
                }
            }

            if (e.getSource() == bSair) {
                setVisible(false);
            }
        }
    }

    // -��������������������������������������������������������������
    public void actionPerformed(ActionEvent e) // metodo implementado pelo ActionListener
    {
        // if (tfPerfil.getText().equals("Administrador") ||
        // tfPerfil.getText().equals("administrador")
        // || tfPerfil.getText().equals("Usuario") ||
        // tfPerfil.getText().equals("usuario")
        // || tfPerfil.getText().equals("usuario")) {
        if (e.getSource() == b1)// ���������������������� AÇÃO DO BOTÃO DA CS 89 MT-3A �����
        {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado da Seccionadora 89 MT-3A?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp.seccionadora89mt3a().equals("Seccionadora Aberta"))
                // && eqp.disjuntor52mt3().equals("Disjuntor Aberto")
                // || eqp.disjuntor52mt3().equals("Disjuntor Fechado"))
                {
                    b1.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                    eqp.fecharSeccionadora89mt3a();
                    // BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 MT-3A";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay MT-3";
                    // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    seccionadora89mt3afechada = "Seccionadora 89MT-3A Fechada";
                    BDO.ConectarBD();
                    BDO.operaçao89mt3aFechada(data);
                    BDEQ.ConectarBD();
                    BDEQ.QuantFechamento89mt3a();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-3A foi Fechada com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                    seccionadora89mt3afechada = "Seccionadora 89MT-3A Fechada";

                    manobrainteligente.EnerL1();
                    manobrainteligente.EnerL1InterBarra();
                    manobrainteligente.EnerMT1BarraA();
                    manobrainteligente.EnerMTRBarraA();
                    manobrainteligente.EnerMT3BarraA();
                    manobrainteligente.DesenMT1BarraA();
                    manobrainteligente.DesenMTRBarraA();
                    manobrainteligente.DesenMT2BarraB();
                    manobrainteligente.DesenMT3BarraA();
                    manobrainteligente.DesenerL1();
                    manobrainteligente.DesenerL1InterBarra();

                    manobrainteligente.EnerL2();
                    manobrainteligente.EnerL2InterBarra();
                    manobrainteligente.EnerMT2BarraB();
                    manobrainteligente.EnerMT4BarraB();
                    manobrainteligente.DesenMT4BarraB();
                    manobrainteligente.DesenerL2();
                    manobrainteligente.DesenerL2InterBarra();
                } else if (eqp.seccionadora89mt3a().equals("Seccionadora Fechada")
                        && eqp.disjuntor52mt3().equals("Disjuntor Aberto")
                        || eqp.disjuntor52mt3().equals("Disjuntor Fechado")
                                && eqp.seccionadora89mt3b().equals("Seccionadora Fechada")
                                && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                    b1.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                    eqp.abrirSeccionadora89mt3a();
                    // BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 MT-3A";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay MT-3";
                    // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    seccionadora89mt3aaberta = "Seccionadora 89MT-3A Aberta";
                    BDO.ConectarBD();
                    BDO.operaçao89mt3aAberta(data);
                    BDEQ.ConectarBD();
                    BDEQ.QuantAbertura89mt3a();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-3A foi Aberta com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    seccionadora89mt3aaberta = "Seccionadora 89MT-3A Aberta";
                    manobrainteligente.EnerL1();
                    manobrainteligente.EnerL1InterBarra();
                    manobrainteligente.EnerMT1BarraA();
                    manobrainteligente.EnerMTRBarraA();
                    manobrainteligente.EnerMT3BarraA();
                    manobrainteligente.DesenMT1BarraA();
                    manobrainteligente.DesenMTRBarraA();
                    manobrainteligente.DesenMT2BarraB();
                    manobrainteligente.DesenMT3BarraA();
                    manobrainteligente.DesenerL1();
                    manobrainteligente.DesenerL1InterBarra();

                    manobrainteligente.EnerL2();
                    manobrainteligente.EnerL2InterBarra();
                    manobrainteligente.EnerMT2BarraB();
                    manobrainteligente.EnerMT4BarraB();
                    manobrainteligente.DesenMT4BarraB();
                    manobrainteligente.DesenerL2();
                    manobrainteligente.DesenerL2InterBarra();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 MT-3 FECHADO! \n",
                            "Logica", JOptionPane.INFORMATION_MESSAGE,
                            (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            // status2.setText(" Equipamento operado: " + "89MT-3A " +
            // eqp.seccionadora89mt3a());
        }

        // ���������������������������������������� AÇAO DO BOTAO DO DJ 52 MT-3
        if (e.getSource() == b2) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado do Disjuntor 52 MT-3?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp.disjuntor52mt3().equals("Disjuntor Aberto")) // &&
                                                                     // eqp.seccionadora89mt1a().equals("Seccionadora
                                                                     // Fechada") &&
                                                                     // eqp.disjuntor52l1().equals("Disjuntor
                                                                     // Fechado") ||
                                                                     // eqp.seccionadora89mt1b().equals("Seccionadora
                                                                     // Fechada") &&
                                                                     // eqp.disjuntor52l2().equals("Disjuntor
                                                                     // Fechado") &&
                                                                     // eqp.disjuntor52mt1().equals("Disjuntor
                                                                     // Aberto"))
                {
                    eqp.fecharDisjuntor52mt3();
                    b2.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    // status2.setText(" Equipamento operado: " + "52 MT-3 " +
                    // eqp.disjuntor52mt3());
                    // BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Disjuntor 52 MT-3";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay MT-3";
                    // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    BDO.ConectarBD();
                    BDO.operaçao52mt3Fechado(data);
                    BDEQ.ConectarBD();
                    BDEQ.QuantFechamento52mt3();
                    disjuntor52mt3fechado = "Disjuntor 52MT-3 Fechado";

                    manobrainteligente.EnerAlbras();
                    manobrainteligente.DesenAlbras();
                    manobrainteligente.EnerL1();
                    manobrainteligente.EnerL1InterBarra();
                    manobrainteligente.EnerMT1BarraA();
                    manobrainteligente.EnerMTRBarraA();
                    manobrainteligente.EnerMT3BarraA();
                    manobrainteligente.DesenMT1BarraA();
                    manobrainteligente.DesenMTRBarraA();
                    manobrainteligente.DesenMT2BarraB();
                    manobrainteligente.DesenMT3BarraA();
                    manobrainteligente.DesenerL1();
                    manobrainteligente.DesenerL1InterBarra();

                    manobrainteligente.EnerL2();
                    manobrainteligente.EnerL2InterBarra();
                    manobrainteligente.EnerMT2BarraB();
                    manobrainteligente.EnerMT4BarraB();
                    manobrainteligente.DesenMT4BarraB();
                    manobrainteligente.DesenerL2();
                    manobrainteligente.DesenerL2InterBarra();

                    if (eqp.seccionadora89mt3a().equals("Seccionadora Fechada")
                            && eqp.disjuntor52mt3().equals("Disjuntor Fechado")
                            || eqp.seccionadora89mt3b().equals("Seccionadora Fechada")
                                    && eqp.disjuntor52mt3().equals("Disjuntor Fechado")) {
                        // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-3 foi Fechado
                        // #TRANSFORMADOR ENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));
                        eqp.ligarTransformadormt3();
                        b4.setIcon(new javax.swing.ImageIcon("MT-3energizado.gif"));
                        tap2.setText("" + eqp.getValorTapmt3());
                        trafo2.setText("       Energizado");
                    }
                } else if (eqp.disjuntor52mt3().equals("Disjuntor Fechado")) // &&
                                                                             // eqp.seccionadora89mt3a().equals("Seccionadora
                                                                             // Fechada") ||
                                                                             // eqp.seccionadora89mt3b().equals("Seccionadora
                                                                             // Fechada") &&
                                                                             // eqp.disjuntor52l1().equals("Disjuntor
                                                                             // Fechado") ||
                                                                             // eqp.disjuntor52l2().equals("Disjuntor
                                                                             // Fechado"))
                {
                    b2.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp.abrirDisjuntor52mt3();
                    // status2.setText(" Equipamento operado: " + "52 MT-3 " +
                    // eqp.disjuntor52mt3());
                    eqp.desligarTransformadormt3();
                    b4.setIcon(new javax.swing.ImageIcon("MT-3desenergizado.gif"));
                    tap2.setText("0 kV");
                    valortap2.setText(eqp.getMostrarTapsmt3());
                    trafo2.setText("Desenergizado");
                    // BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Disjuntor 52 MT-3";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay MT-3";
                    // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    BDO.ConectarBD();
                    BDO.operaçao52mt1Fechado(data);
                    BDEQ.ConectarBD();
                    BDEQ.QuantAbertura52mt3();
                    disjuntor52mt3aberto = "Disjuntor 52MT-3 Aberto";
                    manobrainteligente.EnerAlbras();
                    manobrainteligente.DesenAlbras();
                    manobrainteligente.EnerL1();
                    manobrainteligente.EnerL1InterBarra();
                    manobrainteligente.EnerMT1BarraA();
                    manobrainteligente.EnerMTRBarraA();
                    manobrainteligente.EnerMT3BarraA();
                    manobrainteligente.DesenMT1BarraA();
                    manobrainteligente.DesenMTRBarraA();
                    manobrainteligente.DesenMT2BarraB();
                    manobrainteligente.DesenMT3BarraA();
                    manobrainteligente.DesenerL1();
                    manobrainteligente.DesenerL1InterBarra();

                    manobrainteligente.EnerL2();
                    manobrainteligente.EnerL2InterBarra();
                    manobrainteligente.EnerMT2BarraB();
                    manobrainteligente.EnerMT4BarraB();
                    manobrainteligente.DesenMT4BarraB();
                    manobrainteligente.DesenerL2();
                    manobrainteligente.DesenerL2InterBarra();

                    // if (eqp.seccionadora89mt1a().equals("Seccionadora Aberta") &&
                    // eqp.seccionadora89mt1b().equals("Seccionadora Aberta") &&
                    // eqp.disjuntor52bt().equals("Disjuntor Aberto"))
                    // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-1 foi aberto
                    // #TRANSFORMADOR
                    // DESENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento não Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                            "Lógica", JOptionPane.INFORMATION_MESSAGE,
                            (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            if (eqp.disjuntor52mt3().equals("Disjuntor Fechado")
                    && eqp.seccionadora89mt3a().equals("Seccionadora Aberta")
                    && eqp.seccionadora89mt3b().equals("Seccionadora Aberta")) {
                status2.setText(" Equipamento operado: " + "O TRANSFORMADOR MT-3 ESTA DESENERGIZADO");
            }
        }

        // ���������������������������������������� AÇAO DO BOTAO DA CS 89 MT-3B
        if (e.getSource() == b3) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado da Seccionadora 89 MT-3B?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp.seccionadora89mt3b().equals("Seccionadora Aberta")) {
                    b3.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                    eqp.fecharSeccionadora89mt3b();
                    // BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 MT-3B";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay MT-3";
                    // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    seccionadora89mt3bfechada = "Seccionadora 89MT-3B Fechada";
                    BDO.ConectarBD();
                    BDO.operaçao89mt3bFechada(data);
                    BDEQ.ConectarBD();
                    BDEQ.QuantFechamento89mt3b();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT3-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                    seccionadora89mt3bfechada = "Seccionadora 89MT-3B Fechada";
                    manobrainteligente.DesenerL1InterBarra();
                    manobrainteligente.EnerL1();
                    manobrainteligente.EnerL1InterBarra();
                    manobrainteligente.EnerMT1BarraA();
                    manobrainteligente.EnerMTRBarraA();
                    manobrainteligente.EnerMT3BarraA();
                    manobrainteligente.DesenMT1BarraA();
                    manobrainteligente.DesenMTRBarraA();
                    manobrainteligente.DesenMT2BarraB();
                    manobrainteligente.DesenMT3BarraA();
                    manobrainteligente.DesenerL1();

                    manobrainteligente.EnerL2();
                    manobrainteligente.EnerL2InterBarra();
                    manobrainteligente.EnerMT2BarraB();
                    manobrainteligente.EnerMT4BarraB();
                    manobrainteligente.DesenMT4BarraB();
                    manobrainteligente.DesenerL2();
                    manobrainteligente.DesenerL2InterBarra();
                } else if (eqp.seccionadora89mt3b().equals("Seccionadora Fechada")
                        && eqp.disjuntor52mt3().equals("Disjuntor Aberto")
                        || eqp.disjuntor52mt3().equals("Disjuntor Fechado")
                                && eqp.seccionadora89mt3a().equals("Seccionadora Fechada")
                                && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                    b3.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                    eqp.abrirSeccionadora89mt3b();
                    // BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 MT-3B";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay MT-3";
                    // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    seccionadora89mt3baberta = "Seccionadora 89MT-3B Aberta";
                    BDO.ConectarBD();
                    BDO.operaçao89mt3bAberta(data);
                    BDEQ.ConectarBD();
                    BDEQ.QuantFechamento89mt3b();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora está 89 MT3-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                    seccionadora89mt3baberta = "Seccionadora 89MT-3B Aberta";

                    manobrainteligente.EnerL1();
                    manobrainteligente.EnerL1InterBarra();
                    manobrainteligente.EnerMT1BarraA();
                    manobrainteligente.EnerMTRBarraA();
                    manobrainteligente.EnerMT3BarraA();
                    manobrainteligente.DesenMT1BarraA();
                    manobrainteligente.DesenMTRBarraA();
                    manobrainteligente.DesenMT2BarraB();
                    manobrainteligente.DesenMT3BarraA();
                    manobrainteligente.DesenerL1();
                    manobrainteligente.DesenerL1InterBarra();

                    manobrainteligente.EnerL2();
                    manobrainteligente.EnerL2InterBarra();
                    manobrainteligente.EnerMT2BarraB();
                    manobrainteligente.EnerMT4BarraB();
                    manobrainteligente.DesenMT4BarraB();
                    manobrainteligente.DesenerL2();
                    manobrainteligente.DesenerL2InterBarra();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 MT-3 FECHADO! \n ",
                            "Lógica", JOptionPane.INFORMATION_MESSAGE,
                            (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status2.setText(" Equipamento operado: " + "89 MT-3B " + eqp.seccionadora89mt3b());
        }

        // ������������������������������� AÇAO DOS BOTOES DE COMUTAÇAO DE TAP'S DO MT-3
        if (e.getSource() == b4) {
            status2.setText(" O Transformador MT-3 está no Tap:" + eqp.getMostrarTapsmt3());
            JOptionPane.showMessageDialog(null, "  O Transformador MT-3 esta no:  " + eqp.getMostrarTapsmt3(),
                    "Transformador", JOptionPane.INFORMATION_MESSAGE,
                    (new javax.swing.ImageIcon("formiga.gif")));
        }
        if (e.getSource() == b5) {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja Subir o Tap do Transformador MT-3?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp.getTapsmt3() == 8)
                    JOptionPane.showMessageDialog(null, "O Transformador MT-3 esta no Tap Máximo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp.aumentarTapmt3();
                status2.setText(
                        " Equipamento operado: " + "O Transformador MT-3 está no:  " + eqp.getMostrarTapsmt3());
                valortap2.setText(eqp.getMostrarTapsmt3());
                if (eqp.seccionadora89mt3a().equals("Seccionadora Fechada")
                        && eqp.disjuntor52mt3().equals("Disjuntor Fechado")
                        || eqp.seccionadora89mt3b().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt3().equals("Disjuntor Fechado")) {
                    tap2.setText(eqp.getValorTapmt3());
                }

                // BDE.ConectarBD();
                String usuario = tfUsuario.getText();
                String data = tfData.getText();
                tagequipamento = "TAP TRAFO MT-3";
                operacao = "Tap Elevado";
                manobra = "Bay MT-3";
                // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                BDEQ.ConectarBD();
                BDEQ.QuantAumentoTapmt3();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                        "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
            }
        }
        if (e.getSource() == b6) {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja Descer Tap do Transformador?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp.getTapsmt3() == 0)
                    JOptionPane.showMessageDialog(null, "O Transformador MT-3 está no Tap Mínimo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp.diminuirTapmt3();
                status2.setText(
                        " Equipamento operado: " + "O Transformador MT-3 está no:  " + eqp.getMostrarTapsmt3());
                valortap2.setText(eqp.getMostrarTapsmt3());
                if (eqp.seccionadora89mt3a().equals("Seccionadora Fechada")
                        && eqp.disjuntor52mt3().equals("Disjuntor Fechado")
                        || eqp.seccionadora89mt3b().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt3().equals("Disjuntor Fechado")) {
                    tap2.setText(eqp.getValorTapmt3());
                }
                // BDE.ConectarBD();
                String usuario = tfUsuario.getText();
                String data = tfData.getText();
                tagequipamento = "TAP TRAFO MT-3";
                operacao = "Tap Diminuido";
                manobra = "Bay MT-3";
                // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                BDEQ.ConectarBD();
                BDEQ.QuantDiminuirTapmt3();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Lógica de Intertravamento não Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                        "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
            }
        }

        if (e.getSource() == b7)// ���������������������� AÇAO DO BOTÃO DA CS 89 MT-4A
        {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado da Seccionadora 89 MT-4A?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp.seccionadora89mt4a().equals("Seccionadora Aberta")) {
                    b7.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                    eqp.fecharSeccionadora89mt4a();
                    // BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 MT-4A";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay MT-4";
                    // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    BDO.ConectarBD();
                    BDO.operaçao89mt4aFechada(data);
                    BDEQ.ConectarBD();
                    BDEQ.QuantFechamento89mt4a();

                    seccionadora89mt4afechada = "Seccionadora 89MT-4A Fechada";
                    manobrainteligente.EnerL1();
                    manobrainteligente.EnerL1InterBarra();
                    manobrainteligente.EnerMT1BarraA();
                    manobrainteligente.EnerMTRBarraA();
                    manobrainteligente.EnerMT3BarraA();
                    manobrainteligente.DesenMT1BarraA();
                    manobrainteligente.DesenMTRBarraA();
                    manobrainteligente.DesenMT2BarraB();
                    manobrainteligente.DesenMT3BarraA();
                    manobrainteligente.DesenerL1();
                    manobrainteligente.DesenerL1InterBarra();

                    manobrainteligente.EnerL2();
                    manobrainteligente.EnerL2InterBarra();
                    manobrainteligente.EnerMT2BarraB();
                    manobrainteligente.EnerMT4BarraB();
                    manobrainteligente.DesenMT4BarraB();
                    manobrainteligente.DesenerL2();
                    manobrainteligente.DesenerL2InterBarra();

                }

                else if (eqp.seccionadora89mt4a().equals("Seccionadora Fechada")
                        && eqp.disjuntor52mt4().equals("Disjuntor Aberto")
                        || eqp.disjuntor52mt4().equals("Disjuntor Fechado")
                                && eqp.seccionadora89mt4b().equals("Seccionadora Fechada")
                                && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                    b7.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                    eqp.abrirSeccionadora89mt4a();
                    // BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 MT-4A";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay MT-4";
                    // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    BDO.ConectarBD();
                    BDO.operaçao89mt4aAberta(data);
                    BDEQ.ConectarBD();
                    BDEQ.quantAbertura89mt4a();
                    seccionadora89mt4aaberta = "Seccionadora 89MT-4A Aberta";
                    manobrainteligente.EnerL1();
                    manobrainteligente.EnerL1InterBarra();
                    manobrainteligente.EnerMT1BarraA();
                    manobrainteligente.EnerMTRBarraA();
                    manobrainteligente.EnerMT3BarraA();
                    manobrainteligente.DesenMT1BarraA();
                    manobrainteligente.DesenMTRBarraA();
                    manobrainteligente.DesenMT2BarraB();
                    manobrainteligente.DesenMT3BarraA();
                    manobrainteligente.DesenerL1();
                    manobrainteligente.DesenerL1InterBarra();

                    manobrainteligente.EnerL2();
                    manobrainteligente.EnerL2InterBarra();
                    manobrainteligente.EnerMT2BarraB();
                    manobrainteligente.EnerMT4BarraB();
                    manobrainteligente.DesenMT4BarraB();
                    manobrainteligente.DesenerL2();
                    manobrainteligente.DesenerL2InterBarra();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Lógica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 MT-4 FECHADO! \n",
                            "Lógica", JOptionPane.INFORMATION_MESSAGE,
                            (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status2.setText(" Equipamento operado: " + "89MT-4A " + eqp.seccionadora89mt4a());
        }

        // ���������������������������������������� AÇAO DO BOTAO DO DJ 52 MT-4
        if (e.getSource() == b8) {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado do Disjuntor 52 MT-4?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp.disjuntor52mt4().equals("Disjuntor Aberto")) // &&
                                                                     // eqp.seccionadora89mt4b().equals("Seccionadora
                                                                     // Fechada") &&
                                                                     // eqp.disjuntor52l1().equals("Disjuntor
                                                                     // Fechado") ||
                                                                     // eqp.seccionadora89mt4b().equals("Seccionadora
                                                                     // Fechada") &&
                                                                     // eqp.disjuntor52l2().equals("Disjuntor
                                                                     // Fechado") &&
                                                                     // eqp.disjuntor52mt4().equals("Disjuntor
                                                                     // Aberto"))
                {
                    eqp.fecharDisjuntor52mt4();
                    b8.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    // status2.setText(" Equipamento operado: " + "52 MT-4 " +
                    // eqp.disjuntor52mt4());
                    // BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Disjuntor 52 MT-4";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay MT-4";
                    // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    BDEQ.ConectarBD();
                    BDEQ.QuantFechamento52mt4();
                    disjuntor52mt4fechado = "Disjuntor 52MT-4 Fechado";
                    manobrainteligente.EnerAlbras();
                    manobrainteligente.DesenAlbras();
                    manobrainteligente.EnerL1();
                    manobrainteligente.EnerL1InterBarra();
                    manobrainteligente.EnerMT1BarraA();
                    manobrainteligente.EnerMTRBarraA();
                    manobrainteligente.EnerMT3BarraA();
                    manobrainteligente.DesenMT1BarraA();
                    manobrainteligente.DesenMTRBarraA();
                    manobrainteligente.DesenMT2BarraB();
                    manobrainteligente.DesenMT3BarraA();
                    manobrainteligente.DesenerL1();
                    manobrainteligente.DesenerL1InterBarra();

                    manobrainteligente.EnerL2();
                    manobrainteligente.EnerL2InterBarra();
                    manobrainteligente.EnerMT2BarraB();
                    manobrainteligente.EnerMT4BarraB();
                    manobrainteligente.DesenMT4BarraB();
                    manobrainteligente.DesenerL2();
                    manobrainteligente.DesenerL2InterBarra();

                    if (eqp.seccionadora89mt4b().equals("Seccionadora Fechada")
                            && eqp.disjuntor52mt4().equals("Disjuntor Fechado")
                            || eqp.seccionadora89mt4a().equals("Seccionadora Fechada")
                                    && eqp.disjuntor52mt4().equals("Disjuntor Fechado")) {
                        // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-4 foi Fechado
                        // #TRANSFORMADOR ENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));
                        eqp.ligarTransformadormt4();
                        b10.setIcon(new javax.swing.ImageIcon("MT-4energizado.gif"));
                        tap3.setText("" + eqp.getValorTapmt4());
                        trafo3.setText("       Energizado");
                    }
                } else if (eqp.disjuntor52mt4().equals("Disjuntor Fechado")) // &&
                                                                             // eqp.seccionadora89mtra().equals("Seccionadora
                                                                             // Fechada") ||
                                                                             // eqp.seccionadora89mtrb().equals("Seccionadora
                                                                             // Fechada") &&
                                                                             // eqp.disjuntor52l1().equals("Disjuntor
                                                                             // Fechado") ||
                                                                             // eqp.disjuntor52l2().equals("Disjuntor
                                                                             // Fechado"))
                {
                    b8.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp.abrirDisjuntor52mt4();
                    // status2.setText(" Equipamento operado: " + "52 MT-4 " +
                    // eqp.disjuntor52mt4());
                    eqp.desligarTransformadormt4();
                    b10.setIcon(new javax.swing.ImageIcon("MT-4desenergizado.gif"));
                    tap3.setText("0 kV");
                    valortap3.setText(eqp.getMostrarTapsmt4());
                    trafo3.setText("Desenergizado");
                    // BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Disjuntor 52 MT-4";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay MT-4";
                    // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.opera�ao52mt1Fechado(data);
                    BDEQ.ConectarBD();
                    BDEQ.QuantAbertura52mt4();
                    disjuntor52mt4aberto = "Disjuntor 52MT-4 Aberto";
                    manobrainteligente.EnerAlbras();
                    manobrainteligente.DesenAlbras();
                    manobrainteligente.EnerL1();
                    manobrainteligente.EnerL1InterBarra();
                    manobrainteligente.EnerMT1BarraA();
                    manobrainteligente.EnerMTRBarraA();
                    manobrainteligente.EnerMT3BarraA();
                    manobrainteligente.DesenMT1BarraA();
                    manobrainteligente.DesenMTRBarraA();
                    manobrainteligente.DesenMT2BarraB();
                    manobrainteligente.DesenMT3BarraA();
                    manobrainteligente.DesenerL1();
                    manobrainteligente.DesenerL1InterBarra();

                    manobrainteligente.EnerL2();
                    manobrainteligente.EnerL2InterBarra();
                    manobrainteligente.EnerMT2BarraB();
                    manobrainteligente.EnerMT4BarraB();
                    manobrainteligente.DesenMT4BarraB();
                    manobrainteligente.DesenerL2();
                    manobrainteligente.DesenerL2InterBarra();

                    // if (eqp.seccionadora89mtra().equals("Seccionadora Aberta") &&
                    // eqp.seccionadora89mtrb().equals("Seccionadora Aberta") &&
                    // eqp.disjuntor52bt().equals("Disjuntor Aberto"))
                    // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-R foi aberto
                    // #TRANSFORMADOR
                    // DESENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Lógica de Intertravamento não Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                            "Lógica", JOptionPane.INFORMATION_MESSAGE,
                            (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            if (eqp.disjuntor52mt4().equals("Disjuntor Fechado")
                    && eqp.seccionadora89mt4b().equals("Seccionadora Aberta")
                    && eqp.seccionadora89mt4a().equals("Seccionadora Aberta")) {
                status2.setText(" Equipamento operado: " + "O TRANSFORMADOR MT-4 ESTÁ DESENERGIZADO");
            }
        }

        // ���������������������������������������� AÇAO DO BOTÃO DA CS 89 MT-4B
        if (e.getSource() == b9) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado da Seccionadora 89 MT-4B?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp.seccionadora89mt4b().equals("Seccionadora Aberta")) {
                    b9.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                    eqp.fecharSeccionadora89mt4b();
                    // BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 MT-4B";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay MT-4";
                    // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    BDO.ConectarBD();
                    BDO.operaçao89mt4bFechada(data);
                    BDEQ.ConectarBD();
                    BDEQ.QuantFechamento89mt4b();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MTR-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                    seccionadora89mt4bfechada = "Seccionadora 89MT-4B Fechada";

                    seccionadora89mt4bfechada = "Seccionadora 89MT-4B Fechada";
                    manobrainteligente.EnerL1();
                    manobrainteligente.EnerL1InterBarra();
                    manobrainteligente.EnerMT1BarraA();
                    manobrainteligente.EnerMTRBarraA();
                    manobrainteligente.EnerMT3BarraA();
                    manobrainteligente.DesenMT1BarraA();
                    manobrainteligente.DesenMTRBarraA();
                    manobrainteligente.DesenMT2BarraB();
                    manobrainteligente.DesenMT3BarraA();
                    manobrainteligente.DesenerL1();
                    manobrainteligente.DesenerL1InterBarra();

                    manobrainteligente.EnerL2();
                    manobrainteligente.EnerL2InterBarra();
                    manobrainteligente.EnerMT2BarraB();
                    manobrainteligente.EnerMT4BarraB();
                    manobrainteligente.DesenMT4BarraB();
                    manobrainteligente.DesenerL2();
                    manobrainteligente.DesenerL2InterBarra();
                } else if (eqp.seccionadora89mt4b().equals("Seccionadora Fechada")
                        && eqp.disjuntor52mt4().equals("Disjuntor Aberto")
                        || eqp.disjuntor52mt4().equals("Disjuntor Fechado")
                                && eqp.seccionadora89mt4a().equals("Seccionadora Fechada")
                                && eqp.disjuntor52bt().equals("Disjuntor Fechado")) {
                    b9.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                    eqp.abrirSeccionadora89mt4b();
                    // BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 MT-4B";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay MT-4";
                    // BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    BDO.ConectarBD();
                    BDO.operaçao89mt4bAberta(data);
                    BDEQ.ConectarBD();
                    BDEQ.QuantAbertura89mt4b();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 MTR-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                    seccionadora89mt4baberta = "Seccionadora 89MT-4B Aberta";

                    seccionadora89mt4baberta = "Seccionadora 89MT-4B Aberta";
                    manobrainteligente.EnerL1();
                    manobrainteligente.EnerL1InterBarra();
                    manobrainteligente.EnerMT1BarraA();
                    manobrainteligente.EnerMTRBarraA();
                    manobrainteligente.EnerMT3BarraA();
                    manobrainteligente.DesenMT1BarraA();
                    manobrainteligente.DesenMTRBarraA();
                    manobrainteligente.DesenMT2BarraB();
                    manobrainteligente.DesenMT3BarraA();
                    manobrainteligente.DesenerL1();
                    manobrainteligente.DesenerL1InterBarra();

                    manobrainteligente.EnerL2();
                    manobrainteligente.EnerL2InterBarra();
                    manobrainteligente.EnerMT2BarraB();
                    manobrainteligente.EnerMT4BarraB();
                    manobrainteligente.DesenMT4BarraB();
                    manobrainteligente.DesenerL2();
                    manobrainteligente.DesenerL2InterBarra();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Lógica de Intertravamento não Satisfeita! \n DISJUNTOR 52 MT-4 FECHADO! \n ",
                            "Lógica", JOptionPane.INFORMATION_MESSAGE,
                            (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status2.setText(" Equipamento operado: " + "89 MT-4B " + eqp.seccionadora89mt4b());
        }

        // ������������������������������� AÇAO DOS BOTOES DE COMUTAÇAO DE TAP'S DO MT-4
        if (e.getSource() == b10) {
            status2.setText(" O Transformador MT-4 esta no Tap:" + eqp.getMostrarTapsmt4());
            JOptionPane.showMessageDialog(null, "  O Transformador MT-4 esta no:  " + eqp.getMostrarTapsmt4(),
                    "Disjuntor", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
        }
        if (e.getSource() == b11) {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja Subir o Tap do Transformador MT-4?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp.getTapsmtr() == 8)
                    JOptionPane.showMessageDialog(null, "O Transformador MT-4 esta no Tap Maximo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp.aumentarTapmt4();
                status2.setText(" O Transformador MT-4 esta no:  " + eqp.getMostrarTapsmt4());
                valortap3.setText(eqp.getMostrarTapsmt4());
                if (eqp.seccionadora89mt4b().equals("Seccionadora Fechada")
                        && eqp.disjuntor52mt4().equals("Disjuntor Fechado")
                        || eqp.seccionadora89mt4a().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt4().equals("Disjuntor Fechado")) {
                    tap3.setText(eqp.getValorTapmt4());
                }
                BDE.ConectarBD();
                String usuario = tfUsuario.getText();
                String data = tfData.getText();
                tagequipamento = "TAP TRAFO MT-4";
                operacao = "Tap Elevado";
                manobra = "Bay MT-4";
                BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                BDEQ.ConectarBD();
                BDEQ.QuantAumentoTapmt4();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                        "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
            }
        }
        if (e.getSource() == b12) {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja Descer Tap do Transformador?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp.getTapsmt4() == 0)
                    JOptionPane.showMessageDialog(null, "O Transformador MT-4 está no Tap Mínimo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp.diminuirTapmt4();
                status2.setText(" O Transformador MT-4 está no:  " + eqp.getMostrarTapsmt4());
                valortap3.setText(eqp.getMostrarTapsmt4());
                if (eqp.seccionadora89mt4b().equals("Seccionadora Fechada")
                        && eqp.disjuntor52mt4().equals("Disjuntor Fechado")
                        || eqp.seccionadora89mt4a().equals("Seccionadora Fechada")
                                && eqp.disjuntor52mt4().equals("Disjuntor Fechado")) {
                    tap3.setText(eqp.getValorTapmt4());
                }
                BDE.ConectarBD();
                String usuario = tfUsuario.getText();
                String data = tfData.getText();
                tagequipamento = "TAP TRAFO MT-4";
                operacao = "Tap Diminuido";
                manobra = "Bay MT-4";
                BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                BDEQ.ConectarBD();
                BDEQ.QuantDiminuirTapmt4();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Lógica de Intertravamento não Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                        "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
            }
        }
        // }

        if (e.getSource() == b34) // ----------- BOTAO SAIR ----------------//
        {
            new InterfaceMenu().setVisible(true);
            setVisible(false);
        }

        if (e.getSource() == b36) // --------------------------EXECUTA A CLASSE MENUPERFIL----------//
        {
            Perfil perfil = new Perfil();
            perfil.setVisible(true);
        }

        if (e.getSource() == b40) { // ----------- BOTAO MENU DAS TELAS ----------------//
            new InterfaceTela230kv().setVisible(true);
            setVisible(false);
        }

        if (e.getSource() == b42) {
            // if (tfPerfil.getText().equals("Administrador") ||
            // tfPerfil.getText().equals("administrador")
            // || tfPerfil.getText().equals("Usuario") ||
            // tfPerfil.getText().equals("usuario")) {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja utilizar a configuração operacional padrão da Subestaçao? ",
                    "Configuraçao", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION)
                atualizaConfiguracao();
        }
    }

    public void atualizaConfiguracao() {
        eqp.fecharSeccionadora89mt3a();
        eqp.fecharDisjuntor52mt3();
        eqp.fecharSeccionadora89mt4b();
        eqp.fecharDisjuntor52mt4();
        b1.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
        b2.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b9.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
        b8.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b4.setIcon(new javax.swing.ImageIcon("MT-3energizado.gif"));
        b10.setIcon(new javax.swing.ImageIcon("MT-4energizado.gif"));
    }
    // }

    // ############################################## CLASSE MENU GERAL DAS MANOBRAS
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
            bManEletronorte.setActionCommand("Eventos");// define o nome da acao
            bManEletronorte.setBounds(2, 110, 200, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManEletronorte);

            bMan230 = new JButton("Manobras de 230 kV");
            bMan230.setToolTipText("Pressione para chamar o Menu das Manobras de 230 kV");
            bMan230.setMnemonic(KeyEvent.VK_2);
            bMan230.setActionCommand("Relatorio Diario");// define o nome da acao
            bMan230.setBounds(202, 110, 200, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bMan230);

            bManReduçao = new JButton("Manobras da Reduçao");
            bManReduçao.setToolTipText("Pressione para chamar o Menu das Manobras da Reduçao");
            bManReduçao.setMnemonic(KeyEvent.VK_R);
            bManReduçao.setActionCommand("Equipamentos");// define o nome da acao
            bManReduçao.setBounds(2, 149, 200, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManReduçao);

            bManTransferencia = new JButton("Manobras de Transferencia");
            bManTransferencia.setToolTipText("Pressione para chamar o Menu das Manobras de Transferencia");
            bManTransferencia.setMnemonic(KeyEvent.VK_T);
            bManTransferencia.setActionCommand("Operaçoes");// define o nome da acao
            bManTransferencia.setBounds(202, 149, 200, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManTransferencia);

            bManGeradores = new JButton("Manobras Geradores");
            bManGeradores.setToolTipText("Pressione para chamar o Menu das Manobras dos Geradores");
            bManGeradores.setMnemonic(KeyEvent.VK_G);
            bManGeradores.setActionCommand("Sair");// define o nome da acao
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

            // bManEletronorte.setBackground(new Color(180,180,250));
            // bMan230.setBackground(new Color(180,180,250));
            // bManRedu�ao.setBackground(new Color(180,180,250));
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

            bManTransferencia.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    MTActionPerformed(evt);
                }
            });

            bManReduçao.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    MRActionPerformed(evt);
                }
            });

            bManGeradores.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    MAGActionPerformed(evt);
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
            new MenuManobrasELN().setVisible(true);
            setVisible(false);
            // this.hide();
        }

        private void M2ActionPerformed(ActionEvent evt) {
            new MenuManobras().setVisible(true);
            setVisible(false);
            // this.hide();
        }

        private void MRActionPerformed(ActionEvent evt) {
            new MenuManobrasReduçao().setVisible(true);
            setVisible(false);
            // this.hide();
        }

        private void MTActionPerformed(ActionEvent evt) {
            new MenuManobrasTransf().setVisible(true);
            setVisible(false);
            // this.hide();
        }

        private void MAGActionPerformed(ActionEvent evt) {
            new MenuManobrasGerador().setVisible(true);
            setVisible(false);
            // this.hide();
        }
    }

    // ################################################# CLASSE MENU MANOBRAS ######
    public class MenuManobras extends JFrame implements ActionListener {
        JLabel jLCodigo;
        JLabel jLTagEquipamento;
        JLabel jLUsuario;
        JLabel jLData;
        JLabel jLOperaçao;
        JLabel gif, projeto;

        JPanel jpPainel = new JPanel();

        public MenuManobras() // --- Configuraçao do Frame
        {
            super("Menu Manobras de 230 kV");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout
            setResizable(false);

            setSize(630, 630);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);
            // setLocation(230, 100);
            // setVisible(true);

            JLabel lbHabilitarManobra;
            JLabel lbConferirManobra;

            JButton bEnerL1;
            JButton bEnerL2;
            JButton bEnerL1BarraA;
            JButton bEnerL2IntBarra;
            // JButton bEnerBayBT;
            JButton bEnerBayMT1;
            JButton bEnerBayMTR;
            JButton bEnerBayMT2;
            JButton bEnerBayMT3;
            JButton bEnerBayMT4;
            JButton bDesenL1;
            JButton bDesenL2;
            JButton bDesenBayMT1;
            JButton bDesenBayMTR;
            JButton bDesenBayMT2;
            JButton bDesenBayMT3;
            JButton bDesenBayMT4;
            JButton bDesenL1BarraA;
            JButton bDesenL2IntBarra;
            JButton bManobraExecutada;
            JButton bManobraPadrao;
            JButton bLimpar;
            JButton bSair;
            // JButton bRetornar;

            JPanel painel = new JPanel();

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            painel.add(gif);

            projeto = new JLabel(" Manobras de 230 kV", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 36));
            projeto.setForeground(Color.blue);
            getContentPane().add(projeto);

            lbHabilitarManobra = new JLabel("Habilitar as Manobras de 230 kV");
            lbHabilitarManobra.setFont(new Font("Arial", 1, 20));
            lbHabilitarManobra.setForeground(Color.blue);
            lbHabilitarManobra.setBounds(170, 70, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbHabilitarManobra);

            container.add(painel);

            bEnerL1 = new JButton(" Energizar Bay da Linha 1 "); // BOT�O TABELA DE EVENTOS
            bEnerL1.setToolTipText("Pressione para executar a manobra de energização da Linha 1");
            bEnerL1.setMnemonic(KeyEvent.VK_1);
            bEnerL1.setActionCommand("Manobras");// define o nome da acao
            bEnerL1.setBounds(2, 109, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerL1);

            bEnerL2 = new JButton(" Energizar Bay da Linha 2 "); // BOT�O TABELA DE EVENTOS
            bEnerL2.setToolTipText("Pressione para executar a manobra de energização da Linha 2");
            bEnerL2.setMnemonic(KeyEvent.VK_2);
            bEnerL2.setActionCommand("Manobras");// define o nome da acao
            bEnerL2.setBounds(306, 109, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerL2);

            bEnerL1BarraA = new JButton("Energizar Bay da Linha 1 e Barra 'A' "); // BOT�O TABELA DE EVENTOS
            bEnerL1BarraA.setToolTipText("Pressione para executar a manobra de energização da Linha 1 e Barra 'A'");
            bEnerL1BarraA.setMnemonic(KeyEvent.VK_1);
            bEnerL1BarraA.setActionCommand("Manobras");// define o nome da acao
            bEnerL1BarraA.setBounds(2, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerL1BarraA);

            bEnerL2IntBarra = new JButton("Energizar Bay da Linha 2 e Barra 'B' "); // BOT�O TABELA DE EVENTOS
            bEnerL2IntBarra.setToolTipText("Pressione para executar a manobra de energização da Linha 2 e Barra 'B'");
            bEnerL2IntBarra.setMnemonic(KeyEvent.VK_2);
            bEnerL2IntBarra.setActionCommand("Manobras");// define o nome da acao
            bEnerL2IntBarra.setBounds(306, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerL2IntBarra);

            bEnerBayMT1 = new JButton("Energizar Bay do Trafo MT-1 e Barra 'A'"); // BOT�O TABELA DE EVENTOS
            bEnerBayMT1.setToolTipText("Pressione para executar a manobra de energização do Trafo MT-1 e Barra 'A'");
            bEnerBayMT1.setMnemonic(KeyEvent.VK_1);
            bEnerBayMT1.setActionCommand("Manobras");// define o nome da acao
            bEnerBayMT1.setBounds(2, 189, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerBayMT1);

            bEnerBayMTR = new JButton("Energizar Bay do Trafo MT-R e Barra 'A'"); // BOT�O TABELA DE EVENTOS
            bEnerBayMTR.setToolTipText("Pressione para executar a manobra de enrgizaçao do Trafo MT-R e Barra 'A'");
            bEnerBayMTR.setMnemonic(KeyEvent.VK_R);
            bEnerBayMTR.setActionCommand("Manobras");// define o nome da a��o
            bEnerBayMTR.setBounds(306, 189, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerBayMTR);

            bEnerBayMT2 = new JButton("Energizar Bay do Trafo MT-2 e Barra 'B'"); // BOT�O TABELA DE EVENTOS
            bEnerBayMT2.setToolTipText("Pressione para executar a manobra de energização do Trafo MT-2 e Barra 'B'");
            bEnerBayMT2.setMnemonic(KeyEvent.VK_2);
            bEnerBayMT2.setActionCommand("Manobras");// define o nome da acao
            bEnerBayMT2.setBounds(2, 229, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerBayMT2);

            bEnerBayMT3 = new JButton("Energizar Bay do Trafo MT-3 e Barra 'A'"); // BOT�O TABELA DE EVENTOS
            bEnerBayMT3.setToolTipText("Pressione para executar a manobra de enrgização do Trafo MT-3 e Barra 'A'");
            bEnerBayMT3.setMnemonic(KeyEvent.VK_3);
            bEnerBayMT3.setActionCommand("Manobras");// define o nome da acao
            bEnerBayMT3.setBounds(306, 229, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerBayMT3);

            bEnerBayMT4 = new JButton("Energizar Bay do Trafo MT-4 e Barra 'B'"); // BOT�O TABELA DE EVENTOS
            bEnerBayMT4.setToolTipText("Pressione para executar a manobra de energização do Trafo MT-4 e Barra 'B'");
            bEnerBayMT4.setMnemonic(KeyEvent.VK_4);
            bEnerBayMT4.setActionCommand("Manobras");// define o nome da acao
            bEnerBayMT4.setBounds(2, 269, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerBayMT4);

            bDesenL1 = new JButton(" Desenergizar Bay da Linha 1 "); // BOT�O TABELA DE EVENTOS
            bDesenL1.setToolTipText("Pressione para executar a manobra de Desligamento do Bay da Linha 1");
            bDesenL1.setMnemonic(KeyEvent.VK_1);
            bDesenL1.setActionCommand("Manobras");// define o nome da acao
            bDesenL1.setBounds(306, 269, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenL1);

            bDesenL2 = new JButton(" Desenergizar Bay da Linha 2 "); // BOT�O TABELA DE EVENTOS
            bDesenL2.setToolTipText("Pressione para executar a manobra de Desligamento do Bay da Linha 2");
            bDesenL2.setMnemonic(KeyEvent.VK_2);
            bDesenL2.setActionCommand("Manobras");// define o nome da acao
            bDesenL2.setBounds(2, 309, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenL2);

            bDesenBayMT1 = new JButton(" Desenergizar Bay do Trafo MT-1 e Barra 'A' "); // BOT�O TABELA DE EVENTOS
            bDesenBayMT1.setToolTipText("Pressione para executar a manobra de Desligamento do Bay do Trafo MT-1");
            bDesenBayMT1.setMnemonic(KeyEvent.VK_1);
            bDesenBayMT1.setActionCommand("Manobras");// define o nome da acao
            bDesenBayMT1.setBounds(306, 309, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenBayMT1);

            bDesenBayMTR = new JButton(" Desenergizar Bay do Trafo MT-R e Barra 'A' "); // BOT�O TABELA DE EVENTOS
            bDesenBayMTR.setToolTipText("Pressione para executar a manobra de Desligamento do Trafo MT-R");
            bDesenBayMTR.setMnemonic(KeyEvent.VK_3);
            bDesenBayMTR.setActionCommand("Manobras");// define o nome da acao
            bDesenBayMTR.setBounds(2, 349, 304, 40);
            getContentPane().add(bDesenBayMTR);

            bDesenBayMT2 = new JButton(" Desenergizar Bay do Trafo MT-2 e Barra 'B' "); // BOT�O TABELA DE EVENTOS
            bDesenBayMT2.setToolTipText("Pressione para executar a manobra de Desligamento do Bay do Trafo MT-2");
            bDesenBayMT2.setMnemonic(KeyEvent.VK_2);
            bDesenBayMT2.setActionCommand("Manobras");// define o nome da acao
            bDesenBayMT2.setBounds(306, 349, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenBayMT2);

            bDesenBayMT3 = new JButton(" Desenergizar Bay do Trafo MT-3 e Barra 'A' "); // BOT�O TABELA DE EVENTOS
            bDesenBayMT3.setToolTipText("Pressione para executar a manobra de Desligamento do Trafo MT-3");
            bDesenBayMT3.setMnemonic(KeyEvent.VK_3);
            bDesenBayMT3.setActionCommand("Manobras");// define o nome da acao
            bDesenBayMT3.setBounds(2, 389, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenBayMT3);

            bDesenBayMT4 = new JButton(" Desenergizar Bay do Trafo MT-4 e Barra 'B' "); // BOT�O TABELA DE EVENTOS
            bDesenBayMT4.setToolTipText("Pressione para executar a manobra de Desligamento do Trafo MT-4");
            bDesenBayMT4.setMnemonic(KeyEvent.VK_4);
            bDesenBayMT4.setActionCommand("Manobras");// define o nome da acao
            bDesenBayMT4.setBounds(306, 389, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenBayMT4);

            bDesenL1BarraA = new JButton("Desenergizar Bay Linha 1 e Barra 'A'"); // BOT�O TABELA DE EVENTOS
            bDesenL1BarraA.setToolTipText("Pressione para executar a manobra de Desenergização da Linha 1 e Barra 'A'");
            bDesenL1BarraA.setMnemonic(KeyEvent.VK_1);
            bDesenL1BarraA.setActionCommand("Eventos");// define o nome da acao
            bDesenL1BarraA.setBounds(2, 429, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenL1BarraA);

            bDesenL2IntBarra = new JButton("Desenergizar Bay Linha 2 e Barra 'B'"); // BOT�O TABELA DE EVENTOS
            bDesenL2IntBarra
                    .setToolTipText("Pressione para executar a manobra de Desenergização da Linha 2 e Barra 'B'");
            bDesenL2IntBarra.setMnemonic(KeyEvent.VK_2);
            bDesenL2IntBarra.setActionCommand("Eventos");// define o nome da acao
            bDesenL2IntBarra.setBounds(306, 429, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenL2IntBarra);

            lbConferirManobra = new JLabel("Conferir as Manobras");
            lbConferirManobra.setFont(new Font("Arial", 1, 20));
            lbConferirManobra.setForeground(Color.black);
            lbConferirManobra.setBounds(210, 469, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbConferirManobra);

            bManobraExecutada = new JButton(" Manobra Executada "); // BOT�O TABELA DE EVENTOS
            bManobraExecutada.setToolTipText("Pressione conferir a manobra Executada");
            bManobraExecutada.setMnemonic(KeyEvent.VK_E);
            bManobraExecutada.setActionCommand("Manobras");// define o nome da acao
            // bManobraExecutada.setBackground(new Color(180,180,250));
            bManobraExecutada.setBounds(2, 509, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraExecutada);

            bManobraPadrao = new JButton(" Manobra Padrao "); // BOT�O TABELA DE EVENTOS
            bManobraPadrao.setToolTipText("Pressione conferir a manobra Padrão");
            bManobraPadrao.setMnemonic(KeyEvent.VK_P);
            bManobraPadrao.setActionCommand("Manobras");// define o nome da acao
            // bManobraPadrao.setBackground(new Color(180,180,250));
            bManobraPadrao.setBounds(306, 509, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraPadrao);

            bLimpar = new JButton(" Limpar o Conteudo "); // BOT�O TABELA DE EVENTOS
            bLimpar.setToolTipText("Pressione para limpar a memória");
            bLimpar.setMnemonic(KeyEvent.VK_L);
            bLimpar.setActionCommand("Limpar");// define o nome da acao
            bLimpar.setBounds(2, 549, 304, 40); // Coluna,Linha,Largura,Altura 306, 229, 304, 40
            // bLimpar.setBackground(new Color(180,180,250));
            getContentPane().add(bLimpar);

            bSair = new JButton("         Sair         "); // BOT�O SAIR
            bSair.setForeground(Color.black);// cor do titulo do bot�o
            bSair.setEnabled(true);
            bSair.setToolTipText("Pressione para Sair");
            bSair.setMnemonic(KeyEvent.VK_S);
            bSair.setActionCommand("Sair");// define o nome da acao
            bSair.setBounds(306, 549, 304, 40); // Coluna,Linha,Largura,Altura
            // bSair.setBackground(new Color(180,180,250));
            getContentPane().add(bSair);

            // bEnerL1.setBackground(new Color(180,180,250));
            // bEnerL2.setBackground(new Color(180,180,250));
            // bEnerL1BarraA.setBackground(new Color(180,180,250));
            // bEnerBayBT.setBackground(new Color(180,180,250));
            // bEnerBayMT1.setBackground(new Color(180,180,250));
            // bEnerBayMT3.setBackground(new Color(180,180,250));
            // bDesenL1BarraA.setBackground(new Color(180,180,250));

            status1 = new JLabel("");
            add(status1);

            bEnerL1.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.EnerL1="EnergizarLinha1";
                        EnerL1 = "EnergizarLinha1";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para Energizar a linha 1");
                        JOptionPane.showMessageDialog(null,
                                "A manobra para Energizar a linha 1 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bEnerL2.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.EnerL2="EnergizarLinha2";
                        EnerL2 = "EnergizarLinha2";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para energizar linha 2");
                        JOptionPane.showMessageDialog(null,
                                "A manobra para energizar linha 2 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bEnerBayMT1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.EnerMT1BarraA="EnergizarMT1BarraA";
                    EnerMT1BarraA = "EnergizarMT1BarraA";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para energizar o Bay do MT-1");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para energizar o Bay do MT-1 e Barra 'A' foi Habilitada com Sucesso!!!");
                }
            });

            bEnerBayMTR.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.EnerMTRBarraA="EnergizarMTRBarraA";
                    EnerMTRBarraA = "EnergizarMTRBarraA";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para energizar o Bay do MT-R");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para energizar o Bay do MT-R e Barra 'A' foi Habilitada com Sucesso!!!");
                }
            });

            bEnerBayMT2.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.EnerMT2BarraB="EnergizarMT2BarraB";
                        EnerMT2BarraB = "EnergizarMT2BarraB";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para energizar o Bay do MT-2");
                        JOptionPane.showMessageDialog(null,
                                "A manobras para energizar Bay do MT-2 e Barra 'B'  foi habilitada com Sucesso!!!");
                    }
                }
            });

            bEnerBayMT3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.EnerMT3BarraA="EnergizarMT3BarraA";
                    EnerMT3BarraA = "EnergizarMT3BarraA";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para energizar o Bay do MT-3");
                    JOptionPane.showMessageDialog(null,
                            "Manobra para energizar o Bay do MT-3 e Barra 'A' foi habilitada com Sucesso!!!");
                }
            });

            bEnerBayMT4.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        EnerMT4BarraB = "EnergizarMT4BarraB";
                        // manobrainteligente.EnerMT4BarraB="EnergizarMT4BarraB";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para energizar o Bay do MT-4");
                        JOptionPane.showMessageDialog(null,
                                "A manobra para energizar o Bay do MT-4 e Barra 'B' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bEnerL1BarraA.addActionListener(new ActionListener() // Açao do botao Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        EnerL1BarraA = "EnergizarLinha1BarraA";
                        // manobrainteligente.EnerL1BarraA="EnergizarLinha1BarraA";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para energizar a linha 1 e Barra 'A'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para energizar a linha 1 e Barra 'A' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bEnerL2IntBarra.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        EnerL2IntBarra = "EnergizarLinha2IntBarra";
                        // manobrainteligente.EnerL2IntBarra="EnergizarLinha2IntBarra";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para energizar a linha 2 e Barra 'B'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para energizar a linha 2 e Barra 'B' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenL1.addActionListener(new ActionListener() // Açao do botao Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenL1 = "DesenergizarLinha1";
                        // manobrainteligente.DesenL1="DesenergizarLinha1";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para desenergizar a Linha 1");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar a Linha 1 foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenL2.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenL2 = "DesenergizarLinha2";
                        // manobrainteligente.DesenL2="DesenergizarLinha2";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: " + "Manobra para desenergizar a Linha 2");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar a Linha 2 foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenBayMT1.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenMT1BarraA = "DesenergizarMT1BarraA";
                        // manobrainteligente.DesenMT1BarraA="DesenergizarMT1BarraA";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para desenergizar o MT1 e Barra 'A'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar o Bay do MT-1 e Barra 'A' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenBayMTR.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenMTRBarraA = "DesenergizarMTRBarraA";
                        // manobrainteligente.DesenMTRBarraA="DesenergizarMTRBarraA";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para desenergizar o MTR e Barra 'A'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar o Bay do MT-R e Barra 'A' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenBayMT2.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenMT2BarraB = "DesenergizarMT2BarraB";
                        // manobrainteligente.DesenMT2BarraB="DesenergizarMT2BarraB";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para desenergizar o MT2 e Barra 'B'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar o Bay do MT-2 e Barra 'B' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenBayMT3.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenMT3BarraA = "DesenergizarMT3BarraA";
                        // manobrainteligente.DesenMT3BarraA="DesenergizarMT3BarraA";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para desenergizar o MT3 e Barra 'A'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar o Bay do MT-3 e Barra 'A' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenBayMT4.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenMT4BarraB = "DesenergizarMT4BarraB";
                        // manobrainteligente.DesenMT4BarraB="DesenergizarMT4BarraB";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para desenergizar o MT4 e Barra 'B'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar o Bay do MT-4 e Barra 'B' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenL1BarraA.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenL1BarraA = "DesenergizarLinha1BarraA";
                        // manobrainteligente.DesenL1BarraA="DesenergizarLinha1BarraA";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: "
                                + "Manobra para desenergizar a Linha 1 e Barra 'A'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar a Linha 1 e Barra 'A' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenL2IntBarra.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DesenL2IntBarra = "DesenergizarLinha2IntBarra";
                        // manobrainteligente.DesenL2IntBarra="DesenergizarLinha2IntBarra";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: "
                                + "Manobra para desenergizar a Linha 2 e Barra 'B'");
                        JOptionPane.showMessageDialog(null,
                                "Manobra para desenergizar a Linha 2 e Barra 'B' foi habilitada com Sucesso!!!");
                    }
                }
            });

            bManobraExecutada.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraExecutada manobraexecutada = new ManobraExecutada();
                        manobraexecutada.setVisible(true);
                    }
                }
            });

            bManobraPadrao.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraPadrao manobrapadrao = new ManobraPadrao();
                        manobrapadrao.setVisible(true);
                    }
                }
            });

            bSair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    new MenuManobrasG().setVisible(true);
                    setVisible(false);
                }
            });

            bLimpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    limparMemoria();
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
        }
    }

    // ############################## CLASSE MENU DAS MANOBRAS DA ELETRONORTE
    public class MenuManobrasELN extends JFrame implements ActionListener {
        JLabel gif, projeto;

        JPanel jpPainel = new JPanel();

        public MenuManobrasELN() // --- Configura��o do Frame
        {
            super("Menu Manobras ELETRONORTE");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout
            setResizable(false);

            setSize(630, 377);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);
            // setLocation(230, 100);
            // setVisible(true);

            JLabel lbHabilitarManobra;
            JLabel lbConferirManobra;

            JButton bDesenAlbras;
            JButton bEnerAlbras;
            JButton bPrepAlbras;
            JButton bEnerGerador;
            // JButton bOrdemManobra;
            JButton bManobraExecutada;
            JButton bManobraPadrao;
            JButton bLimpar;
            JButton bSair;
            // JButton bRetornar;

            JPanel painel = new JPanel();

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            painel.add(gif);

            projeto = new JLabel(" Manobras ELETRONORTE", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 36));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            lbHabilitarManobra = new JLabel("Habilitar as Manobras da ELETRONORTE");
            lbHabilitarManobra.setFont(new Font("Arial", 1, 20));
            lbHabilitarManobra.setForeground(Color.black);
            lbHabilitarManobra.setBounds(120, 70, 400, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbHabilitarManobra);

            bDesenAlbras = new JButton("Desenergizar a SE ALBRAS - ELETRONORTE"); // BOT�O TABELA DE EVENTOS
            bDesenAlbras.setToolTipText("Pressione para executar a manobra para desenergizar a ALBRAS");
            bDesenAlbras.setMnemonic(KeyEvent.VK_1);
            bDesenAlbras.setActionCommand("Manobras");// define o nome da acao
            bDesenAlbras.setBounds(2, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenAlbras);

            bEnerAlbras = new JButton("Energizar a SE ALBRAS - ELETRONORTE"); // BOT�O TABELA DE EVENTOS
            bEnerAlbras.setToolTipText("Pressione para executar a manobra para Energizar a ALBRAS pela ELETRONORTE");
            bEnerAlbras.setMnemonic(KeyEvent.VK_2);
            bEnerAlbras.setActionCommand("Manobras");// define o nome da acao
            bEnerAlbras.setBounds(306, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerAlbras);

            bPrepAlbras = new JButton("Preparação SE ALBRAS - Deslig. ELETRONORTE"); // BOT�O TABELA DE EVENTOS
            bPrepAlbras.setToolTipText("Pressione para executar a manobra de preparação da Subestação");
            bPrepAlbras.setMnemonic(KeyEvent.VK_1);
            bPrepAlbras.setActionCommand("Manobras");// define o nome da acao
            bPrepAlbras.setBounds(2, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bPrepAlbras);

            bEnerGerador = new JButton("Energizar o Gerador "); // BOT�O TABELA DE EVENTOS
            bEnerGerador.setToolTipText("Pressione para executar a manobra de energizaçãoo do Gerador");
            bEnerGerador.setMnemonic(KeyEvent.VK_2);
            bEnerGerador.setActionCommand("Manobras");// define o nome da acao
            bEnerGerador.setBounds(306, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnerGerador);

            lbConferirManobra = new JLabel("Conferir as Manobras");
            lbConferirManobra.setFont(new Font("Arial", 1, 20));
            lbConferirManobra.setForeground(Color.black);
            lbConferirManobra.setBounds(210, 183, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbConferirManobra);

            bManobraExecutada = new JButton(" Manobra Executada "); // BOT�O TABELA DE EVENTOS
            bManobraExecutada.setToolTipText("Pressione para conferir a manobra executada");
            bManobraExecutada.setMnemonic(KeyEvent.VK_E);
            bManobraExecutada.setActionCommand("Manobras");// define o nome da acao
            // bManobraExecutada.setBackground(new Color(180,180,250));
            bManobraExecutada.setBounds(2, 218, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraExecutada);

            bManobraPadrao = new JButton(" Manobra Padrão "); // BOT�O TABELA DE EVENTOS
            bManobraPadrao.setToolTipText("Pressione para conferir a manobra Padrão");
            bManobraPadrao.setMnemonic(KeyEvent.VK_P);
            bManobraPadrao.setActionCommand("Manobras");// define o nome da acao
            // bManobraPadrao.setBackground(new Color(180,180,250));
            bManobraPadrao.setBounds(306, 218, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraPadrao);

            bLimpar = new JButton(" Limpar o Conteudo "); // BOT�O TABELA DE EVENTOS
            bLimpar.setToolTipText("Pressione limpar a memoria");
            bLimpar.setMnemonic(KeyEvent.VK_L);
            bLimpar.setActionCommand("Limpar");// define o nome da acao
            bLimpar.setBounds(2, 257, 304, 40); // Coluna,Linha,Largura,Altura 306, 229, 304, 40
            // bLimpar.setBackground(new Color(180,180,250));
            getContentPane().add(bLimpar);

            bSair = new JButton("         Sair         "); // BOT�O SAIR
            bSair.setForeground(Color.black);// cor do titulo do bot�o
            bSair.setEnabled(true);
            bSair.setToolTipText("Pressione para Sair");
            bSair.setMnemonic(KeyEvent.VK_S);
            bSair.setActionCommand("Sair");// define o nome da acao
            bSair.setBounds(306, 257, 304, 40); // Coluna,Linha,Largura,Altura
            // bSair.setBackground(new Color(180,180,250));
            getContentPane().add(bSair);

            container.add(painel);

            bEnerAlbras.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.EnerAlbras="EnergizarAlbras";
                        EnerAlbras = "EnergizarAlbras";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: " + "Manobra para Energizar a SE ALBRAS");
                        JOptionPane.showMessageDialog(null,
                                "A manobra para Energizar a SE ALBRAS foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bDesenAlbras.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.DesenAlbras="DesenergizarAlbras";
                        DesenAlbras = "DesenergizarAlbras";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇAO: " + " Manobra para Desenergizar a SE ALBRAS");
                        JOptionPane.showMessageDialog(null,
                                "A manobra para Desenergizar a SE ALBRAS foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bPrepAlbras.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.PrepAlbras="PrepAlbras";
                    PrepAlbras = "PrepAlbras";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: "
                            + " Manobra de preparaçao para energizaçao pelo Gerador");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para preparar a Subesta��o foi Habilitada com Sucesso!!!");
                }
            });

            bEnerGerador.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.EnerGerador="EnergizarGerador";
                    EnerGerador = "EnergizarGerador";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para energizar o Gerador");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para energizar o o Gerador foi Habilitada com Sucesso!!!");
                }
            });

            bManobraExecutada.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraExecutada manobraexecutada = new ManobraExecutada();
                        manobraexecutada.setVisible(true);
                    }
                }
            });

            bManobraPadrao.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraPadrao manobrapadrao = new ManobraPadrao();
                        manobrapadrao.setVisible(true);
                    }
                }
            });

            bSair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    new MenuManobrasG().setVisible(true);
                    setVisible(false);
                }
            });

            bLimpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    limparMemoria();
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
        }
    }

    // ################################ CLASSE MENU DAS MANOBRAS DE TRANSFERÊNCIA
    public class MenuManobrasTransf extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        JPanel jpPainel = new JPanel();

        public MenuManobrasTransf() // --- Configura��o do Frame
        {
            super("Menu Manobras Transferência");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout
            setResizable(false);

            setSize(630, 456);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);
            // setLocation(230, 100);
            // setVisible(true);

            JLabel lbHabilitarManobra;
            JLabel lbConferirManobra;

            JButton bTransfMT1MTR;
            JButton bTransfMTRMT1;
            JButton bTransfMT2MTR;
            JButton bTransfMTRMT2;
            JButton bTransfMT3MTR;
            JButton bTransfMTRMT3;
            JButton bTransfMT4MTR;
            JButton bTransfMTRMT4;
            // JButton bOrdemManobra;
            JButton bManobraExecutada;
            JButton bManobraPadrao;
            JButton bLimpar;
            JButton bSair;
            // JButton bRetornar;

            JPanel painel = new JPanel();

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            painel.add(gif);
            projeto = new JLabel("Manobras de Transferencia", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 36));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            lbHabilitarManobra = new JLabel("Habilitar as Manobras de Transferência");
            lbHabilitarManobra.setFont(new Font("Arial", 1, 20));
            lbHabilitarManobra.setForeground(Color.black);
            lbHabilitarManobra.setBounds(140, 70, 380, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbHabilitarManobra);

            bTransfMT1MTR = new JButton("Transferencia do MT-1 para o MT-R");
            bTransfMT1MTR
                    .setToolTipText("Pressione para executar a manobra para transferir as cargas do MT-1 para MT-R");
            bTransfMT1MTR.setMnemonic(KeyEvent.VK_1);
            bTransfMT1MTR.setActionCommand("Manobras");// define o nome da acao
            bTransfMT1MTR.setBounds(2, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMT1MTR);

            bTransfMTRMT1 = new JButton("Transferencia do MT-R para o MT-1"); // BOT�O TABELA DE EVENTOS
            bTransfMTRMT1
                    .setToolTipText("Pressione para executar a manobra para transferir as cargas do MT-R para MT-1");
            bTransfMTRMT1.setMnemonic(KeyEvent.VK_R);
            bTransfMTRMT1.setActionCommand("Manobras");// define o nome da acao
            bTransfMTRMT1.setBounds(306, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMTRMT1);

            bTransfMT2MTR = new JButton("Transferencia do MT-2 para MT-R "); // BOT�O TABELA DE EVENTOS
            bTransfMT2MTR
                    .setToolTipText("Pressione para executar a manobra de transferencia de carga do MT-2 para o MT-R");
            bTransfMT2MTR.setMnemonic(KeyEvent.VK_2);
            bTransfMT2MTR.setActionCommand("Manobras");// define o nome da acao
            bTransfMT2MTR.setBounds(2, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMT2MTR);

            bTransfMTRMT2 = new JButton("Transferencia do MT-R para o MT-2 "); // BOT�O TABELA DE EVENTOS
            bTransfMTRMT2
                    .setToolTipText("Pressione para executar a manobra de transferencia de carga do MT-R para o MT-2");
            bTransfMTRMT2.setMnemonic(KeyEvent.VK_R);
            bTransfMTRMT2.setActionCommand("Manobras");// define o nome da acao
            bTransfMTRMT2.setBounds(306, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMTRMT2);

            bTransfMT3MTR = new JButton("Transferencia do MT-3 para o MT-R");
            bTransfMT3MTR
                    .setToolTipText("Pressione para executar a manobra para transferir as cargas do MT-3 para MT-R");
            bTransfMT3MTR.setMnemonic(KeyEvent.VK_3);
            bTransfMT3MTR.setActionCommand("Manobras");// define o nome da acao
            bTransfMT3MTR.setBounds(2, 188, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMT3MTR);

            bTransfMTRMT3 = new JButton("Transferencia do MT-R para o MT-3"); // BOT�O TABELA DE EVENTOS
            bTransfMTRMT3
                    .setToolTipText("Pressione para executar a manobra para transferir as cargas do MT-R para MT-3");
            bTransfMTRMT3.setMnemonic(KeyEvent.VK_R);
            bTransfMTRMT3.setActionCommand("Manobras");// define o nome da acao
            bTransfMTRMT3.setBounds(306, 188, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMTRMT3);

            bTransfMT4MTR = new JButton("Transferencia do MT-4 para MT-R "); // BOT�O TABELA DE EVENTOS
            bTransfMT4MTR
                    .setToolTipText("Pressione para executar a manobra de transferencia de carga do MT-4 para o MT-R");
            bTransfMT4MTR.setMnemonic(KeyEvent.VK_4);
            bTransfMT4MTR.setActionCommand("Manobras");// define o nome da acao
            bTransfMT4MTR.setBounds(2, 227, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMT4MTR);

            bTransfMTRMT4 = new JButton("Transferencia do MT-R para o MT-4 "); // BOT�O TABELA DE EVENTOS
            bTransfMTRMT4
                    .setToolTipText("Pressione para executar a manobra de transferencia de carga do MT-R para o MT-4");
            bTransfMTRMT4.setMnemonic(KeyEvent.VK_R);
            bTransfMTRMT4.setActionCommand("Manobras");// define o nome da acao
            bTransfMTRMT4.setBounds(306, 227, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bTransfMTRMT4);

            lbConferirManobra = new JLabel("Conferir as Manobras");
            lbConferirManobra.setFont(new Font("Arial", 1, 20));
            lbConferirManobra.setForeground(Color.black);
            lbConferirManobra.setBounds(210, 262, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbConferirManobra);

            bManobraExecutada = new JButton(" Manobra Executada "); // BOT�O TABELA DE EVENTOS
            bManobraExecutada.setToolTipText("Pressione conferir a manobra executada");
            bManobraExecutada.setMnemonic(KeyEvent.VK_E);
            bManobraExecutada.setActionCommand("Manobras");// define o nome da acao
            // bManobraExecutada.setBackground(new Color(180,180,250));
            bManobraExecutada.setBounds(2, 297, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraExecutada);

            bManobraPadrao = new JButton(" Manobra Padrao "); // BOT�O TABELA DE EVENTOS
            bManobraPadrao.setToolTipText("Pressione conferir a manobra Padr�o");
            bManobraPadrao.setMnemonic(KeyEvent.VK_P);
            bManobraPadrao.setActionCommand("Manobras");// define o nome da acao
            // bManobraPadrao.setBackground(new Color(180,180,250));
            bManobraPadrao.setBounds(306, 297, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraPadrao);

            bLimpar = new JButton(" Limpar o Conteudo "); // BOT�O TABELA DE EVENTOS
            bLimpar.setToolTipText("Pressione limpar a memoria");
            bLimpar.setMnemonic(KeyEvent.VK_L);
            bLimpar.setActionCommand("Limpar");// define o nome da acao
            bLimpar.setBounds(2, 336, 304, 40); // Coluna,Linha,Largura,Altura 306, 229, 304, 40
            // bLimpar.setBackground(new Color(180,180,250));
            getContentPane().add(bLimpar);

            bSair = new JButton("         Sair         "); // BOT�O SAIR
            bSair.setForeground(Color.black);// cor do titulo do bot�o
            bSair.setEnabled(true);
            bSair.setToolTipText("Pressione para Sair");
            bSair.setMnemonic(KeyEvent.VK_S);
            bSair.setActionCommand("Sair");// define o nome da acao
            bSair.setBounds(306, 336, 304, 40); // Coluna,Linha,Largura,Altura
            // bSair.setBackground(new Color(180,180,250));
            getContentPane().add(bSair);

            container.add(painel);

            bTransfMT1MTR.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.TransfMT1MTR="TransferirMT-1MT-R";
                        TransfMT1MTR = "TransferirMT1MTR";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + "Manobra para Transferir do MT-1 para MT-R");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para transferir as cargas do MT-1 para o MT-R foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bTransfMTRMT1.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.TransfMTRMT1="Transferir MT-R MT-1";
                        TransfMTRMT1 = "TransferirMTRMT1";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para Tranferir do MT-R para MT-1");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para transferir as cargas do MT-R para o MT-1 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bTransfMT2MTR.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMT2MTR="Transferir MT-2 MT-R";
                    TransfMT2MTR = "TransferirMT2MTR";
                    status1.setText(
                            "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para transferir do MT-2 para o MT-R");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para transferir as cargas do MT-2 para o MT-R foi Habilitada com Sucesso!!!");
                }
            });

            bTransfMTRMT2.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.TransfMTRMT2="Transferir MT-R MT-2";
                        TransfMTRMT2 = "TransferirMTRMT2";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para Tranferir do MT-R para MT-2");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para transferir as cargas do MT-R para o MT-2 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bTransfMT3MTR.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMT3MTR="Transferir MT-3 MT-R";
                    TransfMT3MTR = "TransferirMT3MTR";
                    status1.setText(
                            "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para transferir do MT-3 para o MT-R");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para transferir as cargas do MT-3 para o MT-R foi Habilitada com Sucesso!!!");
                }
            });

            bTransfMTRMT3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMTRMT3="Transferir MT-R MT-3";
                    TransfMTRMT3 = "TransferirMTRMT3";
                    status1.setText(
                            "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para transferir do MT-R para o MT-3");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para transferir as cargas do MT-R para o MT-3 foi Habilitada com Sucesso!!!");
                }
            });

            bTransfMT4MTR.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMT4MTR="Transferir MT-4 MT-R";
                    TransfMT4MTR = "TransferirMT4MTR";
                    status1.setText(
                            "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para transferir do MT-4 para o MT-R");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para transferir as cargas do MT-4 para o MT-R foi Habilitada com Sucesso!!!");
                }
            });

            bTransfMTRMT4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMTRMT4="Transferir MT-R MT-4";
                    TransfMTRMT4 = "TransferirMTRMT4";
                    status1.setText(
                            "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para transferir do MT-R para o MT-4");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para transferir as cargas do MT-R para o MT-4 foi Habilitada com Sucesso!!!");
                }
            });

            bManobraExecutada.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraExecutada manobraexecutada = new ManobraExecutada();
                        manobraexecutada.setVisible(true);
                    }
                }
            });

            bManobraPadrao.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraPadrao manobrapadrao = new ManobraPadrao();
                        manobrapadrao.setVisible(true);
                    }
                }
            });

            bSair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    new MenuManobrasG().setVisible(true);
                    setVisible(false);
                }
            });

            bLimpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    limparMemoria();
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
        }
    }

    // ################################### CLASSE MENU DAS MANOBRAS DA REDUÇÃO
    public class MenuManobrasReduçao extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        JPanel jpPainel = new JPanel();

        public MenuManobrasReduçao() // --- Configura��o do Frame
        {
            super("Menu Manobras da Reduçao");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout
            setResizable(false);

            setSize(630, 456);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);
            // setLocation(230, 100);
            // setVisible(true);

            JLabel lbHabilitarManobra;
            JLabel lbConferirManobra;

            JButton bDesligamentoProgRed1;
            JButton bNormalizaçaoRed1;
            JButton bDesligamentoProgRed2;
            JButton bNormalizaçaoRed2;
            JButton bDesligamentoProgRed3;
            JButton bNormalizaçaoRed3;
            JButton bDesligamentoProgRed4;
            JButton bNormalizaçaoRed4;
            // JButton bOrdemManobra;
            JButton bManobraExecutada;
            JButton bManobraPadrao;
            JButton bLimpar;
            JButton bSair;
            // JButton bRetornar;

            JPanel painel = new JPanel();

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            painel.add(gif);
            projeto = new JLabel(" Manobras da Redução", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 36));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            lbHabilitarManobra = new JLabel("Habilitar as Manobras da Redução");
            lbHabilitarManobra.setFont(new Font("Arial", 1, 20));
            lbHabilitarManobra.setForeground(Color.black);
            lbHabilitarManobra.setBounds(160, 70, 380, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbHabilitarManobra);

            bDesligamentoProgRed1 = new JButton("Desligamento Programado da REDUÇÃO 1");
            bDesligamentoProgRed1.setToolTipText("Pressione para executar a manobra de Desligamento da Redução 1");
            bDesligamentoProgRed1.setMnemonic(KeyEvent.VK_1);
            bDesligamentoProgRed1.setActionCommand("Manobras");// define o nome da acao
            bDesligamentoProgRed1.setBounds(2, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesligamentoProgRed1);

            bNormalizaçaoRed1 = new JButton("Normalização da REDUÇÃO 1"); // BOT�O TABELA DE EVENTOS
            bNormalizaçaoRed1.setToolTipText("Pressione para executar a manobra de Reenergização da Redução 1");
            bNormalizaçaoRed1.setMnemonic(KeyEvent.VK_1);
            bNormalizaçaoRed1.setActionCommand("Manobras");// define o nome da acao
            bNormalizaçaoRed1.setBounds(306, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bNormalizaçaoRed1);

            bDesligamentoProgRed2 = new JButton("Desligamento Programado da REDUÇAO 2"); // BOT�O TABELA DE EVENTOS
            bDesligamentoProgRed2.setToolTipText("Pressione para executar a manobra de Desligamento da Reduçao 2");
            bDesligamentoProgRed2.setMnemonic(KeyEvent.VK_2);
            bDesligamentoProgRed2.setActionCommand("Manobras");// define o nome da acao
            bDesligamentoProgRed2.setBounds(2, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesligamentoProgRed2);

            bNormalizaçaoRed2 = new JButton("Normalizaçao da REDUÇAO 2"); // BOT�O TABELA DE EVENTOS
            bNormalizaçaoRed2.setToolTipText("Pressione para executar a manobra de Reenergização da Redução 2");
            bNormalizaçaoRed2.setMnemonic(KeyEvent.VK_2);
            bNormalizaçaoRed2.setActionCommand("Manobras");// define o nome da acao
            bNormalizaçaoRed2.setBounds(306, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bNormalizaçaoRed2);

            bDesligamentoProgRed3 = new JButton("Desligamento Programado da REDUÇAO 3");
            bDesligamentoProgRed3.setToolTipText("Pressione para executar a manobra de Desligamento da Redução 3");
            bDesligamentoProgRed3.setMnemonic(KeyEvent.VK_3);
            bDesligamentoProgRed3.setActionCommand("Manobras");// define o nome da acao
            bDesligamentoProgRed3.setBounds(2, 188, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesligamentoProgRed3);

            bNormalizaçaoRed3 = new JButton("Normalização da REDUÇÃO 3"); // BOT�O TABELA DE EVENTOS
            bNormalizaçaoRed3.setToolTipText("Pressione para executar a manobra de Reenergização da Redução 3");
            bNormalizaçaoRed3.setMnemonic(KeyEvent.VK_3);
            bNormalizaçaoRed3.setActionCommand("Manobras");// define o nome da acao
            bNormalizaçaoRed3.setBounds(306, 188, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bNormalizaçaoRed3);

            bDesligamentoProgRed4 = new JButton("Desligamento Programado da REDUÇÃO 4"); // BOT�O TABELA DE EVENTOS
            bDesligamentoProgRed4.setToolTipText("Pressione para executar a manobra de Desligamento da Reduçao 4");
            bDesligamentoProgRed4.setMnemonic(KeyEvent.VK_4);
            bDesligamentoProgRed4.setActionCommand("Manobras");// define o nome da acao
            bDesligamentoProgRed4.setBounds(2, 227, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesligamentoProgRed4);

            bNormalizaçaoRed4 = new JButton("Normalização da REDUÇAO 4"); // BOT�O TABELA DE EVENTOS
            bNormalizaçaoRed4.setToolTipText("Pressione para executar a manobra de Reenergização da Reduçao 4");
            bNormalizaçaoRed4.setMnemonic(KeyEvent.VK_4);
            bNormalizaçaoRed4.setActionCommand("Manobras");// define o nome da acao
            bNormalizaçaoRed4.setBounds(306, 227, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bNormalizaçaoRed4);

            lbConferirManobra = new JLabel("Conferir as Manobras");
            lbConferirManobra.setFont(new Font("Arial", 1, 20));
            lbConferirManobra.setForeground(Color.black);
            lbConferirManobra.setBounds(210, 262, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbConferirManobra);

            bManobraExecutada = new JButton(" Manobra Executada "); // BOT�O TABELA DE EVENTOS
            bManobraExecutada.setToolTipText("Pressione para conferir a manobra executada");
            bManobraExecutada.setMnemonic(KeyEvent.VK_E);
            bManobraExecutada.setActionCommand("Manobras");// define o nome da acao
            // bManobraExecutada.setBackground(new Color(180,180,250));
            bManobraExecutada.setBounds(2, 297, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraExecutada);

            bManobraPadrao = new JButton(" Manobra Padrão "); // BOT�O TABELA DE EVENTOS
            bManobraPadrao.setToolTipText("Pressione para conferir a manobra Padrão");
            bManobraPadrao.setMnemonic(KeyEvent.VK_P);
            bManobraPadrao.setActionCommand("Manobras");// define o nome da acao
            // bManobraPadrao.setBackground(new Color(180,180,250));
            bManobraPadrao.setBounds(306, 297, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraPadrao);

            bLimpar = new JButton(" Limpar o Conteudo "); // BOT�O TABELA DE EVENTOS
            bLimpar.setToolTipText("Pressione limpar a memoria");
            bLimpar.setMnemonic(KeyEvent.VK_L);
            bLimpar.setActionCommand("Limpar");// define o nome da acao
            bLimpar.setBounds(2, 336, 304, 40); // Coluna,Linha,Largura,Altura 306, 229, 304, 40
            // bLimpar.setBackground(new Color(180,180,250));
            getContentPane().add(bLimpar);

            bSair = new JButton("         Sair         "); // BOT�O SAIR
            bSair.setForeground(Color.black);// cor do titulo do bot�o
            bSair.setEnabled(true);
            bSair.setToolTipText("Pressione para Sair");
            bSair.setMnemonic(KeyEvent.VK_S);
            bSair.setActionCommand("Sair");// define o nome da acao
            bSair.setBounds(306, 336, 304, 40); // Coluna,Linha,Largura,Altura
            // bSair.setBackground(new Color(180,180,250));
            getContentPane().add(bSair);

            container.add(painel);

            bDesligamentoProgRed1.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DeslProgRed1 = "DeslProgRed1";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇAO: " + "Manobra para Desligamento da Reduçao 1");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para Desligamento da Reduçao 1 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bNormalizaçaoRed1.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        // manobrainteligente.TransfMTRMT1="Transferir MT-R MT-1";
                        NormRed1 = "NormalizacaoRed1";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para Normalizaçao da Reduçao 1");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para Normalizaçao da Reduçao 1 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bDesligamentoProgRed2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMT2MTR="Transferir MT-2 MT-R";
                    DeslProgRed2 = "DeslProgRed2";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: " + "Manobra para Desligamento da Reduçao 2");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Desligamento da Reduçao 2 foi Habilitada com Sucesso!!!");
                }
            });

            bNormalizaçaoRed2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMTRMT2="Transferir MT-R MT-2";
                    NormRed2 = "NormalizacaoRed2";
                    status1.setText("MANOBRA HABILITADA PARA SIMULA��O: " + " Manobra para Normalizaçao da Redução 2");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Normalização da Redução 2 foi Habilitada com Sucesso!!!");
                }
            });

            bDesligamentoProgRed3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMT2MTR="Transferir MT-2 MT-R";
                    DeslProgRed3 = "DeslProgRed3";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAçãO: "
                            + "Manobra para Desligamento da Redução 3                                  ");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Desligamento da Redução 3 foi Habilitada com Sucesso!!!");
                }
            });

            bNormalizaçaoRed3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMTRMT2="Transferir MT-R MT-2";
                    NormRed3 = "NormalizacaoRed3";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: " + " Manobra para Normalização da Redução 3");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Normalização da Redução 3 foi Habilitada com Sucesso!!!");
                }
            });

            bDesligamentoProgRed4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMT2MTR="Transferir MT-2 MT-R";
                    DeslProgRed4 = "DeslProgRed4";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: " + "Manobra para Desligamento da Reduçao 4");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Desligamento da Redução 4 foi Habilitada com Sucesso!!!");
                }
            });

            bNormalizaçaoRed4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    // manobrainteligente.TransfMTRMT2="Transferir MT-R MT-2";
                    NormRed4 = "NormalizacaoRed4";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: " + " Manobra para Normalizaçao da Reduçao 4");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Normalização da Reduçao 4 foi Habilitada com Sucesso!!!");
                }
            });

            bManobraExecutada.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraExecutada manobraexecutada = new ManobraExecutada();
                        manobraexecutada.setVisible(true);
                    }
                }
            });

            bManobraPadrao.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraPadrao manobrapadrao = new ManobraPadrao();
                        manobrapadrao.setVisible(true);
                    }
                }
            });

            bSair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    new MenuManobrasG().setVisible(true);
                    setVisible(false);
                }
            });

            bLimpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    limparMemoria();
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
        }
    }

    // ##################################### CLASSE MENU DAS MANOBRAS DO GERADOR
    public class MenuManobrasGerador extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        JPanel jpPainel = new JPanel();

        public MenuManobrasGerador() // --- Configuraçao do Frame
        {
            super("Menu Manobras dos Geradores");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout
            setResizable(false);

            setSize(630, 377);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);
            // setLocation(230, 100);
            // setVisible(true);

            JLabel lbHabilitarManobra;
            JLabel lbConferirManobra;

            JButton bEnergizaçaodaBarraEmpeloGerador;
            JButton bEnergizaçaodasCargaspeloGerador;
            JButton bDesligamentodasCargasalimentadasGerador;
            JButton bDesenergizaçaodaBarraEmpeloGerador;
            JButton bManobraExecutada;
            JButton bManobraPadrao;
            JButton bLimpar;
            JButton bSair;
            // JButton bRetornar;

            JPanel painel = new JPanel();

            Icon imagem = new ImageIcon("linha.GIF");
            gif = new JLabel();
            gif.setIcon(imagem);
            painel.add(gif);
            projeto = new JLabel(" Manobras do Gerador", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 36));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            lbHabilitarManobra = new JLabel("Habilitar as Manobras do Gerador");
            lbHabilitarManobra.setFont(new Font("Arial", 1, 20));
            lbHabilitarManobra.setForeground(Color.black);
            lbHabilitarManobra.setBounds(160, 70, 380, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbHabilitarManobra);

            bEnergizaçaodaBarraEmpeloGerador = new JButton("Energizaço da Barra EM pelo Gerador");
            bEnergizaçaodaBarraEmpeloGerador.setToolTipText("Pressione para executar a manobra ");
            bEnergizaçaodaBarraEmpeloGerador.setMnemonic(KeyEvent.VK_1);
            bEnergizaçaodaBarraEmpeloGerador.setActionCommand("Manobras");// define o nome da acao
            bEnergizaçaodaBarraEmpeloGerador.setBounds(2, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnergizaçaodaBarraEmpeloGerador);

            bEnergizaçaodasCargaspeloGerador = new JButton("Energização das Cargas pelo Gerador"); // BOT�O TABELA DE
                                                                                                   // EVENTOS
            bEnergizaçaodasCargaspeloGerador.setToolTipText("Pressione para executar a manobra ");
            bEnergizaçaodasCargaspeloGerador.setMnemonic(KeyEvent.VK_2);
            bEnergizaçaodasCargaspeloGerador.setActionCommand("Manobras");// define o nome da acao
            bEnergizaçaodasCargaspeloGerador.setBounds(306, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnergizaçaodasCargaspeloGerador);

            bDesligamentodasCargasalimentadasGerador = new JButton("Deslig. das Cargas Alimentadas pelo Gerador"); // BOT�O
                                                                                                                   // TABELA
                                                                                                                   // DE
                                                                                                                   // EVENTOS
            bDesligamentodasCargasalimentadasGerador.setToolTipText("Pressione para executar a manobra ");
            bDesligamentodasCargasalimentadasGerador.setMnemonic(KeyEvent.VK_1);
            bDesligamentodasCargasalimentadasGerador.setActionCommand("Manobras");// define o nome da acao
            bDesligamentodasCargasalimentadasGerador.setBounds(2, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesligamentodasCargasalimentadasGerador);

            bDesenergizaçaodaBarraEmpeloGerador = new JButton("Desenergização da Barra EM pelo Gerador"); // BOT�O
                                                                                                          // TABELA DE
                                                                                                          // EVENTOS
            bDesenergizaçaodaBarraEmpeloGerador.setToolTipText("Pressione para executar a manobra ");
            bDesenergizaçaodaBarraEmpeloGerador.setMnemonic(KeyEvent.VK_2);
            bDesenergizaçaodaBarraEmpeloGerador.setActionCommand("Manobras");// define o nome da acao
            bDesenergizaçaodaBarraEmpeloGerador.setBounds(306, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesenergizaçaodaBarraEmpeloGerador);

            lbConferirManobra = new JLabel("Conferir as Manobras");
            lbConferirManobra.setFont(new Font("Arial", 1, 20));
            lbConferirManobra.setForeground(Color.black);
            lbConferirManobra.setBounds(210, 183, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbConferirManobra);

            bManobraExecutada = new JButton(" Manobra Executada "); // BOT�O TABELA DE EVENTOS
            bManobraExecutada.setToolTipText("Pressione para conferir a manobra executada");
            bManobraExecutada.setMnemonic(KeyEvent.VK_E);
            bManobraExecutada.setActionCommand("Manobras");// define o nome da acao
            // bManobraExecutada.setBackground(new Color(180,180,250));
            bManobraExecutada.setBounds(2, 218, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraExecutada);

            bManobraPadrao = new JButton(" Manobra Padrão "); // BOT�O TABELA DE EVENTOS
            bManobraPadrao.setToolTipText("Pressione conferir a manobra padrão");
            bManobraPadrao.setMnemonic(KeyEvent.VK_P);
            bManobraPadrao.setActionCommand("Manobras");// define o nome da acao
            // bManobraPadrao.setBackground(new Color(180,180,250));
            bManobraPadrao.setBounds(306, 218, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraPadrao);

            bLimpar = new JButton(" Limpar o Conteúdo "); // BOT�O TABELA DE EVENTOS
            bLimpar.setToolTipText("Pressione limpar a memoria");
            bLimpar.setMnemonic(KeyEvent.VK_L);
            bLimpar.setActionCommand("Limpar");// define o nome da acao
            bLimpar.setBounds(2, 257, 304, 40); // Coluna,Linha,Largura,Altura 306, 229, 304, 40
            // bLimpar.setBackground(new Color(180,180,250));
            getContentPane().add(bLimpar);

            bSair = new JButton("         Sair         "); // BOT�O SAIR
            bSair.setForeground(Color.black);// cor do titulo do bot�o
            bSair.setEnabled(true);
            bSair.setToolTipText("Pressione para Sair");
            bSair.setMnemonic(KeyEvent.VK_S);
            bSair.setActionCommand("Sair");// define o nome da acao
            bSair.setBounds(306, 257, 304, 40); // Coluna,Linha,Largura,Altura
            // bSair.setBackground(new Color(180,180,250));
            getContentPane().add(bSair);

            container.add(painel);

            bEnergizaçaodaBarraEmpeloGerador.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        EnergBarraEM = "EnergBarraEM";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇÃO: "
                                + "Manobra para Energizar a Barra EM pelo Gerador");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para Energizar a Barra EM pelo Gerador foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bEnergizaçaodasCargaspeloGerador.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        EnergCargas = "EnergCargas";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇãO: "
                                + " Manobra para Energizar as Cargas pelo Gerador");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para Energizar as Cargas pelo Gerador foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bDesligamentodasCargasalimentadasGerador.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    DeslCargas = "DeslCargas";
                    status1.setText(
                            "MANOBRA HABILITADA PARA SIMULAÇãO: " + " Manobra para Desligar as Cargas pelo Gerador");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Desligar as Cargas pelo Gerador foi Habilitada com Sucesso!!!");
                }
            });

            bDesenergizaçaodaBarraEmpeloGerador.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    DesenBarraEM = "DesenBarraEM";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇãO: "
                            + " Manobra para Desenergizar a Barra EM pelo Gerador");
                    JOptionPane.showMessageDialog(null,
                            " A Manobra para Desenergizar a Barra EM pelo Gerador foi Habilitada com Sucesso!!!");
                }
            });

            bManobraExecutada.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraExecutada manobraexecutada = new ManobraExecutada();
                        manobraexecutada.setVisible(true);
                    }
                }
            });

            bManobraPadrao.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        ManobraPadrao manobrapadrao = new ManobraPadrao();
                        manobrapadrao.setVisible(true);
                    }
                }
            });

            bSair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    new MenuManobrasG().setVisible(true);
                    setVisible(false);
                }
            });

            bLimpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    limparMemoria();
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
        }
    }

    // ################################################# CLASSE MANOBRA EXECUTADA
    public class ManobraExecutada extends JFrame // implements ActionListener
    {
        String manobra = "";

        public ManobraExecutada() {
            setTitle("Ordem de Manobra  " + "Executada");
            Container container = getContentPane();
            container.setLayout(new BorderLayout());
            setResizable(false);

            setSize(440, 450);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);

            final JLabel mostrar1;
            final JLabel mostrar2;
            final JLabel mostrar3;
            final JLabel mostrar4;
            final JLabel mostrar5;
            final JLabel mostrar6;
            final JLabel mostrar7;
            final JLabel mostrar8;
            final JLabel mostrar9;
            final JLabel mostrar10;
            final JLabel mostrar11;
            final JLabel mostrar12;
            final JLabel mostrar13;
            final JLabel mostrar14;
            final JLabel mostrar15;
            final JLabel mostrar16;
            final JLabel mostrar17;
            final JLabel mostrar18;
            final JLabel mostrar19;
            final JLabel mostrar20;
            final JLabel mostrar21;
            final JLabel mostrar22;
            final JLabel mostrar23;
            final JLabel mostrar24;

            JButton Comparar;
            JButton Limpar;
            JButton Sair;
            // JButton Manobra;

            final JLabel lbManobra, projeto;

            JPanel painel = new JPanel();

            projeto = new JLabel("Manobra Executada!", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 28));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            Comparar = new JButton("Visualizar");
            Comparar.setBackground(new Color(180, 180, 250));
            Comparar.setBounds(100, 370, 95, 30); // Coluna,Linha,Largura,Altura
            getContentPane().add(Comparar);

            Limpar = new JButton("Limpar");
            Limpar.setBackground(new Color(180, 180, 250));
            Limpar.setBounds(200, 370, 95, 30); // Coluna,Linha,Largura,Altura
            getContentPane().add(Limpar);

            Sair = new JButton("Sair");
            Sair.setBackground(new Color(180, 180, 250));
            Sair.setBounds(300, 370, 95, 30); // Coluna,Linha,Largura,Altura
            // Sair.addActionListener(this);
            getContentPane().add(Sair);

            lbManobra = new JLabel("                               MANOBRA:                               ");
            lbManobra.setFont(new Font("Arial", 1, 16));
            lbManobra.setBackground(new Color(0, 0, 0));// cor de fundo do bot�o
            lbManobra.setForeground(Color.red);
            painel.add(lbManobra);

            mostrar1 = new JLabel();
            mostrar1.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar1);

            mostrar2 = new JLabel();
            mostrar2.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar2);

            mostrar3 = new JLabel();
            mostrar3.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar3);

            mostrar4 = new JLabel();
            mostrar4.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar4);

            mostrar5 = new JLabel();
            mostrar5.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar5);

            mostrar6 = new JLabel();
            mostrar6.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar6);

            mostrar7 = new JLabel();
            mostrar7.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar7);

            mostrar8 = new JLabel();
            mostrar8.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar8);

            mostrar9 = new JLabel();
            mostrar9.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar9);

            mostrar10 = new JLabel();
            mostrar10.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar10);

            mostrar11 = new JLabel();
            mostrar11.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar11);

            mostrar12 = new JLabel();
            mostrar12.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar12);

            mostrar13 = new JLabel();
            mostrar13.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar13);

            mostrar14 = new JLabel();
            mostrar14.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar14);

            mostrar15 = new JLabel();
            mostrar15.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar15);

            mostrar16 = new JLabel();
            mostrar16.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar16);

            mostrar17 = new JLabel();
            mostrar17.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar17);

            mostrar18 = new JLabel();
            mostrar18.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar18);

            mostrar19 = new JLabel();
            mostrar19.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar19);

            mostrar20 = new JLabel();
            mostrar20.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar20);

            mostrar21 = new JLabel();
            mostrar21.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar21);

            mostrar22 = new JLabel();
            mostrar22.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar22);

            mostrar23 = new JLabel();
            mostrar23.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar23);

            mostrar24 = new JLabel();
            mostrar24.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar24);

            // box.add(new JScrollPane(painel));
            container.add(painel);

            Comparar.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    if (EnerL1.equals("EnergizarLinha1")) {
                        mostrar1.setText("       " + seccionadora89l1fechada);
                        mostrar2.setText("                          " + seccionadora89l1afechada);
                        mostrar3.setText("                          " + seccionadora89l1bfechada);
                        mostrar4.setText("                                  " + disjuntor52l1fechado);
                    }

                    if (DesenL1.equals("DesenergizarLinha1")) {
                        mostrar5.setText("           " + disjuntor52l1aberto);
                        mostrar6.setText("                   " + seccionadora89l1aberta);
                        mostrar7.setText("                                " + seccionadora89l1aaberta);
                        mostrar8.setText("                                " + seccionadora89l1baberta);
                    }

                    if (EnerL2.equals("EnergizarLinha2")) {
                        mostrar1.setText(" " + seccionadora89l2fechada);
                        mostrar2.setText("                          " + seccionadora89l2bfechada);
                        mostrar3.setText("                          " + seccionadora89l2afechada);
                        mostrar4.setText("                                  " + disjuntor52l2fechado);
                    }

                    if (DesenL2.equals("DesenergizarLinha2")) {
                        mostrar5.setText("           " + disjuntor52l2aberto);
                        mostrar6.setText("                    " + seccionadora89l2aberta);
                        mostrar7.setText("                               " + seccionadora89l2baberta);
                        mostrar8.setText("                               " + seccionadora89l2aaberta);
                    }

                    if (EnerL1BarraA.equals("EnergizarLinha1BarraA")) {
                        mostrar1.setText("         " + seccionadora89l1fechada);
                        mostrar2.setText("                          " + seccionadora89l1afechada);
                        mostrar3.setText("                          " + seccionadora89btafechada);
                        mostrar4.setText("                          " + seccionadora89btbfechada);
                        mostrar5.setText("                          " + disjuntor52btfechado);
                        mostrar6.setText("                          " + disjuntor52l1fechado);
                        mostrar7.setText("                          " + seccionadora89mt1afechada);
                        mostrar8.setText("                          " + seccionadora89mt1baberta);
                        mostrar9.setText("                          " + seccionadora89mtrafechada);
                        mostrar10.setText("                          " + seccionadora89mtrbaberta);
                        mostrar11.setText("                          " + seccionadora89mt3afechada);
                        mostrar12.setText("                                          " + seccionadora89mt3baberta);
                    }

                    if (DesenL1BarraA.equals("DesenergizarLinha1BarraA")) {
                        mostrar1.setText("         " + seccionadora89mt1bfechada);
                        mostrar2.setText("                          " + seccionadora89mt1aaberta);
                        mostrar3.setText("                          " + seccionadora89mtrbfechada);
                        mostrar4.setText("                          " + seccionadora89mtraaberta);
                        mostrar5.setText("                          " + seccionadora89mt3bfechada);
                        mostrar6.setText("                          " + seccionadora89mt3aaberta);
                        mostrar7.setText("                          " + disjuntor52l1aberto);
                        mostrar8.setText("                          " + seccionadora89l1aberta);
                        mostrar9.setText("                          " + disjuntor52btaberto);
                        mostrar10.setText("                          " + seccionadora89btaaberta);
                        mostrar11.setText("                         " + seccionadora89btbaberta);
                        mostrar12.setText("                                         " + seccionadora89l1aaberta);
                    }

                    if (EnerL2IntBarra.equals("EnergizarLinha2IntBarra")) {
                        mostrar1.setText("          " + seccionadora89l2fechada);
                        mostrar2.setText("                          " + seccionadora89l2bfechada);
                        mostrar3.setText("                          " + seccionadora89btafechada);
                        mostrar4.setText("                          " + seccionadora89btbfechada);
                        mostrar5.setText("                          " + disjuntor52btfechado);
                        mostrar6.setText("                          " + disjuntor52l2fechado);
                        mostrar7.setText("                          " + seccionadora89mt2bfechada);
                        mostrar8.setText("                          " + seccionadora89mt2aaberta);
                        mostrar9.setText("                          " + seccionadora89mt4bfechada);
                        mostrar10.setText("                                            " + seccionadora89mt4aaberta);
                    }

                    if (DesenL2IntBarra.equals("DesenergizarLinha2IntBarra")) {
                        mostrar1.setText("        " + seccionadora89mt2afechada);
                        mostrar2.setText("                          " + seccionadora89mt2baberta);
                        mostrar3.setText("                          " + seccionadora89mt4afechada);
                        mostrar4.setText("                          " + seccionadora89mt4baberta);
                        mostrar5.setText("                          " + disjuntor52l2aberto);
                        mostrar6.setText("                          " + seccionadora89l2aberta);
                        mostrar7.setText("                          " + disjuntor52btaberto);
                        mostrar8.setText("                          " + seccionadora89btaaberta);
                        mostrar9.setText("                         " + seccionadora89btbaberta);
                        mostrar10.setText("                                         " + seccionadora89l2baberta);
                    }

                    if (EnerMT1BarraA.equals("EnergizarMT1BarraA")) {
                        mostrar1.setText("                      " + seccionadora89btafechada);
                        mostrar2.setText("                      " + seccionadora89btbfechada);
                        mostrar3.setText("                      " + disjuntor52btfechado);
                        mostrar4.setText("                      " + seccionadora89l1afechada);
                        mostrar5.setText("                      " + seccionadora89l1baberta);
                        mostrar6.setText("                      " + seccionadora89mtrafechada);
                        mostrar7.setText("                      " + seccionadora89mtrbaberta);
                        mostrar8.setText("                      " + seccionadora89mt3afechada);
                        mostrar9.setText("                      " + seccionadora89mt3baberta);
                        mostrar10.setText("                     " + seccionadora89mt1afechada);
                        mostrar11.setText("                                            " + disjuntor52mt1fechado);
                    }

                    if (DesenMT1BarraA.equals("DesenergizarMT1BarraA")) {
                        mostrar1.setText("                          " + disjuntor52mt1aberto);
                        mostrar2.setText("                     " + seccionadora89mt1aaberta);
                        mostrar3.setText("                     " + seccionadora89l1bfechada);
                        mostrar4.setText("                     " + seccionadora89l1aaberta);
                        mostrar5.setText("                     " + seccionadora89mtrbfechada);
                        mostrar6.setText("                     " + seccionadora89mtraaberta);
                        mostrar7.setText("                     " + seccionadora89mt3bfechada);
                        mostrar8.setText("                     " + seccionadora89mt3aaberta);
                        mostrar9.setText("                     " + disjuntor52btaberto);
                        mostrar10.setText("                    " + seccionadora89btaaberta);
                        mostrar11.setText("                                            " + seccionadora89btbaberta);
                    }

                    if (EnerMTRBarraA.equals("EnergizarMTRBarraA")) {
                        mostrar1.setText("                      " + seccionadora89btafechada);
                        mostrar2.setText("                      " + seccionadora89btbfechada);
                        mostrar3.setText("                      " + disjuntor52btfechado);
                        mostrar4.setText("                      " + seccionadora89l1afechada);
                        mostrar5.setText("                      " + seccionadora89l1baberta);
                        mostrar6.setText("                      " + seccionadora89mt1afechada);
                        mostrar7.setText("                      " + seccionadora89mt1baberta);
                        mostrar8.setText("                      " + seccionadora89mt3afechada);
                        mostrar9.setText("                      " + seccionadora89mt3baberta);
                        mostrar10.setText("                     " + seccionadora89mtrafechada);
                        mostrar11.setText("                                            " + disjuntor52mtrfechado);
                    }

                    if (DesenMTRBarraA.equals("DesenergizarMTRBarraA")) {
                        mostrar1.setText("                           " + disjuntor52mtraberto);
                        mostrar2.setText("                      " + seccionadora89mtraaberta);
                        mostrar3.setText("                      " + seccionadora89l1bfechada);
                        mostrar4.setText("                      " + seccionadora89l1aaberta);
                        mostrar5.setText("                      " + seccionadora89mt1bfechada);
                        mostrar6.setText("                      " + seccionadora89mt1aaberta);
                        mostrar7.setText("                      " + seccionadora89mt3bfechada);
                        mostrar8.setText("                      " + seccionadora89mt3aaberta);
                        mostrar9.setText("                      " + seccionadora89btaaberta);
                        mostrar10.setText("                     " + seccionadora89btbaberta);
                        mostrar11.setText("                                            " + disjuntor52btaberto);
                    }

                    if (EnerMT2BarraB.equals("EnergizarMT2BarraB")) {
                        mostrar1.setText("                       " + seccionadora89btafechada);
                        mostrar2.setText("                       " + seccionadora89btbfechada);
                        mostrar3.setText("                       " + disjuntor52btfechado);
                        mostrar4.setText("                       " + seccionadora89l2bfechada);
                        mostrar5.setText("                       " + seccionadora89l2aaberta);
                        mostrar6.setText("                       " + seccionadora89mt4bfechada);
                        mostrar7.setText("                       " + seccionadora89mt4aaberta);
                        mostrar10.setText("                      " + seccionadora89mt2bfechada);
                        mostrar11.setText("                                             " + disjuntor52mt2fechado);
                    }

                    if (DesenMT2BarraB.equals("DesenergizarMT2BarraB")) {
                        mostrar1.setText("                      " + disjuntor52mt2aberto);
                        mostrar2.setText("                      " + seccionadora89mt2baberta);
                        mostrar3.setText("                      " + seccionadora89l2afechada);
                        mostrar4.setText("                      " + seccionadora89l2baberta);
                        mostrar5.setText("                      " + seccionadora89mt4afechada);
                        mostrar6.setText("                      " + seccionadora89mt4baberta);
                        mostrar7.setText("                      " + seccionadora89btaaberta);
                        mostrar8.setText("                      " + seccionadora89btbaberta);
                        mostrar9.setText("                                              " + disjuntor52btaberto);
                    }

                    if (EnerMT3BarraA.equals("EnergizarMT3BarraA")) {
                        mostrar1.setText("                        " + seccionadora89btafechada);
                        mostrar2.setText("                        " + seccionadora89btbfechada);
                        mostrar3.setText("                        " + disjuntor52btfechado);
                        mostrar4.setText("                        " + seccionadora89l1afechada);
                        mostrar5.setText("                        " + seccionadora89l1baberta);
                        mostrar6.setText("                        " + seccionadora89mt1afechada);
                        mostrar7.setText("                        " + seccionadora89mt1baberta);
                        mostrar8.setText("                        " + seccionadora89mtrafechada);
                        mostrar9.setText("                        " + seccionadora89mtrbaberta);
                        mostrar10.setText("                       " + seccionadora89mt3afechada);
                        mostrar11.setText("                                             " + disjuntor52mt3fechado);
                    }

                    if (DesenMT3BarraA.equals("DesenergizarMT3BarraA")) {
                        mostrar1.setText("                         " + disjuntor52mt3aberto);
                        mostrar2.setText("                        " + seccionadora89mt3aaberta);
                        mostrar3.setText("                        " + seccionadora89l1bfechada);
                        mostrar4.setText("                        " + seccionadora89l1aaberta);
                        mostrar5.setText("                        " + seccionadora89mt1bfechada);
                        mostrar6.setText("                        " + seccionadora89mt1aaberta);
                        mostrar7.setText("                        " + seccionadora89mtrbfechada);
                        mostrar8.setText("                        " + seccionadora89mtraaberta);
                        mostrar9.setText("                        " + seccionadora89btaaberta);
                        mostrar10.setText("                       " + seccionadora89btbaberta);
                        mostrar11.setText("                                            " + disjuntor52btaberto);
                    }

                    if (EnerMT4BarraB.equals("EnergizarMT4BarraB")) {
                        mostrar1.setText("                        " + seccionadora89btafechada);
                        mostrar2.setText("                        " + seccionadora89btbfechada);
                        mostrar3.setText("                        " + disjuntor52btfechado);
                        mostrar4.setText("                        " + seccionadora89l2bfechada);
                        mostrar5.setText("                        " + seccionadora89l2aaberta);
                        mostrar6.setText("                        " + seccionadora89mt2bfechada);
                        mostrar7.setText("                        " + seccionadora89mt2aaberta);
                        mostrar8.setText("                        " + seccionadora89mt4bfechada);
                        mostrar9.setText("                        " + disjuntor52mt4fechado);
                    }

                    if (DesenMT4BarraB.equals("DesenergizarMT4BarraB")) {
                        mostrar1.setText("                        " + disjuntor52mt4aberto);
                        mostrar2.setText("                        " + seccionadora89mt4baberta);
                        mostrar3.setText("                        " + seccionadora89l2afechada);
                        mostrar4.setText("                        " + seccionadora89l2baberta);
                        mostrar5.setText("                        " + seccionadora89mt2afechada);
                        mostrar6.setText("                        " + seccionadora89mt2baberta);
                        mostrar7.setText("                        " + seccionadora89btaaberta);
                        mostrar8.setText("                        " + seccionadora89btbaberta);
                        mostrar9.setText("                                              " + disjuntor52btaberto);
                    }

                    if (EnerAlbras.equals("EnergizarAlbras") && eqp.disjuntor52l1().equals("Disjuntor Fechado")) {
                        mostrar1.setText("          " + disjuntor52l1fechado);
                        mostrar2.setText("          " + disjuntor52l2fechado);
                        mostrar3.setText("          " + disjuntor52btfechado);
                        mostrar4.setText("          " + disjuntor52alfechado);
                        mostrar5.setText("         " + disjuntor52mt1fechado);
                        mostrar6.setText("         " + disjuntor52mtrfechado);
                        mostrar7.setText("         " + disjuntor52mt2fechado);
                        mostrar8.setText("         " + disjuntor52mt3fechado);
                        mostrar9.setText("         " + disjuntor52mt4fechado);
                        mostrar10.setText("         " + disjuntor52a1fechado);
                        mostrar11.setText("         " + disjuntor52a2fechado);
                        mostrar12.setText("         " + disjuntor52a3fechado);
                        mostrar13.setText("         " + disjuntor52a4fechado);
                        mostrar14.setText("         " + disjuntor52a5fechado);
                        mostrar15.setText("         " + disjuntor52a6fechado);
                        mostrar16.setText("         " + disjuntor52a3fechado);
                        mostrar17.setText("         " + disjuntor52a4fechado);
                        mostrar18.setText("         " + disjuntor52p1fechado);
                        mostrar19.setText("         " + disjuntor52p2fechado);
                        mostrar20.setText("         " + disjuntor52p3fechado);
                        mostrar21.setText("         " + disjuntor52p4fechado);
                        mostrar22.setText("         " + disjuntor52p5fechado);
                        mostrar23.setText("         " + disjuntor52p3fechado);
                    }

                    if (DesenAlbras.equals("DesenergizarAlbras")) {
                        mostrar1.setText("           " + disjuntor52l1aberto);
                        mostrar2.setText("           " + disjuntor52l2aberto);
                        mostrar3.setText("           " + disjuntor52btaberto);
                        mostrar4.setText("           " + disjuntor52alaberto);
                        mostrar5.setText("          " + disjuntor52mt1aberto);
                        mostrar6.setText("          " + disjuntor52mtraberto);
                        mostrar7.setText("          " + disjuntor52mt2aberto);
                        mostrar8.setText("          " + disjuntor52mt3aberto);
                        mostrar9.setText("          " + disjuntor52mt4aberto);
                        mostrar10.setText("          " + disjuntor52a1aberto);
                        mostrar11.setText("          " + disjuntor52a2aberto);
                        mostrar12.setText("          " + disjuntor52a3aberto);
                        mostrar13.setText("          " + disjuntor52a4aberto);
                        mostrar14.setText("          " + disjuntor52a5aberto);
                        mostrar15.setText("          " + disjuntor52a6aberto);
                        mostrar16.setText("          " + disjuntor52a3aberto);
                        mostrar17.setText("          " + disjuntor52a4aberto);
                        mostrar18.setText("          " + disjuntor52p1aberto);
                        mostrar19.setText("          " + disjuntor52p2aberto);
                        mostrar20.setText("          " + disjuntor52p3aberto);
                        mostrar21.setText("          " + disjuntor52p4aberto);
                        mostrar22.setText("          " + disjuntor52p5aberto);
                        mostrar23.setText("          " + disjuntor52p3aberto);
                    }

                    if (PrepAlbras.equals("PrepAlbras")) {
                        mostrar1.setText("       " + seccionadora89a2eaberta);
                        mostrar2.setText("       " + seccionadora89a4eaberta);
                        mostrar3.setText("       " + seccionadora89a6eaberta);
                        mostrar4.setText("       " + seccionadora89a4eaberta);
                        mostrar5.setText("     " + seccionadora89lvrreaberta);
                        mostrar6.setText("      " + seccionadora89lvrraberta);
                        mostrar7.setText("        " + seccionadora89p1aberta);
                        mostrar8.setText("        " + seccionadora89p2aberta);
                        mostrar9.setText("        " + seccionadora89p3aberta);
                        mostrar10.setText("       " + seccionadora89p4aberta);
                        mostrar11.setText("       " + seccionadora89p5aberta);
                        mostrar12.setText("       " + seccionadora89p3aberta);
                        mostrar13.setText("     " + seccionadora89a2efechada);
                        mostrar14.setText("     " + seccionadora89a4efechada);
                        mostrar15.setText("     " + seccionadora89a6efechada);
                        mostrar16.setText("     " + seccionadora89a4efechada);
                        mostrar17.setText("     " + seccionadora89p1efechada);
                        mostrar18.setText("     " + seccionadora89p2efechada);
                        mostrar19.setText("     " + seccionadora89p3efechada);
                        mostrar20.setText("     " + seccionadora89p4efechada);
                        mostrar21.setText("     " + seccionadora89p5efechada);
                        mostrar22.setText("     " + seccionadora89p3efechada);
                        mostrar23.setText("     " + seccionadora89tuefechada);
                        mostrar24.setText("          " + disjuntor52tufechado);
                    }

                    if (EnergBarraEM.equals("EnergBarraEM")) {
                        mostrar1.setText("            " + disjuntor52g1fechado);
                        mostrar2.setText("            " + disjuntor52g2fechado);
                        mostrar3.setText("        " + seccionadora89tuefechada);
                        mostrar4.setText("            " + disjuntor52tufechado);
                    }

                    if (DesenBarraEM.equals("DesenBarraEM")) {
                        mostrar1.setText("            " + disjuntor52tuaberto);
                        mostrar2.setText("        " + seccionadora89tueaberta);
                        mostrar3.setText("             " + disjuntor52g1aberto);
                        mostrar4.setText("             " + disjuntor52g2aberto);
                    }

                    if (EnergCargas.equals("EnergCargas")) {
                        mostrar1.setText("            " + disjuntor52a1fechado);
                        mostrar2.setText("            " + disjuntor52a3fechado);
                        mostrar3.setText("            " + disjuntor52a5fechado);
                        mostrar4.setText("            " + disjuntor52a7fechado);
                        mostrar5.setText("            " + disjuntor52p1fechado);
                        mostrar6.setText("            " + disjuntor52p2fechado);
                        mostrar7.setText("            " + disjuntor52p3fechado);
                        mostrar8.setText("            " + disjuntor52p4fechado);
                        mostrar9.setText("            " + disjuntor52p5fechado);
                        mostrar10.setText("           " + disjuntor52p6fechado);
                    }

                    if (DeslCargas.equals("DeslCargas")) {
                        mostrar1.setText("            " + disjuntor52a1aberto);
                        mostrar2.setText("            " + disjuntor52a3aberto);
                        mostrar3.setText("            " + disjuntor52a5aberto);
                        mostrar4.setText("            " + disjuntor52a7aberto);
                        mostrar5.setText("            " + disjuntor52p1aberto);
                        mostrar6.setText("            " + disjuntor52p2aberto);
                        mostrar7.setText("            " + disjuntor52p3aberto);
                        mostrar8.setText("            " + disjuntor52p4aberto);
                        mostrar9.setText("            " + disjuntor52p5aberto);
                        mostrar10.setText("           " + disjuntor52p6aberto);
                    }

                    if (EnerL1.equals("EnergizarLinha1")) {
                        manobra = "         OM Energizar o Bay da Linha 1    ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL1.equals("DesenergizarLinha1")) {
                        manobra = " OM Desenergizar o Bay da Linha 1 ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerL2.equals("EnergizarLinha2")) {
                        manobra = "         OM Energizar o Bay da Linha 2    ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL2.equals("DesenergizarLinha2")) {
                        manobra = " OM Desenergizar o Bay da Linha 2 ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerL1BarraA.equals("EnergizarLinha1BarraA")) {
                        manobra = " OM Energizar o Bay da Linha 1 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL1BarraA.equals("DesenergizarLinha1BarraA")) {
                        manobra = " OM Desenergizar o Bay da Linha 1 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerL2IntBarra.equals("EnergizarLinha2IntBarra")) {
                        manobra = " OM Energizar o Bay da Linha 2 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL2IntBarra.equals("DesenergizarLinha2IntBarra")) {
                        manobra = " OM Desenergizar o Bay da Linha 2 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT1BarraA.equals("EnergizarMT1BarraA")) {
                        manobra = " OM Energizar o Bay do MT-1 e Barra A ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT1BarraA.equals("DesenergizarMT1BarraA")) {
                        manobra = " OM Desenergizar o Bay do MT-1 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMTRBarraA.equals("EnergizarMTRBarraA")) {
                        manobra = " OM Energizar o Bay do MT-R e Barra A ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMTRBarraA.equals("DesenergizarMTRBarraA")) {
                        manobra = " OM Desenergizar o Bay do MT-R e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT2BarraB.equals("EnergizarMT2BarraB")) {
                        manobra = " OM Energizar o Bay do MT-2 e Barra B ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT2BarraB.equals("DesenergizarMT2BarraB")) {
                        manobra = " OM Desenergizar o Bay do MT-2 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT3BarraA.equals("EnergizarMT3BarraA")) {
                        manobra = " OM Energizar o Bay do MT-3 e Barra A ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT3BarraA.equals("DesenergizarMT3BarraA")) {
                        manobra = " OM Desenergizar o Bay do MT-3 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT4BarraB.equals("EnergizarMT4BarraB")) {
                        manobra = " OM Energizar o Bay do MT-4 e Barra B ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT4BarraB.equals("DesenergizarMT4BarraB")) {
                        manobra = " OM Desenergizar o Bay do MT-4 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerAlbras.equals("EnergizarAlbras")) {
                        manobra = " OM para Energizar a SE ALBRAS ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenAlbras.equals("DesenergizarAlbras")) {
                        manobra = " OM para Desenergizar a SE ALBRAS ";
                        lbManobra.setText(manobra);
                    }

                    if (PrepAlbras.equals("PrepAlbras")) {
                        manobra = " OM para Preparar a SE ALBRAS para Normalização";
                        lbManobra.setText(manobra);
                    }

                    if (EnerGerador.equals("EnergizarGerador")) {
                        manobra = " OM para Energizar os Gerador";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed1.equals("DeslProgRed1")) {
                        manobra = " OM para Desligar a Redução 1";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed1.equals("NormalizacaoRed1")) {
                        manobra = " OM para Normalizar a Redução 1";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed2.equals("DeslProgRed2")) {
                        manobra = " OM para Desligar a Redução 2";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed2.equals("NormalizacaoRed2")) {
                        manobra = " OM para Normalizar a Redução 2";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed3.equals("DeslProgRed3")) {
                        manobra = " OM para Desligar a Redução 3";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed3.equals("NormalizacaoRed3")) {
                        manobra = " OM para Normalizar a Redução 3";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed4.equals("DeslProgRed4")) {
                        manobra = " OM para Desligar a Redução 4";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed4.equals("NormalizacaoRed4")) {
                        manobra = " OM para Normalizar a Redução 4";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT1MTR.equals("TransferirMT1MTR")) {
                        manobra = " OM para Transferir do MT-1 para o MT-R";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT1.equals("TransferirMTRMT1")) {
                        manobra = " OM para Transferir do MT-R para o MT-1";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT2MTR.equals("TransferirMT2MTR")) {
                        manobra = " OM para Transferir do MT-2 para o MT-R";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT2.equals("TransferirMTRMT2")) {
                        manobra = " OM para Transferir do MT-R para o MT-2";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT3MTR.equals("TransferirMT3MTR")) {
                        manobra = " OM para Transferir do MT-3 para o MT-R";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT3.equals("TransferirMTRMT3")) {
                        manobra = " OM para Transferir do MT-R para o MT-3";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT4MTR.equals("TransferirMT4MTR")) {
                        manobra = " OM para Transferir do MT-4 para o MT-R";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT4.equals("TransferirMTRMT4")) {
                        manobra = " OM para Transferir do MT-R para o MT-4";
                        lbManobra.setText(manobra);
                    }

                    if (EnergBarraEM.equals("EnergBarraEM")) {
                        manobra = " OM para Energizar a Barra EM pelo Gerador";
                        lbManobra.setText(manobra);
                    }

                    if (DesenBarraEM.equals("DesenBarraEM")) {
                        manobra = " OM para Desenergizar a Barra EM pelo Gerador";
                        lbManobra.setText(manobra);
                    }

                    if (EnergCargas.equals("EnergCargas")) {
                        manobra = " OM para Energizar as Cargas pelo Gerador";
                        lbManobra.setText(manobra);
                    }

                    if (DeslCargas.equals("DeslCargas")) {
                        manobra = " OM para Desenergizar as Cargas pelo Gerador";
                        lbManobra.setText(manobra);
                    }
                }
            });

            Limpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    passo = 0;
                    mostrar1.setText("");
                    mostrar2.setText("");
                    mostrar3.setText("");
                    mostrar4.setText("");
                    mostrar5.setText("");
                    mostrar6.setText("");
                    mostrar7.setText("");
                    mostrar8.setText("");
                    mostrar9.setText("");
                    mostrar10.setText("");
                    mostrar11.setText("");
                    mostrar12.setText("");
                    mostrar13.setText("");
                    mostrar14.setText("");
                    mostrar15.setText("");
                    mostrar16.setText("");
                    mostrar17.setText("");
                    mostrar18.setText("");
                    mostrar19.setText("");
                    mostrar20.setText("");
                    mostrar21.setText("");
                    mostrar22.setText("");
                    mostrar23.setText("");
                    mostrar24.setText("");
                    manobra = "                               MANOBRA:                               ";
                    lbManobra.setText(manobra);
                }
            });

            Sair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    limparMemoria();
                    setVisible(false);
                }
            });
        }// Fim main
    }// Fim Teste

    // ####################################### CLASSE MENU DAS MANOBRAS PADRÕES
    public class ManobraPadrao extends JFrame // implements ActionListener
    {
        String manobra = "";

        public ManobraPadrao() {
            setTitle("Ordem de Manobra  " + "Padrão");
            Container container = getContentPane();
            container.setLayout(new BorderLayout());
            setResizable(false);

            // Box box = Box.createHorizontalBox();

            setSize(455, 450);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);
            // setLocation(440, 285);
            // setVisible(true);

            // final JLabel lbindice;

            final JLabel mostrar1;
            final JLabel mostrar2;
            final JLabel mostrar3;
            final JLabel mostrar4;
            final JLabel mostrar5;
            final JLabel mostrar6;
            final JLabel mostrar7;
            final JLabel mostrar8;
            final JLabel mostrar9;
            final JLabel mostrar10;
            final JLabel mostrar11;
            final JLabel mostrar12;
            final JLabel mostrar13;
            final JLabel mostrar14;
            final JLabel mostrar15;
            final JLabel mostrar16;
            final JLabel mostrar17;
            final JLabel mostrar18;
            final JLabel mostrar19;
            final JLabel mostrar20;
            final JLabel mostrar21;
            final JLabel mostrar22;
            final JLabel mostrar23;
            final JLabel mostrar24;

            JButton Comparar;
            JButton Limpar;
            JButton Sair;
            // JButton Manobra;

            final JLabel lbManobra;

            JPanel painel = new JPanel();

            projeto = new JLabel(" Manobra Padrão!", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 28));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            Comparar = new JButton("Visualizar");
            Comparar.setBackground(new Color(180, 180, 250));
            Comparar.setBounds(100, 370, 95, 30); // Coluna,Linha,Largura,Altura
            getContentPane().add(Comparar);

            Limpar = new JButton("Limpar");
            Limpar.setBackground(new Color(180, 180, 250));
            Limpar.setBounds(200, 370, 95, 30); // Coluna,Linha,Largura,Altura
            getContentPane().add(Limpar);

            Sair = new JButton("Sair");
            Sair.setBackground(new Color(180, 180, 250));
            Sair.setBounds(300, 370, 95, 30); // Coluna,Linha,Largura,Altura
            // Sair.addActionListener(this);
            getContentPane().add(Sair);

            lbManobra = new JLabel("                               MANOBRA:                               ");
            // lbManobra.setEditable(false);
            lbManobra.setFont(new Font("Arial", 1, 16));
            lbManobra.setBackground(new Color(0, 0, 0));// cor de fundo do bot�o
            lbManobra.setForeground(Color.red);
            painel.add(lbManobra);

            mostrar1 = new JLabel();
            mostrar1.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar1);

            mostrar2 = new JLabel();
            mostrar2.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar2);

            mostrar3 = new JLabel();
            mostrar3.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar3);

            mostrar4 = new JLabel();
            mostrar4.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar4);

            mostrar5 = new JLabel();
            mostrar5.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar5);

            mostrar6 = new JLabel();
            mostrar6.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar6);

            mostrar7 = new JLabel();
            mostrar7.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar7);

            mostrar8 = new JLabel();
            mostrar8.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar8);

            mostrar9 = new JLabel();
            mostrar9.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar9);

            mostrar10 = new JLabel();
            mostrar10.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar10);

            mostrar11 = new JLabel();
            mostrar11.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar11);

            mostrar12 = new JLabel();
            mostrar12.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar12);

            mostrar13 = new JLabel();
            mostrar13.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar13);

            mostrar14 = new JLabel();
            mostrar14.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar14);

            mostrar15 = new JLabel();
            mostrar15.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar15);

            mostrar16 = new JLabel();
            mostrar16.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar16);

            mostrar17 = new JLabel();
            mostrar17.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar17);

            mostrar18 = new JLabel();
            mostrar18.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar18);

            mostrar19 = new JLabel();
            mostrar19.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar19);

            mostrar20 = new JLabel();
            mostrar20.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar20);

            mostrar21 = new JLabel();
            mostrar21.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar21);

            mostrar22 = new JLabel();
            mostrar22.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar22);

            mostrar23 = new JLabel();
            mostrar23.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar23);

            mostrar24 = new JLabel();
            mostrar24.setFont(new Font("Dialog", Font.ITALIC, 14));
            painel.add(mostrar24);

            container.add(painel);
            // container.add(new JScrollPane(painel));

            Comparar.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    if (EnerL1.equals("EnergizarLinha1")) {
                        mostrar1.setText("               1. Fechar Seccionadora 89 L1");
                        mostrar2.setText("            2. Fechar Seccionadora 89 L1-A");
                        mostrar4.setText("                              3. Fechar Disjuntor 52 L1");
                    }

                    if (DesenL1.equals("DesenergizarLinha1")) {
                        mostrar5.setText("             1. Abrir Disjuntor 52 L1     ");
                        mostrar6.setText("               2. Abrir Seccionadora 89 L1");
                        mostrar7.setText("                         3. Abrir Seccionadora 89 L1-A");
                    }

                    if (EnerL2.equals("EnergizarLinha2")) {
                        mostrar1.setText("              1. Fechar Seccionadora 89 L2");
                        mostrar2.setText("            2. Fechar Seccionadora 89 L2-B");
                        mostrar4.setText("                         3. Fechar Disjuntor 52 L2");
                    }

                    if (DesenL2.equals("DesenergizarLinha2")) {
                        mostrar5.setText("             1. Abrir Disjuntor 52 L2      ");
                        mostrar6.setText("               2. Abrir Seccionadora 89 L2");
                        mostrar7.setText("                         3. Abrir Seccionadora 89 L2-B");
                    }

                    if (EnerL1BarraA.equals("EnergizarLinha1BarraA")) {
                        mostrar1.setText("            1. Fechar Seccionadora 89 L1");
                        mostrar2.setText("          2. Fechar Seccionadora 89 L1-A");
                        mostrar3.setText("          3. Fechar Seccionadora 89 BT-A");
                        mostrar4.setText("          4. Fechar Seccionadora 89 BT-B");
                        mostrar5.setText("                 5. Fechar Disjuntor 52 BT");
                        mostrar6.setText("                 6. Fechar Disjuntor 52 L1");
                        mostrar7.setText("        7. Fechar Seccionadora 89 MT-1A");
                        mostrar8.setText("          8. Abrir Seccionadora 89 MT-1B");
                        mostrar9.setText("         9. Fechar Seccionadora 89 MT-RA");
                        mostrar10.setText("        10. Abrir seccionadora 89 MT-RB");
                        mostrar11.setText("       11. Fechar Seccionadora 89 MT-3A");
                        mostrar12.setText("             12. Abrir Seccionadora 89 MT-3B");
                    }

                    if (DesenL1BarraA.equals("DesenergizarLinha1BarraA")) {
                        mostrar1.setText("        1. Fechar Seccionadora 89 MT-1B ");
                        mostrar2.setText("          2. Abrir Seccionadora 89 MT-1A");
                        mostrar3.setText("         3. Fechar Seccionadora 89 MT-RB");
                        mostrar4.setText("          4. Abrir Seccionadora 89 MT-RA");
                        mostrar5.setText("         5. Fechar Seccionadora 89 MT-3B");
                        mostrar6.setText("          6. Abrir Seccionadora 89 MT-3A");
                        mostrar7.setText("                  7. Abrir Disjuntor 52 L1");
                        mostrar8.setText("             8. Abrir Seccionadora 89 L1");
                        mostrar9.setText("                9. Abrir Disjuntor 52 BT");
                        mostrar10.setText("         10. Abrir Seccionadora 89 BT-A");
                        mostrar11.setText("         11. Abrir Seccionadora 89 BT-B");
                        mostrar12.setText("                 12. Abrir Seccionadora 89 L1-A");
                    }

                    if (EnerL2IntBarra.equals("EnergizarLinha2IntBarra")) {
                        mostrar1.setText("         1. Fechar Seccionadora 89 L2 ");
                        mostrar2.setText("         2. Fechar Seccionadora 89 L2-B");
                        mostrar3.setText("         3. Fechar Seccionadora 89 BT-A");
                        mostrar4.setText("         4. Fechar Seccionadora 89 BT-B");
                        mostrar5.setText("                 5. Fechar Disjuntor 52 BT");
                        mostrar6.setText("                 6. Fechar Disjuntor 52 L2");
                        mostrar7.setText("        7. Fechar Seccionadora 89 MT-2B");
                        mostrar8.setText("         8. Abrir Seccionadora 89 MT-2A");
                        mostrar9.setText("        9. Fechar Seccionadora 89 MT-4B");
                        mostrar10.setText("       10. Abrir seccionadora 89 MT-4A");
                    }

                    if (DesenL2IntBarra.equals("DesenergizarLinha2IntBarra")) {
                        mostrar1.setText("       1. Fechar Seccionadora 89 MT-2A ");
                        mostrar2.setText("         2. Abrir Seccionadora 89 MT-2B");
                        mostrar3.setText("        3. Fechar Seccionadora 89 MT-4A");
                        mostrar4.setText("         4. Abrir Seccionadora 89 MT-4B");
                        mostrar5.setText("               5. Abrir Disjuntor 52 L2");
                        mostrar6.setText("               6. Abrir Seccionadora 89 L2");
                        mostrar7.setText("                  7. Abrir Disjuntor 52 BT");
                        mostrar8.setText("            8. Abrir Seccionadora 89 BT-A");
                        mostrar9.setText("            9. Abrir Seccionadora 89 BT-B");
                        mostrar10.setText("                    10. Abrir Seccionadora 89 L2-B");
                    }

                    if (EnerMT1BarraA.equals("EnergizarMT1BarraA")) {
                        mostrar1.setText("        1. Fechar Seccionadora 89 BT-A");
                        mostrar2.setText("        2. Fechar Seccionadora 89 BT-B");
                        mostrar3.setText("            3. Fechar Disjuntor 52 BT");
                        mostrar4.setText("      4. Fechar Seccionadora 89 L1-A ");
                        mostrar5.setText("         5. Abrir Seccionadora 89 L1-B");
                        mostrar6.setText("       6. Fechar Seccionadora 89 MT-RA");
                        mostrar7.setText("        7. Abrir seccionadora 89 MT-RB");
                        mostrar8.setText("       8. Fechar Seccionadora 89 MT-3A");
                        mostrar9.setText("        9. Abrir Seccionadora 89 MT-3B");
                        mostrar10.setText("    10. Fechar Seccionadora 89 MT-1A");
                        mostrar11.setText("                   11. Abrir Disjuntor 52 MT-1");
                    }

                    if (DesenMT1BarraA.equals("DesenergizarMT1BarraA")) {
                        mostrar1.setText("            1. Abrir Disjuntor 52 MT-1");
                        mostrar2.setText("        2. Abrir Seccionadora 89 MT-1A");
                        mostrar3.setText("        3. Fechar Seccionadora 89 L1-B");
                        mostrar4.setText("         4. Abrir Seccionadora 89 L1-A");
                        mostrar5.setText("       5. Fechar Seccionadora 89 MT-RB");
                        mostrar6.setText("        6. Abrir Seccionadora 89 MT-RA");
                        mostrar7.setText("       7. Fechar Seccionadora 89 MT-3B");
                        mostrar8.setText("        8. Abrir Seccionadora 89 MT-3A");
                        mostrar9.setText("                9. Abrir Disjuntor 52 BT");
                        mostrar10.setText("       10. Abrir Seccionadora 89 BT-A");
                        mostrar11.setText("                  11. Abrir Seccionadora 89 BT-B");
                    }

                    if (EnerMTRBarraA.equals("EnergizarMTRBarraA")) {
                        mostrar1.setText("         1. Fechar Seccionadora 89 BT-A");
                        mostrar2.setText("         2. Fechar Seccionadora 89 BT-B");
                        mostrar3.setText("               3. Fechar Disjuntor 52 BT");
                        mostrar4.setText("         4. Fechar Seccionadora 89 L1-A");
                        mostrar5.setText("          5. Abrir Seccionadora 89 L1-B");
                        mostrar6.setText("        6. Fechar Seccionadora 89 MT-1A");
                        mostrar7.setText("           7. Abrir seccionadora 89 MT-1B");
                        mostrar8.setText("          8. Fechar Seccionadora 89 MT-3A");
                        mostrar9.setText("         9. Abrir Seccionadora 89 MT-3B");
                        mostrar10.setText("      10. Fechar Seccionadora 89 MT-RA");
                        mostrar11.setText("                   11. Abrir Disjuntor 52 MT-R");
                    }

                    if (DesenMTRBarraA.equals("DesenergizarMTRBarraA")) {
                        mostrar1.setText("            1. Abrir Disjuntor 52 MT-R");
                        mostrar2.setText("        2. Abrir Seccionadora 89 MT-RA");
                        mostrar3.setText("        3. Fechar Seccionadora 89 L1-B");
                        mostrar4.setText("         4. Abrir Seccionadora 89 L1-A");
                        mostrar5.setText("       5. Fechar Seccionadora 89 MT-1B");
                        mostrar6.setText("        6. Abrir Seccionadora 89 MT-1A");
                        mostrar7.setText("       7. Fechar Seccionadora 89 MT-3B");
                        mostrar8.setText("            8. Abrir Seccionadora 89 MT-3A");
                        mostrar9.setText("                  9. Abrir Disjuntor 52 BT");
                        mostrar10.setText("           10. Abrir Seccionadora 89 BT-A");
                        mostrar11.setText("                     11. Abrir Seccionadora 89 BT-B");
                    }

                    if (EnerMT2BarraB.equals("EnergizarMT2BarraB")) {
                        mostrar1.setText("        1. Fechar Seccionadora 89 BT-A");
                        mostrar2.setText("        2. Fechar Seccionadora 89 BT-B");
                        mostrar3.setText("               3. Fechar Disjuntor 52 BT");
                        mostrar4.setText("        4. Fechar Seccionadora 89 L2-B");
                        mostrar5.setText("         5. Abrir Seccionadora 89 L2-A");
                        mostrar6.setText("       6. Fechar Seccionadora 89 MT-4B");
                        mostrar7.setText("        7. Abrir seccionadora 89 MT-4A");
                        mostrar10.setText("      8. Fechar Seccionadora 89 MT-2B");
                        mostrar11.setText("                     9. Abrir Disjuntor 52 MT-2");
                    }

                    if (DesenMT2BarraB.equals("DesenergizarMT2BarraB")) {
                        mostrar1.setText("            1. Abrir Disjuntor 52 MT-2");
                        mostrar2.setText("        2. Abrir Seccionadora 89 MT-2B");
                        mostrar3.setText("       3. Fechar Seccionadora 89 L2-A ");
                        mostrar4.setText("        4. Abrir Seccionadora 89 L2-B ");
                        mostrar5.setText("       5. Fechar Seccionadora 89 MT-4A");
                        mostrar6.setText("        6. Abrir Seccionadora 89 MT-4B");
                        mostrar9.setText("         7. Abrir Seccionadora 89 BT-A");
                        mostrar10.setText("        8. Abrir Seccionadora 89 BT-B");
                        mostrar11.setText("                      9 . Abrir Disjuntor 52 BT");
                    }

                    if (EnerMT3BarraA.equals("EnergizarMT3BarraA")) {
                        mostrar1.setText("        1. Fechar Seccionadora 89 BT-A");
                        mostrar2.setText("        2. Fechar Seccionadora 89 BT-B");
                        mostrar3.setText("             3. Fechar Disjuntor 52 BT");
                        mostrar4.setText("        4. Fechar Seccionadora 89 L1-A");
                        mostrar5.setText("         5. Abrir Seccionadora 89 L1-B");
                        mostrar6.setText("       6. Fechar Seccionadora 89 MT-1A");
                        mostrar7.setText("        7. Abrir seccionadora 89 MT-1B");
                        mostrar8.setText("       8. Fechar Seccionadora 89 MT-RA");
                        mostrar9.setText("        9. Abrir Seccionadora 89 MT-RB");
                        mostrar10.setText("     10. Fechar Seccionadora 89 MT-3A");
                        mostrar11.setText("                   11. Fechar Disjuntor 52 MT-3");
                    }

                    if (DesenMT3BarraA.equals("DesenergizarMT3BarraA")) {
                        mostrar1.setText("            1. Abrir Disjuntor 52 MT-3");
                        mostrar2.setText("        2. Abrir Seccionadora 89 MT-3A");
                        mostrar3.setText("        3. Fechar Seccionadora 89 L1-B");
                        mostrar4.setText("         4. Abrir Seccionadora 89 L1-A");
                        mostrar5.setText("       5. Fechar Seccionadora 89 MT-1B");
                        mostrar6.setText("        6. Abrir Seccionadora 89 MT-1A");
                        mostrar7.setText("       7. Fechar Seccionadora 89 MT-RB");
                        mostrar8.setText("        8. Abrir Seccionadora 89 MT-RA");
                        mostrar9.setText("         9. Abrir Seccionadora 89 BT-A");
                        mostrar10.setText("       10. Abrir Seccionadora 89 BT-B");
                        mostrar11.setText("                     11. Abrir Disjuntor 52 BT");
                    }

                    if (EnerMT4BarraB.equals("EnergizarMT4BarraB")) {
                        mostrar1.setText("        1. Fechar Seccionadora 89 BT-A");
                        mostrar2.setText("        2. Fechar Seccionadora 89 BT-B");
                        mostrar3.setText("             3. Fechar Disjuntor 52 BT");
                        mostrar4.setText("        4. Fechar Seccionadora 89 L2-B");
                        mostrar5.setText("         5. Abrir Seccionadora 89 L2-A");
                        mostrar6.setText("       6. Fechar Seccionadora 89 MT-2B");
                        mostrar7.setText("        7. Abrir seccionadora 89 MT-2A");
                        mostrar10.setText("     8. Fechar Seccionadora 89 MT-4B");
                        mostrar11.setText("                     9. Abrir Disjuntor 52 MT-4");
                    }

                    if (DesenMT4BarraB.equals("DesenergizarMT4BarraB")) {
                        mostrar1.setText("            1. Abrir Disjuntor 52 MT-4");
                        mostrar2.setText("        2. Abrir Seccionadora 89 MT-4B");
                        mostrar3.setText("        3. Fechar Seccionadora 89 L2-A");
                        mostrar4.setText("         4. Abrir Seccionadora 89 L2-B");
                        mostrar5.setText("       5. Fechar Seccionadora 89 MT-2A");
                        mostrar6.setText("        6. Abrir Seccionadora 89 MT-2B");
                        mostrar9.setText("         7. Abrir Seccionadora 89 BT-A");
                        mostrar10.setText("        8. Abrir Seccionadora 89 BT-B");
                        mostrar11.setText("                       9. Abrir Disjuntor 52 BT");
                    }

                    if (EnerAlbras.equals("EnergizarAlbras")) {
                        mostrar1.setText("         1. Fechar Disjuntor 52 L1");
                        mostrar2.setText("         2. Fechar Disjuntor 52 L2");
                        mostrar3.setText("         3. Fechar Disjuntor 52 BT");
                        mostrar4.setText("         4. Fechar Disjuntor 52 AL");
                        mostrar5.setText("       5. Fechar Disjuntor 52 MT-1");
                        mostrar6.setText("       6. Fechar Disjuntor 52 MT-R");
                        mostrar7.setText("       7. Fechar Disjuntor 52 MT-2");
                        mostrar8.setText("       8. Fechar Disjuntor 52 MT-3");
                        mostrar9.setText("       9. Fechar Disjuntor 52 MT-4");
                        mostrar10.setText("       10. Fechar disjuntor 52 A1");
                        mostrar11.setText("       11. Fechar disjuntor 52 A2");
                        mostrar12.setText("       12. Fechar disjuntor 52 A3");
                        mostrar13.setText("       13. Fechar disjuntor 52 A4");
                        mostrar14.setText("       14. Fechar disjuntor 52 A5");
                        mostrar15.setText("       15. Fechar disjuntor 52 A6");
                        mostrar16.setText("       16. Fechar disjuntor 52 A7");
                        mostrar17.setText("       17. Fechar disjuntor 52 A8");
                        mostrar18.setText("       18. Fechar disjuntor 52 P1");
                        mostrar19.setText("       19. Fechar disjuntor 52 P2");
                        mostrar20.setText("       20. Fechar disjuntor 52 P3");
                        mostrar21.setText("       21. Fechar disjuntor 52 P4");
                        mostrar22.setText("       22. Fechar disjuntor 52 P5");
                        mostrar23.setText("       23. Fechar disjuntor 52 P6");
                    }

                    if (DesenAlbras.equals("DesenergizarAlbras")) {
                        mostrar1.setText("         1. Abrir Disjuntor 52 L1");
                        mostrar2.setText("         2. Abrir Disjuntor 52 L2");
                        mostrar3.setText("         3. Abrir Disjuntor 52 BT");
                        mostrar4.setText("         4. Abrir Disjuntor 52 AL");
                        mostrar5.setText("       5. Abrir Disjuntor 52 MT-1");
                        mostrar6.setText("       6. Abrir Disjuntor 52 MT-R");
                        mostrar7.setText("       7. Abrir Disjuntor 52 MT-2");
                        mostrar8.setText("       8. Abrir Disjuntor 52 MT-3");
                        mostrar9.setText("       9. Abrir Disjuntor 52 MT-4");
                        mostrar10.setText("       10. Abrir disjuntor 52 A1");
                        mostrar11.setText("       11. Abrir disjuntor 52 A2");
                        mostrar12.setText("       12. Abrir disjuntor 52 A3");
                        mostrar13.setText("       13. Abrir disjuntor 52 A4");
                        mostrar14.setText("       14. Abrir disjuntor 52 A5");
                        mostrar15.setText("       15. Abrir disjuntor 52 A6");
                        mostrar16.setText("       16. Abrir disjuntor 52 A7");
                        mostrar17.setText("       17. Abrir disjuntor 52 A8");
                        mostrar18.setText("       18. Abrir disjuntor 52 P1");
                        mostrar19.setText("       19. Abrir disjuntor 52 P2");
                        mostrar20.setText("       20. Abrir disjuntor 52 P3");
                        mostrar21.setText("       21. Abrir disjuntor 52 P4");
                        mostrar22.setText("       22. Abrir disjuntor 52 P5");
                        mostrar23.setText("       23. Abrir disjuntor 52 P6");
                    }

                    if (PrepAlbras.equals("PrepAlbras")) {
                        mostrar1.setText("    1. Abrir Seccionadora 89 A2-E");
                        mostrar2.setText("    2. Abrir Seccionadora 89 A4-E");
                        mostrar3.setText("    3. Abrir Seccionadora 89 A6-E");
                        mostrar4.setText("    4. Abrir Seccionadora 89 A8-E");
                        mostrar5.setText("   5.Abrir Seccionadora 89 LVRR-E");
                        mostrar6.setText("   6. Abrir Seccionadora 89 LVR-R");
                        mostrar7.setText("      7. Abrir Seccionadora 89 P1");
                        mostrar8.setText("      8. Abrir Seccionadora 89 P2");
                        mostrar9.setText("      9. Abrir Seccionadora 89 P3");
                        mostrar10.setText("    10. Abrir Seccionadora 89 P4");
                        mostrar11.setText("    11. Abrir Seccionadora 89 P5");
                        mostrar12.setText("    12. Abrir Seccionadora 89 P6");
                        mostrar13.setText("  13.Fechar Seccionadora 89 A2-E");
                        mostrar14.setText("  14.Fechar Seccionadora 89 A4-E");
                        mostrar15.setText("  15.Fechar Seccionadora 89 A6-E");
                        mostrar16.setText("  16.Fechar Seccionadora 89 A8-E");
                        mostrar17.setText("  17.Fechar Seccionadora 89 P1-E");
                        mostrar18.setText("  18.Fechar Seccionadora 89 P2-E");
                        mostrar19.setText("  19.Fechar Seccionadora 89 P3-E");
                        mostrar20.setText("  20.Fechar Seccionadora 89 P4-E");
                        mostrar21.setText("  21.Fechar Seccionadora 89 P5-E");
                        mostrar22.setText("  22.Fechar Seccionadora 89 P6-E");
                        mostrar23.setText("  23.Fechar Seccionadora 89 TU-E");
                        mostrar24.setText("           24. Fechar Disjuntor 52 TU");
                    }

                    if (EnerGerador.equals("EnergizarGerador")) {
                        mostrar1.setText("              1. Fechar Disjuntor 52 G1");
                        mostrar2.setText("                        2. Fechar Disjuntor 52 G2");
                    }

                    if (DeslProgRed1.equals("DeslProgRed1")) {
                        mostrar1.setText("                   1. Desligar Disjuntor 52 C1");
                        mostrar2.setText("                   2. Desligar DisJuntor 52 C2");
                        mostrar3.setText("               3. Desligar Disjuntor 52 LVR1-A");
                        mostrar4.setText("                 4. Desligar Disjuntor 52 LVR1");
                    }

                    if (NormRed1.equals("NormalizacaoRed1")) {
                        mostrar1.setText("                   1. Ligar Disjuntor 52 LVR-1");
                        mostrar2.setText("                  2. Ligar Disjuntor 52 LVR-1A");
                        mostrar3.setText("                      3. Ligar Disjuntor 52 C1");
                        mostrar4.setText("                      4. Ligar Disjuntor 52 C2");
                    }

                    if (DeslProgRed2.equals("DeslProgRed2")) {
                        mostrar1.setText("                    1. Desligar Disjuntor 52 C3");
                        mostrar2.setText("                    2. Desligar Disjuntor 52 C4");
                        mostrar3.setText("                3. Desligar Disjuntor 52 LVR2-A");
                        mostrar4.setText("                  4. Desligar Disjuntor 52 LVR2");
                    }

                    if (NormRed2.equals("NormalizacaoRed2")) {
                        mostrar1.setText("                    1. Ligar Disjuntor 52 LVR-2");
                        mostrar2.setText("                   2. Ligar Disjuntor 52 LVR-2A");
                        mostrar3.setText("                       3. Ligar Disjuntor 52 C3");
                        mostrar4.setText("                       4. Ligar Disjuntor 52 C4");
                    }

                    if (DeslProgRed3.equals("DeslProgRed3")) {
                        mostrar1.setText("                   1. Desligar Disjuntor 52 C5");
                        mostrar2.setText("                   2. Desligar Disjuntor 52 C6");
                        mostrar3.setText("               3. Desligar Disjuntor 52 LVR3-A");
                        mostrar4.setText("                            4. Desligar Disjuntor 52 LVR3");
                    }

                    if (NormRed3.equals("NormalizacaoRed3")) {
                        mostrar1.setText("                    1. Ligar Disjuntor 52 LVR-3");
                        mostrar2.setText("                   2. Ligar Disjuntor 52 LVR-3A");
                        mostrar3.setText("                       3. Ligar Disjuntor 52 C5");
                        mostrar4.setText("                                4. Ligar Disjuntor 52 C6");
                    }

                    if (DeslProgRed4.equals("DeslProgRed4")) {
                        mostrar1.setText("                   1. Desligar Disjuntor 52 C7");
                        mostrar2.setText("                   2. Desligar Disjuntor 52 C8");
                        mostrar3.setText("               3. Desligar Disjuntor 52 LVR4-A");
                        mostrar4.setText("                            4. Desligar Disjuntor 52 LVR4");
                    }

                    if (NormRed4.equals("NormalizacaoRed4")) {
                        mostrar1.setText("                    1. Ligar Disjuntor 52 LVR-4");
                        mostrar2.setText("                   2. Ligar Disjuntor 52 LVR-4A");
                        mostrar3.setText("                       3. Ligar Disjuntor 52 C7");
                        mostrar4.setText("                                 4. Ligar Disjuntor 52 C8");
                    }

                    if (TransfMT1MTR.equals("TransferirMT1MTR")) {
                        mostrar1.setText("     1. Desligar Disjuntor 52 P2 ");
                        mostrar2.setText("     2. Abrir Seccionadora 89 P2 ");
                        mostrar3.setText("  3. Fechar Seccionadora 89 P2-E ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C1 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C2 ");
                        mostrar6.setText("       6. Abrir Disjuntor 52 R-1 ");
                        mostrar7.setText("    7. Abrir Seccionadora 89 R-1 ");
                        mostrar8.setText("  8. Fechar Seccionadora 89 R-1E ");
                        mostrar9.setText("      9. Fechar Disjuntor 52 R-1 ");
                        mostrar10.setText("     10. Abrir Disjuntor 52 R-2 ");
                        mostrar11.setText("  11. Abrir Seccionadora 89 R-2 ");
                        mostrar12.setText("12. Fechar Seccionadora 89 R-2E ");
                        mostrar13.setText("    13. Fechar Disjuntor 52 R-2 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P2 ");
                        mostrar15.setText("      15. Abrir Disjuntor 52 P1 ");
                        mostrar16.setText("   16. Abrir Seccionadora 89 C1 ");
                        mostrar17.setText("17. Fechar Seccionadora 89 C1-E ");
                        mostrar18.setText("   18. Abrir Seccionadora 89 C2 ");
                        mostrar19.setText(" 19. Fechar Seccionadora 89 C2E ");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C1 ");
                        mostrar21.setText("     21. Fechar Disjuntor 52 C2 ");
                        mostrar22.setText("   22. Abrir Seccionadora 89 P1 ");
                        mostrar23.setText("23. Fechar Seccionadora 89 P1-E ");
                        mostrar24.setText("     24. Fechar Disjuntor 52 P1 ");
                    }

                    if (TransfMTRMT1.equals("TransferirMTRMT1")) {
                        mostrar1.setText("      1.Desligar Disjuntor 52 P2 ");
                        mostrar2.setText("   2. Abrir Seccionadora 89 P2-E ");
                        mostrar3.setText("    3. Fechar Seccionadora 89 P2 ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C1 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C2 ");
                        mostrar6.setText("       6. Abrir disjuntor 52 R-1 ");
                        mostrar7.setText("    7. Abrir Seccionadora89 R-1E ");
                        mostrar8.setText("  8. Fechar Secccionadora 89 R-1 ");
                        mostrar9.setText("      9. Fechar Disjuntor 52 R-1 ");
                        mostrar10.setText("     10. Abrir Disjuntor 52 R-2 ");
                        mostrar11.setText(" 11. Abrir Seccionadora 89 R-2E ");
                        mostrar12.setText(" 12. Fechar Seccionadora 89 R-2 ");
                        mostrar13.setText("    13. Fechar Disjuntor 52 R-2 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P2 ");
                        mostrar15.setText("     15. Abrir Disjuntor  52 P1 ");
                        mostrar16.setText(" 16. Abrir Seccionadora 89 C1-E ");
                        mostrar17.setText("  17. Fechar Seccionadora 89 C1 ");
                        mostrar18.setText(" 18. Abrir Seccionadora 89 C2-E ");
                        mostrar19.setText("   19. Fechar Seccionadora 89 C2");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C1 ");
                        mostrar21.setText("     21. Fechar Disjuntor 52 C2 ");
                        mostrar22.setText(" 22. Abrir Seccionadora 89 P1-E ");
                        mostrar23.setText("  23. Fechar Seccionadora 89 P1 ");
                        mostrar24.setText("     24. Fechar Disjuntor 52 P1 ");
                    }

                    if (TransfMT2MTR.equals("TransferirMT2MTR")) {
                        mostrar1.setText("        1. Abrir Disjuntor 52 C3 ");
                        mostrar2.setText("        2. Abrir Disjuntor 52 C4 ");
                        mostrar3.setText("       3. Abrir Disjuntor 52 R-8 ");
                        mostrar4.setText("   4. abrir Seccionadora  89 R-8 ");
                        mostrar5.setText("  5. Fechar Seccionadora 89 R-8E ");
                        mostrar6.setText("      6. Fechar Disjuntor 52 R-8 ");
                        mostrar7.setText("       7. Abrir Disjuntor 52 R-9 ");
                        mostrar8.setText("    8. Abrir Seccionadora 89 R-9 ");
                        mostrar9.setText("  9.Fechar Seccionadora 89 R-9E: ");
                        mostrar10.setText("    10. Fechar disjuntor 52 R-9 ");
                        mostrar11.setText("      11. Abrir Disjuntor 52 P3 ");
                        mostrar12.setText("   12. Abrir Seccionadora 89 C3 ");
                        mostrar13.setText("13. Fechar Seccionadora 89 C3-E ");
                        mostrar14.setText("   14. Abrir Seccionadora 89 C4 ");
                        mostrar15.setText("15. Fechar Seccionadora  89 C4-E");
                        mostrar16.setText("     16. Fechar Disjuntor 52 C3 ");
                        mostrar17.setText("     17. Fechar Disjuntor 52 C4 ");
                        mostrar18.setText("   18. Abrir Seccionadora 89 P3 ");
                        mostrar19.setText("19. Fechar Seccionadora 89 P3-E ");
                        mostrar20.setText("     20. Fechar Disjuntor 52 P3 ");
                    }

                    if (TransfMTRMT2.equals("TransferirMTRMT2")) {
                        mostrar1.setText("        1. Abrir Disjuntor 52 P3 ");
                        mostrar2.setText("   2. Abrir Seccionadora 89 P3-E ");
                        mostrar3.setText("    3. Fechar Seccionadora 89 P3 ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C3 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C4 ");
                        mostrar6.setText("       6. Abrir disjuntor 52 R-8 ");
                        mostrar7.setText("   7. Abrir Seccionadora 89 R-8E ");
                        mostrar8.setText("   8. Fechar Seccionadora 89 R-8 ");
                        mostrar9.setText("      9. Fechar Disjuntor 52 R-8 ");
                        mostrar10.setText("      10 Abrir Disjuntor 52 R-9 ");
                        mostrar11.setText(" 11. Abrir Seccionadora 89 R-9E ");
                        mostrar12.setText(" 12. Fechar Seccionaodra 89 R-9 ");
                        mostrar13.setText("    13. Fechar Disjuntor 52 R-9 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P3 ");
                        mostrar15.setText(" 15. Abrir Seccionadora 89 C3-E ");
                        mostrar16.setText("  16. Fechar Seccionadora 89 C3 ");
                        mostrar17.setText(" 17. Abrir Seccionadora 89 C4-E ");
                        mostrar18.setText("  18. Fechar Seccionadora 89 C4 ");
                        mostrar19.setText("     19. Fechar disjuntor 52 C3 ");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C4 ");
                    }

                    if (TransfMT3MTR.equals("TransferirMT3MTR")) {
                        mostrar1.setText("        1. Abrir Disjuntor 52 P5 ");
                        mostrar2.setText("     2. Abrir Seccionadora 89 P5 ");
                        mostrar3.setText("  3. Fechar Seccionadora 89 P5-E ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C5 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C6 ");
                        mostrar6.setText("      6. Abrir Disjuntor 52 R-14 ");
                        mostrar7.setText("   7. Abrir Seccionadora 89 R-14 ");
                        mostrar8.setText(" 8. Fechar Seccionadora 89 R-14E ");
                        mostrar9.setText("     9. Fechar Disjuntor 52 R-14 ");
                        mostrar10.setText("    10. Abrir Disjuntor 52 R-15 ");
                        mostrar11.setText(" 11. Abrir Seccionadora 89 R-15 ");
                        mostrar12.setText("12.Fechar Seccionadora 89 R-15E ");
                        mostrar13.setText("   13. Fechar Disjuntor 52 R-15 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P5 ");
                        mostrar15.setText("      15. Abrir disjuntor 52 P4 ");
                        mostrar16.setText("   16. Abrir Seccionadora 89 C5 ");
                        mostrar17.setText("17. Fechar Seccionadora 89 C5-E ");
                        mostrar18.setText("   18. Abrir Seccionadora 89 C6 ");
                        mostrar19.setText(" 19. Fechar Seccionadora 89 C6-E");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C5 ");
                        mostrar21.setText("     21. Fechar Disjuntor 52 C6 ");
                        mostrar22.setText("   22. Abrir Seccionadora 89 P4 ");
                        mostrar23.setText("23. Fechar Seccionadora 89 P4-E ");
                        mostrar24.setText("     24. Fechar Disjuntor 52 P4 ");
                    }

                    if (TransfMTRMT3.equals("TransferirMTRMT3")) {
                        mostrar1.setText("        1. Abrir Disjuntor 52 P5 ");
                        mostrar2.setText("   2. Abrir Seccionadora 89 P5-E ");
                        mostrar3.setText("    3. Fechar Seccionadora 89 P5 ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C5 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C6 ");
                        mostrar6.setText("      6. Abrir Disjuntor 52 R-14 ");
                        mostrar7.setText("  7. Abrir Seccionadora 89 R-14E ");
                        mostrar8.setText("  8. Fechar Seccionadora 89 R-14 ");
                        mostrar9.setText("     9. Fechar Disjuntor 52 R-14 ");
                        mostrar10.setText("    10. Abrir Disjuntor 52 R-15 ");
                        mostrar11.setText("11. Abrir Seccionadora 89 R-15E ");
                        mostrar12.setText("12. Fechar Seccionadora 89 R-15 ");
                        mostrar13.setText("   13. Fechar Disjuntor 52 R-15 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P5 ");
                        mostrar15.setText("      15. Abrir Disjuntor 52 P4 ");
                        mostrar16.setText(" 16. Abrir Seccionadora 89 C5-E ");
                        mostrar17.setText("  17. Fechar Seccionadora 89 C5 ");
                        mostrar18.setText(" 18. Abrir Seccionadora 89 C6-E ");
                        mostrar19.setText("   19. Fechar Seccionadora 89 C6");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C5 ");
                        mostrar21.setText("     21. Fechar Disjuntor 52 C6 ");
                        mostrar22.setText(" 22. Abrir Seccionadora 89 P4-E ");
                        mostrar23.setText("  23. Fechar Seccionadora 89 P4 ");
                        mostrar24.setText("     24. Fechar Disjuntor 52 P4 ");
                    }

                    if (TransfMT4MTR.equals("TransferirMT4MTR")) {
                        mostrar1.setText("        1. Abrir Disjuntor 52 C7 ");
                        mostrar2.setText("        2. Abrir Disjuntor 52 C8 ");
                        mostrar3.setText("      3. Abrir Disjuntor 52 R-20 ");
                        mostrar4.setText("  4. abrir Seccionadora  89 R-20 ");
                        mostrar5.setText(" 5. Fechar Seccionadora 89 R-20E ");
                        mostrar6.setText("     6. Fechar Disjuntor 52 R-20 ");
                        mostrar7.setText("      7. Abrir Disjuntor 52 R-21 ");
                        mostrar8.setText("   8. Abrir Seccionadora 89 R-21 ");
                        mostrar9.setText(" 9.Fechar Seccionadora 89 R-21E: ");
                        mostrar10.setText("   10. Fechar disjuntor 52 R-21 ");
                        mostrar11.setText("      11. Abrir Disjuntor 52 P6 ");
                        mostrar12.setText("   12. Abrir Seccionadora 89 C7 ");
                        mostrar13.setText("13. Fechar Seccionadora 89 C7-E ");
                        mostrar14.setText("   14. Abrir Seccionadora 89 C8 ");
                        mostrar15.setText("15. Fechar Seccionadora  89 C8-E");
                        mostrar16.setText("     16. Fechar Disjuntor 52 C7 ");
                        mostrar17.setText("     17. Fechar Disjuntor 52 C8 ");
                        mostrar18.setText("   18. Abrir Seccionadora 89 P6 ");
                        mostrar19.setText("19. Fechar Seccionadora 89 P6-E ");
                        mostrar20.setText("     20. Fechar Disjuntor 52 P6 ");
                    }

                    if (TransfMTRMT4.equals("TransferirMTRMT4")) {
                        mostrar1.setText("        1. Abrir Disjuntor 52 P6 ");
                        mostrar2.setText("   2. Abrir Seccionadora 89 P6-E ");
                        mostrar3.setText("    3. Fechar Seccionadora 89 P6 ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C7 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C8 ");
                        mostrar6.setText("      6. Abrir disjuntor 52 R-20 ");
                        mostrar7.setText("  7. Abrir Seccionadora 89 R-20E ");
                        mostrar8.setText("  8. Fechar Seccionadora 89 R-20 ");
                        mostrar9.setText("     9. Fechar Disjuntor 52 R-20 ");
                        mostrar10.setText("     10 Abrir Disjuntor 52 R-21 ");
                        mostrar11.setText("11. Abrir Seccionadora 89 R-21E ");
                        mostrar12.setText("12. Fechar Seccionaodra 89 R-21 ");
                        mostrar13.setText("   13. Fechar Disjuntor 52 R-21 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P6 ");
                        mostrar15.setText(" 15. Abrir Seccionadora 89 C7-E ");
                        mostrar16.setText("  16. Fechar Seccionadora 89 C7 ");
                        mostrar17.setText(" 17. Abrir Seccionadora 89 C8-E ");
                        mostrar18.setText("  18. Fechar Seccionadora 89 C8 ");
                        mostrar19.setText("     19. Fechar disjuntor 52 C7 ");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C8 ");
                    }

                    if (EnergBarraEM.equals("EnergBarraEM")) {
                        mostrar1.setText("                      1. Ligar Disjuntor 52 G1");
                        mostrar2.setText("                      2. Ligar Disjuntor 52 G2");
                        mostrar3.setText("                3. Fechar Seccionadora 89 TU-E");
                        mostrar4.setText("                           4. Ligar Disjuntor 52 TU");
                    }

                    if (DesenBarraEM.equals("DesenBarraEM")) {
                        mostrar1.setText("                   1. Desligar Disjuntor 52 TU ");
                        mostrar2.setText("                 2. Abrir Seccionadora 89 TU-E ");
                        mostrar3.setText("                    3. Desligar Disjuntor 52 G1");
                        mostrar4.setText("                         4. Desligar Disjuntor 52 G2");
                    }

                    if (EnergCargas.equals("EnergCargas")) {
                        mostrar1.setText("                    1. Fechar Disjuntor 52 A1");
                        mostrar2.setText("                    2. Fechar Disjuntor 52 A3");
                        mostrar3.setText("                    3. Fechar Disjuntor 52 A5");
                        mostrar4.setText("                    4. Fechar Disjuntor 52 A7");
                        mostrar5.setText("                    5. Fechar Disjuntor 52 P1");
                        mostrar6.setText("                    6. Fechar Disjuntor 52 P2");
                        mostrar7.setText("                    7. Fechar Disjuntor 52 P3");
                        mostrar8.setText("                    8. Fechar Disjuntor 52 P4");
                        mostrar9.setText("                    9. Fechar Disjuntor 52 P5");
                        mostrar10.setText("                  10. Fechar Disjuntor 52 P6");
                    }

                    if (DeslCargas.equals("DeslCargas")) {
                        mostrar1.setText("                    1. Abrir Disjuntor 52 A1");
                        mostrar2.setText("                    2. Abrir Disjuntor 52 A3");
                        mostrar3.setText("                    3. Abrir Disjuntor 52 A5");
                        mostrar4.setText("                    4. Abrir Disjuntor 52 A7");
                        mostrar5.setText("                    5. Abrir Disjuntor 52 P1");
                        mostrar6.setText("                    6. Abrir Disjuntor 52 P2");
                        mostrar7.setText("                    7. Abrir Disjuntor 52 P3");
                        mostrar8.setText("                    8. Abrir Disjuntor 52 P4");
                        mostrar9.setText("                    9. Abrir Disjuntor 52 P5");
                        mostrar10.setText("                  10. Abrir Disjuntor 52 P6");
                    }

                    if (EnerL1.equals("EnergizarLinha1")) {
                        manobra = "         OM Energizar o Bay da Linha 1    ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL1.equals("DesenergizarLinha1")) {
                        manobra = " OM Desenergizar o Bay da Linha 1 ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerL2.equals("EnergizarLinha2")) {
                        manobra = "         OM Energizar o Bay da Linha 2    ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL2.equals("DesenergizarLinha2")) {
                        manobra = " OM Desenergizar o Bay da Linha 2 ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerL1BarraA.equals("EnergizarLinha1BarraA")) {
                        manobra = " OM Energizar o Bay da Linha 1 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL1BarraA.equals("DesenergizarLinha1BarraA")) {
                        manobra = " OM Desenergizar o Bay da Linha 1 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerL2IntBarra.equals("EnergizarLinha2IntBarra")) {
                        manobra = " OM Energizar o Bay da Linha 2 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenL2IntBarra.equals("DesenergizarLinha2IntBarra")) {
                        manobra = " OM Desenergizar o Bay da Linha 2 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT1BarraA.equals("EnergizarMT1BarraA")) {
                        manobra = " OM Energizar o Bay do MT-1 e Barra A ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT1BarraA.equals("DesenergizarMT1BarraA")) {
                        manobra = " OM Desenergizar o Bay do MT-1 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMTRBarraA.equals("EnergizarMTRBarraA")) {
                        manobra = " OM Energizar o Bay do MT-R e Barra A ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMTRBarraA.equals("DesenergizarMTRBarraA")) {
                        manobra = " OM Desenergizar o Bay do MT-R e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT2BarraB.equals("EnergizarMT2BarraB")) {
                        manobra = " OM Energizar o Bay do MT-2 e Barra B ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT2BarraB.equals("DesenergizarMT2BarraB")) {
                        manobra = " OM Desenergizar o Bay do MT-2 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT3BarraA.equals("EnergizarMT3BarraA")) {
                        manobra = " OM Energizar o Bay do MT-3 e Barra A ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT3BarraA.equals("DesenergizarMT3BarraA")) {
                        manobra = " OM Desenergizar o Bay do MT-3 e Barra 'A' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerMT4BarraB.equals("EnergizarMT4BarraB")) {
                        manobra = " OM Energizar o Bay do MT-4 e Barra B ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenMT4BarraB.equals("DesenergizarMT4BarraB")) {
                        manobra = " OM Desenergizar o Bay do MT-4 e Barra 'B' ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerAlbras.equals("EnergizarAlbras")) {
                        manobra = " OM para Energizar a SE ALBRAS ";
                        lbManobra.setText(manobra);
                    }

                    if (DesenAlbras.equals("DesenergizarAlbras")) {
                        manobra = " OM para Desenergizar a SE ALBRAS ";
                        lbManobra.setText(manobra);
                    }

                    if (PrepAlbras.equals("PrepAlbras")) {
                        manobra = " OM para Preparar a SE ALBRAS ";
                        lbManobra.setText(manobra);
                    }

                    if (EnerGerador.equals("EnergizarGerador")) {
                        manobra = " OM para Energizar os Geradores ";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed1.equals("DeslProgRed1")) {
                        manobra = " OM para Desligar a Redução 1 ";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed1.equals("NormalizacaoRed1")) {
                        manobra = " OM para Normalizar a Redução 1 ";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed2.equals("DeslProgRed2")) {
                        manobra = " OM para Desligar a Redução 2 ";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed2.equals("NormalizacaoRed2")) {
                        manobra = " OM para Normalizar a Redução 2 ";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed3.equals("DeslProgRed3")) {
                        manobra = " OM para Desligar a Redução 3 ";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed3.equals("NormalizacaoRed3")) {
                        manobra = " OM para Normalizar a Redução 3 ";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed4.equals("DeslProgRed4")) {
                        manobra = " OM para Desligar a Redução 4 ";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed4.equals("NormalizacaoRed4")) {
                        manobra = " OM para Normalizar a Redução 4 ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT1MTR.equals("TransferirMT1MTR")) {
                        manobra = " OM para Transferir do Trafo MT-1 para o MT-R ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT1.equals("TransferirMTRMT1")) {
                        manobra = " OM para Transferir do Trafo MT-R para o MT-1 ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT2MTR.equals("TransferirMT2MTR")) {
                        manobra = " OM para Transferir do Trafo MT-2 para o MT-R ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT2.equals("TransferirMTRMT2")) {
                        manobra = " OM para Transferir do Trafo MT-R para o MT-2 ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT3MTR.equals("TransferirMT3MTR")) {
                        manobra = " OM para Transferir do Trafo MT-3 para o MT-R ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT3.equals("TransferirMTRMT3")) {
                        manobra = " OM para Transferir do Trafo MT-R para o MT-3 ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT4MTR.equals("TransferirMT4MTR")) {
                        manobra = " OM para Transferir do Trafo MT-4 para o MT-R ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT4.equals("TransferirMTRMT4")) {
                        manobra = " OM para Transferir do Trafo MT-R para o MT-4 ";
                        lbManobra.setText(manobra);
                    }

                    if (EnergBarraEM.equals("EnergBarraEM")) {
                        manobra = " OM para Energizar a Barra EM pelo Gerador";
                        lbManobra.setText(manobra);
                    }

                    if (DesenBarraEM.equals("DesenBarraEM")) {
                        manobra = " OM para Desenergizar a Barra EM pelo Gerador";
                        lbManobra.setText(manobra);
                    }

                    if (EnergCargas.equals("EnergCargas")) {
                        manobra = " OM para Energizar a Barra EM pelo Gerador";
                        lbManobra.setText(manobra);
                    }

                    if (DeslCargas.equals("DeslCargas")) {
                        manobra = " OM para Desenergizar as Cargas pelo Gerador";
                        lbManobra.setText(manobra);
                    }
                }
            });

            Limpar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    passo = 0;
                    mostrar1.setText("");
                    mostrar2.setText("");
                    mostrar3.setText("");
                    mostrar4.setText("");
                    mostrar5.setText("");
                    mostrar6.setText("");
                    mostrar7.setText("");
                    mostrar8.setText("");
                    mostrar9.setText("");
                    mostrar10.setText("");
                    mostrar11.setText("");
                    mostrar12.setText("");
                    mostrar13.setText("");
                    mostrar14.setText("");
                    mostrar15.setText("");
                    mostrar16.setText("");
                    mostrar17.setText("");
                    mostrar18.setText("");
                    mostrar19.setText("");
                    mostrar20.setText("");
                    mostrar21.setText("");
                    mostrar22.setText("");
                    mostrar23.setText("");
                    mostrar24.setText("");
                    manobra = "                               MANOBRA:                               ";
                    lbManobra.setText(manobra);
                }
            });

            Sair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    limparMemoria();
                    setVisible(false);
                }
            });
        }// Fim main
    }// Fim Teste

    // ################################################# CLASSE MANOBRA INTELIGENTE
    public class ManobraInteligente {
        Relogio relogio = new Relogio();

        int passo = 0;
        int performance = 0;

        public ManobraInteligente() {
        }

        public void EnerL1() {
            if (EnerL1.equals("EnergizarLinha1")) {
                relogio.quantpassos = 3;
                if (seccionadora89l1fechada.equals("Seccionadora 89L1 Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    passo = passo + 1;
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !", "Energizar Bay da Linha 1",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!", "Energizar Bay da Linha 1",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!", "Energizar Bay da Linha 1",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.setVisible(true);
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 3 && seccionadora89l1fechada.equals("Seccionadora 89L1 Fechada") &&
                            seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") &&
                            disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") ||
                            seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada"))
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay da Linha 1! Concluida com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay da Linha 1", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay da Linha 1 Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenerL1() {
            if (DesenL1.equals("DesenergizarLinha1")) {
                relogio.quantpassos = 3;
                if (disjuntor52l1aberto.equals("Disjuntor 52L1 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Desenergizar Bay da Linha 1", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1aberta.equals("Seccionadora 89L1 Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso!!!",
                            "Desenergizar Bay da Linha 1", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") && passo == 2) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 3;
                    relogio.rendimento();
                    relogio.atualizaTempo();
                    if (passo == 3 && disjuntor52l1aberto.equals("Disjuntor 52L1 Aberto") &&
                            seccionadora89l1aberta.equals("Seccionadora 89L1 Aberta") &&
                            seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") ||
                            seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta"))
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay da Linha 1! Concluida com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay da Linha 1", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                }

                else if (seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") && passo == 2) {
                    passo = passo + 1;
                    relogio.setVisible(false);
                    relogio.passo = 3;
                    relogio.rendimento();
                    relogio.atualizaTempo();
                    JOptionPane.showMessageDialog(null,
                            "OM para Desenergizar Bay da Linha 1! Concluida com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                            "Energizar Bay da Linha 1", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar a Linha 1 incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerL2() {
            if (EnerL2.equals("EnergizarLinha2")) {
                relogio.quantpassos = 3;
                if (seccionadora89l2fechada.equals("Seccionadora 89L2 Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    relogio.setVisible(true);
                    passo = passo + 1;
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso!!! com sucesso !!!",
                            "Energizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso!!! com sucesso !!!",
                            "Energizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso!!! com sucesso !!!",
                            "Energizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.setVisible(true);
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 3 && seccionadora89l2fechada.equals("Seccionadora 89L2 Fechada") &&
                            seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") &&
                            disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") ||
                            seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada"))
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay da Linha 2! Concluida com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar a Linha 2 incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenerL2() {
            if (DesenL2.equals("DesenergizarLinha2")) {
                relogio.quantpassos = 3;
                if (disjuntor52l2aberto.equals("Disjuntor 52L2 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    relogio.setVisible(true);
                    passo = passo + 1;
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso!!! com sucesso !!!",
                            "Desenergizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2aberta.equals("Seccionadora 89L2 Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso!!! com sucesso !!!",
                            "Desenergizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") && passo == 2) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 3;
                    relogio.rendimento();
                    relogio.atualizaTempo();
                    if (passo == 3 && disjuntor52l2aberto.equals("Disjuntor 52L2 Aberto") &&
                            seccionadora89l2aberta.equals("Seccionadora 89L2 Aberta") &&
                            seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") ||
                            seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta"))
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay da Linha 2! Concluída com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                }

                else if (seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    relogio.atualizaTempo();
                    JOptionPane.showMessageDialog(null,
                            "OM para Desenergizar Bay da Linha 2! Concluida com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                            "Desenergizar Bay da Linha 2", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar a Linha 2 incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerL1InterBarra() {
            if (EnerL1BarraA.equals("EnergizarLinha1BarraA")) {
                relogio.quantpassos = 12;
                if (seccionadora89l1fechada.equals("Seccionadora 89L1 Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    relogio.setVisible(true);
                    passo = passo + 1;
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso !!!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") && passo == 1) {
                    seccionadora89l1afechada = "Seccionadora 89L1-A Fechada";
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso !!!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso !!!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso !!!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso !!!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluído com sucesso !!!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluído com sucesso !!!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluído com sucesso !!!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1baberta.equals("Seccionadora 89MT-1B Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluído com sucesso !!!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluído com sucesso !!!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrbaberta.equals("Seccionadora 89MT-RB Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluído com sucesso !!!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 concluído com sucesso !!!",
                            "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3baberta.equals("Seccionadora 89MT-3B Aberta") && passo == 11) {
                    relogio.setVisible(true);
                    passo = passo + 1;
                    relogio.atualizaTempo();
                    relogio.passo = 12;
                    relogio.rendimento();

                    if (passo == 12 && seccionadora89l1fechada.equals("Seccionadora 89L1 Fechada") &&
                            seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") &&
                            seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") &&
                            seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") &&
                            disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                            disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") &&
                            seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") &&
                            seccionadora89mt1baberta.equals("Seccionadora 89MT-1B Aberta") &&
                            seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") &&
                            seccionadora89mt3baberta.equals("Seccionadora 89MT-3B Aberta") ||
                            passo != 12)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay da Linha 1 e Barra 'A'! Concluida com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                    status2.setText("OM para Energizar Bay da Linha 1 e Barra 'A'! Conclu�da com sucesso !!!");
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar a Linha 1 e Barra 'A' incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenerL1InterBarra() {
            if (DesenL1BarraA.equals("DesenergizarLinha1BarraA")) {
                relogio.quantpassos = 12;
                if (seccionadora89mt1bfechada.equals("Seccionadora 89MT-1B Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    relogio.setVisible(true);
                    passo = passo + 1;
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 1 Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 1 Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrbfechada.equals("Seccionadora 89MT-RB Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3bfechada.equals("Seccionadora 89MT-3B Fechada") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l1aberto.equals("Disjuntor 52L1 Aberto") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1aberta.equals("Seccionadora 89L1 Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 1 e Barra 'A", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 8) {
                    disjuntor52btfechado = "Disjuntor 52BT Fechado";
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") && passo == 11) {
                    relogio.setVisible(true);
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 12 && seccionadora89l1aberta.equals("Seccionadora 89L1 Aberta") &&
                            seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") &&
                            seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") &&
                            seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") &&
                            disjuntor52btaberto.equals("Disjuntor 52BT Aberto") &&
                            disjuntor52l1aberto.equals("Disjuntor 52L1 Aberto") &&
                            seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") &&
                            seccionadora89mt1bfechada.equals("Seccionadora 89MT-1B Fechada") &&
                            seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") &&
                            seccionadora89mt3bfechada.equals("Seccionadora 89MT-3B Fechada"))
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay da Linha 1 e Barra 'A'! Concluída com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                    status2.setText("OM para Desenergizar Bay da Linha 1 e Barra 'A'! Conclu�da com sucesso !!!");
                }

                else if (seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") && passo == 11) {
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    relogio.atualizaTempo();
                    JOptionPane.showMessageDialog(null,
                            "OM para Desenergizar Bay da Linha 1 e Barra 'A'! Concluida com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                            "Desenergizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar o Bay da Linha 1 e Barra 'A' Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerL2InterBarra() {
            if (EnerL2IntBarra.equals("EnergizarLinha2IntBarra")) {
                relogio.quantpassos = 12;
                if (seccionadora89l2fechada.equals("Seccionadora 89L2 Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    relogio.setVisible(true);
                    passo = passo + 1;
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso !!!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso !!!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concludo com sucesso !!!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso !!!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso !!!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso !!!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso !!!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2bfechada.equals("Seccionadora 89MT-2B Fechada") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso !!!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2aaberta.equals("Seccionadora 89MT-2A Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso !!!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4bfechada.equals("Seccionadora 89MT-4B Fechada") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso !!!",
                            "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4aaberta.equals("Seccionadora 89MT-4A Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 12;
                    relogio.rendimento();
                    relogio.atualizaTempo();
                    if (passo == 10 && seccionadora89l2fechada.equals("Seccionadora 89L2 Fechada") &&
                            seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") &&
                            seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") &&
                            seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") &&
                            disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                            disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") &&
                            seccionadora89mt2bfechada.equals("Seccionadora 89MT-2B Fechada") &&
                            seccionadora89mt2aaberta.equals("Seccionadora 89MT-2A Aberta") &&
                            seccionadora89mt4bfechada.equals("Seccionadora 89MT-4B Fechada") &&
                            seccionadora89mt4aaberta.equals("Seccionadora 89MT-4A Aberta") ||
                            passo != 10)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay da Linha 2 e Barra 'B'! Concluída com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay da Linha 2 e Barra 'B' Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenerL2InterBarra() {
            if (DesenL2IntBarra.equals("DesenergizarLinha2IntBarra")) {
                relogio.quantpassos = 12;
                if (seccionadora89mt2afechada.equals("Seccionadora 89MT-2A Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2baberta.equals("Seccionadora 89MT-2B Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4afechada.equals("Seccionadora 89MT-4A Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4baberta.equals("Seccionadora 89MT-4B Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l2aberto.equals("Disjuntor 52L2 Aberto") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2aberta.equals("Seccionadora 89L2 Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso !!!",
                            "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 12;
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 10 && seccionadora89l2aberta.equals("Seccionadora 89L2 Aberta") &&
                            seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") &&
                            seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") &&
                            seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") &&
                            disjuntor52btaberto.equals("Disjuntor 52BT Aberto") &&
                            disjuntor52l2aberto.equals("Disjuntor 52L2 Aberto") &&
                            seccionadora89mt2baberta.equals("Seccionadora 89MT-2B Aberta") &&
                            seccionadora89mt2afechada.equals("Seccionadora 89MT-2A Fechada") &&
                            seccionadora89mt4baberta.equals("Seccionadora 89MT-4B Aberta") &&
                            seccionadora89mt4afechada.equals("Seccionadora 89MT-4A Fechada"))
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay da Linha 2 e Barra 'B'! Concluida com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay da Linha 2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                }

                else if (seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta") && passo == 9) {
                    passo = passo + 1;
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar o Bay da Linha 2 e Barra 'B' Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerMT1BarraA() {
            if (EnerMT1BarraA.equals("EnergizarMT1BarraA")) {
                relogio.quantpassos = 11;
                if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluído com sucesso !!!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluído com sucesso !!!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso !!!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluído com sucesso !!!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluído com sucesso !!!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluído com sucesso !!!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrbaberta.equals("Seccionadora 89MT-RB Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluído com sucesso !!!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluído com sucesso !!!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3baberta.equals("Seccionadora 89MT-3B Aberta") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluído com sucesso !!!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluído com sucesso !!!",
                            "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") && passo == 10) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 11;
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 11 && seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") &&
                            seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") &&
                            disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                            seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") &&
                            seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") &&
                            seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") &&
                            seccionadora89mtrbaberta.equals("Seccionadora 89MT-RB Aberta") &&
                            seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") &&
                            seccionadora89mt3baberta.equals("Seccionadora 89MT-3B Aberta") &&
                            seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") &&
                            disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay do MT-1 e Barra A! Concluída com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay do MT-1e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay do MT-1 e Barra 'A' Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenMT1BarraA() {
            if (DesenMT1BarraA.equals("DesenergizarMT1BarraA")) {
                relogio.quantpassos = 11;
                if (disjuntor52mt1aberto.equals("Disjuntor 52MT-1 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrbfechada.equals("Seccionadora 89MT-RB Fechada") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3bfechada.equals("Seccionadora 89MT-3B Fechada") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 11 && seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") &&
                            seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") &&
                            disjuntor52btaberto.equals("Disjuntor 52BT Aberto") &&
                            seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") &&
                            seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") &&
                            seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") &&
                            seccionadora89mtrbfechada.equals("Seccionadora 89MT-RB Fechada") &&
                            seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") &&
                            seccionadora89mt3bfechada.equals("Seccionadora 89MT-3B Fechada") &&
                            seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") &&
                            disjuntor52mt1aberto.equals("Disjuntor 52MT-1 Aberto") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay do MT-1 e Barra A! Concluida com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay do MT-1e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar o Bay do MT-1 e Barra 'A' Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerMTRBarraA() {
            if (EnerMTRBarraA.equals("EnergizarMTRBarraA")) {
                relogio.quantpassos = 11;
                if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluído com sucesso !!!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluido com sucesso !!!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso !!!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") && passo == 3) {
                    seccionadora89l1afechada = "Seccionadora 89L1-A Fechada";
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso !!!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso !!!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") && passo == 5) {
                    seccionadora89mt1afechada = "Seccionadora 89MT-1A Fechada";
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso !!!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1baberta.equals("Seccionadora 89MT-1B Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso !!!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso !!!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3baberta.equals("Seccionadora 89MT-3B Aberta") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso !!!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluído com sucesso !!!",
                            "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") && passo == 10) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 11;
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 11 && seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") &&
                            seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") &&
                            disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                            seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") &&
                            seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") &&
                            seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") &&
                            seccionadora89mt1baberta.equals("Seccionadora 89MT-1B Aberta") &&
                            seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") &&
                            seccionadora89mt3baberta.equals("Seccionadora 89MT-3B Aberta") &&
                            seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") &&
                            disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay do MT-R e Barra A Concluida com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay do MT-R", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay do MTR e Barra 'A' Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenMTRBarraA() {
            if (DesenMTRBarraA.equals("DesenergizarMTRBarraA")) {
                relogio.quantpassos = 11;
                if (disjuntor52mtraberto.equals("Disjuntor 52MT-R Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1bfechada.equals("Seccionadora 89MT-1B Fechada") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3bfechada.equals("Seccionadora 89MT-3B Fechada") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 11 && seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") &&
                            seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") &&
                            disjuntor52btaberto.equals("Disjuntor 52BT Aberto") &&
                            seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") &&
                            seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") &&
                            seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") &&
                            seccionadora89mt1bfechada.equals("Seccionadora 89MT-1B Fechada") &&
                            seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") &&
                            seccionadora89mt3bfechada.equals("Seccionadora 89MT-3B Fechada") &&
                            seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") &&
                            disjuntor52mtraberto.equals("Disjuntor 52MT-R Aberto") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay do MT-R e Barra A! Concluida com sucesso!!! No esque~ça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar o Bay do MTR e Barra 'A' Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerMT2BarraB() {
            if (EnerMT2BarraB.equals("EnergizarMT2BarraB")) {
                relogio.quantpassos = 9;
                if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 conclu�do com sucesso !!!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluído com sucesso !!!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluído com sucesso !!!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluído com sucesso !!!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluído com sucesso !!!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4bfechada.equals("Seccionadora 89MT-4B Fechada") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluído com sucesso !!!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4aaberta.equals("Seccionadora 89MT-4A Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluído com sucesso !!!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2bfechada.equals("Seccionadora 89MT-2B Fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluído com sucesso !!!",
                            "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") && passo == 8) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 9;
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 9 && seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") &&
                            seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") &&
                            disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                            seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") &&
                            seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta") &&
                            seccionadora89mt4bfechada.equals("Seccionadora 89MT-4B Fechada") &&
                            seccionadora89mt4aaberta.equals("Seccionadora 89MT-4A Aberta") &&
                            seccionadora89mt2bfechada.equals("Seccionadora 89MT-2B Fechada") &&
                            disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") ||
                            passo != 9)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay do MT-2 e Barra B Concluída com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay do MT-2", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay do MT-2 e Barra 'B' Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenMT2BarraB() {
            if (DesenMT2BarraB.equals("DesenergizarMT2BarraB")) {
                relogio.quantpassos = 9;
                if (disjuntor52mt2aberto.equals("Disjuntor 52MT-2 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2baberta.equals("Seccionadora 89MT-2B Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4afechada.equals("Seccionadora 89MT-4A Fechada") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-1 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4baberta.equals("Seccionadora 89MT-4B Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 9 && seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") &&
                            seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") &&
                            disjuntor52btaberto.equals("Disjuntor 52BT Aberto") &&
                            seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") &&
                            seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada") &&
                            seccionadora89mt4afechada.equals("Seccionadora 89MT-4A Fechada") &&
                            seccionadora89mt4baberta.equals("Seccionadora 89MT-4B Aberta") &&
                            seccionadora89mt2baberta.equals("Seccionadora 89MT-2B Aberta") &&
                            disjuntor52mt2aberto.equals("Disjuntor 52MT-2 Aberto") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay do MT-2 e Barra 'B' Conclu�da com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar o Bay do MT-2 e Barra 'B' Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerMT3BarraA() {
            if (EnerMT3BarraA.equals("EnergizarMT3BarraA")) {
                relogio.quantpassos = 11;
                if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluído com sucesso !!!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluído com sucesso !!!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluído com sucesso !!!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") && passo == 3) {
                    seccionadora89l1afechada = "Seccionadora 89L1-A Fechada";
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso !!!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso !!!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso !!!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1baberta.equals("Seccionadora 89MT-1B Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso !!!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluído com sucesso !!!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrbaberta.equals("Seccionadora 89MT-RB Aberta") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso !!!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso !!!",
                            "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") && passo == 10) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 11;
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 11 && seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") &&
                            seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") &&
                            disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                            seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") &&
                            seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") &&
                            seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") &&
                            seccionadora89mt1baberta.equals("Seccionadora 89MT-1B Aberta") &&
                            seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") &&
                            seccionadora89mtrbaberta.equals("Seccionadora 89MT-RB Aberta") &&
                            seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") &&
                            disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay do MT-3 e Barra A Concluída com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay do MT-3", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay do MT-3 e Barra 'A' Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenMT3BarraA() {
            if (DesenMT3BarraA.equals("DesenergizarMT3BarraA")) {
                relogio.quantpassos = 11;
                if (disjuntor52mt3aberto.equals("Disjuntor 52MT-3 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1bfechada.equals("Seccionadora 89MT-1B Fechada") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtrbfechada.equals("Seccionadora 89MT-RB Fechada") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 concluido com sucesso !!!",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 11 && seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") &&
                            seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") &&
                            disjuntor52btaberto.equals("Disjuntor 52BT Aberto") &&
                            seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") &&
                            seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") &&
                            seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") &&
                            seccionadora89mt1bfechada.equals("Seccionadora 89MT-1B Fechada") &&
                            seccionadora89mt3aaberta.equals("Seccionadora 89MT-RA Aberta") &&
                            seccionadora89mt3bfechada.equals("Seccionadora 89MT-RB Fechada") &&
                            seccionadora89mtraaberta.equals("Seccionadora 89MT-3A Aberta") &&
                            disjuntor52mtraberto.equals("Disjuntor 52MT-3 Aberto") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay do MT-3 e Barra A! Concluída com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar o Bay do MT-3 e Barra 'A' Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerMT4BarraB() {
            if (EnerMT4BarraB.equals("EnergizarMT4BarraB")) {
                relogio.quantpassos = 9;
                if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluído com sucesso !!!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluído com sucesso !!!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 conclu�do com sucesso !!!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluido com sucesso !!!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluido com sucesso !!!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2bfechada.equals("Seccionadora 89MT-2B Fechada") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluido com sucesso !!!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2aaberta.equals("Seccionadora 89MT-2A Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluido com sucesso !!!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4bfechada.equals("Seccionadora 89MT-4B Fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluido com sucesso !!!",
                            "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") && passo == 8) {
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 9;
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 9 && seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") &&
                            seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") &&
                            disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                            seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") &&
                            seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta") &&
                            seccionadora89mt2bfechada.equals("Seccionadora 89MT-2B Fechada") &&
                            seccionadora89mt2aaberta.equals("Seccionadora 89MT-2A Aberta") &&
                            seccionadora89mt4bfechada.equals("Seccionadora 89MT-4B Fechada") &&
                            disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") ||
                            passo != 9)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Bay do MT-4 e Barra 'B'! Concluída com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Bay do MT-4", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay do MT-4 e Barra 'B' Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenMT4BarraB() {
            if (DesenMT4BarraB.equals("DesenergizarMT4BarraB")) {
                relogio.quantpassos = 9;
                if (disjuntor52mt4aberto.equals("Disjuntor 52MT-4 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt4baberta.equals("Seccionadora 89MT-4B Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2afechada.equals("Seccionadora 89MT-2A Fechada") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89mt2baberta.equals("Seccionadora 89MT-2B Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 concluído com sucesso !!!",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 9 && seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") &&
                            seccionadora89btbaberta.equals("Seccionadora 89BT-B Aberta") &&
                            disjuntor52btaberto.equals("Disjuntor 52BT Aberto") &&
                            seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") &&
                            seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada") &&
                            seccionadora89mt2afechada.equals("Seccionadora 89MT-2A Fechada") &&
                            seccionadora89mt2baberta.equals("Seccionadora 89MT-2B Aberta") &&
                            seccionadora89mt4baberta.equals("Seccionadora 89MT-4B Aberta") &&
                            disjuntor52mt4aberto.equals("Disjuntor 52MT-4 Aberto") ||
                            passo != 11)
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Bay do MT-4 e Barra 'B'! Concluida com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar o Bay do MT-4 e Barra 'B' Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerAlbras() {
            if (EnerAlbras.equals("EnergizarAlbras")) {
                relogio.quantpassos = 23;
                if (disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52alfechado.equals("Disjuntor 52AL Fechado") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a1fechado.equals("Disjuntor 52A1 Fechado") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a2fechado.equals("Disjuntor 52A2 Fechado") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a3fechado.equals("Disjuntor 52A3 Fechado") && passo == 11) {
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a4fechado.equals("Disjuntor 52A4 Fechado") && passo == 12) {
                    passo = passo + 1;
                    relogio.passo = 13;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a5fechado.equals("Disjuntor 52A5 Fechado") && passo == 13) {
                    passo = passo + 1;
                    relogio.passo = 14;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a6fechado.equals("Disjuntor 52A6 Fechado") && passo == 14) {
                    passo = passo + 1;
                    relogio.passo = 15;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a7fechado.equals("Disjuntor 52A7 Fechado") && passo == 15) {
                    passo = passo + 1;
                    relogio.passo = 16;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a8fechado.equals("Disjuntor 52A8 Fechado") && passo == 16) {
                    passo = passo + 1;
                    relogio.passo = 17;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p1fechado.equals("Disjuntor 52P1 Fechado") && passo == 17) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p2fechado.equals("Disjuntor 52P2 Fechado") && passo == 18) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p3fechado.equals("Disjuntor 52P3 Fechado") && passo == 19) {
                    passo = passo + 1;
                    relogio.passo = 20;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p4fechado.equals("Disjuntor 52P4 Fechado") && passo == 20) {
                    passo = passo + 1;
                    relogio.passo = 21;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p5fechado.equals("Disjuntor 52P5 Fechado") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso !!!",
                            "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52p6fechado.equals("Disjuntor 52P6 Fechado") && passo == 22) {
                    passo = passo + 1;
                    relogio.passo = 23;
                    relogio.setVisible(true);
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 23 && disjuntor52p6fechado.equals("Disjuntor 52P6 Fechado") ||
                    // disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") &&
                    // disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") &&
                    // disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") &&
                    // disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") &&
                    // disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") &&
                    // disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                    // disjuntor52alfechado.equals("Disjuntor 52AL Fechado") &&
                    // disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") &&
                    // disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") ||
                            passo != 23)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar a SE ALBRAS ! Concluida com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                                "Energizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar a SE ALBRAS Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenAlbras() {
            if (DesenAlbras.equals("DesenergizarAlbras")) {
                relogio.quantpassos = 23;
                if (disjuntor52l1aberto.equals("Disjuntor 52L1 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52l2aberto.equals("Disjuntor 52L2 Aberto") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52alaberto.equals("Disjuntor 52AL Aberto") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt1aberto.equals("Disjuntor 52MT-1 Aberto") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mtraberto.equals("Disjuntor 52MT-R Aberto") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt2aberto.equals("Disjuntor 52MT-2 Aberto") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt3aberto.equals("Disjuntor 52MT-3 Aberto") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52mt4aberto.equals("Disjuntor 52MT-4 Aberto") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52alaberto.equals("Disjuntor 52A1 Aberto") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a2aberto.equals("Disjuntor 52A2 Aberto") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a3aberto.equals("Disjuntor 52A3 Aberto") && passo == 11) {
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a4aberto.equals("Disjuntor 52A4 Aberto") && passo == 12) {
                    passo = passo + 1;
                    relogio.passo = 13;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a5aberto.equals("Disjuntor 52A5 Aberto") && passo == 13) {
                    passo = passo + 1;
                    relogio.passo = 14;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a6aberto.equals("Disjuntor 52A6 Aberto") && passo == 14) {
                    passo = passo + 1;
                    relogio.passo = 15;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a7aberto.equals("Disjuntor 52A7 Aberto") && passo == 15) {
                    passo = passo + 1;
                    relogio.passo = 16;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a8aberto.equals("Disjuntor 52A8 Aberto") && passo == 16) {
                    passo = passo + 1;
                    relogio.passo = 17;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p1aberto.equals("Disjuntor 52P1 Aberto") && passo == 17) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p2aberto.equals("Disjuntor 52P2 Aberto") && passo == 18) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p3aberto.equals("Disjuntor 52P3 Aberto") && passo == 19) {
                    passo = passo + 1;
                    relogio.passo = 20;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p4aberto.equals("Disjuntor 52P4 Aberto") && passo == 20) {
                    passo = passo + 1;
                    relogio.passo = 21;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p5aberto.equals("Disjuntor 52P5 Aberto") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso !!!",
                            "Desenergizar Subestação ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52p6aberto.equals("Disjuntor 52P6 Aberto") && passo == 22) {
                    passo = passo + 1;
                    relogio.passo = 23;
                    relogio.setVisible(true);
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 23 && disjuntor52p6aberto.equals("Disjuntor 52P6 Aberto") ||
                    // disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") &&
                    // disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") &&
                    // disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") &&
                    // disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") &&
                    // disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") &&
                    // disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                    // disjuntor52alfechado.equals("Disjuntor 52AL Fechado") &&
                    // disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") &&
                    // disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") ||
                            passo != 23)
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar a SE ALBRAS ! Concluída com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                                "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar a SE ALBRAS Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void PrepAlbras() {
            if (PrepAlbras.equals("PrepAlbras")) {
                relogio.quantpassos = 33;
                if (seccionadora89a2eaberta.equals("Seccionadora 89A2E Aberta") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89a4eaberta.equals("Seccionadora 89A4E Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89a6eaberta.equals("Seccionadora 89A6E Aberta") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89a8eaberta.equals("Seccionadora 89A8E Aberta") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89lvrreaberta.equals("Seccionadora 89LVRRE Aberta") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89lvrraberta.equals("Seccionadora 89LVRR Aberta") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p1aberta.equals("Seccionadora 89P1 Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p2aberta.equals("Seccionadora 89P2 Aberta") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p3aberta.equals("Seccionadora 89P3 Aberta") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p4aberta.equals("Seccionadora 89P4 Aberta") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p5aberta.equals("Seccionadora 89P5 Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p6aberta.equals("Seccionadora 89P6 Aberta") && passo == 11) {
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89a2efechada.equals("Seccionadora 89A2E Fechada") && passo == 12) {
                    passo = passo + 1;
                    relogio.passo = 13;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89a4efechada.equals("Seccionadora 89A4E Fechada") && passo == 13) {
                    passo = passo + 1;
                    relogio.passo = 14;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89a6efechada.equals("Seccionadora 89A6E Fechada") && passo == 14) {
                    passo = passo + 1;
                    relogio.passo = 15;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89a8efechada.equals("Seccionadora 89A8E Fechada") && passo == 15) {
                    passo = passo + 1;
                    relogio.passo = 16;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p1efechada.equals("Seccionadora 89P1E Fechada") && passo == 16) {
                    passo = passo + 1;
                    relogio.passo = 17;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p2efechada.equals("Seccionadora 89P2E Fechada") && passo == 17) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p3efechada.equals("Seccionadora 89P3E Fechada") && passo == 18) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p4efechada.equals("Seccionadora 89P4E Fechada") && passo == 19) {
                    passo = passo + 1;
                    relogio.passo = 20;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p5efechada.equals("Seccionadora 89P5E Fechada") && passo == 20) {
                    passo = passo + 1;
                    relogio.passo = 21;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p6efechada.equals("Seccionadora 89P6E Fechada") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89tuefechada.equals("Seccionadora 89tuE Fechada") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52tufechado.equals("Disjuntor 52TU Fechado") && passo == 22) {
                    passo = passo + 1;
                    relogio.passo = 23;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 23 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a2fechado.equals("Disjuntor 52A2 Fechado") && passo == 23) {
                    passo = passo + 1;
                    relogio.passo = 24;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 24 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a4fechado.equals("Disjuntor 52A4 Fechado") && passo == 24) {
                    passo = passo + 1;
                    relogio.passo = 25;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 25 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a6fechado.equals("Disjuntor 52A6 Fechado") && passo == 25) {
                    passo = passo + 1;
                    relogio.passo = 26;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 26 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52a8fechado.equals("Disjuntor 52A8 Fechado") && passo == 26) {
                    passo = passo + 1;
                    relogio.passo = 27;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 27 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p1fechado.equals("Disjuntor 52P1 Fechado") && passo == 27) {
                    passo = passo + 1;
                    relogio.passo = 28;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 28 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p2fechado.equals("Disjuntor 52P2 Fechado") && passo == 28) {
                    passo = passo + 1;
                    relogio.passo = 29;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 29 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p3fechado.equals("Disjuntor 52P3 Fechado") && passo == 29) {
                    passo = passo + 1;
                    relogio.passo = 30;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 30 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p4fechado.equals("Disjuntor 52P4 Fechado") && passo == 30) {
                    passo = passo + 1;
                    relogio.passo = 31;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 31 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p5fechado.equals("Disjuntor 52P5 Fechado") && passo == 31) {
                    passo = passo + 1;
                    relogio.passo = 32;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 32 realizado com sucesso !!!",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p6fechado.equals("Disjuntor 52P6 Fechado") && passo == 32) {
                    passo = passo + 1;
                    relogio.passo = 33;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 33 && disjuntor52p6fechado.equals("Disjuntor 52P6 Fechado") ||
                    // disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") &&
                    // disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") &&
                    // disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") &&
                    // disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") &&
                    // disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") &&
                    // disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                    // disjuntor52alfechado.equals("Disjuntor 52AL Fechado") &&
                    // disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") &&
                    // disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") ||
                            passo != 33)
                        JOptionPane.showMessageDialog(null,
                                "OM para Preparar a SE ALBRAS ! Concluída com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                                "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para preparar a SE ALBRAS Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void TransfMT1MTR() {
            if (TransfMT1MTR.equals("TransfMT1MTR")) {
                relogio.quantpassos = 24;
                if (disjuntor52p2aberto.equals("Disjuntor 52P2 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p2aberta.equals("Seccionadora 89P2 Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p2efechada.equals("Seccionadora 89P2E Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c1aberto.equals("Disjuntor 52C1 Aberto") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c2aberto.equals("Disjuntor 52C2 Aberto") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r1aberto.equals("Disjuntor 52R1 Aberto") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r1aberta.equals("Seccionadora 89R1 Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r1efechada.equals("Seccionadora 89R1E fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r1fechado.equals("Disjuntor 52R1 Fechado") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r2aberto.equals("Disjuntor 52R2 Aberto") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r2aberta.equals("Seccionadora 89R2 Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89r2efechada.equals("Seccionadora 89R2E Fechada") && passo == 11) {
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52r2fechado.equals("Disjuntor 52R2 Fechado") && passo == 12) {
                    passo = passo + 1;
                    relogio.passo = 13;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p2fechado.equals("Disjuntor 52P2 Fechado") && passo == 13) {
                    passo = passo + 1;
                    relogio.passo = 14;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52p1aberto.equals("Disjuntor 52P1 Aberto") && passo == 14) {
                    passo = passo + 1;
                    relogio.passo = 15;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89c1aberta.equals("Seccionadora 89C1 Aberta") && passo == 15) {
                    passo = passo + 1;
                    relogio.passo = 16;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89c1efechada.equals("Seccionadora 89C1E Fechada") && passo == 16) {
                    passo = passo + 1;
                    relogio.passo = 17;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89p2efechada.equals("Seccionadora 89P2E Fechada") && passo == 17) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89c2aberta.equals("Seccionadora 89c2 Aberta") && passo == 18) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89c2efechada.equals("Seccionadora 89C2E Fechada") && passo == 19) {
                    passo = passo + 1;
                    relogio.passo = 20;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52c1fechado.equals("Disjuntor 52C1 Fechado") && passo == 20) {
                    passo = passo + 1;
                    relogio.passo = 21;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52c2fechado.equals("Disjuntor 52C2 Fechado") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p1aberta.equals("Seccionadora 89P1 Aberta") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p1efechada.equals("Seccionadora 89P1E Fechada") && passo == 22) {
                    passo = passo + 1;
                    relogio.passo = 23;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 23 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52p1fechado.equals("Disjuntor 52P1 Fechado") && passo == 32) {
                    passo = passo + 1;
                    relogio.passo = 24;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 24 && disjuntor52p1fechado.equals("Disjuntor 52P1 Fechado") ||
                    // disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") &&
                    // disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") &&
                    // disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") &&
                    // disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") &&
                    // disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") &&
                    // disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                    // disjuntor52alfechado.equals("Disjuntor 52AL Fechado") &&
                    // disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") &&
                    // disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") ||
                            passo != 24)
                        JOptionPane.showMessageDialog(null,
                                "OM para Transferir do MT-1 para MT-R ! Concluída com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                                "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                    // limparMemoria();
                } else {
                    Object[] options = { "Sim", "Não", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para preparar a SE ALBRAS Incorreto, Você deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

    }// Fim Teste

    public void limparMemoria() {
        manobrainteligente.passo = 0;
        seccionadora89l1fechada = "";
        seccionadora89l1afechada = "";
        seccionadora89l1bfechada = "";
        seccionadora89l1aberta = "";
        seccionadora89l1aaberta = "";
        seccionadora89l1baberta = "";
        seccionadora89l2fechada = "";
        seccionadora89l2afechada = "";
        seccionadora89alafechada = "";
        seccionadora89l2bfechada = "";
        seccionadora89l2aberta = "";
        seccionadora89l2aaberta = "";
        seccionadora89l2baberta = "";
        seccionadora89albfechada = "";
        seccionadora89albaberta = "";
        seccionadora89btafechada = "";
        seccionadora89btbfechada = "";
        seccionadora89btaaberta = "";
        seccionadora89btbaberta = "";
        seccionadora89mt1afechada = "";
        seccionadora89mt1aaberta = "";
        seccionadora89mt1bfechada = "";
        seccionadora89mt1baberta = "";
        seccionadora89mtrafechada = "";
        seccionadora89mtraaberta = "";
        seccionadora89mtrbfechada = "";
        seccionadora89mtrbaberta = "";
        seccionadora89mt2afechada = "";
        seccionadora89mt2aaberta = "";
        seccionadora89mt2bfechada = "";
        seccionadora89mt2baberta = "";
        seccionadora89mt3afechada = "";
        seccionadora89mt3aaberta = "";
        seccionadora89mt3bfechada = "";
        seccionadora89mt3baberta = "";
        seccionadora89mt4afechada = "";
        seccionadora89mt4aaberta = "";
        seccionadora89mt4bfechada = "";
        seccionadora89mt4baberta = "";
        seccionadora89a2eaberta = "";
        seccionadora89a4eaberta = "";
        seccionadora89a6eaberta = "";
        seccionadora89a8eaberta = "";
        seccionadora89p1aberta = "";
        seccionadora89lvrreaberta = "";
        seccionadora89lvrraberta = "";
        seccionadora89p2aberta = "";
        seccionadora89p3aberta = "";
        seccionadora89p4aberta = "";
        seccionadora89p5aberta = "";
        seccionadora89p6aberta = "";
        seccionadora89a2efechada = "";
        seccionadora89a4efechada = "";
        seccionadora89a6efechada = "";
        seccionadora89a8efechada = "";
        seccionadora89p1efechada = "";
        seccionadora89p2efechada = "";
        seccionadora89p3efechada = "";
        seccionadora89p4efechada = "";
        seccionadora89p5efechada = "";
        seccionadora89p6efechada = "";
        seccionadora89tuefechada = "";
        seccionadora89c1aberta = "";
        seccionadora89c2aberta = "";
        seccionadora89c3aberta = "";
        seccionadora89c4aberta = "";
        seccionadora89c5aberta = "";
        seccionadora89c6aberta = "";
        seccionadora89c1eaberta = "";
        seccionadora89c2eaberta = "";
        seccionadora89c3eaberta = "";
        seccionadora89c4eaberta = "";
        seccionadora89c5eaberta = "";
        seccionadora89c6eaberta = "";
        seccionadora89c1efechada = "";
        seccionadora89c2efechada = "";
        seccionadora89c3efechada = "";
        seccionadora89c4efechada = "";
        seccionadora89c5efechada = "";
        seccionadora89c6efechada = "";
        seccionadora89r1aberta = "";
        seccionadora89r2aberta = "";
        seccionadora89r3aberta = "";
        seccionadora89r4aberta = "";
        seccionadora89r5aberta = "";
        seccionadora89r6aberta = "";
        seccionadora89r1eaberta = "";
        seccionadora89r2eaberta = "";
        seccionadora89r3eaberta = "";
        seccionadora89r4eaberta = "";
        seccionadora89r5eaberta = "";
        seccionadora89r6eaberta = "";
        seccionadora89r1efechada = "";
        seccionadora89r2efechada = "";
        seccionadora89r3efechada = "";
        seccionadora89r4efechada = "";
        seccionadora89r5efechada = "";
        seccionadora89r6efechada = "";
        disjuntor52l1fechado = "";
        disjuntor52l1aberto = "";
        disjuntor52l2fechado = "";
        disjuntor52l2aberto = "";
        disjuntor52alfechado = "";
        disjuntor52alaberto = "";
        disjuntor52btfechado = "";
        disjuntor52btaberto = "";
        disjuntor52mt1fechado = "";
        disjuntor52mt1aberto = "";
        disjuntor52mtrfechado = "";
        disjuntor52mtraberto = "";
        disjuntor52mt2fechado = "";
        disjuntor52mt2aberto = "";
        disjuntor52mt3fechado = "";
        disjuntor52mt3aberto = "";
        disjuntor52mt4fechado = "";
        disjuntor52mt4aberto = "";
        disjuntor52a1fechado = "";
        disjuntor52a1aberto = "";
        disjuntor52a2fechado = "";
        disjuntor52a2aberto = "";
        disjuntor52a3fechado = "";
        disjuntor52a3aberto = "";
        disjuntor52a4fechado = "";
        disjuntor52a4aberto = "";
        disjuntor52a5fechado = "";
        disjuntor52a5aberto = "";
        disjuntor52a6fechado = "";
        disjuntor52a6aberto = "";
        disjuntor52a7fechado = "";
        disjuntor52a7aberto = "";
        disjuntor52a8fechado = "";
        disjuntor52a8aberto = "";
        disjuntor52p1fechado = "";
        disjuntor52p1aberto = "";
        disjuntor52p2fechado = "";
        disjuntor52p2aberto = "";
        disjuntor52p3fechado = "";
        disjuntor52p3aberto = "";
        disjuntor52p4fechado = "";
        disjuntor52p4aberto = "";
        disjuntor52p5fechado = "";
        disjuntor52p5aberto = "";
        disjuntor52p6fechado = "";
        disjuntor52p6aberto = "";
        disjuntor52tufechado = "";
        disjuntor52lvr1fechado = "";
        disjuntor52c1fechado = "";
        disjuntor52c1aberto = "";
        disjuntor52c2fechado = "";
        disjuntor52c2aberto = "";
        disjuntor52c3fechado = "";
        disjuntor52c3aberto = "";
        disjuntor52c4fechado = "";
        disjuntor52c4aberto = "";
        disjuntor52c5fechado = "";
        disjuntor52c5aberto = "";
        disjuntor52c6fechado = "";
        disjuntor52c6aberto = "";
        disjuntor52c7fechado = "";
        disjuntor52c7aberto = "";
        disjuntor52c8fechado = "";
        disjuntor52c8aberto = "";
        disjuntor52r1fechado = "";
        disjuntor52r1aberto = "";
        disjuntor52r2fechado = "";
        disjuntor52r2aberto = "";
        disjuntor52r3fechado = "";
        disjuntor52r3aberto = "";
        disjuntor52r4fechado = "";
        disjuntor52r4aberto = "";
        disjuntor52r5fechado = "";
        disjuntor52r5aberto = "";
        disjuntor52r6fechado = "";
        disjuntor52r6aberto = "";
        disjuntor52r7fechado = "";
        disjuntor52r7aberto = "";
        disjuntor52r8fechado = "";
        disjuntor52r8aberto = "";
        disjuntor52g1fechado = "";
        disjuntor52g1aberto = "";
        disjuntor52g2fechado = "";
        disjuntor52g2aberto = "";
        disjuntor52tufechado = "";
        disjuntor52tuaberto = "";
        EnerL1 = "";
        EnerL2 = "";
        DesenL1 = "";
        DesenL2 = "";
        EnerBayBT = "";
        EnerL1BarraA = "";
        EnerL2IntBarra = "";
        EnerMT1BarraA = "";
        EnerMTRBarraA = "";
        EnerMT2BarraB = "";
        EnerMT3BarraA = "";
        EnerMT4BarraB = "";
        DesenMT1BarraA = "";
        DesenMTRBarraA = "";
        DesenMT2BarraB = "";
        DesenMT3BarraA = "";
        DesenMT4BarraB = "";
        DesenL1BarraA = "";
        DesenL2IntBarra = "";
        EnerAlbras = "";
        DesenAlbras = "";
        PrepAlbras = "";
        EnerGerador = "";
        NormRed1 = "";
        NormRed2 = "";
        NormRed3 = "";
        NormRed4 = "";
        DeslProgRed1 = "";
        DeslProgRed2 = "";
        DeslProgRed3 = "";
        DeslProgRed4 = "";
        TransfMT1MTR = "";
        TransfMTRMT1 = "";
        TransfMT2MTR = "";
        TransfMTRMT2 = "";
        TransfMT3MTR = "";
        TransfMTRMT3 = "";
        TransfMT4MTR = "";
        TransfMTRMT4 = "";
        EnergBarraEM = "";
        EnergCargas = "";
        DeslCargas = "";
        DesenBarraEM = "";
        status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: " + "NENHUMA");
        JOptionPane.showMessageDialog(null, " Voce ja pode Habilitar a proxima manobra para Simulaçao!!! ");
    }

    public static void main(String args[]) {
        new InterfaceMTS3e4().setVisible(true);
        // InterfaceMT1 application = new InterfaceMT1();
    }
}