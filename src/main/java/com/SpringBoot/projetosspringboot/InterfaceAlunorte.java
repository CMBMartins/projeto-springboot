
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
 * MODULO -   INTERFACEALUNORTE                             *
 ******************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat; //Carregar este pacote
import java.io.*;
import java.net.*;

// ################################################### CLASSE INTERFACE ALUNORTE

public class InterfaceAlunorte extends JFrame implements ActionListener {
    JLabel Alarmes;
    JLabel tap, valortap, tensao, trafo, barra1, barra2, tap1, tap2, valortap1, valortap2, trafo1, trafo2, subir,
            descer;
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
    int passo = 0;
    String nome, senha, data, Usuario, tagequipamento, operacao, manobra;;
    ImageIcon icone = new ImageIcon("");
    JPanel painel;

    Equipamentos eqp = new Equipamentos();
    Equipamentos345kV eqp1 = new Equipamentos345kV();
    BDadosUsuario U = new BDadosUsuario();
    BDadosAcesso BDE = new BDadosAcesso();
    BDOperaçoes BDO = new BDOperaçoes();
    BDEquipamentos BDEQ = new BDEquipamentos();
    // ManobraInteligente manobrainteligente = new ManobraInteligente();

    String seccionadora89l1fechada = "";
    String seccionadora89l1afechada = "";
    String seccionadora89l1bfechada = "";
    String seccionadora89l1aberta = "";
    String seccionadora89l1aaberta = "";
    String seccionadora89l1baberta = "";
    String seccionadora89l2fechada = "";
    String seccionadora89l2afechada = "";
    String seccionadora89alafechada = "";
    String seccionadora89alaaberta = "";
    String seccionadora89bpafechada = "";
    String seccionadora89bpaaberta = "";
    String seccionadora89bpbfechada = "";
    String seccionadora89bpbaberta = "";
    String seccionadora89l2bfechada = "";
    String seccionadora89l2aberta = "";
    String seccionadora89l2aaberta = "";
    String seccionadora89l2baberta = "";
    String seccionadora89albfechada = "";
    String seccionadora89albaberta = "";
    String seccionadora89alaberta = "";
    String seccionadora89alfechada = "";
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
    String seccionadora89a2eaberta = "";
    String seccionadora89a4eaberta = "";
    String seccionadora89a6eaberta = "";
    String seccionadora89a8eaberta = "";
    String seccionadora89p1aberta = "";
    String seccionadora89lvrreaberta = "";
    String seccionadora89lvrraberta = "";
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
    String seccionadora89c1aberta = "";
    String seccionadora89c2aberta = "";
    String seccionadora89c3aberta = "";
    String seccionadora89c4aberta = "";
    String seccionadora89c5aberta = "";
    String seccionadora89c6aberta = "";
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
    String seccionadora89tueaberta = "";
    String seccionadora89tuefechada = "";
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
    String disjuntor52tufechado = "";
    String disjuntor52tuaberto = "";
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

