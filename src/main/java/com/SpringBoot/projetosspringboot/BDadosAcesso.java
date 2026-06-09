
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
 * MODULO -   BDACESSO                                 *
 ******************************************************/
import javax.swing.*;
import java.sql.*;

public class BDadosAcesso {
    private Connection con;
    private ResultSet rs; // Recebe um conjunto de resultado da tabela

    Equipamentos eqp = new Equipamentos();
    Acesso objEventos = new Acesso();
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

    public void cadastraEventos(String tagequipamento, String usuario, String data, String operacao, String manobra) {
        ConectarBD(); // Conecta ao banco
        if (con == null)
            return;

        // Verifica se campos obrigatórios estão preenchidos
        if (tagequipamento == null || tagequipamento.trim().isEmpty() ||
                usuario == null || usuario.trim().isEmpty() ||
                data == null || data.trim().isEmpty() ||
                operacao == null || operacao.trim().isEmpty() ||
                manobra == null || manobra.trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Erro: todos os campos são obrigatórios para cadastrar o evento.");
            fecharConexao();
            return;
        }

        // Seta os dados nos objetos
        objEventos.setTagEquipamento(tagequipamento);
        objEventos.setUsuario(usuario);
        objEventos.setData(data);
        objEventos.setOperacao(operacao);
        objEventos.setManobra(manobra);
        // eqp.setCodigo(); // Gera novo código

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            // pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, objEventos.getTagEquipamento());
            pstmt.setString(3, objEventos.getUsuario());
            pstmt.setString(4, objEventos.getData());
            pstmt.setString(5, objEventos.getOperacao());
            pstmt.setString(6, objEventos.getManobra());

            pstmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento:\n" + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public void cadastraEventos1(String tagequipamento, String usuario, String data, String operacao, String manobra) {
        ConectarBD(); // conecta no banco
        if (con == null)
            return;

        objEventos.setTagEquipamento(tagequipamento);
        objEventos.setUsuario(usuario);
        objEventos.setData(data);
        objEventos.setOperacao(operacao);
        objEventos.setManobra(manobra);
        eqp.setCodigo(); // gera novo código

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo()); // <- Aqui corrigido
            pstmt.setString(2, objEventos.getTagEquipamento());
            pstmt.setString(3, objEventos.getUsuario());
            pstmt.setString(4, objEventos.getData()); // Se "Data" for DATE, pode ser necessário java.sql.Date
            pstmt.setString(5, objEventos.getOperacao());
            pstmt.setString(6, objEventos.getManobra());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Evento cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento: " + ex.getMessage());
        } finally {
            fecharConexao(); // sempre fecha
        }
    }

    public void cadastraEventos2(String tagequipamento, String usuario, String data, String operacao, String manobra) {
        ConectarBD(); // conecta no banco
        if (con == null)
            return;

        objEventos.setTagEquipamento(tagequipamento);
        objEventos.setUsuario(usuario);
        objEventos.setData(data);
        objEventos.setOperacao(operacao);
        objEventos.setManobra(manobra);
        eqp.setCodigo(); // gera novo código

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo()); // <- Aqui corrigido
            pstmt.setString(2, objEventos.getTagEquipamento());
            pstmt.setString(3, objEventos.getUsuario());
            pstmt.setString(4, objEventos.getData()); // Se "Data" for DATE, pode ser necessário java.sql.Date
            pstmt.setString(5, objEventos.getOperacao());
            pstmt.setString(6, objEventos.getManobra());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Evento cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento: " + ex.getMessage());
        } finally {
            fecharConexao(); // sempre fecha
        }
    }

    public void cadastraEventos3(String tagequipamento, String usuario, String data, String operacao, String manobra) {
        ConectarBD(); // conecta no banco
        if (con == null)
            return;

        objEventos.setTagEquipamento(tagequipamento);
        objEventos.setUsuario(usuario);
        objEventos.setData(data);
        objEventos.setOperacao(operacao);
        objEventos.setManobra(manobra);
        eqp.setCodigo(); // gera novo código

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo()); // <- Aqui corrigido
            pstmt.setString(2, objEventos.getTagEquipamento());
            pstmt.setString(3, objEventos.getUsuario());
            pstmt.setString(4, objEventos.getData()); // Se "Data" for DATE, pode ser necessário java.sql.Date
            pstmt.setString(5, objEventos.getOperacao());
            pstmt.setString(6, objEventos.getManobra());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Evento cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento: " + ex.getMessage());
        } finally {
            fecharConexao(); // sempre fecha
        }
    }

    public void cadastraEventos4(String tagequipamento, String usuario, String data, String operacao, String manobra) {
        ConectarBD(); // conecta no banco
        if (con == null)
            return;

        objEventos.setTagEquipamento(tagequipamento);
        objEventos.setUsuario(usuario);
        objEventos.setData(data);
        objEventos.setOperacao(operacao);
        objEventos.setManobra(manobra);
        eqp.setCodigo(); // gera novo código

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo()); // <- Aqui corrigido
            pstmt.setString(2, objEventos.getTagEquipamento());
            pstmt.setString(3, objEventos.getUsuario());
            pstmt.setString(4, objEventos.getData()); // Se "Data" for DATE, pode ser necessário java.sql.Date
            pstmt.setString(5, objEventos.getOperacao());
            pstmt.setString(6, objEventos.getManobra());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Evento cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento: " + ex.getMessage());
        } finally {
            fecharConexao(); // sempre fecha
        }
    }

    public void cadastraEventos5(String tagequipamento, String usuario, String data, String operacao, String manobra) {
        ConectarBD(); // conecta no banco
        if (con == null)
            return;

        objEventos.setTagEquipamento(tagequipamento);
        objEventos.setUsuario(usuario);
        objEventos.setData(data);
        objEventos.setOperacao(operacao);
        objEventos.setManobra(manobra);
        eqp.setCodigo(); // gera novo código

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo()); // <- Aqui corrigido
            pstmt.setString(2, objEventos.getTagEquipamento());
            pstmt.setString(3, objEventos.getUsuario());
            pstmt.setString(4, objEventos.getData()); // Se "Data" for DATE, pode ser necessário java.sql.Date
            pstmt.setString(5, objEventos.getOperacao());
            pstmt.setString(6, objEventos.getManobra());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Evento cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento: " + ex.getMessage());
        } finally {
            fecharConexao(); // sempre fecha
        }
    }

    public void incluir89mt1afechada(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89mt1a();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89mt1a();
        eqp.setManobraSeccionadora89mt1a();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89mt1a());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89mt1a());
            pstmt.setString(6, eqp.manobraSeccionadora89mt1a());

            pstmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89MT1-A: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89mt1aaberta(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89mt1a();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89mt1a();
        eqp.setManobraSeccionadora89mt1a();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89mt1a());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89mt1a());
            pstmt.setString(6, eqp.manobraSeccionadora89mt1a());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89MT1-A cadastrado com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89MT1-A: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89mtrafechada(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89mtra();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89mtra();
        eqp.setManobraSeccionadora89mtra();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89mtra());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89mtra());
            pstmt.setString(6, eqp.manobraSeccionadora89mtra());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89MTR-A cadastrado com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89MTR-A: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89mtraaberta(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89mtra();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89mtra();
        eqp.setManobraSeccionadora89mtra();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89mtra());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89mtra());
            pstmt.setString(6, eqp.manobraSeccionadora89mtra());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                // JOptionPane.showMessageDialog(null, "Evento 89MTRA cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89MTR-A: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89mt2afechada(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89mt2a();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89mt2a();
        eqp.setManobraSeccionadora89mt2a();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89mt2a());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89mt2a());
            pstmt.setString(6, eqp.manobraSeccionadora89mt2a());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89MT2-A cadastrado com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89MT2-A: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89mt2aaberta(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89mt2a();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89mt2a();
        eqp.setManobraSeccionadora89mt2a();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89mt2a());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89mt2a());
            pstmt.setString(6, eqp.manobraSeccionadora89mt2a());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89MT2-A cadastrado com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89MT2-A: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89mt1bfechada(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89mt1b();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89mt1b();
        eqp.setManobraSeccionadora89mt1b();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89mt1b());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89mt1b());
            pstmt.setString(6, eqp.manobraSeccionadora89mt1b());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89MT1-B cadastrado com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89MT1-B: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89mt1baberta(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89mt1b();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89mt1b();
        eqp.setManobraSeccionadora89mt1b();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89mt1b());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89mt1b());
            pstmt.setString(6, eqp.manobraSeccionadora89mt1b());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89MT1-B cadastrado com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89MT1-B: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89mtrbfechada(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89mtrb();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89mtrb();
        eqp.setManobraSeccionadora89mt1a();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89mtrb());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89mtrb());
            pstmt.setString(6, eqp.manobraSeccionadora89mtrb());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89MTR-B cadastrado com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89MTR-B: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89mtrbaberta(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89mtrb();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89mtrb();
        eqp.setManobraSeccionadora89mtrb();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89mtrb());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89mtrb());
            pstmt.setString(6, eqp.manobraSeccionadora89mtrb());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89MTR-B cadastrado com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89MTR-B: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89mt2bfechada(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89mt2b();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89mt2b();
        eqp.setManobraSeccionadora89mt2b();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89mt2b());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89mt2b());
            pstmt.setString(6, eqp.manobraSeccionadora89mt2b());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89MT2B cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89MT2B: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89mt2baberta(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89mt2b();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89mt2b();
        eqp.setManobraSeccionadora89mt2b();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89mt2b());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89mt2b());
            pstmt.setString(6, eqp.manobraSeccionadora89mt2b());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89MT2B cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89MT2B: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir52mt1fechado(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeDisjuntor52mt1();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharDisjuntor52mt1();
        eqp.setManobraDisjuntor52mt1();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeDisjuntor52mt1());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.disjuntor52mt1());
            pstmt.setString(6, eqp.manobraDisjuntor52mt1());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 52MT1 cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 52MT1: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir52mt1aberto(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeDisjuntor52mt1();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharDisjuntor52mt1();
        eqp.setManobraDisjuntor52mt1();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeDisjuntor52mt1());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.disjuntor52mt1());
            pstmt.setString(6, eqp.manobraDisjuntor52mt1());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 52MT1 cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 52MT1: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir52mtrfechado(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeDisjuntor52mtr();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharDisjuntor52mtr();
        eqp.setManobraDisjuntor52mtr();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeDisjuntor52mtr());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.disjuntor52mtr());
            pstmt.setString(6, eqp.manobraDisjuntor52mtr());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 52MTR cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 52MTR: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir52mtraberto(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeDisjuntor52mtr();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharDisjuntor52mtr();
        eqp.setManobraDisjuntor52mtr();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeDisjuntor52mtr());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.disjuntor52mtr());
            pstmt.setString(6, eqp.manobraDisjuntor52mtr());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 52MTR cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 52MTR: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluirmt1Aumentar(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeTransformadormt1();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.aumentarTapmt1();
        eqp.setManobraTransformadormt1();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeTransformadormt1());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData());
            pstmt.setString(5, String.valueOf(eqp.getValorTapmt1())); // 👈 valor do TAP após aumento
            pstmt.setString(6, eqp.manobraTransformadormt1());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento Trafo MT1 cadastrado com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento Trafo MT1: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluirmt1Abaixar(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeTransformadormt1();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.diminuirTapmt1();
        eqp.setManobraTransformadormt1();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeTransformadormt1());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, String.valueOf(eqp.getValorTapmt1()));
            pstmt.setString(6, eqp.manobraTransformadormt1());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Evento Trafo MT1 cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento Trafo MT1: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluirmtrAumentar(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeTransformadormtr();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.aumentarTapmtr();
        eqp.setManobraTransformadormtr();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeTransformadormtr());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, String.valueOf(eqp.getValorTapmtr()));
            pstmt.setString(6, eqp.manobraTransformadormtr());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Evento Trafo MTR cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento Trafo MTR: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluirmtrAbaixar(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeTransformadormtr();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.diminuirTapmtr();
        eqp.setManobraTransformadormtr();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeTransformadormtr());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, String.valueOf(eqp.getValorTapmtr()));
            pstmt.setString(6, eqp.manobraTransformadormtr());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Evento Trafo MTR cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento Trafo MTR: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }

    }

    public void incluir52mt2fechado(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeTransformadormt2();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.aumentarTapmt2();
        eqp.setManobraTransformadormt2();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeTransformadormt2());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, String.valueOf(eqp.getValorTapmt2()));
            pstmt.setString(6, eqp.manobraTransformadormt2());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento Trafo MT2 cadastrado com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento Trafo MT2: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir52mt2aberto(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeTransformadormt2();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.diminuirTapmt2();
        eqp.setManobraTransformadormt2();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeTransformadormt2());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, String.valueOf(eqp.getValorTapmt2()));
            pstmt.setString(6, eqp.manobraTransformadormt2());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento Trafo MT2 cadastrado com
            // sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento Trafo MT2: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluirmt2Aumentar(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeTransformadormt2();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.aumentarTapmt2();
        eqp.setManobraTransformadormt2();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeTransformadormt2());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, String.valueOf(eqp.getValorTapmt2()));
            pstmt.setString(6, eqp.manobraTransformadormt2());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Evento Trafo MT2 cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento Trafo MT2: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluirmt2Abaixar(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeTransformadormt2();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.diminuirTapmt2();
        eqp.setManobraTransformadormt2();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeTransformadormt2());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, String.valueOf(eqp.getValorTapmt2()));
            pstmt.setString(6, eqp.manobraTransformadormt2());

            int resultado = pstmt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Evento Trafo MT2 cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento Trafo MT2: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89l1afechada(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89l1a();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89l1a();
        eqp.setManobraSeccionadora89l1a();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89l1a());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89l1a());
            pstmt.setString(6, eqp.manobraSeccionadora89l1a());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89L1A cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89L1A: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89l1aaberta(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89l1a();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.abrirSeccionadora89l1a();
        eqp.setManobraSeccionadora89l1a();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89l1a());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89l1a());
            pstmt.setString(6, eqp.manobraSeccionadora89l1a());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89L1A cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89L1A: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89l1bfechada(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89l1b();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89l1b();
        eqp.setManobraSeccionadora89l1b();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89l1b());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89l1b());
            pstmt.setString(6, eqp.manobraSeccionadora89l1b());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89L1B cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89L1B: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89l1baberta(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89l1b();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89l1b();
        eqp.setManobraSeccionadora89l1b();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89l1b());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89l1b());
            pstmt.setString(6, eqp.manobraSeccionadora89l1b());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89L1B cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89L1B " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89l1fechada(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89l1();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89l1();
        eqp.setManobraSeccionadora89l1();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89l1());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89l1());
            pstmt.setString(6, eqp.manobraSeccionadora89l1());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89L1 cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89L1: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89l1aberta(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89l1();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.abrirSeccionadora89l1();
        eqp.setManobraSeccionadora89l1();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89l1());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89l1());
            pstmt.setString(6, eqp.manobraSeccionadora89l1());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89L1 cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89L1: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir52l1fechado(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeDisjuntor52l1();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharDisjuntor52l1();
        eqp.setManobraDisjuntor52l1();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeDisjuntor52l1());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.disjuntor52l1());
            pstmt.setString(6, eqp.manobraDisjuntor52l1());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 52L1 cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 52L1" + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir52l1aberto(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeDisjuntor52l1();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.abrirDisjuntor52l1();
        eqp.setManobraDisjuntor52l1();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeDisjuntor52l1());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.disjuntor52l1());
            pstmt.setString(6, eqp.manobraDisjuntor52l1());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 52L1 cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 52L1" + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89l2afechada(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

    }

    public void incluir89l2aaberta(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89l2a();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.abrirSeccionadora89l2a();
        eqp.setManobraSeccionadora89l2a();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89l2a());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89l2a());
            pstmt.setString(6, eqp.manobraSeccionadora89l2a());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89L2A cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            ///}

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89L2A" + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89l2bfechada(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89l2b();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89l2b();
        eqp.setManobraSeccionadora89l2b();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, Tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89l2b());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89l2b());
            pstmt.setString(6, eqp.manobraSeccionadora89l2b());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89L2B cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89L2B: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89l2baberta(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89l2b();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.abrirSeccionadora89l2b();
        eqp.setManobraSeccionadora89l2b();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, Tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89l2b());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89l2b());
            pstmt.setString(6, eqp.manobraSeccionadora89l2b());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89L2B cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89L2B: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89l2fechada(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89l2();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89l2();
        eqp.setManobraSeccionadora89l2();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, Tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89l2());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89l2());
            pstmt.setString(6, eqp.manobraSeccionadora89l2());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89L2 cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89L2: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89l2aberta(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89l2();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.abrirSeccionadora89l2();
        eqp.setManobraSeccionadora89l2();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, Tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89l2());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89l2());
            pstmt.setString(6, eqp.manobraSeccionadora89l2());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89L2 cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89L2: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir52l2fechado(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeDisjuntor52l2();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharDisjuntor52l2();
        eqp.setManobraDisjuntor52l2();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeDisjuntor52l2());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.disjuntor52l2());
            pstmt.setString(6, eqp.manobraDisjuntor52l2());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 52L2 cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 52L2" + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir52l2aberto(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeDisjuntor52l2();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.abrirDisjuntor52l2();
        eqp.setManobraDisjuntor52l2();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeDisjuntor52l2());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.disjuntor52l2());
            pstmt.setString(6, eqp.manobraDisjuntor52l2());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 52L2 cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 52L2" + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89btafechada(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89bta();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89bta();
        eqp.setManobraSeccionadora89bta();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89bta());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89bta());
            pstmt.setString(6, eqp.manobraSeccionadora89bta());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89 BTA cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89 BTA: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89btaaberta(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89bta();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.abrirSeccionadora89bta();
        eqp.setManobraSeccionadora89bta();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89bta());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89bta());
            pstmt.setString(6, eqp.manobraSeccionadora89bta());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89 BTA cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89 BTA: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89btbfechada(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89btb();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharSeccionadora89btb();
        eqp.setManobraSeccionadora89btb();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89btb());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89btb());
            pstmt.setString(6, eqp.manobraSeccionadora89btb());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89 BTB cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89 BTB: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir89btbaberta(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeSeccionadora89btb();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.abrirSeccionadora89btb();
        eqp.setManobraSeccionadora89btb();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeSeccionadora89btb());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.seccionadora89btb());
            pstmt.setString(6, eqp.manobraSeccionadora89btb());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 89 BTB cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 89 BTB: " + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir52btfechado(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeDisjuntor52bt();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.fecharDisjuntor52bt();
        eqp.setManobraDisjuntor52bt();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeDisjuntor52bt());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.disjuntor52bt());
            pstmt.setString(6, eqp.manobraDisjuntor52bt());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 52BT cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 52BT" + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void incluir52btaberto(String usuario, String data) {
        ConectarBD(); // Garante que conecta no banco
        if (con == null)
            return;

        eqp.setNomeDisjuntor52bt();
        eqp.setUsuario(usuario);
        eqp.setData(data);
        eqp.abrirDisjuntor52bt();
        eqp.setManobraDisjuntor52bt();
        eqp.setCodigo();

        String sql = "INSERT INTO eventos (codigo, tagequipamento, usuario, data, operacao, manobra) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, eqp.getCodigo());
            pstmt.setString(2, eqp.nomeDisjuntor52bt());
            pstmt.setString(3, eqp.getUsuario());
            pstmt.setString(4, eqp.getData()); // Se precisar converter para Date, avise!
            pstmt.setString(5, eqp.disjuntor52bt());
            pstmt.setString(6, eqp.manobraDisjuntor52bt());

            pstmt.executeUpdate();
            // if (resultado > 0) {
            // JOptionPane.showMessageDialog(null, "Evento 52BT cadastrado com sucesso!");
            // } else {
            // JOptionPane.showMessageDialog(null, "Nenhum evento foi cadastrado.");
            // }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar evento 52BT" + ex.getMessage());
        } finally {
            fecharConexao(); // Sempre fechar a conexão
        }
    }

    public void atualizaCampos() {
        try {
            rs.getString("Codigo");
            rs.last();
        } catch (SQLException ex) {
        }
    }
}