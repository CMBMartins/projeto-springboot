
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
 * MODULO -      MANOBRA INTELIGENTE                   *
 ******************************************************/
//Carregar estes pacotes:
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.SimpleDateFormat;

// ####################################### CLASSE MENU DAS MANOBRAS PADRÕES
public class ManobraPadrao extends JFrame // implements ActionListener
{
    String manobra = "";
    int passo = 0;
    JLabel projeto;

    public ManobraPadrao() {
        setTitle("Ordem de Manobra  " + "Padrão");
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        setResizable(false);

        setSize(455, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

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

        projeto = new JLabel(" Manobra Padrão!", projeto.CENTER);
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
                    mostrar11.setText("                   11. Abrir Disjuntor 52 MT-3");
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
                // limparMemoria();
                setVisible(false);
            }
        });
    }// Fim main

}// Fim Teste