    public InterfaceAlunorte() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout()); // gerenciador de layout
        setResizable(false);

        setTitle(" Bay da Alunorte ");
        setSize(820, 560);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        c.setBackground(new Color(0, 128, 128));
        // setLocation(100, 50);

        Object[] options = { "Sim", "Nao", "Cancelar" };
        int n = JOptionPane.showOptionDialog(null,
                "Voce deseja habilitar alguma manobra para Simulaçao? ",
                "Habilitar", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        if (n == JOptionPane.YES_OPTION) {
            // MenuManobrasG MM = new MenuManobrasG();
            // MM.setVisible(true);
        }

        JLabel l1 = new JLabel();
        l1.setFont(new Font("ARIAL", 1, 30));
        l1.setText(" BARRAMENTO DE 230 KV ");
        l1.setForeground(Color.blue);

        Icon imagem1 = new ImageIcon("Carlos4.GIF");
        gif1 = new JLabel();
        gif1.setIcon(imagem1);
        gif1.setBackground(new Color(0, 128, 128)); // cor de fundo do bot�o
        gif1.setBounds(758, 444, 100, 100); // Coluna,Linha,Largura,Altura
        getContentPane().add(gif1);

        // -���������������������������-CRIAÇÃO DO PANEL E ADIÇÃOO NO CONTAINER

        painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(new Color(0, 128, 128));
        painel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(02, 128, 128));
        p1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p1.add(l1);
        c.add(p1, java.awt.BorderLayout.NORTH);

        b42 = new JButton("");
        b42.setIcon(new javax.swing.ImageIcon("telecomando.jpg"));
        b42.addActionListener(this);
        b42.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b42.setToolTipText("Pressione para energizar na configuração padrão");
        b42.setHorizontalTextPosition(AbstractButton.CENTER);
        b42.setVerticalTextPosition(AbstractButton.CENTER);
        b42.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b42.setBounds(2, 0, 50, 50);
        painel.add(b42);

        // ���������������������������������������������� BARRAS A E B
        JPanel v = new JPanel(); // Barra A
        v.setBounds(400, 5, 400, 3);
        v.setBackground(Color.red);
        painel.add(v);

        JPanel v1 = new JPanel(); // Barra B
        v1.setBounds(400, 30, 400, 3);
        v1.setBackground(Color.red);
        painel.add(v1);

        barra1 = new JLabel("A"); // IDENTIFICAC�O DA BARRA A
        barra1.setForeground(Color.blue);
        barra1.setBounds(400, 0, 60, 30);
        painel.add(barra1);

        barra2 = new JLabel("B");
        barra2.setForeground(Color.blue);
        barra2.setBounds(400, 25, 60, 30); // IDENTIFICACAO DA BARRA B
        painel.add(barra2);

        // ##################################### IDENTIFICACAO DOS EQUIPAMENTOS
        l1a = new JLabel("89 AL-A");
        l1a.setForeground(Color.blue);
        l1a.setBounds(510, 40, 60, 30);
        painel.add(l1a);
        l1b = new JLabel("89 AL-B");
        l1b.setForeground(Color.blue);
        l1b.setBounds(595, 40, 60, 30);
        painel.add(l1b);
        l189 = new JLabel("89 AL");
        l189.setForeground(Color.blue);
        l189.setBounds(570, 215, 60, 30);
        painel.add(l189);
        l157 = new JLabel("57 AL");
        l157.setForeground(Color.blue);
        l157.setBounds(510, 280, 60, 30);
        painel.add(l157);
        l1 = new JLabel("Alimentação 230 Kv");
        l1.setForeground(Color.blue);
        l1.setBounds(502, 342, 150, 30);
        painel.add(l1);
        l1 = new JLabel("ALUNORTE");
        l1.setForeground(Color.blue);
        l1.setBounds(528, 355, 150, 30);
        painel.add(l1);
        l2a = new JLabel("89 BP-A");
        l2a.setForeground(Color.blue);
        l2a.setBounds(660, 40, 60, 30);
        painel.add(l2a);
        l2b = new JLabel("89 BP-B");
        l2b.setForeground(Color.blue);
        l2b.setBounds(743, 40, 60, 30);
        painel.add(l2b);

        l152 = new JLabel("52 AL");
        l152.setForeground(Color.blue);
        l152.setBounds(570, 150, 60, 30);
        painel.add(l152);

        tensao = new JLabel("Tensao de Linha:0 kV");
        tensao.setForeground(Color.blue);
        tensao.setBounds(665, 5, 200, 30);
        painel.add(tensao);
        subir = new JLabel("Sair");
        subir.setForeground(Color.blue);
        subir.setBounds(395, 429, 32, 40);
        painel.add(subir);

        // ������������������������������������������� BAY DA LINHA AL

        JPanel v22 = new JPanel(); // SECCIONADORA 89 AL-A
        v22.setBounds(505, 8, 3, 55);
        v22.setBackground(Color.red);
        painel.add(v22);

        JPanel v23 = new JPanel();
        v23.setBounds(505, 103, 3, 23); // Seccionadora 89 AL-A / Disjuntor
        v23.setBackground(Color.red);
        painel.add(v23);

        JPanel v24 = new JPanel(); // Seccionadora 89 AL-B
        v24.setBounds(590, 30, 3, 33);
        v24.setBackground(Color.red);
        painel.add(v24);

        JPanel v25 = new JPanel(); // SECCIONADORA 89 L1-A / DISJUNTOR 52 AL
        v25.setBounds(590, 103, 3, 23);
        v25.setBackground(Color.red);
        painel.add(v25);

        JPanel v26 = new JPanel(); // DISJUNTOR / SECCIONADORA 89 AL-A
        v26.setBounds(550, 185, 3, 23);
        v26.setBackground(Color.red);
        painel.add(v26);

        JPanel v27 = new JPanel(); // SECCIONADORA AL-A / SECCIONADORA AL-B
        v27.setBounds(505, 125, 88, 3);
        v27.setBackground(Color.red);
        painel.add(v27);

        JPanel v28 = new JPanel(); // SECCIONADORA / DISJUNTOR
        v28.setBounds(550, 126, 3, 20);
        v28.setBackground(Color.red);
        painel.add(v28);

        JPanel v48 = new JPanel();
        v48.setBounds(550, 252, 3, 88); // Seccionadora 89 AL / Alimentador AL
        v48.setBackground(Color.red);
        painel.add(v48);

        JPanel v66 = new JPanel(); // SETA
        v66.setBounds(546, 338, 11, 5);
        v66.setBackground(Color.red);
        painel.add(v66);

        JPanel v67 = new JPanel(); // SETA
        v67.setBounds(547, 343, 9, 4);
        v67.setBackground(Color.red);
        painel.add(v67);

        JPanel v68 = new JPanel(); // SETA
        v68.setBounds(548, 346, 7, 3);
        v68.setBackground(Color.red);
        painel.add(v68);

        JPanel v69 = new JPanel(); // SETA
        v69.setBounds(549, 349, 5, 2);
        v69.setBackground(Color.red);
        painel.add(v69);

        JPanel v70 = new JPanel(); // SETA
        v70.setBounds(550, 351, 3, 2);
        v70.setBackground(Color.red);
        painel.add(v70);

        JPanel v49 = new JPanel(); // SECCIONADORA 57 AL-A / SECCIONADORA 89 AL
        v49.setBounds(490, 256, 60, 3);
        v49.setBackground(Color.red);
        painel.add(v49);

        JPanel v50 = new JPanel(); // SECCIONADORA 57 AL-A / SECCIONADORA 89 AL
        v50.setBounds(490, 256, 3, 20);
        v50.setBackground(Color.red);
        painel.add(v50);

        JPanel v51 = new JPanel(); // SECCIONADORA 57 AL / ATERRAMENTO
        v51.setBounds(490, 316, 3, 20);
        v51.setBackground(Color.red);
        painel.add(v51);

        JPanel v56 = new JPanel(); // ATERRAMENTO
        v56.setBounds(484, 335, 15, 1);
        v56.setBackground(Color.red);
        painel.add(v56);

        JPanel v57 = new JPanel(); // ATERRAMENTO
        v57.setBounds(486, 337, 12, 1);
        v57.setBackground(Color.red);
        painel.add(v57);

        JPanel v58 = new JPanel(); // ATERRAMENTO
        v58.setBounds(488, 339, 9, 1);
        v58.setBackground(Color.red);
        painel.add(v58);

        JPanel v59 = new JPanel(); // ATERRAMENTO
        v59.setBounds(490, 341, 6, 1);
        v59.setBackground(Color.red);
        painel.add(v59);

        JPanel v60 = new JPanel(); // ATERRAMENTO
        v60.setBounds(492, 343, 3, 1);
        v60.setBackground(Color.red);
        painel.add(v60);

        // ���������������������������������������� BAY DA SECCIONADORA 89 AL

        JPanel v29 = new JPanel(); // SECCIONADORA 89 AL-A
        v29.setBounds(655, 8, 3, 55);
        v29.setBackground(Color.red);
        painel.add(v29);

        JPanel v30 = new JPanel();
        v30.setBounds(655, 103, 3, 23); // Seccionadora 89 AL-A / Disjuntor
        v30.setBackground(Color.red);
        painel.add(v30);

        JPanel v31 = new JPanel(); // Seccionadora 89 AL-B
        v31.setBounds(740, 30, 3, 33);
        v31.setBackground(Color.red);
        painel.add(v31);

        JPanel v32 = new JPanel(); // SECCIONADORA 89 AL-A / DISJUNTOR 52 AL
        v32.setBounds(740, 103, 3, 23);
        v32.setBackground(Color.red);
        painel.add(v32);

        JPanel v34 = new JPanel(); // SECCIONADORA AL-A / SECCIONADORA AL-B
        v34.setBounds(655, 125, 88, 3);
        v34.setBackground(Color.red);
        painel.add(v34);

        JPanel v52 = new JPanel(); // SECCIONADORA 89 AL / ALIMENTADOR
        v52.setBounds(701, 126, 3, 133);
        v52.setBackground(Color.red);
        painel.add(v52);

        JPanel v53 = new JPanel(); // SECCIONADORA AL-A / SECCIONADORA AL-B
        v53.setBounds(552, 256, 150, 3);
        v53.setBackground(Color.red);
        painel.add(v53);

        // ����������������������������������� CRIAÇÃO DO BOTÃO 89 AL-A

        b19 = new JButton(); // BOTAO CS 89 AL-A
        b19.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
        b19.addActionListener(this);
        b19.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b19.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b19.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b19.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b19.setForeground(Color.black);// cor do titulo do bot�o
        b19.setEnabled(true);
        b19.setToolTipText("Pressione para operar a Seccionadora 89 AL-A");
        b19.setMnemonic(KeyEvent.VK_B);
        b19.setActionCommand("89ALA");// define o nome da acao
        b19.setBounds(490, 62, 33, 45);
        painel.add(b19);

        // ����������������������������������� CRIAÇÃO DO BOTÃO 89 AL-B

        b20 = new JButton(); // BOTAO CS 89 AL-B
        b20.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
        b20.addActionListener(this);
        b20.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b20.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b20.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b20.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b20.setForeground(Color.black);// cor do titulo do bot�o
        b20.setEnabled(true);
        b20.setToolTipText("Pressione para operar a Seccionadora 89 AL-B");
        b20.setMnemonic(KeyEvent.VK_B);
        b20.setActionCommand("89ALB");// define o nome da acao
        b20.setBounds(575, 62, 33, 45);
        painel.add(b20);

        // ����������������������������������� CRIAÇÃO DO BOTÃO 52 AL

        b21 = new JButton(); // BOTAO 52 AL
        b21.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b21.addActionListener(this);
        b21.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b21.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b21.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b21.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b21.setForeground(Color.black);// cor do titulo do bot�o
        b21.setEnabled(true);
        b21.setToolTipText("Pressione para operar O Disjuntor 52 AL");
        b21.setMnemonic(KeyEvent.VK_B);
        b21.setActionCommand("52AL");// define o nome da acao
        b21.setBounds(535, 145, 33, 42);
        painel.add(b21);

        // ����������������������������������� CRIAÇÃO DO BOTÃO 89 AL

        b22 = new JButton(); // BOTÃO CS 89 AL
        b22.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
        b22.addActionListener(this);
        b22.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b22.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b22.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b22.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b22.setForeground(Color.black);// cor do titulo do bot�o
        b22.setEnabled(true);
        b22.setToolTipText("Pressione para operar a Seccionadora 89 AL");
        b22.setMnemonic(KeyEvent.VK_B);
        b22.setActionCommand("89AL");// define o nome da acao
        b22.setBounds(535, 208, 33, 45);
        painel.add(b22);

        // ����������������������������������� CRIAÇAO DO BOTAO 57 AL

        b23 = new JButton(); // BOT�O CS 57 L1
        b23.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
        b23.setHorizontalTextPosition(AbstractButton.CENTER); // posicao do texto
        b23.setVerticalTextPosition(AbstractButton.CENTER); // posi��o do texto
        b23.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b23.setBackground(new Color(192, 192, 192)); // cor de fundo do bot�o
        b23.setBounds(475, 276, 33, 45);
        painel.add(b23);

        // ����������������������������������� CRIAÇÃO DO BOTÃO 89 BPA

        b24 = new JButton(); // BOTAO CS 89 BP-A
        b24.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
        b24.addActionListener(this);
        b24.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b24.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b24.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b24.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b24.setForeground(Color.black);// cor do titulo do bot�o
        b24.setEnabled(true);
        b24.setToolTipText("Pressione para operar a Seccionadora 89 BP-A");
        b24.setMnemonic(KeyEvent.VK_B);
        b24.setActionCommand("89BPA");// define o nome da acao
        b24.setBounds(640, 62, 33, 45);
        painel.add(b24);

        // ����������������������������������� CRIAÇÃO DO BOTÃO 89 BP-B

        b25 = new JButton(); // BOTÃO CS 89 BP-B
        b25.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
        b25.addActionListener(this);
        b25.setHorizontalTextPosition(AbstractButton.CENTER);// posicao do texto
        b25.setVerticalTextPosition(AbstractButton.CENTER);// posi��o do texto
        b25.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b25.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b25.setForeground(Color.black);// cor do titulo do bot�o
        b25.setEnabled(true);
        b25.setToolTipText("Pressione para operar a Seccionadora 89 BP-B");
        b25.setMnemonic(KeyEvent.VK_B);
        b25.setActionCommand("89BPB");// define o nome da acao
        b25.setBounds(725, 62, 33, 45);
        painel.add(b25);

        // ��������������������������������������� CRIAÇãO DO BOTÃO SAIR

        b34 = new JButton("");
        b34.setIcon(new javax.swing.ImageIcon("Porta.jpg"));
        b34.addActionListener(this);
        b34.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b34.setToolTipText("Pressione para encerrar o programa");
        b34.setHorizontalTextPosition(AbstractButton.CENTER);
        b34.setVerticalTextPosition(AbstractButton.CENTER);
        b34.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b34.setBounds(390, 399, 32, 58); // coluna, linha, altura, largura
        painel.add(b34);

        // ��������������������������������������� BOT�O SETA

        b40 = new JButton("");
        b40.setIcon(new javax.swing.ImageIcon("Seta.jpg"));
        b40.addActionListener(this);
        b40.setBackground(new Color(192, 192, 192));// cor de fundo do bot�o
        b40.setToolTipText("Pressione para retornar ao Menu das Telas de Telecomando");
        b40.setHorizontalTextPosition(AbstractButton.CENTER);
        b40.setVerticalTextPosition(AbstractButton.CENTER);
        b40.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        b40.setBounds(80, 240, 30, 30);
        painel.add(b40);

        c.add(painel, java.awt.BorderLayout.CENTER);
        // setDefaultOpenOperation(javax.swing.WindowConstants.AlwaysOnTop);
        // atualizaConfiguracao();
    }

    // -��������������������������������������������������������������
    public void actionPerformed(ActionEvent e) // metodo implementado pelo ActionListener
    {
        // if (tfPerfil.getText().equals("Administrador") ||
        // tfPerfil.getText().equals("administrador")
        // || tfPerfil.getText().equals("Usuario") ||
        // tfPerfil.getText().equals("usuario")
        // || tfPerfil.getText().equals("usuario")) {

        if (e.getSource() == b19)// ���������������������� AÇAO DO BOTAO DA CS 89 AL-A
        {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado da Seccionadora 89 AL-A?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp.seccionadora89ala().equals("Seccionadora Aberta")) {
                    b19.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                    eqp.fecharSeccionadora89ala();
                    BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 AL-A";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay AL-A";
                    BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89alaFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89ala();

                    seccionadora89alafechada = "Seccionadora 89AL-A Fechada";
                    // manobrainteligente.EnerL1();
                    // manobrainteligente.EnerL1InterBarra();
                    // manobrainteligente.EnerMT1BarraA();
                    // manobrainteligente.EnerMTRBarraA();
                    // manobrainteligente.EnerMT3BarraA();
                    // manobrainteligente.DesenMT1BarraA();
                    // manobrainteligente.DesenMTRBarraA();
                    // manobrainteligente.DesenMT2BarraB();
                    // manobrainteligente.DesenMT3BarraA();
                    // manobrainteligente.DesenerL1();
                    // manobrainteligente.DesenerL1InterBarra();

                    // manobrainteligente.EnerL2();
                    // manobrainteligente.EnerL2InterBarra();
                    // manobrainteligente.EnerMT2BarraB();
                    // manobrainteligente.EnerMT4BarraB();
                    // manobrainteligente.DesenMT4BarraB();
                    // manobrainteligente.DesenerL2();
                    // manobrainteligente.DesenerL2InterBarra();

                }

                else if (eqp.seccionadora89ala().equals("Seccionadora Fechada")
                        && eqp.disjuntor52al().equals("Disjuntor Aberto")
                        || eqp.seccionadora89alb().equals("Seccionadora Aberta"))
                // && eqp.disjuntor52bt().equals("Disjuntor Fechado"))
                {
                    b19.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                    eqp.abrirSeccionadora89ala();
                    BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 AL-A";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay AL";
                    BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89alaAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.quantAbertura89ala();
                    seccionadora89alaaberta = "Seccionadora 89AL-A Aberta";
                    // manobrainteligente.EnerL1();
                    // manobrainteligente.EnerL1InterBarra();
                    // manobrainteligente.EnerMT1BarraA();
                    // manobrainteligente.EnerMTRBarraA();
                    // manobrainteligente.EnerMT3BarraA();
                    // manobrainteligente.DesenMT1BarraA();
                    // manobrainteligente.DesenMTRBarraA();
                    // manobrainteligente.DesenMT2BarraB();
                    // manobrainteligente.DesenMT3BarraA();
                    // manobrainteligente.DesenerL1();
                    // manobrainteligente.DesenerL1InterBarra();

                    // manobrainteligente.EnerL2();
                    // manobrainteligente.EnerL2InterBarra();
                    // manobrainteligente.EnerMT2BarraB();
                    // manobrainteligente.EnerMT4BarraB();
                    // manobrainteligente.DesenMT4BarraB();
                    // manobrainteligente.DesenerL2();
                    // manobrainteligente.DesenerL2InterBarra();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Lógica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 AL FECHADO! \n",
                            "Lógica", JOptionPane.INFORMATION_MESSAGE,
                            (new javax.swing.ImageIcon("java1.jpg")));
                }
                status2.setText(" Equipamento operado: " + "89AL-A " + eqp.seccionadora89ala());
            }
        }

        // ���������������������������������������� AÇAO DO BOTAO DO DJ 52 AL
        if (e.getSource() == b21) {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado do Disjuntor 52 AL?",
                    "Disjuntor", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp.disjuntor52al().equals("Disjuntor Aberto")) // &&
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
                    eqp.fecharDisjuntor52al();
                    b21.setIcon(new javax.swing.ImageIcon("Disjuntor2.jpg"));
                    status2.setText(" Equipamento operado: " + "52 AL " + eqp.disjuntor52al());
                    BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Disjuntor 52 AL";
                    operacao = "Disjuntor Fechado";
                    manobra = "Bay AL";
                    BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento52al();
                    disjuntor52alfechado = "Disjuntor 52AL Fechado";
                    // manobrainteligente.EnerAlbras();
                    // manobrainteligente.DesenAlbras();
                    // manobrainteligente.EnerL1();
                    // manobrainteligente.EnerL1InterBarra();
                    // manobrainteligente.EnerMT1BarraA();
                    // manobrainteligente.EnerMTRBarraA();
                    // manobrainteligente.EnerMT3BarraA();
                    // anobrainteligente.DesenMT1BarraA();
                    // manobrainteligente.DesenMTRBarraA();
                    // manobrainteligente.DesenMT2BarraB();
                    // manobrainteligente.DesenMT3BarraA();
                    // manobrainteligente.DesenerL1();
                    // manobrainteligente.DesenerL1InterBarra();

                    // manobrainteligente.EnerL2();
                    // manobrainteligente.EnerL2InterBarra();
                    // manobrainteligente.EnerMT2BarraB();
                    // manobrainteligente.EnerMT4BarraB();
                    // manobrainteligente.DesenMT4BarraB();
                    // manobrainteligente.DesenerL2();
                    // manobrainteligente.DesenerL2InterBarra();

                } else if (eqp.disjuntor52al().equals("Disjuntor Fechado")) // &&
                                                                            // eqp.seccionadora89mtra().equals("Seccionadora
                                                                            // Fechada") ||
                                                                            // eqp.seccionadora89mtrb().equals("Seccionadora
                                                                            // Fechada") &&
                                                                            // eqp.disjuntor52l1().equals("Disjuntor
                                                                            // Fechado") ||
                                                                            // eqp.disjuntor52l2().equals("Disjuntor
                                                                            // Fechado"))
                {
                    b21.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
                    eqp.abrirDisjuntor52al();
                    status2.setText(" Equipamento operado: " + "52 AL " + eqp.disjuntor52al());
                    // eqp.desligarTransformadormt4();
                    // b21.setIcon(new javax.swing.ImageIcon("MT-4desenergizado.gif"));
                    // tap3.setText("0 kV");
                    // valortap3.setText(eqp.getMostrarTapsmt4());
                    // trafo3.setText("Desenergizado");
                    BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Disjuntor 52 AL";
                    operacao = "Disjuntor Aberto";
                    manobra = "Bay AL";
                    BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.opera�ao52mt1Fechado(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantAbertura52al();
                    disjuntor52alaberto = "Disjuntor 52AL Aberto";
                    // manobrainteligente.EnerAlbras();
                    // manobrainteligente.DesenAlbras();
                    // manobrainteligente.EnerL1();
                    // manobrainteligente.EnerL1InterBarra();
                    // manobrainteligente.EnerMT1BarraA();
                    // manobrainteligente.EnerMTRBarraA();
                    // manobrainteligente.EnerMT3BarraA();
                    // manobrainteligente.DesenMT1BarraA();
                    // manobrainteligente.DesenMTRBarraA();
                    // manobrainteligente.DesenMT2BarraB();
                    // manobrainteligente.DesenMT3BarraA();
                    // manobrainteligente.DesenerL1();
                    // manobrainteligente.DesenerL1InterBarra();

                    // manobrainteligente.EnerL2();
                    // manobrainteligente.EnerL2InterBarra();
                    // manobrainteligente.EnerMT2BarraB();
                    // manobrainteligente.EnerMT4BarraB();
                    // manobrainteligente.DesenMT4BarraB();
                    // manobrainteligente.DesenerL2();
                    // manobrainteligente.DesenerL2InterBarra();

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
            if (eqp.disjuntor52al().equals("Disjuntor Fechado")
                    && eqp.seccionadora89alb().equals("Seccionadora Aberta")
                    && eqp.seccionadora89ala().equals("Seccionadora Aberta")) {
                status2.setText(" Equipamento operado: " + "O Bay AL ESTÁ DESENERGIZADO");
            }
        }

        // ���������������������������������������� AÇAO DO BOTAO DA CS 89 AL-B
        if (e.getSource() == b20) {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado da Seccionadora 89 AL-B?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp.seccionadora89alb().equals("Seccionadora Aberta")) {
                    b20.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                    eqp.fecharSeccionadora89alb();
                    BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 AL-B";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay AL-B";
                    BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89alaFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89ala();

                    seccionadora89albfechada = "Seccionadora 89AL-B Fechada";
                    // manobrainteligente.EnerL1();
                    // manobrainteligente.EnerL1InterBarra();
                    // manobrainteligente.EnerMT1BarraA();
                    // manobrainteligente.EnerMTRBarraA();
                    // manobrainteligente.EnerMT3BarraA();
                    // manobrainteligente.DesenMT1BarraA();
                    // manobrainteligente.DesenMTRBarraA();
                    // manobrainteligente.DesenMT2BarraB();
                    // manobrainteligente.DesenMT3BarraA();
                    // manobrainteligente.DesenerL1();
                    // manobrainteligente.DesenerL1InterBarra();

                    // manobrainteligente.EnerL2();
                    // manobrainteligente.EnerL2InterBarra();
                    // manobrainteligente.EnerMT2BarraB();
                    // manobrainteligente.EnerMT4BarraB();
                    // manobrainteligente.DesenMT4BarraB();
                    // manobrainteligente.DesenerL2();
                    // manobrainteligente.DesenerL2InterBarra();

                }

                else if (eqp.seccionadora89alb().equals("Seccionadora Fechada")
                        && eqp.disjuntor52al().equals("Disjuntor Aberto")
                        || eqp.seccionadora89ala().equals("Seccionadora Aberta"))
                // && eqp.disjuntor52bt().equals("Disjuntor Fechado"))
                {
                    b20.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                    eqp.abrirSeccionadora89alb();
                    BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 AL-B";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay AL";
                    BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89alaAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.quantAbertura89ala();
                    seccionadora89albaberta = "Seccionadora 89AL-B Aberta";
                    // manobrainteligente.EnerL1();
                    // manobrainteligente.EnerL1InterBarra();
                    // manobrainteligente.EnerMT1BarraA();
                    // manobrainteligente.EnerMTRBarraA();
                    // manobrainteligente.EnerMT3BarraA();
                    // manobrainteligente.DesenMT1BarraA();
                    // manobrainteligente.DesenMTRBarraA();
                    // manobrainteligente.DesenMT2BarraB();
                    // manobrainteligente.DesenMT3BarraA();
                    // manobrainteligente.DesenerL1();
                    // manobrainteligente.DesenerL1InterBarra();

                    // manobrainteligente.EnerL2();
                    // manobrainteligente.EnerL2InterBarra();
                    // manobrainteligente.EnerMT2BarraB();
                    // manobrainteligente.EnerMT4BarraB();
                    // manobrainteligente.DesenMT4BarraB();
                    // manobrainteligente.DesenerL2();
                    // manobrainteligente.DesenerL2InterBarra();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Lógica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 AL FECHADO! \n",
                            "Lógica", JOptionPane.INFORMATION_MESSAGE,
                            (new javax.swing.ImageIcon("java1.jpg")));
                }
                status2.setText(" Equipamento operado: " + "89 AL-B " + eqp.seccionadora89alb());
            }
        }

        // ���������������������������������������� AÇAO DO BOTAO DA CS 89 AL
        if (e.getSource() == b22) {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado da Seccionadora 89 AL?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp.seccionadora89al().equals("Seccionadora Aberta")
                        && eqp.disjuntor52al().equals("Disjuntor Aberto")) {
                    b22.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                    eqp.fecharSeccionadora89al();
                    BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 AL";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay AL";
                    BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89alaFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89ala();

                    seccionadora89alfechada = "Seccionadora 89AL Fechada";
                    // manobrainteligente.EnerL1();
                    // manobrainteligente.EnerL1InterBarra();
                    // manobrainteligente.EnerMT1BarraA();
                    // manobrainteligente.EnerMTRBarraA();
                    // manobrainteligente.EnerMT3BarraA();
                    // manobrainteligente.DesenMT1BarraA();
                    // manobrainteligente.DesenMTRBarraA();
                    // manobrainteligente.DesenMT2BarraB();
                    // manobrainteligente.DesenMT3BarraA();
                    // manobrainteligente.DesenerL1();
                    // manobrainteligente.DesenerL1InterBarra();

                    // manobrainteligente.EnerL2();
                    // manobrainteligente.EnerL2InterBarra();
                    // manobrainteligente.EnerMT2BarraB();
                    // manobrainteligente.EnerMT4BarraB();
                    // manobrainteligente.DesenMT4BarraB();
                    // manobrainteligente.DesenerL2();
                    // manobrainteligente.DesenerL2InterBarra();

                }

                else if (eqp.seccionadora89al().equals("Seccionadora Fechada")
                        && eqp.disjuntor52al().equals("Disjuntor Aberto")
                        && eqp.seccionadora89ala().equals("Seccionadora Aberta")
                        && eqp.seccionadora89alb().equals("Seccionadora Aberta"))
                // && eqp.disjuntor52bt().equals("Disjuntor Fechado"))
                {
                    b22.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                    eqp.abrirSeccionadora89al();
                    BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 AL-B";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay AL";
                    BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89alaAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.quantAbertura89ala();
                    seccionadora89alaberta = "Seccionadora 89AL Aberta";
                    // manobrainteligente.EnerL1();
                    // manobrainteligente.EnerL1InterBarra();
                    // manobrainteligente.EnerMT1BarraA();
                    // manobrainteligente.EnerMTRBarraA();
                    // manobrainteligente.EnerMT3BarraA();
                    // manobrainteligente.DesenMT1BarraA();
                    // manobrainteligente.DesenMTRBarraA();
                    // manobrainteligente.DesenMT2BarraB();
                    // manobrainteligente.DesenMT3BarraA();
                    // manobrainteligente.DesenerL1();
                    // manobrainteligente.DesenerL1InterBarra();

                    // manobrainteligente.EnerL2();
                    // manobrainteligente.EnerL2InterBarra();
                    // manobrainteligente.EnerMT2BarraB();
                    // manobrainteligente.EnerMT4BarraB();
                    // manobrainteligente.DesenMT4BarraB();
                    // manobrainteligente.DesenerL2();
                    // manobrainteligente.DesenerL2InterBarra();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Lógica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 AL FECHADO! \n",
                            "Lógica", JOptionPane.INFORMATION_MESSAGE,
                            (new javax.swing.ImageIcon("java1.jpg")));
                }
                status2.setText(" Equipamento operado: " + "89 AL " + eqp.seccionadora89al());
            }
        }

        if (e.getSource() == b24)// ���������������������� AÇÃO DO BOTÃO DA CS 89 BP-A
        {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado da Seccionadora 89 BPA?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp.seccionadora89bpa().equals("Seccionadora Aberta")) {
                    b24.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                    eqp.fecharSeccionadora89bpa();
                    BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 BPA";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay AL";
                    BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89alaFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89ala();

                    seccionadora89bpafechada = "Seccionadora 89BPA Fechada";
                    // manobrainteligente.EnerL1();
                    // manobrainteligente.EnerL1InterBarra();
                    // manobrainteligente.EnerMT1BarraA();
                    // manobrainteligente.EnerMTRBarraA();
                    // manobrainteligente.EnerMT3BarraA();
                    // manobrainteligente.DesenMT1BarraA();
                    // manobrainteligente.DesenMTRBarraA();
                    // manobrainteligente.DesenMT2BarraB();
                    // manobrainteligente.DesenMT3BarraA();
                    // manobrainteligente.DesenerL1();
                    // manobrainteligente.DesenerL1InterBarra();

                    // manobrainteligente.EnerL2();
                    // manobrainteligente.EnerL2InterBarra();
                    // manobrainteligente.EnerMT2BarraB();
                    // manobrainteligente.EnerMT4BarraB();
                    // manobrainteligente.DesenMT4BarraB();
                    // manobrainteligente.DesenerL2();
                    // manobrainteligente.DesenerL2InterBarra();

                }

                else if (eqp.seccionadora89bpa().equals("Seccionadora Fechada")
                        && eqp.disjuntor52al().equals("Disjuntor Aberto")
                        || eqp.seccionadora89bpb().equals("Seccionadora Aberta")
                        || eqp.seccionadora89al().equals("Seccionadora Aberta"))
                // && eqp.disjuntor52bt().equals("Disjuntor Fechado"))
                {
                    b24.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                    eqp.abrirSeccionadora89bpa();
                    BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 BP-A";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay AL";
                    BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89alaAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.quantAbertura89ala();
                    seccionadora89bpaaberta = "Seccionadora 89BP-A Aberta";
                    // manobrainteligente.EnerL1();
                    // manobrainteligente.EnerL1InterBarra();
                    // manobrainteligente.EnerMT1BarraA();
                    // manobrainteligente.EnerMTRBarraA();
                    // manobrainteligente.EnerMT3BarraA();
                    // manobrainteligente.DesenMT1BarraA();
                    // manobrainteligente.DesenMTRBarraA();
                    // manobrainteligente.DesenMT2BarraB();
                    // manobrainteligente.DesenMT3BarraA();
                    // manobrainteligente.DesenerL1();
                    // manobrainteligente.DesenerL1InterBarra();

                    // manobrainteligente.EnerL2();
                    // manobrainteligente.EnerL2InterBarra();
                    // manobrainteligente.EnerMT2BarraB();
                    // manobrainteligente.EnerMT4BarraB();
                    // manobrainteligente.DesenMT4BarraB();
                    // manobrainteligente.DesenerL2();
                    // manobrainteligente.DesenerL2InterBarra();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Lógica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 AL FECHADO! \n",
                            "Lógica", JOptionPane.INFORMATION_MESSAGE,
                            (new javax.swing.ImageIcon("java1.jpg")));
                }
                status2.setText(" Equipamento operado: " + "BP-A " + eqp.seccionadora89bpa());
            }
        }

        // ���������������������������������������� AÇAO DO BOTAO DA CS 89 BP-B
        if (e.getSource() == b25) {
            Object[] options = { "Sim", "Não", "Cancelar" };
            int n = JOptionPane.showOptionDialog(this,
                    "Você realmente deseja alterar o estado da Seccionadora 89 BPB?",
                    "Seccionadora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (n == JOptionPane.YES_OPTION) {
                if (eqp.seccionadora89bpb().equals("Seccionadora Aberta")) {
                    b25.setIcon(new javax.swing.ImageIcon("Chave2.jpg"));
                    eqp.fecharSeccionadora89bpb();
                    BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 BPB";
                    operacao = "Seccionadora Fechada";
                    manobra = "Bay AL";
                    BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89alaFechada(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.QuantFechamento89ala();

                    seccionadora89bpbfechada = "Seccionadora 89BP-B Fechada";
                    // manobrainteligente.EnerL1();
                    // manobrainteligente.EnerL1InterBarra();
                    // manobrainteligente.EnerMT1BarraA();
                    // manobrainteligente.EnerMTRBarraA();
                    // manobrainteligente.EnerMT3BarraA();
                    // manobrainteligente.DesenMT1BarraA();
                    // manobrainteligente.DesenMTRBarraA();
                    // manobrainteligente.DesenMT2BarraB();
                    // manobrainteligente.DesenMT3BarraA();
                    // manobrainteligente.DesenerL1();
                    // manobrainteligente.DesenerL1InterBarra();

                    // manobrainteligente.EnerL2();
                    // manobrainteligente.EnerL2InterBarra();
                    // manobrainteligente.EnerMT2BarraB();
                    // manobrainteligente.EnerMT4BarraB();
                    // manobrainteligente.DesenMT4BarraB();
                    // manobrainteligente.DesenerL2();
                    // manobrainteligente.DesenerL2InterBarra();

                }

                else if (eqp.seccionadora89bpb().equals("Seccionadora Fechada")
                        && eqp.disjuntor52al().equals("Disjuntor Aberto")
                        || eqp.seccionadora89bpa().equals("Seccionadora Aberta")
                        || eqp.seccionadora89al().equals("Seccionadora Aberta"))
                // && eqp.disjuntor52bt().equals("Disjuntor Fechado"))
                {
                    b25.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
                    eqp.abrirSeccionadora89bpb();
                    BDE.ConectarBD();
                    String usuario = tfUsuario.getText();
                    String data = tfData.getText();
                    tagequipamento = "Seccionadora 89 BP-B";
                    operacao = "Seccionadora Aberta";
                    manobra = "Bay AL";
                    BDE.cadastraEventos(tagequipamento, usuario, data, operacao, manobra);
                    // BDO.ConectarBD();
                    // BDO.operaçao89alaAberta(data);
                    // BDEQ.ConectarBD();
                    // BDEQ.quantAbertura89ala();
                    seccionadora89bpbaberta = "Seccionadora 89BP-B Aberta";
                    // manobrainteligente.EnerL1();
                    // manobrainteligente.EnerL1InterBarra();
                    // manobrainteligente.EnerMT1BarraA();
                    ////manobrainteligente.EnerMTRBarraA();
                    // manobrainteligente.EnerMT3BarraA();
                    // manobrainteligente.DesenMT1BarraA();
                    // manobrainteligente.DesenMTRBarraA();
                    // manobrainteligente.DesenMT2BarraB();
                    // manobrainteligente.DesenMT3BarraA();
                    // manobrainteligente.DesenerL1();
                    // manobrainteligente.DesenerL1InterBarra();

                    // manobrainteligente.EnerL2();
                    // manobrainteligente.EnerL2InterBarra();
                    // manobrainteligente.EnerMT2BarraB();
                    // manobrainteligente.EnerMT4BarraB();
                    // manobrainteligente.DesenMT4BarraB();
                    // manobrainteligente.DesenerL2();
                    // manobrainteligente.DesenerL2InterBarra();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Lógica de Intertravamento nao Satisfeita! \n DISJUNTOR 52 AL FECHADO! \n",
                            "Lógica", JOptionPane.INFORMATION_MESSAGE,
                            (new javax.swing.ImageIcon("java1.jpg")));
                }
                status2.setText(" Equipamento operado: " + "BP-B " + eqp.seccionadora89bpb());
            }
        }

        if (e.getSource() == b34) // ----------- BOT�O SAIR ----------------//
        {
            new InterfaceMenu().setVisible(true);
            setVisible(false);
            // setVisible(false);
        }

        if (e.getSource() == b40) {
            new InterfaceMenu().setVisible(true);
            setVisible(false);
        }

        if (e.getSource() == b42) {
            atualizaConfiguracao();
        }
    }

    public void atualizaConfiguracao() {
        eqp.abrirSeccionadora89ala();
        eqp.abrirSeccionadora89alb();
        eqp.abrirDisjuntor52al();
        eqp.abrirSeccionadora89al();
        eqp.abrirSeccionadora89bpa();
        eqp.abrirSeccionadora89bpb();
        b19.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
        b20.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
        b21.setIcon(new javax.swing.ImageIcon("Disjuntor1.jpg"));
        b22.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
        b23.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
        b24.setIcon(new javax.swing.ImageIcon("Chave1.jpg"));
    }

    public static void main(String args[]) {
        new InterfaceAlunorte().setVisible(true);
        InterfaceAlunorte application = new InterfaceAlunorte();
    }
}