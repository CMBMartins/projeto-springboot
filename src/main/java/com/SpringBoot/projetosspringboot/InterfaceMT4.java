
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
 * MODULO -   INTERFACEMT4                             *
 ******************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
//import java.text.DecimalFormat;
import java.text.SimpleDateFormat; //Carregar este pacote

public class InterfaceMT4 extends JFrame implements ActionListener {
    JLabel tap, valortap, tensao, trafo, barra1, barra2, tap1, tap2, valortap1, valortap2, trafo1, trafo2, subir,
            descer, Alarmes;
    JLabel mt1a, mt1b, mt2a, mt2b, l1a, l1b, l2a, l2b, l189, l289, l157, l1, l257, l2, bta, btb, bta57, btb57, mt152,
            mtr52, mt252, l152, l252, bt52, gif1, ta1;
    JLabel status, status1, status2, mt1, mtr, mt2, c7, c8, lvr1, rf6, rf5, rf3, rf4, pla1, pla2, a8, a8e, rf5e, rf4e,
            rf3e, rf552, rf452, rf352;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23,
            b24, b25;
    JButton b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46,
            b47, b48;
    JButton b49, b50, b51, b52, b53, b54, b55, b56, b57, b58, b59, b60, b61;
    JTextField tfUsuario, tfPerfil, tfCodigo, tfData, enterField;
    String nome, senha, data, Usuario, tagequipamento, operacao, manobra;

    int passo = 0;
    ImageIcon icone = new ImageIcon("");
    JPanel painel;

    JLabel lbManobra;
    int origem = 0;
    int performance = 0;

    Equipamentos345kV eqp1 = new Equipamentos345kV();
    BDadosUsuario U = new BDadosUsuario();
    BDadosAcesso BDE = new BDadosAcesso();
    BDOperaçoes BDO = new BDOperaçoes();
    BDEquipamentos BDEQ = new BDEquipamentos();
    ManobraInteligente1 manobrainteligente1 = new ManobraInteligente1();
    Relogio relogio = new Relogio();
    SimuladorAlbras simulador = new SimuladorAlbras();

    String seccionadora89a2fechada = "";
    String seccionadora89a4fechada = "";
    String seccionadora89a6fechada = "";
    String seccionadora89a8fechada = "";
    String seccionadora89a2aberta = "";
    String seccionadora89a4aberta = "";
    String seccionadora89a6aberta = "";
    String seccionadora89a7aberta = "";
    String seccionadora89a8aberta = "";
    String seccionadora89a2eaberta = "";
    String seccionadora89a4eaberta = "";
    String seccionadora89a6eaberta = "";
    String seccionadora89a7eaberta = "";
    String seccionadora89a8eaberta = "";
    String seccionadora89p1aberta = "";
    String seccionadora89lvrrefechada = "";
    String seccionadora89lvrrfechada = "";
    String seccionadora89lvrreaberta = "";
    String seccionadora89lvrraberta = "";
    String seccionadora89lvr4fechada = "";
    String seccionadora89lvr4aberta = "";
    String seccionadora89lvr4efechada = "";
    String seccionadora89lvr4eaberta = "";
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
    String seccionadora89a7fechada = "";
    String seccionadora89a7efechada = "";
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
    String seccionadora89c7aberta = "";
    String seccionadora89c8aberta = "";
    String seccionadora89c1fechada = "";
    String seccionadora89c2fechada = "";
    String seccionadora89c3fechada = "";
    String seccionadora89c4fechada = "";
    String seccionadora89c5fechada = "";
    String seccionadora89c6fechada = "";
    String seccionadora89c7fechada = "";
    String seccionadora89c8fechada = "";
    String seccionadora89c1eaberta = "";
    String seccionadora89c2eaberta = "";
    String seccionadora89c3eaberta = "";
    String seccionadora89c4eaberta = "";
    String seccionadora89c5eaberta = "";
    String seccionadora89c6eaberta = "";
    String seccionadora89c7eaberta = "";
    String seccionadora89c8eaberta = "";
    String seccionadora89c1efechada = "";
    String seccionadora89c2efechada = "";
    String seccionadora89c3efechada = "";
    String seccionadora89c4efechada = "";
    String seccionadora89c5efechada = "";
    String seccionadora89c6efechada = "";
    String seccionadora89c7efechada = "";
    String seccionadora89c8efechada = "";
    String seccionadora89r8fechada = "";
    String seccionadora89r9fechada = "";
    String seccionadora89r10fechada = "";
    String seccionadora89r11fechada = "";
    String seccionadora89r19fechada = "";
    String seccionadora89r20fechada = "";
    String seccionadora89r21fechada = "";
    String seccionadora89r22fechada = "";
    String seccionadora89r23fechada = "";
    String seccionadora89r24fechada = "";
    String seccionadora89r3fechada = "";
    String seccionadora89r4fechada = "";
    String seccionadora89r5fechada = "";
    String seccionadora89r6fechada = "";
    String seccionadora89r8aberta = "";
    String seccionadora89r9aberta = "";
    String seccionadora89r19aberta = "";
    String seccionadora89r20aberta = "";
    String seccionadora89r21aberta = "";
    String seccionadora89r22aberta = "";
    String seccionadora89r23aberta = "";
    String seccionadora89r24aberta = "";
    String seccionadora89r3aberta = "";
    String seccionadora89r4aberta = "";
    String seccionadora89r5aberta = "";
    String seccionadora89r6aberta = "";
    String seccionadora89r8eaberta = "";
    String seccionadora89r9eaberta = "";
    String seccionadora89r19eaberta = "";
    String seccionadora89r20eaberta = "";
    String seccionadora89r21eaberta = "";
    String seccionadora89r22eaberta = "";
    String seccionadora89r23eaberta = "";
    String seccionadora89r24eaberta = "";
    String seccionadora89r3eaberta = "";
    String seccionadora89r4eaberta = "";
    String seccionadora89r5eaberta = "";
    String seccionadora89r6eaberta = "";
    String seccionadora89r8efechada = "";
    String seccionadora89r9efechada = "";
    String seccionadora89r19efechada = "";
    String seccionadora89r20efechada = "";
    String seccionadora89r21efechada = "";
    String seccionadora89r22efechada = "";
    String seccionadora89r23efechada = "";
    String seccionadora89r24efechada = "";
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
    String disjuntor52lvr2fechado = "";
    String disjuntor52lvr2aberto = "";
    String disjuntor52lvr2afechado = "";
    String disjuntor52lvr2aaberto = "";
    String disjuntor52lvr3fechado = "";
    String disjuntor52lvr3aberto = "";
    String disjuntor52lvr3afechado = "";
    String disjuntor52lvr3aaberto = "";
    String disjuntor52lvr4fechado = "";
    String disjuntor52lvr4aberto = "";
    String disjuntor52lvr4afechado = "";
    String disjuntor52lvr4aaberto = "";
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
    String disjuntor52r8fechado = "";
    String disjuntor52r8aberto = "";
    String disjuntor52r9fechado = "";
    String disjuntor52r9aberto = "";
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
    String disjuntor52r10fechado = "";
    String disjuntor52r10aberto = "";
    String disjuntor52r11fechado = "";
    String disjuntor52r11aberto = "";
    String disjuntor52r12fechado = "";
    String disjuntor52r12aberto = "";
    String disjuntor52r13fechado = "";
    String disjuntor52r13aberto = "";
    String disjuntor52r14fechado = "";
    String disjuntor52r14aberto = "";
    String disjuntor52r15fechado = "";
    String disjuntor52r15aberto = "";
    String disjuntor52r16fechado = "";
    String disjuntor52r16aberto = "";
    String disjuntor52r17fechado = "";
    String disjuntor52r17aberto = "";
    String disjuntor52r18fechado = "";
    String disjuntor52r18aberto = "";
    String disjuntor52r19fechado = "";
    String disjuntor52r19aberto = "";
    String disjuntor52r20fechado = "";
    String disjuntor52r20aberto = "";
    String disjuntor52r21fechado = "";
    String disjuntor52r21aberto = "";
    String disjuntor52r22aberto = "";
    String disjuntor52r22fechado = "";
    String disjuntor52r23aberto = "";
    String disjuntor52r23fechado = "";
    String disjuntor52r24aberto = "";
    String disjuntor52r24fechado = "";
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

