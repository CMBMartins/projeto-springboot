import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class BDadosUsuario {

    private Connection con;
    public Usuario objLogin = new Usuario();

    public void ConectarBD() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5433/meubanco",
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

    public void cadastraLogin(String usuario, String senha, String perfil) {
        ConectarBD();
        if (con == null)
            return;

        String sql = "INSERT INTO bancousuario (login, nome, senha, perfil) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, usuario);
            pstmt.setString(3, senha);
            pstmt.setString(4, perfil);
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (SQLException ex) {
            if ("23505".equals(ex.getSQLState())) {
                JOptionPane.showMessageDialog(null, "Login já cadastrado!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + ex.getMessage());
            }
        } finally {
            fecharConexao();
        }
    }

    public void alteraLogin(String usuario, String senha, String perfil) {
        ConectarBD();
        if (con == null)
            return;

        String sql = "UPDATE bancousuario SET usuario = ?, senha = ?, perfil = ? WHERE usuario = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(2, senha);
            pstmt.setString(3, perfil);
            pstmt.setString(4, usuario);

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Login não encontrado!");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void excluiLogin(String login) {
        ConectarBD();
        if (con == null)
            return;

        String sql = "DELETE FROM bancousuario WHERE Login = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, login);

            int n = JOptionPane.showConfirmDialog(null,
                    "Tem certeza que deseja excluir o login: " + login + "?",
                    "Confirmação de exclusão",
                    JOptionPane.YES_NO_OPTION);

            if (n == JOptionPane.YES_OPTION) {
                int resultado = pstmt.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login não encontrado.");
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public boolean consultaLogin(String usuario, String senha, String perfil) {
        ConectarBD();

        if (con == null) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco.");
            return false;
        }

        boolean ok = false;
        String sql = "SELECT * FROM bancousuario WHERE usuario = ? AND senha = ? AND perfil = ?";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, usuario);
            pstmt.setString(2, senha);
            pstmt.setString(3, perfil);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    objLogin.setLogin(rs.getString("usuario"));
                    objLogin.setSenha(rs.getString("senha"));
                    objLogin.setPerfil(rs.getString("perfil"));
                    ok = true;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar login: " + ex.getMessage());
        } finally {
            fecharConexao();
        }

        return ok;
    }

    public boolean consultaNome(String nome) {
        ConectarBD();
        if (con == null)
            return false;

        boolean ok = false;
        String sql = "SELECT * FROM bancousuario WHERE Nome ILIKE ?";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, "%" + nome + "%");

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    objLogin.setLogin(rs.getString("Login"));
                    objLogin.setNome(rs.getString("Nome"));
                    objLogin.setSenha(rs.getString("Senha"));
                    objLogin.setPerfil(rs.getString("Perfil"));

                    JOptionPane.showMessageDialog(null, "Login encontrado: " + rs.getString("Login"));
                    ok = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Nome não encontrado.");
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar nome: " + ex.getMessage());
        } finally {
            fecharConexao();
        }

        return ok;
    }
}
