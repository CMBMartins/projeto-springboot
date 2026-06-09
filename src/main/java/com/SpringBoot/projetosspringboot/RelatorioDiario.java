
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
 * MODULO -   RELATORIO DIARIO                          *
 ******************************************************/
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.*;

public class RelatorioDiario extends JFrame implements ActionListener {
    JLabel L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, gif, gif1, iJL1, iJL2, iJL3, iJL4, iJL5, iJL6;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
    static JTextField tfCodigo, tfTagEquipamento, tfUsuario, tfData, tfOperaçao, tfManobra;
    static Choice TagEquipamento;
    String codigo = "", tagequipamento = "", usuario = "", data = "", operaçao = "", manobra = "";

    JPanel p1 = new JPanel();

    ResultSet rs;
    Statement MeuState, st;
    Connection conexao;
    private Connection con;

    public RelatorioDiario() {
        setTitle("Relatorio Diario de Eventos");
        setSize(677, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));

        L10 = new JLabel("               ALBRAS ", JLabel.CENTER);
        L10.setFont(new Font("Arial", 1, 54));
        L10.setForeground(Color.blue);

        L11 = new JLabel("    Relatorio Diario de Eventos ", JLabel.CENTER);
        L11.setFont(new Font("Arial", 1, 45));
        L11.setForeground(Color.blue);

        L12 = new JLabel(" Subestaçao Principal                         ", JLabel.CENTER);
        L12.setFont(new Font("Arial", 1, 34));
        L12.setForeground(Color.red);

        L13 = new JLabel(
                "                                                                                                                                                                                                                    ");

        L1 = new JLabel(" Codigo     ");
        L2 = new JLabel("    Tag do Equipamento");
        L3 = new JLabel(" Usuario    ");
        L4 = new JLabel("     Data                             ");
        L5 = new JLabel(" Operaçao");
        L6 = new JLabel("       Manobra                     ");
        L9 = new JLabel(
                "                                                                                                                                                                                                                    ");

        tfCodigo = new JTextField(20);
        tfCodigo.setFont(new Font("Dialog", Font.PLAIN, 14));
        // tfCodigo.addActionListener(this);

        tfTagEquipamento = new JTextField(18);
        tfTagEquipamento.setFont(new Font("Dialog", Font.BOLD, 14));

        tfUsuario = new JTextField(18);
        tfUsuario.setFont(new Font("Dialog", Font.BOLD, 14));

        tfData = new JTextField(20);
        tfData.setFont(new Font("Dialog", Font.PLAIN, 14));

        tfOperaçao = new JTextField(19);
        tfOperaçao.setFont(new Font("Dialog", Font.PLAIN, 14));

        tfManobra = new JTextField(20);
        tfManobra.setFont(new Font("Dialog", Font.PLAIN, 14));
        // tfManobra.setText("");

        b1 = new JButton("Consultar Equipamento");
        b2 = new JButton("    Limpar   ");
        b3 = new JButton("Consultar Manobra");
        b4 = new JButton("Consultar Data");
        b7 = new JButton("        Sair        ");

        for (JButton btn : new JButton[] { b1, b2, b3, b4, b7 }) {
            btn.setBackground(new Color(180, 180, 250));
            btn.addActionListener(this);
        }

        // Ícones
        gif = new JLabel(new ImageIcon("linha.GIF"));
        gif1 = new JLabel(new ImageIcon("Carlos4.GIF"));

        p1.add(L10);
        p1.add(L11);
        p1.add(gif);
        p1.add(L12);
        p1.add(L13);
        p1.add(L1);
        p1.add(tfCodigo);
        p1.add(L2);
        p1.add(tfTagEquipamento);
        p1.add(L3);
        p1.add(tfUsuario);
        p1.add(L4);
        p1.add(tfData);
        p1.add(L5);
        p1.add(tfOperaçao);
        p1.add(L6);
        p1.add(tfManobra);
        p1.add(L9);
        p1.add(b1);
        p1.add(b3);
        p1.add(b4);
        p1.add(b2);
        p1.add(b7);

        getContentPane().add(p1);

        // conectarBanco();
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
            rs = st.executeQuery("SELECT * FROM eventos LIMIT 1");

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

