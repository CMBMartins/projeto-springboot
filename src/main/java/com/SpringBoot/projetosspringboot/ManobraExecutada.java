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
 * MODULO -         MANOBRA PADRÃO                     *
 ******************************************************/
//Carregar estes pacotes:
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.util.*;
//import java.text.SimpleDateFormat;

// ################################################# CLASSE MANOBRA EXECUTADA
    public class ManobraExecutada extends JFrame // implements ActionListener
    {
        int passo = 0;
        int performance = 0;

    String manobra = "";
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

    JLabel projeto, status, status1, status2, mt1, mtr, mt2, jLabel1, tensao, simulador, eletronorte, tensaoEletronorte,
            alunorte, frequencia;

        Equipamentos eqp = new Equipamentos();

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

            final JLabel lbindice;

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
            JButton Manobra;

            final JLabel lbManobra;

            JPanel painel = new JPanel();

            projeto = new JLabel("Manobra Executada!", projeto.CENTER);
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
                    //limparMemoria();
                    setVisible(false);
                }
            });
        }// Fim main

        public static void main(String args[]) {
        ManobraExecutada frame = new ManobraExecutada();
        frame.setVisible(true);
    }
    }// Fim Teste