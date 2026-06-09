
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
 * MODULO -   RELATORIO GERAL                          *
 ******************************************************/
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.*;

public class RelatorioGeral extends JFrame implements ActionListener {
    JLabel L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, gif, gif1, iJL1, iJL2, iJL3, iJL4, iJL5, iJL6, iJL7;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
    static JTextField tfCodigo, tfEquipamento, tfQuantfechamentosec, tfQuantaberturasec, tfQuantsubirtap,
            tfQuantdescertap, tfTrafoenergizado, tfQuantfecdisjuntor, tfQuantabertdisjuntor, tfConsulta;
    static Choice TagEquipamento;
    JPanel p1 = new JPanel();

    ResultSet rs;
    Statement MeuState, st;
    Connection conexao;
    private Connection con;

    public RelatorioGeral() {
        setTitle("Relatorio Operacional");
        setSize(670, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));

        L10 = new JLabel("               ALBRAS", JLabel.CENTER);
        L10.setFont(new Font("Arial", 1, 54));
        L10.setForeground(Color.blue);

        L11 = new JLabel("        Relatorio Operacional                      ", JLabel.CENTER);
        L11.setFont(new Font("Arial", 1, 45));
        L11.setForeground(Color.blue);

        L12 = new JLabel(" Subestaçao Principal                        ", JLabel.CENTER);
        L12.setFont(new Font("Arial", 1, 34));
        L12.setForeground(Color.red);

        L1 = new JLabel(" Codigo do Equipamento                       ");
        L2 = new JLabel("  Tag do Equipamento");
        L3 = new JLabel(" Quant. de Fechamento das Chaves  ");
        L4 = new JLabel("   Quantidade de  Abertura  das  Chaves      ");
        L5 = new JLabel(" Quant. Fechamento dos Disjuntores");
        L6 = new JLabel("   Quantidade Abertura dos Disjuntores       ");
        L7 = new JLabel(" Quantidade de taps Elevados             ");
        L8 = new JLabel("   Quantidade de taps Reduzidos                   ");
        L9 = new JLabel(" Quantidade de Taps comutados        ");
        L13 = new JLabel("                                                                      ");

        tfCodigo = new JTextField(15);
        tfCodigo.setFont(new Font("Dialog", Font.BOLD, 14));

        TagEquipamento = new Choice();
        TagEquipamento.add("      Seccionadora 89 MT1-A     ");
        TagEquipamento.add("      Seccionadora 89 MT1-B     ");
        TagEquipamento.add("      Seccionadora 89 MT2-A     ");
        TagEquipamento.add("      Seccionadora 89 MT2-B     ");
        TagEquipamento.add("      Seccionadora 89 MTR-A     ");
        TagEquipamento.add("      Seccionadora 89 MTR-B     ");
        TagEquipamento.add("      Seccionadora 89 MT3-A     ");
        TagEquipamento.add("      Seccionadora 89 MT3-B     ");
        TagEquipamento.add("      Seccionadora 89 MT4-A      ");
        TagEquipamento.add("      Seccionadora 89 MT4-B      ");
        TagEquipamento.add("      Seccionadora 89 L1-A      ");
        TagEquipamento.add("      Seccionadora 89 L1-B      ");
        TagEquipamento.add("      Seccionadora 89 L2-A      ");
        TagEquipamento.add("      Seccionadora 89 L2-B      ");
        TagEquipamento.add("      Seccionadora 89 L1        ");
        TagEquipamento.add("      Seccionadora 89 L2        ");
        TagEquipamento.add("      Seccionadora 89 BTA       ");
        TagEquipamento.add("      Seccionadora 89 BTB       ");
        TagEquipamento.add("      Disjuntor 52 MT-1         ");
        TagEquipamento.add("      Disjuntor 52 MT-2         ");
        TagEquipamento.add("      Disjuntor 52 MT-R         ");
        TagEquipamento.add("      Disjuntor 52 MT-3         ");
        TagEquipamento.add("      Disjuntor 52 MT-4         ");
        TagEquipamento.add("      Disjuntor 52 L1           ");
        TagEquipamento.add("      Disjuntor 52 L2           ");
        TagEquipamento.add("      Disjuntor 52 BT           ");

