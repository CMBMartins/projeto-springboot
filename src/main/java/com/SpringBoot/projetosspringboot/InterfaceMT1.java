
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
 * MODULO -   INTERFACEMT1                             *
 ******************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
//import java.text.DecimalFormat;
import java.text.SimpleDateFormat; //Carregar este pacote

public class InterfaceMT1 extends JFrame implements ActionListener {
    JLabel tap, valortap, tensao, trafo, barra1, barra2, tap1, tap2, valortap1, valortap2, trafo1, trafo2, subir,
            descer, Alarmes;
    JLabel mt1a, mt1b, mt2a, mt2b, l1a, l1b, l2a, l2b, l189, l289, l157, l1, l257, l2, bta, btb, bta57, btb57, mt152,
            mtr52, mt252, l152, l252, bt52, gif1, ta1;
    JLabel status, status1, status2, mt1, mtr, mt2, c1, c2, lvr1, rf6, rf5, rf3, rf4, bcc1, bcc2, pla1, pla2, rf5e,
            rf4e, rf3e, rf552, rf452, rf352;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23,
            b24, b25;
    JButton b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46,
            b47, b48, b49, b50, b51, b52, b53, b54, b55, b56, b57, b58;
    JTextField tfUsuario, tfPerfil, tfCodigo, tfData, enterField;

    // private SimpleDateFormat formato;
    String nome, senha, data, codigo, usuario, tagequipamento, operacao, manobra;
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

