
/*******************************************************
 * PROJETO SIMULADOR PARA TREINAMENTO DE OPERADORES DE *
 * SUBESTAÇÃO.                                         *
 * PROJETISTA E DESENVOLVEDOR:                         *
 *          CARLOS MARDONIO BEZERRA MARTINS            * 
 *         BACHAREL EM SISTEMAS DE INFORMAÇAO          *
 *                                                     *
 * DATA - 18/08/2006                                   *
 * ATUALIZADO - 19/08/2008                            *
 *******************************************************
 * MODULO -   INTERFACEMTR                             *
 ******************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.SimpleDateFormat; //Carregar este pacote

public class InterfaceMTR extends JFrame implements ActionListener {
    JLabel tap, valortap, tensao, trafo, barra1, barra2, tap1, tap2, valortap1, valortap2, trafo1, trafo2, subir,
            descer, Alarmes;
    JLabel mt1a, mt1b, mt2a, mt2b, l1a, l1b, l2a, l2b, l189, l289, l157, l1, l257, l2, bta, btb, bta57, btb57, mt152,
            mtr52, mt252, l152, l252, bt52, gif1, ta1;
    JLabel status, status1, status2, mt1, mtr, mt2, c1, c2, lvr1, rf6, rf5, rf3, rf4, pla1, pla2, rf5e, rf4e, rf3e,
            rf552, rf452, rf352;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23,
            b24, b25;
    JButton b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46,
            b47, b48, b49, b50, b51, b52, b53, b54, b55, b56, b57, b58;
    JTextField tfUsuario, tfPerfil, tfCodigo, tfData, enterField;

    String nome, senha, data, Usuario;
    int passo = 0;
    ImageIcon icone = new ImageIcon("");
    JPanel painel;

    JLabel lbManobra;
    int origem = 0;
    int performance = 0;

    // Equipamentos eqp = new Equipamentos();
    Equipamentos345kV eqp1 = new Equipamentos345kV();
    BDadosUsuario U = new BDadosUsuario();
    BDadosAcesso BDE = new BDadosAcesso();
    BDOperaçoes BDO = new BDOperaçoes();
    BDEquipamentos BDEQ = new BDEquipamentos();
    ManobraInteligente1 manobrainteligente1 = new ManobraInteligente1();
    Relogio relogio = new Relogio();

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
    String seccionadora89a1fechada = "";
    String seccionadora89a1aberta = "";
    String seccionadora89a1efechada = "";
    String seccionadora89a1eaberta = "";
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
    String seccionadora89lvr1fechada = "";
    String seccionadora89lvr1aberta = "";
    String seccionadora89lvr1efechada = "";
    String seccionadora89lvr1eaberta = "";
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
    String seccionadora89tufechada = "";
    String seccionadora89tuaberta = "";
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
    String disjuntor52lvrrfechado = "";
    String disjuntor52lvrraberto = "";
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

    public InterfaceMTR() {
        Container c = getContentPane();
        setLayout(new BorderLayout()); // gerenciador de layout

        setTitle("Barramento de 34.5 kV MT-R");
        setSize(665, 540);
        setBackground(new Color(180, 180, 180));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Object[] options = { "Sim", "Nao", "Cancelar" };
        int n = JOptionPane.showOptionDialog(null,
                "Você deseja habilitar alguma manobra para Simulação? ",
                "Habilitar", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        if (n == JOptionPane.YES_OPTION) {
            MenuManobrasG MM = new MenuManobrasG();
            MM.setVisible(true);
        }

        JLabel l1 = new JLabel();
        l1.setFont(new Font("Arial", 1, 30));
        l1.setText("MT-R Barramento de 34,5 kV");
        l1.setForeground(Color.green);

        Icon imagem1 = new ImageIcon("Carlos4.GIF");
        gif1 = new JLabel();
        gif1.setIcon(imagem1);
        gif1.setBounds(963, 624, 100, 100); // Coluna,Linha,Largura,Altura
        gif1.setBackground(new Color(204, 204, 255)); // cor de fundo do bot�o
        getContentPane().add(gif1);

        status1 = new JLabel();

        painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(new Color(0, 128, 128));
        painel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(0, 128, 128));
        p1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p1.add(l1);

        tfUsuario = new JTextField("         Default     ");
        tfUsuario.setEditable(false);
        tfUsuario.addActionListener(this);
        tfUsuario.setFont(new Font("Dialog", Font.BOLD, 16));
        tfUsuario.setBackground(new Color(0, 0, 0));// cor de fundo do bot�o
        tfUsuario.setForeground(Color.yellow);
        tfUsuario.setBounds(892, 0, 124, 25); // Coluna,Linha,Largura,Altura
        // getContentPane().add(tfUsuario);

        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat(" dd/MM/yyyy hh:mm:ss"); // somente a data em um objeto separado
        String date = formato.format(data); // variavel date recebe o conteudo do objeto data
        tfData = new JTextField(date);
        tfData.setEditable(false);
        tfData.setFont(new Font("Dialog", Font.BOLD, 12));
        tfData.setBackground(new Color(0, 0, 0));// cor de fundo do bot�o
        tfData.setForeground(Color.yellow);
        tfData.setBounds(892, 25, 124, 25); // Coluna,Linha,Largura,Altura
        // getContentPane().add(tfData);

        c.add(p1, java.awt.BorderLayout.NORTH);

        // ���������������������������������������������� BARRAS TR E EM
        // ���������������������������������������������
        JPanel v = new JPanel(); // Barra TR
        v.setBounds(140, 5, 500, 3);
        v.setBackground(Color.orange);
        painel.add(v);

        JPanel v1 = new JPanel(); // Barra EM
        v1.setBounds(140, 30, 500, 3);
        v1.setBackground(Color.orange);
        painel.add(v1);

        barra1 = new JLabel("Barra TR"); // IDENTIFICA��O DA BARRA TR
        barra1.setForeground(Color.white);
        barra1.setBounds(140, 0, 60, 30);
        painel.add(barra1);

        barra2 = new JLabel("Barra EM");
        barra2.setForeground(Color.white);
        barra2.setBounds(140, 25, 60, 30); // IDENTIFICA��O DA BARRA EM
        painel.add(barra2);
        // ##################################### IDENTIFICA��O DOS EQUIPAMENTOS
        // ####################################

        l1a = new JLabel("89 LR-R");
        l1a.setForeground(Color.white);
        l1a.setBounds(410, 40, 60, 30);
        painel.add(l1a);
        l1b = new JLabel("89 LR-RE");
        l1b.setForeground(Color.white);
        l1b.setBounds(495, 40, 60, 30);
        painel.add(l1b);
        ta1 = new JLabel("89 TAR");
        ta1.setForeground(Color.white);
        ta1.setBounds(306, 40, 60, 30);
        painel.add(ta1);

        l152 = new JLabel("52 LVR-R");
        l152.setForeground(Color.white);
        l152.setBounds(470, 150, 60, 30);
        painel.add(l152);
        ta1 = new JLabel("TA1");

        lvr1 = new JLabel("LVR-R");
        lvr1.setForeground(Color.white);
        lvr1.setBounds(390, 255, 60, 30);
        painel.add(lvr1);
        lvr1 = new JLabel("TF Regulador 34,5/34,5kV");
        lvr1.setForeground(Color.white);
        lvr1.setBounds(460, 295, 260, 30);
        painel.add(lvr1);
        pla1 = new JLabel("Trafo de Aterramento");
        pla1.setForeground(Color.white);
        pla1.setBounds(490, 190, 260, 30);
        painel.add(pla1);

        // ������������������������������������������� BAY DO LVR-R
        // ���������������������������������������������

        JPanel v22 = new JPanel(); // SECCIONADORA 89 LVR-R
        v22.setBounds(405, 8, 3, 55);
        v22.setBackground(Color.orange);
        painel.add(v22);

        JPanel v23 = new JPanel();
        v23.setBounds(405, 103, 3, 23); // Seccionadora 89 LVR-R / Disjuntor
        v23.setBackground(Color.orange);
        painel.add(v23);

        JPanel v24 = new JPanel(); // Seccionadora 89 LVR-RE
        v24.setBounds(490, 30, 3, 33);
        v24.setBackground(Color.orange);
        painel.add(v24);

        JPanel v25 = new JPanel(); // SECCIONADORA 89 LVR-R / DISJUNTOR 52 LVR-R
        v25.setBounds(490, 103, 3, 23);
        v25.setBackground(Color.orange);
        painel.add(v25);

        JPanel v26 = new JPanel(); // DISJUNTOR / TRAFO LVR-R
        v26.setBounds(450, 185, 3, 65);
        v26.setBackground(Color.orange);
        painel.add(v26);

        JPanel v27 = new JPanel(); // SECCIONADORA LVRR / SECCIONADORA LVRR-E
        v27.setBounds(405, 125, 88, 3);
        v27.setBackground(Color.orange);
        painel.add(v27);

        JPanel v28 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v28.setBounds(450, 126, 3, 20);
        v28.setBackground(Color.orange);
        painel.add(v28);

        JPanel v44 = new JPanel(); // TRANSFORMADOR / BARRA RR
        v44.setBounds(451, 289, 3, 61);
        v44.setBackground(Color.yellow);
        painel.add(v44);

        // ���������������������������������������������� BARRAS RR E EM
        // ���������������������������������������������
        JPanel v45 = new JPanel(); // Barra RR
        v45.setBounds(350, 350, 210, 3);
        v45.setBackground(Color.yellow);
        painel.add(v45);

        // ���������������������������������������� BAY DA TRAFO TA-R
        // ������������������������������������������������������

        JPanel v68 = new JPanel(); // SECCIONADORA 89 TAR
        v68.setBounds(300, 8, 3, 55);
        v68.setBackground(Color.orange);
        painel.add(v68);

        JPanel v69 = new JPanel();
        v69.setBounds(300, 103, 3, 50); // Seccionadora 89 TA-R / Disjuntor
        v69.setBackground(Color.orange);
        painel.add(v69);

        // ����������������������������������� CRIA��O DO BOT�O 89 LVR1
        // �����������������������������������������������

        b19 = new JButton(); // BOT�O CS 89 LVR1
        b19.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b19.addActionListener(this);
        b19.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b19.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b19.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b19.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b19.setForeground(Color.black);// cor do titulo do bot�o
        b19.setEnabled(true);
        b19.setToolTipText("Pressione para operar a Seccionadora 89 LVR1");
        b19.setMnemonic(KeyEvent.VK_B);
        b19.setActionCommand("89LVR1");// define o nome da acao
        b19.setBounds(390, 62, 33, 45);
        painel.add(b19);

        // ����������������������������������� CRIA��O DO BOT�O 89 LVR1-E
        // �����������������������������������������������

        b20 = new JButton(); // BOT�O CS 89 LVR1-E
        b20.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b20.addActionListener(this);
        b20.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b20.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b20.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b20.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b20.setForeground(Color.black);// cor do titulo do bot�o
        b20.setEnabled(true);
        b20.setToolTipText("Pressione para operar a Seccionadora 89 LVR-1E");
        b20.setMnemonic(KeyEvent.VK_B);
        b20.setActionCommand("89LVR-1E");// define o nome da acao
        b20.setBounds(475, 62, 33, 45);
        painel.add(b20);

        // ����������������������������������� CRIA��O DO BOT�O 52 LVR1
        // �����������������������������������������������

        b21 = new JButton(); // BOT�O 52 LVR1
        b21.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b21.addActionListener(this);
        b21.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b21.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b21.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b21.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b21.setForeground(Color.black);// cor do titulo do bot�o
        b21.setEnabled(true);
        b21.setToolTipText("Pressione para operar O Disjuntor 52 LVR-1");
        b21.setMnemonic(KeyEvent.VK_B);
        b21.setActionCommand("52LVR-1");// define o nome da acao
        b21.setBounds(435, 145, 33, 42);
        painel.add(b21);

        // ����������������������������������� CRIA��O DO BOT�ES DE CONTROLE DO TRAFO
        // LVR-1 �����������������������

        b22 = new JButton("+"); // TAP LVR-1
        b22.setBounds(475, 250, 41, 15);
        b22.addActionListener(this);
        painel.add(b22);

        b23 = new JButton("-"); // TAP LVR-1
        b23.setBounds(475, 270, 41, 15);
        b23.addActionListener(this);
        painel.add(b23);

        tap1 = new JLabel("0 Kv"); // VALOR DE TENS�O DA BARRA R1
        tap1.setForeground(Color.white);
        tap1.setBounds(406, 285, 60, 30);
        painel.add(tap1);

        valortap1 = new JLabel(eqp1.getMostrarTapslvr1()); // VALOR TAP LVR-1
        valortap1.setForeground(Color.white);
        valortap1.setBounds(482, 280, 60, 30);
        painel.add(valortap1);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO LVR-1
        // ������������������������������������������

        b35 = new JButton(); // BOT�O TRANSFORMADOR LVR-1
        b35.setIcon(new javax.swing.ImageIcon("LVR.jpg"));
        b35.addActionListener(this);
        b35.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b35.setToolTipText("Pressione para comutar o Tap do Transformador LVR-1");
        b35.setHorizontalTextPosition(AbstractButton.CENTER);
        b35.setVerticalTextPosition(AbstractButton.CENTER);
        b35.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b35.setBounds(434, 250, 36, 40);
        painel.add(b35);

        // ����������������������������������� CRIA��O DO BOT�O 89 TA-1
        // �����������������������������������������������

        b55 = new JButton(); // BOT�O CS 89 TA1
        b55.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b55.addActionListener(this);
        b55.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b55.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b55.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b55.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b55.setForeground(Color.black);// cor do titulo do bot�o
        b55.setEnabled(true);
        // b20.setToolTipText("Pressione para operar a Seccionadora 89 TA1");
        b55.setMnemonic(KeyEvent.VK_B);
        b55.setActionCommand("89TA1");// define o nome da acao
        b55.setBounds(285, 62, 33, 45);
        painel.add(b55);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO TA-1
        // ������������������������������������������

        b54 = new JButton(); // BOT�O TRANSFORMADOR TA-1
        b54.setIcon(new javax.swing.ImageIcon("TA1.jpg"));
        b54.addActionListener(this);
        b54.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        // b54.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b54.setHorizontalTextPosition(AbstractButton.CENTER);
        b54.setVerticalTextPosition(AbstractButton.CENTER);
        b54.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b54.setBounds(267, 148, 55, 46);
        painel.add(b54);

        // ��������������������������������������� CRIA��O DO BOT�O SAIR
        // �������������������������������������������

        b34 = new JButton("");
        b34.setIcon(new javax.swing.ImageIcon("Porta.jpg"));
        b34.addActionListener(this);
        b34.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b34.setToolTipText("Pressione para encerrar o programa");
        b34.setHorizontalTextPosition(AbstractButton.CENTER);
        b34.setVerticalTextPosition(AbstractButton.CENTER);
        b34.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b34.setBounds(330, 380, 32, 58);
        painel.add(b34);

        // ��������������������������������������� BOT�O SETA
        // ��������������������������������������

        b40 = new JButton("");
        b40.setIcon(new javax.swing.ImageIcon("Seta.jpg"));
        b40.addActionListener(this);
        b40.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b40.setToolTipText("Pressione para acessar as Telas de 34,5 kV");
        b40.setHorizontalTextPosition(AbstractButton.CENTER);
        b40.setVerticalTextPosition(AbstractButton.CENTER);
        b40.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b40.setBounds(80, 186, 30, 30);
        painel.add(b40);

        c.add(painel, java.awt.BorderLayout.CENTER);

        atualizaConfiguracao();

    }

    // -��������������������������������������������������������������������������������������������������������������
    public void actionPerformed(ActionEvent e) // metodo implementado pelo ActionListener
    {
        // #################################################### BOT�O DE AC�O DA CS 89
        // LVR-R ##########################################################

        if (e.getSource() == b19) {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado da Seccionadora 89 LVR-R?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89lvrr().equals("Seccionadora Aberta")) {
                    b19.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89lvrr();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-A foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // BDE.incluir89l1afechada(usuario, data);
                    seccionadora89lvrrfechada = "Seccionadora 89LVRR Fechada";
                    // PrepAlbras = "PrepAlbras";
                    // manobrainteligente1.PrepAlbras();
                }

                else if (eqp1.seccionadora89lvrr().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvrr().equals("Disjuntor Aberto")) {
                    b19.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89lvrr();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-A foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // BDE.incluir89l1aaberta(usuario, data);
                    seccionadora89lvrraberta = "Seccionadora 89LVRR Aberta";
                    PrepAlbras = "PrepAlbras";
                    manobrainteligente1.PrepAlbras();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Lógica de Intertravamento não Satisfeita! \n DISJUNTOR 52 LVR-R FECHADO! \n ",
                            "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 LVR-R " + eqp1.seccionadora89lvrr());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // LVR-RE #########################################################
        if (e.getSource() == b20) {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado da Seccionadora 89 LVR-RE?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89lvrre().equals("Seccionadora Aberta")) {
                    b20.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89lvrre();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // BDE.incluir89l1bfechada(usuario, data);

                    seccionadora89lvrrefechada = "Seccionadora 89LVRRE Fechada";
                    // PrepAlbras = "PrepAlbras";
                    // manobrainteligente1.PrepAlbras();

                } else if (eqp1.seccionadora89lvrre().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvrr().equals("Disjuntor Aberto")) {
                    b20.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89lvrre();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));;

                    // BDE.ConectarBD();
                    // BDE.incluir89l1baberta(usuario, data);
                    seccionadora89lvrreaberta = "Seccionadora 89LVRRE Aberta";
                    PrepAlbras = "PrepAlbras";
                    manobrainteligente1.PrepAlbras();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Lógica de Intertravamento não Satisfeita! \n DISJUNTOR 52 LVR-R FECHADO! \n ",
                            "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 LVR-RRE " + eqp1.seccionadora89lvrre());
        }

        // ################################################# AC�O DO BOT�O DO 52 LVR-R
        // ##############################################################
        if (e.getSource() == b21) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado do Disjuntor 52 LVR-R?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52lvrr().equals("Disjuntor Aberto")) {
                    b21.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52lvrr();
                    // valortap1.setText (eqp1.getMostrarTapslvr1());
                    // BDE.ConectarBD();
                    // BDE.incluir52l1fechado(usuario, data);

                    disjuntor52lvrrfechado = "Disjuntor 52LVRR Fechado";
                    PrepAlbras = "PrepAlbras";
                    manobrainteligente1.PrepAlbras();
                }

                else if (eqp1.disjuntor52lvrr().equals("Disjuntor Fechado")) {
                    b21.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52lvrr();
                    // tap1.setText("0 kV");
                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52l1aberto(usuario, data);

                    disjuntor52lvrraberto = "Disjuntor 52LVRR Aberto";
                    // PrepAlbras = "PrepAlbras";
                    // manobrainteligente1.PrepAlbras();
                }
            }
            if (eqp1.disjuntor52lvrr().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89lvrr().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52lvrr().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89lvrre().equals("Seccionadora Aberta")) {
                status1.setText("O TRANSFORMADOR ESTA DESENERGIZADO! ");
            }
        }

        // ������������������������������� A��O DOS BOT�ES DE COMUTA��O DE TAP'S DO
        // LVR-R ����������������������������
        if (e.getSource() == b35) {
            status1.setText(" O Transformador LVR-R está no Tap:" + eqp1.getMostrarTapslvrr());
            JOptionPane.showMessageDialog(null, "  O Transformador LVR-1 está no:  " + eqp1.getMostrarTapslvrr(),
                    "Disjuntor", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
        }
        if (e.getSource() == b22) {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja Subir o Tap do Transformador LVR-R?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.getTapslvr1() == 32)
                    JOptionPane.showMessageDialog(null, "O Transformador LVR-R está no Tap Máximo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp1.aumentarTaplvrr();
                status1.setText(" O Transformador LVR-1 está no:  " + eqp1.getMostrarTapslvrr());
                valortap1.setText(eqp1.getMostrarTapslvrr());

                if (eqp1.seccionadora89lvrr().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvrr().equals("Disjuntor Fechado")
                        || eqp1.seccionadora89lvrre().equals("Seccionadora Fechada")
                                && eqp1.disjuntor52lvrr().equals("Disjuntor Fechado")) {
                    tap1.setText(eqp1.getValorTaplvrr());
                }
                // BDE.ConectarBD();
                // BDE.incluirlvr1Aumentar(usuario, data);
                // BDEQ.ConectarBD();
                // BDEQ.QuantAumentoTaplvr1();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Lógica de Intertravamento não Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                        "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
            }
        }
        if (e.getSource() == b23) {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja Descer Tap do Transformador?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.getTapslvrr() == 0)
                    JOptionPane.showMessageDialog(null, "O Transformador LVR-R está no Tap Mínimo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp1.diminuirTaplvrr();
                status1.setText(" O Transformador LVR-R está no:  " + eqp1.getMostrarTapslvrr());
                valortap1.setText(eqp1.getMostrarTapslvr1());
                if (eqp1.seccionadora89lvrr().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvrr().equals("Disjuntor Fechado")
                        || eqp1.seccionadora89lvrre().equals("Seccionadora Fechada")
                                && eqp1.disjuntor52lvrr().equals("Disjuntor Fechado")) {
                    tap1.setText(eqp1.getValorTaplvrr());
                }
                // BDE.ConectarBD();
                // BDE.incluirmt1Abaixar(usuario, data);
                // BDEQ.ConectarBD();
                // BDEQ.QuantDiminuirTapmt1();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Lógica de Intertravamento não Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                        "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
            }
        }
        // ################################################# AC�O DO BOT�O DA
        // SECCIONADORA 89 TAR
        // ##############################################################
        if (e.getSource() == b55) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado da Seccionadora 89 TAR?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89tar().equals("Seccionadora Aberta")) {
                    b55.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89tar();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);
                } else if (eqp1.seccionadora89tar().equals("Seccionadora Fechada")) {
                    b55.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89tar();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);
                }
            }
            status1.setText(" 89 TAR " + eqp1.seccionadora89tar());
        }
        // ####################################################### AC�O DO BOT�O SAIR
        // #########################################################

        if (e.getSource() == b34) // ----------- BOT�O SAIR ----------------//
        {
            new InterfaceMenu().setVisible(true);
            setVisible(false);
        }

        if (e.getSource() == b40) {
            new InterfaceMenu().setVisible(true);
            setVisible(false);
        }
    }

    public void atualizaConfiguracao() {
        eqp1.fecharSeccionadora89lvrr();
        eqp1.fecharSeccionadora89lvrre();
        eqp1.fecharDisjuntor52lvrr();
        eqp1.fecharSeccionadora89tar();
        b19.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b20.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b21.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b55.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
    }

    // ####################################################### Menu Geral das
    // Manobras
    public class MenuManobrasG extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        // private JPanel jpPainel = new JPanel();

        public MenuManobrasG() // --- Configura��o do Frame
        {
            super("Menu Geral das Manobras");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout

            setSize(420, 300);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);

            JLabel lbIndice;

            // final JLabel mostrar1;
            // final JLabel mostrar2;
            // final JLabel mostrar3;

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
            bManTransferencia.setToolTipText("Pressione para chamar o Menu das Manobras de Transfer�ncia");
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

            bManEletronorte.setBackground(new Color(180, 180, 250));
            // bMan230.setBackground(new Color(180, 180, 250));
            bManReduçao.setBackground(new Color(180, 180, 250));
            bManTransferencia.setBackground(new Color(180, 180, 250));
            bManGeradores.setBackground(new Color(180, 180, 250));
            // bSair.setBackground(new Color(180,180,250));

            container.add(painel);

            bManEletronorte.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    MEActionPerformed(evt);
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
        }

        private void MRActionPerformed(ActionEvent evt) {
            // new MenuManobrasReduçao().setVisible(true);
            // setVisible(false);
            // this.hide();
        }

        private void MTActionPerformed(ActionEvent evt) {
            // new MenuManobrasTransf().setVisible(true);
            // setVisible(false);
            // this.hide();
        }

        private void MAGActionPerformed(ActionEvent evt) {
            // new MenuManobrasGerador().setVisible(true);
            // setVisible(false);
            // this.hide();
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
            // getContentPane().add(bEnerGerador);

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

            bDesenAlbras.setBackground(new Color(180, 180, 250));
            bEnerAlbras.setBackground(new Color(180, 180, 250));
            bPrepAlbras.setBackground(new Color(180, 180, 250));

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
                            " A Manobra para preparar a Subestação foi Habilitada com Sucesso!!!");
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

    // ############################################# Classe de Manobras Executadas
    public class ManobraExecutada extends JFrame // implements ActionListener
    {
        // private JLabel gif, projeto;
        String manobra = "";

        public ManobraExecutada() {
            setTitle("Ordem de Manobra  " + "Executada");
            Container container = getContentPane();
            container.setLayout(new BorderLayout());
            setResizable(false);

            // Box box = Box.createHorizontalBox();

            setSize(440, 450);
            setLocation(0, 285);
            // painel.setBackground(new Color(255,255,255));
            setVisible(true);

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
            final JLabel projeto;

            JButton Comparar;
            JButton Limpar;
            JButton Sair;
            // JButton Manobra;

            final JLabel lbManobra;

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
                    if (EnerAlbras.equals("EnergizarAlbras")) {
                        mostrar1.setText("           " + disjuntor52l1fechado);
                        mostrar2.setText("           " + disjuntor52l2fechado);
                        mostrar3.setText("           " + disjuntor52btfechado);
                        mostrar4.setText("           " + disjuntor52alfechado);
                        mostrar5.setText("          " + disjuntor52mt1fechado);
                        mostrar6.setText("          " + disjuntor52mtrfechado);
                        mostrar7.setText("          " + disjuntor52mt2fechado);
                        mostrar8.setText("          " + disjuntor52mt3fechado);
                        mostrar9.setText("          " + disjuntor52mt4fechado);
                        mostrar10.setText("          " + disjuntor52a1fechado);
                        mostrar11.setText("          " + disjuntor52a2fechado);
                        mostrar12.setText("          " + disjuntor52a3fechado);
                        mostrar13.setText("          " + disjuntor52a4fechado);
                        mostrar14.setText("          " + disjuntor52a5fechado);
                        mostrar15.setText("          " + disjuntor52a6fechado);
                        mostrar16.setText("          " + disjuntor52a3fechado);
                        mostrar17.setText("          " + disjuntor52a4fechado);
                        mostrar18.setText("          " + disjuntor52p1fechado);
                        mostrar19.setText("          " + disjuntor52p2fechado);
                        mostrar20.setText("          " + disjuntor52p3fechado);
                        mostrar21.setText("          " + disjuntor52p4fechado);
                        mostrar22.setText("          " + disjuntor52p5fechado);
                        mostrar23.setText("          " + disjuntor52p3fechado);
                    }

                    if (DesenAlbras.equals("DesenergizarAlbras")) {
                        mostrar1.setText("            " + disjuntor52l1aberto);
                        mostrar2.setText("            " + disjuntor52l2aberto);
                        mostrar3.setText("            " + disjuntor52btaberto);
                        mostrar4.setText("            " + disjuntor52alaberto);
                        mostrar5.setText("           " + disjuntor52mt1aberto);
                        mostrar6.setText("           " + disjuntor52mtraberto);
                        mostrar7.setText("           " + disjuntor52mt2aberto);
                        mostrar8.setText("           " + disjuntor52mt3aberto);
                        mostrar9.setText("           " + disjuntor52mt4aberto);
                        mostrar10.setText("           " + disjuntor52a1aberto);
                        mostrar11.setText("           " + disjuntor52a2aberto);
                        mostrar12.setText("           " + disjuntor52a3aberto);
                        mostrar13.setText("           " + disjuntor52a4aberto);
                        mostrar14.setText("           " + disjuntor52a5aberto);
                        mostrar15.setText("           " + disjuntor52a6aberto);
                        mostrar16.setText("           " + disjuntor52a3aberto);
                        mostrar17.setText("           " + disjuntor52a4aberto);
                        mostrar18.setText("           " + disjuntor52p1aberto);
                        mostrar19.setText("           " + disjuntor52p2aberto);
                        mostrar20.setText("           " + disjuntor52p3aberto);
                        mostrar21.setText("           " + disjuntor52p4aberto);
                        mostrar22.setText("           " + disjuntor52p5aberto);
                        mostrar23.setText("           " + disjuntor52p3aberto);
                    }

                    if (PrepAlbras.equals("PrepAlbras")) {
                        mostrar1.setText("         " + seccionadora89a2aberta);
                        mostrar2.setText("         " + seccionadora89a4aberta);
                        mostrar3.setText("         " + seccionadora89a6aberta);
                        mostrar4.setText("         " + seccionadora89a4aberta);
                        mostrar5.setText("       " + seccionadora89lvrreaberta);
                        mostrar6.setText("       " + seccionadora89lvrraberta);
                        mostrar7.setText("         " + seccionadora89p1aberta);
                        mostrar8.setText("         " + seccionadora89p2aberta);
                        mostrar9.setText("         " + seccionadora89p3aberta);
                        mostrar10.setText("        " + seccionadora89p4aberta);
                        mostrar11.setText("        " + seccionadora89p5aberta);
                        mostrar12.setText("        " + seccionadora89p3aberta);
                        mostrar13.setText("      " + seccionadora89a2efechada);
                        mostrar14.setText("      " + seccionadora89a4efechada);
                        mostrar15.setText("      " + seccionadora89a6efechada);
                        mostrar16.setText("      " + seccionadora89a4efechada);
                        mostrar17.setText("      " + seccionadora89p1efechada);
                        mostrar18.setText("      " + seccionadora89p2efechada);
                        mostrar19.setText("      " + seccionadora89p3efechada);
                        mostrar20.setText("      " + seccionadora89p4efechada);
                        mostrar21.setText("      " + seccionadora89p5efechada);
                        mostrar22.setText("      " + seccionadora89p3efechada);
                        mostrar23.setText("      " + seccionadora89tuefechada);
                        mostrar24.setText("          " + disjuntor52tufechado);
                    }

                    if (EnerGerador.equals("EnergizarGerador")) {
                        mostrar1.setText("                " + disjuntor52g1fechado);
                        mostrar2.setText("                " + disjuntor52g2fechado);
                    }

                    if (DeslProgRed1.equals("DeslProgRed1")) {
                        mostrar1.setText("                 " + disjuntor52c1aberto);
                        mostrar2.setText("                 " + disjuntor52c2aberto);
                        mostrar3.setText("                 " + disjuntor52r6aberto);
                        mostrar4.setText("               " + disjuntor52lvr1aberto);
                    }

                    if (NormRed1.equals("NormalizacaoRed1")) {
                        mostrar1.setText("                " + disjuntor52lvr1fechado);
                        mostrar2.setText("                 " + disjuntor52r6fechado);
                        mostrar3.setText("                  " + disjuntor52c1fechado);
                        mostrar4.setText("                             " + disjuntor52c2fechado);
                    }

                    if (TransfMT1MTR.equals("TransferirMT1MTR")) {
                        mostrar1.setText("            " + disjuntor52p2aberto);
                        mostrar2.setText("         " + seccionadora89p2aberta);
                        mostrar3.setText("       " + seccionadora89p2efechada);
                        mostrar4.setText("            " + disjuntor52c1aberto);
                        mostrar5.setText("            " + disjuntor52c2aberto);
                        mostrar6.setText("            " + disjuntor52r1aberto);
                        mostrar7.setText("         " + seccionadora89r1aberta);
                        mostrar8.setText("       " + seccionadora89r1efechada);
                        mostrar9.setText("           " + disjuntor52r1fechado);
                        mostrar10.setText("           " + disjuntor52r2aberto);
                        mostrar11.setText("        " + seccionadora89r2aberta);
                        mostrar12.setText("      " + seccionadora89r2efechada);
                        mostrar13.setText("          " + disjuntor52r2fechado);
                        mostrar14.setText("          " + disjuntor52p2fechado);
                        mostrar15.setText("           " + disjuntor52p1aberto);
                        mostrar16.setText("        " + seccionadora89c1aberta);
                        mostrar17.setText("      " + seccionadora89c1efechada);
                        mostrar18.setText("        " + seccionadora89c2aberta);
                        mostrar19.setText("      " + seccionadora89c2efechada);
                        mostrar20.setText("          " + disjuntor52c1fechado);
                        mostrar21.setText("          " + disjuntor52c2fechado);
                        mostrar22.setText("        " + seccionadora89p1aberta);
                        mostrar23.setText("      " + seccionadora89p1efechada);
                        mostrar24.setText("          " + disjuntor52p1fechado);
                    }

                    if (TransfMTRMT1.equals("TransferirMTRMT1")) {
                        mostrar1.setText("             " + disjuntor52p2aberto);
                        mostrar2.setText("         " + seccionadora89p2eaberta);
                        mostrar3.setText("         " + seccionadora89p2fechada);
                        mostrar4.setText("             " + disjuntor52c1aberto);
                        mostrar5.setText("             " + disjuntor52c2aberto);
                        mostrar6.setText("             " + disjuntor52r1aberto);
                        mostrar7.setText("         " + seccionadora89r1eaberta);
                        mostrar8.setText("         " + seccionadora89r1fechada);
                        mostrar9.setText("            " + disjuntor52r1fechado);
                        mostrar10.setText("            " + disjuntor52r2aberto);
                        mostrar11.setText("        " + seccionadora89r2eaberta);
                        mostrar12.setText("        " + seccionadora89r2fechada);
                        mostrar13.setText("           " + disjuntor52r2fechado);
                        mostrar14.setText("           " + disjuntor52p2fechado);
                        mostrar15.setText("            " + disjuntor52p1aberto);
                        mostrar16.setText("        " + seccionadora89c1eaberta);
                        mostrar17.setText("        " + seccionadora89c1fechada);
                        mostrar18.setText("        " + seccionadora89c2eaberta);
                        mostrar19.setText("        " + seccionadora89c2fechada);
                        mostrar20.setText("           " + disjuntor52c1fechado);
                        mostrar21.setText("           " + disjuntor52c2fechado);
                        mostrar22.setText("        " + seccionadora89p1eaberta);
                        mostrar23.setText("        " + seccionadora89p1fechada);
                        mostrar24.setText("           " + disjuntor52p1fechado);
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
                        mostrar3.setText("            " + disjuntor52g1aberto);
                        mostrar4.setText("            " + disjuntor52g2aberto);
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
                        manobra = " OM para Energizar os Geradores";
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

                    if (TransfMT1MTR.equals("TransferirMT1MTR")) {
                        manobra = " OM para Transferir do Trafo MT-1 para o MT-R";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT1.equals("TransferirMTRMT1")) {
                        manobra = " OM para Transferir do Traffo MT-R para o MT-1";
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
                    limparMemoria();
                }
            });

            Sair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    setVisible(false);
                }
            });
        }// Fim main

    }// Fim Teste

    // ############################################# Classe de Manobras Padrão
    public class ManobraPadrao extends JFrame // implements ActionListener
    {
        // private JLabel gif, projeto;
        String manobra = "";

        public ManobraPadrao() {
            setTitle("Ordem de Manobra  " + "Padrão");
            Container container = getContentPane();
            container.setLayout(new BorderLayout());
            setResizable(false);

            // Box box = Box.createHorizontalBox();

            setSize(455, 450);
            setLocation(440, 285);
            setVisible(true);

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
            final JLabel projeto;

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
                    if (EnerAlbras.equals("EnergizarAlbras")) {
                        // mostrar1.setText(" 1. Fechar Disjuntor 52 L1");
                        // mostrar2.setText(" 2. Fechar Disjuntor 52 L2");
                        // mostrar3.setText(" 3. Fechar Disjuntor 52 BT");
                        // mostrar4.setText(" 4. Fechar Disjuntor 52 AL");
                        // mostrar5.setText(" 5. Fechar Disjuntor 52 MT-1");
                        // mostrar6.setText(" 6. Fechar Disjuntor 52 MT-R");
                        // mostrar7.setText(" 7. Fechar Disjuntor 52 MT-2");
                        // mostrar8.setText(" 8. Fechar Disjuntor 52 MT-3");
                        // mostrar9.setText(" 9. Fechar Disjuntor 52 MT-4");
                        mostrar10.setText("       10. Fechar disjuntor 52 A1");
                        mostrar11.setText("       11. Fechar disjuntor 52 A2");
                        // mostrar12.setText(" 12. Fechar disjuntor 52 A3");
                        // mostrar13.setText(" 13. Fechar disjuntor 52 A4");
                        // mostrar14.setText(" 14. Fechar disjuntor 52 A5");
                        // mostrar15.setText(" 15. Fechar disjuntor 52 A6");
                        // mostrar16.setText(" 16. Fechar disjuntor 52 A7");
                        // mostrar17.setText(" 17. Fechar disjuntor 52 A8");
                        mostrar18.setText("       18. Fechar disjuntor 52 P1");
                        mostrar19.setText("       19. Fechar disjuntor 52 P2");
                        // mostrar20.setText(" 20. Fechar disjuntor 52 P3");
                        // mostrar21.setText(" 21. Fechar disjuntor 52 P4");
                        // mostrar22.setText(" 22. Fechar disjuntor 52 P5");
                        // mostrar23.setText(" 23. Fechar disjuntor 52 P6");
                    }

                    if (DesenAlbras.equals("DesenergizarAlbras")) {
                        mostrar10.setText("       10. Abrir disjuntor 52 A1");
                        mostrar11.setText("       11. Abrir disjuntor 52 A2");
                        // mostrar12.setText(" 12. Abrir disjuntor 52 A3");
                        // mostrar13.setText(" 13. Abrir disjuntor 52 A4");
                        // mostrar14.setText(" 14. Abrir disjuntor 52 A5");
                        // mostrar15.setText(" 15. Abrir disjuntor 52 A6");
                        // mostrar16.setText(" 16. Abrir disjuntor 52 A7");
                        // mostrar17.setText(" 17. Abrir disjuntor 52 A8");
                        mostrar18.setText(" 18. Abrir disjuntor 52 P1");
                        mostrar19.setText(" 19. Abrir disjuntor 52 P2");
                        // mostrar20.setText(" 20. Abrir disjuntor 52 P3");
                        // mostrar21.setText(" 21. Abrir disjuntor 52 P4");
                        // mostrar22.setText(" 22. Abrir disjuntor 52 P5");
                        // mostrar23.setText(" 23. Abrir disjuntor 52 P6");
                    }

                    if (PrepAlbras.equals("PrepAlbras")) {
                        mostrar1.setText("1. Abrir Seccionadora 89 A2-E  ");
                        // mostrar2.setText("2. Abrir Seccionadora 89 A4-E ");
                        // mostrar3.setText("3. Abrir Seccionadora 89 A6-E ");
                        // mostrar4.setText("4. Abrir Seccionadora 89 A8-E ");
                        mostrar5.setText("5.Abrir Seccionadora 89 LVRR-E ");
                        mostrar6.setText("6. Abrir Seccionadora 89 LVR-R");
                        mostrar7.setText("7. Abrir Seccionadora 89 P1");
                        mostrar8.setText("8. Abrir Seccionadora 89 P2");
                        // mostrar9.setText("9. Abrir Seccionadora 89 P3 ");
                        // mostrar10.setText("10. Abrir Seccionadora 89 P4 ");
                        // mostrar11.setText("11. Abrir Seccionadora 89 P5 ");
                        // mostrar12.setText("12. Abrir Seccionadora 89 P6 ");
                        mostrar13.setText("13.Fechar Seccionadora 89 A2-E");
                        // mostrar14.setText("14.Fechar Seccionadora 89 A4-E");
                        // mostrar15.setText("15.Fechar Seccionadora 89 A6-E");
                        // mostrar16.setText("16.Fechar Seccionadora 89 A8-E");
                        mostrar17.setText("17.Fechar Seccionadora 89 P1-E");
                        mostrar18.setText("18.Fechar Seccionadora 89 P2-E");
                        // mostrar19.setText("19.Fechar Seccionadora 89 P3-E");
                        // mostrar20.setText("20.Fechar Seccionadora 89 P4-E");
                        // mostrar21.setText("21.Fechar Seccionadora 89 P5-E");
                        // mostrar22.setText("22.Fechar Seccionadora 89 P6-E");
                        mostrar23.setText("23.Fechar Seccionadora 89TU-E");
                        mostrar24.setText("24.Fechar Disjuntor 52TU");
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

                    if (TransfMT1MTR.equals("TransferirMT1MTR")) {
                        manobra = " OM para Transferir do Trafo MT-1 para o MT-R ";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT1.equals("TransferirMTRMT1")) {
                        manobra = " OM para Transferir do Trafo MT-R para o MT-1 ";
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
                    limparMemoria();
                }
            });

            Sair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    setVisible(false);
                }
            });
        }// Fim main
    }// Fim Teste

    // ############################################# Classe de Manobras Inteligente
    public class ManobraInteligente1 {
        Relogio relogio = new Relogio();
        ManobraPadrao MP = new ManobraPadrao();

        int origem = 0;
        int passo = 0;
        int performance = 0;

        public ManobraInteligente1() {
            MP.setVisible(false);
        }

        public void EnerAlbras() {
            if (EnerAlbras.equals("EnergizarAlbras")) {
                relogio.quantpassos = 23;

                if (disjuntor52a1fechado.equals("Disjuntor 52A1 Fechado") && passo == 0) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso !!!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a2fechado.equals("Disjuntor 52A2 Fechado") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso !!!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52p1fechado.equals("Disjuntor 52P1 Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso !!!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52p2fechado.equals("Disjuntor 52P2 Fechado") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso !!!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar a SE ALBRAS Incorreto, Voce deseja executar o aplicativo Ajuda? ",
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

                if (disjuntor52a1aberto.equals("Disjuntor 52A1 Aberto") && passo == 0) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso !!!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a2aberto.equals("Disjuntor 52A2 Aberto") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null,
                            "Passo 11 realizado com sucesso. Continue no Painel do LVR-2!!!",
                            "Passo para Desenergizar SE ALBRAS.",
                            JOptionPane.INFORMATION_MESSAGE);

                }

                else if (disjuntor52p1aberto.equals("Disjuntor 52P1 Aberto") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso !!!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);

                }

                else if (disjuntor52p2aberto.equals("Disjuntor 52P2 Aberto") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    // relogio.setVisible(true);
                    relogio.rendimento();
                    // relogio.atualizaTempo();
                    JOptionPane.showMessageDialog(null,
                            "Passo 19 realizado com sucesso. Continue no Painel  do LVR-2!!!",
                            " Passo para Desenergizar a SE ALBRAS.",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desenergizar a SE ALBRAS Incorreto, Voce deseja executar o aplicativo Ajuda? ",
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
                relogio.quantpassos = 24;
                if (seccionadora89lvrreaberta.equals("Seccionadora 89LVRRE Aberta") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89lvrraberta.equals("Seccionadora 89LVRR Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 2 && seccionadora89lvrraberta.equals("Seccionadora 89LVRR Aberta") ||
                            passo != 8)
                        JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso !!!",
                                "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para preparar a SE ALBRAS Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnerGerador() {
            if (EnerGerador.equals("EnergizarGerador")) {
                relogio.quantpassos = 2;
                if (disjuntor52g1fechado.equals("Disjuntor 52G1 Fechado") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    passo = passo + 1;
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Energizar os Geradores de Emergencia", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52g2fechado.equals("Disjuntor 52G2 Fechado") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.setVisible(true);
                    relogio.rendimento();
                    relogio.atualizaTempo();

                    if (passo == 2 && disjuntor52g2fechado.equals("Disjuntor 52G2 Fechado") ||
                            passo != 2)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar os Geradores de Emerg�ncia! Conclu�da com sucesso !!!",
                                "Energizar Bay da Linha 1", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
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

        public void TransfMT1MTR() {
            if (TransfMT1MTR.equals("TransferirMT1MTR")) {
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

                else if (seccionadora89r1efechada.equals("Seccionadora 89R1E Fechada") && passo == 7) {
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
                }

                else if (seccionadora89c2aberta.equals("Seccionadora 89C2 Aberta") && passo == 17) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89c2efechada.equals("Seccionadora 89C2E Fechada") && passo == 18) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52c1fechado.equals("Disjuntor 52C1 Fechado") && passo == 19) {
                    passo = passo + 1;
                    relogio.passo = 20;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52c2fechado.equals("Disjuntor 52C2 Fechado") && passo == 20) {
                    passo = passo + 1;
                    relogio.passo = 21;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso !!!",
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

                else if (disjuntor52p1fechado.equals("Disjuntor 52P1 Fechado") && passo == 23) {
                    passo = passo + 1;
                    relogio.passo = 24;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 24 && disjuntor52p1fechado.equals("Disjuntor 52P1 Fechado") ||
                            passo != 24)
                        JOptionPane.showMessageDialog(null,
                                "OM para Transferir do MT-1 para MT-R ! Concluida com sucesso !!!",
                                "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Transferir do MT-1 para o MT-R Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void TransfMTRMT1() {
            if (TransfMTRMT1.equals("TransferirMTRMT1")) {
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

                else if (seccionadora89p2eaberta.equals("Seccionadora 89P2E Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p2fechada.equals("Seccionadora 89P2 Fechada") && passo == 2) {
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

                else if (seccionadora89r1eaberta.equals("Seccionadora 89R1E Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r1fechada.equals("Seccionadora 89R1 Fechada") && passo == 7) {
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

                else if (seccionadora89r2eaberta.equals("Seccionadora 89R2E Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89r2fechada.equals("Seccionadora 89R2 Fechada") && passo == 11) {
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
                } else if (seccionadora89c1eaberta.equals("Seccionadora 89C1E Aberta") && passo == 15) {
                    passo = passo + 1;
                    relogio.passo = 16;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89c1fechada.equals("Seccionadora 89C1 Fechada") && passo == 16) {
                    passo = passo + 1;
                    relogio.passo = 17;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89c2eaberta.equals("Seccionadora 89C2E Aberta") && passo == 17) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (seccionadora89c2fechada.equals("Seccionadora 89C2 Fechada") && passo == 18) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52c1fechado.equals("Disjuntor 52C1 Fechado") && passo == 19) {
                    passo = passo + 1;
                    relogio.passo = 20;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                } else if (disjuntor52c2fechado.equals("Disjuntor 52C2 Fechado") && passo == 20) {
                    passo = passo + 1;
                    relogio.passo = 21;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p1eaberta.equals("Seccionadora 89P1E Aberta") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p1fechada.equals("Seccionadora 89P1 Fechada") && passo == 22) {
                    passo = passo + 1;
                    relogio.passo = 23;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 23 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52p1fechado.equals("Disjuntor 52P1 Fechado") && passo == 23) {
                    passo = passo + 1;
                    relogio.passo = 24;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 24 && disjuntor52p1fechado.equals("Disjuntor 52P1 Fechado") ||
                            passo != 24)
                        JOptionPane.showMessageDialog(null,
                                "OM para Transferir do MT-R para MT-1 ! Concluida com sucesso !!!",
                                "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Transferir do MT-R para o MT-1 Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DeslProgRed1() {
            if (DeslProgRed1.equals("DeslProgRed1")) {
                relogio.quantpassos = 4;
                if (disjuntor52c1aberto.equals("Disjuntor 52C1 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Desligamento da Reduçao 1", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c2aberto.equals("Disjuntor 52C2 Aberto") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Desligamento da Reduçao 1", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r6aberto.equals("Disjuntor 52R6 Aberto") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Desligamento da Reduçao 1", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52lvr1aberto.equals("Disjuntor 52LVR1 Aberto") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 4 && disjuntor52lvr1aberto.equals("Disjuntor 52LVR1 Aberto") ||
                            passo != 4)
                        JOptionPane.showMessageDialog(null, "OM para Desligar a Reduçao 1 ! Concluída com sucesso !!!",
                                "Desligamento da Reduçao 1", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desligar a Redução 1 Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void NormRed1() {
            if (NormRed1.equals("NormalizacaoRed1")) {
                relogio.quantpassos = 4;
                if (disjuntor52lvr1fechado.equals("Disjuntor 52LVR1 Fechado") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Normalizaçao de Reduçao 1", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r6fechado.equals("Disjuntor 52R6 Fechado") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Normalizaçao de Reduçao 1", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c1fechado.equals("Disjuntor 52C1 Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Normalizaçao de Reduçao 1", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c2fechado.equals("Disjuntor 52C2 Fechado") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 4 && disjuntor52lvr1fechado.equals("Disjuntor 52LVR1 Fechado") ||
                            passo != 4)
                        JOptionPane.showMessageDialog(null,
                                "OM para Normalizar a Reduçao I ! Concluida com sucesso !!!",
                                "Normalizaçao de Reduçao 1", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Normalização da Redução 1 Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void EnergBarraEM() {
            if (EnergBarraEM.equals("EnergBarraEM")) {
                relogio.quantpassos = 4;
                if (disjuntor52g1fechado.equals("Disjuntor 52G1 Fechado") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Energizar Barra EM pelo Gerador", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52g2fechado.equals("Disjuntor 52G2 Fechado") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Energizar Barra EM pelo Gerador", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89tuefechada.equals("Seccionadora 89TUE Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Energizar Barra EM pelo Gerador", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52tufechado.equals("Disjuntor 52TU Fechado") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 4 && disjuntor52tufechado.equals("Disjuntor 52TU Fechado") ||
                            passo != 4)
                        JOptionPane.showMessageDialog(null,
                                "OM para Energizar Barra EM pelo Gerador ! Concluida com sucesso !!!",
                                "Energizar Barra EM pelo Gerador", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Transferir do MT-1 para o MT-R Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DesenBarraEM() {
            if (DesenBarraEM.equals("DesenBarraEM")) {
                relogio.quantpassos = 4;
                if (disjuntor52tuaberto.equals("Disjuntor 52TU Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Desenergizar Barra EM pelo Gerador", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89tueaberta.equals("Seccionadora 89TUE Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Desenergizar Barra EM pelo Gerador", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52g1aberto.equals("Disjuntor 52G1 Aberto") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Desenergizar Barra EM pelo Gerador", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52g2aberto.equals("Disjuntor 52G2 Aberto") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 4 && disjuntor52g2aberto.equals("Disjuntor 52G2 Aberto") ||
                            passo != 4)
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar Barra EM pelo Gerador ! Concluida com sucesso !!!",
                                "Desenergizar Barra EM pelo Gerador", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Transferir do MT-1 para o MT-R Incorreto, Voce deseja executar o aplicativo Ajuda? ",
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
        manobrainteligente1.passo = 0;
        seccionadora89a2fechada = "";
        seccionadora89a4fechada = "";
        seccionadora89a6fechada = "";
        seccionadora89a8fechada = "";
        seccionadora89a2aberta = "";
        seccionadora89a4aberta = "";
        seccionadora89a6aberta = "";
        seccionadora89a8aberta = "";
        seccionadora89a2eaberta = "";
        seccionadora89a4eaberta = "";
        seccionadora89a6eaberta = "";
        seccionadora89a8eaberta = "";
        seccionadora89p1aberta = "";
        seccionadora89lvrrefechada = "";
        seccionadora89lvrrfechada = "";
        seccionadora89lvrreaberta = "";
        seccionadora89lvrraberta = "";
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
        status1.setText(
                "MANOBRA HABILITADA PARA SIMULAÇAO: " + "NENHUMA                                                ");
        JOptionPane.showMessageDialog(null, " Voce ja pode Habilitar a proxima manobra para Simulaçao!!!");
    }

    public static void main(String args[]) {
        new InterfaceMTR().setVisible(true);
        // InterfaceMTR application = new InterfaceMTR();
    }
}