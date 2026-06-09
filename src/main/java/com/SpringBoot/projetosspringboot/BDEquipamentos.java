
/*******************************************************
 * PROJETO SIMULADOR PARA TREINAMENTO DE OPERADORES DE *
 * SUBESTAAOO.                                         *
 * PROJETISTA E DESENVOLVEDOR:                         *
 *          CARLOS MARDONIO BEZERRA MARTINS            * 
 *         BACHAREL EM SISTEMAS DE INFORMAÇAO          *
 *                                                     *
 * DATA - 18/08/2006                                   *
 * ATUALIZADO - 19/08/2008                            *
 *******************************************************
 * MODULO -   BDEQUIPAMENTOS                           *
 ******************************************************/
import javax.swing.*;
import java.sql.*;

public class BDEquipamentos {
    // private String urlODBC; // Recebe string de conex�o com o banco
    private Connection con; // Recebe string que conecta com o banco
    // private Statement stmt; // Recebe string que permitir� a execu��o SQL
    // private String query; // Recebe comando SQL a ser executado
    private ResultSet rs; // Recebe um conjunto de resultado da tabela

    Equipamentos eqp = new Equipamentos();
    public Usuario objLogin = new Usuario();

    public void ConectarBD() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/meubanco",
                    "postgres",
                    "Felipe15anos");
            System.out.println("✅ Conectado ao banco com sucesso!");
        } catch (Exception e) {
            System.out.println("❌ Falha ao conectar: " + e.getMessage());
            con = null;
        }
    }

    public void fecharConexao() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("🔌 Conexão encerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão: " + e.getMessage());
        }
    }

    public void quantFechamento89mt1a() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt1a();
        eqp.setQuantFechamento89mt1a();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt1a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt1a());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt1a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt1a()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt1a());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT1A cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }

            }
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantAbertura89mt1a() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt1a();
        eqp.setQuantFechamento89mt1a();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt1a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt1a());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt1a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt1a()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt1a());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT1A cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantFechamento89mt1b() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt1b();
        eqp.setQuantFechamento89mt1b();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt1b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt1b());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt1b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt1a()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt1b());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT1B cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAbertura89mt1b() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt1b();
        eqp.setQuantFechamento89mt1b();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt1b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt1b());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt1a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt1b()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt1b());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT1B cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantFechamento52mt1() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52mt1();
        eqp.setQuantFechamento52mt1();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52mt1());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt1());
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt1());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt1()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt1());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52MT1 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAbertura52mt1() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52mt1();
        eqp.setQuantAbertura52mt1();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52mt1());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt1());
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt1());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt1()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt1());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52MT1 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAumentoTapmt1() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        eqp.setNomeTransformadormt1();
        eqp.aumentarTapmt1(); // Atualiza o contador de subida de TAP

        try {
            // Insere apenas os dados relevantes
            String sql = "INSERT INTO equipamentos (" +
                    "equipamento, quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, eqp.nomeTransformadormt1());
                pstmt.setInt(2, eqp.getQuantSubir()); // quantidades de subida
                pstmt.setInt(3, eqp.getQuantDescer()); // descer (possivelmente zero aqui)
                pstmt.setInt(4, eqp.getQuantTaps()); // total de taps usados

                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "O Transformador MT-1 está no Tap" + eqp.getMostrarTapsmt1(),
                            "Tap",
                            JOptionPane.INFORMATION_MESSAGE, (new javax.swing.ImageIcon("formiga.gif")));
                    // JOptionPane.showMessageDialog(null, "Aumentado Tap Trafo MT1 cadastrado com
                    // sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantDiminuirTapmt1() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        eqp.setNomeTransformadormt1();
        eqp.diminuirTapmt1(); // Atualiza o contador de subida de TAP

        try {
            // Insere apenas os dados relevantes
            String sql = "INSERT INTO equipamentos (" +
                    "equipamento, quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, eqp.nomeTransformadormt1());
                pstmt.setInt(2, eqp.getQuantSubir()); // quantidades de subida
                pstmt.setInt(3, eqp.getQuantDescer()); // descer (possivelmente zero aqui)
                pstmt.setInt(4, eqp.getQuantTaps()); // total de taps usados

                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "O Transformador MT-1 está no Tap" + eqp.getMostrarTapsmt1());
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantFechamento89mtra() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mtra();
        eqp.setQuantFechamento89mtra();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mtra());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mtra());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt1a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mtra()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mtra());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MTRA cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAbertura89mtra() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mtra();
        eqp.setQuantFechamento89mtra();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mtra());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mtra());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt1a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mtra()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mtra());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MTRA cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantFechamento89mtrb() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mtrb();
        eqp.setQuantFechamento89mtrb();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mtrb());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mtrb());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mtrb());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mtrb()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mtrb());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MTRB cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAbertura89mtrb() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mtrb();
        eqp.setQuantFechamento89mtrb();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mtrb());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mtrb());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mtrb());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mtrb()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mtrb());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MTRB cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantFechamento52mtr() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52mtr();
        eqp.setQuantFechamento52mtr();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52mt1());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mtr());
                pstmt.setInt(idx++, eqp.getQuantAbertura52mtr());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mtr()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52mtr());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52MTR cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAbertura52mtr() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52mtr();
        eqp.setQuantFechamento52mtr();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52mt1());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mtr());
                pstmt.setInt(idx++, eqp.getQuantAbertura52mtr());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mtr()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52mtr());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52MTR cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAumentoTapmtr() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        eqp.setNomeTransformadormtr();
        eqp.aumentarTapmtr(); // Atualiza o contador de subida de TAP

        try {
            // Insere apenas os dados relevantes
            String sql = "INSERT INTO equipamentos (" +
                    "equipamento, quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, eqp.nomeTransformadormtr());
                pstmt.setInt(2, eqp.getQuantSubir()); // quantidades de subida
                pstmt.setInt(3, eqp.getQuantDescer()); // descer (possivelmente zero aqui)
                pstmt.setInt(4, eqp.getQuantTaps()); // total de taps usados

                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Aumentado Tap Trafo MTR cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantDiminuirTapmtr() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        eqp.setNomeTransformadormt1();
        eqp.diminuirTapmtr(); // Atualiza o contador de subida de TAP

        try {
            // Insere apenas os dados relevantes
            String sql = "INSERT INTO equipamentos (" +
                    "equipamento, quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, eqp.nomeTransformadormtr());
                pstmt.setInt(2, eqp.getQuantSubir()); // quantidades de subida
                pstmt.setInt(3, eqp.getQuantDescer()); // descer (possivelmente zero aqui)
                pstmt.setInt(4, eqp.getQuantTaps()); // total de taps usados

                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Diminuido Tap Trafo MTR cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantFechamento89mt2a() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt2a();
        eqp.setQuantFechamento89mt2a();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt2a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt2a());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt2a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt2a()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt2a());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT2A cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantAbertura89mt2a() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt2a();
        eqp.setQuantFechamento89mt2a();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt2a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt2a());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt2a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt2a()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt2a());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT2A cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantFechamento89mt2b() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt2b();
        eqp.setQuantFechamento89mt2b();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt2b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt2b());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt2b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt2b()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt2b());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT2B cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAbertura89mt2b() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt2b();
        eqp.setQuantFechamento89mt2b();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt2b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt2b());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt2b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt1a()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt2b());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT2B cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantFechamento52mt2() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52mt2();
        eqp.setQuantFechamento52mt2();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52mt2());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt2());
                pstmt.setInt(idx++, eqp.getQuantAbertura52mtr());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt2()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt2());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52MT2 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAbertura52mt2() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52mt2();
        eqp.setQuantAbertura52mt2();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52mt2());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt2());
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt2());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt2()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt2());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52MT2 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAumentoTapmt2() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        eqp.setNomeTransformadormt2();
        eqp.aumentarTapmt2(); // Atualiza o contador de subida de TAP

        try {
            // Insere apenas os dados relevantes
            String sql = "INSERT INTO equipamentos (" +
                    "equipamento, quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, eqp.nomeTransformadormt2());
                pstmt.setInt(2, eqp.getQuantSubir()); // quantidades de subida
                pstmt.setInt(3, eqp.getQuantDescer()); // descer (possivelmente zero aqui)
                pstmt.setInt(4, eqp.getQuantTaps()); // total de taps usados

                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Aumentado Tap Trafo MT-2 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantDiminuirTapmt2() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        eqp.setNomeTransformadormt2();
        eqp.diminuirTapmt2(); // Atualiza o contador de subida de TAP

        try {
            // Insere apenas os dados relevantes
            String sql = "INSERT INTO equipamentos (" +
                    "equipamento, quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, eqp.nomeTransformadormt2());
                pstmt.setInt(2, eqp.getQuantSubir()); // quantidades de subida
                pstmt.setInt(3, eqp.getQuantDescer()); // descer (possivelmente zero aqui)
                pstmt.setInt(4, eqp.getQuantTaps()); // total de taps usados

                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Aumentado Tap Trafo MT-2 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantFechamento89mt3a() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt3a();
        eqp.setQuantFechamento89mt3a();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt3a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt3a());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt3a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt3a()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt3a());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT3A cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAbertura89mt3a() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt3a();
        eqp.setQuantAbertura89mt3a();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt3a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt3a());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt3a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt3a()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt3a());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT3A cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantFechamento89mt3b() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt3b();
        eqp.setQuantFechamento89mt3b();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt3b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt3b());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt3b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt3b()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt3b());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT3B cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAbertura89mt3b() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt3b();
        eqp.setQuantAbertura89mt3b();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt3b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt3b());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt3b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt3b()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt3b());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT3B cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantFechamento52mt3() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52mt3();
        eqp.setQuantFechamento52mt3();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52mt3());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt3());
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt3());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt3()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt3());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52MT3 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAbertura52mt3() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52mt3();
        eqp.setQuantAbertura52mt3();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52mt3());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt3());
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt3());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt3()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt3());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52MT3 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAumentoTapmt3() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        eqp.setNomeTransformadormt3();
        eqp.aumentarTapmt3(); // Atualiza o contador de subida de TAP

        try {
            // Insere apenas os dados relevantes
            String sql = "INSERT INTO equipamentos (" +
                    "equipamento, quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, eqp.nomeTransformadormt3());
                pstmt.setInt(2, eqp.getQuantSubir()); // quantidades de subida
                pstmt.setInt(3, eqp.getQuantDescer()); // descer (possivelmente zero aqui)
                pstmt.setInt(4, eqp.getQuantTaps()); // total de taps usados

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Aumentado Tap Trafo MT3 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantDiminuirTapmt3() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        eqp.setNomeTransformadormt3();
        eqp.diminuirTapmt3(); // Atualiza o contador de subida de TAP

        try {
            // Insere apenas os dados relevantes
            String sql = "INSERT INTO equipamentos (" +
                    "equipamento, quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, eqp.nomeTransformadormt3());
                pstmt.setInt(2, eqp.getQuantSubir()); // quantidades de subida
                pstmt.setInt(3, eqp.getQuantDescer()); // descer (possivelmente zero aqui)
                pstmt.setInt(4, eqp.getQuantTaps()); // total de taps usados

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Diminuir Tap Trafo MT3 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantFechamento89mt4a() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt4a();
        eqp.setQuantFechamento89mt4a();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt4a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt4a());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt4a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt4a()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt4a());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                // if (resultado > 0) {
                // JOptionPane.showMessageDialog(null, "Equipamento 89MT4A cadastrado com
                // sucesso!");
                // } else {
                // JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                // }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantAbertura89mt4a() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt4a();
        eqp.setQuantAbertura89mt4a();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt4a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt4a());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt4a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt4a()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt4a());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT4A cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantFechamento89mt4b() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt4b();
        eqp.setQuantFechamento89mt4b();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt4b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt4b());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt4b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt4b()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt4b());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT4B cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAbertura89mt4b() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89mt4b();
        eqp.setQuantAbertura89mt4b();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89mt4b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt4b());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt4b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89mt4b()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt4b());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89MT4B cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantFechamento52mt4() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52mt4();
        eqp.setQuantFechamento52mt4();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52mt4());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt4());
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt4());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt4()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt4());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52MT4 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAbertura52mt4() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52mt4();
        eqp.setQuantAbertura52mt4();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52mt4());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt4());
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt4());
                pstmt.setInt(idx++, eqp.getQuantFechamento52mt4()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52mt4());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52MT4 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantAumentoTapmt4() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        eqp.setNomeTransformadormt4();
        eqp.aumentarTapmt4(); // Atualiza o contador de subida de TAP

        try {
            // Insere apenas os dados relevantes
            String sql = "INSERT INTO equipamentos (" +
                    "equipamento, quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, eqp.nomeTransformadormt1());
                pstmt.setInt(2, eqp.getQuantSubir()); // quantidades de subida
                pstmt.setInt(3, eqp.getQuantDescer()); // descer (possivelmente zero aqui)
                pstmt.setInt(4, eqp.getQuantTaps()); // total de taps usados

                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Aumentado Tap Trafo MT4 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void QuantDiminuirTapmt4() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        eqp.setNomeTransformadormt4();
        eqp.diminuirTapmt4(); // Atualiza o contador de subida de TAP

        try {
            // Insere apenas os dados relevantes
            String sql = "INSERT INTO equipamentos (" +
                    "equipamento, quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, eqp.nomeTransformadormt4());
                pstmt.setInt(2, eqp.getQuantSubir()); // quantidades de subida
                pstmt.setInt(3, eqp.getQuantDescer()); // descer (possivelmente zero aqui)
                pstmt.setInt(4, eqp.getQuantTaps()); // total de taps usados

                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Aumentado Tap Trafo MT4 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantFechamento89l1a() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89l1a();
        eqp.setQuantFechamento89l1a();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89l1a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l1a());
                pstmt.setInt(idx++, eqp.getQuantAbertura89mt1a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l1a()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89l1a());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89L1A cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantAbertura89l1a() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89l1a();
        eqp.setQuantAbertura89l1a();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89l1a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l1a());
                pstmt.setInt(idx++, eqp.getQuantAbertura89l1a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l1a()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89l1a());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89L1A cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantFechamento89l1b() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89l1b();
        eqp.setQuantFechamento89l1b();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89l1b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l1b());
                pstmt.setInt(idx++, eqp.getQuantAbertura89l1b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l1b()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89l1b());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89L1B cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantAbertura89l1b() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89l1b();
        eqp.setQuantAbertura89l1b();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89l1b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l1b());
                pstmt.setInt(idx++, eqp.getQuantAbertura89l1b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l1b()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89l1b());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89L1B cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantFechamento52l1() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52l1();
        eqp.setQuantFechamento52l1();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52l1());
                pstmt.setInt(idx++, eqp.getQuantFechamento52l1());
                pstmt.setInt(idx++, eqp.getQuantAbertura52l1());
                pstmt.setInt(idx++, eqp.getQuantFechamento52l1()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52l1());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52L1 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantAbertura52l1() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52l1();
        eqp.setQuantAbertura52l1();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52l1());
                pstmt.setInt(idx++, eqp.getQuantFechamento52l1());
                pstmt.setInt(idx++, eqp.getQuantAbertura52l1());
                pstmt.setInt(idx++, eqp.getQuantFechamento52l1()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52l1());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52L1 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantFechamento89l1() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89l1();
        eqp.setQuantFechamento89l1();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89l1());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l1());
                pstmt.setInt(idx++, eqp.getQuantAbertura89l1());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l1()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89l1());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89L1 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantAbertura89l1() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89l1();
        eqp.setQuantAbertura89l1();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89l1());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l1());
                pstmt.setInt(idx++, eqp.getQuantAbertura89l1());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l1()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89l1());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89L1 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantFechamento89l2a() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89l2a();
        eqp.setQuantFechamento89l2a();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89l2a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l2a());
                pstmt.setInt(idx++, eqp.getQuantAbertura89l2a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l2a()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89l2a());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89L2A cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantAbertura89l2a() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89l2a();
        eqp.setQuantAbertura89l2a();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89l2a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l2a());
                pstmt.setInt(idx++, eqp.getQuantAbertura89l2a());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l2a()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89l2a());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89L2A cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantFechamento89l2b() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89l2b();
        eqp.setQuantFechamento89l2b();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89l2b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l2b());
                pstmt.setInt(idx++, eqp.getQuantAbertura89l2b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l2b()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89l2b());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89L2B cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantAbertura89l2b() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89l2b();
        eqp.setQuantAbertura89l2b();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89l2b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l2b());
                pstmt.setInt(idx++, eqp.getQuantAbertura89l2b());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l2b()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89l2b());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89L2B cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantFechamento52l2() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52l2();
        eqp.setQuantFechamento52l2();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52l2());
                pstmt.setInt(idx++, eqp.getQuantFechamento52l2());
                pstmt.setInt(idx++, eqp.getQuantAbertura52l2());
                pstmt.setInt(idx++, eqp.getQuantFechamento52l2()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52l2());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52L2 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantAbertura52l2() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52l2();
        eqp.setQuantAbertura52l2();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52l2());
                pstmt.setInt(idx++, eqp.getQuantFechamento52l2());
                pstmt.setInt(idx++, eqp.getQuantAbertura52l2());
                pstmt.setInt(idx++, eqp.getQuantFechamento52l2()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52l2());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52L2 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantFechamento89l2() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89l2();
        eqp.setQuantFechamento89l2();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89l2());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l2());
                pstmt.setInt(idx++, eqp.getQuantAbertura89l2());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l2()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89l2());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89L2 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantAbertura89l2() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89l2();
        eqp.setQuantAbertura89l2();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89l2());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l2());
                pstmt.setInt(idx++, eqp.getQuantAbertura89l2());
                pstmt.setInt(idx++, eqp.getQuantFechamento89l2()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89l2());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89L2 cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantFechamento89bta() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89bta();
        eqp.setQuantFechamento89bta();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89bta());
                pstmt.setInt(idx++, eqp.getQuantFechamento89bta());
                pstmt.setInt(idx++, eqp.getQuantAbertura89bta());
                pstmt.setInt(idx++, eqp.getQuantFechamento89bta()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89bta());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89BTA cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantAbertura89bta() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89bta();
        eqp.setQuantAbertura89bta();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89bta());
                pstmt.setInt(idx++, eqp.getQuantFechamento89bta());
                pstmt.setInt(idx++, eqp.getQuantAbertura89bta());
                pstmt.setInt(idx++, eqp.getQuantFechamento89bta()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89bta());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89BTA cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantFechamento89btb() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89btb();
        eqp.setQuantFechamento89btb();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89btb());
                pstmt.setInt(idx++, eqp.getQuantFechamento89btb());
                pstmt.setInt(idx++, eqp.getQuantAbertura89btb());
                pstmt.setInt(idx++, eqp.getQuantFechamento89btb()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89btb());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89BTB cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantAbertura89btb() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeSeccionadora89btb();
        eqp.setQuantAbertura89btb();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeSeccionadora89btb());
                pstmt.setInt(idx++, eqp.getQuantFechamento89btb());
                pstmt.setInt(idx++, eqp.getQuantAbertura89btb());
                pstmt.setInt(idx++, eqp.getQuantFechamento89btb()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura89btb());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 89BTB cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantFechamento52bt() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52bt();
        eqp.setQuantFechamento52bt();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52bt());
                pstmt.setInt(idx++, eqp.getQuantFechamento52bt());
                pstmt.setInt(idx++, eqp.getQuantAbertura52bt());
                pstmt.setInt(idx++, eqp.getQuantFechamento52bt()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52bt());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52BT cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void quantAbertura52bt() {
        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        ConectarBD(); // Conecta ao PostgreSQL
        if (con == null)
            return;

        // Preenche os dados do objeto eqp (equipamento)
        eqp.setNomeDisjuntor52bt();
        eqp.setQuantAbertura52bt();

        // Remova essa linha se o código for gerado automaticamente pelo banco de dados
        // eqp.setCodigo();

        try {
            String sql = "INSERT INTO equipamentos (" +
            // Remova a coluna 'codigo' se ela for SERIAL (auto-incremento)
                    "equipamento, " +
                    "quantfechamentosec, quantaberturasec, " +
                    "quantfecdisjuntor, quantabertdisjuntor, " +
                    "quantsubirtap, quantdescertap, trafoenergizado) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                int idx = 1;
                pstmt.setString(idx++, eqp.nomeDisjuntor52bt());
                pstmt.setInt(idx++, eqp.getQuantFechamento52bt());
                pstmt.setInt(idx++, eqp.getQuantAbertura52bt());
                pstmt.setInt(idx++, eqp.getQuantFechamento52bt()); // Repetição — talvez diferenciar
                pstmt.setInt(idx++, eqp.getQuantAbertura52bt());
                pstmt.setInt(idx++, eqp.getQuantSubir());
                pstmt.setInt(idx++, eqp.getQuantDescer());
                pstmt.setInt(idx++, eqp.getQuantTaps());

                pstmt.executeUpdate();
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Equipamento 52BT cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Equipamento foi cadastrado.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir equipamento: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }
}