        tfCodigo = new JTextField(7);
        tfCodigo.setFont(new Font("Dialog", Font.BOLD, 14));

        tfEquipamento = new JTextField(17);
        tfEquipamento.setFont(new Font("Dialog", Font.BOLD, 14));

        tfQuantfechamentosec = new JTextField(7);
        tfQuantfechamentosec.setFont(new Font("Dialog", Font.BOLD, 14));

        tfQuantaberturasec = new JTextField(7);
        tfQuantaberturasec.setFont(new Font("Dialog", Font.BOLD, 14));

        tfQuantfecdisjuntor = new JTextField(7);
        tfQuantfecdisjuntor.setFont(new Font("Dialog", Font.BOLD, 14));

        tfQuantabertdisjuntor = new JTextField(7);
        tfQuantabertdisjuntor.setFont(new Font("Dialog", Font.BOLD, 14));

        tfQuantsubirtap = new JTextField(7);
        tfQuantsubirtap.setFont(new Font("Dialog", Font.BOLD, 14));

        tfQuantdescertap = new JTextField(7);
        tfQuantdescertap.setFont(new Font("Dialog", Font.BOLD, 14));

        tfTrafoenergizado = new JTextField(7);
        tfTrafoenergizado.setFont(new Font("Dialog", Font.BOLD, 14));

        b1 = new JButton("Consultar Equipamento");
        b1.addActionListener(this);
        b2 = new JButton("            Limpar             ");
        b2.addActionListener(this);
        b4 = new JButton("  Total Sec. Fechadas  ");
        b4.addActionListener(this);
        b5 = new JButton("  Total Sec. Abertas   ");
        b5.addActionListener(this);
        b6 = new JButton(" Total Disj. Fechados");
        b6.addActionListener(this);
        b7 = new JButton("                  Sair                  ");
        b7.addActionListener(this);
        b8 = new JButton("     Total Disj. Abertos     ");
        b8.addActionListener(this);
        b9 = new JButton("  Total Taps Elevados  ");
        b9.addActionListener(this);
        b10 = new JButton("Total Taps Reduzidos");
        b10.addActionListener(this);

        b1.setBackground(new Color(180, 180, 250));
        b2.setBackground(new Color(180, 180, 250));
        b4.setBackground(new Color(180, 180, 250));
        b5.setBackground(new Color(180, 180, 250));
        b6.setBackground(new Color(180, 180, 250));
        b7.setBackground(new Color(180, 180, 250));
        b8.setBackground(new Color(180, 180, 250));
        b9.setBackground(new Color(180, 180, 250));
        b10.setBackground(new Color(180, 180, 250));

        //for (JButton btn : new JButton[] { b1, b2, b4, b5, b6, b7, b8, b9, b10 }) {
            //btn.setBackground(new Color(180, 180, 250));
            //btn.addActionListener(this);
        //}

        // Ícones
        gif = new JLabel(new ImageIcon("linha.GIF"));
        gif1 = new JLabel(new ImageIcon("Carlos4.GIF"));