    public InterfaceMT4() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout()); // gerenciador de layout
        setResizable(false);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        setTitle("Barramento de 34.5 kV MT-4");
        setSize(1100, 810);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        c.setBackground(new Color(180, 180, 180));

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
        l1.setText("MT-4 Barramento de 34,5 kV");
        l1.setForeground(Color.green);

        Icon imagem1 = new ImageIcon("Carlos4.GIF");
        gif1 = new JLabel();
        gif1.setIcon(imagem1);
        gif1.setBounds(1020, 684, 100, 100); // Coluna,Linha,Largura,Altura
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

        // ���������������������������������������������� BARRAS T4 E EM
        // ���������������������������������������������
        JPanel v = new JPanel(); // Barra T2
        v.setBounds(0, 5, 1020, 3);
        v.setBackground(Color.orange);
        painel.add(v);

        JPanel v1 = new JPanel(); // Barra EM
        v1.setBounds(0, 30, 1020, 3);
        v1.setBackground(Color.orange);
        painel.add(v1);

        barra1 = new JLabel("Barra T4"); // IDENTIFICA��O DA BARRA T2
        barra1.setForeground(Color.white);
        barra1.setBounds(10, 0, 60, 30);
        painel.add(barra1);

        barra2 = new JLabel("Barra EM");
        barra2.setForeground(Color.white);
        barra2.setBounds(10, 25, 60, 30); // IDENTIFICA��O DA BARRA EM
        painel.add(barra2);
        // ##################################### IDENTIFICA��O DOS EQUIPAMENTOS
        // ####################################
        mt2a = new JLabel("89 C7");
        mt2a.setForeground(Color.white);
        mt2a.setBounds(12, 40, 60, 30);
        painel.add(mt2a);
        mt2b = new JLabel("89 C7-E");
        mt2b.setForeground(Color.white);
        mt2b.setBounds(94, 40, 60, 30);
        painel.add(mt2b);
        mt1a = new JLabel("89 C8");
        mt1a.setForeground(Color.white);
        mt1a.setBounds(162, 40, 60, 30);
        painel.add(mt1a);
        mt1b = new JLabel("89 C8-E");
        mt1b.setForeground(Color.white);
        mt1b.setBounds(244, 40, 60, 30);
        painel.add(mt1b);
        mt2a = new JLabel("89 A7");
        mt2a.setForeground(Color.white);
        mt2a.setBounds(310, 40, 60, 30);
        painel.add(mt2a);
        mt2b = new JLabel("89 A7-E");
        mt2b.setForeground(Color.white);
        mt2b.setBounds(395, 40, 60, 30);
        painel.add(mt2b);
        a8 = new JLabel("89 A8");
        a8.setForeground(Color.white);
        a8.setBounds(470, 40, 60, 30);
        painel.add(a8);
        a8e = new JLabel("89 A8-E");
        a8e.setForeground(Color.white);
        a8e.setBounds(530, 40, 60, 30);
        painel.add(a8e);
        l1a = new JLabel("89 LR-4");
        l1a.setForeground(Color.white);
        l1a.setBounds(720, 40, 60, 30);
        painel.add(l1a);
        l1b = new JLabel("89 LR-4E");
        l1b.setForeground(Color.white);
        l1b.setBounds(805, 40, 60, 30);
        painel.add(l1b);
        ta1 = new JLabel("89 TA4");
        ta1.setBounds(995, 40, 60, 30);
        ta1.setForeground(Color.white);
        painel.add(ta1);
        l2a = new JLabel("89 P6");
        l2a.setForeground(Color.white);
        l2a.setBounds(595, 40, 60, 30);
        painel.add(l2a);
        l2b = new JLabel("89 P6-E");
        l2b.setForeground(Color.white);
        l2b.setBounds(655, 40, 60, 30);
        painel.add(l2b);
        bta = new JLabel("89 RF-19");
        bta.setForeground(Color.white);
        bta.setBounds(870, 40, 60, 30);
        painel.add(bta);
        btb = new JLabel("89 RF-19E");
        btb.setForeground(Color.white);
        btb.setBounds(930, 40, 60, 30);
        painel.add(btb);
        mt252 = new JLabel("52 A7");
        mt252.setForeground(Color.white);
        mt252.setBounds(370, 150, 60, 30);
        painel.add(mt252);
        mt252 = new JLabel("52 A8");
        mt252.setForeground(Color.white);
        mt252.setBounds(530, 150, 60, 30);
        painel.add(mt252);
        mt252 = new JLabel("52 C7");
        mt252.setForeground(Color.white);
        mt252.setBounds(70, 150, 60, 30);
        painel.add(mt252);
        mt152 = new JLabel("52 C8");
        mt152.setForeground(Color.white);
        mt152.setBounds(220, 150, 60, 30);
        painel.add(mt152);
        l152 = new JLabel("52 LVR-4");
        l152.setForeground(Color.white);
        l152.setBounds(780, 150, 60, 30);
        painel.add(l152);
        ta1 = new JLabel("TA4");
        ta1.setForeground(Color.white);
        ta1.setBounds(985, 120, 60, 30);
        painel.add(ta1);
        l252 = new JLabel("52 P6");
        l252.setForeground(Color.white);
        l252.setBounds(655, 150, 60, 30);
        painel.add(l252);
        bt52 = new JLabel("52 RF-19");
        bt52.setForeground(Color.white);
        bt52.setBounds(927, 150, 60, 30);
        painel.add(bt52);

        c7 = new JLabel("BANCO C7");
        c7.setForeground(Color.white);
        c7.setBounds(18, 250, 60, 30);
        painel.add(c7);
        c8 = new JLabel("BANCO C8");
        c8.setForeground(Color.white);
        c8.setBounds(168, 250, 60, 30);
        painel.add(c8);
        lvr1 = new JLabel("LVR-4");
        lvr1.setForeground(Color.white);
        lvr1.setBounds(705, 255, 60, 30);
        painel.add(lvr1);
        lvr1 = new JLabel("TF Regul. 34,5/34,5kV");
        lvr1.setForeground(Color.white);
        lvr1.setBounds(768, 220, 260, 30);
        painel.add(lvr1);
        pla1 = new JLabel("Trafo de Aterramento");
        pla1.setForeground(Color.white);
        pla1.setBounds(950, 190, 260, 30);
        painel.add(pla1);
        pla1 = new JLabel("Aliment. de 34,5 kV A7");
        pla1.setForeground(Color.white);
        pla1.setBounds(450, 250, 260, 30);
        painel.add(pla1);
        pla1 = new JLabel("Aliment. de 34,5 kV A8");
        pla1.setForeground(Color.white);
        pla1.setBounds(280, 250, 260, 30);
        painel.add(pla1);
        pla1 = new JLabel("Aliment. de 34,5 kV P6");
        pla1.setForeground(Color.white);
        pla1.setBounds(600, 240, 260, 30);
        painel.add(pla1);
        pla2 = new JLabel("TF Regul. LVR-4A");
        pla2.setForeground(Color.white);
        pla2.setBounds(915, 280, 260, 30);
        painel.add(pla2);

        rf5 = new JLabel("89 RF-24");
        rf5.setForeground(Color.white);
        rf5.setBounds(65, 379, 60, 30);
        painel.add(rf5);
        rf5e = new JLabel("89 RF-24E");
        rf5e.setForeground(Color.white);
        rf5e.setBounds(150, 379, 60, 30);
        painel.add(rf5e);
        rf4 = new JLabel("89 RF-23");
        rf4.setForeground(Color.white);
        rf4.setBounds(215, 379, 60, 30);
        painel.add(rf4);
        rf4e = new JLabel("89 RF-23E");
        rf4e.setForeground(Color.white);
        rf4e.setBounds(300, 379, 60, 30);
        painel.add(rf4e);
        rf3 = new JLabel("89 RF-22");
        rf3.setForeground(Color.white);
        rf3.setBounds(365, 378, 60, 30);
        painel.add(rf3);
        rf3e = new JLabel("89 RF-22E");
        rf3e.setForeground(Color.white);
        rf3e.setBounds(450, 379, 60, 30);
        painel.add(rf3e);
        rf3 = new JLabel("89 RF-21");
        rf3.setForeground(Color.white);
        rf3.setBounds(515, 378, 60, 30);
        painel.add(rf3);
        rf3e = new JLabel("89 RF-21E");
        rf3e.setForeground(Color.white);
        rf3e.setBounds(600, 379, 60, 30);
        painel.add(rf3e);
        rf3 = new JLabel("89 RF-20");
        rf3.setForeground(Color.white);
        rf3.setBounds(665, 378, 60, 30);
        painel.add(rf3);
        rf3e = new JLabel("89 RF-20E");
        rf3e.setForeground(Color.white);
        rf3e.setBounds(750, 379, 60, 30);
        painel.add(rf3e);

        rf552 = new JLabel("52 RF-24");
        rf552.setForeground(Color.white);
        rf552.setBounds(125, 495, 60, 30);
        painel.add(rf552);
        rf452 = new JLabel("52 RF-23");
        rf452.setForeground(Color.white);
        rf452.setBounds(270, 495, 60, 30);
        painel.add(rf452);
        rf352 = new JLabel("52 RF-22");
        rf352.setForeground(Color.white);
        rf352.setBounds(420, 495, 60, 30);
        painel.add(rf352);
        rf452 = new JLabel("52 RF-21");
        rf452.setForeground(Color.white);
        rf452.setBounds(575, 495, 60, 30);
        painel.add(rf452);
        rf352 = new JLabel("52 RF-20");
        rf352.setForeground(Color.white);
        rf352.setBounds(725, 495, 60, 30);
        painel.add(rf352);

        rf6 = new JLabel("RETIF.19");
        rf6.setForeground(Color.white);
        rf6.setBounds(955, 570, 60, 30);
        painel.add(rf6);
        rf5 = new JLabel("RETIF.24");
        rf5.setForeground(Color.white);
        rf5.setBounds(155, 600, 60, 30);
        painel.add(rf5);
        rf4 = new JLabel("RETIF.23");
        rf4.setForeground(Color.white);
        rf4.setBounds(300, 600, 60, 30);
        painel.add(rf4);
        rf3 = new JLabel("RETIF.22");
        rf3.setForeground(Color.white);
        rf3.setBounds(450, 600, 60, 30);
        painel.add(rf3);
        rf4 = new JLabel("RETIF.21");
        rf4.setForeground(Color.white);
        rf4.setBounds(605, 600, 60, 30);
        painel.add(rf4);
        rf3 = new JLabel("RETIF.20");
        rf3.setForeground(Color.white);
        rf3.setBounds(755, 600, 60, 30);
        painel.add(rf3);

        // ������������������������������������������������� BAY TRAFO LVR-4A
        // ����������������������������������������������

        JPanel v13 = new JPanel(); // SECCIONADORA 89 LVR-1A
        v13.setBounds(865, 8, 3, 55);
        v13.setBackground(Color.orange);
        painel.add(v13);

        JPanel v14 = new JPanel(); // SECCIONADORA 89 LVR-1A / DISJUNTOR 52 LVR-4A
        v14.setBounds(865, 103, 3, 23);
        v14.setBackground(Color.orange);
        painel.add(v14);

        JPanel v15 = new JPanel(); // SECCIONADORA 89 LVR-4AE
        v15.setBounds(950, 30, 3, 33);
        v15.setBackground(Color.orange);
        painel.add(v15);

        JPanel v16 = new JPanel(); // SECCIONADORA 89 LVR-4A / DISJUNTOR
        v16.setBounds(950, 103, 3, 23);
        v16.setBackground(Color.orange);
        painel.add(v16);

        JPanel v18 = new JPanel(); // SECCIONADORA 89 LVR-4A / SECCIONADORA 89 LVR-4AE
        v18.setBounds(865, 125, 88, 3);
        v18.setBackground(Color.orange);
        painel.add(v18);

        JPanel v19 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v19.setBounds(907, 126, 3, 20);
        v19.setBackground(Color.orange);
        painel.add(v19);

        JPanel v17 = new JPanel(); // DISJUNTOR / TRANSFORMADOR LVR-4A
        v17.setBounds(907, 185, 3, 123);
        v17.setBackground(Color.orange);
        painel.add(v17);

        JPanel v20 = new JPanel(); // TRANSFORMADOR / RETIFICADOR R19
        v20.setBounds(907, 349, 3, 234);
        v20.setBackground(Color.yellow);
        painel.add(v20);

        // �������������������������������������������� BAY BANCO C8
        // ����������������������������������������������������

        JPanel v2 = new JPanel(); // Seccionadora 89 C2
        v2.setBounds(155, 8, 3, 55);
        v2.setBackground(Color.orange);
        painel.add(v2);

        JPanel v3 = new JPanel();
        v3.setBounds(155, 103, 3, 23); // Seccionadora 89 C2 / Disjuntor
        v3.setBackground(Color.orange);
        painel.add(v3);

        JPanel v4 = new JPanel(); // Seccionadora 89 C2-E
        v4.setBounds(240, 30, 3, 33);
        v4.setBackground(Color.orange);
        painel.add(v4);

        JPanel v5 = new JPanel(); // SECCIONADORA 89 C2-E / DISJUNTOR C2
        v5.setBounds(239, 103, 3, 23);
        v5.setBackground(Color.orange);
        painel.add(v5);

        JPanel v7 = new JPanel(); // SECCIONADORA C2 / SECCIONADORA C2-E
        v7.setBounds(155, 125, 87, 3);
        v7.setBackground(Color.orange);
        painel.add(v7);

        JPanel v8 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v8.setBounds(200, 126, 3, 20);
        v8.setBackground(Color.orange);
        painel.add(v8);

        JPanel v6 = new JPanel(); // DISJUNTOR / BANCO
        v6.setBounds(200, 185, 3, 23);
        v6.setBackground(Color.orange);
        painel.add(v6);

        // �������������������������������������������� BAY BANCO C3
        // ����������������������������������������������������

        JPanel v86 = new JPanel(); // Seccionadora 89 C1
        v86.setBounds(5, 8, 3, 55);
        v86.setBackground(Color.orange);
        painel.add(v86);

        JPanel v87 = new JPanel();
        v87.setBounds(5, 103, 3, 23); // Seccionadora 89 C1 / Disjuntor
        v87.setBackground(Color.orange);
        painel.add(v87);

        JPanel v88 = new JPanel(); // Seccionadora 89 C1-E
        v88.setBounds(90, 30, 3, 33);
        v88.setBackground(Color.orange);
        painel.add(v88);

        JPanel v89 = new JPanel(); // SECCIONADORA 89 C2-E / DISJUNTOR C2
        v89.setBounds(89, 103, 3, 23);
        v89.setBackground(Color.orange);
        painel.add(v89);

        JPanel v91 = new JPanel(); // SECCIONADORA C1 / SECCIONADORA C1-E
        v91.setBounds(5, 125, 87, 3);
        v91.setBackground(Color.orange);
        painel.add(v91);

        JPanel v92 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v92.setBounds(50, 126, 3, 20);
        v92.setBackground(Color.orange);
        painel.add(v92);

        JPanel v90 = new JPanel(); // DISJUNTOR / BANCO
        v90.setBounds(50, 185, 3, 23);
        v90.setBackground(Color.orange);
        painel.add(v90);

        // ������������������������������������������� BAY DO LVR-1
        // ���������������������������������������������

        JPanel v22 = new JPanel(); // SECCIONADORA 89 LVR-1
        v22.setBounds(715, 8, 3, 55);
        v22.setBackground(Color.orange);
        painel.add(v22);

        JPanel v23 = new JPanel();
        v23.setBounds(715, 103, 3, 23); // Seccionadora 89 LVR-1 / Disjuntor
        v23.setBackground(Color.orange);
        painel.add(v23);

        JPanel v24 = new JPanel(); // Seccionadora 89 LVR-1E
        v24.setBounds(800, 30, 3, 33);
        v24.setBackground(Color.orange);
        painel.add(v24);

        JPanel v25 = new JPanel(); // SECCIONADORA 89 LVR-1 / DISJUNTOR 52 LVR-1
        v25.setBounds(800, 103, 3, 23);
        v25.setBackground(Color.orange);
        painel.add(v25);

        JPanel v26 = new JPanel(); // DISJUNTOR / TRAFO LVR-1
        v26.setBounds(760, 185, 3, 65);
        v26.setBackground(Color.orange);
        painel.add(v26);

        JPanel v27 = new JPanel(); // SECCIONADORA LVR1 / SECCIONADORA LVR1-E
        v27.setBounds(715, 125, 88, 3);
        v27.setBackground(Color.orange);
        painel.add(v27);

        JPanel v28 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v28.setBounds(760, 126, 3, 20);
        v28.setBackground(Color.orange);
        painel.add(v28);

        JPanel v44 = new JPanel(); // TRANSFORMADOR / BARRA R1
        v44.setBounds(761, 289, 3, 61);
        v44.setBackground(Color.yellow);
        painel.add(v44);

        // ���������������������������������������������� BARRAS R2 E RR
        // ���������������������������������������������
        JPanel v45 = new JPanel(); // Barra R2
        v45.setBounds(5, 350, 780, 3);
        v45.setBackground(Color.yellow);
        painel.add(v45);

        JPanel v46 = new JPanel(); // Barra RR
        v46.setBounds(5, 375, 780, 3);
        v46.setBackground(Color.yellow);
        painel.add(v46);

        // ���������������������������������������� BAY DA PLANTA P6
        // ������������������������������������������������������

        JPanel v29 = new JPanel(); // SECCIONADORA 89 P3
        v29.setBounds(590, 8, 3, 55);
        v29.setBackground(Color.orange);
        painel.add(v29);

        JPanel v30 = new JPanel();
        v30.setBounds(590, 103, 3, 23); // Seccionadora 89 P6 / Disjuntor
        v30.setBackground(Color.orange);
        painel.add(v30);

        JPanel v31 = new JPanel(); // Seccionadora 89 P1-E
        v31.setBounds(675, 30, 3, 33);
        v31.setBackground(Color.orange);
        painel.add(v31);

        JPanel v32 = new JPanel(); // SECCIONADORA 89 P6-E / DISJUNTOR 52 P6
        v32.setBounds(675, 103, 3, 23);
        v32.setBackground(Color.orange);
        painel.add(v32);

        JPanel v33 = new JPanel(); // DISJUNTOR / ALIMENTADOR
        v33.setBounds(635, 185, 3, 50);
        v33.setBackground(Color.orange);
        painel.add(v33);

        JPanel v34 = new JPanel(); // SECCIONADORA P6 / SECCIONADORA P6-E
        v34.setBounds(590, 125, 88, 3);
        v34.setBackground(Color.orange);
        painel.add(v34);

        JPanel v35 = new JPanel(); // DISJUNTOR / ALIMENTADOR
        v35.setBounds(635, 126, 3, 20);
        v35.setBackground(Color.orange);
        painel.add(v35);

        JPanel v74 = new JPanel(); // SETA
        v74.setBounds(631, 235, 11, 5);
        v74.setBackground(Color.orange);
        painel.add(v74);
        JPanel v70 = new JPanel(); // SETA
        v70.setBounds(632, 240, 9, 4);
        v70.setBackground(Color.orange);
        painel.add(v70);
        JPanel v71 = new JPanel(); // SETA
        v71.setBounds(633, 243, 7, 3);
        v71.setBackground(Color.orange);
        painel.add(v71);
        JPanel v72 = new JPanel(); // SETA
        v72.setBounds(634, 246, 5, 2);
        v72.setBackground(Color.orange);
        painel.add(v72);
        JPanel v73 = new JPanel(); // SETA
        v73.setBounds(635, 248, 3, 2);
        v73.setBackground(Color.orange);
        painel.add(v73);

        // ���������������������������������������� BAY DO TRAFO A8
        // ������������������������������������������������������

        JPanel v80 = new JPanel(); // SECCIONADORA 89 A4
        v80.setBounds(465, 8, 3, 55);
        v80.setBackground(Color.orange);
        painel.add(v80);

        JPanel v81 = new JPanel();
        v81.setBounds(465, 103, 3, 23); // Seccionadora 89 P6 / Disjuntor
        v81.setBackground(Color.orange);
        painel.add(v81);

        JPanel v82 = new JPanel(); // Seccionadora 89 P1-E
        v82.setBounds(550, 30, 3, 33);
        v82.setBackground(Color.orange);
        painel.add(v82);

        JPanel v83 = new JPanel(); // SECCIONADORA 89 P1-E / DISJUNTOR 52 P1
        v83.setBounds(550, 103, 3, 23);
        v83.setBackground(Color.orange);
        painel.add(v83);

        JPanel v85 = new JPanel(); // SECCIONADORA P1 / SECCIONADORA P1-E
        v85.setBounds(465, 125, 88, 3);
        v85.setBackground(Color.orange);
        painel.add(v85);

        JPanel v93 = new JPanel(); // DISJUNTOR / ALIMENTADOR
        v93.setBounds(510, 126, 3, 20);
        v93.setBackground(Color.orange);
        painel.add(v93);

        JPanel v84 = new JPanel(); // DISJUNTOR / ALIMENTADOR
        v84.setBounds(510, 185, 3, 25);
        v84.setBackground(Color.orange);
        painel.add(v84);
        // ���������������������������������������� BAY DA TRAFO TA-2
        // ������������������������������������������������������

        JPanel v68 = new JPanel(); // SECCIONADORA 89 TA-2
        v68.setBounds(1010, 8, 3, 55);
        v68.setBackground(Color.orange);
        painel.add(v68);

        JPanel v69 = new JPanel();
        v69.setBounds(1010, 103, 3, 50); // Seccionadora 89 TA-2 / Disjuntor
        v69.setBackground(Color.orange);
        painel.add(v69);

        // �������������������������������������������� BAY DO TRAFO A3
        // ���������������������������������������������������

        JPanel v36 = new JPanel(); // SECCIONADORA 89 A3
        v36.setBounds(305, 8, 3, 55);
        v36.setBackground(Color.orange);
        painel.add(v36);

        JPanel v37 = new JPanel();
        v37.setBounds(305, 103, 3, 23); // Seccionadora 89 P6 / Disjuntor 52 P6
        v37.setBackground(Color.orange);
        painel.add(v37);

        JPanel v38 = new JPanel(); // Seccionadora 89 P2-E
        v38.setBounds(390, 30, 3, 33);
        v38.setBackground(Color.orange);
        painel.add(v38);

        JPanel v39 = new JPanel(); // SECCIONADORA 89 P2-E / DISJUNTOR 52 P2
        v39.setBounds(390, 103, 3, 23);
        v39.setBackground(Color.orange);
        painel.add(v39);

        JPanel v41 = new JPanel(); // SECCIONADORA 89 P2 / DISJUNTOR 52 P2
        v41.setBounds(350, 125, 3, 20);
        v41.setBackground(Color.orange);
        painel.add(v41);

        JPanel v42 = new JPanel(); // SECCIONADORA 89 P2 / SECCIONADORA 89 P2-E
        v42.setBounds(305, 125, 88, 3);
        v42.setBackground(Color.orange);
        painel.add(v42);

        JPanel v43 = new JPanel(); // DISJUNTOR / ALIMENTADOR P2
        v43.setBounds(350, 185, 3, 25);
        v43.setBackground(Color.orange);
        painel.add(v43);

        // ���������������������������������������������� BAY RF 12
        // ���������������������������������������������
        JPanel v47 = new JPanel(); // SECCIONADORA 89 R12
        v47.setBounds(60, 350, 3, 53);
        v47.setBackground(Color.yellow);
        painel.add(v47);

        JPanel v48 = new JPanel();
        v48.setBounds(60, 445, 3, 24); // Seccionadora 89 R12 / Disjuntor
        v48.setBackground(Color.yellow);
        painel.add(v48);

        JPanel v49 = new JPanel(); // Seccionadora 89 R12-E
        v49.setBounds(145, 375, 3, 28);
        v49.setBackground(Color.yellow);
        painel.add(v49);

        JPanel v50 = new JPanel(); // SECCIONADORA 89 R12-E / DISJUNTOR 52 R5
        v50.setBounds(145, 445, 3, 23);
        v50.setBackground(Color.yellow);
        painel.add(v50);

        JPanel v52 = new JPanel(); // SECCIONADORA R12 / SECCIONADORA R5-E
        v52.setBounds(60, 468, 88, 3);
        v52.setBackground(Color.yellow);
        painel.add(v52);

        JPanel v53 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v53.setBounds(105, 469, 3, 20);
        v53.setBackground(Color.yellow);
        painel.add(v53);

        JPanel v51 = new JPanel(); // DISJUNTOR / TRAFO RF-5
        v51.setBounds(105, 528, 3, 55);
        v51.setBackground(Color.yellow);
        painel.add(v51);

        // ���������������������������������������������� BAY RF 11
        // ���������������������������������������������
        JPanel v54 = new JPanel(); // SECCIONADORA 89 R11
        v54.setBounds(210, 350, 3, 53);
        v54.setBackground(Color.yellow);
        painel.add(v54);

        JPanel v55 = new JPanel();
        v55.setBounds(210, 445, 3, 24); // Seccionadora 89 R4 / Disjuntor
        v55.setBackground(Color.yellow);
        painel.add(v55);

        JPanel v56 = new JPanel(); // Seccionadora 89 R4-E
        v56.setBounds(295, 375, 3, 28);
        v56.setBackground(Color.yellow);
        painel.add(v56);

        JPanel v57 = new JPanel(); // SECCIONADORA 89 R4-E / DISJUNTOR 52 R4
        v57.setBounds(295, 445, 3, 23);
        v57.setBackground(Color.yellow);
        painel.add(v57);

        JPanel v58 = new JPanel(); // SECCIONADORA R4 / SECCIONADORA R4-E
        v58.setBounds(210, 468, 88, 3);
        v58.setBackground(Color.yellow);
        painel.add(v58);

        JPanel v59 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v59.setBounds(250, 469, 3, 20);
        v59.setBackground(Color.yellow);
        painel.add(v59);

        JPanel v60 = new JPanel(); // DISJUNTOR / TRAFO RF-4
        v60.setBounds(250, 528, 3, 55);
        v60.setBackground(Color.yellow);
        painel.add(v60);

        // ���������������������������������������������� BAY RF 10
        // ���������������������������������������������
        JPanel v61 = new JPanel(); // SECCIONADORA 89 R3
        v61.setBounds(360, 350, 3, 53);
        v61.setBackground(Color.yellow);
        painel.add(v61);

        JPanel v62 = new JPanel();
        v62.setBounds(360, 445, 3, 24); // Seccionadora 89 R3 / Disjuntor
        v62.setBackground(Color.yellow);
        painel.add(v62);

        JPanel v63 = new JPanel(); // Seccionadora 89 R3-E
        v63.setBounds(445, 375, 3, 28);
        v63.setBackground(Color.yellow);
        painel.add(v63);

        JPanel v64 = new JPanel(); // SECCIONADORA 89 R3-E / DISJUNTOR 52 R3
        v64.setBounds(445, 445, 3, 23);
        v64.setBackground(Color.yellow);
        painel.add(v64);

        JPanel v65 = new JPanel(); // SECCIONADORA R3 / SECCIONADORA R3-E
        v65.setBounds(360, 468, 88, 3);
        v65.setBackground(Color.yellow);
        painel.add(v65);

        JPanel v66 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v66.setBounds(400, 469, 3, 20);
        v66.setBackground(Color.yellow);
        painel.add(v66);

        JPanel v67 = new JPanel(); // DISJUNTOR / TRAFO RF-3
        v67.setBounds(400, 528, 3, 55);
        v67.setBackground(Color.yellow);
        painel.add(v67);

        // ���������������������������������������������� BAY RF 09
        // ���������������������������������������������
        JPanel v94 = new JPanel(); // SECCIONADORA 89 R9
        v94.setBounds(510, 350, 3, 53);
        v94.setBackground(Color.yellow);
        painel.add(v94);

        JPanel v95 = new JPanel();
        v95.setBounds(510, 445, 3, 24); // Seccionadora 89 R4 / Disjuntor
        v95.setBackground(Color.yellow);
        painel.add(v95);

        JPanel v96 = new JPanel(); // Seccionadora 89 R4-E
        v96.setBounds(595, 375, 3, 28);
        v96.setBackground(Color.yellow);
        painel.add(v96);

        JPanel v97 = new JPanel(); // SECCIONADORA 89 R4-E / DISJUNTOR 52 R4
        v97.setBounds(595, 445, 3, 23);
        v97.setBackground(Color.yellow);
        painel.add(v97);

        JPanel v98 = new JPanel(); // SECCIONADORA R4 / SECCIONADORA R4-E
        v98.setBounds(510, 468, 88, 3);
        v98.setBackground(Color.yellow);
        painel.add(v98);

        JPanel v99 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v99.setBounds(555, 469, 3, 20);
        v99.setBackground(Color.yellow);
        painel.add(v99);

        JPanel v100 = new JPanel(); // DISJUNTOR / TRAFO RF-4
        v100.setBounds(555, 528, 3, 55);
        v100.setBackground(Color.yellow);
        painel.add(v100);

        // ���������������������������������������������� BAY RF 08
        // ���������������������������������������������
        JPanel v101 = new JPanel(); // SECCIONADORA 89 R8
        v101.setBounds(660, 350, 3, 53);
        v101.setBackground(Color.yellow);
        painel.add(v101);

        JPanel v102 = new JPanel();
        v102.setBounds(660, 445, 3, 24); // Seccionadora 89 R3 / Disjuntor
        v102.setBackground(Color.yellow);
        painel.add(v102);

        JPanel v103 = new JPanel(); // Seccionadora 89 R8-E
        v103.setBounds(745, 375, 3, 28);
        v103.setBackground(Color.yellow);
        painel.add(v103);

        JPanel v104 = new JPanel(); // SECCIONADORA 89 R3-E / DISJUNTOR 52 R3
        v104.setBounds(745, 445, 3, 23);
        v104.setBackground(Color.yellow);
        painel.add(v104);

        JPanel v105 = new JPanel(); // SECCIONADORA R3 / SECCIONADORA R3-E
        v105.setBounds(660, 468, 88, 3);
        v105.setBackground(Color.yellow);
        painel.add(v105);

        JPanel v106 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v106.setBounds(705, 469, 3, 20);
        v106.setBackground(Color.yellow);
        painel.add(v106);

        JPanel v107 = new JPanel(); // DISJUNTOR / TRAFO RF-3
        v107.setBounds(705, 528, 3, 55);
        v107.setBackground(Color.yellow);
        painel.add(v107);

        // �������������������������������������� CRIA��O DO BOT�O 89 A7
        // ����������������������������������������

        b1 = new JButton(); // BOT�O CS 89 A3
        b1.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b1.addActionListener(this);
        b1.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b1.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b1.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b1.setForeground(Color.black);// cor do titulo do bot�o
        b1.setEnabled(true);
        b1.setToolTipText("Pressione para operar a Seccionadora 89 A7");
        b1.setMnemonic(KeyEvent.VK_B);
        b1.setActionCommand("89RF-6");// define o nome da acao
        b1.setBounds(290, 62, 33, 45);
        painel.add(b1);

        // �������������������������������������� CRIA��O DO BOT�O 52 A7
        // �����������������������������������������

        b2 = new JButton(); // BOT�O DJ 52 A7
        b2.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b2.addActionListener(this);
        b2.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b2.setMnemonic(KeyEvent.VK_C);
        b2.setToolTipText("Pressione para operar o Disjuntor 52 A7");
        b2.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b2.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
        b2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b2.setBounds(335, 145, 33, 42);
        painel.add(b2);

        // ���������������������������������� CRIA��O DO BOT�O CS 89 A7-E
        // �����������������������������������������

        b3 = new JButton(); // BOT�O CS 89 A3-E
        b3.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b3.addActionListener(this);
        b3.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b3.setToolTipText("Pressione para operar a Seccionadora 89 A7-E");
        b3.setHorizontalTextPosition(AbstractButton.CENTER);
        b3.setVerticalTextPosition(AbstractButton.CENTER);
        b3.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b3.setBounds(375, 62, 33, 45);
        painel.add(b3);
        // ��������������������������������������� CRIA��O DO BOT�O TRAFO A7
        // ��������������������������������������

        b10 = new JButton(); // GIF TRAFO A3
        b10.setIcon(new javax.swing.ImageIcon("TF_S AUX.JPG"));
        b10.addActionListener(this);
        b10.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b10.setToolTipText("Pressione para comutar o Tap do Transformador MT-R");
        b10.setHorizontalTextPosition(AbstractButton.CENTER);
        b10.setVerticalTextPosition(AbstractButton.CENTER);
        b10.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b10.setBounds(328, 208, 48, 42);
        painel.add(b10);
        // ����������������������������������� CRIA��O DO BOT�O TRAFO LVR-4A
        // ������������������������������������������

        b4 = new JButton(); // BOT�O TRANSFORMADOR LVR-2A
        b4.setIcon(new javax.swing.ImageIcon("LVR4A.JPG"));
        b4.addActionListener(this);
        b4.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        b4.setToolTipText("Pressione para comutar o Tap do Transformador LVR-4A");
        b4.setHorizontalTextPosition(AbstractButton.CENTER);
        b4.setVerticalTextPosition(AbstractButton.CENTER);
        b4.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b4.setBounds(885, 308, 48, 42);
        painel.add(b4);

        // ����������������������������������� CRIA��O DO BOT�ES DE CONTROLE DO TRAFO
        // LVR-2A �����������������������

        b5 = new JButton("+"); // TAP LVR-1A
        b5.setBounds(936, 310, 41, 15);
        b5.addActionListener(this);
        painel.add(b5);

        b6 = new JButton("-"); // TAP LVR-1A
        b6.setBounds(936, 330, 41, 15);
        b6.addActionListener(this);
        painel.add(b6);

        tap = new JLabel("0 Kv"); // VALOR DE TENS�O DA BARRA R6
        tap.setForeground(Color.white);
        tap.setBounds(865, 345, 60, 30);
        painel.add(tap);

        valortap = new JLabel(eqp1.getMostrarTapslvr1a()); // VALOR TAP LVR-1A
        valortap.setForeground(Color.white);
        valortap.setBounds(942, 340, 60, 30);
        painel.add(valortap);

        // ���������������������������������������� CRIA��O DO BOT�O 89 C8
        // ��������������������������������������

        b7 = new JButton(); // BOT�O CS 89 C4
        b7.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b7.addActionListener(this);
        b7.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b7.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b7.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b7.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        b7.setForeground(Color.black);// cor do titulo do bot�o
        b7.setEnabled(true);
        b7.setToolTipText("Pressione para operar a Seccionadora 89 C8");
        b7.setMnemonic(KeyEvent.VK_B);
        b7.setActionCommand("89C4");// define o nome da acao
        b7.setBounds(140, 62, 33, 45);
        painel.add(b7);

        // ���������������������������������������� CRIA��O DO BOT�O 52 C8
        // ���������������������������������������

        b8 = new JButton(); // BOT�O DJ 52 C4
        b8.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b8.addActionListener(this);
        b8.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b8.setMnemonic(KeyEvent.VK_C);
        b8.setToolTipText("Pressione para operar o Disjuntor 52 C8");
        b8.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b8.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
        b8.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b8.setBounds(185, 145, 33, 42);
        painel.add(b8);

        // ��������������������������������������� CRIA��O DO BOT�O 89 C8-E
        // ���������������������������������������

        b9 = new JButton();
        b9.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg")); // Bot�o 89 C4-E
        b9.addActionListener(this);
        b9.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b9.setToolTipText("Pressione para operar a Seccionadora 89 C8-E");
        b9.setHorizontalTextPosition(AbstractButton.CENTER);
        b9.setVerticalTextPosition(AbstractButton.CENTER);
        b9.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b9.setBounds(225, 62, 33, 45);
        painel.add(b9);

        // ��������������������������������������� CRIA��O DO BOT�O BANCO C8
        // ��������������������������������������

        b10 = new JButton(); // GIF BANCO C4
        b10.setIcon(new javax.swing.ImageIcon("Capacitor.jpg"));
        b10.addActionListener(this);
        b10.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b10.setToolTipText("Pressione para comutar o Tap do Transformador MT-R");
        b10.setHorizontalTextPosition(AbstractButton.CENTER);
        b10.setVerticalTextPosition(AbstractButton.CENTER);
        b10.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b10.setBounds(173, 208, 48, 42);
        painel.add(b10);

        // ���������������������������������������� CRIA��O DO BOT�O 89 C7
        // ��������������������������������������

        b13 = new JButton(); // BOT�O CS 89 C3
        b13.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b13.addActionListener(this);
        b13.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b13.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b13.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b13.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b13.setForeground(Color.black);// cor do titulo do bot�o
        b13.setEnabled(true);
        b13.setToolTipText("Pressione para operar a Seccionadora 89 C7");
        b13.setMnemonic(KeyEvent.VK_B);
        b13.setActionCommand("89C3");// define o nome da acao
        b13.setBounds(-10, 61, 33, 45);
        painel.add(b13);

        // ���������������������������������������� CRIA��O DO BOT�O 52 C7
        // ���������������������������������������

        b14 = new JButton(); // BOT�O DJ 52 C3
        b14.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b14.addActionListener(this);
        b14.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b14.setMnemonic(KeyEvent.VK_C);
        b14.setToolTipText("Pressione para operar o Disjuntor 52 C7");
        b14.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b14.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
        b14.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b14.setBounds(35, 145, 33, 42);
        painel.add(b14);

        // ��������������������������������������� CRIA��O DO BOT�O 89 C7-E
        // ���������������������������������������

        b15 = new JButton();
        b15.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg")); // Bot�o 89 C7-E
        b15.addActionListener(this);
        b15.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b15.setToolTipText("Pressione para operar a Seccionadora 89 C7-E");
        b15.setHorizontalTextPosition(AbstractButton.CENTER);
        b15.setVerticalTextPosition(AbstractButton.CENTER);
        b15.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b15.setBounds(75, 61, 33, 45);
        painel.add(b15);

        // ��������������������������������������� CRIA��O DO BOT�O BANCO C7
        // ��������������������������������������

        b16 = new JButton(); // GIF BANCO C7
        b16.setIcon(new javax.swing.ImageIcon("Capacitor.jpg"));
        b16.addActionListener(this);
        b16.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b16.setToolTipText("Pressione para comutar o Tap do Transformador MT-2");
        b16.setHorizontalTextPosition(AbstractButton.CENTER);
        b16.setVerticalTextPosition(AbstractButton.CENTER);
        b16.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b16.setBounds(23, 208, 48, 42);
        painel.add(b16);

        // ����������������������������������� CRIA��O DO BOT�O 89 LVR-4
        // �����������������������������������������������

        b19 = new JButton(); // BOT�O CS 89 LVR-1
        b19.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b19.addActionListener(this);
        b19.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b19.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b19.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b19.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b19.setForeground(Color.black);// cor do titulo do bot�o
        b19.setEnabled(true);
        b19.setToolTipText("Pressione para operar a Seccionadora 89 LVR-4");
        b19.setMnemonic(KeyEvent.VK_B);
        b19.setActionCommand("89LVR2");// define o nome da acao
        b19.setBounds(699, 62, 33, 45);
        painel.add(b19);

        // ����������������������������������� CRIA��O DO BOT�O 89 LVR-4E
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
        b20.setToolTipText("Pressione para operar a Seccionadora 89 LVR-4E");
        b20.setMnemonic(KeyEvent.VK_B);
        b20.setActionCommand("89LVR-2E");// define o nome da acao
        b20.setBounds(784, 62, 33, 45);
        painel.add(b20);

        // ����������������������������������� CRIA��O DO BOT�O 52 LVR-4
        // �����������������������������������������������

        b21 = new JButton(); // BOT�O 52 LVR-2
        b21.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b21.addActionListener(this);
        b21.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b21.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b21.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b21.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b21.setForeground(Color.black);// cor do titulo do bot�o
        b21.setEnabled(true);
        b21.setToolTipText("Pressione para operar O Disjuntor 52 LVR-4");
        b21.setMnemonic(KeyEvent.VK_B);
        b21.setActionCommand("52LVR-1");// define o nome da acao
        b21.setBounds(745, 145, 33, 42);
        painel.add(b21);

        // ����������������������������������� CRIA��O DO BOT�ES DE CONTROLE DO TRAFO
        // LVR-4 �����������������������

        b22 = new JButton("+"); // TAP LVR-2
        b22.setBounds(785, 250, 41, 15);
        b22.addActionListener(this);
        painel.add(b22);

        b23 = new JButton("-"); // TAP LVR-2
        b23.setBounds(785, 270, 41, 15);
        b23.addActionListener(this);
        painel.add(b23);

        tap1 = new JLabel("0 Kv"); // VALOR DE TENS�O DA BARRA R2
        tap1.setForeground(Color.white);
        tap1.setBounds(720, 285, 60, 30);
        painel.add(tap1);

        valortap1 = new JLabel(eqp1.getMostrarTapslvr1()); // VALOR TAP LVR-2
        valortap1.setForeground(Color.white);
        valortap1.setBounds(792, 280, 60, 30);
        painel.add(valortap1);

        // ����������������������������������� CRIA��O DO BOT�O 89 P6
        // �����������������������������������������������

        b24 = new JButton(); // BOT�O CS 89 P3
        b24.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b24.addActionListener(this);
        b24.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b24.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b24.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b24.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b24.setForeground(Color.black);// cor do titulo do bot�o
        b24.setEnabled(true);
        b24.setToolTipText("Pressione para operar a Seccionadora 89 P6");
        b24.setMnemonic(KeyEvent.VK_B);
        b24.setActionCommand("89P3");// define o nome da acao
        b24.setBounds(575, 62, 33, 45);
        painel.add(b24);

        // ����������������������������������� CRIA��O DO BOT�O 89 P6-E
        // �����������������������������������������������

        b25 = new JButton(); // BOT�O CS 89 P3-E
        b25.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b25.addActionListener(this);
        b25.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b25.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b25.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b25.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b25.setForeground(Color.black);// cor do titulo do bot�o
        b25.setEnabled(true);
        b25.setToolTipText("Pressione para operar a Seccionadora 89 P6-E");
        b25.setMnemonic(KeyEvent.VK_B);
        b25.setActionCommand("89P3-E");// define o nome da acao
        b25.setBounds(660, 62, 33, 45);
        painel.add(b25);

        // ����������������������������������� CRIA��O DO BOT�O 52 P6
        // �����������������������������������������������

        b26 = new JButton(); // BOT�O 52 P3
        b26.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b26.addActionListener(this);
        b26.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b26.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b26.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b26.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b26.setForeground(Color.black);// cor do titulo do bot�o
        b26.setEnabled(true);
        b26.setToolTipText("Pressione para operar O Disjuntor 52 P6");
        b26.setMnemonic(KeyEvent.VK_B);
        b26.setActionCommand("52P3");// define o nome da acao
        b26.setBounds(620, 145, 33, 42);
        painel.add(b26);

        // ��������������������������������������� CRIAÇAO DO BOTAO TRAFO A8
        // ��������������������������������������

        b10 = new JButton(); // GIF TRAFO A4
        b10.setIcon(new javax.swing.ImageIcon("TF_S AUX.JPG"));
        b10.addActionListener(this);
        b10.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b10.setToolTipText("Pressione para comutar o Tap do Transformador MT-R");
        b10.setHorizontalTextPosition(AbstractButton.CENTER);
        b10.setVerticalTextPosition(AbstractButton.CENTER);
        b10.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b10.setBounds(488, 208, 48, 42);
        painel.add(b10);

        // ����������������������������������� CRIA��O DO BOT�O 89 RF-7
        // �����������������������������������������������

        b29 = new JButton(); // BOT�O CS 89 LVR-2A
        b29.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b29.addActionListener(this);
        b29.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b29.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b29.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b29.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b29.setForeground(Color.black);// cor do titulo do bot�o
        b29.setEnabled(true);
        b29.setToolTipText("Pressione para operar a Seccionadora 89 RF-19");
        b29.setMnemonic(KeyEvent.VK_B);
        b29.setActionCommand("89P2");// define o nome da acao
        b29.setBounds(849, 62, 33, 45);
        painel.add(b29);

        // ����������������������������������� CRIA��O DO BOT�O 89 RF-7E
        // �����������������������������������������������

        b31 = new JButton(); // BOT�O CS 89 RF-7E
        b31.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b31.addActionListener(this);
        b31.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b31.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b31.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b31.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b31.setForeground(Color.black);// cor do titulo do bot�o
        b31.setEnabled(true);
        b31.setToolTipText("Pressione para operar a Seccionadora 89 RF-19E");
        b31.setMnemonic(KeyEvent.VK_B);
        b31.setActionCommand("89P2-E");// define o nome da acao
        b31.setBounds(934, 62, 33, 45);
        painel.add(b31);

        // ����������������������������������� CRIA��O DO BOT�O 52 RF-7
        // �����������������������������������������������

        b33 = new JButton(); // BOT�O 52 LVR-2A
        b33.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b33.addActionListener(this);
        b33.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b33.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b33.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b33.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b33.setForeground(Color.black);// cor do titulo do bot�o
        b33.setEnabled(true);
        b33.setToolTipText("Pressione para operar O Disjuntor 52 RF-19");
        b33.setMnemonic(KeyEvent.VK_B);
        b33.setActionCommand("52P2");// define o nome da acao
        b33.setBounds(892, 145, 33, 42);
        painel.add(b33);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO LVR-4
        // ������������������������������������������

        b35 = new JButton(); // BOT�O TRANSFORMADOR LVR-4
        b35.setIcon(new javax.swing.ImageIcon("LVR.jpg"));
        b35.addActionListener(this);
        b35.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        b35.setToolTipText("Pressione para comutar o Tap do Transformador LVR-4");
        b35.setHorizontalTextPosition(AbstractButton.CENTER);
        b35.setVerticalTextPosition(AbstractButton.CENTER);
        b35.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b35.setBounds(745, 250, 36, 40);
        painel.add(b35);

        // ����������������������������������� CRIA��O DO BOT�O 89 A8
        // �����������������������������������������������

        b36 = new JButton(); // BOT�O CS 89 A4
        b36.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b36.addActionListener(this);
        b36.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b36.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b36.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b36.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b36.setForeground(Color.black);// cor do titulo do bot�o
        b36.setEnabled(true);
        b36.setToolTipText("Pressione para operar a Seccionadora 89 A8");
        b36.setMnemonic(KeyEvent.VK_B);
        b36.setActionCommand("89A4");// define o nome da acao
        b36.setBounds(450, 62, 33, 45);
        painel.add(b36);

        // ����������������������������������� CRIA��O DO BOT�O 89 A8-E
        // �����������������������������������������������

        b37 = new JButton(); // BOT�O CS 89 A4-E
        b37.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b37.addActionListener(this);
        b37.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b37.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b37.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b37.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b37.setForeground(Color.black);// cor do titulo do bot�o
        b37.setEnabled(true);
        b37.setToolTipText("Pressione para operar a Seccionadora 89 A8-E");
        b37.setMnemonic(KeyEvent.VK_B);
        b37.setActionCommand("89A4-E");// define o nome da acao
        b37.setBounds(535, 62, 33, 45);
        painel.add(b37);

        // ����������������������������������� CRIA��O DO BOT�O 52 A8
        // �����������������������������������������������

        b38 = new JButton(); // BOT�O 52 A4
        b38.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b38.addActionListener(this);
        b38.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b38.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b38.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b38.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b38.setForeground(Color.black);// cor do titulo do bot�o
        b38.setEnabled(true);
        b38.setToolTipText("Pressione para operar O Disjuntor 52 A8");
        b38.setMnemonic(KeyEvent.VK_B);
        b38.setActionCommand("52A4");// define o nome da acao
        b38.setBounds(495, 145, 33, 42);
        painel.add(b38);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 7
        // ������������������������������������������

        b41 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b41.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b41.addActionListener(this);
        b41.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b41.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b41.setHorizontalTextPosition(AbstractButton.CENTER);
        b41.setVerticalTextPosition(AbstractButton.CENTER);
        b41.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b41.setBounds(876, 582, 76, 53);
        painel.add(b41);

        // ����������������������������������� CRIA��O DO BOT�O 89 R12
        // �����������������������������������������������

        b43 = new JButton(); // BOT�O CS 89 R5
        b43.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b43.addActionListener(this);
        b43.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b43.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b43.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b43.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b43.setForeground(Color.black);// cor do titulo do bot�o
        b43.setEnabled(true);
        b43.setToolTipText("Pressione para operar a Seccionadora 89 R24");
        b43.setMnemonic(KeyEvent.VK_B);
        b43.setActionCommand("89R5");// define o nome da acao
        b43.setBounds(44, 402, 33, 45);
        painel.add(b43);

        // ����������������������������������� CRIA��O DO BOT�O 89 R12-E
        // �����������������������������������������������

        b44 = new JButton(); // BOT�O CS 89 R5-E
        b44.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b44.addActionListener(this);
        b44.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b44.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b44.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b44.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b44.setForeground(Color.black);// cor do titulo do bot�o
        b44.setEnabled(true);
        b44.setToolTipText("Pressione para operar a Seccionadora 89 R24-E");
        b44.setMnemonic(KeyEvent.VK_B);
        b44.setActionCommand("89R5-E");// define o nome da acao
        b44.setBounds(130, 402, 33, 45);
        painel.add(b44);

        // ����������������������������������� CRIA��O DO BOT�O 52 R12
        // �����������������������������������������������

        b45 = new JButton(); // BOT�O 52 R12
        b45.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b45.addActionListener(this);
        b45.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b45.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b45.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b45.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b45.setForeground(Color.black);// cor do titulo do bot�o
        b45.setEnabled(true);
        b45.setToolTipText("Pressione para operar O Disjuntor 52 R24");
        b45.setMnemonic(KeyEvent.VK_B);
        b45.setActionCommand("52R5");// define o nome da acao
        b45.setBounds(90, 487, 33, 42);
        painel.add(b45);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 12
        // ������������������������������������������

        b42 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b42.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b42.addActionListener(this);
        b42.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b42.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b42.setHorizontalTextPosition(AbstractButton.CENTER);
        b42.setVerticalTextPosition(AbstractButton.CENTER);
        b42.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b42.setBounds(75, 582, 76, 53);
        painel.add(b42);
        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 11
        // ������������������������������������������

        b46 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b46.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b46.addActionListener(this);
        b46.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b46.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b46.setHorizontalTextPosition(AbstractButton.CENTER);
        b46.setVerticalTextPosition(AbstractButton.CENTER);
        b46.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b46.setBounds(220, 582, 76, 53);
        painel.add(b46);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 10
        // ������������������������������������������

        b47 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b47.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b47.addActionListener(this);
        b47.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b47.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b47.setHorizontalTextPosition(AbstractButton.CENTER);
        b47.setVerticalTextPosition(AbstractButton.CENTER);
        b47.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b47.setBounds(370, 582, 76, 53);
        painel.add(b47);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 09
        // ������������������������������������������

        b47 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b47.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b47.addActionListener(this);
        b47.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b47.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b47.setHorizontalTextPosition(AbstractButton.CENTER);
        b47.setVerticalTextPosition(AbstractButton.CENTER);
        b47.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b47.setBounds(525, 582, 76, 53);
        painel.add(b47);
        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 08
        // ������������������������������������������

        b47 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b47.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b47.addActionListener(this);
        b47.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b47.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b47.setHorizontalTextPosition(AbstractButton.CENTER);
        b47.setVerticalTextPosition(AbstractButton.CENTER);
        b47.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b47.setBounds(675, 582, 76, 53);
        painel.add(b47);
        // ����������������������������������� CRIA��O DO BOT�O 89 R11
        // �����������������������������������������������

        b48 = new JButton(); // BOT�O CS 89 R11
        b48.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b48.addActionListener(this);
        b48.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b48.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b48.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b48.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b48.setForeground(Color.black);// cor do titulo do bot�o
        b48.setEnabled(true);
        b48.setToolTipText("Pressione para operar a Seccionadora 89 R-23");
        b48.setMnemonic(KeyEvent.VK_B);
        b48.setActionCommand("89R4");// define o nome da acao
        b48.setBounds(194, 402, 33, 45);
        painel.add(b48);

        // ����������������������������������� CRIA��O DO BOT�O 89 R11-E
        // �����������������������������������������������

        b49 = new JButton(); // BOT�O CS 89 R11-E
        b49.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b49.addActionListener(this);
        b49.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b49.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b49.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b49.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b49.setForeground(Color.black);// cor do titulo do bot�o
        b49.setEnabled(true);
        b49.setToolTipText("Pressione para operar a Seccionadora 89 R23-E");
        b49.setMnemonic(KeyEvent.VK_B);
        b49.setActionCommand("89R4E");// define o nome da acao
        b49.setBounds(280, 402, 33, 45);
        painel.add(b49);

        // ����������������������������������� CRIA��O DO BOT�O 52 R11
        // �����������������������������������������������

        b50 = new JButton(); // BOT�O 52 R11
        b50.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b50.addActionListener(this);
        b50.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b50.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b50.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b50.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b50.setForeground(Color.black);// cor do titulo do bot�o
        b50.setEnabled(true);
        b50.setToolTipText("Pressione para operar O Disjuntor 52 R23");
        b50.setMnemonic(KeyEvent.VK_B);
        b50.setActionCommand("52R4");// define o nome da acao
        b50.setBounds(235, 488, 33, 42);
        painel.add(b50);

        // ����������������������������������� CRIA��O DO BOT�O 89 R10
        // �����������������������������������������������

        b51 = new JButton(); // BOT�O CS 89 R10
        b51.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b51.addActionListener(this);
        b51.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b51.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b51.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b51.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b51.setForeground(Color.black);// cor do titulo do bot�o
        b51.setEnabled(true);
        b51.setToolTipText("Pressione para operar a Seccionadora 89 R-22");
        b51.setMnemonic(KeyEvent.VK_B);
        b51.setActionCommand("89R4");// define o nome da acao
        b51.setBounds(344, 402, 33, 45);
        painel.add(b51);

        // ����������������������������������� CRIA��O DO BOT�O 89 R10-E
        // �����������������������������������������������

        b52 = new JButton(); // BOT�O CS 89 R10-E
        b52.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b52.addActionListener(this);
        b52.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b52.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b52.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b52.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b52.setForeground(Color.black);// cor do titulo do bot�o
        b52.setEnabled(true);
        b52.setToolTipText("Pressione para operar a Seccionadora 89 R22-E");
        b52.setMnemonic(KeyEvent.VK_B);
        b52.setActionCommand("89R3");// define o nome da acao
        b52.setBounds(430, 402, 33, 45);
        painel.add(b52);

        // ����������������������������������� CRIA��O DO BOT�O 52 R10
        // �����������������������������������������������

        b53 = new JButton(); // BOT�O 52 R10
        b53.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b53.addActionListener(this);
        b53.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b53.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b53.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b53.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b53.setForeground(Color.black);// cor do titulo do bot�o
        b53.setEnabled(true);
        b53.setToolTipText("Pressione para operar O Disjuntor 52 R22-E");
        b53.setMnemonic(KeyEvent.VK_B);
        b53.setActionCommand("52R3");// define o nome da acao
        b53.setBounds(385, 488, 33, 42);
        painel.add(b53);

        // ����������������������������������� CRIA��O DO BOT�O 89 R09
        // �����������������������������������������������

        b54 = new JButton(); // BOT�O CS 89 R09
        b54.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b54.addActionListener(this);
        b54.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b54.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b54.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b54.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b54.setForeground(Color.black);// cor do titulo do bot�o
        b54.setEnabled(true);
        b54.setToolTipText("Pressione para operar a Seccionadora 89 R-21");
        b54.setMnemonic(KeyEvent.VK_B);
        b54.setActionCommand("89R09");// define o nome da acao
        b54.setBounds(494, 402, 33, 45);
        painel.add(b54);

        // ����������������������������������� CRIA��O DO BOT�O 89 R09-E
        // �����������������������������������������������

        b55 = new JButton(); // BOT�O CS 89 R09-E
        b55.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b55.addActionListener(this);
        b55.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b55.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b55.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b55.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b55.setForeground(Color.black);// cor do titulo do bot�o
        b55.setEnabled(true);
        b55.setToolTipText("Pressione para operar a Seccionadora 89 R21-E");
        b55.setMnemonic(KeyEvent.VK_B);
        b55.setActionCommand("89R3");// define o nome da acao
        b55.setBounds(580, 402, 33, 45);
        painel.add(b55);

        // ����������������������������������� CRIA��O DO BOT�O 52 R09
        // �����������������������������������������������

        b56 = new JButton(); // BOT�O 52 R09
        b56.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b56.addActionListener(this);
        b56.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b56.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b56.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b56.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b56.setForeground(Color.black);// cor do titulo do bot�o
        b56.setEnabled(true);
        b56.setToolTipText("Pressione para operar O Disjuntor 52 R21");
        b56.setMnemonic(KeyEvent.VK_B);
        b56.setActionCommand("52R3");// define o nome da acao
        b56.setBounds(540, 488, 33, 42);
        painel.add(b56);

        // ����������������������������������� CRIA��O DO BOT�O 89 R08
        // �����������������������������������������������

        b57 = new JButton(); // BOT�O CS 89 R08
        b57.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b57.addActionListener(this);
        b57.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b57.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b57.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b57.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b57.setForeground(Color.black);// cor do titulo do bot�o
        b57.setEnabled(true);
        b57.setToolTipText("Pressione para operar a Seccionadora 89 R-20");
        b57.setMnemonic(KeyEvent.VK_B);
        b57.setActionCommand("89R09");// define o nome da acao
        b57.setBounds(644, 402, 33, 45);
        painel.add(b57);

        // ����������������������������������� CRIA��O DO BOT�O 89 R08-E
        // �����������������������������������������������

        b58 = new JButton(); // BOT�O CS 89 R08-E
        b58.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b58.addActionListener(this);
        b58.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b58.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b58.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b58.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b58.setForeground(Color.black);// cor do titulo do bot�o
        b58.setEnabled(true);
        b58.setToolTipText("Pressione para operar a Seccionadora 89 R20-E");
        b58.setMnemonic(KeyEvent.VK_B);
        b58.setActionCommand("89R3");// define o nome da acao
        b58.setBounds(730, 402, 33, 45);
        painel.add(b58);

        // ����������������������������������� CRIA��O DO BOT�O 52 R08
        // �����������������������������������������������

        b59 = new JButton(); // BOT�O 52 R08
        b59.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b59.addActionListener(this);
        b59.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b59.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b59.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b59.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b59.setForeground(Color.black);// cor do titulo do bot�o
        b59.setEnabled(true);
        b59.setToolTipText("Pressione para operar O Disjuntor 52 R20");
        b59.setMnemonic(KeyEvent.VK_B);
        b59.setActionCommand("52R08");// define o nome da acao
        b59.setBounds(690, 488, 33, 42);
        painel.add(b59);
        // ����������������������������������� CRIA��O DO BOT�O 89 TA-2
        // �����������������������������������������������

        b60 = new JButton(); // BOT�O CS 89 TA-2
        b60.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b60.addActionListener(this);
        b60.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b60.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b60.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b60.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        b60.setForeground(Color.black);// cor do titulo do bot�o
        b60.setEnabled(true);
        b60.setToolTipText("Pressione para operar a Seccionadora 89 TA4");
        b60.setMnemonic(KeyEvent.VK_B);
        b60.setActionCommand("89TA2");// define o nome da acao
        b60.setBounds(995, 62, 33, 45);
        painel.add(b60);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO TA-2
        // ������������������������������������������

        b61 = new JButton(); // BOT�O TRANSFORMADOR TA-2
        b61.setIcon(new javax.swing.ImageIcon("TA1.jpg"));
        b61.addActionListener(this);
        b61.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b54.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b61.setHorizontalTextPosition(AbstractButton.CENTER);
        b61.setVerticalTextPosition(AbstractButton.CENTER);
        b61.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b61.setBounds(978, 148, 55, 46);
        painel.add(b61);

        // ��������������������������������������� CRIA��O DO BOT�O SAIR
        // �������������������������������������������

        b34 = new JButton("");
        b34.setIcon(new javax.swing.ImageIcon("Porta.jpg"));
        b34.addActionListener(this);
        b34.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        b34.setToolTipText("Pressione para encerrar o programa");
        b34.setHorizontalTextPosition(AbstractButton.CENTER);
        b34.setVerticalTextPosition(AbstractButton.CENTER);
        b34.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b34.setBounds(20, 590, 32, 58);
        painel.add(b34);

        // ��������������������������������������� BOT�O SETA
        // ��������������������������������������

        b40 = new JButton("");
        b40.setIcon(new javax.swing.ImageIcon("Seta1.jpg"));
        b40.addActionListener(this);
        b40.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        b40.setToolTipText("Pressione para acessar as Telas de 34,5 kV");
        b40.setHorizontalTextPosition(AbstractButton.CENTER);
        b40.setVerticalTextPosition(AbstractButton.CENTER);
        b40.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b40.setBounds(950, 436, 30, 30);
        painel.add(b40);

        c.add(painel, java.awt.BorderLayout.CENTER);

        atualizaConfiguracao();

    }

    // ����������������������������������������������������������������������������������
    public void actionPerformed(ActionEvent e) // metodo implementado pelo ActionListener
    {
        if (e.getSource() == b1)// ���������������������� A��O DO BOT�O DA CS 89 A7 �����������������������
        {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 A7?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89a7().equals("Seccionadora Aberta")) {
                    b1.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89a7();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 A7";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay A7";

                    // BDE.ConectarBD();
                    // BDE.incluir89mt1afechada(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1aFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mt1a();

                    seccionadora89a7fechada = "Seccionadora 89A7 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-1A foi Fechada com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                }

                else if (eqp1.seccionadora89a7().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52a7().equals("Disjuntor Aberto")) {
                    b1.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89a7();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 A7";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay A7";

                    // BDE.ConectarBD();
                    // BDE.incluir89mt1aaberta(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1aAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura89mt1a();

                    seccionadora89a7aberta = "Seccionadora 89A7 Aberta";
                    DesenAlbras = "DesenergizarAlbras";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-1A foi Aberta com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 A3 FECHADO! \n",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status2.setText(" 89 a7 " + eqp1.seccionadora89a7());
        }

        // ���������������������������������������� AÇãoO DO BOTÃO DO DJ 52 A7
        // ��������������������������������������
        if (e.getSource() == b2) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 A7?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52a7().equals("Disjuntor Aberto")) {
                    eqp1.fecharDisjuntor52a7();
                    b2.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    // valortap.setText (eqp1.getMostrarTapslvr4a());

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 A7";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay A7";

                    // BDE.ConectarBD();
                    // BDE.incluir52mt1fechado(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento52mt1();

                    disjuntor52a7fechado = "Disjuntor 52A7 Fechado";
                    // DesenAlbras = "";
                    // EnerAlbras = "EnergizarAlbras";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                    manobrainteligente1.EnerAlbras();

                } else if (eqp1.disjuntor52a7().equals("Disjuntor Fechado")) {
                    b2.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52a7();
                    tap.setText("0 kV");

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 A7";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay A7";

                    // BDE.ConectarBD();
                    // BDE.incluir52mt1aberto(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura52mt1();

                    disjuntor52a7aberto = "Disjuntor 52A7 Aberto";
                    // EnerAlbras = "";
                    // DesenAlbras = "DesenergizarAlbras";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                    manobrainteligente1.DesenAlbras();

                    // if (eqp.seccionadora89mt1a().equals("Seccionadora Aberta") &&
                    // eqp.seccionadora89mt1b().equals("Seccionadora Aberta") &&
                    // eqp.disjuntor52bt().equals("Disjuntor Aberto"))
                    // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-1 foi aberto
                    // #TRANSFORMADOR
                    // DESENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            if (eqp1.disjuntor52a7().equals("Disjuntor Aberto")) {
                simulador.status2.setText(" O TRAFO A7 ESTA DESENERGIZADO");
            }
        }

        // ���������������������������������������� AÇAO DO BOTAO DA CS 89 A7-E
        // ��������������������������������������
        if (e.getSource() == b3) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 A7-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89a7e().equals("Seccionadora Aberta")) {
                    b3.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89a7e();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 A7E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay A7";

                    // BDE.ConectarBD();
                    // BDE.incluir89mt1bfechada(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1bFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mt1b();

                    seccionadora89a7efechada = "Seccionadora 89A7E Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT1-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else if (eqp1.seccionadora89a7e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52a7().equals("Disjuntor Aberto")) {
                    b3.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89a7e();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 A7E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay A7";

                    // BDE.ConectarBD();
                    // BDE.incluir89mt1baberta(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1bAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mt1b();

                    seccionadora89a7eaberta = "Seccionadora 89A7E Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 A7E foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 A7 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 A7-E " + eqp1.seccionadora89a7e());
        }

        // ������������������������������� AÇAO DOS BOTOES DE COMUTAÇAO DE TAP'S DO
        // LVR-4A ����������������������������
        if (e.getSource() == b4) {
            status1.setText(" O Transformador LVR-4A esta no Tap:" + eqp1.getMostrarTapslvr4a());
            JOptionPane.showMessageDialog(null, "  O Transformador LVR-4A esta no:  " + eqp1.getMostrarTapslvr4a(),
                    "Disjuntor", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
        }
        if (e.getSource() == b5) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja Subir o Tap do Transformador LVR-4A?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.getTapslvr4a() == 32)
                    JOptionPane.showMessageDialog(null, "O Transformador LVR-4A esta no Tap Maximo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp1.aumentarTaplvr4a();
                status1.setText(" O Transformador LVR-4A esta no:  " + eqp1.getMostrarTapslvr2a());
                valortap.setText(eqp1.getMostrarTapslvr2a());

                if (eqp1.seccionadora89r19().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r19().equals("Disjuntor Fechado")
                        || eqp1.seccionadora89r19e().equals("Seccionadora Fechada")
                                && eqp1.disjuntor52r19().equals("Disjuntor Fechado")) {
                    tap.setText(eqp1.getValorTaplvr4a());
                }
                // BDE.ConectarBD();
                // BDE.incluirlvr1Aumentar(usuario, data);
                // BDEQ.ConectarBD();
                // BDEQ.QuantAumentoTaplvr1();

            } else {
                JOptionPane.showMessageDialog(null,
                        "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                        "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
            }
        }
        if (e.getSource() == b6) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja Descer Tap do Transformador?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.getTapslvr4a() == 0)
                    JOptionPane.showMessageDialog(null, "O Transformador LVR-4A esta no Tap Minimo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp1.diminuirTaplvr4a();
                status1.setText(" O Transformador LVR-4A esta no:  " + eqp1.getMostrarTapslvr4a());
                valortap.setText(eqp1.getMostrarTapslvr4a());
                if (eqp1.seccionadora89r19().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r19().equals("Disjuntor Fechado")
                        || eqp1.seccionadora89r19e().equals("Seccionadora Fechada")
                                && eqp1.disjuntor52r19().equals("Disjuntor Fechado")) {
                    tap.setText(eqp1.getValorTaplvr4a());
                }
                // BDE.ConectarBD();
                // BDE.incluirmt1Abaixar(usuario, data);
                // BDEQ.ConectarBD();
                // BDEQ.QuantDiminuirTapmt1();

                JOptionPane.showMessageDialog(null,
                        "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                        "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
            }
        }

        if (e.getSource() == b7)// ���������������������� A��O DO BOT�O DA CS 89 C8
                                // ��������������������������������
        {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 C8?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89c8().equals("Seccionadora Aberta")) {
                    b7.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89c8();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 C8";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay C8";

                    // BDE.ConectarBD();
                    // BDE.incluir89mtrafechada(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mtraFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mtra();

                    seccionadora89c8fechada = "Seccionadora 89C8 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-RA foi Fechada com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                }

                else if (eqp1.seccionadora89c8().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52c8().equals("Disjuntor Aberto")) {
                    b7.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89c8();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 C8";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay C8";

                    // BDE.ConectarBD();
                    // BDE.incluir89mtraaberta(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.opera�ao89mtraAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura89mtra();

                    seccionadora89c8aberta = "Seccionadora 89C8 Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-RA foi Aberta com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 C8 FECHADO! \n",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 C8 " + eqp1.seccionadora89c8());
        }

        // ���������������������������������������� A��O DO BOT�O DO DJ 52 C8
        // ��������������������������������������
        if (e.getSource() == b8) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 C8?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52c8().equals("Disjuntor Aberto")) {
                    eqp1.fecharDisjuntor52c8();
                    b8.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 C8";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay C8";

                    // BDE.ConectarBD();
                    // BDE.incluir52mtrfechado(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento52mtr();

                    disjuntor52c8fechado = "Disjuntor 52C8 Fechado";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.disjuntor52c8().equals("Disjuntor Fechado")) // ||
                // eqp1.seccionadora89c4().equals("Seccionadora Fechada") ||
                // eqp1.seccionadora89c4e().equals("Seccionadora Fechada"))

                {
                    b8.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52c8();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 C8";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay C8";

                    // BDE.ConectarBD();
                    // BDE.incluir52mtraberto(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura52mtr();

                    disjuntor52c8aberto = "Disjuntor 52C8 Aberto";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // if (eqp.seccionadora89mtra().equals("Seccionadora Aberta") &&
                    // eqp.seccionadora89mtrb().equals("Seccionadora Aberta") &&
                    // eqp.disjuntor52bt().equals("Disjuntor Aberto"))
                    // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-R foi aberto
                    // #TRANSFORMADOR
                    // DESENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            if (eqp1.disjuntor52c8().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89c8().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52c8().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89c8e().equals("Seccionadora Aberta")) {
                status1.setText(" O BANCO C8 ESTA DESENERGIZADO");
            }
        }

        // ���������������������������������������� A��O DO BOT�O DA CS 89 C8-E
        // ��������������������������������������
        if (e.getSource() == b9) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 C8-E ?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89c8e().equals("Seccionadora Aberta")) {
                    b9.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89c8e();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 C8E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay C8";

                    // BDE.ConectarBD();
                    // BDE.incluir89mtrbfechada(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mtrbFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mtrb();

                    seccionadora89c8efechada = "Seccionadora 89C8E Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MTR-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else if (eqp1.seccionadora89c8e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52c8().equals("Disjuntor Aberto")) {
                    b9.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89c8e();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 C8E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay C8";

                    // BDE.ConectarBD();
                    // BDE.incluir89mtrbaberta(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.opera�ao89mtrbAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mtrb();

                    seccionadora89c8eaberta = "Seccionadora 89C8E Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora esta 89 MTR-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 C8 FECHADO! \n ",
                            "Lgica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 C8-E " + eqp1.seccionadora89c8e());
        }

        // �������������������������������������� A��O DO BOT�O DA CS 89 C7
        // ��������������������������������������
        if (e.getSource() == b13) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 C7?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89c7().equals("Seccionadora Aberta")) {
                    b13.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89c7();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 C7";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay C7";

                    // BDE.ConectarBD();
                    // BDE.incluir89mt2afechada(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt2aFechada(data);

                    seccionadora89c7fechada = "Seccionadora 89C7 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-2A foi Fechada com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                }

                else if (eqp1.seccionadora89c7().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52c7().equals("Disjuntor Aberto")) {
                    b13.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89c7();

                    // BDE.ConectarBD();
                    // BDE.incluir89mt2aaberta(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt2aAberta(data);

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 C7";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay C7";

                    seccionadora89c7aberta = "Seccionadora 89C7 Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-2A foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 C7 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 C7 " + eqp1.seccionadora89c7());
        }

        // ������������������������������������ A��O DO BOT�O DO DISJUNTOR 52 C7
        // ����������������������������������
        if (e.getSource() == b14) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 C7?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52c7().equals("Disjuntor Aberto")) {
                    b14.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52c7();

                    // BDE.ConectarBD();
                    // BDE.incluir52c7fechado(usuario, data);

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 C7";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay C7";

                    disjuntor52c7fechado = "Disjuntor 52C7 Fechado";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.disjuntor52c7().equals("Disjuntor Fechado") &&
                        eqp1.seccionadora89c7().equals("Seccionadora Fechada") ||
                        eqp1.seccionadora89c7e().equals("Seccionadora Fechada"))

                {
                    b14.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52c7();

                    // BDE.ConectarBD();
                    // BDE.incluir52mt2aberto(usuario, data);

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 C7";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay C7";

                    disjuntor52c7aberto = "Disjuntor 52C7 Aberto";
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();

                    // if (eqp.seccionadora89mt2a().equals("Seccionadora Aberta") &&
                    // eqp.seccionadora89mt2b().equals("Seccionadora Aberta") &&
                    // eqp.disjuntor52bt().equals("Disjuntor Aberto"))
                    // JOptionPane.showMessageDialog(null,"O Disjuntor 52 C7 foi aberto
                    // #TRANSFORMADOR
                    // DESENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Lgica de Intertravamento nao Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            if (eqp1.disjuntor52c7().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89c7().equals("Seccionadora Aberta")
                    && eqp1.disjuntor52c7().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89c7e().equals("Seccionadora Aberta")) {
                status1.setText(" O BANCO C7 ESTA DESENERGIZADO");
            }
        }

        // ��������������������������������������� A��O DO BOT�O DA CS 89 C7-E
        // �������������������������������������
        if (e.getSource() == b15) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 C7-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89c7e().equals("Seccionadora Aberta")) {
                    b15.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89c7e();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 C7E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay C7E";

                    // BDE.ConectarBD();
                    // BDE.incluir89mt2bfechada(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt2bFechada(data);

                    seccionadora89c7efechada = "Seccionadora 89C7E Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT2-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else if (eqp1.seccionadora89c7e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52c7().equals("Disjuntor Aberto")) {
                    b15.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89c7e();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 C7E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay C7E";

                    // BDE.ConectarBD();
                    // BDE.incluir89mt2baberta(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt2bAberta(data);

                    seccionadora89c7eaberta = "Seccionadora 89C7E Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 C7E foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 C7 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 C7-E " + eqp1.seccionadora89c7e());
        }

        // #################################################### BOT�O DE AC�O DA CS 89
        // LVR-4 ##########################################################

        if (e.getSource() == b19) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 LVR-4?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89lvr4().equals("Seccionadora Aberta")) {
                    b19.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89lvr4();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 LVR4";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay LVR4";

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-A foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // BDE.incluir89l1afechada(usuario, data);

                    seccionadora89lvr4fechada = "Seccionadora 89LVR4 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                }

                else if (eqp1.seccionadora89lvr4().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvr4().equals("Disjuntor Aberto")) {
                    b19.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89lvr4();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-A foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 LVR4";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay LVR4";

                    // BDE.ConectarBD();
                    // BDE.incluir89l1aaberta(usuario, data);
                    seccionadora89lvr4aberta = "Seccionadora 89LVR4 Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 LVR-4 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 LVR-4 " + eqp1.seccionadora89lvr4());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // LVR-4E #########################################################
        if (e.getSource() == b20) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 LVR-4E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89lvr4e().equals("Seccionadora Aberta")) {
                    b20.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89lvr4e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 LVR4E foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 LVR4E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay LVR4";

                    // BDE.ConectarBD();
                    // BDE.incluir89l1bfechada(usuario, data);

                    seccionadora89lvr4efechada = "Seccionadora 89LVR4E Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.seccionadora89lvr4e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvr4().equals("Disjuntor Aberto")) {
                    b20.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89lvr4e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora esta 89 L1-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 LVR4";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay LVR4";

                    // BDE.ConectarBD();
                    // BDE.incluir89l1baberta(usuario, data);
                    seccionadora89lvr4eaberta = "Seccionadora 89LVR4E Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 LVR-4 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 LVR-4E " + eqp1.seccionadora89lvr4e());
        }

        // ################################################# AC�O DO BOT�O DO 52 LVR-4
        // ##############################################################
        if (e.getSource() == b21) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 LVR-4?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52lvr4().equals("Disjuntor Aberto") &&
                        eqp1.seccionadora89lvr4().equals("Seccionadora Fechada"))

                {
                    b21.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52lvr4();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 LVR4";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay LVR4";

                    // valortap1.setText (eqp1.getMostrarTapslvr1());
                    // BDE.ConectarBD();
                    // BDE.incluir52l1fechado(usuario, data);

                    disjuntor52lvr4fechado = "Disjuntor 52LVR4 Fechado";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                }

                else if (eqp1.disjuntor52lvr4().equals("Disjuntor Fechado")) {
                    b21.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52lvr4();
                    tap1.setText("0 kV");

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 LVR4";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay LVR4";

                    // BDE.ConectarBD();
                    // BDE.incluir52lvr4aberto(usuario, data);

                    disjuntor52lvr4aberto = "Disjuntor 52LVR4 Aberto";
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                }
            }
            if (eqp1.disjuntor52lvr4().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89lvr4().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52lvr4().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89lvr4e().equals("Seccionadora Aberta")) {
                status1.setText("O TRANSFORMADOR ESTA DESENERGIZADO! ");
            }
        }

        // ������������������������������� A��O DOS BOT�ES DE COMUTA��O DE TAP'S DO
        // LVR-2 ����������������������������
        if (e.getSource() == b35) {
            status1.setText(" O Transformador LVR-4 esta no Tap:" + eqp1.getMostrarTapslvr4());
            JOptionPane.showMessageDialog(null, "  O Transformador LVR-4 esta no:  " + eqp1.getMostrarTapslvr2(),
                    "Disjuntor", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
        }
        if (e.getSource() == b22) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja Subir o Tap do Transformador LVR-4?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.getTapslvr4() == 32)
                    JOptionPane.showMessageDialog(null, "O Transformador LVR-4 esta no Tap Maximo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp1.aumentarTaplvr2();
                status1.setText(" O Transformador LVR-4 esta no:  " + eqp1.getMostrarTapslvr4());
                valortap1.setText(eqp1.getMostrarTapslvr2());

                if (eqp1.seccionadora89lvr4().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvr4().equals("Disjuntor Fechado")
                        || eqp1.seccionadora89lvr4e().equals("Seccionadora Fechada")
                                && eqp1.disjuntor52lvr4().equals("Disjuntor Fechado")) {
                    tap1.setText(eqp1.getValorTaplvr4());
                }

                // BDE.ConectarBD();
                // BDE.incluirlvr1Aumentar(usuario, data);
                // BDEQ.ConectarBD();
                // BDEQ.QuantAumentoTaplvr1();

            } else {
                JOptionPane.showMessageDialog(null,
                        "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                        "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
            }
        }

        if (e.getSource() == b23) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja Descer Tap do Transformador?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.getTapslvr4() == 0)
                    JOptionPane.showMessageDialog(null, "O Transformador LVR-4 esta no Tap Minimo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp1.diminuirTaplvr4();
                status1.setText(" O Transformador LVR-4 esta no:  " + eqp1.getMostrarTapslvr2());
                valortap1.setText(eqp1.getMostrarTapslvr4());
                if (eqp1.seccionadora89lvr4().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvr4().equals("Disjuntor Fechado")
                        || eqp1.seccionadora89lvr4e().equals("Seccionadora Fechada")
                                && eqp1.disjuntor52lvr4().equals("Disjuntor Fechado")) {
                    tap1.setText(eqp1.getValorTaplvr4());
                }

                // BDE.ConectarBD();
                // BDE.incluirmt1Abaixar(usuario, data);
                // BDEQ.ConectarBD();
                // BDEQ.QuantDiminuirTapmt1();

            } else {
                JOptionPane.showMessageDialog(null,
                        "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                        "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
            }
        }
        // #################################################### BOT�O DE AC�O DA CS 89P6
        // ##########################################################

        if (e.getSource() == b24) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 P6?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89p6().equals("Seccionadora Aberta")) {
                    b24.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89p6();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 P6";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay P6";

                    // BDE.ConectarBD();
                    // BDE.incluir89l2afechada(usuario, data);

                    seccionadora89p6fechada = "Seccionadora 89P6 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                    manobrainteligente1.PrepAlbras();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 P6 foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                }

                else if (eqp1.seccionadora89p6().equals("Seccionadora Fechada"))
                // && eqp1.disjuntor52p6().equals("Disjuntor Aberto"))
                {
                    b24.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89p6();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 P6";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay P6";

                    // BDE.ConectarBD();
                    // BDE.incluir89l2aaberta(usuario, data);

                    seccionadora89p6aberta = "Seccionadora 89P6 Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                    manobrainteligente1.PrepAlbras();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 P6 foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 P6 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 P6 " + eqp1.seccionadora89p6());
        }

        // ####################################################### ACAO DO BOTAO DA 89
        // P6E #########################################################
        if (e.getSource() == b25) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 P6-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89p6e().equals("Seccionadora Aberta")) {
                    b25.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89p6e();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 P6E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay P6";

                    // BDE.ConectarBD();
                    // BDE.incluir89l2bfechada(usuario, data);

                    seccionadora89p6efechada = "Seccionadora 89P6E Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 P6E foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else if (eqp1.seccionadora89p6e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52p3().equals("Disjuntor Aberto")) {
                    b25.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89p6e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 P6E foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif"));

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 P6E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay P6";

                    // BDE.incluir89l2baberta(usuario, data);
                    // BDE.ConectarBD();

                    seccionadora89p6eaberta = "Seccionadora 89P6E Aberta";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 P6 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 P6-E " + eqp1.seccionadora89p6e());
        }

        // ################################################# ACAO DO BOTAO DO 52 P6
        // ##############################################################
        if (e.getSource() == b26) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 P6?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52p6().equals("Disjuntor Aberto"))
                // eqp1.seccionadora89p3().equals("Seccionadora Fechada") ||
                // eqp1.seccionadora89p3e().equals("Seccionadora Fechada"))

                {
                    b26.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52p6();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 P6";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay P6";

                    // BDE.ConectarBD();
                    // BDE.incluir52l2fechado(usuario, data);

                    disjuntor52p6fechado = "Disjuntor 52P6 Fechado";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                    manobrainteligente1.EnerAlbras();

                } else if (eqp1.disjuntor52p6().equals("Disjuntor Fechado"))
                // eqp1.seccionadora89p3().equals("Seccionadora Fechada") ||
                // eqp1.seccionadora89p3e().equals("Seccionadora Fechada"))

                {
                    b26.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52p6();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 P6";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay P6";

                    // BDE.ConectarBD();
                    // BDE.incluir52l2aberto(usuario, data);

                    disjuntor52p6aberto = "Disjuntor 52P6 Aberto";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                    manobrainteligente1.DesenAlbras();

                } else {
                    JOptionPane.showMessageDialog(null, "LOGICA DE INTERTRAVAMENTO NAO SATISFEITA! ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            if (eqp1.disjuntor52p6().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89p6().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52p6().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89p6e().equals("Seccionadora Aberta")) {
                status1.setText("A PLANTA ESTA DESENERGIZADA! ");
            }
        }

        // ����������������������������������������� A��O DO BOT�O DA CS 89 R19
        // ��������������������������������������
        if (e.getSource() == b29) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-19?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r19().equals("Seccionadora Aberta")) {
                    b29.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89r19();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2 foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 R19";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay R19";

                    // BDE.ConectarBD();
                    // BDE.incluir89p2fechada(usuario, data);

                    seccionadora89r19fechada = "Seccionadora 89R19 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.seccionadora89r19().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r19().equals("Disjuntor Aberto")) {
                    b29.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89r19();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 L2 foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));;

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 R19";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay R19";
                    // BDE.ConectarBD();
                    // BDE.incluir89p2aberta(usuario, data);

                    seccionadora89r19aberta = "Seccionadora 89R19 Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R19 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" CS 89 R19 " + eqp1.seccionadora89r19());
        }

        // ������������������������������������ A��O DO BOT�O DA SECCIONADORA 89 R19-E
        // �������������������������������
        if (e.getSource() == b31) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 R19-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r19e().equals("Seccionadora Aberta")) {
                    b31.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89r19e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BT-A foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 R19E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay R19";
                    // BDE.ConectarBD();
                    // BDE.incluir89p2efechada(usuario, data);

                    seccionadora89r19efechada = "Seccionadora 89R19E Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                }

                else if (eqp1.seccionadora89r19e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r19().equals("Disjuntor Aberto")) {
                    b31.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89r19e();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BT-A foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 R19E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay R19E";
                    // BDE.ConectarBD();
                    // BDE.incluir89btaaberta(usuario, data);

                    seccionadora89r19eaberta = "Seccionadora 89R19E Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R19 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R19-E " + eqp1.seccionadora89r19e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R19
        // ##############################################################
        if (e.getSource() == b33) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R19?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r19().equals("Disjuntor Aberto"))

                {
                    b33.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r19();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 R19";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay R19";
                    // BDE.ConectarBD();
                    // BDE.incluir52btfechado(usuario, data);

                    disjuntor52r19fechado = "Disjuntor 52R19 Fechado";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.disjuntor52r19().equals("Disjuntor Fechado") &&
                        eqp1.seccionadora89r19().equals("Seccionadora Fechada") ||
                        eqp1.seccionadora89r19e().equals("Seccionadora Fechada")) {
                    b33.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r19();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 R19";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay R19";
                    // BDE.ConectarBD();
                    // BDE.incluir52btaberto(usuario, data);

                    disjuntor52r19aberto = "Disjuntor 52R19 Aberto";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                }
            }
            if (eqp1.disjuntor52r19().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r19().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r19().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r19e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }
        // ������������������������������������������������� A��O DO BOT�O DA CS 89 A8
        // ���������������������������������������������������
        if (e.getSource() == b36) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 A8?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89a8().equals("Seccionadora Aberta")) {
                    b36.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89a8();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 A8";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay A8";

                    // BDE.ConectarBD();
                    // BDE.incluir89mt1afechada(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1aFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mt1a();

                    seccionadora89a8fechada = "Seccionadora 89A8 Fechada";
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-1A foi Fechada com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                }

                else if (eqp1.seccionadora89a8().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52a8().equals("Disjuntor Aberto")) {
                    b36.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89a8();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 A8";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay A8";

                    // BDE.ConectarBD();
                    // BDE.incluir89mt1aaberta(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1aAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura89mt1a();

                    seccionadora89a8aberta = "Seccionadora 89A8 Aberta";
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-1A foi Aberta com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 A8 FECHADO! \n",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 A8 " + eqp1.seccionadora89a8());
        }

        // ���������������������������������������� A��O DO BOT�O DA CS 89 A8-E
        // ��������������������������������������
        if (e.getSource() == b37) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 A8-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89a8e().equals("Seccionadora Aberta")) {
                    b37.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89a8e();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 A8E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay A8E";

                    seccionadora89a8efechada = "Seccionadora 89A8E Fechada";
                    // BDE.ConectarBD();
                    // BDE.incluir89mt1bfechada(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1bFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mt1b();

                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT1-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else if (eqp1.seccionadora89a8e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52a8().equals("Disjuntor Aberto")) {
                    b37.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89a8e();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 A8E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay A8E";

                    // BDE.ConectarBD();
                    // BDE.incluir89mt1baberta(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1bAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mt1b();

                    seccionadora89a8eaberta = "Seccionadora 89A8E Aberta";
                    PrepAlbras = "PrepAlbras";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT1-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 A8 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 A8-E " + eqp1.seccionadora89a8e());
        }
        // ������������������������������������������������� A��O DO BOT�O DO DJ 52 A8
        // ����������������������������������������������������
        if (e.getSource() == b38) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 A8?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52a8().equals("Disjuntor Aberto")) {
                    eqp1.fecharDisjuntor52a8();
                    b38.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 A8";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay A8";

                    // BDE.ConectarBD();
                    // BDE.incluir52mt1fechado(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento52mt1();

                    disjuntor52a8fechado = "Disjuntor 52A8 Fechado";
                    // EnerAlbras = "EnergizarAlbras";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                    manobrainteligente1.EnerAlbras();
                    // manobrainteligente1.DesenAlbras();

                } else if (eqp1.disjuntor52a8().equals("Disjuntor Fechado")) {
                    eqp1.abrirDisjuntor52a8();
                    b38.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    // tap.setText("0 kV");

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 A8";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay A8";

                    // BDE.ConectarBD();
                    // BDE.incluir52mt1aberto(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura52mt1();

                    disjuntor52a8aberto = "Disjuntor 52A8 Aberto";
                    // DesenAlbras = "DesenergizarAlbras";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                    manobrainteligente1.DesenAlbras();

                    // if (eqp.seccionadora89mt1a().equals("Seccionadora Aberta") &&
                    // eqp.seccionadora89mt1b().equals("Seccionadora Aberta") &&
                    // eqp.disjuntor52bt().equals("Disjuntor Aberto"))

                    // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-1 foi aberto
                    // #TRANSFORMADOR
                    // DESENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            if (eqp1.disjuntor52a8().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89a8().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52a8().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89a8e().equals("Seccionadora Aberta")) {
                status1.setText(" O TRAFO A8 ESTA DESENERGIZADO");
            }
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-24 #########################################################
        if (e.getSource() == b43) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-24?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r24().equals("Seccionadora Aberta")) {
                    b43.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r24();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 R24";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay R24";

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    seccionadora89r24fechada = "Seccionadora 89R24 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.seccionadora89r24().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r24().equals("Disjuntor Aberto")) {
                    b43.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r24();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora esta 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 R24";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay R24";

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    seccionadora89r24aberta = "Seccionadora 89R24 Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R24 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R24 " + eqp1.seccionadora89r24());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-24E #########################################################
        if (e.getSource() == b44) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-24E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r24e().equals("Seccionadora Aberta")) {
                    b44.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r24e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 R24E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay R24E";

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    seccionadora89r24efechada = "Seccionadora 89r24e Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.seccionadora89r24e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r24().equals("Disjuntor Aberto")) {
                    b44.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r24e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 R24E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay R24E";

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    seccionadora89r24eaberta = "Seccionadora 89R24E Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R24 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R24E " + eqp1.seccionadora89r24e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R24
        // ##############################################################
        if (e.getSource() == b45) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R24?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r24().equals("Disjuntor Aberto"))

                {
                    b45.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r24();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 R24";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay R24";

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btfechado(usuario, data);

                    disjuntor52r24fechado = "Disjuntor 52R24 Fechado";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.disjuntor52r24().equals("Disjuntor Fechado") &&
                        eqp1.seccionadora89r24().equals("Seccionadora Fechada")) {
                    b45.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r24();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 R24";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay R24";

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btaberto(usuario, data);

                    disjuntor52r24aberto = "Disjuntor 52R24 Aberto";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                }
            }
            if (eqp1.disjuntor52r24().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r12().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r12().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r12e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-23 #########################################################
        if (e.getSource() == b48) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-23?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r23().equals("Seccionadora Aberta")) {
                    b48.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r11();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    // seccionadora89c8fechada = "Seccionadora 89C8 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.seccionadora89r23().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r23().equals("Disjuntor Aberto")) {
                    b48.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r23();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    // seccionadora89c8fechada = "Seccionadora 89C8 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R23 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R23 " + eqp1.seccionadora89r11());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-23E #########################################################
        if (e.getSource() == b49) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-23E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r23e().equals("Seccionadora Aberta")) {
                    b49.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r23e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    // seccionadora89c8fechada = "Seccionadora 89C8 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.seccionadora89r23e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r23().equals("Disjuntor Aberto")) {
                    b49.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r23e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    // seccionadora89c8fechada = "Seccionadora 89C8 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R23 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R23-E " + eqp1.seccionadora89r11e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R23
        // ##############################################################
        if (e.getSource() == b50) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R23?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r23().equals("Disjuntor Aberto"))
                // && eqp.seccionadora89bta().equals("Seccionadora Fechada") &&
                // eqp.seccionadora89btb().equals("Seccionadora Fechada"))
                {
                    b50.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r23();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btfechado(usuario, data);

                    // seccionadora89c8fechada = "Seccionadora 89C8 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.disjuntor52r23().equals("Disjuntor Fechado") &&
                        eqp1.seccionadora89r23().equals("Seccionadora Fechada"))

                {
                    b50.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r23();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btaberto(usuario, data);

                    // seccionadora89c8fechada = "Seccionadora 89C8 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                }
            }
            if (eqp1.disjuntor52r23().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r23().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r23().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r23e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-22 #########################################################
        if (e.getSource() == b51) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-22?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r22().equals("Seccionadora Aberta")) {
                    b51.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r22();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    // seccionadora89c8fechada = "Seccionadora 89C8 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.seccionadora89r22().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r22().equals("Disjuntor Aberto")) {
                    b51.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r22();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora esta 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    // seccionadora89c8fechada = "Seccionadora 89C8 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R22 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R22 " + eqp1.seccionadora89r10());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-22E #########################################################
        if (e.getSource() == b52) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-22E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r22e().equals("Seccionadora Aberta")) {
                    b52.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r22e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    // seccionadora89c8fechada = "Seccionadora 89C8 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.seccionadora89r22e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r22().equals("Disjuntor Aberto")) {
                    b52.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r22e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    // seccionadora89c8fechada = "Seccionadora 89C8 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R22 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R22E " + eqp1.seccionadora89r10e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R22
        // ##############################################################
        if (e.getSource() == b53) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R22?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r22().equals("Disjuntor Aberto")) {
                    b53.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r22();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btfechado(usuario, data);

                    // disjuntor52r22fechado = "Disjuntor 52R22 Fechado";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.disjuntor52r22().equals("Disjuntor Fechado") &&
                        eqp1.seccionadora89r22().equals("Seccionadora Fechada") ||
                        eqp1.seccionadora89r22e().equals("Seccionadora Fechada"))

                {
                    b53.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r22();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btaberto(usuario, data);

                    // seccionadora89c8fechada = "Seccionadora 89C8 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                }
            }
            if (eqp1.disjuntor52r22().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r22().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r22().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r22e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-21 #########################################################
        if (e.getSource() == b54) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-21?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r21().equals("Seccionadora Aberta")) {
                    b54.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r21();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    seccionadora89r21fechada = "Seccionadora 89R21 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.seccionadora89r21().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r21().equals("Disjuntor Aberto")) {
                    b54.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r21();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    seccionadora89r21aberta = "Seccionadora 89R21 Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R-21 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R-21 " + eqp1.seccionadora89r21());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-21E #########################################################
        if (e.getSource() == b55) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-21E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r21e().equals("Seccionadora Aberta")) {
                    b55.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r21e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    seccionadora89r21efechada = "Seccionadora 89R21E Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.seccionadora89r21e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r21().equals("Disjuntor Aberto")) {
                    b55.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r21e();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora esta 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    seccionadora89r21eaberta = "Seccionadora 89R21E Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R-21 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R21-E " + eqp1.seccionadora89r21e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R21
        // ##############################################################
        if (e.getSource() == b56) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R-21?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r21().equals("Disjuntor Aberto") &&
                        eqp1.seccionadora89r21().equals("Seccionadora Fechada"))
                // eqp.seccionadora89btb().equals("Seccionadora Fechada"))
                {
                    b56.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r21();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btfechado(usuario, data);

                    disjuntor52r21fechado = "Disjuntor 52R21 Fechado";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.disjuntor52r21().equals("Disjuntor Fechado")) {
                    b56.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r21();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btaberto(usuario, data);

                    disjuntor52r21aberto = "Disjuntor 52R21 Aberto";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                }
            }
            if (eqp1.disjuntor52r21().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r21().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r21().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r21e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-20 #########################################################
        if (e.getSource() == b57) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-20?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r20().equals("Seccionadora Aberta")) {
                    b57.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r20();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    seccionadora89r20fechada = "Seccionadora 89R20 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.seccionadora89r20().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r20().equals("Disjuntor Aberto")) {
                    b57.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r20();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora esta 89 R20 foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    seccionadora89r20aberta = "Seccionadora 89R20 Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R-20 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R-20 " + eqp1.seccionadora89r20());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-20E #########################################################
        if (e.getSource() == b58) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-20E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r20e().equals("Seccionadora Aberta")) {
                    b58.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r20e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    seccionadora89r20efechada = "Seccionadora 89R20E Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.seccionadora89r20e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r20().equals("Disjuntor Aberto")) {
                    b58.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r20e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    seccionadora89r20eaberta = "Seccionadora 89R20E Aberta";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R-20 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R-20E " + eqp1.seccionadora89r20e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R20
        // ##############################################################
        if (e.getSource() == b59) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R20?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r20().equals("Disjuntor Aberto")) // &&
                // eqp1.seccionadora89r8().equals("Seccionadora Fechada") ||
                // eqp1.seccionadora89r8e().equals("Seccionadora Fechada"))

                {
                    b59.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r20();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btfechado(usuario, data);

                    disjuntor52r20fechado = "Disjuntor 52R20 Fechado";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.disjuntor52r20().equals("Disjuntor Fechado")) // &&
                // eqp.seccionadora89bta().equals("Seccionadora Fechada") &&
                // eqp.seccionadora89btb().equals("Seccionadora Fechada"))
                {
                    b59.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r20();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btaberto(usuario, data);

                    disjuntor52r20aberto = "Disjuntor 52R20 Aberto";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();
                }
            }
            if (eqp1.disjuntor52r20().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r20().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r20().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r20e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }
        // ################ ACAO DO BOTAO DA SECCIONADORA 89 TA8 ################
        if (e.getSource() == b60) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 TA8?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89ta4().equals("Seccionadora Aberta")) {
                    b60.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89ta4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    // seccionadora89ta8fechada = "Seccionadora 89TA8 Fechada";
                    manobrainteligente1.NormRed4();
                    manobrainteligente1.DeslProgRed4();
                    manobrainteligente1.TransfMT4MTR();
                    manobrainteligente1.TransfMTRMT4();

                } else if (eqp1.seccionadora89ta4().equals("Seccionadora Fechada")) {
                    b60.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89ta4();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);
                }
            }
            status1.setText(" 89 TA8 " + eqp1.seccionadora89ta4());
        }

        if (e.getSource() == b34) // ----------- BOTAO SAIR ----------------//
        {
            new InterfaceMenu().setVisible(true);
            setVisible(false);
        }

        if (e.getSource() == b40) {
            new InterfaceMenu().setVisible(true);
            setVisible(false);
        }
    }

    // ################ MÉTODO PARA ATUALIZAR A CONFIGURAÇÃO ##################
    public void atualizaConfiguracao() {
        eqp1.fecharSeccionadora89a7();
        eqp1.fecharDisjuntor52a7();
        eqp1.fecharSeccionadora89a8e();
        eqp1.fecharDisjuntor52a8();
        eqp1.fecharSeccionadora89c8();
        eqp1.fecharDisjuntor52c8();
        eqp1.fecharSeccionadora89c7();
        eqp1.fecharDisjuntor52c7();
        eqp1.fecharSeccionadora89lvr4();
        eqp1.fecharDisjuntor52lvr4();
        eqp1.fecharSeccionadora89p6();
        eqp1.fecharDisjuntor52p6();
        eqp1.fecharSeccionadora89r24();
        eqp1.fecharDisjuntor52r24();
        eqp1.fecharSeccionadora89r23();
        eqp1.fecharDisjuntor52r23();
        eqp1.fecharSeccionadora89r22();
        eqp1.fecharDisjuntor52r22();
        eqp1.fecharSeccionadora89r21();
        eqp1.fecharDisjuntor52r21();
        eqp1.fecharSeccionadora89r20();
        eqp1.fecharDisjuntor52r20();
        // eqp1.fecharSeccionadora89r20();
        // eqp1.fecharDisjuntor52r20();
        eqp1.fecharSeccionadora89r19();
        eqp1.fecharDisjuntor52r19();
        eqp1.fecharSeccionadora89ta4();
        b1.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b2.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b7.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b8.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b13.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b14.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b19.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b21.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b24.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b26.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b29.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b33.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b37.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b38.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b43.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
        b45.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b48.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
        b50.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b51.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
        b53.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b54.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
        b56.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b57.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
        b59.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b60.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
    }

    // ################## CLASSE DO MENU GERAL DAS MANOBRAS ####################
    public class MenuManobrasG extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        // private JPanel jpPainel = new JPanel();

        public MenuManobrasG() // --- Configura��o do Frame
        {
            super("Menu Geral das Manobras");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout
            setResizable(false);

            setSize(420, 300);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);

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
            bSair.setForeground(Color.black);// cor do titulo do botao
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
            // bManGeradores.setBackground(new Color(180, 180, 250));
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
            new MenuManobrasReduçao().setVisible(true);
            setVisible(false);
        }

        private void MTActionPerformed(ActionEvent evt) {
            new MenuManobrasTransf().setVisible(true);
            setVisible(false);
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

    // ############### CLASSE DO MENU DAS MANOBRAS DE TRANFERÊNCIA ###############
    public class MenuManobrasTransf extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        // private JPanel jpPainel = new JPanel();

        public MenuManobrasTransf() // --- Configura��o do Frame
        {
            super("Menu das Manobras Transferencia");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout

            setSize(630, 456);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);

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

            lbHabilitarManobra = new JLabel("Habilitar as Manobras de Transferencia");
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
                    .setToolTipText("Pressione para executar a manobra de transfer�ncia de carga do MT-R para o MT-4");
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
            bManobraPadrao.setToolTipText("Pressione conferir a manobra Padrao");
            bManobraPadrao.setMnemonic(KeyEvent.VK_P);
            bManobraPadrao.setActionCommand("Manobras");// define o nome da acao
            // bManobraPadrao.setBackground(new Color(180,180,250));
            bManobraPadrao.setBounds(306, 297, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bManobraPadrao);

            bLimpar = new JButton(" Limpar o Conteudo "); // BOT�O TABELA DE EVENTOS
            bLimpar.setToolTipText("Pressione limpar a mem�ria");
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

            // bTransfMT1MTR.setBackground(new Color(180, 180, 250));
            // bTransfMTRMT1.setBackground(new Color(180, 180, 250));
            // bTransfMT2MTR.setBackground(new Color(180, 180, 250));
            // bTransfMTRMT2.setBackground(new Color(180, 180, 250));
            bTransfMT4MTR.setBackground(new Color(180, 180, 250));
            bTransfMTRMT4.setBackground(new Color(180, 180, 250));

            container.add(painel);

            bTransfMT4MTR.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    TransfMT4MTR = "TransferirMT4MTR";
                    status1.setText(
                            "MANOBRA HABILITADA PARA SIMULAÇAO: " + " Manobra para transferir do MT-4 para o MT-R");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para transferir as cargas do MT-4 para o MT-R foi Habilitada com Sucesso!!!");
                }
            });

            bTransfMTRMT4.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        TransfMTRMT4 = "TransferirMTRMT4";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇAO: " + " Manobra para Tranferir do MT-R para MT-4");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para transferir as cargas do MT-R para o MT-4 foi Habilitada com Sucesso!!!");
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

    // ############## CLASSE DO MENU DAS MANOBRAS DAS REDUÇÕES ################
    public class MenuManobrasReduçao extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        // private JPanel jpPainel = new JPanel();

        public MenuManobrasReduçao() // --- Configura��o do Frame
        {
            super("Menu das Manobras da Reduçao");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout
            setResizable(false);

            setSize(620, 456);
            setLocation(230, 100);
            setVisible(true);

            // JLabel lbindice;

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
            projeto = new JLabel(" Manobras da Reduçao", JLabel.CENTER);
            projeto.setFont(new Font("Arial", 1, 36));
            projeto.setForeground(Color.blue);
            painel.add(projeto);

            lbHabilitarManobra = new JLabel("Habilitar as Manobras da Reduçao");
            lbHabilitarManobra.setFont(new Font("Arial", 1, 20));
            lbHabilitarManobra.setForeground(Color.black);
            lbHabilitarManobra.setBounds(160, 70, 380, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(lbHabilitarManobra);

            bDesligamentoProgRed1 = new JButton("Desligamento Programado da REDUÇAO 1");
            bDesligamentoProgRed1.setToolTipText("Pressione para executar a manobra de Desligamento da Reduçao 1 ");
            bDesligamentoProgRed1.setMnemonic(KeyEvent.VK_1);
            bDesligamentoProgRed1.setActionCommand("Manobras");// define o nome da acao
            bDesligamentoProgRed1.setBounds(2, 110, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesligamentoProgRed1);

            bNormalizaçaoRed1 = new JButton("Normalizaçao da REDUÇAO 1"); // BOT�O TABELA DE EVENTOS
            bNormalizaçaoRed1.setToolTipText("Pressione para executar a manobra de Reenergizaçao da Reduçao 1 ");
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
            bNormalizaçaoRed2.setToolTipText("Pressione para executar a manobra de Reenergizaçao da Reduçao 2");
            bNormalizaçaoRed2.setMnemonic(KeyEvent.VK_2);
            bNormalizaçaoRed2.setActionCommand("Manobras");// define o nome da acao
            bNormalizaçaoRed2.setBounds(306, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bNormalizaçaoRed2);

            bDesligamentoProgRed3 = new JButton("Desligamento Programado da REDUÇAO 3");
            bDesligamentoProgRed3.setToolTipText("Pressione para executar a manobra de Desligamento da Reduçao 3");
            bDesligamentoProgRed3.setMnemonic(KeyEvent.VK_3);
            bDesligamentoProgRed3.setActionCommand("Manobras");// define o nome da acao
            bDesligamentoProgRed3.setBounds(2, 188, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesligamentoProgRed3);

            bNormalizaçaoRed3 = new JButton("Normalizaçao da REDUÇAO 3"); // BOT�O TABELA DE EVENTOS
            bNormalizaçaoRed3.setToolTipText("Pressione para executar a manobra de Reenergizaçao da Reduçao 3");
            bNormalizaçaoRed3.setMnemonic(KeyEvent.VK_3);
            bNormalizaçaoRed3.setActionCommand("Manobras");// define o nome da acao
            bNormalizaçaoRed3.setBounds(306, 188, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bNormalizaçaoRed3);

            bDesligamentoProgRed4 = new JButton("Desligamento Programado da REDUÇAO 4"); // BOT�O TABELA DE EVENTOS
            bDesligamentoProgRed4.setToolTipText("Pressione para executar a manobra de Desligamento da Reduçao 4");
            bDesligamentoProgRed4.setMnemonic(KeyEvent.VK_4);
            bDesligamentoProgRed4.setActionCommand("Manobras");// define o nome da acao
            bDesligamentoProgRed4.setBounds(2, 227, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesligamentoProgRed4);

            bNormalizaçaoRed4 = new JButton("Normalizaçao da REDUÇAO 4"); // BOT�O TABELA DE EVENTOS
            bNormalizaçaoRed4.setToolTipText("Pressione para executar a manobra de Reenergizaçao da Reduçao 4");
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

            bManobraPadrao = new JButton(" Manobra Padrao "); // BOT�O TABELA DE EVENTOS
            bManobraPadrao.setToolTipText("Pressione para conferir a manobra Padrao");
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

            // bDesligamentoProgRed1.setBackground(new Color(180, 180, 250));
            // bNormalizaçaoRed1.setBackground(new Color(180, 180, 250));
            // bDesligamentoProgRed3.setBackground(new Color(180, 180, 250));
            // bNormalizaçaoRed3.setBackground(new Color(180, 180, 250));
            bDesligamentoProgRed4.setBackground(new Color(180, 180, 250));
            bNormalizaçaoRed4.setBackground(new Color(180, 180, 250));

            container.add(painel);

            bDesligamentoProgRed4.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DeslProgRed4 = "DeslProgRed4";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: "
                                + "Manobra para Desligamento da Reduçao 4                                  ");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para Desligamento da Reduçao 4 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bNormalizaçaoRed4.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        NormRed4 = "NormalizacaoRed4";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇAO: " + " Manobra para NormalizaÇAo da Reduçao 4");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para Normalizaçao da Reduçao 4 foi Habilitada com Sucesso!!!");
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

    // ################## CLASSE DAS MANOBRAS EXECUTADAS ################
    public class ManobraExecutada extends JFrame // implements ActionListener
    {
        private JLabel projeto;
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

            JButton Comparar;
            JButton Limpar;
            JButton Sair;

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

                    if (DeslProgRed4.equals("DeslProgRed4")) {
                        mostrar1.setText("                 " + disjuntor52c7aberto);
                        mostrar2.setText("                 " + disjuntor52c8aberto);
                        mostrar3.setText("                 " + disjuntor52lvr4aaberto);
                        mostrar4.setText("               " + disjuntor52lvr4aberto);
                    }

                    if (NormRed2.equals("NormalizacaoRed2")) {
                        mostrar1.setText("                " + disjuntor52lvr2fechado);
                        mostrar2.setText("                 " + disjuntor52r7fechado);
                        mostrar3.setText("                  " + disjuntor52c3fechado);
                        mostrar4.setText("                             " + disjuntor52c4fechado);
                    }

                    if (TransfMT4MTR.equals("TransferirMT4MTR")) {
                        mostrar1.setText("            " + disjuntor52c7aberto);
                        mostrar2.setText("            " + disjuntor52c8aberto);
                        mostrar3.setText("            " + disjuntor52r20aberto);
                        mostrar4.setText("         " + seccionadora89r20aberta);
                        mostrar5.setText("       " + seccionadora89r20efechada);
                        mostrar6.setText("           " + disjuntor52r20fechado);
                        mostrar7.setText("           " + disjuntor52r21aberto);
                        mostrar8.setText("        " + seccionadora89r21aberta);
                        mostrar9.setText("      " + seccionadora89r21efechada);
                        mostrar10.setText("          " + disjuntor52r21fechado);
                        mostrar11.setText("           " + disjuntor52p6aberto);
                        mostrar12.setText("        " + seccionadora89c7aberta);
                        mostrar13.setText("      " + seccionadora89c7efechada);
                        mostrar14.setText("        " + seccionadora89c8aberta);
                        mostrar15.setText("      " + seccionadora89c8efechada);
                        mostrar16.setText("          " + disjuntor52c7fechado);
                        mostrar17.setText("          " + disjuntor52c8fechado);
                        mostrar18.setText("        " + seccionadora89p6aberta);
                        mostrar19.setText("      " + seccionadora89p6efechada);
                        mostrar20.setText("          " + disjuntor52p6fechado);
                    }

                    if (TransfMTRMT4.equals("TransferirMTRMT4")) {
                        mostrar1.setText("             " + disjuntor52p6aberto);
                        mostrar2.setText("         " + seccionadora89p6eaberta);
                        mostrar3.setText("         " + seccionadora89p6fechada);
                        mostrar4.setText("             " + disjuntor52c7aberto);
                        mostrar5.setText("             " + disjuntor52c8aberto);
                        mostrar6.setText("             " + disjuntor52r20aberto);
                        mostrar7.setText("         " + seccionadora89r20eaberta);
                        mostrar8.setText("         " + seccionadora89r20fechada);
                        mostrar9.setText("            " + disjuntor52r20fechado);
                        mostrar10.setText("            " + disjuntor52r21aberto);
                        mostrar11.setText("        " + seccionadora89r21eaberta);
                        mostrar12.setText("        " + seccionadora89r21fechada);
                        mostrar13.setText("           " + disjuntor52r21fechado);
                        mostrar14.setText("           " + disjuntor52p6fechado);
                        mostrar15.setText("        " + seccionadora89c7eaberta);
                        mostrar16.setText("        " + seccionadora89c7fechada);
                        mostrar17.setText("        " + seccionadora89c8eaberta);
                        mostrar18.setText("        " + seccionadora89c8fechada);
                        mostrar19.setText("           " + disjuntor52c8fechado);
                        mostrar20.setText("           " + disjuntor52c8fechado);
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
                        manobra = " OM para Preparar a SE ALBRAS para Normalizaçao";
                        lbManobra.setText(manobra);
                    }

                    if (EnerGerador.equals("EnergizarGerador")) {
                        manobra = " OM para Energizar os Geradores";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed4.equals("DeslProgRed4")) {
                        manobra = " OM para Desligar a Reduçao 4";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed4.equals("NormalizacaoRed4")) {
                        manobra = " OM para Normalizar a Reduçao 4";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT4MTR.equals("TransferirMT4MTR")) {
                        manobra = " OM para Transferir do Trafo MT-4 para o MT-R";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT4.equals("TransferirMTRMT4")) {
                        manobra = " OM para Transferir do Trafo MT-R para o MT-4";
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
                    setVisible(false);
                }
            });
        }// Fim main

    }// Fim Teste

    // ################## CLASSE DAS MANOBRAS PADRÃO ####################
    public class ManobraPadrao extends JFrame // implements ActionListener
    {
        private JLabel projeto;
        String manobra = "";

        public ManobraPadrao() {
            setTitle("Ordem de Manobra  " + "Padrao");
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

            JButton Comparar;
            JButton Limpar;
            JButton Sair;
            // JButton Manobra;

            final JLabel lbManobra;

            JPanel painel = new JPanel();

            projeto = new JLabel(" Manobra Padrao!", JLabel.CENTER);
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
                        // mostrar10.setText(" 10. Fechar disjuntor 52 A1");
                        // mostrar11.setText(" 11. Fechar disjuntor 52 A2");
                        // mostrar12.setText(" 12. Fechar disjuntor 52 A3");
                        // mostrar13.setText(" 13. Fechar disjuntor 52 A4");
                        // mostrar14.setText(" 14. Fechar disjuntor 52 A5");
                        // mostrar15.setText(" 15. Fechar disjuntor 52 A6");
                        mostrar16.setText("       16. Fechar disjuntor 52 A7");
                        mostrar17.setText("       17. Fechar disjuntor 52 A8");
                        // mostrar18.setText(" 18. Fechar disjuntor 52 P1");
                        // mostrar19.setText(" 19. Fechar disjuntor 52 P2");
                        // mostrar20.setText(" 20. Fechar disjuntor 52 P3");
                        // mostrar21.setText(" 21. Fechar disjuntor 52 P4");
                        // mostrar22.setText(" 22. Fechar disjuntor 52 P5");
                        mostrar23.setText("       23. Fechar disjuntor 52 P6");
                    }

                    if (DesenAlbras.equals("DesenergizarAlbras")) {
                        // mostrar1.setText(" 1. Abrir Disjuntor 52 L1");
                        // mostrar2.setText(" 2. Abrir Disjuntor 52 L2");
                        // mostrar3.setText(" 3. Abrir Disjuntor 52 BT");
                        // mostrar4.setText(" 4. Abrir Disjuntor 52 AL");
                        // mostrar5.setText(" 5. Abrir Disjuntor 52 MT-1");
                        // mostrar6.setText(" 6. Abrir Disjuntor 52 MT-R");
                        // mostrar7.setText(" 7. Abrir Disjuntor 52 MT-2");
                        // mostrar8.setText(" 8. Abrir Disjuntor 52 MT-3");
                        // mostrar9.setText(" 9. Abrir Disjuntor 52 MT-4");
                        // mostrar10.setText(" 10. Abrir disjuntor 52 A1");
                        // mostrar11.setText(" 11. Abrir disjuntor 52 A2");
                        // mostrar12.setText(" 12. Abrir disjuntor 52 A3");
                        // mostrar13.setText(" 13. Abrir disjuntor 52 A4");
                        // mostrar14.setText(" 14. Abrir disjuntor 52 A5");
                        // mostrar15.setText(" 15. Abrir disjuntor 52 A6");
                        mostrar16.setText("       16. Abrir disjuntor 52 A7");
                        mostrar17.setText("       17. Abrir disjuntor 52 A8");
                        // mostrar18.setText(" 18. Abrir disjuntor 52 P1");
                        // mostrar19.setText(" 19. Abrir disjuntor 52 P2");
                        // mostrar20.setText(" 20. Abrir disjuntor 52 P3");
                        // mostrar21.setText(" 21. Abrir disjuntor 52 P4");
                        // mostrar22.setText(" 22. Abrir disjuntor 52 P5");
                        mostrar23.setText("       23. Abrir disjuntor 52 P6");
                    }

                    if (PrepAlbras.equals("PrepAlbras")) {
                        // mostrar1.setText(" 1. Abrir Seccionadora 89 A2-E");
                        // mostrar2.setText(" 2. Abrir Seccionadora 89 A4-E");
                        // mostrar3.setText(" 3. Abrir Seccionadora 89 A6-E");
                        mostrar4.setText("    4. Abrir Seccionadora 89 A8-E");
                        // mostrar5.setText(" 5.Abrir Seccionadora 89 LVRR-E");
                        // mostrar6.setText(" 6. Abrir Seccionadora 89 LVR-R");
                        // mostrar7.setText(" 7. Abrir Seccionadora 89 P1");
                        // mostrar8.setText(" 8. Abrir Seccionadora 89 P2");
                        // mostrar9.setText(" 9. Abrir Seccionadora 89 P3");
                        // mostrar10.setText(" 10. Abrir Seccionadora 89 P4");
                        // mostrar11.setText(" 11. Abrir Seccionadora 89 P5");
                        mostrar12.setText("    12. Abrir Seccionadora 89 P6");
                        // mostrar13.setText(" 13.Fechar Seccionadora 89 A2-E");
                        // mostrar14.setText(" 14.Fechar Seccionadora 89 A4-E");
                        // mostrar15.setText(" 15.Fechar Seccionadora 89 A6-E");
                        mostrar16.setText("  16.Fechar Seccionadora 89 A8-E");
                        // mostrar17.setText(" 17.Fechar Seccionadora 89 P1-E");
                        // mostrar18.setText(" 18.Fechar Seccionadora 89 P2-E");
                        // mostrar19.setText(" 19.Fechar Seccionadora 89 P3-E");
                        // mostrar20.setText(" 20.Fechar Seccionadora 89 P4-E");
                        // mostrar21.setText(" 21.Fechar Seccionadora 89 P5-E");
                        mostrar22.setText("  22.Fechar Seccionadora 89 P6-E");
                        // mostrar23.setText(" 23.Fechar Seccionadora 89 TU-E");
                        // mostrar24.setText(" 24. Fechar Disjuntor 52 TU");
                    }

                    if (EnerGerador.equals("EnergizarGerador")) {
                        mostrar1.setText("              1. Fechar Disjuntor 52 G1");
                        mostrar2.setText("                        2. Fechar Disjuntor 52 G2");
                    }

                    if (DeslProgRed4.equals("DeslProgRed4")) {
                        mostrar1.setText("                   1. Desligar Disjuntor 52 C7");
                        mostrar2.setText("                   2. Desligar DisJuntor 52 C8");
                        mostrar3.setText("               3. Desligar Disjuntor 52 LVR4-A");
                        mostrar4.setText("                4. Desligar Disjuntor 52 LVR-4");
                    }

                    if (NormRed4.equals("NormalizacaoRed4")) {
                        mostrar1.setText("                   1. Ligar Disjuntor 52 LVR-4");
                        mostrar2.setText("                  2. Ligar Disjuntor 52 LVR-4A");
                        mostrar3.setText("                      3. Ligar Disjuntor 52 C7");
                        mostrar4.setText("                      4. Ligar Disjuntor 52 C8");
                    }

                    if (TransfMT4MTR.equals("TransferirMT4MTR")) {
                        mostrar1.setText("     1. Desligar Disjuntor 52 P6 ");
                        mostrar2.setText("     2. Abrir Seccionadora 89 P6 ");
                        mostrar3.setText("  3. Fechar Seccionadora 89 P6-E ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C7 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C8 ");
                        mostrar6.setText("      6. Abrir Disjuntor 52 R-19 ");
                        mostrar7.setText(" 7. Abrir Seccionadora 89 R-19 ");
                        mostrar8.setText(" 8. Fechar Seccionadora 89 R-19E ");
                        mostrar9.setText("     9. Fechar Disjuntor 52 R-19 ");
                        mostrar10.setText("     10. Abrir Disjuntor 52 R-20");
                        mostrar11.setText("11. Abrir Seccionadora 89 R-20");
                        mostrar12.setText("12. Fechar Seccionadora 89 R-20E");
                        mostrar13.setText("     13.Fechar Disjuntor 52 R-20 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P6 ");
                        mostrar15.setText("   15. Abrir Seccionadora 89 C7 ");
                        mostrar16.setText("16. Fechar Seccionadora 89 C7-E ");
                        mostrar17.setText("   17. Abrir Seccionadora 89 C8 ");
                        mostrar18.setText("18. Fechar Seccionadora 89 C8-E ");
                        mostrar19.setText("     19. Fechar Disjuntor 52 C7 ");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C8 ");
                    }

                    if (TransfMTRMT4.equals("TransferirMTRMT4")) {
                        mostrar1.setText("      1.Desligar Disjuntor 52 P6 ");
                        mostrar2.setText("   2. Abrir Seccionadora 89 P6-E ");
                        mostrar3.setText("    3. Fechar Seccionadora 89 P6 ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C7 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C8 ");
                        mostrar6.setText("      6. Abrir disjuntor 52 R-19 ");
                        mostrar7.setText(" 7. Abrir Seccionadora89 R-19E ");
                        mostrar8.setText(" 8. Fechar Secccionadora 89 R-19 ");
                        mostrar9.setText("     9. Fechar Disjuntor 52 R-19 ");
                        mostrar10.setText("    10. Abrir Disjuntor 52 R-20 ");
                        mostrar11.setText("11. Abrir Seccionadora 89 R-20E");
                        mostrar12.setText("12. Fechar Seccionadora 89 R-20");
                        mostrar13.setText("   13. Fechar Disjuntor 52 R-20 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P6 ");
                        mostrar15.setText("   15. Abrir Seccionadora 89 C7 ");
                        mostrar16.setText("16. Fechar Seccionadora 89 C7-E ");
                        mostrar17.setText("   17. Abrir Seccionadora 89 C8 ");
                        mostrar18.setText("  18. Fechar Seccionadora 89 C8E");
                        mostrar19.setText("     19. Fechar Disjuntor 52 C7 ");
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

                    if (DeslProgRed4.equals("DeslProgRed4")) {
                        manobra = " OM para Desligar a Reduçao 4 ";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed4.equals("NormalizacaoRed4")) {
                        manobra = " OM para Normalizar a Reduçao 4 ";
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

    // ################## CLASSE DA MANOBRA INTELIGENTE1 ####################
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

                if (disjuntor52a7fechado.equals("Disjuntor 52A7 Fechado") && passo == 0) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso !!!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a8fechado.equals("Disjuntor 52A8 Fechado") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso !!!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52p6fechado.equals("Disjuntor 52P6 Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 23;
                    relogio.setVisible(true);
                    relogio.rendimento();
                    relogio.atualizaTempo();
                    JOptionPane.showMessageDialog(null, "Passo 23 realizado com sucesso !!!",
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

                if (disjuntor52a7aberto.equals("Disjuntor 52A7 Aberto") && passo == 0) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso !!!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a8aberto.equals("Disjuntor 52A8 Aberto") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null,
                            "Passo 17 realizado com sucesso, Continue no Painel do LVR-1!!!",
                            "Passo para Desenergizar a SE ALBRAS!",
                            JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52p6aberto.equals("Disjuntor 52P6 Aberto") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 21;
                    relogio.rendimento();
                    relogio.atualizaTempo();
                    relogio.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Passo 23 realizado com sucesso!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);

                    if (passo == 3 && disjuntor52p6aberto.equals("Disjuntor 52P6 Aberto") ||
                            passo != 23)
                        JOptionPane.showMessageDialog(null,
                                "OM para Desenergizar a SE ALBRAS! Concluída com Sucesso!!!",
                                "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                } else {
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

                if (seccionadora89a8eaberta.equals("Seccionadora 89A8E Aberta") && passo == 0) {
                    passo = passo + 1;
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p6aberta.equals("Seccionadora 89P6 Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89a8efechada.equals("Seccionadora 89A8E Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p6efechada.equals("Seccionadora 89P6E Fechada") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else {
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

        public void TransfMT4MTR() {
            if (TransfMT4MTR.equals("TransferirMT4MTR")) {
                relogio.quantpassos = 20;
                if (disjuntor52p6aberto.equals("Disjuntor 52P6 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p6aberta.equals("Seccionadora 89P6 Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p6efechada.equals("Seccionadora 89P6E Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c7aberto.equals("Disjuntor 52C7 Aberto") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c8aberto.equals("Disjuntor 52C8 Aberto") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r19aberto.equals("Disjuntor 52R19 Aberto") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r19aberta.equals("Seccionadora 89R19 Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r19efechada.equals("Seccionadora 89R19E Fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r19fechado.equals("Disjuntor 52R19 Fechado") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r20aberto.equals("Disjuntor 52R20 Aberto") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r20aberta.equals("Seccionadora 89R20 Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (seccionadora89r20efechada.equals("Seccionadora 89R20E Fechada") && passo == 11) {
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52r20fechado.equals("Disjuntor 52R20 Fechado") && passo == 12) {
                    passo = passo + 1;
                    relogio.passo = 13;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52p6fechado.equals("Disjuntor 52P6 Fechado") && passo == 13) {
                    passo = passo + 1;
                    relogio.passo = 14;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89c7aberta.equals("Seccionadora 89C7 Aberta") && passo == 14) {
                    passo = passo + 1;
                    relogio.passo = 15;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (seccionadora89c7efechada.equals("Seccionadora 89C7E Fechada") && passo == 15) {
                    passo = passo + 1;
                    relogio.passo = 16;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89c8aberta.equals("Seccionadora 89C8 Aberta") && passo == 16) {
                    passo = passo + 1;
                    relogio.passo = 17;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (seccionadora89c8efechada.equals("Seccionadora 89C8E Fechada") && passo == 17) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52c7fechado.equals("Disjuntor 52C7 Fechado") && passo == 18) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52c8fechado.equals("Disjuntor 52C8 Fechado") && passo == 19) {
                    passo = passo + 1;
                    relogio.passo = 20;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 20 && disjuntor52c8fechado.equals("Disjuntor 52C8 Fechado") ||
                    // disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") &&
                    // disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") &&
                    // disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") &&
                    // disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") &&
                    // disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") &&
                    // disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                    // disjuntor52alfechado.equals("Disjuntor 52AL Fechado") &&
                    // disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") &&
                    // disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") ||
                            passo != 20)
                        JOptionPane.showMessageDialog(null,
                                "OM para Transferir do MT-4 para MT-R ! Concluida com sucesso !!!",
                                "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Transferir do MT-4 para o MT-R Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void TransfMTRMT4() {
            if (TransfMTRMT4.equals("TransferirMTRMT4")) {
                relogio.quantpassos = 20;
                if (disjuntor52p6aberto.equals("Disjuntor 52P6 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Transferir do MT-4 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p6eaberta.equals("Seccionadora 89P6E Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p6fechada.equals("Seccionadora 89P6 Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c7aberto.equals("Disjuntor 52C7 Aberto") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c8aberto.equals("Disjuntor 52C8 Aberto") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r19aberto.equals("Disjuntor 52R19 Aberto") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r19eaberta.equals("Seccionadora 89R19E Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r19fechada.equals("Seccionadora 89R19 Fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r19fechado.equals("Disjuntor 52R19 Fechado") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r20aberto.equals("Disjuntor 52R20 Aberto") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r20eaberta.equals("Seccionadora 89R20E Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);

                } else if (seccionadora89r20fechada.equals("Seccionadora 89R20 Fechada") && passo == 11) {
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52r20fechado.equals("Disjuntor 52R20 Fechado") && passo == 12) {
                    passo = passo + 1;
                    relogio.passo = 13;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52p6fechado.equals("Disjuntor 52P6 Fechado") && passo == 13) {
                    passo = passo + 1;
                    relogio.passo = 14;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89c7eaberta.equals("Seccionadora 89C7E Aberta") && passo == 14) {
                    passo = passo + 1;
                    relogio.passo = 15;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);

                } else if (seccionadora89c7fechada.equals("Seccionadora 89C7 Fechada") && passo == 15) {
                    passo = passo + 1;
                    relogio.passo = 16;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89c8eaberta.equals("Seccionadora 89C8E Aberta") && passo == 16) {
                    passo = passo + 1;
                    relogio.passo = 17;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);

                } else if (seccionadora89c8fechada.equals("Seccionadora 89C8 Fechada") && passo == 17) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52c7fechado.equals("Disjuntor 52C7 Fechado") && passo == 18) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso !!!",
                            "Transferir do MT-R para MT-4", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52c8fechado.equals("Disjuntor 52C8 Fechado") && passo == 19) {
                    passo = passo + 1;
                    relogio.passo = 20;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 20 && disjuntor52c8fechado.equals("Disjuntor 52C8 Fechado") ||
                    // disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") &&
                    // disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") &&
                    // disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") &&
                    // disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") &&
                    // disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") &&
                    // disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                    // disjuntor52alfechado.equals("Disjuntor 52AL Fechado") &&
                    // disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") &&
                    // disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") ||
                            passo != 20)
                        JOptionPane.showMessageDialog(null,
                                "OM para Transferir do MT-R para MT-4 ! Concluida com sucesso !!!",
                                "Transferir do MT-R para MT-2", JOptionPane.INFORMATION_MESSAGE);
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

        public void DeslProgRed4() {
            if (DeslProgRed4.equals("DeslProgRed4")) {
                relogio.quantpassos = 4;
                if (disjuntor52c7aberto.equals("Disjuntor 52C7 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Desligamento da Reduçao 4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c8aberto.equals("Disjuntor 52C8 Aberto") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Desligamento da Reduçao 4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r19aberto.equals("Disjuntor 52R19 Aberto") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Desligamento da Reduçao 4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52lvr4aberto.equals("Disjuntor 52LVR4 Aberto") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 4 && disjuntor52lvr4aberto.equals("Disjuntor 52LVR4 Aberto") ||
                    // disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") &&
                    // disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") &&
                    // disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") &&
                    // disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") &&
                    // disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") &&
                    // disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                    // disjuntor52alfechado.equals("Disjuntor 52AL Fechado") &&
                    // disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") &&
                    // disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") ||
                            passo != 4)
                        JOptionPane.showMessageDialog(null, "OM para Desligar a Reduçao 4 ! Concluida com sucesso !!!",
                                "Desligamento da Reduçao 4", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Desligamento Programado da Redução 4 Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void NormRed4() {
            if (NormRed4.equals("NormalizacaoRed4")) {
                relogio.quantpassos = 4;
                if (disjuntor52lvr4fechado.equals("Disjuntor 52LVR4 Fechado") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Normalizaçao da Reduçao 4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r19fechado.equals("Disjuntor 52R19 Fechado") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Normalizaçao da Reduçao 4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c7fechado.equals("Disjuntor 52C7 Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Normalizaçao da Reduçao 4", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c8fechado.equals("Disjuntor 52C8 Fechado") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 4 && disjuntor52lvr4fechado.equals("Disjuntor 52LVR4 Fechado") ||
                    // disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") &&
                    // disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") &&
                    // disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") &&
                    // disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") &&
                    // disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") &&
                    // disjuntor52btfechado.equals("Disjuntor 52BT Fechado") &&
                    // disjuntor52alfechado.equals("Disjuntor 52AL Fechado") &&
                    // disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") &&
                    // disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") ||
                            passo != 4)
                        JOptionPane.showMessageDialog(null,
                                "OM para Normalizar a Reduçao 4 ! Concluida com sucesso !!!",
                                "Normalizaçao da Reduçao 4", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Normalizar a Redução 4 Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }
    }

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
        seccionadora89p1fechada = "";
        seccionadora89p2fechada = "";
        seccionadora89p3fechada = "";
        seccionadora89p4fechada = "";
        seccionadora89p5fechada = "";
        seccionadora89p6fechada = "";
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
        seccionadora89p1eaberta = "";
        seccionadora89p2eaberta = "";
        seccionadora89p3eaberta = "";
        seccionadora89p4eaberta = "";
        seccionadora89p5eaberta = "";
        seccionadora89p6eaberta = "";
        seccionadora89tuefechada = "";
        seccionadora89tueaberta = "";
        seccionadora89c1aberta = "";
        seccionadora89c2aberta = "";
        seccionadora89c3aberta = "";
        seccionadora89c4aberta = "";
        seccionadora89c5aberta = "";
        seccionadora89c6aberta = "";
        seccionadora89c1fechada = "";
        seccionadora89c2fechada = "";
        seccionadora89c3fechada = "";
        seccionadora89c4fechada = "";
        seccionadora89c5fechada = "";
        seccionadora89c6fechada = "";
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
        seccionadora89r3fechada = "";
        seccionadora89r4fechada = "";
        seccionadora89r5fechada = "";
        seccionadora89r6fechada = "";
        seccionadora89r3aberta = "";
        seccionadora89r4aberta = "";
        seccionadora89r5aberta = "";
        seccionadora89r6aberta = "";
        seccionadora89r3eaberta = "";
        seccionadora89r4eaberta = "";
        seccionadora89r5eaberta = "";
        seccionadora89r6eaberta = "";
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
        disjuntor52tuaberto = "";
        disjuntor52lvr2fechado = "";
        disjuntor52lvr2aberto = "";
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
        disjuntor52r8aberto = "";
        disjuntor52r9fechado = "";
        disjuntor52r9aberto = "";
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
        JOptionPane.showMessageDialog(null, " Voce ja pode Habilitar a prOxima manobra para Simulaçao!!!");
    }

    public static void main(String args[]) {
        new InterfaceMT4().setVisible(true);
        // InterfaceMT4 application = new InterfaceMT4();
    }
}