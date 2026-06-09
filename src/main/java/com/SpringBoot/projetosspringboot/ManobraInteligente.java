
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
import javax.swing.*;
//import java.util.*;
import java.text.SimpleDateFormat;

public class ManobraInteligente {

    JLabel tap, valortap, trafo, barra1, barra2, tap1, tap2, valortap1, valortap2, trafo1, trafo2, subir, descer,
            Alarmes, tensaoCont4;
    JLabel mt1a, mt1b, mt2a, mt2b, l1a, l1b, l2a, l2b, l189, l289, l157, l1, l257, l2, bta, btb, bta57, btb57, mt152,
            mtr52, mt252, l152, l252, bt52, gif1;
    JLabel status, status1, status2, mt1, mtr, mt2, jLabel1, tensao, simulador, eletronorte, tensaoEletronorte,
            alunorte, frequencia;
    JLabel contdem, demcont, medenergia, fatpotencia, demanterior, dematual, demmedtotal, horaref, red1, reduçao1, dem,
            albras, demTotalAlbras;
    JLabel demred, corr, corrSet, corrSet1, corrSet2, corrSet3, corrSet4, tensaoCont, desvio, tensaoCont1, tensaoCont2,
            tensaoCont3;
    public JLabel Label1, Label2, projeto, email, lbData;

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23,
            b24, b25, idc1, idc2, idc3, idc4;
    JButton b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46,
            b47, b48;
    JTextField tfUsuario, tfPerfil, tfCodigo, tfData, enterField, tfhoraref, tfData1, tfTagEquipamento, tfOperacao,
            tfManobra;

    JPasswordField jtfSenha;
    String nome, senha, perfil, data, Usuario, usuario, tagequipamento, operacao, manobra, albras1 = "";
    SimpleDateFormat formato, formato1;
    ImageIcon icone = new ImageIcon("");
    JPanel painel;
    int origem = 0;
    int passo = 0;
    double demtotal = 0, elet = 0, tensaoElet = 0, demAlunorte = 0, fatPotencia = 0, demAtual = 0, demAnterior = 0;
    double demMedTotal = 0, corrente = 0, corrente1 = 0, tensaocontrole = 0, tensaocontrole1 = 0;

    int performance = 0;

    Relogio relogio = new Relogio();
    Equipamentos eqp = new Equipamentos();
    Equipamentos345kV eqp1 = new Equipamentos345kV();
    BDadosAcesso BDE = new BDadosAcesso();
    BDOperaçoes BDO = new BDOperaçoes();
    BDEquipamentos BDEQ = new BDEquipamentos();
    Acesso acesso = new Acesso();
    ManobraPadrao MP = new ManobraPadrao();

    // ����������������������������������������� DECLARAÇÃO DAS VARIAVEIS

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

