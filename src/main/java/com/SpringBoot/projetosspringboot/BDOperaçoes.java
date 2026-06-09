
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
 * MODULO -   BDOPERAÇOES                              *
 ******************************************************/
import javax.swing.*;
import java.sql.*;

public class BDOperaçoes {

    private Connection con; // Recebe string que conecta com o banco
    private Statement stmt; // Recebe string que permitir� a execu��o SQL
    // Recebe um conjunto de resultado da tabela

    Operaçoes o = new Operaçoes();
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

    public void operaçao89mt1aFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89mt1a();
        eqp.setNomeSeccionadora89mt1a();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt1a());
            pstmt.setString(2, eqp.nomeSeccionadora89mt1a());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT1A realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt1aAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89mt1a();
        eqp.setNomeSeccionadora89mt1a();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt1a());
            pstmt.setString(2, eqp.nomeSeccionadora89mt1a());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT1A realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt1bFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89mt1b();
        eqp.setNomeSeccionadora89mt1b();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt1b());
            pstmt.setString(2, eqp.nomeSeccionadora89mt1b());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT1B realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt1bAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89mt1b();
        eqp.setNomeSeccionadora89mt1b();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt1b());
            pstmt.setString(2, eqp.nomeSeccionadora89mt1b());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT1B realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52mt1Fechado(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharDisjuntor52mt1();
        eqp.setNomeDisjuntor52mt1();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52mt1());
            pstmt.setString(2, eqp.nomeDisjuntor52mt1());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52MT1 realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52mt1Aberto(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirDisjuntor52mt1();
        eqp.setNomeDisjuntor52mt1();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52mt1());
            pstmt.setString(2, eqp.nomeDisjuntor52mt1());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52MT1 realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mtraFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89mtra();
        eqp.setNomeSeccionadora89mtra();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mtra());
            pstmt.setString(2, eqp.nomeSeccionadora89mtra());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MTRA realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mtraAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89mtra();
        eqp.setNomeSeccionadora89mtra();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mtra());
            pstmt.setString(2, eqp.nomeSeccionadora89mtra());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MTRA realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mtrbFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89mtrb();
        eqp.setNomeSeccionadora89mtrb();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mtrb());
            pstmt.setString(2, eqp.nomeSeccionadora89mtrb());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MTRB realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mtrbAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89mtrb();
        eqp.setNomeSeccionadora89mtrb();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mtrb());
            pstmt.setString(2, eqp.nomeSeccionadora89mtrb());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MTRB realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52mtrFechado(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharDisjuntor52mt1();
        eqp.setNomeDisjuntor52mt1();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52mtr());
            pstmt.setString(2, eqp.nomeDisjuntor52mtr());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52MTR realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52mtrAberto(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirDisjuntor52mtr();
        eqp.setNomeDisjuntor52mtr();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52mtr());
            pstmt.setString(2, eqp.nomeDisjuntor52mtr());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52MTR realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt2aFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89mt2a();
        eqp.setNomeSeccionadora89mt2a();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt2a());
            pstmt.setString(2, eqp.nomeSeccionadora89mt2a());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT2-A realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt2aAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89mt2a();
        eqp.setNomeSeccionadora89mt2a();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt2a());
            pstmt.setString(2, eqp.nomeSeccionadora89mt2a());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT2-A realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt2bFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89mt2b();
        eqp.setNomeSeccionadora89mt2b();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt2b());
            pstmt.setString(2, eqp.nomeSeccionadora89mt2b());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT2B realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt2bAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89mt2b();
        eqp.setNomeSeccionadora89mt2b();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt2b());
            pstmt.setString(2, eqp.nomeSeccionadora89mt2b());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT2B realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52mt2Fechado(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharDisjuntor52mt2();
        eqp.setNomeDisjuntor52mt2();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52mt2());
            pstmt.setString(2, eqp.nomeDisjuntor52mt2());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52MT2 realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52mt2Aberto(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirDisjuntor52mt2();
        eqp.setNomeDisjuntor52mt2();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52mt2());
            pstmt.setString(2, eqp.nomeDisjuntor52mt2());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52MT2 realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89l1aFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89l1a();
        eqp.setNomeSeccionadora89l1a();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89l1a());
            pstmt.setString(2, eqp.nomeSeccionadora89l1a());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89L1A realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89l1aAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89l1a();
        eqp.setNomeSeccionadora89l1a();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89l1a());
            pstmt.setString(2, eqp.nomeSeccionadora89l1a());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89L1A realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89l1bFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89l1b();
        eqp.setNomeSeccionadora89l1b();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89l1b());
            pstmt.setString(2, eqp.nomeSeccionadora89l1b());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89L1B realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89l1bAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89l1b();
        eqp.setNomeSeccionadora89l1b();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89l1b());
            pstmt.setString(2, eqp.nomeSeccionadora89l1b());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89L1B realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52l1Fechado(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharDisjuntor52l1();
        eqp.setNomeDisjuntor52l1();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52l1());
            pstmt.setString(2, eqp.nomeDisjuntor52l1());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52L1 realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52l1Aberto(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirDisjuntor52l1();
        eqp.setNomeDisjuntor52l1();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52l1());
            pstmt.setString(2, eqp.nomeDisjuntor52l1());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52L1 realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89l2aFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89l2a();
        eqp.setNomeSeccionadora89l2a();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89l2a());
            pstmt.setString(2, eqp.nomeSeccionadora89l2a());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89L2-A realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89l2aAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89l2a();
        eqp.setNomeSeccionadora89l2a();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89l2a());
            pstmt.setString(2, eqp.nomeSeccionadora89l2a());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89L2-A realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89l2bFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89l2b();
        eqp.setNomeSeccionadora89l2b();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89l2b());
            pstmt.setString(2, eqp.nomeSeccionadora89l2b());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89L2B realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89l2bAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89l2b();
        eqp.setNomeSeccionadora89l2b();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89l2b());
            pstmt.setString(2, eqp.nomeSeccionadora89l2b());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89L2B realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52l2Fechado(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharDisjuntor52l2();
        eqp.setNomeDisjuntor52l2();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52l2());
            pstmt.setString(2, eqp.nomeDisjuntor52l2());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52L2 realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52l2Aberto(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirDisjuntor52l2();
        eqp.setNomeDisjuntor52l2();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52l2());
            pstmt.setString(2, eqp.nomeDisjuntor52l2());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52L2 realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89btaFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89bta();
        eqp.setNomeSeccionadora89bta();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89bta());
            pstmt.setString(2, eqp.nomeSeccionadora89bta());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89BT-A realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89btaAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89bta();
        eqp.setNomeSeccionadora89bta();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89bta());
            pstmt.setString(2, eqp.nomeSeccionadora89bta());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89BT-A realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89btbFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89btb();
        eqp.setNomeSeccionadora89btb();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89btb());
            pstmt.setString(2, eqp.nomeSeccionadora89btb());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89BTB realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89btbAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89btb();
        eqp.setNomeSeccionadora89btb();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89btb());
            pstmt.setString(2, eqp.nomeSeccionadora89btb());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89BTB realizada com sucesso!");
            // } else {
            JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52btFechado(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharDisjuntor52bt();
        eqp.setNomeDisjuntor52bt();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52bt());
            pstmt.setString(2, eqp.nomeDisjuntor52bt());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52BT realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52btAberto(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirDisjuntor52bt();
        eqp.setNomeDisjuntor52bt();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52bt());
            pstmt.setString(2, eqp.nomeDisjuntor52bt());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52BT realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt3aFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89mt3a();
        eqp.setNomeSeccionadora89mt3a();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt3a());
            pstmt.setString(2, eqp.nomeSeccionadora89mt3a());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT3A realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt3aAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89mt3a();
        eqp.setNomeSeccionadora89mt3a();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt3a());
            pstmt.setString(2, eqp.nomeSeccionadora89mt3a());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT3A realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt3bFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89mt3b();
        eqp.setNomeSeccionadora89mt3b();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt3b());
            pstmt.setString(2, eqp.nomeSeccionadora89mt3b());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT3B realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt3bAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89mt3b();
        eqp.setNomeSeccionadora89mt3b();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt3b());
            pstmt.setString(2, eqp.nomeSeccionadora89mt3b());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT3B realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52mt3Fechado(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharDisjuntor52mt3();
        eqp.setNomeDisjuntor52mt3();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52mt3());
            pstmt.setString(2, eqp.nomeDisjuntor52mt3());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52MT3 realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52mt3Aberto(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirDisjuntor52mt3();
        eqp.setNomeDisjuntor52mt3();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52mt3());
            pstmt.setString(2, eqp.nomeDisjuntor52mt3());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52MT3 realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt4aFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89mt4a();
        eqp.setNomeSeccionadora89mt4a();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt4a());
            pstmt.setString(2, eqp.nomeSeccionadora89mt4a());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT4A realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt4aAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89mt4a();
        eqp.setNomeSeccionadora89mt4a();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt4a());
            pstmt.setString(2, eqp.nomeSeccionadora89mt4a());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT4A realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt4bFechada(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharSeccionadora89mt4b();
        eqp.setNomeSeccionadora89mt4b();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt4b());
            pstmt.setString(2, eqp.nomeSeccionadora89mt4b());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT4B realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao89mt4bAberta(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirSeccionadora89mt4b();
        eqp.setNomeSeccionadora89mt4b();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.seccionadora89mt4b());
            pstmt.setString(2, eqp.nomeSeccionadora89mt4b());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 89MT4B realizada com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52mt4Fechado(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.fecharDisjuntor52mt4();
        eqp.setNomeDisjuntor52mt4();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52mt4());
            pstmt.setString(2, eqp.nomeDisjuntor52mt4());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52MT4 realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void operaçao52mt4Aberto(String data) {
        ConectarBD(); // Garante conexão ativa com o banco
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            return;
        }

        eqp.abrirDisjuntor52mt4();
        eqp.setNomeDisjuntor52mt4();
        eqp.setData(data);
        o.setCodigoOperaçao(); // Certifique-se de que este método gera um código, mesmo não sendo usado aqui

        String sql = "INSERT INTO operacoes (tipo_operacao, tag_equipamento, data_operacao) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, eqp.disjuntor52mt4());
            pstmt.setString(2, eqp.nomeDisjuntor52mt4());
            pstmt.setString(3, eqp.getData());

            pstmt.executeUpdate();

            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Operação 52MT4 realizada com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhuma operação foi registrada.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir operação: " + ex.getMessage());
        } finally {
            try {
                if (stmt != null && !stmt.isClosed())
                    stmt.close();
                if (con != null && !con.isClosed())
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}