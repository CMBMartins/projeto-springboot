import javax.swing.*;
import java.sql.*;

public class BDUsuario {
    Usuario objLogin = new Usuario();
    private Connection con;
    private Statement stmt;
    private String query;
    private ResultSet rs;

    // Construtor
    public BDUsuario() {
        // Construtor padrão
    }

    public void ConectarBD() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/meubanco", "postgres", "Felipe15anos");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver JDBC do PostgreSQL!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados.");
        }
    }

    public void cadastraLogin(String login, String nome, String senha, String perfil) {
        ConectarBD();
        if (con == null)
            return;

        String sql = "INSERT INTO login (login, nome, senha, perfil) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, login);
            pstmt.setString(2, nome);
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
            // fecharConexao();
        }
    }

    public void alteraLogin(String login, String senha) {
        objLogin.setLogin(login);
        objLogin.setSenha(senha);

        try {
            query = "SELECT * FROM login WHERE login = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, objLogin.getLogin());
            rs = pstmt.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Esse login ainda não está cadastrado!\nPressione inserir.");
                return;
            }

            String banco = "Tem certeza que deseja atualizar o cadastro do login: " + rs.getString("login");
            int n = JOptionPane.showConfirmDialog(null, banco, "Alterar Cadastro", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                query = "UPDATE login SET senha = ? WHERE login = ?";
                pstmt = con.prepareStatement(query);
                pstmt.setString(1, objLogin.getSenha());
                pstmt.setString(2, objLogin.getLogin());
                pstmt.executeUpdate();
                pstmt.close();
                con.close();
                JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso!");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a atualização!");
        }
    }

    public void excluiLogin(String login) {
        objLogin.setLogin(login);

        try {
            query = "SELECT login FROM login WHERE login = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, objLogin.getLogin());
            rs = pstmt.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Esse login ainda não está cadastrado!\nPressione inserir.");
                return;
            }

            String nome = "Tem certeza que deseja excluir o login: " + rs.getString("login");
            int n = JOptionPane.showConfirmDialog(null, nome, "Excluir", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                query = "DELETE FROM login WHERE login = ?";
                pstmt = con.prepareStatement(query);
                pstmt.setString(1, objLogin.getLogin());
                int resultado = pstmt.executeUpdate();
                pstmt.close();
                con.close();
                if (resultado == 1) {
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a exclusão!");
        }
    }

    public boolean ConsultaLogin(String login, String nome, String senha, String perfil) {
        objLogin.setLogin(login);
        objLogin.setLogin(nome);
        objLogin.setSenha(senha);
        objLogin.setLogin(perfil);
        boolean OK = true;

        try {
            query = "SELECT login, nome, senha, perfil FROM login WHERE login = ? AND senha = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, objLogin.getLogin());
            pstmt.setString(1, objLogin.getNome());
            pstmt.setString(2, objLogin.getSenha());
            pstmt.setString(1, objLogin.getPerfil());
            rs = pstmt.executeQuery();

            if (!rs.next()) {
                OK = false;
            } else {
                do {
                    objLogin.setLogin(rs.getString("login"));
                    objLogin.setLogin(rs.getString("nome"));
                    objLogin.setSenha(rs.getString("senha"));
                    objLogin.setLogin(rs.getString("perfil"));
                } while (rs.next());
            }

            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com a fonte de dados");
        }

        return OK;
    }

    public boolean ConsultaLogin(String login) {
        objLogin.setLogin(login);
        boolean OK = true;

        try {
            query = "SELECT * FROM login WHERE login ILIKE ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, "%" + objLogin.getLogin() + "%");
            rs = pstmt.executeQuery();

            if (!rs.next()) {
                String msg = "O login " + objLogin.getLogin() + " não existe!";
                JOptionPane.showMessageDialog(null, msg);
                OK = false;
            } else {
                do {
                    objLogin.setLogin(rs.getString("login"));
                    objLogin.setSenha(rs.getString("senha"));
                    JOptionPane.showMessageDialog(null, "Localização realizada com sucesso!");
                } while (rs.next());
            }

            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com a fonte de dados");
        }

        return OK;
    }
}