    // ################################# MÉTODO CONSTRUTOR DA CLASSE MANOBRA
    // INTELIGENTE

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
                Object[] options = { "Sim", "N�o", "Cancelar" };
                int n = JOptionPane.showOptionDialog(null,
                        "Passo para Desenergizar a Linha 1 incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                        "Passo para Energizar a Linha 2 incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                            "OM para Desenergizar Bay da Linha 2! Conclu�da com sucesso!!! Nao esqueça de limpar os dados para continuar Simulando.",
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
                        "Passo para Desenergizar a Linha 2 incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                JOptionPane.showMessageDialog(null, "Passo 1 conclu�do com sucesso !!!",
                        "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") && passo == 1) {
                seccionadora89l1afechada = "Seccionadora 89L1-A Fechada";
                passo = passo + 1;
                relogio.passo = 2;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 2 conclu�do com sucesso !!!",
                        "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") && passo == 1) {
                passo = passo + 1;
                relogio.passo = 2;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 2 conclu�do com sucesso !!!",
                        "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89btafechada.equals("Seccionadora 89BT-A Fechada") && passo == 2) {
                passo = passo + 1;
                relogio.passo = 3;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 3 conclu�do com sucesso !!!",
                        "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 3) {
                passo = passo + 1;
                relogio.passo = 4;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 4 conclu�do com sucesso !!!",
                        "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 4) {
                passo = passo + 1;
                relogio.passo = 5;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 5 conclu�do com sucesso !!!",
                        "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52l1fechado.equals("Disjuntor 52L1 Fechado") && passo == 5) {
                passo = passo + 1;
                relogio.passo = 6;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 6 conclu�do com sucesso !!!",
                        "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") && passo == 6) {
                passo = passo + 1;
                relogio.passo = 7;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 7 conclu�do com sucesso !!!",
                        "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt1baberta.equals("Seccionadora 89MT-1B Aberta") && passo == 7) {
                passo = passo + 1;
                relogio.passo = 8;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 8 conclu�do com sucesso !!!",
                        "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") && passo == 8) {
                passo = passo + 1;
                relogio.passo = 9;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 9 conclu�do com sucesso !!!",
                        "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mtrbaberta.equals("Seccionadora 89MT-RB Aberta") && passo == 9) {
                passo = passo + 1;
                relogio.passo = 10;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 10 conclu�do com sucesso !!!",
                        "Energizar Bay da Linha 1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") && passo == 10) {
                passo = passo + 1;
                relogio.passo = 11;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 11 conclu�do com sucesso !!!",
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
                            "OM para Desenergizar Bay da Linha 1 e Barra 'A'! Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
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
                            "OM para Energizar Bay da Linha 2 e Barra 'B'! Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
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
                JOptionPane.showMessageDialog(null, "Passo 1 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 1) {
                passo = passo + 1;
                relogio.passo = 2;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 2 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                passo = passo + 1;
                relogio.passo = 3;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 3 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") && passo == 3) {
                passo = passo + 1;
                relogio.passo = 4;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 4 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") && passo == 4) {
                passo = passo + 1;
                relogio.passo = 5;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 5 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") && passo == 5) {
                passo = passo + 1;
                relogio.passo = 6;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 6 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mtrbaberta.equals("Seccionadora 89MT-RB Aberta") && passo == 6) {
                passo = passo + 1;
                relogio.passo = 7;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 7 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") && passo == 7) {
                passo = passo + 1;
                relogio.passo = 8;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 8 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt3baberta.equals("Seccionadora 89MT-3B Aberta") && passo == 8) {
                passo = passo + 1;
                relogio.passo = 9;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 9 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") && passo == 9) {
                passo = passo + 1;
                relogio.passo = 10;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 10 conclu�do com sucesso !!!",
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
                            "OM para Energizar Bay do MT-1 e Barra A! Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
                            "Energizar Bay do MT-1e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                // limparMemoria();
            } else {
                Object[] options = { "Sim", "N�o", "Cancelar" };
                int n = JOptionPane.showOptionDialog(null,
                        "Passo para Energizar o Bay do MT-1 e Barra 'A' Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                JOptionPane.showMessageDialog(null, "Passo 1 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") && passo == 1) {
                passo = passo + 1;
                relogio.passo = 2;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 2 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") && passo == 2) {
                passo = passo + 1;
                relogio.passo = 3;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 3 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") && passo == 3) {
                passo = passo + 1;
                relogio.passo = 4;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 4 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mtrbfechada.equals("Seccionadora 89MT-RB Fechada") && passo == 4) {
                passo = passo + 1;
                relogio.passo = 5;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 5 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") && passo == 5) {
                passo = passo + 1;
                relogio.passo = 6;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 6 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt3bfechada.equals("Seccionadora 89MT-3B Fechada") && passo == 6) {
                passo = passo + 1;
                relogio.passo = 7;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 7 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") && passo == 7) {
                passo = passo + 1;
                relogio.passo = 8;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 8 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 8) {
                passo = passo + 1;
                relogio.passo = 9;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 9 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-1 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 9) {
                passo = passo + 1;
                relogio.passo = 10;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 10 conclu�do com sucesso !!!",
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
                            "OM para Desenergizar Bay do MT-1 e Barra A! Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
                            "Desenergizar Bay do MT-1e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                // limparMemoria();
            } else {
                Object[] options = { "Sim", "N�o", "Cancelar" };
                int n = JOptionPane.showOptionDialog(null,
                        "Passo para Desenergizar o Bay do MT-1 e Barra 'A' Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                JOptionPane.showMessageDialog(null, "Passo 1 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 1) {
                passo = passo + 1;
                relogio.setVisible(true);
                relogio.passo = 2;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 2 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                passo = passo + 1;
                relogio.passo = 3;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 3 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l1afechada.equals("Seccionadora 89L1-A Fechada") && passo == 3) {
                seccionadora89l1afechada = "Seccionadora 89L1-A Fechada";
                passo = passo + 1;
                relogio.passo = 4;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 4 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l1baberta.equals("Seccionadora 89L1-B Aberta") && passo == 4) {
                passo = passo + 1;
                relogio.passo = 5;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 5 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt1afechada.equals("Seccionadora 89MT-1A Fechada") && passo == 5) {
                seccionadora89mt1afechada = "Seccionadora 89MT-1A Fechada";
                passo = passo + 1;
                relogio.passo = 6;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 6 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt1baberta.equals("Seccionadora 89MT-1B Aberta") && passo == 6) {
                passo = passo + 1;
                relogio.passo = 7;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 7 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt3afechada.equals("Seccionadora 89MT-3A Fechada") && passo == 7) {
                passo = passo + 1;
                relogio.passo = 8;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 8 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt3baberta.equals("Seccionadora 89MT-3B Aberta") && passo == 8) {
                passo = passo + 1;
                relogio.passo = 9;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 9 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mtrafechada.equals("Seccionadora 89MT-RA Fechada") && passo == 9) {
                passo = passo + 1;
                relogio.passo = 10;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 10 conclu�do com sucesso !!!",
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
                            "OM para Energizar Bay do MT-R e Barra A Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
                            "Energizar Bay do MT-R", JOptionPane.INFORMATION_MESSAGE);
                // limparMemoria();
            } else {
                Object[] options = { "Sim", "N�o", "Cancelar" };
                int n = JOptionPane.showOptionDialog(null,
                        "Passo para Energizar o Bay do MTR e Barra 'A' Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                JOptionPane.showMessageDialog(null, "Passo 1 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mtraaberta.equals("Seccionadora 89MT-RA Aberta") && passo == 1) {
                passo = passo + 1;
                relogio.passo = 2;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 2 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") && passo == 2) {
                passo = passo + 1;
                relogio.passo = 3;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 3 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") && passo == 3) {
                passo = passo + 1;
                relogio.passo = 4;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 4 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt1bfechada.equals("Seccionadora 89MT-1B Fechada") && passo == 4) {
                passo = passo + 1;
                relogio.passo = 5;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 5 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt1aaberta.equals("Seccionadora 89MT-1A Aberta") && passo == 5) {
                passo = passo + 1;
                relogio.passo = 6;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 6 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt3bfechada.equals("Seccionadora 89MT-3B Fechada") && passo == 6) {
                passo = passo + 1;
                relogio.passo = 7;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 7 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") && passo == 7) {
                passo = passo + 1;
                relogio.passo = 8;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 8 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 8) {
                passo = passo + 1;
                relogio.passo = 9;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 9 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 9) {
                passo = passo + 1;
                relogio.passo = 10;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 10 conclu�do com sucesso !!!",
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
                            "OM para Desenergizar Bay do MT-R e Barra A! Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
                            "Desenergizar Bay do MT-R e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                // limparMemoria();
            } else {
                Object[] options = { "Sim", "N�o", "Cancelar" };
                int n = JOptionPane.showOptionDialog(null,
                        "Passo para Desenergizar o Bay do MTR e Barra 'A' Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                JOptionPane.showMessageDialog(null, "Passo 2 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                passo = passo + 1;
                relogio.passo = 3;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 3 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l2bfechada.equals("Seccionadora 89L2-B Fechada") && passo == 3) {
                passo = passo + 1;
                relogio.passo = 4;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 4 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l2aaberta.equals("Seccionadora 89L2-A Aberta") && passo == 4) {
                passo = passo + 1;
                relogio.passo = 5;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 5 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt4bfechada.equals("Seccionadora 89MT-4B Fechada") && passo == 5) {
                passo = passo + 1;
                relogio.passo = 6;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 6 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt4aaberta.equals("Seccionadora 89MT-4A Aberta") && passo == 6) {
                passo = passo + 1;
                relogio.passo = 7;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 7 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt2bfechada.equals("Seccionadora 89MT-2B Fechada") && passo == 7) {
                passo = passo + 1;
                relogio.passo = 8;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 8 conclu�do com sucesso !!!",
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
                            "OM para Energizar Bay do MT-2 e Barra B Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
                            "Energizar Bay do MT-2", JOptionPane.INFORMATION_MESSAGE);
                // limparMemoria();
            } else {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(null,
                        "Passo para Energizar o Bay do MT-2 e Barra 'B' Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                JOptionPane.showMessageDialog(null, "Passo 1 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt2baberta.equals("Seccionadora 89MT-2B Aberta") && passo == 1) {
                passo = passo + 1;
                relogio.passo = 2;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 2 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada") && passo == 2) {
                passo = passo + 1;
                relogio.passo = 3;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 3 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") && passo == 3) {
                passo = passo + 1;
                relogio.passo = 4;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 4 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt4afechada.equals("Seccionadora 89MT-4A Fechada") && passo == 4) {
                passo = passo + 1;
                relogio.passo = 5;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 5 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-1 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt4baberta.equals("Seccionadora 89MT-4B Aberta") && passo == 5) {
                passo = passo + 1;
                relogio.passo = 6;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 6 conclu�do com sucesso !!!",
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
                            "OM para Desenergizar Bay do MT-2 e Barra 'B' Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
                            "Desenergizar Bay do MT-2 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                // limparMemoria();
            } else {
                Object[] options = { "Sim", "N�o", "Cancelar" };
                int n = JOptionPane.showOptionDialog(null,
                        "Passo para Desenergizar o Bay do MT-2 e Barra 'B' Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                JOptionPane.showMessageDialog(null, "Passo 1 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 1) {
                passo = passo + 1;
                relogio.setVisible(true);
                relogio.passo = 2;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 2 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                passo = passo + 1;
                relogio.passo = 3;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 3 conclu�do com sucesso !!!",
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
                JOptionPane.showMessageDialog(null, "Passo 8 conclu�do com sucesso !!!",
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
                            "OM para Energizar Bay do MT-3 e Barra A Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
                            "Energizar Bay do MT-3", JOptionPane.INFORMATION_MESSAGE);
                // limparMemoria();
            } else {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(null,
                        "Passo para Energizar o Bay do MT-3 e Barra 'A' Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                JOptionPane.showMessageDialog(null, "Passo 1 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt3aaberta.equals("Seccionadora 89MT-3A Aberta") && passo == 1) {
                passo = passo + 1;
                relogio.passo = 2;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 2 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l1bfechada.equals("Seccionadora 89L1-B Fechada") && passo == 2) {
                passo = passo + 1;
                relogio.passo = 3;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 3 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l1aaberta.equals("Seccionadora 89L1-A Aberta") && passo == 3) {
                passo = passo + 1;
                relogio.passo = 4;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 4 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt1bfechada.equals("Seccionadora 89MT-1B Fechada") && passo == 4) {
                passo = passo + 1;
                relogio.passo = 5;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 5 conclu�do com sucesso !!!",
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
                            "OM para Desenergizar Bay do MT-3 e Barra A! Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
                            "Desenergizar Bay do MT-3 e Barra 'A'", JOptionPane.INFORMATION_MESSAGE);
                // limparMemoria();
            } else {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(null,
                        "Passo para Desenergizar o Bay do MT-3 e Barra 'A' Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                JOptionPane.showMessageDialog(null, "Passo 1 conclu�do com sucesso !!!",
                        "Energizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89btbfechada.equals("Seccionadora 89BT-B Fechada") && passo == 1) {
                passo = passo + 1;
                relogio.passo = 2;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 2 conclu�do com sucesso !!!",
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
                            "OM para Energizar Bay do MT-4 e Barra 'B'! Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
                            "Energizar Bay do MT-4", JOptionPane.INFORMATION_MESSAGE);
                // limparMemoria();
            } else {
                Object[] options = { "Sim", "N�o", "Cancelar" };
                int n = JOptionPane.showOptionDialog(null,
                        "Passo para Energizar o Bay do MT-4 e Barra 'B' Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                JOptionPane.showMessageDialog(null, "Passo 1 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt4baberta.equals("Seccionadora 89MT-4B Aberta") && passo == 1) {
                passo = passo + 1;
                relogio.passo = 2;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 2 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l2afechada.equals("Seccionadora 89L2-A Fechada") && passo == 2) {
                passo = passo + 1;
                relogio.passo = 3;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 3 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89l2baberta.equals("Seccionadora 89L2-B Aberta") && passo == 3) {
                passo = passo + 1;
                relogio.passo = 4;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 4 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt2afechada.equals("Seccionadora 89MT-2A Fechada") && passo == 4) {
                passo = passo + 1;
                relogio.passo = 5;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 5 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89mt2baberta.equals("Seccionadora 89MT-2B Aberta") && passo == 5) {
                passo = passo + 1;
                relogio.passo = 6;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 6 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 6) {
                passo = passo + 1;
                relogio.passo = 7;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 7 conclu�do com sucesso !!!",
                        "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (seccionadora89btaaberta.equals("Seccionadora 89BT-A Aberta") && passo == 7) {
                passo = passo + 1;
                relogio.passo = 8;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 8 conclu�do com sucesso !!!",
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
                            "OM para Desenergizar Bay do MT-4 e Barra 'B'! Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
                            "Desenergizar Bay do MT-4 e Barra 'B'", JOptionPane.INFORMATION_MESSAGE);
                // limparMemoria();
            } else {
                Object[] options = { "Sim", "N�o", "Cancelar" };
                int n = JOptionPane.showOptionDialog(null,
                        "Passo para Desenergizar o Bay do MT-4 e Barra 'B' Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52l2fechado.equals("Disjuntor 52L2 Fechado") && passo == 1) {
                passo = passo + 1;
                relogio.passo = 2;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52btfechado.equals("Disjuntor 52BT Fechado") && passo == 2) {
                passo = passo + 1;
                relogio.passo = 3;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52alfechado.equals("Disjuntor 52AL Fechado") && passo == 3) {
                passo = passo + 1;
                relogio.passo = 4;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52mt1fechado.equals("Disjuntor 52MT-1 Fechado") && passo == 4) {
                passo = passo + 1;
                relogio.passo = 5;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52mtrfechado.equals("Disjuntor 52MT-R Fechado") && passo == 5) {
                passo = passo + 1;
                relogio.passo = 6;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52mt2fechado.equals("Disjuntor 52MT-2 Fechado") && passo == 6) {
                passo = passo + 1;
                relogio.passo = 7;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52mt3fechado.equals("Disjuntor 52MT-3 Fechado") && passo == 7) {
                passo = passo + 1;
                relogio.passo = 8;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52mt4fechado.equals("Disjuntor 52MT-4 Fechado") && passo == 8) {
                passo = passo + 1;
                relogio.passo = 9;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 9 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52a1fechado.equals("Disjuntor 52A1 Fechado") && passo == 9) {
                passo = passo + 1;
                relogio.passo = 10;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52a2fechado.equals("Disjuntor 52A2 Fechado") && passo == 10) {
                passo = passo + 1;
                relogio.passo = 11;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52a3fechado.equals("Disjuntor 52A3 Fechado") && passo == 11) {
                passo = passo + 1;
                relogio.passo = 12;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52a4fechado.equals("Disjuntor 52A4 Fechado") && passo == 12) {
                passo = passo + 1;
                relogio.passo = 13;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52a5fechado.equals("Disjuntor 52A5 Fechado") && passo == 13) {
                passo = passo + 1;
                relogio.passo = 14;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52a6fechado.equals("Disjuntor 52A6 Fechado") && passo == 14) {
                passo = passo + 1;
                relogio.passo = 15;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52a7fechado.equals("Disjuntor 52A7 Fechado") && passo == 15) {
                passo = passo + 1;
                relogio.passo = 16;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52a8fechado.equals("Disjuntor 52A8 Fechado") && passo == 16) {
                passo = passo + 1;
                relogio.passo = 17;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52p1fechado.equals("Disjuntor 52P1 Fechado") && passo == 17) {
                passo = passo + 1;
                relogio.passo = 18;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52p2fechado.equals("Disjuntor 52P2 Fechado") && passo == 18) {
                passo = passo + 1;
                relogio.passo = 19;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52p3fechado.equals("Disjuntor 52P3 Fechado") && passo == 19) {
                passo = passo + 1;
                relogio.passo = 20;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52p4fechado.equals("Disjuntor 52P4 Fechado") && passo == 20) {
                passo = passo + 1;
                relogio.passo = 21;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52p5fechado.equals("Disjuntor 52P5 Fechado") && passo == 21) {
                passo = passo + 1;
                relogio.passo = 22;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso !!!",
                        "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
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
                            "OM para Energizar a SE ALBRAS ! Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
                            "Energizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                // limparMemoria();
            } else {
                Object[] options = { "Sim", "Nao", "Cancelar" };
                int n = JOptionPane.showOptionDialog(null,
                        "Passo para Energizar a SE ALBRAS Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52l2aberto.equals("Disjuntor 52L2 Aberto") && passo == 1) {
                passo = passo + 1;
                relogio.passo = 2;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 2 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52btaberto.equals("Disjuntor 52BT Aberto") && passo == 2) {
                passo = passo + 1;
                relogio.passo = 3;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 3 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52alaberto.equals("Disjuntor 52AL Aberto") && passo == 3) {
                passo = passo + 1;
                relogio.passo = 4;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 4 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52mt1aberto.equals("Disjuntor 52MT-1 Aberto") && passo == 4) {
                passo = passo + 1;
                relogio.passo = 5;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 5 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52mtraberto.equals("Disjuntor 52MT-R Aberto") && passo == 5) {
                passo = passo + 1;
                relogio.passo = 6;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 6 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52mt2aberto.equals("Disjuntor 52MT-2 Aberto") && passo == 6) {
                passo = passo + 1;
                relogio.passo = 7;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 7 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52mt3aberto.equals("Disjuntor 52MT-3 Aberto") && passo == 7) {
                passo = passo + 1;
                relogio.passo = 8;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 8 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52mt4aberto.equals("Disjuntor 52MT-4 Aberto") && passo == 8) {
                passo = passo + 1;
                relogio.passo = 9;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 9 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52alaberto.equals("Disjuntor 52A1 Aberto") && passo == 9) {
                passo = passo + 1;
                relogio.passo = 10;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 10 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (disjuntor52a2aberto.equals("Disjuntor 52A2 Aberto") && passo == 10) {
                passo = passo + 1;
                relogio.passo = 11;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 11 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52a3aberto.equals("Disjuntor 52A3 Aberto") && passo == 11) {
                passo = passo + 1;
                relogio.passo = 12;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 12 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52a4aberto.equals("Disjuntor 52A4 Aberto") && passo == 12) {
                passo = passo + 1;
                relogio.passo = 13;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 13 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52a5aberto.equals("Disjuntor 52A5 Aberto") && passo == 13) {
                passo = passo + 1;
                relogio.passo = 14;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 14 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52a6aberto.equals("Disjuntor 52A6 Aberto") && passo == 14) {
                passo = passo + 1;
                relogio.passo = 15;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 15 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52a7aberto.equals("Disjuntor 52A7 Aberto") && passo == 15) {
                passo = passo + 1;
                relogio.passo = 16;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 16 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52a8aberto.equals("Disjuntor 52A8 Aberto") && passo == 16) {
                passo = passo + 1;
                relogio.passo = 17;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 17 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52p1aberto.equals("Disjuntor 52P1 Aberto") && passo == 17) {
                passo = passo + 1;
                relogio.passo = 18;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 18 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52p2aberto.equals("Disjuntor 52P2 Aberto") && passo == 18) {
                passo = passo + 1;
                relogio.passo = 19;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 19 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52p3aberto.equals("Disjuntor 52P3 Aberto") && passo == 19) {
                passo = passo + 1;
                relogio.passo = 20;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 20 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52p4aberto.equals("Disjuntor 52P4 Aberto") && passo == 20) {
                passo = passo + 1;
                relogio.passo = 21;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 21 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
            } else if (disjuntor52p5aberto.equals("Disjuntor 52P5 Aberto") && passo == 21) {
                passo = passo + 1;
                relogio.passo = 22;
                relogio.rendimento();
                JOptionPane.showMessageDialog(null, "Passo 22 realizado com sucesso !!!",
                        "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
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
                            "OM para Desenergizar a SE ALBRAS ! Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
                            "Desenergizar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                // limparMemoria();
            } else {
                Object[] options = { "Sim", "N�o", "Cancelar" };
                int n = JOptionPane.showOptionDialog(null,
                        "Passo para Desenergizar a SE ALBRAS Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                            "OM para Preparar a SE ALBRAS ! Conclu�da com sucesso!!! N�o esque�a de limpar os dados para continuar Simulando.",
                            "Preparar Subesta��o ALBRAS", JOptionPane.INFORMATION_MESSAGE);
                // limparMemoria();
            } else {
                Object[] options = { "Sim", "N�o", "Cancelar" };
                int n = JOptionPane.showOptionDialog(null,
                        "Passo para preparar a SE ALBRAS Incorreto, Voc� deseja executar o aplicativo Ajuda? ",
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
                            "OM para Transferir do MT-1 para MT-R ! Conclu�da com sucesso!!! Não esqueça de limpar os dados para continuar Simulando.",
                            "Transferir do MT-1 para MT-R", JOptionPane.INFORMATION_MESSAGE);
                limparMemoria();
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

    public void limparMemoria() {
        // manobrainteligente.passo = 0;
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
}// Fim Teste