    public InterfaceMT1() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout()); // gerenciador de layout
        setResizable(false);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        setTitle("Barramento de 34.5 kV MT-1");
        setSize(1100, 810);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        c.setBackground(new Color(180, 180, 180));
        // setLocation(300, 70);

        Object[] options = { "Sim", "Nao", "Cancelar" };
        int n = JOptionPane.showOptionDialog(null,
                "Voce deseja habilitar alguma manobra para Simulação? ",
                "Habilitar", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        if (n == JOptionPane.YES_OPTION) {
            MenuManobrasG MM = new MenuManobrasG();
            MM.setVisible(true);
        }

        JLabel l1 = new JLabel();
        l1.setFont(new Font("Arial", 1, 30));
        l1.setText("MT-1 Barramento de 34,5 kV");
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
        // ���������������������������������������������� BARRAS T1 E EM
        // ���������������������������������������������
        JPanel v = new JPanel(); // Barra T1
        v.setBounds(10, 5, 1000, 3);
        v.setBackground(Color.orange);
        painel.add(v);

        JPanel v1 = new JPanel(); // Barra EM
        v1.setBounds(10, 30, 1000, 3);
        v1.setBackground(Color.orange);
        painel.add(v1);

        barra1 = new JLabel("Barra T1"); // IDENTIFICA��O DA BARRA T1
        barra1.setBounds(10, 0, 60, 30);
        barra1.setForeground(Color.white);
        painel.add(barra1);

        barra2 = new JLabel("Barra EM");
        barra2.setForeground(Color.white);
        barra2.setBounds(10, 25, 60, 30); // IDENTIFICA��O DA BARRA EM
        painel.add(barra2);
        // ##################################### IDENTIFICA��O DOS EQUIPAMENTOS
        // ####################################
        mt2a = new JLabel("89 C1");
        mt2a.setBounds(52, 40, 60, 30);
        mt2a.setForeground(Color.white);
        painel.add(mt2a);
        mt2b = new JLabel("89 C1-E");
        mt2b.setForeground(Color.white);
        mt2b.setBounds(134, 40, 60, 30);
        painel.add(mt2b);
        mt1a = new JLabel("89 C2");
        mt1a.setBounds(202, 40, 60, 30);
        mt1a.setForeground(Color.white);
        painel.add(mt1a);
        mt1b = new JLabel("89 C2-E");
        mt1b.setForeground(Color.white);
        mt1b.setBounds(284, 40, 60, 30);
        painel.add(mt1b);
        mt2a = new JLabel("89 R6");
        mt2a.setForeground(Color.white);
        mt2a.setBounds(350, 40, 60, 30);
        painel.add(mt2a);
        mt2b = new JLabel("89 R6-E");
        mt2b.setForeground(Color.white);
        mt2b.setBounds(435, 40, 60, 30);
        painel.add(mt2b);
        l1a = new JLabel("89 LR-1");
        l1a.setForeground(Color.white);
        l1a.setBounds(510, 40, 60, 30);
        painel.add(l1a);
        l1b = new JLabel("89 LR-1E");
        l1b.setForeground(Color.white);
        l1b.setBounds(595, 40, 60, 30);
        painel.add(l1b);
        ta1 = new JLabel("89 TA1");
        ta1.setForeground(Color.white);
        ta1.setBounds(666, 40, 60, 30);
        painel.add(ta1);
        l2a = new JLabel("89 P1");
        l2a.setForeground(Color.white);
        l2a.setBounds(720, 40, 60, 30);
        painel.add(l2a);
        l2b = new JLabel("89 P1-E");
        l2b.setForeground(Color.white);
        l2b.setBounds(805, 40, 60, 30);
        painel.add(l2b);
        bta = new JLabel("89 P2");
        bta.setForeground(Color.white);
        bta.setBounds(870, 40, 60, 30);
        painel.add(bta);
        btb = new JLabel("89 P2-E");
        btb.setForeground(Color.white);
        btb.setBounds(955, 40, 60, 30);
        painel.add(btb);
        mt152 = new JLabel("52 C2");
        mt152.setForeground(Color.white);
        mt152.setBounds(260, 150, 60, 30);
        painel.add(mt152);
        mt252 = new JLabel("52 RF-6");
        mt252.setForeground(Color.white);
        mt252.setBounds(410, 150, 60, 30);
        painel.add(mt252);
        mt252 = new JLabel("52 C1");
        mt252.setForeground(Color.white);
        mt252.setBounds(110, 150, 60, 30);
        painel.add(mt252);
        l152 = new JLabel("52 LVR-1");
        l152.setForeground(Color.white);
        l152.setBounds(570, 150, 60, 30);
        painel.add(l152);
        ta1 = new JLabel("TA1");
        ta1.setForeground(Color.white);
        ta1.setBounds(685, 150, 60, 30);
        painel.add(ta1);
        l252 = new JLabel("52 P1");
        l252.setForeground(Color.white);
        l252.setBounds(780, 150, 60, 30);
        painel.add(l252);
        bt52 = new JLabel("52 P2");
        bt52.setForeground(Color.white);
        bt52.setBounds(927, 150, 60, 30);
        painel.add(bt52);

        c2 = new JLabel(" C2");
        c2.setForeground(Color.white);
        c2.setBounds(270, 220, 60, 30);
        painel.add(c2);
        c1 = new JLabel(" C1");
        c1.setForeground(Color.white);
        c1.setBounds(120, 220, 60, 30);
        painel.add(c1);
        lvr1 = new JLabel(" LVR-1");
        lvr1.setForeground(Color.white);
        lvr1.setBounds(490, 255, 60, 30);
        painel.add(lvr1);
        lvr1 = new JLabel("TF Regul. LVR-1A 34,5/34,5kV");
        lvr1.setForeground(Color.white);
        lvr1.setBounds(200, 315, 260, 30);
        painel.add(lvr1);
        lvr1 = new JLabel("TF Regulador 34,5/34,5kV");
        lvr1.setForeground(Color.white);
        lvr1.setBounds(560, 295, 260, 30);
        painel.add(lvr1);
        pla1 = new JLabel("Trafo de Aterramento");
        pla1.setForeground(Color.white);
        pla1.setBounds(590, 190, 260, 30);
        painel.add(pla1);
        bcc1 = new JLabel("Banco C1");
        bcc1.setForeground(Color.white);
        bcc1.setBounds(60, 250, 260, 30);
        painel.add(bcc1);
        bcc2 = new JLabel("Banco C2");
        bcc2.setForeground(Color.white);
        bcc2.setBounds(210, 250, 260, 30);
        painel.add(bcc2);
        pla1 = new JLabel("Aliment. de 34,5 kV P1");
        pla1.setForeground(Color.white);
        pla1.setBounds(700, 250, 260, 30);
        painel.add(pla1);
        pla2 = new JLabel("Aliment. de 34,5 kV P2");
        pla2.setForeground(Color.white);
        pla2.setBounds(855, 250, 260, 30);
        painel.add(pla2);

        rf5 = new JLabel("89 RF-5");
        rf5.setForeground(Color.white);
        rf5.setBounds(510, 379, 60, 30);
        painel.add(rf5);
        rf5e = new JLabel("89 RF-5E");
        rf5e.setForeground(Color.white);
        rf5e.setBounds(595, 379, 60, 30);
        painel.add(rf5e);
        rf4 = new JLabel("89 RF-4");
        rf4.setForeground(Color.white);
        rf4.setBounds(660, 379, 60, 30);
        painel.add(rf4);
        rf4e = new JLabel("89 RF-4E");
        rf4e.setForeground(Color.white);
        rf4e.setBounds(745, 379, 60, 30);
        painel.add(rf4e);
        rf3 = new JLabel("89 RF-3");
        rf3.setForeground(Color.white);
        rf3.setBounds(810, 378, 60, 30);
        painel.add(rf3);
        rf3e = new JLabel("89 RF-3E");
        rf3e.setForeground(Color.white);
        rf3e.setBounds(895, 379, 60, 30);
        painel.add(rf3e);

        rf552 = new JLabel("52 RF-5");
        rf552.setForeground(Color.white);
        rf552.setBounds(570, 495, 60, 30);
        painel.add(rf552);
        rf452 = new JLabel("52 RF-4");
        rf452.setForeground(Color.white);
        rf452.setBounds(720, 495, 60, 30);
        painel.add(rf452);
        rf352 = new JLabel("52 RF-3");
        rf352.setForeground(Color.white);
        rf352.setBounds(870, 495, 60, 30);
        painel.add(rf352);

        rf6 = new JLabel("RETIF.6");
        rf6.setForeground(Color.white);
        rf6.setBounds(440, 600, 60, 30);
        painel.add(rf6);
        rf5 = new JLabel("RETIF.5");
        rf5.setForeground(Color.white);
        rf5.setBounds(600, 600, 60, 30);
        painel.add(rf5);
        rf4 = new JLabel("RETIF.4");
        rf4.setForeground(Color.white);
        rf4.setBounds(750, 600, 60, 30);
        painel.add(rf4);
        rf3 = new JLabel("RETIF.3");
        rf3.setForeground(Color.white);
        rf3.setBounds(900, 600, 60, 30);
        painel.add(rf3);

        // �������������������������������������������� BAY BANCO C1
        // ����������������������������������������������������

        JPanel v86 = new JPanel(); // Seccionadora 89 C1
        v86.setBounds(45, 8, 3, 55);
        v86.setBackground(Color.orange);
        painel.add(v86);

        JPanel v87 = new JPanel();
        v87.setBounds(45, 103, 3, 23); // Seccionadora 89 C1 / Disjuntor
        v87.setBackground(Color.orange);
        painel.add(v87);

        JPanel v88 = new JPanel(); // Seccionadora 89 C1-E
        v88.setBounds(130, 30, 3, 33);
        v88.setBackground(Color.orange);
        painel.add(v88);

        JPanel v89 = new JPanel(); // SECCIONADORA 89 C2-E / DISJUNTOR C2
        v89.setBounds(129, 103, 3, 23);
        v89.setBackground(Color.orange);
        painel.add(v89);

        JPanel v91 = new JPanel(); // SECCIONADORA C1 / SECCIONADORA C1-E
        v91.setBounds(45, 125, 87, 3);
        v91.setBackground(Color.orange);
        painel.add(v91);

        JPanel v92 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v92.setBounds(90, 126, 3, 20);
        v92.setBackground(Color.orange);
        painel.add(v92);

        JPanel v90 = new JPanel(); // DISJUNTOR / BANCO
        v90.setBounds(90, 185, 3, 23);
        v90.setBackground(Color.orange);
        painel.add(v90);

        // �������������������������������������������� BAY BANCO C2
        // ����������������������������������������������������

        JPanel v2 = new JPanel(); // Seccionadora 89 C2
        v2.setBounds(195, 8, 3, 55);
        v2.setBackground(Color.orange);
        painel.add(v2);

        JPanel v3 = new JPanel();
        v3.setBounds(195, 103, 3, 23); // Seccionadora 89 C2 / Disjuntor
        v3.setBackground(Color.orange);
        painel.add(v3);

        JPanel v4 = new JPanel(); // Seccionadora 89 C2-E
        v4.setBounds(280, 30, 3, 33);
        v4.setBackground(Color.orange);
        painel.add(v4);

        JPanel v5 = new JPanel(); // SECCIONADORA 89 C2-E / DISJUNTOR C2
        v5.setBounds(279, 103, 3, 23);
        v5.setBackground(Color.orange);
        painel.add(v5);

        JPanel v7 = new JPanel(); // SECCIONADORA C2 / SECCIONADORA C2-E
        v7.setBounds(195, 125, 87, 3);
        v7.setBackground(Color.orange);
        painel.add(v7);

        JPanel v8 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v8.setBounds(240, 126, 3, 20);
        v8.setBackground(Color.orange);
        painel.add(v8);

        JPanel v6 = new JPanel(); // DISJUNTOR / BANCO
        v6.setBounds(240, 185, 3, 23);
        v6.setBackground(Color.orange);
        painel.add(v6);

        // ������������������������������������������������� BAY TRAFO LVR-1A
        // ����������������������������������������������

        JPanel v13 = new JPanel(); // SECCIONADORA 89 LVR-1A
        v13.setBounds(345, 8, 3, 55);
        v13.setBackground(Color.orange);
        painel.add(v13);

        JPanel v14 = new JPanel(); // SECCIONADORA 89 LVR-1A / DISJUNTOR 52 LVR-1A
        v14.setBounds(345, 103, 3, 23);
        v14.setBackground(Color.orange);
        painel.add(v14);

        JPanel v15 = new JPanel(); // SECCIONADORA 89 LVR-1AE
        v15.setBounds(430, 30, 3, 33);
        v15.setBackground(Color.orange);
        painel.add(v15);

        JPanel v16 = new JPanel(); // SECCIONADORA 89 LVR-1A / DISJUNTOR
        v16.setBounds(430, 103, 3, 23);
        v16.setBackground(Color.orange);
        painel.add(v16);

        JPanel v18 = new JPanel(); // SECCIONADORA 89 LVR-1A / SECCIONADORA 89 LVR-1AE
        v18.setBounds(345, 125, 88, 3);
        v18.setBackground(Color.orange);
        painel.add(v18);

        JPanel v19 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v19.setBounds(390, 126, 3, 20);
        v19.setBackground(Color.orange);
        painel.add(v19);

        JPanel v17 = new JPanel(); // DISJUNTOR / TRANSFORMADOR LVR-1A
        v17.setBounds(390, 185, 3, 123);
        v17.setBackground(Color.orange);
        painel.add(v17);

        JPanel v20 = new JPanel(); // TRANSFORMADOR / RETIFICADOR R6
        v20.setBounds(390, 349, 3, 234);
        v20.setBackground(Color.yellow);
        painel.add(v20);

        // ������������������������������������������� BAY DA LVR-1
        // ���������������������������������������������

        JPanel v22 = new JPanel(); // SECCIONADORA 89 LVR-1
        v22.setBounds(505, 8, 3, 55);
        v22.setBackground(Color.orange);
        painel.add(v22);

        JPanel v23 = new JPanel();
        v23.setBounds(505, 103, 3, 23); // Seccionadora 89 LVR-1 / Disjuntor
        v23.setBackground(Color.orange);
        painel.add(v23);

        JPanel v24 = new JPanel(); // Seccionadora 89 LVR-1E
        v24.setBounds(590, 30, 3, 33);
        v24.setBackground(Color.orange);
        painel.add(v24);

        JPanel v25 = new JPanel(); // SECCIONADORA 89 LVR-1 / DISJUNTOR 52 LVR-1
        v25.setBounds(590, 103, 3, 23);
        v25.setBackground(Color.orange);
        painel.add(v25);

        JPanel v26 = new JPanel(); // DISJUNTOR / TRAFO LVR-1
        v26.setBounds(550, 185, 3, 65);
        v26.setBackground(Color.orange);
        painel.add(v26);

        JPanel v27 = new JPanel(); // SECCIONADORA LVR1 / SECCIONADORA LVR1-E
        v27.setBounds(505, 125, 88, 3);
        v27.setBackground(Color.orange);
        painel.add(v27);

        JPanel v28 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v28.setBounds(550, 126, 3, 20);
        v28.setBackground(Color.orange);
        painel.add(v28);

        JPanel v44 = new JPanel(); // TRANSFORMADOR / BARRA R1
        v44.setBounds(551, 289, 3, 61);
        v44.setBackground(Color.yellow);
        painel.add(v44);
        // ���������������������������������������� BAY DA PLANTA P1
        // ������������������������������������������������������

        JPanel v29 = new JPanel(); // SECCIONADORA 89 P1
        v29.setBounds(715, 8, 3, 55);
        v29.setBackground(Color.orange);
        painel.add(v29);

        JPanel v30 = new JPanel();
        v30.setBounds(715, 103, 3, 23); // Seccionadora 89 P1 / Disjuntor
        v30.setBackground(Color.orange);
        painel.add(v30);

        JPanel v31 = new JPanel(); // Seccionadora 89 P1-E
        v31.setBounds(800, 30, 3, 33);
        v31.setBackground(Color.orange);
        painel.add(v31);

        JPanel v32 = new JPanel(); // SECCIONADORA 89 P1-E / DISJUNTOR 52 P1
        v32.setBounds(800, 103, 3, 23);
        v32.setBackground(Color.orange);
        painel.add(v32);

        JPanel v33 = new JPanel(); // DISJUNTOR / ALIMENTADOR
        v33.setBounds(760, 185, 3, 50);
        v33.setBackground(Color.orange);
        painel.add(v33);

        JPanel v34 = new JPanel(); // SECCIONADORA P1 / SECCIONADORA P1-E
        v34.setBounds(715, 125, 88, 3);
        v34.setBackground(Color.orange);
        painel.add(v34);

        JPanel v35 = new JPanel(); // DISJUNTOR / ALIMENTADOR
        v35.setBounds(760, 126, 3, 20);
        v35.setBackground(Color.orange);
        painel.add(v35);

        JPanel v74 = new JPanel(); // SETA
        v74.setBounds(756, 235, 11, 5);
        v74.setBackground(Color.orange);
        painel.add(v74);
        JPanel v70 = new JPanel(); // SETA
        v70.setBounds(757, 240, 9, 4);
        v70.setBackground(Color.orange);
        painel.add(v70);
        JPanel v71 = new JPanel(); // SETA
        v71.setBounds(758, 243, 7, 3);
        v71.setBackground(Color.orange);
        painel.add(v71);
        JPanel v72 = new JPanel(); // SETA
        v72.setBounds(759, 246, 5, 2);
        v72.setBackground(Color.orange);
        painel.add(v72);
        JPanel v73 = new JPanel(); // SETA
        v73.setBounds(760, 248, 3, 2);
        v73.setBackground(Color.orange);
        painel.add(v73);
        // �������������������������������������������� BAY DA PLANTA P2
        // ����������������������������������������

        JPanel v36 = new JPanel(); // SECCIONADORA 89 P2
        v36.setBounds(865, 8, 3, 55);
        v36.setBackground(Color.orange);
        painel.add(v36);

        JPanel v37 = new JPanel();
        v37.setBounds(865, 103, 3, 23); // Seccionadora 89 P2 / Disjuntor 52 BT
        v37.setBackground(Color.orange);
        painel.add(v37);

        JPanel v38 = new JPanel(); // Seccionadora 89 P2-E
        v38.setBounds(950, 30, 3, 33);
        v38.setBackground(Color.orange);
        painel.add(v38);

        JPanel v39 = new JPanel(); // SECCIONADORA 89 P2-E / DISJUNTOR 52 P2
        v39.setBounds(950, 103, 3, 23);
        v39.setBackground(Color.orange);
        painel.add(v39);

        JPanel v41 = new JPanel(); // SECCIONADORA 89 P2 / DISJUNTOR 52 P2
        v41.setBounds(907, 125, 3, 20);
        v41.setBackground(Color.orange);
        painel.add(v41);

        JPanel v42 = new JPanel(); // SECCIONADORA 89 P2-E / DISJUNTOR 52 P2
        v42.setBounds(865, 125, 88, 3);
        v42.setBackground(Color.orange);
        painel.add(v42);

        JPanel v43 = new JPanel(); // DISJUNTOR / ALIMENTADOR P2
        v43.setBounds(907, 185, 3, 50);
        v43.setBackground(Color.orange);
        painel.add(v43);

        JPanel v75 = new JPanel(); // SETA
        v75.setBounds(903, 235, 11, 5);
        v75.setBackground(Color.orange);
        painel.add(v75);
        JPanel v76 = new JPanel(); // SETA
        v76.setBounds(904, 240, 9, 4);
        v76.setBackground(Color.orange);
        painel.add(v76);
        JPanel v77 = new JPanel(); // SETA
        v77.setBounds(905, 243, 7, 3);
        v77.setBackground(Color.orange);
        painel.add(v77);
        JPanel v78 = new JPanel(); // SETA
        v78.setBounds(906, 246, 5, 2);
        v78.setBackground(Color.orange);
        painel.add(v78);
        JPanel v79 = new JPanel(); // SETA
        v79.setBounds(907, 248, 3, 2);
        v79.setBackground(Color.orange);
        painel.add(v79);

        // ���������������������������������������������� BARRAS T1 E EM
        // ���������������������������������������������
        JPanel v45 = new JPanel(); // Barra T1
        v45.setBounds(490, 350, 510, 3);
        v45.setBackground(Color.yellow);
        painel.add(v45);

        JPanel v46 = new JPanel(); // Barra EM
        v46.setBounds(490, 375, 510, 3);
        v46.setBackground(Color.yellow);
        painel.add(v46);
        // ���������������������������������������� BAY DA TRAFO TA-1
        // ������������������������������������������������������

        JPanel v68 = new JPanel(); // SECCIONADORA 89 TA1
        v68.setBounds(660, 8, 3, 55);
        v68.setBackground(Color.orange);
        painel.add(v68);

        JPanel v69 = new JPanel();
        v69.setBounds(660, 103, 3, 50); // Seccionadora 89 TA-1 / Disjuntor
        v69.setBackground(Color.orange);
        painel.add(v69);

        // ���������������������������������������������� BAY RF 05
        // ���������������������������������������������
        JPanel v47 = new JPanel(); // SECCIONADORA 89 R5
        v47.setBounds(505, 350, 3, 53);
        v47.setBackground(Color.yellow);
        painel.add(v47);

        JPanel v48 = new JPanel();
        v48.setBounds(505, 445, 3, 24); // Seccionadora 89 R5 / Disjuntor
        v48.setBackground(Color.yellow);
        painel.add(v48);

        JPanel v49 = new JPanel(); // Seccionadora 89 R5-E
        v49.setBounds(590, 375, 3, 28);
        v49.setBackground(Color.yellow);
        painel.add(v49);

        JPanel v50 = new JPanel(); // SECCIONADORA 89 R5-E / DISJUNTOR 52 R5
        v50.setBounds(590, 445, 3, 23);
        v50.setBackground(Color.yellow);
        painel.add(v50);

        JPanel v52 = new JPanel(); // SECCIONADORA R5 / SECCIONADORA R5-E
        v52.setBounds(505, 468, 88, 3);
        v52.setBackground(Color.yellow);
        painel.add(v52);

        JPanel v53 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v53.setBounds(550, 469, 3, 20);
        v53.setBackground(Color.yellow);
        painel.add(v53);

        JPanel v51 = new JPanel(); // DISJUNTOR / TRAFO RF-5
        v51.setBounds(550, 528, 3, 55);
        v51.setBackground(Color.yellow);
        painel.add(v51);

        // ���������������������������������������������� BAY RF 04
        // ���������������������������������������������
        JPanel v54 = new JPanel(); // SECCIONADORA 89 R4
        v54.setBounds(655, 350, 3, 53);
        v54.setBackground(Color.yellow);
        painel.add(v54);

        JPanel v55 = new JPanel();
        v55.setBounds(655, 445, 3, 24); // Seccionadora 89 R4 / Disjuntor
        v55.setBackground(Color.yellow);
        painel.add(v55);

        JPanel v56 = new JPanel(); // Seccionadora 89 R4-E
        v56.setBounds(740, 375, 3, 28);
        v56.setBackground(Color.yellow);
        painel.add(v56);

        JPanel v57 = new JPanel(); // SECCIONADORA 89 R4-E / DISJUNTOR 52 R4
        v57.setBounds(740, 445, 3, 23);
        v57.setBackground(Color.yellow);
        painel.add(v57);

        JPanel v58 = new JPanel(); // SECCIONADORA R4 / SECCIONADORA R4-E
        v58.setBounds(655, 468, 88, 3);
        v58.setBackground(Color.yellow);
        painel.add(v58);

        JPanel v59 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v59.setBounds(700, 469, 3, 20);
        v59.setBackground(Color.yellow);
        painel.add(v59);

        JPanel v60 = new JPanel(); // DISJUNTOR / TRAFO RF-4
        v60.setBounds(700, 528, 3, 55);
        v60.setBackground(Color.yellow);
        painel.add(v60);

        // ���������������������������������������������� BAY RF 03
        // ���������������������������������������������
        JPanel v61 = new JPanel(); // SECCIONADORA 89 R3
        v61.setBounds(805, 350, 3, 53);
        v61.setBackground(Color.yellow);
        painel.add(v61);

        JPanel v62 = new JPanel();
        v62.setBounds(805, 445, 3, 24); // Seccionadora 89 R3 / Disjuntor
        v62.setBackground(Color.yellow);
        painel.add(v62);

        JPanel v63 = new JPanel(); // Seccionadora 89 R3-E
        v63.setBounds(890, 375, 3, 28);
        v63.setBackground(Color.yellow);
        painel.add(v63);

        JPanel v64 = new JPanel(); // SECCIONADORA 89 R3-E / DISJUNTOR 52 R3
        v64.setBounds(890, 445, 3, 23);
        v64.setBackground(Color.yellow);
        painel.add(v64);

        JPanel v65 = new JPanel(); // SECCIONADORA R3 / SECCIONADORA R3-E
        v65.setBounds(805, 468, 88, 3);
        v65.setBackground(Color.yellow);
        painel.add(v65);

        JPanel v66 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v66.setBounds(850, 469, 3, 20);
        v66.setBackground(Color.yellow);
        painel.add(v66);

        JPanel v67 = new JPanel(); // DISJUNTOR / TRAFO RF-3
        v67.setBounds(850, 528, 3, 55);
        v67.setBackground(Color.yellow);
        painel.add(v67);

        // �������������������������������������� CRIA��O DO BOT�O 89 RF-6
        // ����������������������������������������

        b1 = new JButton(); // BOT�O CS 89 RF-6
        b1.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b1.addActionListener(this);
        b1.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b1.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b1.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b1.setForeground(Color.black);// cor do titulo do bot�o
        b1.setEnabled(true);
        b1.setToolTipText("Pressione para operar a Seccionadora 89 RF6");
        b1.setMnemonic(KeyEvent.VK_B);
        b1.setActionCommand("89RF-6");// define o nome da acao
        b1.setBounds(330, 62, 33, 45);
        painel.add(b1);

        // �������������������������������������� CRIA��O DO BOT�O 52 RF-6
        // �����������������������������������������

        b2 = new JButton(); // BOT�O DJ 52 RF-6
        b2.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b2.addActionListener(this);
        b2.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b2.setMnemonic(KeyEvent.VK_C);
        b2.setToolTipText("Pressione para operar o Disjuntor 52 RF-6");
        b2.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b2.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
        b2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b2.setBounds(375, 145, 33, 42);
        painel.add(b2);

        // ���������������������������������� CRIA��O DO BOT�O CS 89 RF-6E
        // �����������������������������������������

        b3 = new JButton(); // BOT�O CS 89 RF-6E
        b3.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b3.addActionListener(this);
        b3.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b3.setToolTipText("Pressione para operar a Seccionadora 89 RF-6E");
        b3.setHorizontalTextPosition(AbstractButton.CENTER);
        b3.setVerticalTextPosition(AbstractButton.CENTER);
        b3.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b3.setBounds(415, 62, 33, 45);
        painel.add(b3);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO LVR-1A
        // ������������������������������������������

        b4 = new JButton(); // BOT�O TRANSFORMADOR LVR-1A
        b4.setIcon(new javax.swing.ImageIcon("LVRA.jpg"));
        b4.addActionListener(this);
        b4.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        b4.setToolTipText("Pressione para comutar o Tap do Transformador LVR-1A");
        b4.setHorizontalTextPosition(AbstractButton.CENTER);
        b4.setVerticalTextPosition(AbstractButton.CENTER);
        b4.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b4.setBounds(371, 308, 43, 42);
        painel.add(b4);

        // ����������������������������������� CRIA��O DO BOT�ES DE CONTROLE DO TRAFO
        // LVR-1A �����������������������

        b5 = new JButton("+"); // TAP LVR-1A
        b5.setBounds(425, 310, 41, 15);
        b5.addActionListener(this);
        painel.add(b5);

        b6 = new JButton("-"); // TAP LVR-1A
        b6.setBounds(425, 330, 41, 15);
        b6.addActionListener(this);
        painel.add(b6);

        tap = new JLabel("0 Kv"); // VALOR DE TENS�O DA BARRA R6
        tap.setForeground(Color.white);
        tap.setBounds(345, 345, 60, 30);
        painel.add(tap);

        valortap = new JLabel(eqp1.getMostrarTapslvr1a()); // VALOR TAP LVR-1A
        valortap.setForeground(Color.white);
        valortap.setBounds(432, 340, 60, 30);
        painel.add(valortap);

        // ���������������������������������������� CRIA��O DO BOT�O 89 C2
        // ��������������������������������������

        b7 = new JButton(); // BOT�O CS 89 C2
        b7.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b7.addActionListener(this);
        b7.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b7.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b7.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b7.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b7.setForeground(Color.black);// cor do titulo do bot�o
        b7.setEnabled(true);
        b7.setToolTipText("Pressione para operar a Seccionadora 89 C2");
        b7.setMnemonic(KeyEvent.VK_B);
        b7.setActionCommand("89C2");// define o nome da acao
        b7.setBounds(180, 62, 33, 45);
        painel.add(b7);

        // ���������������������������������������� CRIA��O DO BOT�O 52 C2
        // ���������������������������������������

        b8 = new JButton(); // BOT�O DJ 52 MT-R
        b8.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b8.addActionListener(this);
        b8.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b8.setMnemonic(KeyEvent.VK_C);
        b8.setToolTipText("Pressione para operar o Disjuntor 52 C2");
        b8.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b8.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
        b8.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b8.setBounds(225, 145, 33, 42);
        painel.add(b8);

        // ��������������������������������������� CRIA��O DO BOT�O 89 C2-E
        // ���������������������������������������

        b9 = new JButton();
        b9.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg")); // Bot�o 89 C2-E
        b9.addActionListener(this);
        b9.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b9.setToolTipText("Pressione para operar a Seccionadora 89 C2-E");
        b9.setHorizontalTextPosition(AbstractButton.CENTER);
        b9.setVerticalTextPosition(AbstractButton.CENTER);
        b9.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b9.setBounds(263, 62, 33, 45);
        painel.add(b9);

        // ��������������������������������������� CRIA��O DO BOT�O BANCO C2
        // ��������������������������������������

        b10 = new JButton(); // GIF BANCO C2
        b10.setIcon(new javax.swing.ImageIcon("Capacitor.jpg"));
        b10.addActionListener(this);
        b10.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        // b10.setToolTipText("Pressione para comutar o Tap do Transformador MT-R");
        b10.setHorizontalTextPosition(AbstractButton.CENTER);
        b10.setVerticalTextPosition(AbstractButton.CENTER);
        b10.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b10.setBounds(213, 208, 48, 42);
        painel.add(b10);

        // ���������������������������������������� CRIA��O DO BOT�O 89 C1
        // ��������������������������������������

        b13 = new JButton(); // BOT�O CS 89 C1
        b13.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b13.addActionListener(this);
        b13.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b13.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b13.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b13.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b13.setForeground(Color.black);// cor do titulo do bot�o
        b13.setEnabled(true);
        b13.setToolTipText("Pressione para operar a Seccionadora 89 C1");
        b13.setMnemonic(KeyEvent.VK_B);
        b13.setActionCommand("89C1");// define o nome da acao
        b13.setBounds(30, 61, 33, 45);
        painel.add(b13);

        // ���������������������������������������� CRIA��O DO BOT�O 52 C1
        // ���������������������������������������

        b14 = new JButton(); // BOT�O DJ 52 C1
        b14.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b14.addActionListener(this);
        b14.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b14.setMnemonic(KeyEvent.VK_C);
        b14.setToolTipText("Pressione para operar o Disjuntor 52 C1");
        b14.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b14.setVerticalTextPosition(AbstractButton.CENTER);// posicao do texto
        b14.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b14.setBounds(75, 145, 33, 42);
        painel.add(b14);

        // ��������������������������������������� CRIA��O DO BOT�O 89 C1-E
        // ���������������������������������������

        b15 = new JButton();
        b15.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg")); // Bot�o 89 C1-E
        b15.addActionListener(this);
        b15.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b15.setToolTipText("Pressione para operar a Seccionadora 89 C1-E");
        b15.setHorizontalTextPosition(AbstractButton.CENTER);
        b15.setVerticalTextPosition(AbstractButton.CENTER);
        b15.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b15.setBounds(113, 61, 33, 45);
        painel.add(b15);

        // ��������������������������������������� CRIA��O DO BOT�O BANCO C1
        // ��������������������������������������

        b16 = new JButton(); // GIF BANCO C1
        b16.setIcon(new javax.swing.ImageIcon("Capacitor.jpg"));
        b16.addActionListener(this);
        b16.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b16.setToolTipText("Pressione para comutar o Tap do Transformador MT-2");
        b16.setHorizontalTextPosition(AbstractButton.CENTER);
        b16.setVerticalTextPosition(AbstractButton.CENTER);
        b16.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b16.setBounds(63, 208, 48, 42);
        painel.add(b16);

        // ����������������������������������� CRIA��O DO BOT�O 89 LVR1
        // �����������������������������������������������

        b19 = new JButton(); // BOT�O CS 89 LVR1
        b19.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b19.addActionListener(this);
        b19.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b19.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b19.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b19.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b19.setForeground(Color.black);// cor do titulo do bot�o
        b19.setEnabled(true);
        b19.setToolTipText("Pressione para operar a Seccionadora 89 LVR1");
        b19.setMnemonic(KeyEvent.VK_B);
        b19.setActionCommand("89LVR1");// define o nome da acao
        b19.setBounds(490, 62, 33, 45);
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
        b20.setBounds(575, 62, 33, 45);
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
        b21.setBounds(535, 145, 33, 42);
        painel.add(b21);

        // ����������������������������������� CRIA��O DO BOT�ES DE CONTROLE DO TRAFO
        // LVR-1 �����������������������

        b22 = new JButton("+"); // TAP LVR-1
        b22.setBounds(575, 250, 41, 15);
        b22.addActionListener(this);
        painel.add(b22);

        b23 = new JButton("-"); // TAP LVR-1
        b23.setBounds(575, 270, 41, 15);
        b23.addActionListener(this);
        painel.add(b23);

        tap1 = new JLabel("0 Kv"); // VALOR DE TENS�O DA BARRA R1
        tap1.setForeground(Color.white);
        tap1.setBounds(506, 285, 60, 30);
        painel.add(tap1);

        valortap1 = new JLabel(eqp1.getMostrarTapslvr1()); // VALOR TAP LVR-1
        valortap1.setForeground(Color.white);
        valortap1.setBounds(582, 280, 60, 30);
        painel.add(valortap1);

        // ����������������������������������� CRIA��O DO BOT�O 89 P1
        // �����������������������������������������������

        b24 = new JButton(); // BOT�O CS 89 P1
        b24.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b24.addActionListener(this);
        b24.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b24.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b24.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b24.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b24.setForeground(Color.black);// cor do titulo do bot�o
        b24.setEnabled(true);
        b24.setToolTipText("Pressione para operar a Seccionadora 89 P1");
        b24.setMnemonic(KeyEvent.VK_B);
        b24.setActionCommand("89L2A");// define o nome da acao
        b24.setBounds(699, 62, 33, 45);
        painel.add(b24);

        // ����������������������������������� CRIA��O DO BOT�O 89 P1-E
        // �����������������������������������������������

        b25 = new JButton(); // BOT�O CS 89 P1-E
        b25.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b25.addActionListener(this);
        b25.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b25.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b25.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b25.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b25.setForeground(Color.black);// cor do titulo do bot�o
        b25.setEnabled(true);
        b25.setToolTipText("Pressione para operar a Seccionadora 89 P1-E");
        b25.setMnemonic(KeyEvent.VK_B);
        b25.setActionCommand("89P1-E");// define o nome da acao
        b25.setBounds(784, 62, 33, 45);
        painel.add(b25);

        // ����������������������������������� CRIA��O DO BOT�O 52 P1
        // �����������������������������������������������

        b26 = new JButton(); // BOT�O 52 P1
        b26.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b26.addActionListener(this);
        b26.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b26.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b26.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b26.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b26.setForeground(Color.black);// cor do titulo do bot�o
        b26.setEnabled(true);
        b26.setToolTipText("Pressione para operar O Disjuntor 52 P1");
        b26.setMnemonic(KeyEvent.VK_B);
        b26.setActionCommand("52L2");// define o nome da acao
        b26.setBounds(745, 145, 33, 42);
        painel.add(b26);

        // ����������������������������������� CRIA��O DO BOT�O 89 P2
        // �����������������������������������������������

        b29 = new JButton(); // BOT�O CS 89 P2
        b29.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b29.addActionListener(this);
        b29.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b29.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b29.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b29.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b29.setForeground(Color.black);// cor do titulo do bot�o
        b29.setEnabled(true);
        b29.setToolTipText("Pressione para operar a Seccionadora 89 P2");
        b29.setMnemonic(KeyEvent.VK_B);
        b29.setActionCommand("89P2");// define o nome da acao
        b29.setBounds(849, 62, 33, 45);
        painel.add(b29);

        // ����������������������������������� CRIA��O DO BOT�O 89 P2-E
        // �����������������������������������������������

        b31 = new JButton(); // BOT�O CS 89 P2-E
        b31.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
        b31.addActionListener(this);
        b31.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b31.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b31.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b31.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b31.setForeground(Color.black);// cor do titulo do bot�o
        b31.setEnabled(true);
        b31.setToolTipText("Pressione para operar a Seccionadora 89 P2-E");
        b31.setMnemonic(KeyEvent.VK_B);
        b31.setActionCommand("89P2-E");// define o nome da acao
        b31.setBounds(934, 62, 33, 45);
        painel.add(b31);

        // ����������������������������������� CRIA��O DO BOT�O 52 P2
        // �����������������������������������������������

        b33 = new JButton(); // BOT�O 52 P2
        b33.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b33.addActionListener(this);
        b33.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b33.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b33.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b33.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b33.setForeground(Color.black);// cor do titulo do bot�o
        b33.setEnabled(true);
        b33.setToolTipText("Pressione para operar O Disjuntor 52 P2");
        b33.setMnemonic(KeyEvent.VK_B);
        b33.setActionCommand("52P2");// define o nome da acao
        b33.setBounds(892, 145, 33, 42);
        painel.add(b33);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO LVR-1
        // ������������������������������������������

        b35 = new JButton(); // BOT�O TRANSFORMADOR LVR-1
        b35.setIcon(new javax.swing.ImageIcon("LVR.jpg"));
        b35.addActionListener(this);
        b35.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        b35.setToolTipText("Pressione para comutar o Tap do Transformador LVR-1");
        b35.setHorizontalTextPosition(AbstractButton.CENTER);
        b35.setVerticalTextPosition(AbstractButton.CENTER);
        b35.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b35.setBounds(534, 250, 36, 40);
        painel.add(b35);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 6
        // ������������������������������������������

        b41 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b41.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b41.addActionListener(this);
        b41.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b41.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b41.setHorizontalTextPosition(AbstractButton.CENTER);
        b41.setVerticalTextPosition(AbstractButton.CENTER);
        b41.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b41.setBounds(359, 582, 76, 53);
        painel.add(b41);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 5
        // ������������������������������������������

        b42 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b42.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b42.addActionListener(this);
        b42.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b42.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b42.setHorizontalTextPosition(AbstractButton.CENTER);
        b42.setVerticalTextPosition(AbstractButton.CENTER);
        b42.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b42.setBounds(519, 582, 76, 53);
        painel.add(b42);

        // ����������������������������������� CRIA��O DO BOT�O 89 R5
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
        b43.setToolTipText("Pressione para operar a Seccionadora 89 R5");
        b43.setMnemonic(KeyEvent.VK_B);
        b43.setActionCommand("89R5");// define o nome da acao
        b43.setBounds(489, 402, 33, 45);
        painel.add(b43);

        // ����������������������������������� CRIA��O DO BOT�O 89 R5-E
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
        b44.setToolTipText("Pressione para operar a Seccionadora 89 R5-E");
        b44.setMnemonic(KeyEvent.VK_B);
        b44.setActionCommand("89R5-E");// define o nome da acao
        b44.setBounds(574, 402, 33, 45);
        painel.add(b44);

        // ����������������������������������� CRIA��O DO BOT�O 52 R5
        // �����������������������������������������������

        b45 = new JButton(); // BOT�O 52 R5
        b45.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b45.addActionListener(this);
        b45.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b45.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b45.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b45.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b45.setForeground(Color.black);// cor do titulo do bot�o
        b45.setEnabled(true);
        b45.setToolTipText("Pressione para operar O Disjuntor 52 R5");
        b45.setMnemonic(KeyEvent.VK_B);
        b45.setActionCommand("52R5");// define o nome da acao
        b45.setBounds(535, 487, 33, 42);
        painel.add(b45);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 4
        // ������������������������������������������

        b46 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b46.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b46.addActionListener(this);
        b46.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b46.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b46.setHorizontalTextPosition(AbstractButton.CENTER);
        b46.setVerticalTextPosition(AbstractButton.CENTER);
        b46.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b46.setBounds(669, 582, 76, 53);
        painel.add(b46);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 3
        // ������������������������������������������

        b47 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR
        b47.setIcon(new javax.swing.ImageIcon("RF.jpg"));
        b47.addActionListener(this);
        b47.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b47.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b47.setHorizontalTextPosition(AbstractButton.CENTER);
        b47.setVerticalTextPosition(AbstractButton.CENTER);
        b47.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b47.setBounds(819, 582, 76, 53);
        painel.add(b47);

        // ����������������������������������� CRIA��O DO BOT�O 89 R4
        // �����������������������������������������������

        b48 = new JButton(); // BOT�O CS 89 R4
        b48.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b48.addActionListener(this);
        b48.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b48.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b48.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b48.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b48.setForeground(Color.black);// cor do titulo do bot�o
        b48.setEnabled(true);
        b48.setToolTipText("Pressione para operar a Seccionadora 89 R4");
        b48.setMnemonic(KeyEvent.VK_B);
        b48.setActionCommand("89R4");// define o nome da acao
        b48.setBounds(639, 402, 33, 45);
        painel.add(b48);

        // ����������������������������������� CRIA��O DO BOT�O 89 R4-E
        // �����������������������������������������������

        b49 = new JButton(); // BOT�O CS 89 R4-E
        b49.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b49.addActionListener(this);
        b49.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b49.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b49.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b49.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b49.setForeground(Color.black);// cor do titulo do bot�o
        b49.setEnabled(true);
        b49.setToolTipText("Pressione para operar a Seccionadora 89 R4-E");
        b49.setMnemonic(KeyEvent.VK_B);
        b49.setActionCommand("89R4E");// define o nome da acao
        b49.setBounds(724, 402, 33, 45);
        painel.add(b49);

        // ����������������������������������� CRIA��O DO BOT�O 52 R4
        // �����������������������������������������������

        b50 = new JButton(); // BOT�O 52 R5
        b50.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b50.addActionListener(this);
        b50.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b50.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b50.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b50.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b50.setForeground(Color.black);// cor do titulo do bot�o
        b50.setEnabled(true);
        b50.setToolTipText("Pressione para operar O Disjuntor 52 R4");
        b50.setMnemonic(KeyEvent.VK_B);
        b50.setActionCommand("52R4");// define o nome da acao
        b50.setBounds(685, 488, 33, 42);
        painel.add(b50);

        // ����������������������������������� CRIA��O DO BOT�O 89 R3
        // �����������������������������������������������

        b51 = new JButton(); // BOT�O CS 89 R3
        b51.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b51.addActionListener(this);
        b51.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b51.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b51.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b51.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b51.setForeground(Color.black);// cor do titulo do bot�o
        b51.setEnabled(true);
        b51.setToolTipText("Pressione para operar a Seccionadora 89 R3");
        b51.setMnemonic(KeyEvent.VK_B);
        b51.setActionCommand("89R4");// define o nome da acao
        b51.setBounds(789, 402, 33, 45);
        painel.add(b51);

        // ����������������������������������� CRIA��O DO BOT�O 89 R3-E
        // �����������������������������������������������

        b52 = new JButton(); // BOT�O CS 89 R3-E
        b52.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
        b52.addActionListener(this);
        b52.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b52.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b52.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b52.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b52.setForeground(Color.black);// cor do titulo do bot�o
        b52.setEnabled(true);
        b52.setToolTipText("Pressione para operar a Seccionadora 89 R3-E");
        b52.setMnemonic(KeyEvent.VK_B);
        b52.setActionCommand("89R3");// define o nome da acao
        b52.setBounds(874, 402, 33, 45);
        painel.add(b52);

        // ����������������������������������� CRIA��O DO BOT�O 52 R3
        // �����������������������������������������������

        b53 = new JButton(); // BOT�O 52 R3
        b53.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b53.addActionListener(this);
        b53.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b53.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b53.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b53.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
        b53.setForeground(Color.black);// cor do titulo do bot�o
        b53.setEnabled(true);
        b53.setToolTipText("Pressione para operar O Disjuntor 52 R3");
        b53.setMnemonic(KeyEvent.VK_B);
        b53.setActionCommand("52R3");// define o nome da acao
        b53.setBounds(835, 488, 33, 42);
        painel.add(b53);

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
        b55.setBounds(645, 62, 33, 45);
        painel.add(b55);

        // ����������������������������������� CRIA��O DO BOT�O TRAFO TA-1
        // ������������������������������������������

        b54 = new JButton(); // BOT�O TRANSFORMADOR TA-1
        b54.setIcon(new javax.swing.ImageIcon("TA1.jpg"));
        b54.addActionListener(this);
        b54.setBackground(new Color(0, 128, 128));// cor de fundo do bot�o
        // b54.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
        b54.setHorizontalTextPosition(AbstractButton.CENTER);
        b54.setVerticalTextPosition(AbstractButton.CENTER);
        b54.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b54.setBounds(627, 148, 55, 46);
        painel.add(b54);

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
        b40.setToolTipText("Pressione para acessar a Tela dos RF'S 1 e 2");
        b40.setHorizontalTextPosition(AbstractButton.CENTER);
        b40.setVerticalTextPosition(AbstractButton.CENTER);
        b40.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b40.setBounds(950, 436, 30, 30);
        painel.add(b40);

        c.add(painel, java.awt.BorderLayout.CENTER);

        atualizaConfiguracao();
    }

    // -�����������������������������������������������������������������������������������������������������
    public void actionPerformed(ActionEvent e) // metodo implementado pelo ActionListener
    {
        if (e.getSource() == b1)// ���������������������� A��O DO BOT�O DA CS 89 RF-6 �����������������������
        {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-6?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r6().equals("Seccionadora Aberta")) {
                    b1.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89r6();

                    tagequipamento = "89 R6";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay LVR-1A";
                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1aFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mt1a();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-1A foi Fechada com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    seccionadora89r6fechada = "Seccionadora 89R6 Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                }

                else if (eqp1.seccionadora89r6().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r6().equals("Disjuntor Aberto")) {
                    b1.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89r6();

                    tagequipamento = "89 R6";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay LVR-1A";
                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1aAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura89mt1a();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-1A foi Aberta com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    seccionadora89r6fechada = "Seccionadora 89R6 Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 RF-6 FECHADO! \n",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 RF-6 " + eqp1.seccionadora89r6());
        }

        // ���������������������������������������� A��O DO BOT�O DO DJ 52 RF-6
        // ��������������������������������������
        if (e.getSource() == b2) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 RF-6?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r6().equals("Disjuntor Aberto")) {
                    eqp1.fecharDisjuntor52r6();
                    b2.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    valortap.setText(eqp1.getMostrarTapslvr1a());

                    tagequipamento = "52 R6";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay LVR-1A";
                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento52mt1();

                    disjuntor52r6fechado = "Disjuntor 52R6 Fechado";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else if (eqp1.disjuntor52r6().equals("Disjuntor Fechado")) {
                    b2.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r6();
                    tap.setText("0 kV");

                    tagequipamento = "52 R6";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay LVR-1A";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura52mt1();

                    disjuntor52r6aberto = "Disjuntor 52R6 Aberto";
                    DesenAlbras = "DesenergizarAlbras";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                    // if (eqp.seccionadora89mt1a().equals("Seccionadora Aberta") &&
                    // eqp.seccionadora89mt1b().equals("Seccionadora Aberta") &&
                    // eqp.disjuntor52bt().equals("Disjuntor Aberto"))
                    // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-1 foi aberto
                    // #TRANSFORMADOR
                    // DESENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Lógica de Intertravamento nao Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                            "Lógica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            if (eqp1.disjuntor52r6().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r6().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r6().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r6e().equals("Seccionadora Aberta")) {
                status1.setText(" O RETIFICADOR RF-6 ESTA DESENERGIZADO");
            }
        }

        // ���������������������������������������� A��O DO BOT�O DA CS 89 RF-6E
        // ��������������������������������������
        if (e.getSource() == b3) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 R6-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r6e().equals("Seccionadora Aberta")) {
                    b3.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89r6e();

                    tagequipamento = "89 R6E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay LVR-1A";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDE.incluir89mt1bfechada(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1bFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mt1b();

                    seccionadora89r6efechada = "Seccionadora 89R6E Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT1-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else if (eqp1.seccionadora89r6e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r6().equals("Disjuntor Aberto")) {
                    b3.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89r6e();

                    tagequipamento = "89 R6E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay LVR-1A";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDE.incluir89mt1baberta(usuario, data);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt1bAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mt1b();

                    seccionadora89r6efechada = "Seccionadora 89R6E Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 MT1-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 RF-6 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R6-E " + eqp1.seccionadora89r6e());
        }

        // ������������������������������� A��O DOS BOT�ES DE COMUTA��O DE TAP'S DO
        // LVR-1A ����������������������������
        if (e.getSource() == b4) {
            status1.setText(" O Transformador LVR-1A esta no Tap:" + eqp1.getMostrarTapslvr1a());
            JOptionPane.showMessageDialog(null, "  O Transformador LVR-1A esta no:  " + eqp1.getMostrarTapslvr1a(),
                    "Disjuntor", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
        }
        if (e.getSource() == b5) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja Subir o Tap do Transformador LVR-1A?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.getTapslvr1a() == 8)
                    JOptionPane.showMessageDialog(null, "O Transformador LVR-1A esta no Tap Maximo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp1.aumentarTaplvr1a();
                status1.setText(" O Transformador LVR-1A est� no:  " + eqp1.getMostrarTapslvr1a());
                valortap.setText(eqp1.getMostrarTapslvr1a());

                if (eqp1.seccionadora89r6().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r6().equals("Disjuntor Fechado")
                        || eqp1.seccionadora89r6e().equals("Seccionadora Fechada")
                                && eqp1.disjuntor52r6().equals("Disjuntor Fechado")) {
                    tap.setText(eqp1.getValorTaplvr1a());
                }

                tagequipamento = "TAP LVR-1A";
                operacao = "Tap Elevado";
                manobra = "Bay LVR-1";

                // BDE.ConectarBD();
                // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
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
                if (eqp1.getTapslvr1a() == 0)
                    JOptionPane.showMessageDialog(null, "O Transformador LVR-1A esta no Tap M�nimo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp1.diminuirTaplvr1a();
                status1.setText(" O Transformador LVR-1A esta no:  " + eqp1.getMostrarTapslvr1a());
                valortap.setText(eqp1.getMostrarTapslvr1a());
                if (eqp1.seccionadora89r6().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r6().equals("Disjuntor Fechado")
                        || eqp1.seccionadora89r6e().equals("Seccionadora Fechada")
                                && eqp1.disjuntor52r6().equals("Disjuntor Fechado")) {
                    tap.setText(eqp1.getValorTaplvr1a());
                }

                tagequipamento = "TAP LVR-1A";
                operacao = "Tap Reduzido";
                manobra = "Bay LVR-1";

                // BDE.ConectarBD();
                // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                // BDEQ.ConectarBD();
                // BDEQ.QuantDiminuirTapmt1();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                        "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
            }
        }

        if (e.getSource() == b7)// ���������������������� A��O DO BOT�O DA CS 89 C2
                                // ��������������������������������
        {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 C2?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89c2().equals("Seccionadora Aberta")) {
                    b7.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89c2();

                    tagequipamento = "89 C2";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay C2";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mtraFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mtra();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-RA foi Fechada com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    seccionadora89c2fechada = "Seccionadora 89C2 Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                }

                else if (eqp1.seccionadora89c2().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52c2().equals("Disjuntor Aberto")) {
                    b7.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89c2();

                    tagequipamento = "89 C2";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay C2";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mtraAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura89mtra();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-RA foi Aberta com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    seccionadora89c2aberta = "Seccionadora 89C2 Aberta";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 C2 FECHADO! \n",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 C2 " + eqp1.seccionadora89c2());
        }

        // ���������������������������������������� A��O DO BOT�O DO DJ 52 C2
        // ��������������������������������������
        if (e.getSource() == b8) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 C2?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52c2().equals("Disjuntor Aberto")) {
                    eqp1.fecharDisjuntor52c2();
                    b8.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));

                    tagequipamento = "52 C2";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay C2";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento52mtr();

                    disjuntor52c2fechado = "Disjuntor 52C2 Fechado";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                } else if (eqp1.disjuntor52c2().equals("Disjuntor Fechado")) {
                    b8.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52c2();

                    tagequipamento = "52 C2";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay C2";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura52mtr();

                    // if (eqp.seccionadora89mtra().equals("Seccionadora Aberta") &&
                    // eqp.seccionadora89mtrb().equals("Seccionadora Aberta") &&
                    // eqp.disjuntor52bt().equals("Disjuntor Aberto"))
                    // JOptionPane.showMessageDialog(null,"O Disjuntor 52 MT-R foi aberto
                    // #TRANSFORMADOR
                    // DESENERGIZADO!#","Disjuntor",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    disjuntor52c2aberto = "Disjuntor 52C2 Aberto";
                    DesenAlbras = "DesenergizarAlbras";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Lgica de Intertravamento nao Satisfeita! \n BARRAS DESENERGIZADAS! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            if (eqp1.disjuntor52c2().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89c2().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52c2().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89c2e().equals("Seccionadora Aberta")) {
                status1.setText(" O BANCO C2 ESTA DESENERGIZADO");
            }
        }

        // ���������������������������������������� A��O DO BOT�O DA CS 89 C-2E
        // ��������������������������������������
        if (e.getSource() == b9) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 C2-E ?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89c2e().equals("Seccionadora Aberta")) {
                    b9.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89c2e();

                    tagequipamento = "89 C2E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay C2";

                    seccionadora89c2efechada = "Seccionadora 89C2E Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.operaçao89mtrbFechada(data);
                    // BDEQ.QuantFechamento89mtrb();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MTR-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else if (eqp1.seccionadora89c2e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52c2().equals("Disjuntor Aberto")) {
                    b9.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89c2e();

                    tagequipamento = "89 C2E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay C2";

                    seccionadora89c2eaberta = "Seccionadora 89C2E Aberta";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mtrbAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89mtrb();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MTR-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 C2 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 C2-E " + eqp1.seccionadora89c2e());
        }

        // �������������������������������������� A��O DO BOT�O DA CS 89 C1
        // ��������������������������������������
        if (e.getSource() == b13) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 C1?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89c1().equals("Seccionadora Aberta")) {
                    b13.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89c1();

                    tagequipamento = "89 C1";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay C1";

                    seccionadora89c1fechada = "Seccionadora 89C1 Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt2aFechada(data);
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-2A foi Fechada com
                    // Sucesso!",
                    // "Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                }

                else if (eqp1.seccionadora89c1().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52c1().equals("Disjuntor Aberto")) {
                    b13.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89c1();

                    tagequipamento = "89 C1";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay C1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt2aAberta(data);

                    seccionadora89c1aberta = "Seccionadora 89C1 Aberta";
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT-2A foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 C1 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 C1 " + eqp1.seccionadora89c1());
        }

        // ������������������������������������ AÇÃO DO BOTAO DO DISJUNTOR 52 C1
        // ����������������������������������
        if (e.getSource() == b14) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 C1?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52c1().equals("Disjuntor Aberto")) {
                    b14.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52c1();

                    tagequipamento = "52 C1";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay C1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    disjuntor52c1fechado = "Disjuntor 52C1 Fechado";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                } else if (eqp1.disjuntor52c1().equals("Disjuntor Fechado")) {
                    b14.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52c1();

                    tagequipamento = "52 C1";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay C1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    disjuntor52c1aberto = "Disjuntor 52C1 Aberto";
                    DesenAlbras = "DesenergizarAlbras";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                    // if (eqp.seccionadora89mt2a().equals("Seccionadora Aberta") &&
                    // eqp.seccionadora89mt2b().equals("Seccionadora Aberta") &&
                    // eqp.disjuntor52bt().equals("Disjuntor Aberto"))
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
            if (eqp1.disjuntor52c1().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89c1().equals("Seccionadora Aberta")
                    && eqp1.disjuntor52c1().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89c1e().equals("Seccionadora Aberta")) {
                status1.setText(" O BANCO C1 ESTA DESENERGIZADO");
            }
        }

        // ��������������������������������������� A��O DO BOT�O DA CS 89 C1-E
        // �������������������������������������
        if (e.getSource() == b15) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 C1-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89c1e().equals("Seccionadora Aberta")) {
                    b15.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89c1e();

                    tagequipamento = "89 C1E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay C1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt2bFechada(data);

                    seccionadora89c1efechada = "Seccionadora 89C1E Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT2-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                } else if (eqp1.seccionadora89c1e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52c1().equals("Disjuntor Aberto")) {
                    b15.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89c1e();

                    tagequipamento = "89 C1E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay C1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89mt2bAberta(data);

                    seccionadora89c1eaberta = "Seccionadora 89C1E Aberta";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 MT2-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 C1 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 C1-E " + eqp1.seccionadora89c1e());
        }

        // #################################################### BOT�O DE AC�O DA CS 89
        // LVR-1 ##########################################################

        if (e.getSource() == b19) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 LVR-1?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89lvr1().equals("Seccionadora Aberta")) {
                    b19.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89lvr1();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-A foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 LVR-1";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay LVR-1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89lvr1fechada = "Seccionadora 89LVR1 Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                }

                else if (eqp1.seccionadora89lvr1().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvr1().equals("Disjuntor Aberto")) {
                    b19.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89lvr1();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-A foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 LVR-1";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay LVR-1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89lvr1aberta = "Seccionadora 89LVR1 Aberta";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 L1 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 LVR-1 " + eqp1.seccionadora89lvr1());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // LVR-1E #########################################################
        if (e.getSource() == b20) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 LVR-1E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89lvr1e().equals("Seccionadora Aberta")) {
                    b20.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89lvr1e();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 LVR-1E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay LVR-1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89lvr1efechada = "Seccionadora 89LVR1E Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                } else if (eqp1.seccionadora89lvr1e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvr1().equals("Disjuntor Aberto")) {
                    b20.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89lvr1e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));;

                    tagequipamento = "89 LVR-1E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay LVR-1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89lvr1eaberta = "Seccionadora 89LVR1E Aberta";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 LVR-1 FECHADO! \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 LVR-1E " + eqp1.seccionadora89lvr1e());
        }

        // ################################################# AC�O DO BOT�O DO 52 LVR-1
        // ##############################################################
        if (e.getSource() == b21) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 LLVR-1?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52lvr1().equals("Disjuntor Aberto")) {
                    b21.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52lvr1();
                    // valortap1.setText (eqp1.getMostrarTapslvr1());

                    tagequipamento = "52 LVR-1";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay LVR-1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    disjuntor52lvr1fechado = "Disjuntor 52LVR1 Fechado";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                }

                else if (eqp1.disjuntor52lvr1().equals("Disjuntor Fechado")) {
                    b21.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52lvr1();
                    tap1.setText("0 kV");

                    tagequipamento = "52 LVR-1";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay LVR-1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    disjuntor52lvr1aberto = "Disjuntor 52LVR1 Aberto";
                    DesenAlbras = "DesenergizarAlbras";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                }
            }
            if (eqp1.disjuntor52lvr1().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89lvr1().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52lvr1().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89lvr1e().equals("Seccionadora Aberta")) {
                status1.setText("O TRANSFORMADOR ESTA DESENERGIZADO! ");
            }
        }

        // ������������������������������� A��O DOS BOT�ES DE COMUTA��O DE TAP'S DO
        // LVR-1 ����������������������������
        if (e.getSource() == b35) {
            status1.setText(" O Transformador LVR-1 esta no Tap:" + eqp1.getMostrarTapslvr1());
            JOptionPane.showMessageDialog(null, "  O Transformador LVR-1 esta no:  " + eqp1.getMostrarTapslvr1(),
                    "Disjuntor", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
        }
        if (e.getSource() == b22) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja Subir o Tap do Transformador LVR-1?",
                    "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.getTapslvr1() == 33)
                    JOptionPane.showMessageDialog(null, "O Transformador LVR-1 esta no Tap M�ximo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp1.aumentarTaplvr1();
                status1.setText(" O Transformador LVR-1 esta no:  " + eqp1.getMostrarTapslvr1());
                valortap1.setText(eqp1.getMostrarTapslvr1());

                if (eqp1.seccionadora89lvr1().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvr1().equals("Disjuntor Fechado")
                        || eqp1.seccionadora89lvr1e().equals("Seccionadora Fechada")
                                && eqp1.disjuntor52lvr1().equals("Disjuntor Fechado")) {
                    tap1.setText(eqp1.getValorTaplvr1());
                }

                tagequipamento = "Tap LVR-1";
                operacao = "Tap Elevado";
                manobra = "Bay LVR-1";

                // BDE.ConectarBD();
                // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
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
                if (eqp1.getTapslvr1() == 0)
                    JOptionPane.showMessageDialog(null, "O Transformador LVR-1 esta no Tap Minimo!", "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                eqp1.diminuirTaplvr1();
                status1.setText(" O Transformador LVR-1 esta no:  " + eqp1.getMostrarTapslvr1());
                valortap1.setText(eqp1.getMostrarTapslvr1());
                if (eqp1.seccionadora89lvr1().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52lvr1().equals("Disjuntor Fechado")
                        || eqp1.seccionadora89lvr1e().equals("Seccionadora Fechada")
                                && eqp1.disjuntor52lvr1().equals("Disjuntor Fechado")) {
                    tap1.setText(eqp1.getValorTaplvr1());
                }

                tagequipamento = "Tap LVR-1";
                operacao = "Tap Reduzido";
                manobra = "Bay LVR-1";

                // BDE.ConectarBD();
                // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                // BDEQ.ConectarBD();
                // BDEQ.QuantDiminuirTaplvr1();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                        "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
            }
        }
        // #################################################### BOT�O DE AC�O DA CS 89P1
        // ##########################################################

        if (e.getSource() == b24) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 P1?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89p1().equals("Seccionadora Aberta")) {
                    b24.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89p1();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-A foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 P1";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay P1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    seccionadora89p1fechada = "Seccionadora 89P1 Fechada";
                    manobrainteligente1.PrepAlbras();
                    // manobrainteligente1.EnerAlbras();
                    // manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                }

                else if (eqp1.seccionadora89p1().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52p1().equals("Disjuntor Aberto")) {
                    b24.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89p1();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-A foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 P1";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay P1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89p1aberta = "Seccionadora 89P1 Aberta";
                    manobrainteligente1.PrepAlbras();
                    // manobrainteligente1.EnerAlbras();
                    // manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 P1 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 P1 " + eqp1.seccionadora89p1());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // P1E #########################################################
        if (e.getSource() == b25) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 P1-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89p1e().equals("Seccionadora Aberta")) {
                    b25.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89p1e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-B foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 P1E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay P1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    seccionadora89p1efechada = "Seccionadora 89P1E Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    // manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else if (eqp1.seccionadora89p1e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52p1().equals("Disjuntor Aberto")) {
                    b25.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89p1e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-B foi Aberta
                    // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 P1E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay P1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    seccionadora89p1eaberta = "Seccionadora 89P1E Aberta";
                    manobrainteligente1.PrepAlbras();
                    // manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 P1-E FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 P1-E " + eqp1.seccionadora89p1e());
        }

        // ################################################# AC�O DO BOT�O DO 52 P1
        // ##############################################################
        if (e.getSource() == b26) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 P1?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52p1().equals("Disjuntor Aberto")) {
                    b26.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52p1();

                    tagequipamento = "52 P1";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay P1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    disjuntor52p1fechado = "Disjuntor 52P1 Fechado";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    // manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else if (eqp1.disjuntor52p1().equals("Disjuntor Fechado")) {
                    b26.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52p1();

                    tagequipamento = "52 P1";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay P1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    disjuntor52p1aberto = "Disjuntor 52P1 Aberto";
                    // manobrainteligente1.PrepAlbras();
                    // manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                } else {
                    JOptionPane.showMessageDialog(null, "LOGICA DE INTERTRAVAMENTO NAO SATISFEITA! ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            if (eqp1.disjuntor52p1().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89p1().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52p1().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89p1e().equals("Seccionadora Aberta")) {
                status1.setText("A PLANTA ESTA DESENERGIZADA! ");
            }
        }

        // ����������������������������������������� A��O DO BOT�O DA CS 89 P2
        // ��������������������������������������
        if (e.getSource() == b29) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 P2?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89p2().equals("Seccionadora Aberta")) {
                    b29.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89p2();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2 foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 P2";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay P2";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89p2fechada = "Seccionadora 89P2 Fechada";
                    manobrainteligente1.PrepAlbras();
                    // manobrainteligente1.EnerAlbras();
                    // manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else if (eqp1.seccionadora89p2().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52p2().equals("Disjuntor Aberto")) {
                    b29.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89p2();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2 foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));;

                    tagequipamento = "89 P2";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay P2";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89p2aberta = "Seccionadora 89P2 Aberta";
                    manobrainteligente1.PrepAlbras();
                    // manobrainteligente1.EnerAlbras();
                    // manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 P2 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" CS 89 P2 " + eqp1.seccionadora89p2());
        }

        // ������������������������������������ A��O DO BOT�O DA SECCIONADORA 89 P2-E
        // �������������������������������
        if (e.getSource() == b31) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 P2-E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89p2e().equals("Seccionadora Aberta")) {
                    b31.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89p2e();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BT-A foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 P2E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay P2";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    // manobrainteligente1.passo=17;

                    seccionadora89p2efechada = "Seccionadora 89P2E Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    // manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                }

                else if (eqp1.seccionadora89p2e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52p2().equals("Disjuntor Aberto")) {
                    b31.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89p2e();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BT-A foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 P2E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay P2";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89p2eaberta = "Seccionadora 89P2E Aberta";
                    manobrainteligente1.PrepAlbras();
                    // manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 P2 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 P2-E " + eqp1.seccionadora89p2e());
        }

        // ################################################# AC�O DO BOT�O DO 52 P2
        // ##############################################################
        if (e.getSource() == b33) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 P2?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52p2().equals("Disjuntor Aberto")) {
                    b33.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52p2();

                    tagequipamento = "52 P2";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay P2";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    disjuntor52p2fechado = "Disjuntor 52P2 Fechado";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    // manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else if (eqp1.disjuntor52p2().equals("Disjuntor Fechado")) {
                    b33.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52p2();

                    tagequipamento = "52 P2";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay P2";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    disjuntor52p2aberto = "Disjuntor 52P2 Aberto";
                    // manobrainteligente1.PrepAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                }
            }
            if (eqp1.disjuntor52p2().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89p2().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52p2().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89p2e().equals("Seccionadora Aberta")) {
                status1.setText("A PLANTA ESTA DESENERGIZADA! ");
            }
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-5 #########################################################
        if (e.getSource() == b43) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-5?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r5().equals("Seccionadora Aberta")) {
                    b43.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r5();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 RF-5";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay RF-5";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89r5fechada = "Seccionadora 89R5 Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else if (eqp1.seccionadora89r5().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r5().equals("Disjuntor Aberto")) {
                    b43.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r5();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 RF-5";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay RF-5";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89r5aberta = "Seccionadora 89R5 Aberta";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R5 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R5 " + eqp1.seccionadora89r5());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-5E #########################################################
        if (e.getSource() == b44) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-5E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r5e().equals("Seccionadora Aberta")) {
                    b44.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r5e();
                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 RF-5E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay RF-5";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89r5efechada = "Seccionadora 89R5E Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else if (eqp1.seccionadora89r5e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r5().equals("Disjuntor Aberto")) {
                    b44.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r5e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 RF-5E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay RF-5";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89r5efechada = "Seccionadora 89R5E Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R5 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R5E " + eqp1.seccionadora89r5e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R5
        // ##############################################################
        if (e.getSource() == b45) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R5?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r5().equals("Disjuntor Aberto")) {
                    b45.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r5();

                    tagequipamento = "52 R5";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay RF-5";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    disjuntor52r5fechado = "disjuntor 52R5 Fechado";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else if (eqp1.disjuntor52r5().equals("Disjuntor Fechado")) {
                    b45.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r5();

                    tagequipamento = "52 R5";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay RF-5";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    disjuntor52r5aberto = "disjuntor 52R5 Aberto";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                }
            }
            if (eqp1.disjuntor52r5().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r5().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r5().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r5e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-4 #########################################################
        if (e.getSource() == b48) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-4?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r4().equals("Seccionadora Aberta")) {
                    b48.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 RF-4";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay RF-4";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89r4fechada = "seccionadora 89R4 Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else if (eqp1.seccionadora89r4().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r4().equals("Disjuntor Aberto")) {
                    b48.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r4();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 RF-4";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay RF-4";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89r4aberta = "seccionadora 89R4 Aberta";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R4 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R4 " + eqp1.seccionadora89r4());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-4E #########################################################
        if (e.getSource() == b49) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voc� realmente deseja alterar o estado da Seccionadora 89 RF-4E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r4e().equals("Seccionadora Aberta")) {
                    b49.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r4e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 RF-4E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay RF-4";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    seccionadora89r4efechada = "seccionadora 89R4E Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else if (eqp1.seccionadora89r4e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r4().equals("Disjuntor Aberto")) {
                    b49.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r4e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 RF-4E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay RF-4";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    seccionadora89r4eaberta = "seccionadora 89R4e Aberta";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R4 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R4E " + eqp1.seccionadora89r4e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R4
        // ##############################################################
        if (e.getSource() == b50) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R4?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r4().equals("Disjuntor Aberto")) {
                    b50.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r4();

                    tagequipamento = "52 R4";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay RF-4";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    disjuntor52r4fechado = "disjuntor 52R4 Fechado";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else if (eqp1.disjuntor52r4().equals("Disjuntor Fechado")) {
                    b50.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r4();

                    tagequipamento = "52 R4";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay RF-4";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    disjuntor52r4aberto = "disjuntor 52R4 Aberto";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                }
            }
            if (eqp1.disjuntor52r4().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r4().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r4().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r4e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-3 #########################################################
        if (e.getSource() == b51) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-3?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r3().equals("Seccionadora Aberta")) {
                    b51.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 RF-3";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay RF-3";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    seccionadora89r3fechada = "seccionadora 89R3 Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else if (eqp1.seccionadora89r3().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r3().equals("Disjuntor Aberto")) {
                    b51.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r3();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 RF-3";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay RF-3";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    seccionadora89r3aberta = "seccionadora 89R3 Aberta";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R3 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R3 " + eqp1.seccionadora89r3());
        }

        // ####################################################### AC�O DO BOT�O DA 89
        // RF-3E #########################################################
        if (e.getSource() == b52) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 RF-3E?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89r3e().equals("Seccionadora Aberta")) {
                    b52.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                    eqp1.fecharSeccionadora89r3e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 RF-3E";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay RF-3";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    seccionadora89r3efechada = "seccionadora 89R3E Fechada";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else if (eqp1.seccionadora89r3e().equals("Seccionadora Fechada")
                        && eqp1.disjuntor52r3().equals("Disjuntor Aberto")) {
                    b52.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                    eqp1.abrirSeccionadora89r3e();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 RF-3E";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay RF-3";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    seccionadora89r3eaberta = "seccionadora 89R3E Aberta";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R3 FECHADO \n ",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            status1.setText(" 89 R3E " + eqp1.seccionadora89r3e());
        }

        // ################################################# AC�O DO BOT�O DO 52 R3
        // ##############################################################
        if (e.getSource() == b53) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado do Disjuntor 52 R3?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.disjuntor52r3().equals("Disjuntor Aberto")) {
                    b53.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    eqp1.fecharDisjuntor52r3();

                    tagequipamento = "52 R3";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay RF-3";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                    disjuntor52r3fechado = "disjuntor 52R3 Fechado";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();

                } else if (eqp1.disjuntor52r3().equals("Disjuntor Fechado"))

                {
                    b53.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp1.abrirDisjuntor52r3();

                    tagequipamento = "52 R3";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay RF-3";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);

                    disjuntor52r3aberto = "disjuntor 52R3 Aberto";
                    manobrainteligente1.PrepAlbras();
                    manobrainteligente1.EnerAlbras();
                    manobrainteligente1.DesenAlbras();
                    manobrainteligente1.TransfMT1MTR();
                    manobrainteligente1.TransfMTRMT1();
                    manobrainteligente1.DeslProgRed1();
                    manobrainteligente1.NormRed1();
                    manobrainteligente1.EnerGerador();
                    manobrainteligente1.EnergBarraEM();
                    manobrainteligente1.DesenBarraEM();
                }
            }
            if (eqp1.disjuntor52r3().equals("Disjuntor Fechado")
                    && eqp1.seccionadora89r3().equals("Seccionadora Aberta")
                    || eqp1.disjuntor52r3().equals("Disjuntor Fechado")
                            && eqp1.seccionadora89r3e().equals("Seccionadora Aberta")) {
                status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
            }
        }

        // ################################################# AC�O DO BOT�O DA
        // SECCIONADORA 89 TA1
        // ##############################################################
        if (e.getSource() == b55) {
            Object[] options = { "Sim", "Nao", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Voce realmente deseja alterar o estado da Seccionadora 89 TA1?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp1.seccionadora89ta1().equals("Seccionadora Aberta")) {
                    b55.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                    eqp1.fecharSeccionadora89ta1();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 TA1";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay TA1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                } else if (eqp1.seccionadora89ta1().equals("Seccionadora Fechada")) {
                    b55.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                    eqp1.abrirSeccionadora89ta1();

                    // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Aberta com
                    // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                    // javax.swing.ImageIcon("formiga.gif")));

                    tagequipamento = "89 TA1";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay TA1";

                    // BDE.ConectarBD();
                    // BDE.cadastraEventos1(tagequipamento, usuario, data, operacao, manobra);
                }
            }
            status1.setText(" 89 TA1 " + eqp1.seccionadora89ta1());
        }
        // ####################################################### AC�O DO BOT�O SAIR

        if (e.getSource() == b34) // ----------- BOT�O SAIR ----------------//
        {
            new InterfaceMenu().setVisible(true);
            setVisible(false);
        }

        if (e.getSource() == b40) {
            InterfaceMT11 mt1 = new InterfaceMT11();
            mt1.setVisible(true);
        }
    }

    public void atualizaConfiguracao() {
        eqp1.fecharSeccionadora89r6();
        eqp1.fecharDisjuntor52r6();
        eqp1.fecharSeccionadora89c2();
        eqp1.fecharDisjuntor52c2();
        eqp1.fecharSeccionadora89c1();
        eqp1.fecharDisjuntor52c1();
        eqp1.fecharSeccionadora89lvr1();
        eqp1.fecharDisjuntor52lvr1();
        eqp1.fecharSeccionadora89p1();
        eqp1.fecharDisjuntor52p1();
        eqp1.fecharSeccionadora89p2();
        eqp1.fecharDisjuntor52p2();
        eqp1.fecharSeccionadora89r5();
        eqp1.fecharDisjuntor52r5();
        eqp1.fecharSeccionadora89r4();
        eqp1.fecharDisjuntor52r4();
        eqp1.fecharSeccionadora89r3();
        eqp1.fecharDisjuntor52r3();
        eqp1.fecharSeccionadora89ta1();
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
        b43.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
        b45.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b48.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
        b50.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b51.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
        b53.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        b55.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
    }

    // ######################################### CLASSE INTERFACE MT11
    // #####################################
    public class InterfaceMT11 extends JFrame implements ActionListener {
        JLabel tap, valortap, tensao, trafo, barra1, barra2, tap1, tap2, valortap1, valortap2, trafo1, trafo2, subir,
                descer, Alarmes;
        JLabel l1a, l1b, l2a, l2b, l189, l289, bta, btb, lvr152, a152, a252, p152, p252, tfa2, tfa1, tftu, g152, g252,
                g1, g2, rf152, rf252, gif1, ta1;
        JLabel status, status1, status2, mt1, mtr, mt2, c1, c2, lvr1, rf6, rf5, rf3, rf4, pla1, pla2, rf5e, rf4e, rf3e;
        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22,
                b23, b24, b25;
        JButton b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46,
                b47, b48;
        JButton b49, b50, b51, b52, b53, b54, b55, b56, b57, b58, b59, b60, b61;

        ImageIcon icone = new ImageIcon("");
        JPanel painel;

        public InterfaceMT11() {
            Container c = getContentPane();

            c.setLayout(new BorderLayout()); // gerenciador de layout
            setResizable(false);

            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();
            setTitle("Barramento de 34.5 kV MT-1");
            setSize(1100, 810);
            setLocationRelativeTo(null);
            setResizable(false);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            c.setBackground(new Color(180, 180, 180));
            // setLocation(300, 70);

            JLabel l1 = new JLabel();
            l1.setFont(new Font("Arial", 1, 30));
            l1.setText("MT-1 Barramento de 34,5 kV");
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

            c.add(p1, java.awt.BorderLayout.NORTH);

            // ���������������������������������������������� BARRAS A E B
            // ���������������������������������������������
            JPanel v = new JPanel(); // Barra T1
            v.setBounds(390, 5, 600, 3);
            v.setBackground(Color.orange);
            painel.add(v);

            JPanel v1 = new JPanel(); // Barra EM
            v1.setBounds(390, 30, 600, 3);
            v1.setBackground(Color.orange);
            painel.add(v1);

            barra1 = new JLabel("Barra T1"); // IDENTIFICA��O DA BARRA A
            barra1.setForeground(Color.white);
            barra1.setBounds(390, 0, 60, 30);
            painel.add(barra1);

            barra2 = new JLabel("Barra EM");
            barra2.setForeground(Color.white);
            barra2.setBounds(390, 25, 60, 30); // IDENTIFICA��O DA BARRA B
            painel.add(barra2);
            // ##################################### IDENTIFICA��O DOS EQUIPAMENTOS
            // ####################################

            l1a = new JLabel("89 LR-1");
            l1a.setForeground(Color.white);
            l1a.setBounds(425, 40, 60, 30);
            painel.add(l1a);
            l1b = new JLabel("89 LR-1E");
            l1b.setForeground(Color.white);
            l1b.setBounds(510, 40, 60, 30);
            painel.add(l1b);

            l2a = new JLabel("89 A1");
            l2a.setForeground(Color.white);
            l2a.setBounds(570, 40, 60, 30);
            painel.add(l2a);
            l2b = new JLabel("89 A1-E");
            l2b.setForeground(Color.white);
            l2b.setBounds(655, 40, 60, 30);
            painel.add(l2b);

            l2a = new JLabel("89 A2");
            l2a.setForeground(Color.white);
            l2a.setBounds(720, 40, 60, 30);
            painel.add(l2a);
            l2b = new JLabel("89 A2-E");
            l2b.setForeground(Color.white);
            l2b.setBounds(805, 40, 60, 30);
            painel.add(l2b);
            bta = new JLabel("89 TU");
            bta.setForeground(Color.white);
            bta.setBounds(870, 40, 60, 30);
            painel.add(bta);
            btb = new JLabel("89 TU-E");
            btb.setForeground(Color.white);
            btb.setBounds(955, 40, 60, 30);
            painel.add(btb);

            lvr152 = new JLabel("52 LVR-1");
            lvr152.setForeground(Color.white);
            lvr152.setBounds(485, 150, 60, 30);
            painel.add(lvr152);
            a152 = new JLabel("52 A1");
            a152.setForeground(Color.white);
            a152.setBounds(630, 150, 60, 30);
            painel.add(a152);
            p152 = new JLabel("52 A2");
            p152.setForeground(Color.white);
            p152.setBounds(780, 150, 60, 30);
            painel.add(p152);
            p252 = new JLabel("52 TU");
            p252.setForeground(Color.white);
            p252.setBounds(927, 150, 60, 30);
            painel.add(p252);

            lvr1 = new JLabel("LVR-1");
            lvr1.setForeground(Color.white);
            lvr1.setBounds(410, 250, 60, 30);
            painel.add(lvr1);
            tfa2 = new JLabel("Aliment. de 34,5 kV A2");
            tfa2.setForeground(Color.white);
            tfa2.setBounds(700, 250, 260, 30);
            painel.add(tfa2);
            tfa1 = new JLabel("Aliment. de 34,5 kV A1");
            tfa1.setForeground(Color.white);
            tfa1.setBounds(550, 250, 260, 30);
            painel.add(tfa1);
            tftu = new JLabel("TRAFO TU");
            tftu.setForeground(Color.white);
            tftu.setBounds(930, 208, 260, 30);
            painel.add(tftu);

            g152 = new JLabel("52 G1");
            g152.setForeground(Color.white);
            g152.setBounds(817, 280, 260, 30);
            painel.add(g152);
            g252 = new JLabel("52 G2");
            g252.setForeground(Color.white);
            g252.setBounds(970, 280, 260, 30);
            painel.add(g252);

            g1 = new JLabel("Ger.G1");
            g1.setForeground(Color.white);
            g1.setBounds(810, 310, 260, 30);
            painel.add(g1);
            g2 = new JLabel("Ger.G2");
            g2.setForeground(Color.white);
            g2.setBounds(972, 310, 260, 30);
            painel.add(g2);

            rf4 = new JLabel("89 RF-2");
            rf4.setForeground(Color.white);
            rf4.setBounds(660, 379, 60, 30);
            painel.add(rf4);
            rf4e = new JLabel("89 RF-2E");
            rf4e.setForeground(Color.white);
            rf4e.setBounds(745, 379, 60, 30);
            painel.add(rf4e);
            rf3 = new JLabel("89 RF-1");
            rf3.setForeground(Color.white);
            rf3.setBounds(810, 378, 60, 30);
            painel.add(rf3);
            rf3e = new JLabel("89 RF-1E");
            rf3e.setForeground(Color.white);
            rf3e.setBounds(895, 379, 60, 30);
            painel.add(rf3e);
            rf252 = new JLabel("52 RF-2");
            rf252.setForeground(Color.white);
            rf252.setBounds(720, 495, 60, 30);
            painel.add(rf252);
            rf152 = new JLabel("52 RF-1");
            rf152.setForeground(Color.white);
            rf152.setBounds(870, 495, 60, 30);
            painel.add(rf152);

            rf4 = new JLabel("RETIF.2");
            rf4.setForeground(Color.white);
            rf4.setBounds(750, 600, 60, 30);
            painel.add(rf4);
            rf3 = new JLabel("RETIF.1");
            rf3.setForeground(Color.white);
            rf3.setBounds(900, 600, 60, 30);
            painel.add(rf3);

            // ������������������������������������������� BAY DO LVR-1
            // ���������������������������������������������

            JPanel v22 = new JPanel(); // SECCIONADORA 89 LVR-1
            v22.setBounds(420, 8, 3, 55);
            v22.setBackground(Color.orange);
            painel.add(v22);

            JPanel v23 = new JPanel();
            v23.setBounds(420, 103, 3, 23); // Seccionadora 89 LVR-1 / Disjuntor
            v23.setBackground(Color.orange);
            painel.add(v23);

            JPanel v24 = new JPanel(); // Seccionadora 89 LVR-1E
            v24.setBounds(505, 30, 3, 33);
            v24.setBackground(Color.orange);
            painel.add(v24);

            JPanel v25 = new JPanel(); // SECCIONADORA 89 LVR-1 / DISJUNTOR 52 LVR-1
            v25.setBounds(505, 103, 3, 23);
            v25.setBackground(Color.orange);
            painel.add(v25);

            JPanel v26 = new JPanel(); // DISJUNTOR / TRAFO LVR-1
            v26.setBounds(465, 185, 3, 65);
            v26.setBackground(Color.orange);
            painel.add(v26);

            JPanel v27 = new JPanel(); // SECCIONADORA LVR1 / SECCIONADORA LVR1-E
            v27.setBounds(420, 125, 88, 3);
            v27.setBackground(Color.orange);
            painel.add(v27);

            JPanel v28 = new JPanel(); // SECCIONADORA / DISJUNTOR
            v28.setBounds(465, 126, 3, 20);
            v28.setBackground(Color.orange);
            painel.add(v28);

            JPanel v44 = new JPanel(); // TRANSFORMADOR / BARRA R1
            v44.setBounds(465, 289, 3, 61);
            v44.setBackground(Color.yellow);
            painel.add(v44);

            // ���������������������������������������������� BARRAS T1 E EM
            // ���������������������������������������������
            JPanel v45 = new JPanel(); // Barra T1
            v45.setBounds(450, 350, 530, 3);
            v45.setBackground(Color.yellow);
            painel.add(v45);

            JPanel v46 = new JPanel(); // Barra EM
            v46.setBounds(450, 375, 530, 3);
            v46.setBackground(Color.yellow);
            painel.add(v46);

            // ���������������������������������������������� BAY RF 04
            // ���������������������������������������������
            JPanel v54 = new JPanel(); // SECCIONADORA 89 R4
            v54.setBounds(655, 350, 3, 53);
            v54.setBackground(Color.yellow);
            painel.add(v54);

            JPanel v55 = new JPanel();
            v55.setBounds(655, 445, 3, 24); // Seccionadora 89 R4 / Disjuntor
            v55.setBackground(Color.yellow);
            painel.add(v55);

            JPanel v56 = new JPanel(); // Seccionadora 89 R4-E
            v56.setBounds(740, 375, 3, 28);
            v56.setBackground(Color.yellow);
            painel.add(v56);

            JPanel v57 = new JPanel(); // SECCIONADORA 89 R4-E / DISJUNTOR 52 R4
            v57.setBounds(740, 445, 3, 23);
            v57.setBackground(Color.yellow);
            painel.add(v57);

            JPanel v58 = new JPanel(); // SECCIONADORA R4 / SECCIONADORA R4-E
            v58.setBounds(655, 468, 88, 3);
            v58.setBackground(Color.yellow);
            painel.add(v58);

            JPanel v59 = new JPanel(); // SECCIONADORA / DISJUNTOR
            v59.setBounds(700, 469, 3, 20);
            v59.setBackground(Color.yellow);
            painel.add(v59);

            JPanel v60 = new JPanel(); // DISJUNTOR / TRAFO RF-4
            v60.setBounds(700, 528, 3, 55);
            v60.setBackground(Color.yellow);
            painel.add(v60);

            // ���������������������������������������������� BAY RF 03
            // ���������������������������������������������
            JPanel v61 = new JPanel(); // SECCIONADORA 89 R3
            v61.setBounds(805, 350, 3, 53);
            v61.setBackground(Color.yellow);
            painel.add(v61);

            JPanel v62 = new JPanel();
            v62.setBounds(805, 445, 3, 24); // Seccionadora 89 R3 / Disjuntor
            v62.setBackground(Color.yellow);
            painel.add(v62);

            JPanel v63 = new JPanel(); // Seccionadora 89 R3-E
            v63.setBounds(890, 375, 3, 28);
            v63.setBackground(Color.yellow);
            painel.add(v63);

            JPanel v64 = new JPanel(); // SECCIONADORA 89 R3-E / DISJUNTOR 52 R3
            v64.setBounds(890, 445, 3, 23);
            v64.setBackground(Color.yellow);
            painel.add(v64);

            JPanel v65 = new JPanel(); // SECCIONADORA R3 / SECCIONADORA R3-E
            v65.setBounds(805, 468, 88, 3);
            v65.setBackground(Color.yellow);
            painel.add(v65);

            JPanel v66 = new JPanel(); // SECCIONADORA / DISJUNTOR
            v66.setBounds(850, 469, 3, 20);
            v66.setBackground(Color.yellow);
            painel.add(v66);

            JPanel v67 = new JPanel(); // DISJUNTOR / TRAFO RF-3
            v67.setBounds(850, 528, 3, 55);
            v67.setBackground(Color.yellow);
            painel.add(v67);
            // ���������������������������������������� BAY DA TF A1
            // ������������������������������������������������������

            JPanel v83 = new JPanel(); // SECCIONADORA 89 A1
            v83.setBounds(565, 8, 3, 55);
            v83.setBackground(Color.orange);
            painel.add(v83);

            JPanel v84 = new JPanel();
            v84.setBounds(565, 103, 3, 23); // Seccionadora 89 A1 / Disjuntor
            v84.setBackground(Color.orange);
            painel.add(v84);

            JPanel v85 = new JPanel(); // Seccionadora 89 A1-E
            v85.setBounds(650, 30, 3, 33);
            v85.setBackground(Color.orange);
            painel.add(v85);

            JPanel v86 = new JPanel(); // SECCIONADORA 89 A1-E / DISJUNTOR 52 A1
            v86.setBounds(650, 103, 3, 23);
            v86.setBackground(Color.orange);
            painel.add(v86);

            JPanel v87 = new JPanel(); // SECCIONADORA A1 / SECCIONADORA A1-E
            v87.setBounds(565, 125, 88, 3);
            v87.setBackground(Color.orange);
            painel.add(v87);

            JPanel v88 = new JPanel(); // SECCIONADORA / DISJUNTOR
            v88.setBounds(610, 126, 3, 20);
            v88.setBackground(Color.orange);
            painel.add(v88);

            JPanel v89 = new JPanel(); // DISJUNTOR / ALIMENTADOR
            v89.setBounds(610, 185, 3, 20);
            v89.setBackground(Color.orange);
            painel.add(v89);

            // ���������������������������������������� BAY DA TF A2
            // ������������������������������������������������������

            JPanel v29 = new JPanel(); // SECCIONADORA 89 A2
            v29.setBounds(715, 8, 3, 55);
            v29.setBackground(Color.orange);
            painel.add(v29);

            JPanel v30 = new JPanel();
            v30.setBounds(715, 103, 3, 23); // Seccionadora 89 A2 / Disjuntor
            v30.setBackground(Color.orange);
            painel.add(v30);

            JPanel v31 = new JPanel(); // Seccionadora 89 A2-E
            v31.setBounds(800, 30, 3, 33);
            v31.setBackground(Color.orange);
            painel.add(v31);

            JPanel v32 = new JPanel(); // SECCIONADORA 89 A2-E / DISJUNTOR 52 A2
            v32.setBounds(800, 103, 3, 23);
            v32.setBackground(Color.orange);
            painel.add(v32);

            JPanel v34 = new JPanel(); // SECCIONADORA A2 / SECCIONADORA A2-E
            v34.setBounds(715, 125, 88, 3);
            v34.setBackground(Color.orange);
            painel.add(v34);

            JPanel v35 = new JPanel(); // SECCIONADORA / DISJUNTOR
            v35.setBounds(760, 126, 3, 20);
            v35.setBackground(Color.orange);
            painel.add(v35);

            JPanel v33 = new JPanel(); // DISJUNTOR / ALIMENTADOR
            v33.setBounds(760, 185, 3, 20);
            v33.setBackground(Color.orange);
            painel.add(v33);

            // �������������������������������������������� BAY DA GERA��O DE EMERG�NCIA
            // ����������������������������������������

            JPanel v36 = new JPanel(); // SECCIONADORA 89 TU
            v36.setBounds(865, 8, 3, 55);
            v36.setBackground(Color.orange);
            painel.add(v36);

            JPanel v37 = new JPanel();
            v37.setBounds(865, 103, 3, 23); // Seccionadora 89 TU / Disjuntor 52 TU
            v37.setBackground(Color.orange);
            painel.add(v37);

            JPanel v38 = new JPanel(); // Seccionadora 89 TU-E
            v38.setBounds(950, 30, 3, 33);
            v38.setBackground(Color.orange);
            painel.add(v38);

            JPanel v39 = new JPanel(); // SECCIONADORA 89 TU-E / DISJUNTOR 52 TU
            v39.setBounds(950, 103, 3, 23);
            v39.setBackground(Color.orange);
            painel.add(v39);

            JPanel v41 = new JPanel(); // SECCIONADORA 89 TU / DISJUNTOR 52 TU
            v41.setBounds(907, 125, 3, 20);
            v41.setBackground(Color.orange);
            painel.add(v41);

            JPanel v42 = new JPanel(); // SECCIONADORA 89 TU-E / 89 TU-E
            v42.setBounds(865, 125, 88, 3);
            v42.setBackground(Color.orange);
            painel.add(v42);

            JPanel v43 = new JPanel(); // DISJUNTOR / ALIMENTADOR TU
            v43.setBounds(907, 185, 3, 20);
            v43.setBackground(Color.orange);
            painel.add(v43);

            JPanel v75 = new JPanel(); // DISJUNTOR / ALIMENTADOR TU
            v75.setBounds(907, 245, 3, 12);
            v75.setBackground(Color.orange);
            painel.add(v75);

            JPanel v76 = new JPanel(); // SECCIONADORA 89 TU-E / 89 TU-E
            v76.setBounds(865, 255, 88, 3);
            v76.setBackground(Color.orange);
            painel.add(v76);

            JPanel v77 = new JPanel(); // DISJUNTOR / ALIMENTADOR TU
            v77.setBounds(865, 255, 3, 12);
            v77.setBackground(Color.orange);
            painel.add(v77);

            JPanel v78 = new JPanel(); // DISJUNTOR / ALIMENTADOR TU
            v78.setBounds(950, 255, 3, 12);
            v78.setBackground(Color.orange);
            painel.add(v78);

            JPanel v79 = new JPanel(); // DISJUNTOR / ALIMENTADOR TU
            v79.setBounds(865, 305, 3, 5);
            v79.setBackground(Color.orange);
            painel.add(v79);

            JPanel v80 = new JPanel(); // DISJUNTOR / ALIMENTADOR TU
            v80.setBounds(950, 305, 3, 5);
            v80.setBackground(Color.orange);
            painel.add(v80);

            // ����������������������������������� CRIA��O DO BOT�O 89 LVR-1
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
            b19.setToolTipText("Pressione para operar a Seccionadora 89 LVR1");
            b19.setMnemonic(KeyEvent.VK_B);
            b19.setActionCommand("89LVR1");// define o nome da acao
            b19.setBounds(404, 62, 33, 45);
            painel.add(b19);

            // ����������������������������������� CRIA��O DO BOT�O 89 LVR-1E
            // �����������������������������������������������

            b20 = new JButton(); // BOT�O CS 89 LVR-1E
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
            b20.setBounds(490, 62, 33, 45);
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
            b21.setBounds(450, 145, 33, 42);
            painel.add(b21);

            // ����������������������������������� CRIA��O DO BOT�ES DE CONTROLE DO TRAFO
            // LVR-1 �����������������������

            b22 = new JButton("+"); // TAP LVR-1
            b22.setBounds(495, 250, 41, 15);
            b22.addActionListener(this);
            painel.add(b22);

            b23 = new JButton("-"); // TAP LVR-1
            b23.setBounds(495, 270, 41, 15);
            b23.addActionListener(this);
            painel.add(b23);

            tap1 = new JLabel("0 Kv"); // VALOR DE TENS�O DA BARRA R1
            tap1.setForeground(Color.white);
            tap1.setBounds(410, 285, 60, 30);
            painel.add(tap1);

            valortap1 = new JLabel(eqp1.getMostrarTapslvr1()); // VALOR TAP LVR-1
            valortap1.setForeground(Color.white);
            valortap1.setBounds(500, 280, 60, 30);
            painel.add(valortap1);

            // ����������������������������������� CRIA��O DO BOT�O 89 A2
            // �����������������������������������������������

            b24 = new JButton(); // BOT�O CS 89 A2
            b24.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
            b24.addActionListener(this);
            b24.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b24.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b24.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b24.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b24.setForeground(Color.black);// cor do titulo do bot�o
            b24.setEnabled(true);
            b24.setToolTipText("Pressione para operar a Seccionadora 89 A2");
            b24.setMnemonic(KeyEvent.VK_B);
            b24.setActionCommand("89L2A");// define o nome da acao
            b24.setBounds(699, 62, 33, 45);
            painel.add(b24);

            // ����������������������������������� CRIA��O DO BOT�O 89 A2-E
            // �����������������������������������������������

            b25 = new JButton(); // BOT�O CS 89 A2-E
            b25.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
            b25.addActionListener(this);
            b25.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b25.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b25.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b25.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b25.setForeground(Color.black);// cor do titulo do bot�o
            b25.setEnabled(true);
            b25.setToolTipText("Pressione para operar a Seccionadora 89 A2-E");
            b25.setMnemonic(KeyEvent.VK_B);
            b25.setActionCommand("89P1-E");// define o nome da acao
            b25.setBounds(784, 62, 33, 45);
            painel.add(b25);

            // ����������������������������������� CRIA��O DO BOT�O 52 A2
            // �����������������������������������������������

            b26 = new JButton(); // BOT�O 52 A2
            b26.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b26.addActionListener(this);
            b26.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b26.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b26.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b26.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b26.setForeground(Color.black);// cor do titulo do bot�o
            b26.setEnabled(true);
            b26.setToolTipText("Pressione para operar O Disjuntor 52 A2");
            b26.setMnemonic(KeyEvent.VK_B);
            b26.setActionCommand("52L2");// define o nome da acao
            b26.setBounds(745, 145, 33, 42);
            painel.add(b26);

            // ����������������������������������� CRIA��O DO BOT�O 89 TU
            // �����������������������������������������������

            b29 = new JButton(); // BOT�O CS 89 TU
            b29.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
            b29.addActionListener(this);
            b29.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b29.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b29.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b29.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b29.setForeground(Color.black);// cor do titulo do bot�o
            b29.setEnabled(true);
            b29.setToolTipText("Pressione para operar a Seccionadora 89 TU");
            b29.setMnemonic(KeyEvent.VK_B);
            b29.setActionCommand("89TU");// define o nome da acao
            b29.setBounds(849, 62, 33, 45);
            painel.add(b29);

            // ����������������������������������� CRIA��O DO BOT�O 89 TU-E
            // �����������������������������������������������

            b31 = new JButton(); // BOT�O CS 89 TU-E
            b31.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
            b31.addActionListener(this);
            b31.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b31.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b31.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b31.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b31.setForeground(Color.black);// cor do titulo do bot�o
            b31.setEnabled(true);
            b31.setToolTipText("Pressione para operar a Seccionadora 89 TU-E");
            b31.setMnemonic(KeyEvent.VK_B);
            b31.setActionCommand("89TU-E");// define o nome da acao
            b31.setBounds(934, 62, 33, 45);
            painel.add(b31);

            // ����������������������������������� CRIA��O DO BOT�O 52 TU
            // �����������������������������������������������

            b33 = new JButton(); // BOT�O 52 TU
            b33.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b33.addActionListener(this);
            b33.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b33.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b33.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b33.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b33.setForeground(Color.black);// cor do titulo do bot�o
            b33.setEnabled(true);
            b33.setToolTipText("Pressione para operar O Disjuntor 52 TU");
            b33.setMnemonic(KeyEvent.VK_B);
            b33.setActionCommand("52TU");// define o nome da acao
            b33.setBounds(892, 145, 33, 42);
            painel.add(b33);

            // ����������������������������������� CRIA��O DO BOT�O TRAFO LVR-1
            // ������������������������������������������

            b42 = new JButton(); // BOT�O TRANSFORMADOR LVR-1
            b42.setIcon(new javax.swing.ImageIcon("LVR.jpg"));
            b42.addActionListener(this);
            b42.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b42.setToolTipText("Pressione para comutar o Tap do Transformador LVR-1");
            b42.setHorizontalTextPosition(AbstractButton.CENTER);
            b42.setVerticalTextPosition(AbstractButton.CENTER);
            b42.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b42.setBounds(450, 250, 36, 40);
            painel.add(b42);
            // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 2
            // ������������������������������������������

            b46 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR 2
            b46.setIcon(new javax.swing.ImageIcon("RF.jpg"));
            b46.addActionListener(this);
            b46.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            // b46.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
            b46.setHorizontalTextPosition(AbstractButton.CENTER);
            b46.setVerticalTextPosition(AbstractButton.CENTER);
            b46.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b46.setBounds(669, 582, 76, 53);
            painel.add(b46);

            // ����������������������������������� CRIA��O DO BOT�O TRAFO RETIFICADOR 1
            // ������������������������������������������

            b47 = new JButton(); // BOT�O TRANSFORMADOR RETIFICADOR 1
            b47.setIcon(new javax.swing.ImageIcon("RF.jpg"));
            b47.addActionListener(this);
            b47.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            // b47.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
            b47.setHorizontalTextPosition(AbstractButton.CENTER);
            b47.setVerticalTextPosition(AbstractButton.CENTER);
            b47.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b47.setBounds(819, 582, 76, 53);
            painel.add(b47);

            // ����������������������������������� CRIA��O DO BOT�O 89 R2
            // �����������������������������������������������

            b48 = new JButton(); // BOT�O CS 89 R2
            b48.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
            b48.addActionListener(this);
            b48.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b48.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b48.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b48.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b48.setForeground(Color.black);// cor do titulo do bot�o
            b48.setEnabled(true);
            b48.setToolTipText("Pressione para operar a Seccionadora 89 R2");
            b48.setMnemonic(KeyEvent.VK_B);
            b48.setActionCommand("89R2");// define o nome da acao
            b48.setBounds(639, 402, 33, 45);
            painel.add(b48);

            // ����������������������������������� CRIA��O DO BOT�O 89 R2-E
            // �����������������������������������������������

            b49 = new JButton(); // BOT�O CS 89 R2-E
            b49.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
            b49.addActionListener(this);
            b49.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b49.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b49.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b49.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b49.setForeground(Color.black);// cor do titulo do bot�o
            b49.setEnabled(true);
            b49.setToolTipText("Pressione para operar a Seccionadora 89 R2-E");
            b49.setMnemonic(KeyEvent.VK_B);
            b49.setActionCommand("89R2E");// define o nome da acao
            b49.setBounds(725, 402, 33, 45);
            painel.add(b49);

            // ����������������������������������� CRIA��O DO BOT�O 52 R2
            // �����������������������������������������������

            b50 = new JButton(); // BOT�O 52 R2
            b50.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b50.addActionListener(this);
            b50.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b50.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b50.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b50.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b50.setForeground(Color.black);// cor do titulo do bot�o
            b50.setEnabled(true);
            b50.setToolTipText("Pressione para operar O Disjuntor 52 R2");
            b50.setMnemonic(KeyEvent.VK_B);
            b50.setActionCommand("52R4");// define o nome da acao
            b50.setBounds(685, 488, 33, 42);
            painel.add(b50);

            // ����������������������������������� CRIA��O DO BOT�O 89 R1
            // �����������������������������������������������

            b51 = new JButton(); // BOT�O CS 89 R1
            b51.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
            b51.addActionListener(this);
            b51.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b51.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b51.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b51.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b51.setForeground(Color.black);// cor do titulo do bot�o
            b51.setEnabled(true);
            b51.setToolTipText("Pressione para operar a Seccionadora 89 R1");
            b51.setMnemonic(KeyEvent.VK_B);
            b51.setActionCommand("89R1");// define o nome da acao
            b51.setBounds(788, 402, 33, 45);
            painel.add(b51);

            // ����������������������������������� CRIA��O DO BOT�O 89 R1-E
            // �����������������������������������������������

            b52 = new JButton(); // BOT�O CS 89 R1-E
            b52.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
            b52.addActionListener(this);
            b52.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b52.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b52.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b52.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b52.setForeground(Color.black);// cor do titulo do bot�o
            b52.setEnabled(true);
            b52.setToolTipText("Pressione para operar a Seccionadora 89 R1-E");
            b52.setMnemonic(KeyEvent.VK_B);
            b52.setActionCommand("89R1");// define o nome da acao
            b52.setBounds(874, 402, 33, 45);
            painel.add(b52);

            // ����������������������������������� CRIA��O DO BOT�O 52 R1
            // �����������������������������������������������

            b53 = new JButton(); // BOT�O 52 R1
            b53.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b53.addActionListener(this);
            b53.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b53.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b53.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b53.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b53.setForeground(Color.black);// cor do titulo do bot�o
            b53.setEnabled(true);
            b53.setToolTipText("Pressione para operar O Disjuntor 52 R1");
            b53.setMnemonic(KeyEvent.VK_B);
            b53.setActionCommand("52R1");// define o nome da acao
            b53.setBounds(835, 488, 33, 42);
            painel.add(b53);

            // ����������������������������������� CRIA��O DO BOT�O TRAFO A1
            // ������������������������������������������

            b54 = new JButton(); // BOT�O TRANSFORMADOR A1
            b54.setIcon(new javax.swing.ImageIcon("TF_S AUX.jpg"));
            b54.addActionListener(this);
            b54.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            // b54.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
            b54.setHorizontalTextPosition(AbstractButton.CENTER);
            b54.setVerticalTextPosition(AbstractButton.CENTER);
            b54.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b54.setBounds(594, 204, 39, 41);
            painel.add(b54);
            // ����������������������������������� CRIA��O DO BOT�O TRAFO A2
            // ������������������������������������������

            b54 = new JButton(); // BOT�O TRANSFORMADOR A2
            b54.setIcon(new javax.swing.ImageIcon("TF_S AUX.jpg"));
            b54.addActionListener(this);
            b54.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            // b54.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
            b54.setHorizontalTextPosition(AbstractButton.CENTER);
            b54.setVerticalTextPosition(AbstractButton.CENTER);
            b54.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b54.setBounds(743, 204, 39, 41);
            painel.add(b54);

            // ����������������������������������� CRIA��O DO BOT�O TRAFO TU
            // ������������������������������������������

            b54 = new JButton(); // BOT�O TRANSFORMADOR TU
            b54.setIcon(new javax.swing.ImageIcon("TF_S AUX.JPG"));
            b54.addActionListener(this);
            b54.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            // b54.setToolTipText("Pressione para comutar o Tap do Transformador MT-1");
            b54.setHorizontalTextPosition(AbstractButton.CENTER);
            b54.setVerticalTextPosition(AbstractButton.CENTER);
            b54.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b54.setBounds(890, 204, 39, 41);
            painel.add(b54);
            // ����������������������������������� CRIA��O DO BOT�O 52 G2
            // �����������������������������������������������

            b55 = new JButton(); // BOT�O 52 G2
            b55.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b55.addActionListener(this);
            b55.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b55.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b55.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b55.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b55.setForeground(Color.black);// cor do titulo do bot�o
            b55.setEnabled(true);
            b55.setToolTipText("Pressione para operar O Disjuntor 52 G2");
            b55.setMnemonic(KeyEvent.VK_B);
            b55.setActionCommand("52G2");// define o nome da acao
            b55.setBounds(935, 265, 33, 42);
            painel.add(b55);

            // ����������������������������������� CRIA��O DO BOT�O 52 G1
            // �����������������������������������������������

            b56 = new JButton(); // BOT�O 52 G1
            b56.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b56.addActionListener(this);
            b56.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b56.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b56.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b56.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b56.setForeground(Color.black);// cor do titulo do bot�o
            b56.setEnabled(true);
            b56.setToolTipText("Pressione para operar O Disjuntor 52 G1");
            b56.setMnemonic(KeyEvent.VK_B);
            b56.setActionCommand("52G1");// define o nome da acao
            b56.setBounds(850, 265, 33, 42);
            painel.add(b56);

            // ����������������������������������� CRIA��O DO BOT�O MOTOR G1
            // ������������������������������������������

            b57 = new JButton(); // BOT�O MOTOR G1
            b57.setIcon(new javax.swing.ImageIcon("Gerador.jpg"));
            b57.addActionListener(this);
            b57.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            // b42.setToolTipText("Pressione para comutar o Tap do Transformador LVR-1");
            b57.setHorizontalTextPosition(AbstractButton.CENTER);
            b57.setVerticalTextPosition(AbstractButton.CENTER);
            b57.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b57.setBounds(849, 310, 36, 40);
            painel.add(b57);

            // ����������������������������������� CRIA��O DO BOT�O MOTOR G2
            // ������������������������������������������

            b58 = new JButton(); // BOT�O MOTOR G2
            b58.setIcon(new javax.swing.ImageIcon("Gerador.jpg"));
            b58.addActionListener(this);
            b58.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            // b42.setToolTipText("Pressione para comutar o Tap do Transformador LVR-1");
            b58.setHorizontalTextPosition(AbstractButton.CENTER);
            b58.setVerticalTextPosition(AbstractButton.CENTER);
            b58.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b58.setBounds(934, 310, 36, 40);
            painel.add(b58);

            // ����������������������������������� CRIA��O DO BOT�O 89 A1
            // �����������������������������������������������

            b59 = new JButton(); // BOT�O CS 89 A1
            b59.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
            b59.addActionListener(this);
            b59.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b59.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b59.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b59.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b59.setForeground(Color.black);// cor do titulo do bot�o
            b59.setEnabled(true);
            b59.setToolTipText("Pressione para operar a Seccionadora 89 A1");
            b59.setMnemonic(KeyEvent.VK_B);
            b59.setActionCommand("89A1");// define o nome da acao
            b59.setBounds(549, 62, 33, 45);
            painel.add(b59);

            // ����������������������������������� CRIA��O DO BOT�O 89 A1-E
            // �����������������������������������������������

            b60 = new JButton(); // BOT�O CS 89 A1-E
            b60.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
            b60.addActionListener(this);
            b60.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b60.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b60.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b60.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b60.setForeground(Color.black);// cor do titulo do bot�o
            b60.setEnabled(true);
            b60.setToolTipText("Pressione para operar a Seccionadora 89 A1-E");
            b60.setMnemonic(KeyEvent.VK_B);
            b60.setActionCommand("89A1-E");// define o nome da acao
            b60.setBounds(634, 62, 33, 45);
            painel.add(b60);

            // ����������������������������������� CRIA��O DO BOT�O 52 A1
            // �����������������������������������������������

            b61 = new JButton(); // BOT�O 52 A1
            b61.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
            b61.addActionListener(this);
            b61.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
            b61.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
            b61.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b61.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b61.setForeground(Color.black);// cor do titulo do bot�o
            b61.setEnabled(true);
            b61.setToolTipText("Pressione para operar O Disjuntor 52 A1");
            b61.setMnemonic(KeyEvent.VK_B);
            b61.setActionCommand("52A1");// define o nome da acao
            b61.setBounds(595, 145, 33, 42);
            painel.add(b61);

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
            b34.setBounds(410, 590, 32, 58);
            painel.add(b34);

            // ��������������������������������������� BOT�O SETA
            // ��������������������������������������

            b40 = new JButton("");
            b40.setIcon(new javax.swing.ImageIcon("Seta.jpg"));
            b40.addActionListener(this);
            b40.setBackground(new Color(204, 204, 255));// cor de fundo do bot�o
            b40.setToolTipText("Pressione para acessar a tela RF'S 3 E 6");
            b40.setHorizontalTextPosition(AbstractButton.CENTER);
            b40.setVerticalTextPosition(AbstractButton.CENTER);
            b40.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            b40.setBounds(410, 436, 30, 30);
            painel.add(b40);

            c.add(painel, java.awt.BorderLayout.CENTER);

            atualizaConfiguracao();
        }

        // ���������������������������������������������������������������������������������������������������
        public void actionPerformed(ActionEvent e) // metodo implementado pelo ActionListener
        {
            // #################################################### BOTAO DE ACAO DA CS 89
            // LVR-1 ##########################################################

            if (e.getSource() == b19) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado da Seccionadora 89 LVR-1?",
                        "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.seccionadora89lvr1().equals("Seccionadora Aberta")) {
                        b19.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                        eqp1.fecharSeccionadora89lvr1();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-A foi Fechada com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));
                        // BDE.ConectarBD();

                        tagequipamento = "89 LVR-1";
                        operacao = "Seccionadora Fechada";
                        manobra = "Bay LVR-1";

                        seccionadora89lvr1fechada = "seccionadora 89LVR1 Fechada";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();
                    }

                    else if (eqp1.seccionadora89lvr1().equals("Seccionadora Fechada")
                            && eqp1.disjuntor52lvr1().equals("Disjuntor Aberto")) {
                        b19.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                        eqp1.abrirSeccionadora89lvr1();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-A foi Aberta com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));
                        // BDE.ConectarBD();

                        tagequipamento = "89 LVR-1";
                        operacao = "Seccionadora Aberta";
                        manobra = "Bay LVR-1";

                        seccionadora89lvr1aberta = "seccionadora 89LVR1 Aberta";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 L1 FECHADO! \n ",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                status1.setText(" 89 LVR-1 " + eqp1.seccionadora89lvr1());
            }

            // ####################################################### AC�O DO BOT�O DA 89
            // LVR-1E #########################################################
            if (e.getSource() == b20) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado da Seccionadora 89 LVR-1E?",
                        "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.seccionadora89lvr1e().equals("Seccionadora Aberta")
                            && eqp1.seccionadora89lvr1().equals("Seccionadora Aberta")) {
                        b20.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                        eqp1.fecharSeccionadora89lvr1e();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L1-B foi Fechada com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));
                        // BDE.ConectarBD();

                        tagequipamento = "89 LVR-1E";
                        operacao = "Seccionadora Fechada";
                        manobra = "Bay LVR-1";

                        seccionadora89lvr1efechada = "seccionadora 89LVR1E Fechada";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.seccionadora89lvr1e().equals("Seccionadora Fechada")
                            && eqp1.disjuntor52lvr1().equals("Disjuntor Aberto")) {
                        b20.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                        eqp1.abrirSeccionadora89lvr1e();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 L1-B foi Aberta
                        // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));;
                        // BDE.ConectarBD();

                        tagequipamento = "89 LVR-1E";
                        operacao = "Seccionadora Aberta";
                        manobra = "Bay LVR-1";

                        seccionadora89lvr1eaberta = "seccionadora 89LVR1E Aberta";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento não Satisfeita! \n DISJUNTOR 52 LVR-1 FECHADO! \n ",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                status1.setText(" 89 LVR-1E " + eqp1.seccionadora89lvr1e());
            }

            // ################################################# AC�O DO BOT�O DO 52 LVR-1
            // ##############################################################
            if (e.getSource() == b21) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado do Disjuntor 52 LVR-1?",
                        "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.disjuntor52lvr1().equals("Disjuntor Aberto")) {
                        b21.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                        eqp1.fecharDisjuntor52lvr1();
                        valortap1.setText(eqp1.getMostrarTapslvr1());

                        tagequipamento = "52 LVR-1";
                        operacao = "Disjuntor Fechado";
                        manobra = "Bay LVR-1";

                        disjuntor52lvr1fechado = "Disjuntor 52LVR1 Fechado";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    }

                    else if (eqp1.disjuntor52lvr1().equals("Disjuntor Fechado")) {
                        b21.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                        eqp1.abrirDisjuntor52lvr1();
                        tap1.setText("0 kV");

                        tagequipamento = "52 LVR-1";
                        operacao = "Disjuntor Aberto";
                        manobra = "Bay LVR-1";

                        disjuntor52lvr1aberto = "Disjuntor 52LVR1 Aberto";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();
                    }
                }
                if (eqp1.disjuntor52lvr1().equals("Disjuntor Fechado")
                        && eqp1.seccionadora89lvr1().equals("Seccionadora Aberta")
                        || eqp1.disjuntor52lvr1().equals("Disjuntor Fechado")
                                && eqp1.seccionadora89lvr1e().equals("Seccionadora Aberta")) {
                    status1.setText("O TRANSFORMADOR ESTA DESENERGIZADO! ");
                }
            }

            // ������������������������������� A��O DOS BOT�ES DE COMUTA��O DE TAP'S DO
            // LVR-1 ����������������������������
            if (e.getSource() == b42) {
                status1.setText(" O Transformador LVR-1 esta no Tap:" + eqp1.getMostrarTapslvr1());
                JOptionPane.showMessageDialog(null, "  O Transformador LVR-1 est� no:  " + eqp1.getMostrarTapslvr1(),
                        "Disjuntor", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
            }
            if (e.getSource() == b22) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja Subir o Tap do Transformador LVR-1?",
                        "Transformador", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.getTapslvr1() == 32)
                        JOptionPane.showMessageDialog(null, "O Transformador LVR-1 esta no Tap Maximo!", "Tap",
                                JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                    eqp1.aumentarTaplvr1();
                    status1.setText(" O Transformador LVR-1 esta no:  " + eqp1.getMostrarTapslvr1());
                    valortap1.setText(eqp1.getMostrarTapslvr1());

                    if (eqp1.seccionadora89lvr1().equals("Seccionadora Fechada")
                            && eqp1.disjuntor52lvr1().equals("Disjuntor Fechado")
                            || eqp1.seccionadora89lvr1e().equals("Seccionadora Fechada")
                                    && eqp1.disjuntor52lvr1().equals("Disjuntor Fechado")) {
                        tap1.setText(eqp1.getValorTaplvr1());
                    }

                    tagequipamento = "TAP LVR-1";
                    operacao = "Tap Aumentado";
                    manobra = "Bay LVR-1";
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
                    if (eqp1.getTapslvr1() == 0)
                        JOptionPane.showMessageDialog(null, "O Transformador LVR-1 esta no Tap Minimo!", "Tap",
                                JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                    eqp1.diminuirTaplvr1();
                    status1.setText(" O Transformador LVR-1 esta no:  " + eqp1.getMostrarTapslvr1());
                    valortap1.setText(eqp1.getMostrarTapslvr1());
                    if (eqp1.seccionadora89lvr1().equals("Seccionadora Fechada")
                            && eqp1.disjuntor52lvr1().equals("Disjuntor Fechado")
                            || eqp1.seccionadora89lvr1e().equals("Seccionadora Fechada")
                                    && eqp1.disjuntor52lvr1().equals("Disjuntor Fechado")) {
                        tap1.setText(eqp1.getValorTaplvr1());
                    }
                    BDE.ConectarBD();

                    tagequipamento = "TAP LVR-1";
                    operacao = "Tap Diminuido";
                    manobra = "Bay LVR-1";
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Logica de Intertravamento nao Satisfeita! \n TRANSFORMADOR DESENERGIZADO! \n",
                            "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                }
            }
            // #################################################### BOT�O DE AC�O DA CS 89
            // A2 ##########################################################

            if (e.getSource() == b24) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado da Seccionadora 89 A2?",
                        "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.seccionadora89a2().equals("Seccionadora Aberta")) {
                        b24.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                        eqp1.fecharSeccionadora89a2();
                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-A foi Fechada com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 A2";
                        operacao = "Seccionadora Fechada";
                        manobra = "Bay A2";

                        seccionadora89a2fechada = "seccionadora 89A2 Fechada";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();
                    }

                    else if (eqp1.seccionadora89a2().equals("Seccionadora Fechada")) {
                        b24.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                        eqp1.abrirSeccionadora89a2();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-A foi Aberta com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 A2";
                        operacao = "Seccionadora Aberta";
                        manobra = "Bay A2";

                        seccionadora89a2aberta = "seccionadora 89A2 Aberta";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 A2 FECHADO \n ",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                status1.setText(" 89 A2 " + eqp1.seccionadora89a2());
            }

            // ####################################################### AC�O DO BOT�O DA 89
            // A2E #########################################################
            if (e.getSource() == b25) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado da Seccionadora 89 A2-E?",
                        "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.seccionadora89a2e().equals("Seccionadora Aberta")) {
                        b25.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                        eqp1.fecharSeccionadora89a2e();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-B foi Fechada com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 A2E";
                        operacao = "Seccionadora Fechada";
                        manobra = "Bay A2";

                        seccionadora89a2efechada = "Seccionadora 89A2E Fechada";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.seccionadora89a2e().equals("Seccionadora Fechada")
                            && eqp1.disjuntor52a2().equals("Disjuntor Aberto")) {
                        b25.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                        eqp1.abrirSeccionadora89a2e();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2-B foi Aberta
                        // com Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));;

                        tagequipamento = "89 A2E";
                        operacao = "Seccionadora Aberta";
                        manobra = "Bay A2";

                        seccionadora89a2eaberta = "Seccionadora 89A2E Aberta";
                        PrepAlbras = "PrepAlbras";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 A2 FECHADO \n ",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                status1.setText(" 89 A2-E " + eqp1.seccionadora89a2e());
            }

            // ################################################# AC�O DO BOT�O DO 52 A2
            // ##############################################################
            if (e.getSource() == b26) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado do Disjuntor 52 A2?",
                        "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.disjuntor52a2().equals("Disjuntor Aberto")) {
                        b26.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                        eqp1.fecharDisjuntor52a2();

                        tagequipamento = "52 A2";
                        operacao = "Disjuntor Fechado";
                        manobra = "Bay A2";

                        disjuntor52a2fechado = "Disjuntor 52A2 Fechado";
                        // DesenAlbras = "";
                        // EnerAlbras = "EnergizarAlbras";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        // manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        // manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.disjuntor52a2().equals("Disjuntor Fechado")) {
                        b26.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                        eqp1.abrirDisjuntor52a2();

                        tagequipamento = "52 A2";
                        operacao = "Disjuntor Aberto";
                        manobra = "Bay A2";

                        disjuntor52a2aberto = "Disjuntor 52A2 Aberto";
                        // EnerAlbras = "";
                        // DesenAlbras = "DesenergizarAlbras";
                        // manobrainteligente1.PrepAlbras();
                        // manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else {
                        JOptionPane.showMessageDialog(null, "LOGICA DE INTERTRAVAMENTO NAO SATISFEITA! ",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                if (eqp1.disjuntor52a2().equals("Disjuntor Fechado")
                        && eqp1.seccionadora89a2().equals("Seccionadora Aberta")
                        || eqp1.disjuntor52a2().equals("Disjuntor Fechado")
                                && eqp1.seccionadora89a2e().equals("Seccionadora Aberta")) {
                    status1.setText("O TRANSFORMADOR ESTA DESENERGIZADO! ");
                }
            }

            // ����������������������������������������� A��O DO BOT�O DA CS 89 TU
            // ��������������������������������������
            if (e.getSource() == b29) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado da Seccionadora 89 TU?",
                        "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.seccionadora89tu().equals("Seccionadora Aberta")) {
                        b29.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                        eqp1.fecharSeccionadora89tu();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2 foi Fechada com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 TU";
                        operacao = "Seccionadora Fechada";
                        manobra = "Bay TU";

                        seccionadora89tufechada = "Seccionadora 89TU Fechada";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.seccionadora89tu().equals("Seccionadora Fechada")
                            && eqp1.disjuntor52tu().equals("Disjuntor Aberto")) {
                        b29.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                        eqp1.abrirSeccionadora89tu();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 L2 foi Aberta com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));;

                        tagequipamento = "89 TU";
                        operacao = "Seccionadora Aberta";
                        manobra = "Bay TU";

                        seccionadora89tuaberta = "Seccionadora 89TU Aberta";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 TU FECHADO \n ",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                status1.setText(" CS 89 TU " + eqp1.seccionadora89tu());
            }

            // ������������������������������������ A��O DO BOT�O DA SECCIONADORA 89 TU-E
            // �������������������������������
            if (e.getSource() == b31) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado da Seccionadora 89 TU-E?",
                        "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.seccionadora89tue().equals("Seccionadora Aberta")) {
                        b31.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                        eqp1.fecharSeccionadora89tue();
                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BT-A foi Fechada com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));
                        BDE.ConectarBD();

                        tagequipamento = "89 TUE";
                        operacao = "Seccionadora Fechada";
                        manobra = "Bay TU";

                        seccionadora89tuefechada = "Seccionadora 89TUE Fechada";
                        PrepAlbras = "PrepAlbras";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();
                    }

                    else if (eqp1.seccionadora89tue().equals("Seccionadora Fechada")
                            && eqp1.disjuntor52tu().equals("Disjuntor Aberto")) {
                        b31.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                        eqp1.abrirSeccionadora89tue();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BT-A foi Aberta com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 TUE";
                        operacao = "Seccionadora Aberta";
                        manobra = "Bay TU";
                        seccionadora89tueaberta = "Seccionadora 89TUE Aberta";

                        seccionadora89tueaberta = "Seccionadora 89TUE Aberta";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 P2 FECHADO \n ",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                status1.setText(" 89 TU-E " + eqp1.seccionadora89tue());
            }

            // ################################################# AC�O DO BOT�O DO 52 TU
            // ##############################################################
            if (e.getSource() == b33) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado do Disjuntor 52 TU?",
                        "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.disjuntor52tu().equals("Disjuntor Aberto")) {
                        b33.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                        eqp1.fecharDisjuntor52tu();
                        BDE.ConectarBD();

                        tagequipamento = "52 TU";
                        operacao = "Disjuntor Fechado";
                        manobra = "Bay TU";

                        disjuntor52tufechado = "Disjuntor 52TU Fechado";
                        PrepAlbras = "PrepAlbras";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.disjuntor52tu().equals("Disjuntor Fechado")) {
                        b33.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                        eqp1.abrirDisjuntor52tu();

                        tagequipamento = "52 TU";
                        operacao = "Disjuntor Aberto";
                        manobra = "Bay TU";

                        disjuntor52tuaberto = "Disjuntor 52TU Aberto";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();
                    }
                }
                if (eqp1.disjuntor52tu().equals("Disjuntor Fechado")
                        && eqp1.seccionadora89tu().equals("Seccionadora Aberta")
                        || eqp1.disjuntor52tu().equals("Disjuntor Fechado")
                                && eqp1.seccionadora89tue().equals("Seccionadora Aberta")) {
                    status1.setText("O TRANSFORMADOR ESTA DESENERGIZADO! ");
                }
            }

            // ####################################################### AC�O DO BOT�O DA 89
            // A1 #########################################################
            if (e.getSource() == b59) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado da Seccionadora 89 A1?",
                        "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.seccionadora89a1().equals("Seccionadora Aberta")) {
                        b59.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                        eqp1.fecharSeccionadora89a1();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 A1";
                        operacao = "Seccionadora Fechada";
                        manobra = "Bay A1";

                        seccionadora89a1fechada = "Seccionadora 89A1 Fechada";
                        EnerAlbras = "EnergizarAlbras";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.seccionadora89a1().equals("Seccionadora Fechada")
                            && eqp1.disjuntor52a1().equals("Disjuntor Aberto")) {
                        b59.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                        eqp1.abrirSeccionadora89a1();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Aberta com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 A1";
                        operacao = "Seccionadora Aberta";
                        manobra = "Bay A1";

                        seccionadora89a1aberta = "Seccionadora 89A1 Aberta";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 A1 FECHADO \n ",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                status1.setText(" 89 A1 " + eqp1.seccionadora89a1());
            }

            // ####################################################### AC�O DO BOT�O DA 89
            // A1-E #########################################################
            if (e.getSource() == b60) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado da Seccionadora 89 A1-E?",
                        "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.seccionadora89a1e().equals("Seccionadora Aberta")) {
                        b60.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
                        eqp1.fecharSeccionadora89a1e();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 A1E";
                        operacao = "Seccionadora Fechada";
                        manobra = "Bay A1";

                        seccionadora89a1efechada = "Seccionadora 89A1E Fechada";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.seccionadora89a1e().equals("Seccionadora Fechada")
                            && eqp1.disjuntor52a1().equals("Disjuntor Aberto")) {
                        b60.setIcon(new javax.swing.ImageIcon("Chave1.1.jpg"));
                        eqp1.abrirSeccionadora89a1e();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora esta 89 BTB foi Aberta com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 A1";
                        operacao = "Seccionadora Aberta";
                        manobra = "Bay A1";

                        seccionadora89a1eaberta = "Seccionadora 89A1E aberta";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 A1 FECHADO \n ",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                status1.setText(" 89 A1-E " + eqp1.seccionadora89a1e());
            }

            // ################################################# AC�O DO BOT�O DO 52 A1
            // ##############################################################
            if (e.getSource() == b61) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado do Disjuntor 52 A1?",
                        "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.disjuntor52a1().equals("Disjuntor Aberto")) {
                        b61.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                        eqp1.fecharDisjuntor52a1();

                        tagequipamento = "52 A1";
                        operacao = "Disjuntor Fechado";
                        manobra = "Bay A1";

                        disjuntor52a1fechado = "Disjuntor 52A1 Fechado";
                        // EnerAlbras = "EnergizarAlbras";
                        // DesenAlbras = "";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        // manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.disjuntor52a1().equals("Disjuntor Fechado")) {
                        b61.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                        eqp1.abrirDisjuntor52a1();

                        tagequipamento = "52 A1";
                        operacao = "Disjuntor Aberto";
                        manobra = "Bay A1";

                        disjuntor52a1aberto = "Disjuntor 52A1 Aberto";
                        // DesenAlbras = "DesenergizarAlbras";
                        // EnerAlbras = "";
                        manobrainteligente1.PrepAlbras();
                        // manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();
                    }
                }
                if (eqp1.disjuntor52a1().equals("Disjuntor Fechado")
                        && eqp1.seccionadora89a1().equals("Seccionadora Aberta")
                        || eqp1.disjuntor52a1().equals("Disjuntor Fechado")
                                && eqp1.seccionadora89a1e().equals("Seccionadora Aberta")) {
                    status1.setText("O TRANSFORMADOR ESTÁ DESENERGIZADO! ");
                }
            }

            // ################################################# AC�O DO BOT�O DO 52 G1
            // ##############################################################
            if (e.getSource() == b56) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado do Disjuntor 52 G1?",
                        "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.disjuntor52g1().equals("Disjuntor Aberto")) {
                        b56.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                        eqp1.fecharDisjuntor52g1();

                        tagequipamento = "52 G1";
                        operacao = "Disjuntor Fechado";
                        manobra = "Bay G1";

                        disjuntor52g1fechado = "Disjuntor 52G1 Fechado";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.disjuntor52g1().equals("Disjuntor Fechado")) {
                        b56.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                        eqp1.abrirDisjuntor52g1();

                        tagequipamento = "52 G1";
                        operacao = "Disjuntor Aberto";
                        manobra = "Bay G1";

                        disjuntor52g1aberto = "Disjuntor 52G1 Aberto";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();
                    }
                }
                if (eqp1.disjuntor52g1().equals("Disjuntor Fechado")) {
                    status1.setText("O MOTOR ESTÁ DESENERGIZADO! ");
                }
            }

            // ################################################# AC�O DO BOT�O DO 52 G2
            // ##############################################################
            if (e.getSource() == b55) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado do Disjuntor 52 G2?",
                        "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.disjuntor52g2().equals("Disjuntor Aberto")) {
                        b55.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                        eqp1.fecharDisjuntor52g2();

                        tagequipamento = "52 G2";
                        operacao = "Disjuntor Fechado";
                        manobra = "Bay G2";

                        disjuntor52g2fechado = "Disjuntor 52G2 Fechado";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.disjuntor52g2().equals("Disjuntor Fechado")) {
                        b55.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                        eqp1.abrirDisjuntor52g2();

                        tagequipamento = "52 G2";
                        operacao = "Disjuntor Aberto";
                        manobra = "Bay G2";

                        disjuntor52g2aberto = "Disjuntor 52G2 Aberto";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();
                    }
                }
                if (eqp1.disjuntor52g2().equals("Disjuntor Fechado")) {
                    status1.setText("O MOTOR ESTA DESENERGIZADO! ");
                }
            }

            // ####################################################### AC�O DO BOT�O DA 89
            // RF-2 #########################################################
            if (e.getSource() == b48) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado da Seccionadora 89 RF-2?",
                        "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.seccionadora89r2().equals("Seccionadora Aberta")) {
                        b48.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                        eqp1.fecharSeccionadora89r2();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 RF-2";
                        operacao = "Seccionadora Fechada";
                        manobra = "Bay RF-2";

                        seccionadora89r2fechada = "Seccionadora 89R2 Fechada";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.seccionadora89r2().equals("Seccionadora Fechada")
                            && eqp1.disjuntor52r2().equals("Disjuntor Aberto")) {
                        b48.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                        eqp1.abrirSeccionadora89r2();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Aberta com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 RF-2";
                        operacao = "Seccionadora Aberta";
                        manobra = "Bay RF-2";

                        seccionadora89r2aberta = "Seccionadora 89R2 Aberta";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R2 FECHADO \n ",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                status1.setText(" 89 R4 " + eqp1.seccionadora89r4());
            }

            // ####################################################### AC�O DO BOT�O DA 89
            // RF-2E #########################################################
            if (e.getSource() == b49) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado da Seccionadora 89 RF-2E?",
                        "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.seccionadora89r2e().equals("Seccionadora Aberta")) {
                        b49.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                        eqp1.fecharSeccionadora89r2e();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 RF-2E";
                        operacao = "Seccionadora Fechada";
                        manobra = "Bay RF-2";

                        seccionadora89r2efechada = "Seccionadora 89R2E Fechada";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.seccionadora89r2e().equals("Seccionadora Fechada")
                            && eqp1.disjuntor52r2().equals("Disjuntor Aberto")) {
                        b49.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                        eqp1.abrirSeccionadora89r2e();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Aberta com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 RF-2E";
                        operacao = "Seccionadora Aberta";
                        manobra = "Bay RF-2";

                        seccionadora89r2eaberta = "Seccionadora 89R2E Aberta";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R2 FECHADO \n ",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                status1.setText(" 89 R2E " + eqp1.seccionadora89r2e());
            }

            // ################################################# AC�O DO BOT�O DO 52 R2
            // ##############################################################
            if (e.getSource() == b50) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado do Disjuntor 52 R2?",
                        "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.disjuntor52r2().equals("Disjuntor Aberto")) {
                        b50.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                        eqp1.fecharDisjuntor52r2();

                        tagequipamento = "52 R2";
                        operacao = "Disjuntor Fechado";
                        manobra = "Bay RF-2";

                        disjuntor52r2fechado = "Disjuntor 52R2 Fechado";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.disjuntor52r2().equals("Disjuntor Fechado")) {
                        b50.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                        eqp1.abrirDisjuntor52r2();

                        tagequipamento = "52 R2";
                        operacao = "Disjuntor Aberto";
                        manobra = "Bay RF-2";

                        disjuntor52r2aberto = "Disjuntor 52R2 Aberto";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();
                    }
                }
                if (eqp1.disjuntor52r2().equals("Disjuntor Fechado")
                        && eqp1.seccionadora89r2().equals("Seccionadora Aberta")
                        || eqp1.disjuntor52r2().equals("Disjuntor Fechado")
                                && eqp1.seccionadora89r2e().equals("Seccionadora Aberta")) {
                    status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
                }
            }

            // ####################################################### AC�O DO BOT�O DA 89
            // RF-1 #########################################################
            if (e.getSource() == b51) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado da Seccionadora 89 RF-1?",
                        "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.seccionadora89r1().equals("Seccionadora Aberta")) {
                        b51.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                        eqp1.fecharSeccionadora89r1();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 RF-1";
                        operacao = "Seccionadora Fechada";
                        manobra = "Bay RF-1";

                        seccionadora89r1fechada = "Seccionadora 89R1 Fechada";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.seccionadora89r1().equals("Seccionadora Fechada")
                            && eqp1.disjuntor52r1().equals("Disjuntor Aberto")) {
                        b51.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                        eqp1.abrirSeccionadora89r1();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 RF-1";
                        operacao = "Seccionadora Aberta";
                        manobra = "Bay RF-1";

                        seccionadora89r1aberta = "Seccionadora 89R1 Aberta";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R1 FECHADO \n ",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                status1.setText(" 89 R1 " + eqp1.seccionadora89r3());
            }

            // ####################################################### AC�O DO BOT�O DA 89
            // RF-1E #########################################################
            if (e.getSource() == b52) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado da Seccionadora 89 RF-1E?",
                        "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.seccionadora89r1e().equals("Seccionadora Aberta")) {
                        b52.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
                        eqp1.fecharSeccionadora89r1e();

                        // JOptionPane.showMessageDialog(null,"A Seccionadora 89 BTB foi Fechada com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 RF-1E";
                        operacao = "Seccionadora Fechada";
                        manobra = "Bay RF-1";

                        seccionadora89r1efechada = "Seccionadora 89R1E Fechada";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();

                    } else if (eqp1.seccionadora89r1e().equals("Seccionadora Fechada")
                            && eqp1.disjuntor52r1().equals("Disjuntor Aberto")) {
                        b52.setIcon(new javax.swing.ImageIcon("Chave1.3.jpg"));
                        eqp1.abrirSeccionadora89r1e();
                        // JOptionPane.showMessageDialog(null,"A Seccionadora est� 89 BTB foi Aberta com
                        // Sucesso!","Seccionadora",JOptionPane.INFORMATION_MESSAGE,(new
                        // javax.swing.ImageIcon("formiga.gif")));

                        tagequipamento = "89 RF-1E";
                        operacao = "Seccionadora Aberta";
                        manobra = "Bay RF-1";

                        seccionadora89r1eaberta = "Seccionadora 89R1E Aberta";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Logica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 R1 FECHADO \n ",
                                "Logica", JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("java1.jpg")));
                    }
                }
                status1.setText(" 89 R1E " + eqp1.seccionadora89r1e());
            }

            // ################################################# AC�O DO BOT�O DO 52 R1
            // ##############################################################
            if (e.getSource() == b53) {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(this,
                        "Voce realmente deseja alterar o estado do Disjuntor 52 R1?",
                        "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

                if (n == JOptionPane.YES_OPTION) {
                    if (eqp1.disjuntor52r1().equals("Disjuntor Aberto")) {
                        b53.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                        eqp1.fecharDisjuntor52r1();

                        tagequipamento = "52 R1";
                        operacao = "Disjuntor Fechado";
                        manobra = "Bay RF-1";

                        disjuntor52r1fechado = "Disjuntor 52R1 Fechado";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();
                    } else if (eqp1.disjuntor52r1().equals("Disjuntor Fechado")) {
                        b53.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                        eqp1.abrirDisjuntor52r1();

                        tagequipamento = "52 R1";
                        operacao = "Disjuntor Aberto";
                        manobra = "Bay RF-1";

                        disjuntor52r1aberto = "Disjuntor 52R1 Aberto";
                        manobrainteligente1.PrepAlbras();
                        manobrainteligente1.EnerAlbras();
                        manobrainteligente1.DesenAlbras();
                        manobrainteligente1.TransfMT1MTR();
                        manobrainteligente1.TransfMTRMT1();
                        manobrainteligente1.DeslProgRed1();
                        manobrainteligente1.NormRed1();
                        manobrainteligente1.EnerGerador();
                        manobrainteligente1.EnergBarraEM();
                        manobrainteligente1.DesenBarraEM();
                    }
                }
                if (eqp1.disjuntor52r1().equals("Disjuntor Fechado")
                        && eqp1.seccionadora89r1().equals("Seccionadora Aberta")
                        || eqp1.disjuntor52r1().equals("Disjuntor Fechado")
                                && eqp1.seccionadora89r1e().equals("Seccionadora Aberta")) {
                    status1.setText("O RETIFICADOR ESTA DESENERGIZADO! ");
                }
            }
            // ##################### ACAO DO BOTAO SAIR ################################

            if (e.getSource() == b34) // ----------- BOTAO SAIR ----------------//
            {
                setVisible(false);
            }
            if (e.getSource() == b40) {
                setVisible(false);
            }
        }

        public void atualizaConfiguracao() {
            eqp1.fecharSeccionadora89lvr1();
            eqp1.fecharDisjuntor52lvr1();
            eqp1.fecharSeccionadora89a2e();
            eqp1.fecharDisjuntor52a2();
            eqp1.fecharSeccionadora89a1();
            eqp1.fecharDisjuntor52a1();
            eqp1.fecharSeccionadora89r2();
            eqp1.fecharDisjuntor52r2();
            eqp1.fecharSeccionadora89r1();
            eqp1.fecharDisjuntor52r1();
            b19.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
            b21.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
            b25.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
            b26.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
            b48.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
            b50.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
            b51.setIcon(new javax.swing.ImageIcon("Chave1.4.jpg"));
            b53.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
            b59.setIcon(new javax.swing.ImageIcon("Chave1.2.jpg"));
            b61.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
        }
    }

    // ########################################### Menu Geral das Manobras
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

    // ########################################## Menu das Manobras de Transferência
    public class MenuManobrasTransf extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        // private JPanel jpPainel = new JPanel();

        public MenuManobrasTransf() // --- Configura��o do Frame
        {
            super("Menu Manobras Transferencia");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout

            setSize(630, 456);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);

            // JLabel lbindice;

            // final JLabel mostrar1;
            // final JLabel mostrar2;
            // final JLabel mostrar3;

            // JLabel lbL1;
            // JLabel lbL2;
            // JLabel lbL3;
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
            bLimpar.setToolTipText("Pressione limpar a memória");
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

            bTransfMT1MTR.setBackground(new Color(180, 180, 250));
            bTransfMTRMT1.setBackground(new Color(180, 180, 250));
            // bTransfMT2MTR.setBackground(new Color(180, 180, 250));
            // bTransfMTRMT2.setBackground(new Color(180, 180, 250));
            // bTransfMT3MTR.setBackground(new Color(180, 180, 250));
            // bTransfMTRMT3.setBackground(new Color(180, 180, 250));
            // bTransfMT4MTR.setBackground(new Color(180, 180, 250));
            // bTransfMTRMT4.setBackground(new Color(180, 180, 250));

            container.add(painel);

            bTransfMT1MTR.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        TransfMT1MTR = "TransferirMT1MTR";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: "
                                + "Manobra para Transferir do MT-1 para MT-R                                  ");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para transferir as cargas do MT-1 para o MT-R foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bTransfMTRMT1.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        TransfMTRMT1 = "TransferirMTRMT1";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇAO: " + " Manobra para Tranferir do MT-R para MT-1");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para transferir as cargas do MT-R para o MT-1 foi Habilitada com Sucesso!!!");
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

    // ############################################# Menu das Manobras da Redução
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

            // final JLabel mostrar1;
            // final JLabel mostrar2;
            // final JLabel mostrar3;

            // JLabel lbL1;
            // JLabel lbL2;
            // JLabel lbL3;
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

            bDesligamentoProgRed1.setBackground(new Color(180, 180, 250));
            bNormalizaçaoRed1.setBackground(new Color(180, 180, 250));
            // bDesligamentoProgRed2.setBackground(new Color(180, 180, 250));
            // bNormalizaçaoRed2.setBackground(new Color(180, 180, 250));
            // bDesligamentoProgRed3.setBackground(new Color(180, 180, 250));
            // bNormalizaçaoRed3.setBackground(new Color(180, 180, 250));
            // bDesligamentoProgRed4.setBackground(new Color(180, 180, 250));
            // bNormalizaçaoRed4.setBackground(new Color(180, 180, 250));

            container.add(painel);

            bDesligamentoProgRed1.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        DeslProgRed1 = "DeslProgRed1";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: "
                                + "Manobra para Desligamento da Reduçao 1                                  ");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para Desligamento da Reduçao 1 foi Habilitada com Sucesso!!!");
                    }
                }
            });

            bNormalizaçaoRed1.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        NormRed1 = "NormalizacaoRed1";
                        status1.setText(
                                "MANOBRA HABILITADA PARA SIMULAÇAO: " + " Manobra para Normalizaçao da Reduçao 1");
                        JOptionPane.showMessageDialog(null,
                                "A Manobra para Normalizaçao da Reduçao 1 foi Habilitada com Sucesso!!!");
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

    // ############################################# Menu das Manobras dos Geradores
    public class MenuManobrasGerador extends JFrame implements ActionListener {
        private JLabel gif, projeto;

        // private JPanel jpPainel = new JPanel();

        public MenuManobrasGerador() // --- Configura��o do Frame
        {
            super("Menu Manobras dos Geradores");
            Container container = getContentPane();
            container.setLayout(new BorderLayout()); // gerenciador de layout

            setSize(630, 377);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);

            JLabel lbHabilitarManobra;
            JLabel lbConferirManobra;

            JButton bEnergizaçaodaBarraEmpeloGerador;
            JButton bDesenergizaçaodaBarraEmpeloGerador;
            JButton bEnergizaçaodasCargaspeloGerador;
            JButton bDesligamentodasCargasalimentadasGerador;
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

            bEnergizaçaodaBarraEmpeloGerador = new JButton("Energizaçao da Barra EM pelo Gerador");
            bEnergizaçaodaBarraEmpeloGerador.setToolTipText("Pressione para executar a manobra ");
            bEnergizaçaodaBarraEmpeloGerador.setMnemonic(KeyEvent.VK_1);
            bEnergizaçaodaBarraEmpeloGerador.setActionCommand("Manobras");// define o nome da acao
            bEnergizaçaodaBarraEmpeloGerador.setBounds(2, 110, 304, 40); // Coluna,Linha,Largura,Altura
            bEnergizaçaodaBarraEmpeloGerador.setBackground(new Color(180, 180, 250));
            getContentPane().add(bEnergizaçaodaBarraEmpeloGerador);

            bDesenergizaçaodaBarraEmpeloGerador = new JButton("Desenergizaçao da Barra EM pelo Gerador");
            bDesenergizaçaodaBarraEmpeloGerador.setToolTipText("Pressione para executar a manobra ");
            bDesenergizaçaodaBarraEmpeloGerador.setMnemonic(KeyEvent.VK_2);
            bDesenergizaçaodaBarraEmpeloGerador.setActionCommand("Manobras");// define o nome da acao
            bDesenergizaçaodaBarraEmpeloGerador.setBounds(306, 110, 304, 40); // Coluna,Linha,Largura,Altura
            bDesenergizaçaodaBarraEmpeloGerador.setBackground(new Color(180, 180, 250));
            getContentPane().add(bDesenergizaçaodaBarraEmpeloGerador);

            bEnergizaçaodasCargaspeloGerador = new JButton("Energizaçao das Cargas pelo Gerador");
            bEnergizaçaodasCargaspeloGerador.setToolTipText("Pressione para executar a manobra ");
            bEnergizaçaodasCargaspeloGerador.setMnemonic(KeyEvent.VK_2);
            bEnergizaçaodasCargaspeloGerador.setActionCommand("Manobras");// define o nome da acao
            bEnergizaçaodasCargaspeloGerador.setBounds(2, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bEnergizaçaodasCargaspeloGerador);

            bDesligamentodasCargasalimentadasGerador = new JButton("Deslig. das Cargas Alimentadas pelo Gerador");
            bDesligamentodasCargasalimentadasGerador.setToolTipText("Pressione para executar a manobra ");
            bDesligamentodasCargasalimentadasGerador.setMnemonic(KeyEvent.VK_1);
            bDesligamentodasCargasalimentadasGerador.setActionCommand("Manobras");// define o nome da acao
            bDesligamentodasCargasalimentadasGerador.setBounds(306, 149, 304, 40); // Coluna,Linha,Largura,Altura
            getContentPane().add(bDesligamentodasCargasalimentadasGerador);

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

            bManobraPadrao = new JButton(" Manobra Padrao "); // BOT�O TABELA DE EVENTOS
            bManobraPadrao.setToolTipText("Pressione conferir a manobra padrao");
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

            bEnergizaçaodaBarraEmpeloGerador.addActionListener(new ActionListener() // A��o do bot�o Gravar
            {
                public void actionPerformed(ActionEvent evt) {
                    {
                        EnergBarraEM = "EnergBarraEM";
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: "
                                + "Manobra para Energizar a Barra EM pelo Gerador                                  ");
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
                        status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: "
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
                            "MANOBRA HABILITADA PARA SIMULAÇAO: " + " Manobra para Desligar as Cargas pelo Gerador");
                    JOptionPane.showMessageDialog(null,
                            "A Manobra para Desligar as Cargas pelo Gerador foi Habilitada com Sucesso!!!");
                }
            });

            bDesenergizaçaodaBarraEmpeloGerador.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    DesenBarraEM = "DesenBarraEM";
                    status1.setText("MANOBRA HABILITADA PARA SIMULAÇAO: "
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

            setSize(440, 450);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);

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

            setSize(455, 450);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setResizable(false);

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
                        // mostrar5.setText("5.Abrir Seccionadora 89 LVRR-E ");
                        // mostrar6.setText("6. Abrir Seccionadora 89 LVR-R");
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
                if (seccionadora89a2eaberta.equals("Seccionadora 89A2E Aberta") && passo == 0) {
                    relogio.zeraOtempo();
                    relogio.iniciaTempo();
                    passo = passo + 1;
                    relogio.setVisible(true);
                    relogio.passo = 1;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 1 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p1aberta.equals("Seccionadora 89P1 Aberta") && passo == 1) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p2aberta.equals("Seccionadora 89P2 Aberta") && passo == 2) {
                    passo = passo + 1;
                    relogio.passo = 3;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89a2efechada.equals("Seccionadora 89A2E Fechada") && passo == 3) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p1efechada.equals("Seccionadora 89P1E Fechada") && passo == 4) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89p2efechada.equals("Seccionadora 89P2E Fechada") && passo == 5) {
                    passo = passo + 1;
                    relogio.passo = 2;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (seccionadora89tuefechada.equals("Seccionadora 89TUE Fechada") && passo == 6) {
                    passo = passo + 1;
                    relogio.passo = 7;
                    relogio.rendimento();
                    JOptionPane.showMessageDialog(null, "Passo 23 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (disjuntor52tufechado.equals("Disjuntor 52TU Fechado") && passo == 7) {
                    passo = passo + 1;
                    relogio.passo = 8;
                    relogio.rendimento();
                    relogio.setVisible(true);
                    relogio.atualizaTempo();
                    JOptionPane.showMessageDialog(null, "Passo 24 realizado com sucesso !!!",
                            "Preparar Subestaçao ALBRAS", JOptionPane.INFORMATION_MESSAGE);

                    if (passo == 8 && disjuntor52tufechado.equals("Disjuntor 52TU Fechado") ||
                            passo != 8)
                        JOptionPane.showMessageDialog(null, "OM para Preparar Subestaçao ALBRAS Concluída com Sucesso!",
                                "OM para Preparar Subestaçao ALBRAS",
                                JOptionPane.INFORMATION_MESSAGE);
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
        seccionadora89r1fechada = "";
        seccionadora89r2fechada = "";
        seccionadora89r3fechada = "";
        seccionadora89r4fechada = "";
        seccionadora89r5fechada = "";
        seccionadora89r6fechada = "";
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
        disjuntor52tuaberto = "";
        disjuntor52lvr1fechado = "";
        disjuntor52lvr1aberto = "";
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
        new InterfaceMT1().setVisible(true);
        // InterfaceMT1 application = new InterfaceMT1();
    }
}