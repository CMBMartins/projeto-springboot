
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
 * MODULO -   IMAGENS                                  *
 ******************************************************/
import javax.swing.*; //Carrega os pacotes gr�ficos
import java.awt.event.*;//Carrega os pacotes de eventos
import java.awt.*; //Carrega os pacotes gr�ficos de eventos
//import java.util.HashMap;
//import java.util.Map;

public class Imagens extends JFrame // implements ActionListener
{
    private JLabel titulo, jLabel1, jLabel2;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14;

    public Imagens() {
        initComponents();
        setLayout(null);
        setSize(725, 750);
        // setLocation(150, 50);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setVisible( true );
    }

    public void initComponents() {
        getContentPane().setLayout(null);
        setTitle("Imagens dos Equipamentos");
        // setResizable(false);
        setLocation(150, 50);

        Icon imagem1 = new ImageIcon("albras.gif");
        jLabel2 = new JLabel();
        jLabel2.setIcon(imagem1);
        jLabel2.setBounds(1, 1, 230, 38);
        getContentPane().add(jLabel2);

        titulo = new JLabel("");
        titulo.setText(" Patio de 230 kV");
        titulo.setFont(new Font("Arial", 1, 36));
        titulo.setBounds(300, 0, 525, 36);
        titulo.setForeground(Color.blue);// cor
        getContentPane().add(titulo);

        Icon imagem = new ImageIcon("Patio.jpg");
        jLabel1 = new JLabel();
        jLabel1.setIcon(imagem);
        jLabel1.setBounds(40, 0, 725, 580);
        getContentPane().add(jLabel1);

        b1 = new Button("Disjuntor"); // A��o do bot�o Retornar
        b1.setFont(new Font("Dialog", Font.BOLD, 16)); // Fonte e tamanho
        b1.setBounds(40, 540, 90, 31); // Coluna,Linha,Largura,Altura
        getContentPane().add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btDisjuntorActionPerformed(evt);
            }
        });

        b2 = new Button("CS 230 kV"); // A��o do bot�o Retornar
        b2.setFont(new Font("Dialog", Font.BOLD, 16)); // Fonte e tamanho
        b2.setBounds(132, 540, 90, 31); // Coluna,Linha,Largura,Altura
        getContentPane().add(b2);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btCSFechadaActionPerformed(evt);
            }
        });

        b3 = new Button("CS 230 kV"); // A��o do bot�o Retornar
        b3.setFont(new Font("Dialog", Font.BOLD, 16)); // Fonte e tamanho
        b3.setBounds(224, 540, 90, 31); // Coluna,Linha,Largura,Altura
        getContentPane().add(b3);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btCSAbertaActionPerformed(evt);
            }
        });

        b4 = new Button("Trafo MT"); // A��o do bot�o Retornar
        b4.setFont(new Font("Dialog", Font.BOLD, 16)); // Fonte e tamanho
        b4.setBounds(316, 540, 90, 31); // Coluna,Linha,Largura,Altura
        getContentPane().add(b4);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btMTActionPerformed(evt);
            }
        });

        b5 = new Button("Trafo LVR"); // A��o do bot�o Retornar
        b5.setFont(new Font("Dialog", Font.BOLD, 16)); // Fonte e tamanho
        b5.setBounds(408, 540, 90, 31); // Coluna,Linha,Largura,Altura
        getContentPane().add(b5);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btLVRActionPerformed(evt);
            }
        });

        b7 = new Button("Retificador"); // A��o do bot�o Retornar
        b7.setFont(new Font("Dialog", Font.BOLD, 16)); // Fonte e tamanho
        b7.setBounds(500, 540, 90, 31); // Coluna,Linha,Largura,Altura
        getContentPane().add(b7);
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btRFTActionPerformed(evt);
            }
        });

        b8 = new Button("Planta"); // A��o do bot�o Retornar
        b8.setFont(new Font("Dialog", Font.BOLD, 16)); // Fonte e tamanho
        b8.setBounds(592, 540, 90, 31); // Coluna,Linha,Largura,Altura
        getContentPane().add(b8);
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btPlantaActionPerformed(evt);
            }
        });

        b9 = new Button("Capacitor"); // A��o do bot�o Retornar
        b9.setFont(new Font("Dialog", Font.BOLD, 16)); // Fonte e tamanho
        b9.setBounds(40, 575, 90, 31); // Coluna,Linha,Largura,Altura
        getContentPane().add(b9);
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btCapacitorActionPerformed(evt);
            }
        });

        b10 = new Button("TF 480VCA"); // A��o do bot�o Retornar
        b10.setFont(new Font("Dialog", Font.BOLD, 16)); // Fonte e tamanho
        b10.setBounds(132, 575, 90, 31); // Coluna,Linha,Largura,Altura
        getContentPane().add(b10);
        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btTF480ActionPerformed(evt);
            }
        });

        b11 = new Button(" CCMs "); // A��o do bot�o Retornar
        b11.setFont(new Font("Dialog", Font.BOLD, 16)); // Fonte e tamanho
        b11.setBounds(224, 575, 90, 31); // Coluna,Linha,Largura,Altura
        getContentPane().add(b11);
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btCCMActionPerformed(evt);
            }
        });

        b12 = new Button(" CCPs "); // A��o do bot�o Retornar
        b12.setFont(new Font("Dialog", Font.BOLD, 16)); // Fonte e tamanho
        b12.setBounds(316, 575, 90, 31); // Coluna,Linha,Largura,Altura
        getContentPane().add(b12);
        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btCCPsActionPerformed(evt);
            }
        });

        b13 = new Button("Geradores"); // A��o do bot�o Retornar
        b13.setFont(new Font("Dialog", Font.BOLD, 16)); // Fonte e tamanho
        b13.setBounds(408, 575, 90, 31); // Coluna,Linha,Largura,Altura
        getContentPane().add(b13);
        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btGeradorActionPerformed(evt);
            }
        });

        b14 = new Button("Estaçao"); // A��o do bot�o Retornar
        b14.setFont(new Font("Dialog", Font.BOLD, 16)); // Fonte e tamanho
        b14.setBounds(500, 575, 90, 31); // Coluna,Linha,Largura,Altura
        getContentPane().add(b14);
        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btEstacaoActionPerformed(evt);
            }
        });

        b6 = new Button("   Sair   "); // A��o do bot�o Retornar
        b6.setFont(new Font("Dialog", Font.BOLD, 16)); // Fonte e tamanho
        b6.setBounds(592, 575, 90, 31); // Coluna,Linha,Largura,Altura
        getContentPane().add(b6);
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
    }

    // Açao do botao RETORNAR
    private void btDisjuntorActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setIcon(new javax.swing.ImageIcon("Foto Disjuntor1.JPG"));
        titulo.setText("Disjuntor de 230 kV");
        titulo.setFont(new Font("Arial", 1, 36));
        titulo.setBounds(290, 0, 625, 30);
        titulo.setForeground(Color.blue);// cor
        getContentPane().add(titulo);
    }

    private void btCSFechadaActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setIcon(new javax.swing.ImageIcon("CS Fechada1.JPG"));
        titulo.setText("Seccionadora Fechada");
        titulo.setFont(new Font("Arial", 1, 34));
        titulo.setBounds(270, 0, 625, 36);
        titulo.setForeground(Color.blue);// cor
        getContentPane().add(titulo);
    }

    private void btCSAbertaActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setIcon(new javax.swing.ImageIcon("CS Aberta.JPG"));
        titulo.setText("Seccionadora Aberta ");
        titulo.setFont(new Font("Arial", 1, 34));
        titulo.setBounds(270, 0, 625, 36);
        titulo.setForeground(Color.blue);// cor
        getContentPane().add(titulo);
    }

    private void btMTActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setIcon(new javax.swing.ImageIcon("Foto MT.JPG"));
        titulo.setText("Transformador Principal");
        titulo.setFont(new Font("Arial", 1, 36));
        titulo.setBounds(240, 0, 625, 36);
        titulo.setForeground(Color.blue);// cor
        getContentPane().add(titulo);
    }

    private void btLVRActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setIcon(new javax.swing.ImageIcon("TF LVR.JPG"));
        titulo.setText("Transformador Regulador");
        titulo.setFont(new Font("Arial", 1, 36));
        titulo.setBounds(240, 0, 625, 36);
        titulo.setForeground(Color.blue);// cor
        getContentPane().add(titulo);
    }

    private void btRFTActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setIcon(new javax.swing.ImageIcon("RFT.JPG"));
        titulo.setText("Transformador Retificador");
        titulo.setFont(new Font("Arial", 1, 36));
        titulo.setBounds(240, 0, 625, 36);
        titulo.setForeground(Color.blue);// cor
        getContentPane().add(titulo);
    }

    private void btPlantaActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setIcon(new javax.swing.ImageIcon("planta.JPG"));
        titulo.setText("Planta 34,5 kV");
        titulo.setFont(new Font("Arial", 1, 36));
        titulo.setBounds(330, 0, 625, 36);
        titulo.setForeground(Color.blue);// cor
        getContentPane().add(titulo);
    }

    private void btCapacitorActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setIcon(new javax.swing.ImageIcon("Capacitor1.JPG"));
        titulo.setText("Banco de Capacitores");
        titulo.setFont(new Font("Arial", 1, 36));
        titulo.setBounds(270, 0, 625, 36);
        titulo.setForeground(Color.blue);// cor
        getContentPane().add(titulo);
    }

    private void btTF480ActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setIcon(new javax.swing.ImageIcon("TF AUX.JPG"));
        titulo.setText("Trafo de 480 VCA");
        titulo.setFont(new Font("Arial", 1, 36));
        titulo.setBounds(290, 0, 625, 36);
        titulo.setForeground(Color.blue);// cor
        getContentPane().add(titulo);
    }

    private void btCCMActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setIcon(new javax.swing.ImageIcon("CCM.JPG"));
        titulo.setText("Centro controle de motores");
        titulo.setFont(new Font("Arial", 1, 36));
        titulo.setBounds(240, 0, 625, 36);
        titulo.setForeground(Color.blue);// cor
        getContentPane().add(titulo);
    }

    private void btCCPsActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setIcon(new javax.swing.ImageIcon("CCPs.JPG"));
        titulo.setText("Sala dos CCPs");
        titulo.setFont(new Font("Arial", 1, 36));
        titulo.setBounds(310, 0, 625, 36);
        titulo.setForeground(Color.blue);// cor
        getContentPane().add(titulo);
    }

    private void btGeradorActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setIcon(new javax.swing.ImageIcon("Geradores.JPG"));
        titulo.setText("Geradores de Emergencia");
        titulo.setFont(new Font("Arial", 1, 36));
        titulo.setBounds(240, 0, 625, 36);
        titulo.setForeground(Color.blue);// cor
        getContentPane().add(titulo);
    }

    private void btEstacaoActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setIcon(new javax.swing.ImageIcon("Operador1.JPG"));
        titulo.setText("Estaçao de Operaço");
        titulo.setFont(new Font("Arial", 1, 36));
        titulo.setBounds(270, 0, 625, 36);
        titulo.setForeground(Color.blue);// cor
        getContentPane().add(titulo);
    }

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }

    public static void main(String args[]) {
        new Imagens().setVisible(true);
    }
}