        p1.add(L10);
        p1.add(L11);
        p1.add(gif);
        p1.add(L12);
        p1.add(L1);
        p1.add(tfCodigo);
        p1.add(L2);
        p1.add(tfEquipamento);
        p1.add(L3);
        p1.add(tfQuantfechamentosec);
        p1.add(L4);
        p1.add(tfQuantaberturasec);
        p1.add(L5);
        p1.add(tfQuantsubirtap);
        p1.add(L6);
        p1.add(tfQuantdescertap);
        p1.add(L7);
        p1.add(tfTrafoenergizado);
        p1.add(L8);
        p1.add(tfQuantfecdisjuntor);
        p1.add(L9);
        p1.add(tfQuantabertdisjuntor);
        p1.add(L13);
        p1.add(b1);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b8);
        p1.add(b9);
        p1.add(b10);
        p1.add(b2);
        p1.add(b7);

        getContentPane().add(p1);

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/meubanco",
                    "postgres",
                    "Felipe15anos");
            System.out.println("✅ Conectado ao banco com sucesso!");

            // Criando o Statement corretamente
            st = con.createStatement();

            // Faça uma consulta SQL para popular rs (por exemplo, pegar todos os
            // equipamentos ou um em específico)
            rs = st.executeQuery("SELECT * FROM equipamentos LIMIT 1");

            if (rs.next()) {
                atualizaCampos();
            } else {
                System.out.println("⚠️ Nenhum equipamento encontrado no banco.");
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o driver JDBC!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("Problemas na conexão ou na consulta com a fonte de dados");
            ex.printStackTrace();
        }

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
    }

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {
        new InterfaceRelatorios().setVisible(true);
        setVisible(false);
        // this.hide();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) { // CONSULTAR TOTAIS DE UM EQUIPAMENTO ESPECÍFICO

            String equipamentoInformado = tfEquipamento.getText().trim();

            if (equipamentoInformado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite o nome do equipamento para a consulta.");
                return;
            }

            String sql = """
                    SELECT
                        COALESCE(SUM(quantfechamentosec), 0) AS total_fech_sec,
                        COALESCE(SUM(quantaberturasec), 0) AS total_abert_sec,
                        COALESCE(SUM(quantfecdisjuntor), 0) AS total_fech_disj,
                        COALESCE(SUM(quantabertdisjuntor), 0) AS total_abert_disj,
                        COALESCE(SUM(quantsubirtap), 0) AS total_subir_tap,
                        COALESCE(SUM(quantdescertap), 0) AS total_descer_tap
                    FROM equipamentos
                    WHERE equipamento ILIKE ?
                    """;

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, equipamentoInformado);

                try (ResultSet rs = pstmt.executeQuery()) {

                    boolean encontrou = false;
                    StringBuilder todosDados = new StringBuilder();

                    while (rs.next()) {
                        encontrou = true;

                        todosDados.append("==========================================\n");
                        todosDados.append("Tag do Equipamento: ").append(equipamentoInformado).append("\n");
                        todosDados.append("Fechamento das Seccionadoras: ").append(rs.getInt("total_fech_sec"))
                                .append("\n");
                        todosDados.append("Abertura das Seccionadoras: ").append(rs.getInt("total_abert_sec"))
                                .append("\n");
                        todosDados.append("Fechamento dos Disjuntores: ").append(rs.getInt("total_fech_disj"))
                                .append("\n");
                        todosDados.append("Abertura dos Disjuntores: ").append(rs.getInt("total_abert_disj"))
                                .append("\n");
                        todosDados.append("Elevação de Taps: ").append(rs.getInt("total_subir_tap")).append("\n");
                        todosDados.append("Diminuição de Taps: ").append(rs.getInt("total_descer_tap")).append("\n");
                        todosDados.append("==========================================\n\n");
                    }

                    if (encontrou) {
                        JOptionPane.showMessageDialog(null, new JScrollPane(new JTextArea(todosDados.toString())),
                                "Consultas totais dos Equipamentos", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Equipamento não encontrado ou sem dados registrados.",
                                "Aviso", JOptionPane.WARNING_MESSAGE);
                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar: " + ex.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == b2) // ---------------------LIMPAR OS CAMPOS---------------------------------//
        {
            limpaCampos();
        }

        if (e.getSource() == b4) { // CONSULTAR PELA COLUNA QUANTFECHAMENTOSEC

            String equipamentoInformado = tfEquipamento.getText().trim();

            if (equipamentoInformado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite o nome do equipamento para a consulta.");
                return;
            }

            String sql = "SELECT " +
                    "COALESCE(SUM(quantfechamentosec), 0) AS total_fech_sec " +
                    "FROM equipamentos " +
                    "WHERE equipamento ILIKE ?";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, equipamentoInformado);

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {

                        int totalFechSec = rs.getInt("total_fech_sec");

                        // Monta texto no estilo do outro método
                        StringBuilder resultado = new StringBuilder();
                        resultado.append("--------------------------------------------\n")
                                .append("Equipamento: ").append(equipamentoInformado).append("\n")
                                .append("Total de Fechamento das Seccionadoras: ").append(totalFechSec).append("\n")
                                .append("--------------------------------------------\n");

                        JOptionPane.showMessageDialog(null, resultado.toString(),
                                "Total de Seccionadoras Fechadas", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, "Equipamento não encontrado ou sem dados registrados.");
                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar: " + ex.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == b5) { // CONSULTAR PELA COLUNA QUANTABERTURASEC

            String equipamentoInformado = tfEquipamento.getText().trim();

            if (equipamentoInformado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite o nome do equipamento para a consulta.");
                return;
            }

            String sql = "SELECT " +
                    "COALESCE(SUM(quantaberturasec), 0) AS total_abert_sec " +
                    "FROM equipamentos " +
                    "WHERE equipamento ILIKE ?";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, equipamentoInformado);

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        int totalAbertSec = rs.getInt("total_abert_sec");

                        // Monta saída formatada no mesmo padrão do método anterior
                        StringBuilder resultado = new StringBuilder();
                        resultado.append("--------------------------------------------\n")
                                .append("Equipamento: ").append(equipamentoInformado).append("\n")
                                .append("Total de Abertura das Seccionadoras: ").append(totalAbertSec).append("\n")
                                .append("--------------------------------------------\n");

                        JOptionPane.showMessageDialog(null, resultado.toString(),
                                "Total de Seccionadoras Abertas", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, "Equipamento não encontrado ou sem dados registrados.");
                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar: " + ex.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == b6) { // --------- CONSULTAR PELA COLUNA QUANTFECDISJUNTOR ---------

            String equipamentoInformado = tfEquipamento.getText().trim();

            if (equipamentoInformado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite o nome do equipamento para a consulta.");
                return;
            }

            String sql = "SELECT COALESCE(SUM(quantfecdisjuntor), 0) AS total_fech_disj " +
                    "FROM equipamentos " +
                    "WHERE equipamento ILIKE ?";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, equipamentoInformado);

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        int totalFechDisj = rs.getInt("total_fech_disj");

                        // Monta saída formatada no mesmo padrão dos anteriores
                        StringBuilder resultado = new StringBuilder();
                        resultado.append("--------------------------------------------\n")
                                .append("Equipamento: ").append(equipamentoInformado).append("\n")
                                .append("Total de Fechamento dos Disjuntores: ").append(totalFechDisj).append("\n")
                                .append("--------------------------------------------\n");

                        JOptionPane.showMessageDialog(null, resultado.toString(),
                                "Total de disjuntores Fechados", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, "Equipamento não encontrado ou sem dados registrados.");
                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar: " + ex.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == b8) { // --------- CONSULTAR PELA COLUNA QUANTABERTDISJUNTOR ---------

            String equipamentoInformado = tfEquipamento.getText().trim();

            if (equipamentoInformado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite o nome do equipamento para a consulta.");
                return;
            }

            String sql = "SELECT COALESCE(SUM(quantabertdisjuntor), 0) AS total_abert_disj " +
                    "FROM equipamentos " +
                    "WHERE equipamento ILIKE ?";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, equipamentoInformado);

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        int totalAbertDisj = rs.getInt("total_abert_disj");

                        StringBuilder resultado = new StringBuilder();
                        resultado.append("--------------------------------------------\n")
                                .append("Equipamento: ").append(equipamentoInformado).append("\n")
                                .append("Total de Abertura dos Disjuntores: ").append(totalAbertDisj).append("\n")
                                .append("--------------------------------------------\n");

                        JOptionPane.showMessageDialog(null, resultado.toString(),
                                "Total de disjuntores Abertos", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, "Equipamento não encontrado ou sem dados registrados.");
                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar: " + ex.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == b9) { // --------- CONSULTAR PELA COLUNA QUANTSUBIRTAP ---------

            String equipamentoInformado = tfEquipamento.getText().trim();

            if (equipamentoInformado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite o nome do equipamento para a consulta.");
                return;
            }

            String sql = "SELECT COALESCE(SUM(quantsubirtap), 0) AS total_subir_tap " +
                    "FROM equipamentos " +
                    "WHERE equipamento ILIKE ?";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, equipamentoInformado);

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        int totalSubirTap = rs.getInt("total_subir_tap");

                        StringBuilder resultado = new StringBuilder();
                        resultado.append("--------------------------------------------\n")
                                .append("Equipamento: ").append(equipamentoInformado).append("\n")
                                .append("Total de Elevação de Taps: ").append(totalSubirTap).append("\n")
                                .append("--------------------------------------------\n");

                        JOptionPane.showMessageDialog(null, resultado.toString(),
                                "Total de Taps elevados", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, "Equipamento não encontrado ou sem dados registrados.");
                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar: " + ex.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == b10) { // --------- CONSULTAR PELA COLUNA QUANTDESCERTAP ---------

            String equipamentoInformado = tfEquipamento.getText().trim();

            if (equipamentoInformado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite o nome do equipamento para a consulta.");
                return;
            }

            String sql = "SELECT COALESCE(SUM(quantdescertap), 0) AS total_descer_tap " +
                    "FROM equipamentos " +
                    "WHERE equipamento ILIKE ?";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, equipamentoInformado);

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        int totalDescerTap = rs.getInt("total_descer_tap");

                        StringBuilder resultado = new StringBuilder();
                        resultado.append("--------------------------------------------\n")
                                .append("Equipamento: ").append(equipamentoInformado).append("\n")
                                .append("Total de Diminuição de Taps: ").append(totalDescerTap).append("\n")
                                .append("--------------------------------------------\n");

                        JOptionPane.showMessageDialog(null, resultado.toString(),
                                "Totais de Taps reduzidos", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, "Equipamento não encontrado ou sem dados registrados.");
                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar: " + ex.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    // ######################################### FINAL DA LOCALIZAÇAO ####

    public void limpaCampos() {
        tfCodigo.setText("");
        tfEquipamento.setText("");
        tfQuantfechamentosec.setText("");
        tfQuantaberturasec.setText("");
        tfQuantsubirtap.setText("");
        tfQuantfecdisjuntor.setText("");
        tfQuantabertdisjuntor.setText("");
        tfQuantdescertap.setText("");
        tfTrafoenergizado.setText("");
    }

    public void atualizaCampos() {
        try {
            tfCodigo.setText(rs.getString("codigo"));
            tfEquipamento.setText(rs.getString("equipamento"));
            tfQuantfechamentosec.setText(rs.getString("quantfechamentosec"));
            tfQuantaberturasec.setText(rs.getString("quantaberturasec"));
            tfQuantfecdisjuntor.setText(rs.getString("quantfecdisjuntor"));
            tfQuantabertdisjuntor.setText(rs.getString("quantabertdisjuntor"));
            tfQuantsubirtap.setText(rs.getString("quantsubirtap"));
            tfQuantdescertap.setText(rs.getString("quantdescertap"));
            tfTrafoenergizado.setText(rs.getString("trafoenergizado"));
        } catch (SQLException ex) {
        }
    }

    public static void main(String args[]) {
        RelatorioGeral RG = new RelatorioGeral();
        RG.setVisible(true);
    }
}