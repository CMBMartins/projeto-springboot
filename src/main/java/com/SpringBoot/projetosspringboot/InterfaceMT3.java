
/*******************************************************
 * PROJETO SIMULADOR PARA TREINAMENTO DE OPERADORES DE *
 * SUBESTAÇAO.                                         *
 * PROJETISTA E DESENVOLVEDOR:                         *
 *          CARLOS MARDONIO BEZERRA MARTINS            * 
 *         BACHAREL EM SISTEMAS DE INFORMA��O          *
 *                                                     *
 * DATA - 18/08/2006                                   *
 * ATUALIZADO - 19/08/2008                            *
 *******************************************************
 * MODULO -   INTERFACEMT3                             *
 ******************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
//import java.text.DecimalFormat;
import java.text.SimpleDateFormat; //Carregar este pacote

public class InterfaceMT3 extends JFrame implements ActionListener {
    JLabel tap, valortap, tensao, trafo, barra1, barra2, tap1, tap2, valortap1, valortap2, trafo1, trafo2, subir,
            descer, Alarmes;
    JLabel mt1a, mt1b, mt2a, mt2b, l1a, l1b, l2a, l2b, l189, l289, l157, l1, l257, l2, bta, btb, bta57, btb57, mt152,
            mtr52, mt252, l152, l252, bt52, gif1, ta1;
    JLabel status, status1, status2, mt1, mtr, mt2, c1, c2, lvr1, rf6, rf5, rf3, rf4, pla1, pla2, a6, a6e, rf5e, rf4e,
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
    String seccionadora89lvr3fechada = "";
    String seccionadora89lvr3efechada = "";
    String seccionadora89lvr3aberta = "";
    String seccionadora89lvr3eaberta = "";
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
    String seccionadora89r13fechada = "";
    String seccionadora89r14fechada = "";
    String seccionadora89r15fechada = "";
    String seccionadora89r16fechada = "";
    String seccionadora89r17fechada = "";
    String seccionadora89r18fechada = "";
    String seccionadora89r13aberta = "";
    String seccionadora89r14aberta = "";
    String seccionadora89r15aberta = "";
    String seccionadora89r16aberta = "";
    String seccionadora89r17aberta = "";
    String seccionadora89r18aberta = "";
    String seccionadora89r13eaberta = "";
    String seccionadora89r14eaberta = "";
    String seccionadora89r15eaberta = "";
    String seccionadora89r16eaberta = "";
    String seccionadora89r17eaberta = "";
    String seccionadora89r18eaberta = "";
    String seccionadora89r13efechada = "";
    String seccionadora89r14efechada = "";
    String seccionadora89r15efechada = "";
    String seccionadora89r16efechada = "";
    String seccionadora89r17efechada = "";
    String seccionadora89r18efechada = "";
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
    String disjuntor52lvr3fechado = "";
    String disjuntor52lvr3aberto = "";
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

    public InterfaceMT3() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout()); // gerenciador de layout
        setResizable(false);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        setTitle("Barramento de 34.5 kV MT-3");
        setSize(1100, 810);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        c.setBackground(new Color(180, 180, 180));
        // setLocation(300, 70);

        Object[] options = { "Sim", "Não", "Cancelar" };
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
        l1.setText("MT-3 Barramento de 34,5 kV");
        l1.setForeground(Color.green);

        Icon imagem1 = new ImageIcon("Carlos4.GIF");
        gif1 = new JLabel();
        gif1.setIcon(imagem1);
        gif1.setBounds(1020, 684, 100, 100);
        // gif1.setBounds(963, 624, 100, 100); // Coluna,Linha,Largura,Altura
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

        tfUsuario = new JTextField("      Default     ");
        tfUsuario.setEditable(false);
        tfUsuario.addActionListener(this);
        tfUsuario.setFont(new Font("Dialog", Font.BOLD, 16));
        tfUsuario.setBackground(new Color(0, 0, 0));// cor de fundo do bot�o
        tfUsuario.setForeground(Color.yellow);
        tfUsuario.setBounds(910, 0, 105, 25); // Coluna,Linha,Largura,Altura
        // getContentPane().add(tfUsuario);

        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat(" dd/MM/yyyy hh:mm"); // somente a data em um objeto separado
        String date = formato.format(data); // variavel date recebe o conteudo do objeto data
        tfData = new JTextField(date);
        tfData.setEditable(false);
        tfData.setFont(new Font("Dialog", Font.BOLD, 12));
        tfData.setBackground(new Color(0, 0, 0));// cor de fundo do bot�o
        tfData.setForeground(Color.yellow);
        tfData.setBounds(910, 25, 105, 25); // Coluna,Linha,Largura,Altura
        // getContentPane().add(tfData);

        b36 = new JButton(""); // BOT�O ATUALIZAR A HORA
        b36.setIcon(new javax.swing.ImageIcon("Hora.jpg"));
        b36.addActionListener(this);
        b36.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b36.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b36.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b36.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b36.setForeground(Color.black);// cor do titulo do bot�o
        b36.setEnabled(true);
        b36.setToolTipText("Pressione para atualizar a hora do Sistema");
        b36.setMnemonic(KeyEvent.VK_B);
        b36.setActionCommand("Hora");// define o nome da acao
        b36.setBounds(884, 25, 25, 25); // Coluna,Linha,Largura,Altura
        // getContentPane().add(b36);

        c.add(p1, java.awt.BorderLayout.NORTH);

        // ���������������������������������������������� BARRAS T3 E EM
        // ���������������������������������������������
        JPanel v = new JPanel(); // Barra T3
        v.setBounds(0, 5, 1020, 3);
        v.setBackground(Color.orange);
        painel.add(v);

        JPanel v1 = new JPanel(); // Barra EM
        v1.setBounds(0, 30, 1020, 3);
        v1.setBackground(Color.orange);
        painel.add(v1);

        barra1 = new JLabel("Barra T3"); // IDENTIFICA��O DA BARRA T3
        barra1.setForeground(Color.white);
        barra1.setBounds(10, 0, 60, 30);
        painel.add(barra1);

        barra2 = new JLabel("Barra EM");
        barra2.setForeground(Color.white);
        barra2.setBounds(10, 25, 60, 30); // IDENTIFICA��O DA BARRA EM
        painel.add(barra2);
        // ##################################### IDENTIFICA��O DOS EQUIPAMENTOS
        // ####################################
        mt2a = new JLabel("89 C5");
        mt2a.setForeground(Color.white);
        mt2a.setBounds(12, 40, 60, 30);
        painel.add(mt2a);
        mt2b = new JLabel("89 C5-E");
        mt2b.setForeground(Color.white);
        mt2b.setBounds(70, 40, 60, 30);
        painel.add(mt2b);
        mt1a = new JLabel("89 C6");
        mt1a.setForeground(Color.white);
        mt1a.setBounds(132, 40, 60, 30);
        painel.add(mt1a);
        mt1b = new JLabel("89 C6-E");
        mt1b.setForeground(Color.white);
        mt1b.setBounds(190, 40, 60, 30);
        painel.add(mt1b);
        mt2a = new JLabel("89 A5");
        mt2a.setForeground(Color.white);
        mt2a.setBounds(250, 40, 60, 30);
        painel.add(mt2a);
        mt2b = new JLabel("89 A5-E");
        mt2b.setForeground(Color.white);
        mt2b.setBounds(310, 40, 60, 30);
        painel.add(mt2b);
        a6 = new JLabel("89 A6");
        a6.setForeground(Color.white);
        a6.setBounds(370, 40, 60, 30);
        painel.add(a6);
        a6e = new JLabel("89 A6-E");
        a6e.setForeground(Color.white);
        a6e.setBounds(430, 40, 60, 30);
        painel.add(a6e);
        l1a = new JLabel("89 LR-3");
        l1a.setForeground(Color.white);
        l1a.setBounds(740, 40, 60, 30);
        painel.add(l1a);
        l1b = new JLabel("89 LR-3E");
        l1b.setForeground(Color.white);
        l1b.setBounds(800, 40, 60, 30);
        painel.add(l1b);
        ta1 = new JLabel("89 TA3");
        ta1.setForeground(Color.white);
        ta1.setBounds(995, 40, 60, 30);
        painel.add(ta1);
        l2a = new JLabel("89 P4");
        l2a.setForeground(Color.white);
        l2a.setBounds(495, 40, 60, 30);
        painel.add(l2a);
        l2b = new JLabel("89 P4-E");
        l2b.setForeground(Color.white);
        l2b.setBounds(555, 40, 60, 30);
        painel.add(l2b);
        l2a = new JLabel("89 P5");
        l2a.setForeground(Color.white);
        l2a.setBounds(615, 40, 60, 30);
        painel.add(l2a);
        l2b = new JLabel("89 P5-E");
        l2b.setForeground(Color.white);
        l2b.setBounds(675, 40, 60, 30);
        painel.add(l2b);
        bta = new JLabel("89 RF-13");
        bta.setForeground(Color.white);
        bta.setBounds(870, 40, 60, 30);
        painel.add(bta);
        btb = new JLabel("89 RF-13E");
        btb.setForeground(Color.white);
        btb.setBounds(930, 40, 60, 30);
        painel.add(btb);
        mt152 = new JLabel("52 C6");
        mt152.setForeground(Color.white);
        mt152.setBounds(190, 150, 60, 30);
        painel.add(mt152);
        mt252 = new JLabel("52 A5");
        mt252.setForeground(Color.white);
        mt252.setBounds(310, 150, 60, 30);
        painel.add(mt252);
        mt252 = new JLabel("52 A6");
        mt252.setForeground(Color.white);
        mt252.setBounds(430, 150, 60, 30);
        painel.add(mt252);
        mt252 = new JLabel("52 C5");
        mt252.setForeground(Color.white);
        mt252.setBounds(70, 150, 60, 30);
        painel.add(mt252);
        l152 = new JLabel("52 LVR-3");
        l152.setForeground(Color.white);
        l152.setBounds(800, 150, 60, 30);
        painel.add(l152);
        ta1 = new JLabel("TA3");
        ta1.setForeground(Color.white);
        ta1.setBounds(995, 120, 60, 30);
        painel.add(ta1);
        l252 = new JLabel("52 P4");
        l252.setForeground(Color.white);
        l252.setBounds(555, 150, 60, 30);
        painel.add(l252);
        l252 = new JLabel("52 P5");
        l252.setForeground(Color.white);
        l252.setBounds(675, 150, 60, 30);
        painel.add(l252);
        bt52 = new JLabel("52 RF-13");
        bt52.setForeground(Color.white);
        bt52.setBounds(915, 120, 60, 30);
        painel.add(bt52);

        c2 = new JLabel("BANCO C6");
        c2.setForeground(Color.white);
        c2.setBounds(138, 250, 60, 30);
        painel.add(c2);
        c1 = new JLabel("BANCO C5");
        c1.setForeground(Color.white);
        c1.setBounds(18, 250, 60, 30);
        painel.add(c1);
        lvr1 = new JLabel("LVR-3");
        lvr1.setForeground(Color.white);
        lvr1.setBounds(725, 255, 60, 30);
        painel.add(lvr1);
        lvr1 = new JLabel("TF Regul. 34,5/34,5kV");
        lvr1.setForeground(Color.white);
        lvr1.setBounds(785, 220, 260, 30);
        painel.add(lvr1);
        pla1 = new JLabel("Trafo de Aterramento");
        pla1.setForeground(Color.white);
        pla1.setBounds(920, 190, 260, 30);
        painel.add(pla1);
        pla1 = new JLabel("Aliment. A5");
        pla1.setForeground(Color.white);
        pla1.setBounds(260, 250, 260, 30);
        painel.add(pla1);
        pla1 = new JLabel("Aliment. A6");
        pla1.setForeground(Color.white);
        pla1.setBounds(380, 250, 260, 30);
        painel.add(pla1);
        pla1 = new JLabel("Aliment. P4");
        pla1.setForeground(Color.white);
        pla1.setBounds(505, 240, 260, 30);
        painel.add(pla1);
        pla1 = new JLabel("Aliment. P5");
        pla1.setForeground(Color.white);
        pla1.setBounds(625, 240, 260, 30);
        painel.add(pla1);
        pla2 = new JLabel("TF Regul. LVR-3A");
        pla2.setForeground(Color.white);
        pla2.setBounds(915, 280, 260, 30);
        painel.add(pla2);

        rf5 = new JLabel("89 RF-18");
        rf5.setForeground(Color.white);
        rf5.setBounds(65, 379, 60, 30);
        painel.add(rf5);
        rf5e = new JLabel("89 RF-18E");
        rf5e.setForeground(Color.white);
        rf5e.setBounds(150, 379, 60, 30);
        painel.add(rf5e);
        rf4 = new JLabel("89 RF-17");
        rf4.setForeground(Color.white);
        rf4.setBounds(215, 379, 60, 30);
        painel.add(rf4);
        rf4e = new JLabel("89 RF-17E");
        rf4e.setForeground(Color.white);
        rf4e.setBounds(300, 379, 60, 30);
        painel.add(rf4e);
        rf3 = new JLabel("89 RF-16");
        rf3.setForeground(Color.white);
        rf3.setBounds(365, 378, 60, 30);
        painel.add(rf3);
        rf3e = new JLabel("89 RF-16E");
        rf3e.setForeground(Color.white);
        rf3e.setBounds(450, 379, 60, 30);
        painel.add(rf3e);
        rf3 = new JLabel("89 RF-15");
        rf3.setForeground(Color.white);
        rf3.setBounds(515, 378, 60, 30);
        painel.add(rf3);
        rf3e = new JLabel("89 RF-15E");
        rf3e.setForeground(Color.white);
        rf3e.setBounds(600, 379, 60, 30);
        painel.add(rf3e);
        rf3 = new JLabel("89 RF-14");
        rf3.setForeground(Color.white);
        rf3.setBounds(665, 378, 60, 30);
        painel.add(rf3);
        rf3e = new JLabel("89 RF-14E");
        rf3e.setForeground(Color.white);
        rf3e.setBounds(750, 379, 60, 30);
        painel.add(rf3e);

        rf552 = new JLabel("52 RF-18");
        rf552.setForeground(Color.white);
        rf552.setBounds(125, 495, 60, 30);
        painel.add(rf552);
        rf452 = new JLabel("52 RF-17");
        rf452.setForeground(Color.white);
        rf452.setBounds(270, 495, 60, 30);
        painel.add(rf452);
        rf352 = new JLabel("52 RF-16");
        rf352.setForeground(Color.white);
        rf352.setBounds(420, 495, 60, 30);
        painel.add(rf352);
        rf352 = new JLabel("52 RF-15");
        rf352.setForeground(Color.white);
        rf352.setBounds(575, 495, 60, 30);
        painel.add(rf352);
        rf352 = new JLabel("52 RF-14");
        rf352.setForeground(Color.white);
        rf352.setBounds(725, 495, 60, 30);
        painel.add(rf352);

        rf6 = new JLabel("RETIF.13");
        rf6.setForeground(Color.white);
        rf6.setBounds(955, 570, 60, 30);
        painel.add(rf6);
        rf5 = new JLabel("RETIF.18");
        rf5.setForeground(Color.white);
        rf5.setBounds(155, 600, 60, 30);
        painel.add(rf5);
        rf4 = new JLabel("RETIF.17");
        rf4.setForeground(Color.white);
        rf4.setBounds(300, 600, 60, 30);
        painel.add(rf4);
        rf3 = new JLabel("RETIF.16");
        rf3.setForeground(Color.white);
        rf3.setBounds(450, 600, 60, 30);
        painel.add(rf3);
        rf4 = new JLabel("RETIF.15");
        rf4.setForeground(Color.white);
        rf4.setBounds(605, 600, 60, 30);
        painel.add(rf4);
        rf3 = new JLabel("RETIF.14");
        rf3.setForeground(Color.white);
        rf3.setBounds(755, 600, 60, 30);
        painel.add(rf3);

        // �������������������������������������������� BAY BANCO C5
        // ����������������������������������������������������

        JPanel v86 = new JPanel(); // Seccionadora 89 C5
        v86.setBounds(5, 8, 3, 55);
        v86.setBackground(Color.orange);
        painel.add(v86);

        JPanel v87 = new JPanel();
        v87.setBounds(5, 103, 3, 23); // Seccionadora 89 C5 / Disjuntor
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

        // �������������������������������������������� BAY BANCO C6
        // ����������������������������������������������������

        JPanel v2 = new JPanel(); // Seccionadora 89 C6
        v2.setBounds(125, 8, 3, 55);
        v2.setBackground(Color.orange);
        painel.add(v2);

        JPanel v3 = new JPanel();
        v3.setBounds(125, 103, 3, 23); // Seccionadora 89 C6 / Disjuntor
        v3.setBackground(Color.orange);
        painel.add(v3);

        JPanel v4 = new JPanel(); // Seccionadora 89 C6-E
        v4.setBounds(210, 30, 3, 33);
        v4.setBackground(Color.orange);
        painel.add(v4);

        JPanel v5 = new JPanel(); // SECCIONADORA 89 C6-E / DISJUNTOR C6
        v5.setBounds(209, 103, 3, 23);
        v5.setBackground(Color.orange);
        painel.add(v5);

        JPanel v7 = new JPanel(); // SECCIONADORA C6 / SECCIONADORA C6-E
        v7.setBounds(125, 125, 87, 3);
        v7.setBackground(Color.orange);
        painel.add(v7);

        JPanel v8 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v8.setBounds(170, 126, 3, 20);
        v8.setBackground(Color.orange);
        painel.add(v8);

        JPanel v6 = new JPanel(); // DISJUNTOR / BANCO
        v6.setBounds(170, 185, 3, 23);
        v6.setBackground(Color.orange);
        painel.add(v6);

        // ���������������������������������������������� BARRAS R3 E RR
        // ���������������������������������������������
        JPanel v45 = new JPanel(); // Barra R3
        v45.setBounds(5, 350, 800, 3);
        v45.setBackground(Color.yellow);
        painel.add(v45);

        JPanel v46 = new JPanel(); // Barra RR
        v46.setBounds(5, 375, 800, 3);
        v46.setBackground(Color.yellow);
        painel.add(v46);

        // �������������������������������������������� BAY DO TRAFO A5
        // ���������������������������������������������������

        JPanel v36 = new JPanel(); // SECCIONADORA 89 A5
        v36.setBounds(245, 8, 3, 55);
        v36.setBackground(Color.orange);
        painel.add(v36);

        JPanel v37 = new JPanel();
        v37.setBounds(245, 103, 3, 23); // Seccionadora 89 A5 / Disjuntor 52 A5
        v37.setBackground(Color.orange);
        painel.add(v37);

        JPanel v38 = new JPanel(); // Seccionadora 89 A5-E
        v38.setBounds(330, 30, 3, 33);
        v38.setBackground(Color.orange);
        painel.add(v38);

        JPanel v39 = new JPanel(); // SECCIONADORA 89 A5-E / DISJUNTOR 52 A5
        v39.setBounds(330, 103, 3, 23);
        v39.setBackground(Color.orange);
        painel.add(v39);

        JPanel v41 = new JPanel(); // SECCIONADORA 89 A5 / DISJUNTOR 52 A5
        v41.setBounds(290, 125, 3, 20);
        v41.setBackground(Color.orange);
        painel.add(v41);

        JPanel v42 = new JPanel(); // SECCIONADORA 89 A5 / SECCIONADORA 89 A5-E
        v42.setBounds(245, 125, 88, 3);
        v42.setBackground(Color.orange);
        painel.add(v42);

        JPanel v43 = new JPanel(); // DISJUNTOR / ALIMENTADOR A5
        v43.setBounds(290, 185, 3, 25);
        v43.setBackground(Color.orange);
        painel.add(v43);
        // ���������������������������������������� BAY DO TRAFO A6
        // ������������������������������������������������������

        JPanel v80 = new JPanel(); // SECCIONADORA 89 A6
        v80.setBounds(365, 8, 3, 55);
        v80.setBackground(Color.orange);
        painel.add(v80);

        JPanel v81 = new JPanel();
        v81.setBounds(365, 103, 3, 23); // Seccionadora 89 A6 / Disjuntor
        v81.setBackground(Color.orange);
        painel.add(v81);

        JPanel v82 = new JPanel(); // Seccionadora 89 A6-E
        v82.setBounds(450, 30, 3, 33);
        v82.setBackground(Color.orange);
        painel.add(v82);

        JPanel v83 = new JPanel(); // SECCIONADORA 89 A6-E / DISJUNTOR 52 A6
        v83.setBounds(450, 103, 3, 23);
        v83.setBackground(Color.orange);
        painel.add(v83);

        JPanel v85 = new JPanel(); // SECCIONADORA A6 / SECCIONADORA A6-E
        v85.setBounds(365, 125, 88, 3);
        v85.setBackground(Color.orange);
        painel.add(v85);

        JPanel v93 = new JPanel(); // DISJUNTOR / ALIMENTADOR
        v93.setBounds(410, 126, 3, 20);
        v93.setBackground(Color.orange);
        painel.add(v93);

        JPanel v84 = new JPanel(); // DISJUNTOR / ALIMENTADOR
        v84.setBounds(410, 185, 3, 25);
        v84.setBackground(Color.orange);
        painel.add(v84);

        // ���������������������������������������� BAY DA PLANTA P4
        // ������������������������������������������������������

        JPanel v29 = new JPanel(); // SECCIONADORA 89 P4
        v29.setBounds(490, 8, 3, 55);
        v29.setBackground(Color.orange);
        painel.add(v29);

        JPanel v30 = new JPanel();
        v30.setBounds(490, 103, 3, 23); // Seccionadora 89 P4 / Disjuntor
        v30.setBackground(Color.orange);
        painel.add(v30);

        JPanel v31 = new JPanel(); // Seccionadora 89 P4-E
        v31.setBounds(575, 30, 3, 33);
        v31.setBackground(Color.orange);
        painel.add(v31);

        JPanel v32 = new JPanel(); // SECCIONADORA 89 P4-E / DISJUNTOR 52 P4
        v32.setBounds(575, 103, 3, 23);
        v32.setBackground(Color.orange);
        painel.add(v32);

        JPanel v33 = new JPanel(); // DISJUNTOR / ALIMENTADOR
        v33.setBounds(535, 185, 3, 50);
        v33.setBackground(Color.orange);
        painel.add(v33);

        JPanel v34 = new JPanel(); // SECCIONADORA P4 / SECCIONADORA P4-E
        v34.setBounds(490, 125, 88, 3);
        v34.setBackground(Color.orange);
        painel.add(v34);

        JPanel v35 = new JPanel(); // DISJUNTOR / ALIMENTADOR
        v35.setBounds(535, 126, 3, 20);
        v35.setBackground(Color.orange);
        painel.add(v35);

        JPanel v74 = new JPanel(); // SETA
        v74.setBounds(531, 235, 11, 5);
        v74.setBackground(Color.orange);
        painel.add(v74);
        JPanel v70 = new JPanel(); // SETA
        v70.setBounds(532, 240, 9, 4);
        v70.setBackground(Color.orange);
        painel.add(v70);
        JPanel v71 = new JPanel(); // SETA
        v71.setBounds(533, 243, 7, 3);
        v71.setBackground(Color.orange);
        painel.add(v71);
        JPanel v72 = new JPanel(); // SETA
        v72.setBounds(534, 246, 5, 2);
        v72.setBackground(Color.orange);
        painel.add(v72);
        JPanel v73 = new JPanel(); // SETA
        v73.setBounds(535, 248, 3, 2);
        v73.setBackground(Color.orange);
        painel.add(v73);
        // ���������������������������������������� BAY DA PLANTA P5
        // ������������������������������������������������������

        JPanel v108 = new JPanel(); // SECCIONADORA 89 P5
        v108.setBounds(610, 8, 3, 55);
        v108.setBackground(Color.orange);
        painel.add(v108);

        JPanel v109 = new JPanel();
        v109.setBounds(610, 103, 3, 23); // Seccionadora 89 P5 / Disjuntor
        v109.setBackground(Color.orange);
        painel.add(v109);

        JPanel v110 = new JPanel(); // Seccionadora 89 P5-E
        v110.setBounds(695, 30, 3, 33);
        v110.setBackground(Color.orange);
        painel.add(v110);

        JPanel v111 = new JPanel(); // SECCIONADORA 89 P5-E / DISJUNTOR 52 P5
        v111.setBounds(695, 103, 3, 23);
        v111.setBackground(Color.orange);
        painel.add(v111);

        JPanel v112 = new JPanel(); // DISJUNTOR / ALIMENTADOR
        v112.setBounds(655, 185, 3, 50);
        v112.setBackground(Color.orange);
        painel.add(v112);

        JPanel v113 = new JPanel(); // SECCIONADORA P5 / SECCIONADORA P5-E
        v113.setBounds(610, 125, 88, 3);
        v113.setBackground(Color.orange);
        painel.add(v113);

        JPanel v114 = new JPanel(); // DISJUNTOR / ALIMENTADOR
        v114.setBounds(655, 126, 3, 20);
        v114.setBackground(Color.orange);
        painel.add(v114);

        JPanel v115 = new JPanel(); // SETA
        v115.setBounds(651, 235, 11, 5);
        v115.setBackground(Color.orange);
        painel.add(v115);
        JPanel v116 = new JPanel(); // SETA
        v116.setBounds(652, 240, 9, 4);
        v116.setBackground(Color.orange);
        painel.add(v116);
        JPanel v117 = new JPanel(); // SETA
        v117.setBounds(653, 243, 7, 3);
        v117.setBackground(Color.orange);
        painel.add(v117);
        JPanel v118 = new JPanel(); // SETA
        v118.setBounds(654, 246, 5, 2);
        v118.setBackground(Color.orange);
        painel.add(v118);
        JPanel v119 = new JPanel(); // SETA
        v119.setBounds(655, 248, 3, 2);
        v119.setBackground(Color.orange);
        painel.add(v119);
        // ������������������������������������������� BAY DO LVR-3
        // ���������������������������������������������

        JPanel v22 = new JPanel(); // SECCIONADORA 89 LVR-3
        v22.setBounds(735, 8, 3, 55);
        v22.setBackground(Color.orange);
        painel.add(v22);

        JPanel v23 = new JPanel();
        v23.setBounds(735, 103, 3, 23); // Seccionadora 89 LVR-3 / Disjuntor
        v23.setBackground(Color.orange);
        painel.add(v23);

        JPanel v24 = new JPanel(); // Seccionadora 89 LVR-3E
        v24.setBounds(820, 30, 3, 33);
        v24.setBackground(Color.orange);
        painel.add(v24);

        JPanel v25 = new JPanel(); // SECCIONADORA 89 LVR-3 / DISJUNTOR 52 LVR-3
        v25.setBounds(820, 103, 3, 23);
        v25.setBackground(Color.orange);
        painel.add(v25);

        JPanel v26 = new JPanel(); // DISJUNTOR / TRAFO LVR-3
        v26.setBounds(780, 185, 3, 65);
        v26.setBackground(Color.orange);
        painel.add(v26);

        JPanel v27 = new JPanel(); // SECCIONADORA LVR-3 / SECCIONADORA LVR-3E
        v27.setBounds(735, 125, 88, 3);
        v27.setBackground(Color.orange);
        painel.add(v27);

        JPanel v28 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v28.setBounds(780, 126, 3, 20);
        v28.setBackground(Color.orange);
        painel.add(v28);

        JPanel v44 = new JPanel(); // TRANSFORMADOR / BARRA R3
        v44.setBounds(781, 289, 3, 61);
        v44.setBackground(Color.yellow);
        painel.add(v44);

        // ������������������������������������������������� BAY TRAFO LVR-3A
        // ����������������������������������������������

        JPanel v13 = new JPanel(); // SECCIONADORA 89 LVR-3A
        v13.setBounds(865, 8, 3, 55);
        v13.setBackground(Color.orange);
        painel.add(v13);

        JPanel v14 = new JPanel(); // SECCIONADORA 89 LVR-3A / DISJUNTOR 52 LVR-3A
        v14.setBounds(865, 103, 3, 23);
        v14.setBackground(Color.orange);
        painel.add(v14);

        JPanel v15 = new JPanel(); // SECCIONADORA 89 LVR-3AE
        v15.setBounds(950, 30, 3, 33);
        v15.setBackground(Color.orange);
        painel.add(v15);

        JPanel v16 = new JPanel(); // SECCIONADORA 89 LVR-3A / DISJUNTOR
        v16.setBounds(950, 103, 3, 23);
        v16.setBackground(Color.orange);
        painel.add(v16);

        JPanel v18 = new JPanel(); // SECCIONADORA 89 LVR-3A / SECCIONADORA 89 LVR-3AE
        v18.setBounds(865, 125, 88, 3);
        v18.setBackground(Color.orange);
        painel.add(v18);

        JPanel v19 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v19.setBounds(907, 126, 3, 20);
        v19.setBackground(Color.orange);
        painel.add(v19);

        JPanel v17 = new JPanel(); // DISJUNTOR / TRANSFORMADOR LVR-3A
        v17.setBounds(907, 185, 3, 123);
        v17.setBackground(Color.orange);
        painel.add(v17);

        JPanel v20 = new JPanel(); // TRANSFORMADOR / RETIFICADOR RF-13
        v20.setBounds(907, 349, 3, 234);
        v20.setBackground(Color.yellow);
        painel.add(v20);

        // ���������������������������������������� BAY DA TRAFO TA-3
        // ������������������������������������������������������

        JPanel v68 = new JPanel(); // SECCIONADORA 89 TA-3
        v68.setBounds(990, 8, 3, 55);
        v68.setBackground(Color.orange);
        painel.add(v68);

        JPanel v69 = new JPanel();
        v69.setBounds(990, 103, 3, 50); // Seccionadora 89 TA-2 / Disjuntor
        v69.setBackground(Color.orange);
        painel.add(v69);

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

        // ���������������������������������������� CRIA��O DO BOT�O 89 C5
        // ��������������������������������������

        b11 = new JButton(); // BOT�O CS 89 C5
        b11.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b11.addActionListener(this);
        b11.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b11.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b11.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b11.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b11.setForeground(Color.black);// cor do titulo do bot�o
        b11.setEnabled(true);
        b11.setToolTipText("Pressione para operar a Seccionadora 89 C5");
        b11.setMnemonic(KeyEvent.VK_B);
        b11.setActionCommand("89C1");// define o nome da acao
        b11.setBounds(-10, 61, 33, 45);
        painel.add(b11);

        // ���������������������������������������� CRIA��O DO BOT�O 52 C5
        // ���������������������������������������

        b12 = new JButton(); // BOT�O DJ 52 C5
        b12.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b12.addActionListener(this);
        b12.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b12.setMnemonic(KeyEvent.VK_C);
        b12.setToolTipText("Pressione para operar o Disjuntor 52 C5");
        b12.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b12.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
        b12.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b12.setBounds(35, 145, 33, 42);
        painel.add(b12);

        // ��������������������������������������� CRIA��O DO BOT�O 89 C5-E
        // ���������������������������������������

        b13 = new JButton();
        b13.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg")); // Bot�o 89 C5-E
        b13.addActionListener(this);
        b13.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b13.setToolTipText("Pressione para operar a Seccionadora 89 C5-E");
        b13.setHorizontalTextPosition(AbstractButton.CENTER);
        b13.setVerticalTextPosition(AbstractButton.CENTER);
        b13.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b13.setBounds(75, 61, 33, 45);
        painel.add(b13);
        // ��������������������������������������� CRIA��O DO BOT�O BANCO C5
        // ��������������������������������������

        b15 = new JButton(); // GIF BANCO C5
        b15.setIcon(new javax.swing.ImageIcon("Capacitor.jpg"));
        b15.addActionListener(this);
        b15.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b16.setToolTipText("Pressione para comutar o Tap do Transformador MT-2");
        b15.setHorizontalTextPosition(AbstractButton.CENTER);
        b15.setVerticalTextPosition(AbstractButton.CENTER);
        b15.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b15.setBounds(23, 208, 48, 42);
        painel.add(b15);
        // ���������������������������������������� CRIA��O DO BOT�O 89 C6
        // ��������������������������������������

        b7 = new JButton(); // BOT�O CS 89 C6
        b7.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b7.addActionListener(this);
        b7.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b7.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b7.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b7.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b7.setForeground(Color.black);// cor do titulo do bot�o
        b7.setEnabled(true);
        b7.setToolTipText("Pressione para operar a Seccionadora 89 C6");
        b7.setMnemonic(KeyEvent.VK_B);
        b7.setActionCommand("89C2");// define o nome da acao
        b7.setBounds(110, 62, 33, 45);
        painel.add(b7);

        // ���������������������������������������� CRIA��O DO BOT�O 52 C6
        // ���������������������������������������

        b8 = new JButton(); // BOT�O DJ 52 C6
        b8.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b8.addActionListener(this);
        b8.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b8.setMnemonic(KeyEvent.VK_C);
        b8.setToolTipText("Pressione para operar o Disjuntor 52 C6");
        b8.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b8.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
        b8.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b8.setBounds(155, 145, 33, 42);
        painel.add(b8);

        // ��������������������������������������� CRIA��O DO BOT�O 89 C6-E
        // ���������������������������������������

        b9 = new JButton();
        b9.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg")); // Bot�o 89 C6-E
        b9.addActionListener(this);
        b9.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b9.setToolTipText("Pressione para operar a Seccionadora 89 C6-E");
        b9.setHorizontalTextPosition(AbstractButton.CENTER);
        b9.setVerticalTextPosition(AbstractButton.CENTER);
        b9.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b9.setBounds(195, 62, 33, 45);
        painel.add(b9);

        // ��������������������������������������� CRIA��O DO BOT�O BANCO C6
        // ��������������������������������������

        b10 = new JButton(); // GIF BANCO C6
        b10.setIcon(new javax.swing.ImageIcon("Capacitor.jpg"));
        b10.addActionListener(this);
        b10.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b10.setToolTipText("Pressione para comutar o Tap do Transformador MT-R");
        b10.setHorizontalTextPosition(AbstractButton.CENTER);
        b10.setVerticalTextPosition(AbstractButton.CENTER);
        b10.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b10.setBounds(143, 208, 48, 42);
        painel.add(b10);

        // �������������������������������������� CRIA��O DO BOT�O 89 A5
        // ����������������������������������������

        b1 = new JButton(); // BOT�O CS 89 A5
        b1.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b1.addActionListener(this);
        b1.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b1.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b1.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b1.setForeground(Color.black);// cor do titulo do bot�o
        b1.setEnabled(true);
        b1.setToolTipText("Pressione para operar a Seccionadora 89 A5");
        b1.setMnemonic(KeyEvent.VK_B);
        b1.setActionCommand("89RF-6");// define o nome da acao
        b1.setBounds(230, 62, 33, 45);
        painel.add(b1);

        // �������������������������������������� CRIA��O DO BOT�O 52 A5
        // �����������������������������������������

        b2 = new JButton(); // BOT�O DJ 52 A5
        b2.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b2.addActionListener(this);
        b2.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b2.setMnemonic(KeyEvent.VK_C);
        b2.setToolTipText("Pressione para operar o Disjuntor 52 A3");
        b2.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b2.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
        b2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b2.setBounds(275, 145, 33, 42);
        painel.add(b2);

        // ���������������������������������� CRIA��O DO BOT�O CS 89 A5-E
        // �����������������������������������������

        b3 = new JButton(); // BOT�O CS 89 A5-E
        b3.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b3.addActionListener(this);
        b3.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b3.setToolTipText("Pressione para operar a Seccionadora 89 A3-E");
        b3.setHorizontalTextPosition(AbstractButton.CENTER);
        b3.setVerticalTextPosition(AbstractButton.CENTER);
        b3.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b3.setBounds(315, 62, 33, 45);
        painel.add(b3);
        // ��������������������������������������� CRIA��O DO BOT�O TRAFO A5
        // ��������������������������������������

        b14 = new JButton(); // GIF A5
        b14.setIcon(new javax.swing.ImageIcon("TF_S AUX.JPG"));
        b14.addActionListener(this);
        b14.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b10.setToolTipText("Pressione para comutar o Tap do Transformador MT-R");
        b14.setHorizontalTextPosition(AbstractButton.CENTER);
        b14.setVerticalTextPosition(AbstractButton.CENTER);
        b14.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b14.setBounds(272, 208, 40, 42);
        painel.add(b14);
        // ����������������������������������� CRIA��O DO BOT�O 89 A6
        // �����������������������������������������������

        b43 = new JButton(); // BOT�O CS 89 A6
        b43.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b43.addActionListener(this);
        b43.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b43.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b43.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b43.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b43.setForeground(Color.black);// cor do titulo do bot�o
        b43.setEnabled(true);
        b43.setToolTipText("Pressione para operar a Seccionadora 89 A6");
        b43.setMnemonic(KeyEvent.VK_B);
        b43.setActionCommand("89A4");// define o nome da acao
        b43.setBounds(350, 62, 33, 45);
        painel.add(b43);

        // ����������������������������������� CRIA��O DO BOT�O 89 A6-E
        // �����������������������������������������������

        b44 = new JButton(); // BOT�O CS 89 A6-E
        b44.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b44.addActionListener(this);
        b44.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b44.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b44.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b44.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b44.setForeground(Color.black);// cor do titulo do bot�o
        b44.setEnabled(true);
        b44.setToolTipText("Pressione para operar a Seccionadora 89 A6-E");
        b44.setMnemonic(KeyEvent.VK_B);
        b44.setActionCommand("89A4-E");// define o nome da acao
        b44.setBounds(435, 62, 33, 45);
        painel.add(b44);
        // ����������������������������������� CRIA��O DO BOT�O 52 A6
        // �����������������������������������������������

        b45 = new JButton(); // BOT�O 52 A6
        b45.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b45.addActionListener(this);
        b45.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b45.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b45.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b45.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b45.setForeground(Color.black);// cor do titulo do bot�o
        b45.setEnabled(true);
        b45.setToolTipText("Pressione para operar O Disjuntor 52 A6");
        b45.setMnemonic(KeyEvent.VK_B);
        b45.setActionCommand("52A4");// define o nome da acao
        b45.setBounds(395, 145, 33, 42);
        painel.add(b45);
        // ��������������������������������������� CRIA��O DO BOT�O TRAFO A6
        // ��������������������������������������

        b46 = new JButton(); // GIF TRAFO A6
        b46.setIcon(new javax.swing.ImageIcon("TF_S AUX.JPG"));
        b46.addActionListener(this);
        b46.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b10.setToolTipText("Pressione para comutar o Tap do Transformador MT-R");
        b46.setHorizontalTextPosition(AbstractButton.CENTER);
        b46.setVerticalTextPosition(AbstractButton.CENTER);
        b46.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b46.setBounds(392, 208, 40, 42);
        painel.add(b46);
        // ����������������������������������� CRIA��O DO BOT�O 89 P4
        // �����������������������������������������������

        b17 = new JButton(); // BOT�O CS 89 P4
        b17.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b17.addActionListener(this);
        b17.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b17.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b17.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b17.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b17.setForeground(Color.black);// cor do titulo do bot�o
        b17.setEnabled(true);
        b17.setToolTipText("Pressione para operar a Seccionadora 89 P4");
        b17.setMnemonic(KeyEvent.VK_B);
        b17.setActionCommand("89P3");// define o nome da acao
        b17.setBounds(474, 62, 33, 45);
        painel.add(b17);

        // ����������������������������������� CRIA��O DO BOT�O 89 P4-E
        // �����������������������������������������������

        b18 = new JButton(); // BOT�O CS 89 P4-E
        b18.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b18.addActionListener(this);
        b18.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b18.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b18.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b18.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b18.setForeground(Color.black);// cor do titulo do bot�o
        b18.setEnabled(true);
        b18.setToolTipText("Pressione para operar a Seccionadora 89 P3-E");
        b18.setMnemonic(KeyEvent.VK_B);
        b18.setActionCommand("89P3-E");// define o nome da acao
        b18.setBounds(560, 62, 33, 45);
        painel.add(b18);

        // ����������������������������������� CRIA��O DO BOT�O 52 P4
        // �����������������������������������������������

        b19 = new JButton(); // BOT�O 52 P4
        b19.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b19.addActionListener(this);
        b19.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b19.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b19.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b19.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b19.setForeground(Color.black);// cor do titulo do bot�o
        b19.setEnabled(true);
        b19.setToolTipText("Pressione para operar O Disjuntor 52 P4");
        b19.setMnemonic(KeyEvent.VK_B);
        b19.setActionCommand("52P3");// define o nome da acao
        b19.setBounds(520, 145, 33, 42);
        painel.add(b19);

        // ����������������������������������� CRIA��O DO BOT�O 89 P5
        // �����������������������������������������������

        b20 = new JButton(); // BOT�O CS 89 P5
        b20.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b20.addActionListener(this);
        b20.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b20.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b20.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b20.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b20.setForeground(Color.black);// cor do titulo do bot�o
        b20.setEnabled(true);
        b20.setToolTipText("Pressione para operar a Seccionadora 89 P5");
        b20.setMnemonic(KeyEvent.VK_B);
        b20.setActionCommand("89P3");// define o nome da acao
        b20.setBounds(594, 62, 33, 45);
        painel.add(b20);

        // ����������������������������������� CRIA��O DO BOT�O 89 P5-E
        // �����������������������������������������������

        b21 = new JButton(); // BOT�O CS 89 P5-E
        b21.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b21.addActionListener(this);
        b21.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b21.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b21.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b21.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b21.setForeground(Color.black);// cor do titulo do bot�o
        b21.setEnabled(true);
        b21.setToolTipText("Pressione para operar a Seccionadora 89 P5-E");
        b21.setMnemonic(KeyEvent.VK_B);
        b21.setActionCommand("89P3-E");// define o nome da acao
        b21.setBounds(680, 62, 33, 45);
        painel.add(b21);

        // ����������������������������������� CRIA��O DO BOT�O 52 P5
        // �����������������������������������������������

        b22 = new JButton(); // BOT�O 52 P5
        b22.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b22.addActionListener(this);
        b22.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b22.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b22.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b22.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b22.setForeground(Color.black);// cor do titulo do bot�o
        b22.setEnabled(true);
        b22.setToolTipText("Pressione para operar O Disjuntor 52 P5");
        b22.setMnemonic(KeyEvent.VK_B);
        b22.setActionCommand("52P3");// define o nome da acao
        b22.setBounds(640, 145, 33, 42);
        painel.add(b22);
        // ����������������������������������� CRIA��O DO BOT�O 89 LVR3
        // �����������������������������������������������

        b23 = new JButton(); // BOT�O CS 89 LVR3
        b23.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b23.addActionListener(this);
        b23.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b23.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b23.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b23.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b23.setForeground(Color.black);// cor do titulo do bot�o
        b23.setEnabled(true);
        b23.setToolTipText("Pressione para operar a Seccionadora 89 LVR-3");
        b23.setMnemonic(KeyEvent.VK_B);
        b23.setActionCommand("89LVR1");// define o nome da acao
        b23.setBounds(719, 62, 33, 45);
        painel.add(b23);

        // ����������������������������������� CRIA��O DO BOT�O 89 LVR3-E
        // �����������������������������������������������

        b24 = new JButton(); // BOT�O CS 89 LVR3-E
        b24.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b24.addActionListener(this);
        b24.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b24.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b24.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b24.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b24.setForeground(Color.black);// cor do titulo do bot�o
        b24.setEnabled(true);
        b24.setToolTipText("Pressione para operar a Seccionadora 89 LVR-3E");
        b24.setMnemonic(KeyEvent.VK_B);
        b24.setActionCommand("89LVR-1E");// define o nome da acao
        b24.setBounds(804, 62, 33, 45);
        painel.add(b24);

        // ����������������������������������� CRIA��O DO BOT�O 52 LVR-3
        // �����������������������������������������������

        b25 = new JButton(); // BOT�O 52 LVR-3
        b25.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b25.addActionListener(this);
        b25.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b25.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b25.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b25.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        b25.setForeground(Color.black);// cor do titulo do bot�o
        b25.setEnabled(true);
        b25.setToolTipText("Pressione para operar O Disjuntor 52 LVR-3");
        b25.setMnemonic(KeyEvent.VK_B);
        b25.setActionCommand("52LVR-1");// define o nome da acao
        b25.setBounds(765, 145, 33, 42);
        painel.add(b25);

        // ����������������������������������� CRIA��O DO BOT�ES DE CONTROLE DO TRAFO
        // LVR-3 �����������������������

        b26 = new JButton("+"); // TAP LVR-3
        b26.setBounds(805, 250, 41, 15);
        b26.addActionListener(this);
        painel.add(b26);

        b27 = new JButton("-"); // TAP LVR-3
        b27.setBounds(805, 270, 41, 15);
        b27.addActionListener(this);
        painel.add(b27);

        tap1 = new JLabel("0 Kv"); // VALOR DE TENS�O DA BARRA R3
        tap1.setForeground(Color.white);
        tap1.setBounds(740, 285, 60, 30);
        painel.add(tap1);

        valortap1 = new JLabel(eqp1.getMostrarTapslvr1()); // VALOR TAP LVR-3
        valortap1.setForeground(Color.white);
        valortap1.setBounds(812, 280, 60, 30);
        painel.add(valortap1);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO LVR-3
        // ������������������������������������������

        b28 = new JButton(); // BOT�O TRANSFORMADOR LVR-3
        b28.setIcon(new javax.swing.ImageIcon("LVR.jpg"));
        b28.addActionListener(this);
        b28.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        b28.setToolTipText("Pressione para comutar o Tap do Transformador LVR-3");
        b28.setHorizontalTextPosition(AbstractButton.CENTER);
        b28.setVerticalTextPosition(AbstractButton.CENTER);
        b28.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b28.setBounds(765, 250, 36, 40);
        painel.add(b28);
        // ����������������������������������� CRIA��O DO BOT�O 89 LVR-3A
        // �����������������������������������������������

        b29 = new JButton(); // BOT�O CS 89 LVR-3A
        b29.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b29.addActionListener(this);
        b29.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b29.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b29.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b29.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b29.setForeground(Color.black);// cor do titulo do bot�o
        b29.setEnabled(true);
        b29.setToolTipText("Pressione para operar a Seccionadora 89 LVR-3A");
        b29.setMnemonic(KeyEvent.VK_B);
        b29.setActionCommand("89P2");// define o nome da acao
        b29.setBounds(849, 62, 33, 45);
        painel.add(b29);

        // ����������������������������������� CRIA��O DO BOT�O 89 LVR-3A-E
        // �����������������������������������������������

        b31 = new JButton(); // BOT�O CS 89 LVR-3A-E
        b31.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b31.addActionListener(this);
        b31.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b31.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b31.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b31.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b31.setForeground(Color.black);// cor do titulo do bot�o
        b31.setEnabled(true);
        b31.setToolTipText("Pressione para operar a Seccionadora 89 LVR-3A-E");
        b31.setMnemonic(KeyEvent.VK_B);
        b31.setActionCommand("89P2-E");// define o nome da acao
        b31.setBounds(934, 62, 33, 45);
        painel.add(b31);

        // ����������������������������������� CRIA��O DO BOT�O 52 LVR-3A
        // �����������������������������������������������

        b33 = new JButton(); // BOT�O 52 LVR-3A
        b33.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b33.addActionListener(this);
        b33.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b33.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b33.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b33.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b33.setForeground(Color.black);// cor do titulo do bot�o
        b33.setEnabled(true);
        b33.setToolTipText("Pressione para operar O Disjuntor 52 LVR-3A");
        b33.setMnemonic(KeyEvent.VK_B);
        b33.setActionCommand("52P2");// define o nome da acao
        b33.setBounds(892, 145, 33, 42);
        painel.add(b33);
        // ����������������������������������� CRIA��O DO BOT�O TRAFO LVR-3A
        // ������������������������������������������

        b4 = new JButton(); // BOT�O TRANSFORMADOR LVR-3A
        b4.setIcon(new javax.swing.ImageIcon("LVR3A.jpg"));
        b4.addActionListener(this);
        b4.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        b4.setToolTipText("Pressione para comutar o Tap do Transformador LVR-3A");
        b4.setHorizontalTextPosition(AbstractButton.CENTER);
        b4.setVerticalTextPosition(AbstractButton.CENTER);
        b4.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b4.setBounds(885, 308, 48, 42);
        painel.add(b4);

        // ����������������������������������� CRIA��O DO BOT�ES DE CONTROLE DO TRAFO
        // LVR-3A �����������������������

        b5 = new JButton("+"); // TAP LVR-3A
        b5.setBounds(936, 310, 41, 15);
        b5.addActionListener(this);
        painel.add(b5);

        b6 = new JButton("-"); // TAP LVR-3A
        b6.setBounds(936, 330, 41, 15);
        b6.addActionListener(this);
        painel.add(b6);

        tap = new JLabel("0 Kv"); // VALOR DE TENS�O DA BARRA R13
        tap.setForeground(Color.white);
        tap.setBounds(865, 345, 60, 30);
        painel.add(tap);

        valortap = new JLabel(eqp1.getMostrarTapslvr1a()); // VALOR TAP LVR-3A
        valortap.setForeground(Color.white);
        valortap.setBounds(942, 340, 60, 30);
        painel.add(valortap);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 13
        // ������������������������������������������

        b34 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b34.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b34.addActionListener(this);
        b34.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b41.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b34.setHorizontalTextPosition(AbstractButton.CENTER);
        b34.setVerticalTextPosition(AbstractButton.CENTER);
        b34.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b34.setBounds(876, 582, 76, 53);
        painel.add(b34);

        // ����������������������������������� CRIA��O DO BOT�O 89 R18
        // �����������������������������������������������

        b35 = new JButton(); // BOT�O CS 89 R18
        b35.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b35.addActionListener(this);
        b35.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b35.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b35.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b35.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b35.setForeground(Color.black);// cor do titulo do bot�o
        b35.setEnabled(true);
        b35.setToolTipText("Pressione para operar a Seccionadora 89 R18");
        b35.setMnemonic(KeyEvent.VK_B);
        b35.setActionCommand("89R5");// define o nome da acao
        b35.setBounds(43, 402, 33, 45);
        painel.add(b35);

        // ����������������������������������� CRIA��O DO BOT�O 89 R18-E
        // �����������������������������������������������

        b36 = new JButton(); // BOT�O CS 89 R18-E
        b36.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b36.addActionListener(this);
        b36.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b36.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b36.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b36.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b36.setForeground(Color.black);// cor do titulo do bot�o
        b36.setEnabled(true);
        b36.setToolTipText("Pressione para operar a Seccionadora 89 R18-E");
        b36.setMnemonic(KeyEvent.VK_B);
        b36.setActionCommand("89R5-E");// define o nome da acao
        b36.setBounds(129, 402, 33, 45);
        painel.add(b36);

        // ����������������������������������� CRIA��O DO BOT�O 52 R18
        // �����������������������������������������������

        b37 = new JButton(); // BOT�O 52 R18
        b37.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b37.addActionListener(this);
        b37.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b37.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b37.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b37.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b37.setForeground(Color.black);// cor do titulo do bot�o
        b37.setEnabled(true);
        b37.setToolTipText("Pressione para operar O Disjuntor 52 R5");
        b37.setMnemonic(KeyEvent.VK_B);
        b37.setActionCommand("52R5");// define o nome da acao
        b37.setBounds(90, 487, 33, 42);
        painel.add(b37);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 18
        // ������������������������������������������

        b38 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b38.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b38.addActionListener(this);
        b38.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b42.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b38.setHorizontalTextPosition(AbstractButton.CENTER);
        b38.setVerticalTextPosition(AbstractButton.CENTER);
        b38.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b38.setBounds(75, 582, 76, 53);
        painel.add(b38);
        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 17
        // ������������������������������������������

        b39 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b39.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b39.addActionListener(this);
        b39.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b46.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b39.setHorizontalTextPosition(AbstractButton.CENTER);
        b39.setVerticalTextPosition(AbstractButton.CENTER);
        b39.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b39.setBounds(220, 582, 76, 53);
        painel.add(b39);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 16
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

        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 15
        // ������������������������������������������

        b41 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b41.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b41.addActionListener(this);
        b41.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b47.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b41.setHorizontalTextPosition(AbstractButton.CENTER);
        b41.setVerticalTextPosition(AbstractButton.CENTER);
        b41.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b41.setBounds(525, 582, 76, 53);
        painel.add(b41);
        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 14
        // ������������������������������������������

        b42 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b42.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b42.addActionListener(this);
        b42.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b47.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b42.setHorizontalTextPosition(AbstractButton.CENTER);
        b42.setVerticalTextPosition(AbstractButton.CENTER);
        b42.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b42.setBounds(675, 582, 76, 53);
        painel.add(b42);
        // ����������������������������������� CRIA��O DO BOT�O 89 R17
        // �����������������������������������������������

        b48 = new JButton(); // BOT�O CS 89 R17
        b48.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b48.addActionListener(this);
        b48.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b48.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b48.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b48.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        b48.setForeground(Color.black);// cor do titulo do bot�o
        b48.setEnabled(true);
        b48.setToolTipText("Pressione para operar a Seccionadora 89 R17");
        b48.setMnemonic(KeyEvent.VK_B);
        b48.setActionCommand("89R4");// define o nome da acao
        b48.setBounds(193, 402, 33, 45);
        painel.add(b48);

        // ����������������������������������� CRIA��O DO BOT�O 89 R17-E
        // �����������������������������������������������

        b49 = new JButton(); // BOT�O CS 89 R17-E
        b49.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b49.addActionListener(this);
        b49.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b49.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b49.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b49.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b49.setForeground(Color.black);// cor do titulo do bot�o
        b49.setEnabled(true);
        b49.setToolTipText("Pressione para operar a Seccionadora 89 R17-E");
        b49.setMnemonic(KeyEvent.VK_B);
        b49.setActionCommand("89R4E");// define o nome da acao
        b49.setBounds(279, 402, 33, 45);
        painel.add(b49);

        // ����������������������������������� CRIA��O DO BOT�O 52 R17
        // �����������������������������������������������

        b50 = new JButton(); // BOT�O 52 R17
        b50.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b50.addActionListener(this);
        b50.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b50.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b50.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b50.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b50.setForeground(Color.black);// cor do titulo do bot�o
        b50.setEnabled(true);
        b50.setToolTipText("Pressione para operar O Disjuntor 52 R17");
        b50.setMnemonic(KeyEvent.VK_B);
        b50.setActionCommand("52R4");// define o nome da acao
        b50.setBounds(235, 488, 33, 42);
        painel.add(b50);

        // ����������������������������������� CRIA��O DO BOT�O 89 R16
        // �����������������������������������������������

        b51 = new JButton(); // BOT�O CS 89 R16
        b51.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b51.addActionListener(this);
        b51.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b51.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b51.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b51.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b51.setForeground(Color.black);// cor do titulo do bot�o
        b51.setEnabled(true);
        b51.setToolTipText("Pressione para operar a Seccionadora 89 R16");
        b51.setMnemonic(KeyEvent.VK_B);
        b51.setActionCommand("89R16");// define o nome da acao
        b51.setBounds(343, 402, 33, 45);
        painel.add(b51);

        // ����������������������������������� CRIA��O DO BOT�O 89 R16-E
        // �����������������������������������������������

        b52 = new JButton(); // BOT�O CS 89 R16-E
        b52.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b52.addActionListener(this);
        b52.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b52.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b52.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b52.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b52.setForeground(Color.black);// cor do titulo do bot�o
        b52.setEnabled(true);
        b52.setToolTipText("Pressione para operar a Seccionadora 89 R16-E");
        b52.setMnemonic(KeyEvent.VK_B);
        b52.setActionCommand("89R16");// define o nome da acao
        b52.setBounds(429, 402, 33, 45);
        painel.add(b52);

        // ����������������������������������� CRIA��O DO BOT�O 52 R16
        // �����������������������������������������������

        b53 = new JButton(); // BOT�O 52 R16
        b53.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b53.addActionListener(this);
        b53.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b53.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b53.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b53.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b53.setForeground(Color.black);// cor do titulo do bot�o
        b53.setEnabled(true);
        b53.setToolTipText("Pressione para operar O Disjuntor 52 R16");
        b53.setMnemonic(KeyEvent.VK_B);
        b53.setActionCommand("52R3");// define o nome da acao
        b53.setBounds(385, 488, 33, 42);
        painel.add(b53);
        // ����������������������������������� CRIA��O DO BOT�O 89 R15
        // �����������������������������������������������

        b54 = new JButton(); // BOT�O CS 89 R15
        b54.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b54.addActionListener(this);
        b54.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b54.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b54.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b54.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b54.setForeground(Color.black);// cor do titulo do bot�o
        b54.setEnabled(true);
        b54.setToolTipText("Pressione para operar a Seccionadora 89 R15");
        b54.setMnemonic(KeyEvent.VK_B);
        b54.setActionCommand("89R15");// define o nome da acao
        b54.setBounds(493, 402, 33, 45);
        painel.add(b54);

        // ����������������������������������� CRIA��O DO BOT�O 89 R15-E
        // �����������������������������������������������

        b55 = new JButton(); // BOT�O CS 89 R15-E
        b55.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b55.addActionListener(this);
        b55.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b55.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b55.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b55.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b55.setForeground(Color.black);// cor do titulo do bot�o
        b55.setEnabled(true);
        b55.setToolTipText("Pressione para operar a Seccionadora 89 R15-E");
        b55.setMnemonic(KeyEvent.VK_B);
        b55.setActionCommand("89R15");// define o nome da acao
        b55.setBounds(579, 402, 33, 45);
        painel.add(b55);

        // ����������������������������������� CRIA��O DO BOT�O 52 R15
        // �����������������������������������������������

        b56 = new JButton(); // BOT�O 52 R15
        b56.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b56.addActionListener(this);
        b56.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b56.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b56.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b56.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b56.setForeground(Color.black);// cor do titulo do bot�o
        b56.setEnabled(true);
        b56.setToolTipText("Pressione para operar O Disjuntor 52 R15");
        b56.setMnemonic(KeyEvent.VK_B);
        b56.setActionCommand("52R15");// define o nome da acao
        b56.setBounds(540, 488, 33, 42);
        painel.add(b56);

        // ����������������������������������� CRIA��O DO BOT�O 89 R14
        // �����������������������������������������������

        b57 = new JButton(); // BOT�O CS 89 R14
        b57.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b57.addActionListener(this);
        b57.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b57.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b57.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b57.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b57.setForeground(Color.black);// cor do titulo do bot�o
        b57.setEnabled(true);
        b57.setToolTipText("Pressione para operar a Seccionadora 89 R14");
        b57.setMnemonic(KeyEvent.VK_B);
        b57.setActionCommand("89R14");// define o nome da acao
        b57.setBounds(643, 402, 33, 45);
        painel.add(b57);

        // ����������������������������������� CRIA��O DO BOT�O 89 R14-E
        // �����������������������������������������������

        b58 = new JButton(); // BOT�O CS 89 R14-E
        b58.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b58.addActionListener(this);
        b58.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b58.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b58.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b58.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b58.setForeground(Color.black);// cor do titulo do bot�o
        b58.setEnabled(true);
        b58.setToolTipText("Pressione para operar a Seccionadora 89 R14-E");
        b58.setMnemonic(KeyEvent.VK_B);
        b58.setActionCommand("89R14");// define o nome da acao
        b58.setBounds(729, 402, 33, 45);
        painel.add(b58);

        // ����������������������������������� CRIA��O DO BOT�O 52 R14
        // �����������������������������������������������

        b59 = new JButton(); // BOT�O 52 R14
        b59.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b59.addActionListener(this);
        b59.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b59.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b59.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b59.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b59.setForeground(Color.black);// cor do titulo do bot�o
        b59.setEnabled(true);
        b59.setToolTipText("Pressione para operar O Disjuntor 52 R14");
        b59.setMnemonic(KeyEvent.VK_B);
        b59.setActionCommand("52R14");// define o nome da acao
        b59.setBounds(690, 488, 33, 42);
        painel.add(b59);

        // ����������������������������������� CRIA��O DO BOT�O 89 TA-3
        // �����������������������������������������������

        b60 = new JButton(); // BOT�O CS 89 TA-3
        b60.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b60.addActionListener(this);
        b60.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b60.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b60.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b60.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        b60.setForeground(Color.black);// cor do titulo do bot�o
        b60.setEnabled(true);
        // b20.setToolTipText("Pressione para operar a Seccionadora 89 TA-3");
        b60.setMnemonic(KeyEvent.VK_B);
        b60.setActionCommand("89TA1");// define o nome da acao
        b60.setBounds(975, 62, 33, 45);
        painel.add(b60);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO TA-3
        // ������������������������������������������

        b61 = new JButton(); // BOT�O TRANSFORMADOR TA-3
        b61.setIcon(new javax.swing.ImageIcon("TA1.jpg"));
        b61.addActionListener(this);
        b61.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b54.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b61.setHorizontalTextPosition(AbstractButton.CENTER);
        b61.setVerticalTextPosition(AbstractButton.CENTER);
        b61.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b61.setBounds(958, 148, 55, 46);
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

    // ������������������������������������������������������������������������������������������
    public void actionPerformed(ActionEvent e) // metodo implementado pelo ActionListener
    {
        if (e.getSource() == b1)// ���������������������� AÇÃO DO BOTAO DA CS 89 A5 �����������������������
        {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 A5?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89a5().equals("Seccionadora Aberta")) {
                    b1.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89a5();

                    // String usuario = tfUsuario.getText();
                    // String data = tfData.getText();

                    tagequipamento = "89 A5";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay A5";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1aFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mt1a();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-1A foi Fechada com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                }

                else if (eqp1.seccionadora89a5().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52a5().equals("Disjuntor Aberto")) {
                    b1.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89a5();

                    // String usuario = tfUsuario.getText();
                    // String data = tfData.getText();
                    tagequipamento = "89 A5";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay A5";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1aAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura89mt1a();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-1A foi Aberta com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 A5 FECHADO! \n",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 A5 " + eqp1.seccionadora89a5());
        }

        // ���������������������������������������� A��O DO BOT�O DO DJ 52 A5
        // ��������������������������������������
        if (e.getSource() == b2) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 A5?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52a5().equals("Disjuntor Aberto")) {
                    eqp1.fecharDisjuntor52a5();
                    b2.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));

                    // valortap.setText (eqp1.getMostrarTapslvr1a());
                    // String usuario = tfUsuario.getText();
                    // String data = tfData.getText();

                    tagequipamento = "52 A5";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay A5";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento52mt1();

                    disjuntor52a5fechado = "Disjuntor 52A5 Fechado";
                    // EnerAlbras = "EnergizarAlbras";
                    manobrainteligente1.EnerAlbras();

                } else if (eqp1.disjuntor52a5().equals("Disjuntor Fechado")) {
                    b2.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52a5();
                    BDE.ConectarBD();

                    // String usuario = tfUsuario.getText();
                    // String data = tfData.getText();

                    tagequipamento = "52 A5";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay A5";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);

                    disjuntor52a5aberto = "Disjuntor 52A5 Aberto";
                    // DesenAlbras = "DesenergizarAlbras";
                    manobrainteligente1.DesenAlbras();

                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura52mt1();

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
            if (eqp1.disjuntor52a5().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89a5().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52a5().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89a5e().equals("Seccionadora Aberta")) {
                status1.setText(" O TRAFO A5 ESTA DESENERGIZADO");
            }
        }

        // ���������������������������������������� A��O DO BOT�O DA CS 89 A5-E
        // ��������������������������������������
        if (e.getSource() == b3) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 A5-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89a5e().equals("Seccionadora Aberta")) {
                    b3.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89a5e();

                    // String usuario = tfUsuario.getText();
                    // String data = tfData.getText();

                    tagequipamento = "89 A5E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay A5";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1bFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mt1b();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT1-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else if (eqp1.seccionadora89a5e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52a5().equals("Disjuntor Aberto")) {
                    b3.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89a5e();

                    // String usuario = tfUsuario.getText();
                    // String data = tfData.getText();

                    tagequipamento = "89 A5E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay A5";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1bAberta(data);
                    // BDEQ.ConectarBD();

                    // BDEQ.QuantFechamento89mt1b();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT1-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 A5 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 A5-E " + eqp1.seccionadora89a5e());
        }

        // ������������������������������� A��O DOS BOT�ES DE COMUTA��O DE TAP'S DO
        // LVR-3A ����������������������������
        if (e.getSource() == b4) {
            status1.setText(" O Transformador LVR-3A esta no Tap:" + eqp1.getMostrarTapslvr3a());
            JOptionPane.showMessageDialog(null, "  O Transformador LVR-3A esta no:  " + eqp1.getMostrarTapslvr3a(),
                    "Disjuntor", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
        }
        if (e.getSource() == b5) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja Subir o Tap do Transformador LVR-3A?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.getTapslvr3a() == 32)
                    JOptionPane.showMessageDialog(null, "O Transformador LVR-3A esta no Tap Maximo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp1.aumentarTaplvr3a();
                status1.setText(" O Transformador LVR-3A esta no:  " + eqp1.getMostrarTapslvr3a());
                valortap.setText(eqp1.getMostrarTapslvr3a());

                if (eqp1.seccionadora89r13().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r13().equals("Disjuntor Fechado")
                        || eqp1.seccionadora89r13e().equals("Seccionadora Fechada")
                                && eqp1.disjuntor52r13().equals("Disjuntor Fechado")) {
                    tap.setText(eqp1.getValorTaplvr3a());
                }

                String usuario = tfUsuario.getText();
                String data = tfData.getText();
                tagequipamento = "Tap LVR-3A";
                operacao = "Tap Elevado";
                manobra = "Bay LVR-3";

                // BDE.ConectarBD();
                // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
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
                if (eqp1.getTapslvr3a() == 0)
                    JOptionPane.showMessageDialog(null, "O Transformador LVR-3A esta no Tap Minimo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp1.diminuirTaplvr3a();
                status1.setText(" O Transformador LVR-3A esta no:  " + eqp1.getMostrarTapslvr3a());
                valortap.setText(eqp1.getMostrarTapslvr3a());

                if (eqp1.seccionadora89r13().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r13().equals("Disjuntor Fechado")
                        || eqp1.seccionadora89r13e().equals("Seccionadora Fechada")
                                && eqp1.disjuntor52r13().equals("Disjuntor Fechado")) {
                    tap.setText(eqp1.getValorTaplvr3a());
                }

                String usuario = tfUsuario.getText();
                String data = tfData.getText();
                tagequipamento = "Tap LVR-3";
                operacao = "Tap Reduzido";
                manobra = "Bay LVR-3";

                // BDE.ConectarBD();
                // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
                // BDEQ.ConectarBD();
                // BDEQ.QuantDiminuirTapmt1();

            } else {
                JOptionPane.showMessageDialog(null,
                        "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                        "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
            }
        }

        if (e.getSource() == b7)// ���������������������� A��O DO BOT�O DA CS 89 C6
                                // ��������������������������������
        {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 C6?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89c6().equals("Seccionadora Aberta")) {
                    b7.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89c6();

                    // String usuario = tfUsuario.getText();
                    // String data = tfData.getText();
                    tagequipamento = "89 C6";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay C6";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mtraFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mtra();

                    seccionadora89c6fechada = "Seccionadora 89C6 Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-RA foi Fechada com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                }

                else if (eqp1.seccionadora89c6().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52c6().equals("Disjuntor Aberto")) {
                    b7.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89c6();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();

                    tagequipamento = "89 C6";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay C6";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.opera�ao89mtraAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura89mtra();

                    seccionadora89c6aberta = "Seccionadora 89C6 Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-RA foi Aberta com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 C6 FECHADO! \n",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 C6 " + eqp1.seccionadora89c6());
        }

        // ���������������������������������������� A��O DO BOT�O DO DJ 52 C6
        // ��������������������������������������
        if (e.getSource() == b8) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 C6?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52c6().equals("Disjuntor Aberto")) {
                    eqp1.fecharDisjuntor52c6();
                    b8.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 C6";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay C6";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento52mtr();

                    disjuntor52c6fechado = "Disjuntor 52C6 Fechado";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else if (eqp1.disjuntor52c6().equals("Disjuntor Fechado")) {
                    b8.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52c6();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "52 C6";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay C6";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura52mtr();

                    disjuntor52c6aberto = "Disjuntor 52C6 Aberto";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

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
            if (eqp1.disjuntor52c6().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89c6().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52c6().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89c6e().equals("Seccionadora Aberta")) {
                status1.setText(" O BANCO C6 ESTA DESENERGIZADO");
            }
        }

        // ���������������������������������������� A��O DO BOT�O DA CS 89 C6-E
        // ��������������������������������������
        if (e.getSource() == b9) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 C6-E ?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89c6e().equals("Seccionadora Aberta")) {
                    b9.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89c6e();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 C6E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay C6";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mtrbFechada(data);
                    // BDEQ.ConectarBD();

                    seccionadora89c6efechada = "Seccionadora 89C6E Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                    // BDEQ.QuantFechamento89mtrb();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MTR-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else if (eqp1.seccionadora89c6e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52c6().equals("Disjuntor Aberto")) {
                    b9.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89c6e();

                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "89 C6E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay C6";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mtrbAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mtrb();

                    seccionadora89c6eaberta = "Seccionadora 89C6E Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MTR-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 C6 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 C6-E " + eqp1.seccionadora89c6e());
        }

        // �������������������������������������� AÇAO DO BOTAO DA CS 89 C5
        // ��������������������������������������
        if (e.getSource() == b11) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 C5?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89c5().equals("Seccionadora Aberta")) {
                    b11.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89c5();

                    // String usuario = tfUsuario.getText();
                    // String data = tfData.getText();
                    tagequipamento = "89 C5";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay C5";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt2aFechada(data);

                    seccionadora89c5fechada = "Seccionadora 89C5 Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-2A foi Fechada com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                }

                else if (eqp1.seccionadora89c5().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52c5().equals("Disjuntor Aberto")) {
                    b11.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89c5();

                    // String usuario = tfUsuario.getText();
                    // String data = tfData.getText();
                    tagequipamento = "89 C5";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay C5";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos4(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt2aAberta(data);

                    seccionadora89c5aberta = "Seccionadora 89C5 Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-2A foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 C5 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 C5 " + eqp1.seccionadora89c5());
        }

        // ������������������������������������ A��O DO BOT�O DO DISJUNTOR 52 C5
        // ����������������������������������
        if (e.getSource() == b12) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 C5?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52c5().equals("Disjuntor Aberto")) {
                    b12.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52c5();

                    // BDE.ConectarBD();
                    // BDE.incluir52mt2fechado(usuario, data);

                    disjuntor52c5fechado = "Disjuntor 52C5 Fechado";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else if (eqp1.disjuntor52c5().equals("Disjuntor Fechado")) {
                    b12.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52c5();

                    // BDE.ConectarBD();
                    // BDE.incluir52mt2aberto(usuario, data);

                    // if (eqp.seccionadora89mt2a().equals("Seccionadora Aberta") &&
                    // eqp.seccionadora89mt2b().equals("Seccionadora Aberta") &&
                    // eqp.disjuntor52bt().equals("Disjuntor Aberto"))

                    disjuntor52c5aberto = "Disjuntor 52C5 Aberto";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                    // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-2 foi aberto
                    // #TRANSFORMADOR
                    // DESENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            if (eqp1.disjuntor52c5().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89c5().equals("Seccionadora Aberta")
                    && eqp1.disjuntor52c5().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89c5e().equals("Seccionadora Aberta")) {
                status1.setText(" O BANCO C5 ESTA DESENERGIZADO");
            }
        }

        // ��������������������������������������� A��O DO BOT�O DA CS 89 C5-E
        // �������������������������������������
        if (e.getSource() == b13) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 C5-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89c5e().equals("Seccionadora Aberta")) {
                    b13.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89c5e();

                    // BDE.ConectarBD();
                    // BDE.incluir89mt2bfechada(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt2bFechada(data);

                    seccionadora89c5efechada = "Seccionadora 89C5E Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT2-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else if (eqp1.seccionadora89c5e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52c5().equals("Disjuntor Aberto")) {
                    b13.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89c5e();

                    // BDE.ConectarBD();
                    // BDE.incluir89mt2baberta(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt2bAberta(data);

                    seccionadora89c5eaberta = "Seccionadora 89C5E Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 MT2-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 C5 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 C5-E " + eqp1.seccionadora89c5e());
        }

        // #################################################### BOT�O DE AC�O DA CS 89
        // LVR-3 ##########################################################

        if (e.getSource() == b23) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 LVR-3?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89lvr3().equals("Seccionadora Aberta")) {
                    b23.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89lvr3();

                    seccionadora89lvr3fechada = "Seccionadora 89LVR3 Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-A foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                    // BDE.ConectarBD();
                    // BDE.incluir89l1afechada(usuario, data);
                }

                else if (eqp1.seccionadora89lvr3().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvr3().equals("Disjuntor Aberto")) {
                    b23.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89lvr3();

                    seccionadora89lvr3aberta = "Seccionadora 89LVR3 Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-A foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                    // BDE.ConectarBD();
                    // BDE.incluir89l1aaberta(usuario, data);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 LVR-3 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 LVR-3 " + eqp1.seccionadora89lvr3());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // LVR-3E #########################################################
        if (e.getSource() == b24) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 LVR-3E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89lvr3e().equals("Seccionadora Aberta")) {
                    b24.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89lvr3e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // BDE.incluir89l1bfechada(usuario, data);

                    seccionadora89lvr3efechada = "Seccionadora 89LVR3E Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else if (eqp1.seccionadora89lvr3e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvr3().equals("Disjuntor Aberto")) {
                    b24.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89lvr3e();

                    seccionadora89lvr3eaberta = "Seccionadora 89LVR3E Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 L1-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));;

                    // BDE.ConectarBD();
                    // BDE.incluir89l1baberta(usuario, data);

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 LVR-3 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 LVR-3E " + eqp1.seccionadora89lvr3e());
        }

        // ################################################# AC�O DO BOT�O DO 52 LVR-3
        // ##############################################################
        if (e.getSource() == b25) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 LVR-3?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52lvr3().equals("Disjuntor Aberto")) {
                    b25.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52lvr3();

                    // valortap1.setText (eqp1.getMostrarTapslvr1());
                    // BDE.ConectarBD();
                    // BDE.incluir52l1fechado(usuario, data);

                    disjuntor52lvr3fechado = "Disjuntor 52LVR3 Fechado";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                }

                else if (eqp1.disjuntor52lvr3().equals("Disjuntor Fechado")) {
                    b25.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52lvr3();
                    // tap1.setText("0 kV");

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52l1aberto(usuario, data);

                    disjuntor52lvr3aberto = "Disjuntor 52LVR3 Aberto";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                }
            }
            if (eqp1.disjuntor52lvr3().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89lvr3().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52lvr3().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89lvr3e().equals("Seccionadora Aberta")) {
                status1.setText("O TRANSFORMADOR ESTA DESENERGIZADO! ");
            }
        }

        // ������������������������������� A��O DOS BOT�ES DE COMUTA��O DE TAP'S DO
        // LVR-3 ����������������������������
        if (e.getSource() == b28) {
            status1.setText(" O Transformador LVR-3 esta no Tap:" + eqp1.getMostrarTapslvr3());
            JOptionPane.showMessageDialog(null, "  O Transformador LVR-3 esta no:  " + eqp1.getMostrarTapslvr3(),
                    "Disjuntor", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
        }
        if (e.getSource() == b26) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja Subir o Tap do Transformador LVR-3?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.getTapslvr3() == 32)
                    JOptionPane.showMessageDialog(null, "O Transformador LVR-3 esta no Tap Maximo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp1.aumentarTaplvr3();
                status1.setText(" O Transformador LVR-2 esta no:  " + eqp1.getMostrarTapslvr3());
                valortap1.setText(eqp1.getMostrarTapslvr3());

                if (eqp1.seccionadora89lvr3().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvr3().equals("Disjuntor Fechado")
                        || eqp1.seccionadora89lvr3e().equals("Seccionadora Fechada")
                                && eqp1.disjuntor52lvr3().equals("Disjuntor Fechado")) {
                    tap1.setText(eqp1.getValorTaplvr3());
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
        if (e.getSource() == b27) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja Descer Tap do Transformador?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.getTapslvr3() == 0)
                    JOptionPane.showMessageDialog(null, "O Transformador LVR-3 esta no Tap Minimo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp1.diminuirTaplvr3();
                status1.setText(" O Transformador LVR-3 esta no:  " + eqp1.getMostrarTapslvr3());
                valortap1.setText(eqp1.getMostrarTapslvr3());
                if (eqp1.seccionadora89lvr3().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvr3().equals("Disjuntor Fechado")
                        || eqp1.seccionadora89lvr3e().equals("Seccionadora Fechada")
                                && eqp1.disjuntor52lvr3().equals("Disjuntor Fechado")) {
                    tap1.setText(eqp1.getValorTaplvr3());
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
        // #################################################### BOT�O DE AC�O DA CS 89P4
        // ##########################################################

        if (e.getSource() == b17) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 P4?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89p4().equals("Seccionadora Aberta")) {
                    b17.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89p4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-A foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89l2afechada(usuario, data);

                    seccionadora89p4fechada = "Seccionadora 89P4 Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                    manobrainteligente1.EnerAlbras();
                }

                else if (eqp1.seccionadora89p4().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52p4().equals("Disjuntor Aberto")) {
                    b17.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89p4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-A foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89l2aaberta(usuario, data);

                    seccionadora89p4aberta = "Seccionadora 89P4 Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.PrepAlbras();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 P4 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 P4 " + eqp1.seccionadora89p4());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // P4E #########################################################
        if (e.getSource() == b18) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 P4-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89p4e().equals("Seccionadora Aberta")) {
                    b18.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89p4e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89l2bfechada(usuario, data);

                    seccionadora89p4efechada = "Seccionadora 89P4E Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                    manobrainteligente1.PrepAlbras();

                } else if (eqp1.seccionadora89p4e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52p4().equals("Disjuntor Aberto")) {
                    b18.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89p4e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));;

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89l2baberta(usuario, data);

                    seccionadora89p4eaberta = "Seccionadora 89P4E Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 P4 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 P4-E " + eqp1.seccionadora89p4e());
        }

        // ################################################# AC�O DO BOT�O DO 52 P4
        // ##############################################################
        if (e.getSource() == b19) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 P4?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52p4().equals("Disjuntor Aberto")) {
                    b19.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52p4();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52l2fechado(usuario, data);

                    disjuntor52p4fechado = "Disjuntor 52P4 Fechado";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                    manobrainteligente1.EnerAlbras();

                } else if (eqp1.disjuntor52p4().equals("Disjuntor Fechado")) {
                    b19.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52p4();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52l2aberto(usuario, data);

                    disjuntor52p4aberto = "Disjuntor 52P4 Aberto";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                    manobrainteligente1.DesenAlbras();

                } else {
                    JOptionPane.showMessageDialog(null, "LOGICA DE INTERTRAVAMENTO NAO SATISFEITA! ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            if (eqp1.disjuntor52p4().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89p4().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52p4().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89p4e().equals("Seccionadora Aberta")) {
                status1.setText("A PLANTA ESTA DESENERGIZADA! ");
            }
        }

        // #################################################### BOT�O DE AC�O DA CS 89P5
        // ##########################################################

        if (e.getSource() == b20) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 P5?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89p5().equals("Seccionadora Aberta")) {
                    b20.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89p5();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-A foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89l2afechada(usuario, data);

                    seccionadora89p5fechada = "Seccionadora 89P5 Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                }

                else if (eqp1.seccionadora89p5().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52p5().equals("Disjuntor Aberto")) {
                    b20.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89p5();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-A foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89l2aaberta(usuario, data);

                    seccionadora89p5aberta = "Seccionadora 89P5 Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                    manobrainteligente1.PrepAlbras();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 P5 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 P5 " + eqp1.seccionadora89p5());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // P5E #########################################################
        if (e.getSource() == b21) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 P5-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89p5e().equals("Seccionadora Aberta")) {
                    b21.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89p5e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89l2bfechada(usuario, data);

                    seccionadora89p5efechada = "Seccionadora 89P5E Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                    manobrainteligente1.PrepAlbras();

                } else if (eqp1.seccionadora89p5e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52p5().equals("Disjuntor Aberto")) {
                    b21.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89p5e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 P5 foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));;

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89l2baberta(usuario, data);

                    seccionadora89p5eaberta = "Seccionadora 89P5E Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 P5 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 P5-E " + eqp1.seccionadora89p5e());
        }

        // ################################################# AC�O DO BOT�O DO 52 P5
        // ##############################################################
        if (e.getSource() == b22) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 P5?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52p5().equals("Disjuntor Aberto")) {
                    b22.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52p5();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52l2fechado(usuario, data);

                    disjuntor52p5fechado = "Disjuntor 52P5 Fechado";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                    manobrainteligente1.EnerAlbras();

                } else if (eqp1.disjuntor52p5().equals("Disjuntor Fechado")) {
                    b22.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52p5();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52l2aberto(usuario, data);

                    disjuntor52p5aberto = "Disjuntor 52P5 Aberto";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                    manobrainteligente1.DesenAlbras();

                } else {
                    JOptionPane.showMessageDialog(null, "LOGICA DE INTERTRAVAMENTO NAO SATISFEITA! ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            if (eqp1.disjuntor52p5().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89p5().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52p5().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89p5e().equals("Seccionadora Aberta")) {
                status1.setText("A PLANTA ESTA DESENERGIZADA! ");
            }
        }
        // ����������������������������������������� A��O DO BOT�O DA CS 89 R13
        // ��������������������������������������
        if (e.getSource() == b29) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-13?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r13().equals("Seccionadora Aberta")) {
                    b29.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89r13();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2 foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89p2fechada(usuario, data);

                    seccionadora89r13fechada = "Seccionadora 89R13 Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else if (eqp1.seccionadora89r13().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r13().equals("Disjuntor Aberto")) {
                    b29.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89r13();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 L2 foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));;

                    seccionadora89r13aberta = "Seccionadora 89R13 Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89p2aberta(usuario, data);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R13 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" CS 89 R13 " + eqp1.seccionadora89r13());
        }

        // ������������������������������������ A��O DO BOT�O DA SECCIONADORA 89 R13-E
        // �������������������������������
        if (e.getSource() == b31) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 R13-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r13e().equals("Seccionadora Aberta")) {
                    b31.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89r13e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BT-A foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89p2efechada(usuario, data);

                    seccionadora89r13efechada = "Seccionadora 89R13E Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                }

                else if (eqp1.seccionadora89r13e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r13().equals("Disjuntor Aberto")) {
                    b31.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89r13e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BT-A foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btaaberta(usuario, data);

                    seccionadora89r13eaberta = "Seccionadora 89R13E Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R13 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R13-E " + eqp1.seccionadora89r13e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R13
        // ##############################################################
        if (e.getSource() == b33) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R13?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r13().equals("Disjuntor Aberto")) {
                    b33.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r13();
                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btfechado(usuario, data);

                    disjuntor52r13fechado = "Disjuntor 52R13 Fechado";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else if (eqp1.disjuntor52r13().equals("Disjuntor Fechado")) {
                    b33.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r13();
                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btaberto(usuario, data);

                    disjuntor52r13aberto = "Disjuntor 52R13 Aberto";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                }
            }
            if (eqp1.disjuntor52r13().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r13().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r13().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r13e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }
        // ������������������������������������������������� A��O DO BOT�O DA CS 89 A6
        // ���������������������������������������������������
        if (e.getSource() == b43) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 A6?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89a6().equals("Seccionadora Aberta")) {
                    b43.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89a6();

                    // BDE.ConectarBD();
                    // BDE.incluir89mt1afechada(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaao89mt1aFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mt1a();

                    seccionadora89a6fechada = "Seccionadora 89A6 fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-1A foi Fechada com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                }

                else if (eqp1.seccionadora89a6().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52a6().equals("Disjuntor Aberto")) {
                    b43.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89a6();

                    // BDE.ConectarBD();
                    // BDE.incluir89mt1aaberta(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1aAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura89mt1a();

                    seccionadora89a6aberta = "Seccionadora 89A6 Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                    manobrainteligente1.PrepAlbras();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-1A foi Aberta com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 A6 FECHADO! \n",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 A6 " + eqp1.seccionadora89a6());
        }

        // ���������������������������������������� A��O DO BOT�O DA CS 89 A6-E
        // ��������������������������������������
        if (e.getSource() == b44) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 A6-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89a6e().equals("Seccionadora Aberta")) {
                    b44.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89a6e();

                    // BDE.ConectarBD();
                    // BDE.incluir89mt1bfechada(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1bFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mt1b();

                    seccionadora89a6efechada = "Seccionadora 89A6E Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                    manobrainteligente1.PrepAlbras();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT1-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else if (eqp1.seccionadora89a6e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52a6().equals("Disjuntor Aberto")) {
                    b44.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89a6e();

                    // BDE.ConectarBD();
                    // BDE.incluir89mt1baberta(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1bAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mt1b();

                    seccionadora89a6eaberta = "Seccionadora 89A6E Aberta";
                    PrepAlbras = "PrepAlbras";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                    manobrainteligente1.PrepAlbras();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT1-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 A6 FECHADO! \n ",
                            "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 A6-E " + eqp1.seccionadora89a6e());
        }
        // ������������������������������������������������� A��O DO BOT�O DO DJ 52 A6
        // ����������������������������������������������������
        if (e.getSource() == b45) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 A6?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52a6().equals("Disjuntor Aberto")) {
                    eqp1.fecharDisjuntor52a6();
                    b45.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    // valortap.setText (eqp1.getMostrarTapslvr1a());

                    // BDE.ConectarBD();
                    // BDE.incluir52mt1fechado(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento52mt1();

                    disjuntor52a6fechado = "Disjuntor 52A6 Fechado";

                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                    manobrainteligente1.EnerAlbras();

                } else if (eqp1.disjuntor52a6().equals("Disjuntor Fechado")) {
                    b45.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52a6();

                    // BDE.ConectarBD();
                    // BDE.incluir52mt1aberto(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura52mt1();

                    disjuntor52a6aberto = "Disjuntor 52A6 Aberto";

                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
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
            if (eqp1.disjuntor52a6().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89a6().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52a6().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89a6e().equals("Seccionadora Aberta")) {
                status1.setText(" O TRAFO A6 ESTA DESENERGIZADO");
            }
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-18 #########################################################
        if (e.getSource() == b35) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-18?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r18().equals("Seccionadora Aberta")) {
                    b35.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r18();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    seccionadora89r18fechada = "Seccionadora 89R18 Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else if (eqp1.seccionadora89r18().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r18().equals("Disjuntor Aberto")) {
                    b35.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r18();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    seccionadora89r18aberta = "Seccionadora 89R18 Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R18 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R18 " + eqp1.seccionadora89r18());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-18E #########################################################
        if (e.getSource() == b36) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-18E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r18e().equals("Seccionadora Aberta")) {
                    b36.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r18e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    seccionadora89r18efechada = "Seccionadora 89R18E Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else if (eqp1.seccionadora89r18e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r18().equals("Disjuntor Aberto")) {
                    b36.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r18e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    seccionadora89r18eaberta = "Seccionadora 89R18E Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R18 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R18E " + eqp1.seccionadora89r18e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R18
        // ##############################################################
        if (e.getSource() == b37) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R18?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r18().equals("Disjuntor Aberto")) // && eqp.seccionadora89bta().equals("Seccionadora
                                                                      // Fechada") &&
                                                                      // eqp.seccionadora89btb().equals("Seccionadora
                                                                      // Fechada"))
                {
                    b37.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r18();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btfechado(usuario, data);

                    disjuntor52r18fechado = "Disjuntor 52R18 Fechado";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else if (eqp1.disjuntor52r18().equals("Disjuntor Fechado")) // &&
                                                                              // eqp.seccionadora89bta().equals("Seccionadora
                                                                              // Fechada") &&
                                                                              // eqp.seccionadora89btb().equals("Seccionadora
                                                                              // Fechada"))
                {
                    b37.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r18();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btaberto(usuario, data);

                    disjuntor52r18aberto = "Disjuntor 52R18 Aberto";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                }
            }
            if (eqp1.disjuntor52r18().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r18().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r18().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r18e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-17 #########################################################
        if (e.getSource() == b48) {
            Object[] options = { "Sim", "N�o", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voc� realmente deseja alterar o estado da Seccionadora 89 RF-17?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r17().equals("Seccionadora Aberta")) {
                    b48.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r17();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    seccionadora89r17fechada = "Seccionadora 89R17 Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else if (eqp1.seccionadora89r17().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r17().equals("Disjuntor Aberto")) {
                    b48.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r17();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    seccionadora89r17aberta = "Seccionadora 89R17 Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R17 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R17 " + eqp1.seccionadora89r11());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-17E #########################################################
        if (e.getSource() == b49) {
            Object[] options = { "Sim", "No", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voca realmente deseja alterar o estado da Seccionadora 89 RF-17E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r17e().equals("Seccionadora Aberta")) {
                    b49.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r17e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    seccionadora89r17efechada = "Seccionadora 89R17E Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else if (eqp1.seccionadora89r17e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r17().equals("Disjuntor Aberto")) {
                    b49.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r17e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    seccionadora89r17eaberta = "Seccionadora 89R17 Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R17 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R17-E " + eqp1.seccionadora89r11e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R17
        // ##############################################################
        if (e.getSource() == b50) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R17?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r17().equals("Disjuntor Aberto")) // && eqp.seccionadora89bta().equals("Seccionadora
                                                                      // Fechada") &&
                                                                      // eqp.seccionadora89btb().equals("Seccionadora
                                                                      // Fechada"))
                {
                    b50.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r17();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btfechado(usuario, data);

                    disjuntor52r17fechado = "Disjuntor 52R17 Fechado";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else if (eqp1.disjuntor52r17().equals("Disjuntor Fechado")) // &&
                                                                              // eqp.seccionadora89bta().equals("Seccionadora
                                                                              // Fechada") &&
                                                                              // eqp.seccionadora89btb().equals("Seccionadora
                                                                              // Fechada"))
                {
                    b50.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r17();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btaberto(usuario, data);

                    disjuntor52r17aberto = "Disjuntor 52R17 Aberto";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                }
            }
            if (eqp1.disjuntor52r17().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r17().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r17().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r17e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-16 #########################################################
        if (e.getSource() == b51) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-16?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r16().equals("Seccionadora Aberta")) {
                    b51.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r16();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                } else if (eqp1.seccionadora89r16().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r16().equals("Disjuntor Aberto")) {
                    b51.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r16();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R16 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R16 " + eqp1.seccionadora89r16());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-16E #########################################################
        if (e.getSource() == b52) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-16E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r16e().equals("Seccionadora Aberta")) {
                    b52.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r16e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                } else if (eqp1.seccionadora89r16e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r16().equals("Disjuntor Aberto")) {
                    b52.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r16e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R16 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R16E " + eqp1.seccionadora89r16e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R16
        // ##############################################################
        if (e.getSource() == b53) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R16?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r16().equals("Disjuntor Aberto")) // && eqp.seccionadora89bta().equals("Seccionadora
                                                                      // Fechada") &&
                                                                      // eqp.seccionadora89btb().equals("Seccionadora
                                                                      // Fechada"))
                {
                    b53.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r16();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btfechado(usuario, data);

                } else if (eqp1.disjuntor52r16().equals("Disjuntor Fechado")) // &&
                                                                              // eqp.seccionadora89bta().equals("Seccionadora
                                                                              // Fechada") &&
                                                                              // eqp.seccionadora89btb().equals("Seccionadora
                                                                              // Fechada"))
                {
                    b53.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r16();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btaberto(usuario, data);
                }
            }
            if (eqp1.disjuntor52r16().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r16().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r16().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r16e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-15 #########################################################
        if (e.getSource() == b54) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-15?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r15().equals("Seccionadora Aberta")) {
                    b54.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r15();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                } else if (eqp1.seccionadora89r15().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r15().equals("Disjuntor Aberto")) {
                    b54.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r15();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "L�gica de Intertravamento n�o Satisfeita! \n DISJUNTOR 52 R-15 FECHADO \n ",
                            "L�gica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R-15 " + eqp1.seccionadora89r15());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-15E #########################################################
        if (e.getSource() == b55) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-15E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r15e().equals("Seccionadora Aberta")) {
                    b55.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r15e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                } else if (eqp1.seccionadora89r15e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r15().equals("Disjuntor Aberto")) {
                    b55.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r15e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R-15 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R15-E " + eqp1.seccionadora89r15e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R15
        // ##############################################################
        if (e.getSource() == b56) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R-15?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r15().equals("Disjuntor Aberto")) // && eqp.seccionadora89bta().equals("Seccionadora
                                                                      // Fechada") &&
                                                                      // eqp.seccionadora89btb().equals("Seccionadora
                                                                      // Fechada"))
                {
                    b56.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r15();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btfechado(usuario, data);

                } else if (eqp1.disjuntor52r15().equals("Disjuntor Fechado")) // &&
                                                                              // eqp.seccionadora89bta().equals("Seccionadora
                                                                              // Fechada") &&
                                                                              // eqp.seccionadora89btb().equals("Seccionadora
                                                                              // Fechada"))
                {
                    b56.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r15();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btaberto(usuario, data);

                }
            }
            if (eqp1.disjuntor52r15().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r15().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r15().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r15e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-14 #########################################################
        if (e.getSource() == b57) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-14?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r14().equals("Seccionadora Aberta")) {
                    b57.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r14();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    seccionadora89r14fechada = "Seccionadora 89R14 Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else if (eqp1.seccionadora89r14().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r14().equals("Disjuntor Aberto")) {
                    b57.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r14();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    seccionadora89r14aberta = "Seccionadora 89R14 Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R-14 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R-14 " + eqp1.seccionadora89r14());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-14E #########################################################
        if (e.getSource() == b58) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-14E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r14e().equals("Seccionadora Aberta")) {
                    b58.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r14e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                    seccionadora89r14efechada = "Seccionadora 89R14E Fechada";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else if (eqp1.seccionadora89r14e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r14().equals("Disjuntor Aberto")) {
                    b58.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r14e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);

                    seccionadora89r14eaberta = "Seccionadora 89R14E Aberta";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R-14 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R-14E " + eqp1.seccionadora89r14e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R14
        // ##############################################################
        if (e.getSource() == b59) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R14?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r14().equals("Disjuntor Aberto")) // && eqp.seccionadora89bta().equals("Seccionadora
                                                                      // Fechada") &&
                                                                      // eqp.seccionadora89btb().equals("Seccionadora
                                                                      // Fechada"))
                {
                    b59.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r14();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btfechado(usuario, data);

                    disjuntor52r14fechado = "Disjuntor 52R14 Fechado";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();

                } else if (eqp1.disjuntor52r14().equals("Disjuntor Fechado")) // &&
                                                                              // eqp.seccionadora89bta().equals("Seccionadora
                                                                              // Fechada") &&
                                                                              // eqp.seccionadora89btb().equals("Seccionadora
                                                                              // Fechada"))
                {
                    b59.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r14();

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir52btaberto(usuario, data);

                    disjuntor52r14aberto = "Disjuntor 52R14 Aberto";
                    manobrainteligente1.TransfMT3MTR();
                    manobrainteligente1.TransfMTRMT3();
                    manobrainteligente1.NormRed3();
                    manobrainteligente1.DeslProgRed3();
                }
            }
            if (eqp1.disjuntor52r14().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r14().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r14().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r14e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }
        // ################################################# AC�O DO BOT�O DA
        // SECCIONADORA 89 TA3
        // ##############################################################
        if (e.getSource() == b60) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 TA3?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89ta3().equals("Seccionadora Aberta")) {
                    b60.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89ta3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbfechada(usuario, data);

                } else if (eqp1.seccionadora89ta3().equals("Seccionadora Fechada")) {
                    b60.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89ta3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    // BDE.ConectarBD();
                    // String usuario = tfUsuario.getText ();
                    // String data = tfData.getText ();
                    // BDE.incluir89btbaberta(usuario, data);
                }
            }
            status1.setText(" 89 TA3 " + eqp1.seccionadora89ta3());
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

    public void atualizaConfiguracao() {
        eqp1.fecharSeccionadora89a5();
        eqp1.fecharDisjuntor52a5();
        eqp1.fecharSeccionadora89c6();
        eqp1.fecharDisjuntor52c6();
        eqp1.fecharSeccionadora89c5();
        eqp1.fecharDisjuntor52c5();
        eqp1.fecharSeccionadora89lvr3();
        eqp1.fecharDisjuntor52lvr3();
        eqp1.fecharSeccionadora89p4();
        eqp1.fecharDisjuntor52p4();
        eqp1.fecharSeccionadora89p5();
        eqp1.fecharDisjuntor52p5();
        eqp1.fecharSeccionadora89r13();
        eqp1.fecharDisjuntor52r13();
        eqp1.fecharSeccionadora89a6e();
        eqp1.fecharDisjuntor52a6();
        eqp1.fecharSeccionadora89r18();
        eqp1.fecharDisjuntor52r18();
        eqp1.fecharSeccionadora89r17();
        eqp1.fecharDisjuntor52r17();
        eqp1.fecharSeccionadora89r16();
        eqp1.fecharDisjuntor52r16();
        eqp1.fecharSeccionadora89r15();
        eqp1.fecharDisjuntor52r15();
        eqp1.fecharSeccionadora89r14();
        eqp1.fecharDisjuntor52r14();
        eqp1.fecharSeccionadora89ta3();
        b1.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b2.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b7.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b8.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b11.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b12.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b23.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b25.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b17.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b19.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b20.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b22.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b29.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b33.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b44.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
        b45.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b35.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
        b37.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
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

    public class MenuManobrasG extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        // private JPanel jpPainel = new JPanel();

        public MenuManobrasG() // --- Configura��o do Frame
        {
            super("Menu geral das Manobras");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout

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
            bMan230.setActionCommand("Manobras de 230 Kv");// define o nome da acao
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

    // ############ CLASSE DO MENU DAS MANOBRAS DE TRANSFERÊNCIA ###########
    public class MenuManobrasTransf extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        // private JPanel jpPainel = new JPanel();

        public MenuManobrasTransf() // --- Configura��o do Frame
        {
            super("Menu Manobras de Transferencia");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout

            setSize(630, 456);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);

            // JLabel lbindice;

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
            bManobraPadrao.setToolTipText("Pressione conferir a manobra Padrao");
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

            bTransfMT3MTR.setBackground(new Color(180, 180, 250));
            bTransfMTRMT3.setBackground(new Color(180, 180, 250));
            // bTransfMT2MTR.setBackground(new Color(180, 180, 250));
            // bTransfMTRMT2.setBackground(new Color(180, 180, 250));
            // bTransfMT4MTR.setBackground(new Color(180, 180, 250));
            // bTransfMTRMT4.setBackground(new Color(180, 180, 250));

            container.add(painel);

            bTransfMT3MTR.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        TransfMT3MTR = "TransferirMT3MTR";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: "
                                + "Manobra para Transferir do MT-3 para MT-R                                  ");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para transferir as cargas do MT-3 para o MT-R foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bTransfMTRMT3.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        TransfMTRMT3 = "TransferirMTRMT3";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇAO: " + " Manobra para Tranferir do MT-R para MT-3");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para transferir as cargas do MT-R para o MT-3 foi Habilitada com Sucesso!!!");
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

    public class MenuManobrasReduçao extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        // private JPanel jpPainel = new JPanel();

        public MenuManobrasReduçao() // --- Configura��o do Frame
        {
            super("Menu Manobras da Reduçao");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout

            setSize(630, 456);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);

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

            bDesligamentoProgRed3.setBackground(new Color(180, 180, 250));
            bNormalizaçaoRed3.setBackground(new Color(180, 180, 250));
            // bDesligamentoProgRed1.setBackground(new Color(180, 180, 250));
            // bNormalizaçaoRed1.setBackground(new Color(180, 180, 250));
            // bDesligamentoProgRed4.setBackground(new Color(180, 180, 250));
            // bNormalizaçaoRed4.setBackground(new Color(180, 180, 250));

            container.add(painel);

            bDesligamentoProgRed3.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DeslProgRed3 = "DeslProgRed3";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: "
                                + "Manobra para Desligamento da Reduçao 3                                  ");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para Desligamento da Reduçao 3 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bNormalizaçaoRed3.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        NormRed3 = "NormalizacaoRed3";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇAO: " + " Manobra para Normalizaçao da Reduçao 3");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para Normalizaçao da Reduçao 3 foi Habilitada com Sucesso!!!");
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

    // ############ CLASSE DAS MANOBRAS EXECUTADAS ###########
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

                    if (DeslProgRed3.equals("DeslProgRed3")) {
                        mostrar1.setText("                 " + disjuntor52c5aberto);
                        mostrar2.setText("                 " + disjuntor52c6aberto);
                        mostrar3.setText("                 " + disjuntor52r13aberto);
                        mostrar4.setText("               " + disjuntor52lvr3aberto);
                    }

                    if (NormRed3.equals("NormalizacaoRed3")) {
                        mostrar1.setText("                " + disjuntor52lvr3fechado);
                        mostrar2.setText("                 " + disjuntor52r13fechado);
                        mostrar3.setText("                  " + disjuntor52c5fechado);
                        mostrar4.setText("                             " + disjuntor52c6fechado);
                    }

                    if (TransfMT3MTR.equals("TransferirMT3MTR")) {
                        mostrar1.setText("            " + disjuntor52p4aberto);
                        mostrar2.setText("         " + seccionadora89p4aberta);
                        mostrar3.setText("       " + seccionadora89p4efechada);
                        mostrar4.setText("            " + disjuntor52c5aberto);
                        mostrar5.setText("            " + disjuntor52c6aberto);
                        mostrar6.setText("            " + disjuntor52r13aberto);
                        mostrar7.setText("         " + seccionadora89r13aberta);
                        mostrar8.setText("       " + seccionadora89r13efechada);
                        mostrar9.setText("           " + disjuntor52r13fechado);
                        mostrar10.setText("           " + disjuntor52r14aberto);
                        mostrar11.setText("        " + seccionadora89r14aberta);
                        mostrar12.setText("      " + seccionadora89r14efechada);
                        mostrar13.setText("          " + disjuntor52r14fechado);
                        mostrar14.setText("          " + disjuntor52p2fechado);
                        mostrar15.setText("           " + disjuntor52p1aberto);
                        mostrar16.setText("        " + seccionadora89c5aberta);
                        mostrar17.setText("      " + seccionadora89c5efechada);
                        mostrar18.setText("        " + seccionadora89c6aberta);
                        mostrar19.setText("      " + seccionadora89c6efechada);
                        mostrar20.setText("          " + disjuntor52c5fechado);
                        mostrar21.setText("          " + disjuntor52c6fechado);
                        mostrar22.setText("        " + seccionadora89p4aberta);
                        mostrar23.setText("      " + seccionadora89p4efechada);
                        mostrar24.setText("          " + disjuntor52p4fechado);
                    }

                    if (TransfMTRMT3.equals("TransferirMTRMT3")) {
                        mostrar1.setText("             " + disjuntor52p4aberto);
                        mostrar2.setText("         " + seccionadora89p4eaberta);
                        mostrar3.setText("         " + seccionadora89p4fechada);
                        mostrar4.setText("             " + disjuntor52c5aberto);
                        mostrar5.setText("             " + disjuntor52c6aberto);
                        mostrar6.setText("             " + disjuntor52r13aberto);
                        mostrar7.setText("         " + seccionadora89r13eaberta);
                        mostrar8.setText("         " + seccionadora89r13fechada);
                        mostrar9.setText("            " + disjuntor52r13fechado);
                        mostrar10.setText("            " + disjuntor52r14aberto);
                        mostrar11.setText("        " + seccionadora89r14eaberta);
                        mostrar12.setText("        " + seccionadora89r14fechada);
                        mostrar13.setText("           " + disjuntor52r14fechado);
                        mostrar14.setText("           " + disjuntor52p4fechado);
                        mostrar15.setText("            " + disjuntor52p4aberto);
                        mostrar16.setText("        " + seccionadora89c5eaberta);
                        mostrar17.setText("        " + seccionadora89c5fechada);
                        mostrar18.setText("        " + seccionadora89c6eaberta);
                        mostrar19.setText("        " + seccionadora89c6fechada);
                        mostrar20.setText("           " + disjuntor52c5fechado);
                        mostrar21.setText("           " + disjuntor52c6fechado);
                        mostrar22.setText("        " + seccionadora89p4eaberta);
                        mostrar23.setText("        " + seccionadora89p4fechada);
                        mostrar24.setText("           " + disjuntor52p4fechado);
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
                        manobra = " OM para Preparar a SE ALBRAS para Normaliza��o";
                        lbManobra.setText(manobra);
                    }

                    if (EnerGerador.equals("EnergizarGerador")) {
                        manobra = " OM para Energizar os Geradores";
                        lbManobra.setText(manobra);
                    }

                    if (DeslProgRed3.equals("DeslProgRed3")) {
                        manobra = " OM para Desligar a Reduçao 1";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed3.equals("NormalizacaoRed3")) {
                        manobra = " OM para Normalizar a Reduçao 3";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMT3MTR.equals("TransferirMT3MTR")) {
                        manobra = " OM para Transferir do Trafo MT-3 para o MT-R";
                        lbManobra.setText(manobra);
                    }

                    if (TransfMTRMT3.equals("TransferirMTRMT3")) {
                        manobra = " OM para Transferir do Traffo MT-R para o MT-3";
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

    // ############ CLASSE DO MENU DAS MANOBRAS PADRÃO ###########
    public class ManobraPadrao extends JFrame // implements ActionListener
    {
        private JLabel projeto;
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
                        mostrar14.setText("       14. Fechar disjuntor 52 A5");
                        mostrar15.setText("       15. Fechar disjuntor 52 A6");
                        // mostrar16.setText(" 16. Fechar disjuntor 52 A7");
                        // mostrar17.setText(" 17. Fechar disjuntor 52 A8");
                        // mostrar18.setText(" 18. Fechar disjuntor 52 P1");
                        // mostrar19.setText(" 19. Fechar disjuntor 52 P2");
                        // mostrar20.setText(" 20. Fechar disjuntor 52 P3");
                        mostrar21.setText("       21. Fechar disjuntor 52 P4");
                        mostrar22.setText("       22. Fechar disjuntor 52 P5");
                        // mostrar23.setText(" 23. Fechar disjuntor 52 P6");
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
                        mostrar14.setText("       14. Abrir disjuntor 52 A5");
                        mostrar15.setText("       15. Abrir disjuntor 52 A6");
                        // mostrar16.setText(" 16. Abrir disjuntor 52 A7");
                        // mostrar17.setText(" 17. Abrir disjuntor 52 A8");
                        // mostrar18.setText(" 18. Abrir disjuntor 52 P1");
                        // mostrar19.setText(" 19. Abrir disjuntor 52 P2");
                        // mostrar20.setText(" 20. Abrir disjuntor 52 P3");
                        mostrar21.setText(" 21. Abrir disjuntor 52 P4");
                        mostrar22.setText(" 22. Abrir disjuntor 52 P5");
                        // mostrar23.setText(" 23. Abrir disjuntor 52 P6");
                    }

                    if (PrepAlbras.equals("PrepAlbras")) {
                        // mostrar1.setText(" 1. Abrir Seccionadora 89 A2-E");
                        // mostrar2.setText(" 2. Abrir Seccionadora 89 A4-E");
                        mostrar3.setText("  3. Abrir Seccionadora 89 A6-E");
                        // mostrar4.setText(" 4. Abrir Seccionadora 89 A8-E");
                        // mostrar5.setText(" 5.Abrir Seccionadora 89 LVRR-E");
                        // mostrar6.setText(" 6. Abrir Seccionadora 89 LVR-R");
                        // mostrar7.setText(" 7. Abrir Seccionadora 89 P1");
                        // mostrar8.setText(" 8. Abrir Seccionadora 89 P2");
                        // mostrar9.setText(" 9. Abrir Seccionadora 89 P3");
                        mostrar10.setText("  10. Abrir Seccionadora 89 P4");
                        mostrar11.setText("  11. Abrir Seccionadora 89 P5");
                        // mostrar12.setText(" 12. Abrir Seccionadora 89 P6");
                        // mostrar13.setText(" 13.Fechar Seccionadora 89 A2-E");
                        // mostrar14.setText(" 14.Fechar Seccionadora 89 A4-E");
                        mostrar15.setText("15.Fechar Seccionadora 89 A6-E");
                        // mostrar16.setText(" 16.Fechar Seccionadora 89 A8-E");
                        // mostrar17.setText(" 17.Fechar Seccionadora 89 P1-E");
                        // mostrar18.setText(" 18.Fechar Seccionadora 89 P2-E");
                        // mostrar19.setText(" 19.Fechar Seccionadora 89 P3-E");
                        mostrar20.setText("20.Fechar Seccionadora 89 P4-E");
                        mostrar21.setText("21.Fechar Seccionadora 89 P5-E");
                        // mostrar22.setText(" 22.Fechar Seccionadora 89 P6-E");
                        // mostrar23.setText(" 23.Fechar Seccionadora 89 TU-E");
                        // mostrar24.setText(" 24. Fechar Disjuntor 52 TU");
                    }

                    if (EnerGerador.equals("EnergizarGerador")) {
                        mostrar1.setText("              1. Fechar Disjuntor 52 G1");
                        mostrar2.setText("                        2. Fechar Disjuntor 52 G2");
                    }

                    if (DeslProgRed3.equals("DeslProgRed3")) {
                        mostrar1.setText("                   1. Desligar Disjuntor 52 C5");
                        mostrar2.setText("                   2. Desligar DisJuntor 52 C6");
                        mostrar3.setText("               3. Desligar Disjuntor 52 LVR3-A");
                        mostrar4.setText("                 4. Desligar Disjuntor 52 LVR3");
                    }

                    if (NormRed3.equals("NormalizacaoRed3")) {
                        mostrar1.setText("                   1. Ligar Disjuntor 52 LVR-3");
                        mostrar2.setText("                  2. Ligar Disjuntor 52 LVR-3A");
                        mostrar3.setText("                      3. Ligar Disjuntor 52 C5");
                        mostrar4.setText("                      4. Ligar Disjuntor 52 C6");
                    }

                    if (TransfMT3MTR.equals("TransferirMT3MTR")) {
                        mostrar1.setText("     1. Desligar Disjuntor 52 P4 ");
                        mostrar2.setText("     2. Abrir Seccionadora 89 P4 ");
                        mostrar3.setText("  3. Fechar Seccionadora 89 P4-E ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C5 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C6 ");
                        mostrar6.setText("       6. Abrir Disjuntor 52 R-13");
                        mostrar7.setText("  7. Abrir Seccionadora 89 R-13");
                        mostrar8.setText("  8. Fechar Seccionadora 89 R-13E");
                        mostrar9.setText("      9. Fechar Disjuntor 52 R-13 ");
                        mostrar10.setText("     10. Abrir Disjuntor 52 R-14");
                        mostrar11.setText("11. Abrir Seccionadora 89 R-14 ");
                        mostrar12.setText("12. Fechar Seccionadora 89 R-14E");
                        mostrar13.setText("    13. Fechar Disjuntor 52 R-14");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P4 ");
                        mostrar15.setText("      15. Abrir Disjuntor 52 P5 ");
                        mostrar16.setText("   16. Abrir Seccionadora 89 C5 ");
                        mostrar17.setText("17. Fechar Seccionadora 89 C5-E ");
                        mostrar18.setText("   18. Abrir Seccionadora 89 C6 ");
                        mostrar19.setText(" 19. Fechar Seccionadora 89 C6E ");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C5 ");
                        mostrar21.setText("     21. Fechar Disjuntor 52 C6 ");
                        mostrar22.setText("   22. Abrir Seccionadora 89 P5 ");
                        mostrar23.setText("23. Fechar Seccionadora 89 P5-E ");
                        mostrar24.setText("     24. Fechar Disjuntor 52 P5 ");
                    }

                    if (TransfMTRMT3.equals("TransferirMTRMT3")) {
                        mostrar1.setText("      1.Desligar Disjuntor 52 P4 ");
                        mostrar2.setText("   2. Abrir Seccionadora 89 P4-E ");
                        mostrar3.setText("    3. Fechar Seccionadora 89 P4 ");
                        mostrar4.setText("        4. Abrir Disjuntor 52 C5 ");
                        mostrar5.setText("        5. Abrir Disjuntor 52 C6 ");
                        mostrar6.setText("        6. Abrir disjuntor 52 R-13");
                        mostrar7.setText(" 7. Abrir Seccionadora89 R-13E ");
                        mostrar8.setText(" 8. Fechar Secccionadora 89 R-13 ");
                        mostrar9.setText("     9. Fechar Disjuntor 52 R-13 ");
                        mostrar10.setText("   10. Abrir Disjuntor 52 R-14 ");
                        mostrar11.setText("11. Abrir Seccionadora 89 R-14E");
                        mostrar12.setText("12. Fechar Seccionadora 89 R-14");
                        mostrar13.setText("   13. Fechar Disjuntor 52 R-14 ");
                        mostrar14.setText("     14. Fechar Disjuntor 52 P4 ");
                        mostrar15.setText("     15. Abrir Disjuntor  52 P5 ");
                        mostrar16.setText(" 16. Abrir Seccionadora 89 C5-E ");
                        mostrar17.setText("  17. Fechar Seccionadora 89 C5 ");
                        mostrar18.setText(" 18. Abrir Seccionadora 89 C6-E ");
                        mostrar19.setText("   19. Fechar Seccionadora 89 C6");
                        mostrar20.setText("     20. Fechar Disjuntor 52 C5 ");
                        mostrar21.setText("     21. Fechar Disjuntor 52 C6 ");
                        mostrar22.setText(" 22. Abrir Seccionadora 89 P5-E ");
                        mostrar23.setText("  23. Fechar Seccionadora 89 P5 ");
                        mostrar24.setText("     24. Fechar Disjuntor 52 P5 ");
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

                    if (DeslProgRed3.equals("DeslProgRed3")) {
                        manobra = " OM para Desligar a Reduçao 3 ";
                        lbManobra.setText(manobra);
                    }

                    if (NormRed3.equals("NormalizacaoRed3")) {
                        manobra = " OM para Normalizar a Reduçao 3 ";
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
                    setVisible(false);
                }
            });
        }// Fim main
    }// Fim Teste

    // ############ CLASSE DAS MANOBRAS INTELIGENTE1 ###########
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

                if (disjuntor52a5fechado.equals("Disjuntor 52A5 Fechado") && passo == 0) {
                    passo = passo + 1;
                    relogio.passo = 14;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso !!!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52a6fechado.equals("Disjuntor 52A6 Fechado") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 15;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso !!!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52p4fechado.equals("Disjuntor 52P4 Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 21;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso !!!",
                            "Energizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52p5fechado.equals("Disjuntor 52P5 Fechado") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso !!!",
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

                if (disjuntor52a5aberto.equals("Disjuntor 52A5 Aberto") && passo == 0) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso !!!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52a6aberto.equals("Disjuntor 52A6 Aberto") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null,
                            "Passo 15 realizado com sucesso. Continue no Painel do LVR-4!!!",
                            "Passo para Desenergizar a SE ALBRAS.", JOptionPane.INFORMATION_MESSAGE);

                }

                else if (disjuntor52p4aberto.equals("Disjuntor 52P4 Aberto") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso !!!",
                            "Desenergizar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);

                }

                else if (disjuntor52p5aberto.equals("Disjuntor 52P5 Aberto") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    // relogio.setVisible(true);
                    relogio.rendimento();
                    // relogio.atualizaTempo();
                    JOptionPane.showMessageDialog(null,
                            "Passo 22 realizado com sucesso. Continue no Painel do LVR-4!!!",
                            "Passo para Desenergizar a SE ALBRAS.", JOptionPane.INFORMATION_MESSAGE);

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
                if (seccionadora89a6eaberta.equals("Seccionadora 89A6E Aberta") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p4aberta.equals("Seccionadora 89P4 Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p5aberta.equals("Seccionadora 89P5 Aberta") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89a6efechada.equals("Seccionadora 89A6E Fechada") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p4efechada.equals("Seccionadora 89P4E Fechada") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p5efechada.equals("Seccionadora 89P5E Fechada") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso !!!",
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
                            "Energizar os Geradores de Emerg�ncia", JOptionPane.INFORMATION_MESSAGE);
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
                                "OM para Energizar os Geradores de Emergencia! Concluida com sucesso !!!",
                                "Energizar Bay da Linha 1", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Energizar o Bay da Linha 1 Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void TransfMT3MTR() {
            if (TransfMT3MTR.equals("TransferirMT3MTR")) {
                relogio.quantpassos = 24;
                if (disjuntor52p4aberto.equals("Disjuntor 52P4 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p4aberta.equals("Seccionadora 89P4 Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p4efechada.equals("Seccionadora 89P4E Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c5aberto.equals("Disjuntor 52C5 Aberto") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c6aberto.equals("Disjuntor 52C6 Aberto") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r13aberto.equals("Disjuntor 52R13 Aberto") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r13aberta.equals("Seccionadora 89R13 Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r13efechada.equals("Seccionadora 89R13E Fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r13fechado.equals("Disjuntor 52R13 Fechado") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r14aberto.equals("Disjuntor 52R14 Aberto") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r14aberta.equals("Seccionadora 89R14 Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (seccionadora89r14efechada.equals("Seccionadora 89R14E Fechada") && passo == 11) {
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52r14fechado.equals("Disjuntor 52R14 Fechado") && passo == 12) {
                    passo = passo + 1;
                    relogio.passo = 13;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52p4fechado.equals("Disjuntor 52P4 Fechado") && passo == 13) {
                    passo = passo + 1;
                    relogio.passo = 14;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52p5aberto.equals("Disjuntor 52P5 Aberto") && passo == 14) {
                    passo = passo + 1;
                    relogio.passo = 15;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (seccionadora89c5aberta.equals("Seccionadora 89C5 Aberta") && passo == 15) {
                    passo = passo + 1;
                    relogio.passo = 16;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (seccionadora89c5efechada.equals("Seccionadora 89C5E Fechada") && passo == 16) {
                    passo = passo + 1;
                    relogio.passo = 17;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89c6aberta.equals("Seccionadora 89C6 Aberta") && passo == 17) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso !!!",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (seccionadora89c6efechada.equals("Seccionadora 89C6E Fechada") && passo == 18) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52c5fechado.equals("Disjuntor 52C5 Fechado") && passo == 19) {
                    passo = passo + 1;
                    relogio.passo = 20;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52c6fechado.equals("Disjuntor 52C6 Fechado") && passo == 20) {
                    passo = passo + 1;
                    relogio.passo = 21;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p5aberta.equals("Seccionadora 89P5 Aberta") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p5efechada.equals("Seccionadora 89P5E Fechada") && passo == 22) {
                    passo = passo + 1;
                    relogio.passo = 23;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 23 realizado com sucesso !!!",
                            "Transferir do MT-5 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52p5fechado.equals("Disjuntor 52P5 Fechado") && passo == 23) {
                    passo = passo + 1;
                    relogio.passo = 24;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 24 && disjuntor52p5fechado.equals("Disjuntor 52P5 Fechado") ||
                            passo != 24)
                        JOptionPane.showMessageDialog(null,
                                "OM para Transferir do MT-3 para MT-R ! Concluida com sucesso !!!",
                                "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Transferir do MT-3 para o MT-R Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void TransfMTRMT3() {
            if (TransfMTRMT3.equals("TransferirMTRMT3")) {
                relogio.quantpassos = 24;
                if (disjuntor52p4aberto.equals("Disjuntor 52P4 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p4eaberta.equals("Seccionadora 89P4E Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p4fechada.equals("Seccionadora 89P4 Fechada") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c5aberto.equals("Disjuntor 52C5 Aberto") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c6aberto.equals("Disjuntor 52C6 Aberto") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 5;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r13aberto.equals("Disjuntor 52R13 Aberto") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 6;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r13eaberta.equals("Seccionadora 89R13E Aberta") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r13fechada.equals("Seccionadora 89R13 Fechada") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r13fechado.equals("Disjuntor 52R13 Fechado") && passo == 8) {
                    passo = passo + 1;
                    relogio.passo = 9;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 9 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r14aberto.equals("Disjuntor 52R14 Aberto") && passo == 9) {
                    passo = passo + 1;
                    relogio.passo = 10;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89r14eaberta.equals("Seccionadora 89R14E Aberta") && passo == 10) {
                    passo = passo + 1;
                    relogio.passo = 11;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (seccionadora89r14fechada.equals("Seccionadora 89R14 Fechada") && passo == 11) {
                    passo = passo + 1;
                    relogio.passo = 12;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52r14fechado.equals("Disjuntor 52R14 Fechado") && passo == 12) {
                    passo = passo + 1;
                    relogio.passo = 13;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52p4fechado.equals("Disjuntor 52P4 Fechado") && passo == 13) {
                    passo = passo + 1;
                    relogio.passo = 14;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52p5aberto.equals("Disjuntor 52P5 Aberto") && passo == 14) {
                    passo = passo + 1;
                    relogio.passo = 15;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (seccionadora89c5eaberta.equals("Seccionadora 89C5E Aberta") && passo == 15) {
                    passo = passo + 1;
                    relogio.passo = 16;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (seccionadora89c5fechada.equals("Seccionadora 89C5 Fechada") && passo == 16) {
                    passo = passo + 1;
                    relogio.passo = 17;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89c6eaberta.equals("Seccionadora 89C6E Aberta") && passo == 17) {
                    passo = passo + 1;
                    relogio.passo = 18;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (seccionadora89c6fechada.equals("Seccionadora 89C6 Fechada") && passo == 18) {
                    passo = passo + 1;
                    relogio.passo = 19;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52c5fechado.equals("Disjuntor 52C5 Fechado") && passo == 19) {
                    passo = passo + 1;
                    relogio.passo = 20;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);

                } else if (disjuntor52c6fechado.equals("Disjuntor 52C6 Fechado") && passo == 20) {
                    passo = passo + 1;
                    relogio.passo = 21;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p5eaberta.equals("Seccionadora 89P5E Aberta") && passo == 21) {
                    passo = passo + 1;
                    relogio.passo = 22;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p5fechada.equals("Seccionadora 89P5 Fechada") && passo == 22) {
                    passo = passo + 1;
                    relogio.passo = 23;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 23 realizado com sucesso !!!",
                            "Transferir do MT-3 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52p5fechado.equals("Disjuntor 52P5 Fechado") && passo == 23) {
                    passo = passo + 1;
                    relogio.passo = 24;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 24 && disjuntor52p5fechado.equals("Disjuntor 52P5 Fechado") ||
                            passo != 24)
                        JOptionPane.showMessageDialog(null,
                                "OM para Transferir do MT-R para MT-3 ! Concluida com sucesso !!!",
                                "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Transferir do MT-3 para o MT-R Incorreto, Voce deseja executar o aplicativo Ajuda? ",
                            "Ajuda", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    if (n == JOptionPane.YES_OPTION) {
                        MP.setVisible(true);
                    }
                }
            }
        }

        public void DeslProgRed3() {
            if (DeslProgRed3.equals("DeslProgRed3")) {
                relogio.quantpassos = 4;
                if (disjuntor52c5aberto.equals("Disjuntor 52C5 Aberto") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Desligamento da Reduçao 3", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c6aberto.equals("Disjuntor 52C6 Aberto") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Desligamento da Reduçao 3", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r13aberto.equals("Disjuntor 52R13 Aberto") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Desligamento da Reduçao 3", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52lvr3aberto.equals("Disjuntor 52LVR3 Aberto") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 4 && disjuntor52lvr3aberto.equals("Disjuntor 52LVR3 Aberto") ||
                            passo != 4)
                        JOptionPane.showMessageDialog(null, "OM para Desligar a Reduçao 3 ! Concluida com sucesso !!!",
                                "Desligamento da Reduçao 3", JOptionPane.INFORMATION_MESSAGE);
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

        public void NormRed3() {
            if (NormRed3.equals("NormalizacaoRed3")) {
                relogio.quantpassos = 4;
                if (disjuntor52lvr3fechado.equals("Disjuntor 52LVR3 Fechado") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Normalizaçao da Reduaçao 3", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52r13fechado.equals("Disjuntor 52R13 Fechado") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Normalizaçao da Reduaçao 3", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c5fechado.equals("Disjuntor 52C5 Fechado") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Normalizaçao da Reduaçao 3", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52c6fechado.equals("Disjuntor 52C6 Fechado") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 4;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();

                    if (passo == 4 && disjuntor52lvr3fechado.equals("Disjuntor 52LVR3 Fechado") ||
                            passo != 4)
                        JOptionPane.showMessageDialog(null,
                                "OM para Normalizar a Reduçao 3 ! Concluida com sucesso !!!",
                                "Normalizaçao da Reduçao 3", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "Nao", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Transferir do MT-3 para o MT-R Incorreto, Voce deseja executar o aplicativo Ajuda? ",
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
                                "OM para Energizar Barra EM pelo Gerador ! Conclu�da com sucesso !!!",
                                "Energizar Barra EM pelo Gerador", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Transferir do MT-1 para o MT-R Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                            "Energizar Barra EM pelo Gerador", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89tueaberta.equals("Seccionadora 89TUE Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                            "Energizar Barra EM pelo Gerador", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52g1aberto.equals("Disjuntor 52G1 Aberto") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                            "Energizar Barra EM pelo Gerador", JOptionPane.INFORMATION_MESSAGE);
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
                                "OM para Energizar Barra EM pelo Gerador ! Conclu�da com sucesso !!!",
                                "Energizar Barra EM pelo Gerador", JOptionPane.INFORMATION_MESSAGE);
                    limparMemoria();
                } else {
                    Object[] options = { "Sim", "N�o", "Cancelar" };
                    int n = JOptionPane.showOptionDialog(null,
                            "Passo para Transferir do MT-1 para o MT-R Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
        seccionadora89lvr3efechada = "";
        seccionadora89lvr3fechada = "";
        seccionadora89lvr3eaberta = "";
        seccionadora89lvr3aberta = "";
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
        seccionadora89r13fechada = "";
        seccionadora89r14fechada = "";
        seccionadora89r15fechada = "";
        seccionadora89r16fechada = "";
        seccionadora89r17fechada = "";
        seccionadora89r18fechada = "";
        seccionadora89r13aberta = "";
        seccionadora89r14aberta = "";
        seccionadora89r15aberta = "";
        seccionadora89r16aberta = "";
        seccionadora89r17aberta = "";
        seccionadora89r18aberta = "";
        seccionadora89r13eaberta = "";
        seccionadora89r14eaberta = "";
        seccionadora89r15eaberta = "";
        seccionadora89r16eaberta = "";
        seccionadora89r17eaberta = "";
        seccionadora89r18eaberta = "";
        seccionadora89r13efechada = "";
        seccionadora89r14efechada = "";
        seccionadora89r15efechada = "";
        seccionadora89r16efechada = "";
        seccionadora89r17efechada = "";
        seccionadora89r18efechada = "";
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
        disjuntor52lvr3fechado = "";
        disjuntor52lvr3aberto = "";
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
        disjuntor52r13fechado = "";
        disjuntor52r13aberto = "";
        disjuntor52r14fechado = "";
        disjuntor52r14aberto = "";
        disjuntor52r15fechado = "";
        disjuntor52r15aberto = "";
        disjuntor52r16fechado = "";
        disjuntor52r16aberto = "";
        disjuntor52r17fechado = "";
        disjuntor52r17aberto = "";
        disjuntor52r18fechado = "";
        disjuntor52r18aberto = "";
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
        JOptionPane.showMessageDialog(null, " Voce ja pode Habilitar a proxima manobra para Simulaçao!!!");
    }

    public static void main(String args[]) {
        new InterfaceMT3().setVisible(true);
        // InterfaceMT3 application = new InterfaceMT3();
    }
}