    // Executar a Classe de Menu dos Relatorios()
    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {
        new InterfaceRelatorios().setVisible(true);
        setVisible(false);
        // this.hide();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            // private void consultarPorTag() {
            if (tfTagEquipamento.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, informe a Tag do Equipamento para consulta.");
                return;
            }

            String SQL = "SELECT * FROM eventos WHERE tagequipamento = ? ORDER BY data";

            try (PreparedStatement pstmt = con.prepareStatement(SQL)) {
                pstmt.setString(1, tfTagEquipamento.getText().trim());
                ResultSet rs = pstmt.executeQuery();

                // Usa StringBuilder para reunir todos os resultados antes de exibir
                StringBuilder todosDados = new StringBuilder();
                boolean encontrou = false;

                while (rs.next()) {
                    encontrou = true;
                    todosDados
                            .append("Código: ").append(rs.getInt("codigo")).append("\n")
                            .append("Tag do Equipamento: ").append(rs.getString("tagequipamento")).append("\n")
                            .append("Usuário: ").append(rs.getString("usuario")).append("\n")
                            .append("Data: ").append(rs.getString("data")).append("\n")
                            .append("Operação: ").append(rs.getString("operacao")).append("\n")
                            .append("Manobra: ").append(rs.getString("manobra")).append("\n")
                            .append("--------------------------------------------\n");
                }

                if (encontrou) {
                    JOptionPane.showMessageDialog(
                            null,
                            todosDados.toString(),
                            "Eventos encontrados",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Nenhum evento encontrado para o equipamento informado.",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar: " + ex.getMessage(), "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        // private void consultarPorManobra() {
        if (e.getSource() == b3) {
            if (tfManobra.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, informe a manobra para consulta.");
                return;
            }

            String SQL = "SELECT * FROM eventos WHERE manobra = ? ORDER BY data";

            try (PreparedStatement pstmt = con.prepareStatement(SQL)) {
                pstmt.setString(1, tfManobra.getText().trim());
                ResultSet rs = pstmt.executeQuery();

                StringBuilder todosDados = new StringBuilder();
                boolean encontrou = false;

                while (rs.next()) {
                    encontrou = true;
                    todosDados
                            .append("Código: ").append(rs.getInt("codigo")).append("\n")
                            .append("Tag do Equipamento: ").append(rs.getString("tagequipamento")).append("\n")
                            .append("Usuário: ").append(rs.getString("usuario")).append("\n")
                            .append("Data: ").append(rs.getString("data")).append("\n")
                            .append("Operação: ").append(rs.getString("operacao")).append("\n")
                            .append("Manobra: ").append(rs.getString("manobra")).append("\n")
                            .append("--------------------------------------------\n");
                }

                if (encontrou) {
                    JOptionPane.showMessageDialog(
                            null,
                            todosDados.toString(),
                            "Manobras encontradas",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Nenhuma manobra encontrada para o equipamento informado.",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar: " + ex.getMessage(), "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == b4) {
            String entrada = tfData.getText().trim();
            if (entrada.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, informe a data para consulta.");
                return;
            }

            StringBuilder todosDados = new StringBuilder();
            boolean encontrou = false;

            // 1) tentativa simples: busca por texto (ILIKE) - captura formatos aproximados
            String sqlTextLike = "SELECT * FROM eventos WHERE data ILIKE ? ORDER BY tagequipamento";
            try (PreparedStatement p = con.prepareStatement(sqlTextLike)) {
                p.setString(1, "%" + entrada + "%");
                try (ResultSet rs = p.executeQuery()) {
                    while (rs.next()) {
                        encontrou = true;
                        todosDados.append("Código: ").append(rs.getInt("codigo")).append("\n")
                                .append("Tag do Equipamento: ").append(rs.getString("tagequipamento")).append("\n")
                                .append("Usuário: ").append(rs.getString("usuario")).append("\n")
                                .append("Data: ").append(rs.getString("data")).append("\n")
                                .append("Operação: ").append(rs.getString("operacao")).append("\n")
                                .append("Manobra: ").append(rs.getString("manobra")).append("\n")
                                .append("--------------------------------------------\n");
                    }
                }
            } catch (SQLException ex) {
                // não aborta; tenta próximas estratégias
                System.err.println("Erro na busca ILIKE: " + ex.getMessage());
            }

            // Se não encontrou, tente interpretar dd/MM/yyyy e comparar convertendo a
            // coluna com to_date(...)
            if (!encontrou) {
                try {
                    java.time.format.DateTimeFormatter fmtDDMMYYYY = java.time.format.DateTimeFormatter
                            .ofPattern("dd/MM/yyyy");
                    java.time.LocalDate ld = java.time.LocalDate.parse(entrada, fmtDDMMYYYY);
                    java.sql.Date sqlDate = java.sql.Date.valueOf(ld);

                    String sqlToDateDD = "SELECT * FROM eventos WHERE to_date(data, 'DD/MM/YYYY') = ? ORDER BY tagequipamento";
                    try (PreparedStatement p2 = con.prepareStatement(sqlToDateDD)) {
                        p2.setDate(1, sqlDate);
                        try (ResultSet rs2 = p2.executeQuery()) {
                            while (rs2.next()) {
                                encontrou = true;
                                todosDados.append("Código: ").append(rs2.getInt("codigo")).append("\n")
                                        .append("Tag do Equipamento: ").append(rs2.getString("tagequipamento"))
                                        .append("\n")
                                        .append("Usuário: ").append(rs2.getString("usuario")).append("\n")
                                        .append("Data: ").append(rs2.getString("data")).append("\n")
                                        .append("Operação: ").append(rs2.getString("operacao")).append("\n")
                                        .append("Manobra: ").append(rs2.getString("manobra")).append("\n")
                                        .append("--------------------------------------------\n");
                            }
                        }
                    }
                } catch (java.time.format.DateTimeParseException dtpe) {
                    // entrada não estava em dd/MM/yyyy — ignora e tenta próximo formato
                } catch (SQLException ex) {
                    System.err.println("Erro na busca to_date DD/MM/YYYY: " + ex.getMessage());
                }
            }

            // Se ainda não encontrou, tente interpretar yyyy-MM-dd (ISO) e comparar
            if (!encontrou) {
                try {
                    java.time.LocalDate ldIso = java.time.LocalDate.parse(entrada); // espera yyyy-MM-dd
                    java.sql.Date sqlDateIso = java.sql.Date.valueOf(ldIso);

                    String sqlToDateISO = "SELECT * FROM eventos WHERE to_date(data, 'YYYY-MM-DD') = ? ORDER BY tagequipamento";
                    try (PreparedStatement p3 = con.prepareStatement(sqlToDateISO)) {
                        p3.setDate(1, sqlDateIso);
                        try (ResultSet rs3 = p3.executeQuery()) {
                            while (rs3.next()) {
                                encontrou = true;
                                todosDados.append("Código: ").append(rs3.getInt("codigo")).append("\n")
                                        .append("Tag do Equipamento: ").append(rs3.getString("tagequipamento"))
                                        .append("\n")
                                        .append("Usuário: ").append(rs3.getString("usuario")).append("\n")
                                        .append("Data: ").append(rs3.getString("data")).append("\n")
                                        .append("Operação: ").append(rs3.getString("operacao")).append("\n")
                                        .append("Manobra: ").append(rs3.getString("manobra")).append("\n")
                                        .append("--------------------------------------------\n");
                            }
                        }
                    }
                } catch (java.time.format.DateTimeParseException dtpe) {
                    // não era ISO, ignora
                } catch (SQLException ex) {
                    System.err.println("Erro na busca to_date YYYY-MM-DD: " + ex.getMessage());
                }
            }

            // Resultado final
            if (encontrou) {
                JOptionPane.showMessageDialog(null, todosDados.toString(), "Eventos encontrados",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Nenhum evento encontrado para a data informada.\n Verifique se essa data está gravada na coluna.",
                        "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        }

        if (e.getSource() == b2) // ---------------------LIMPAR OS CAMPOS---------------------------------//
        {
            limpaCampos();
        }

        // if (e.getSource() == b7) // ------------------Chamar Menu dos Relatórios
        // ---------------------//
        // {
        // new InterfaceRelatorios().setVisible(true);
        // setVisible(false);
        // }
    }

    public void limpaCampos() {
        tfCodigo.setText("");
        tfTagEquipamento.setText("");
        tfUsuario.setText("");
        tfData.setText("");
        tfOperaçao.setText("");
        tfManobra.setText("");
    }

    public void atualizaCampos() {
        try {
            tfCodigo.setText(rs.getString("codigo"));
            tfTagEquipamento.setText(rs.getString("tagequipamento"));
            tfUsuario.setText(rs.getString("usuario"));
            tfData.setText(rs.getString("data"));
            tfOperaçao.setText(rs.getString("operacao"));
            tfManobra.setText(rs.getString("manobra"));
        } catch (SQLException ex) {
        }
    }

    public static void main(String args[]) {
        RelatorioDiario RD = new RelatorioDiario();
        RD.setVisible(true);
    }
}