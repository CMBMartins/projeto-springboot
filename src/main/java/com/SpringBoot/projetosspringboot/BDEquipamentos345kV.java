
/*******************************************************
 * PROJETO SIMULADOR PARA TREINAMENTO DE OPERADORES DE *
 * SUBESTAÇAO.                                         *
 * PROJETISTA E DESENVOLVEDOR:                         *
 *          CARLOS MARDONIO BEZERRA MARTINS            * 
 *         BACHAREL EM SISTEMAS DE INFORMAÇAO          *
 *                                                     *
 * DATA - 18/08/2006                                   *
 * ATUALIZAÇAO - 19/08/2008                            *
 *******************************************************
 * MODULO -   BDEQUIPAMENTOS 34,5 Kv                   *
 ******************************************************/
//import javax.swing.*;
import java.sql.*;

class BDEquipamentos345kV {
  private String urlODBC; // Recebe string de conex�o com o banco
  private Connection con; // Recebe string que conecta com o banco
  private Statement stmt; // Recebe string que permitir� a execu��o SQL
  private String query; // Recebe comando SQL a ser executado
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

  public void QuantFechamento89mt1a() {
    eqp.setNomeSeccionadora89mt1a();
    eqp.setQuantFechamento89mt1a();
    eqp.setCodigo();

    try {
      query = "INSERT INTO Equipamentos ( Codigo_equipamento, Tag_equipamento, Quant_fechamento_sec, Quant_abertura_sec, Quant_fechamento_disj, Quant_abertura_disj, Quant_subir_tap, Quant_descer_tap, Trafo_energizado) "
          +
          "Values  ('" + eqp.getCodigo() +
          "', '" + eqp.nomeSeccionadora89mt1a() +
          "', '" + eqp.getQuantFechamento89mt1a() +
          "', '" + eqp.getQuantAbertura89mt1a() +
          "', '" + eqp.getQuantFechamento89mt1a() +
          "', '" + eqp.getQuantAbertura89mt1a() +
          "', '" + eqp.getQuantSubir() +
          "', '" + eqp.getQuantDescer() +
          "', '" + eqp.getQuantDescer() + "'" +
          ")";
      int resultado = stmt.executeUpdate(query); // Executa o comando SQL
      stmt.close(); // Encerra ambiente conex�o
      con.close(); // Encerra a conex�o
      // JOptionPane.showMessageDialog(null,"Grava��o realizada com sucesso!");
    } catch (SQLException ex) {
      // if (ex.getMessage().equals("General error"))
      // JOptionPane.showMessageDialog(null,"Equipamento j� Cadastrado!");
      // else
      // JOptionPane.showMessageDialog(null, " Dados Inv�lidos! ");
    }
  }

  public void QuantAbertura89mt1a() {
    eqp.setNomeSeccionadora89mt1a();
    eqp.setQuantAbertura89mt1a();
    eqp.setCodigo();

    try {
      query = "INSERT INTO Equipamentos ( Codigo_equipamento, Tag_equipamento, Quant_fechamento_sec, Quant_abertura_sec, Quant_fechamento_disj, Quant_abertura_disj, Quant_subir_tap, Quant_descer_tap) "
          +
          "Values  ('" + eqp.getCodigo() +
          "', '" + eqp.nomeSeccionadora89mt1a() +
          "', '" + eqp.getQuantFechamento89mt1a() +
          "', '" + eqp.getQuantAbertura89mt1a() +
          "', '" + eqp.getQuantFechamento89mt1a() +
          "', '" + eqp.getQuantAbertura89mt1a() +
          "', '" + eqp.getQuantSubir() +
          "', '" + eqp.getQuantDescer() + "'" +
          ")";
      int resultado = stmt.executeUpdate(query); // Executa o comando SQL
      stmt.close(); // Encerra ambiente conex�o
      con.close(); // Encerra a conex�o
      // JOptionPane.showMessageDialog(null,"Grava��o realizada com sucesso!");
    } catch (SQLException ex) {
      // if (ex.getMessage().equals("General error"))
      // JOptionPane.showMessageDialog(null,"Equipamento j� Cadastrado!");
      // else
      // JOptionPane.showMessageDialog(null, " Dados Inv�lidos! ");
    }
  }

  public void QuantFechamento89mt1b() {
    eqp.setNomeSeccionadora89mt1b();
    eqp.setQuantFechamento89mt1b();
    eqp.setCodigo();

    try {
      query = "INSERT INTO Equipamentos ( Codigo_equipamento, Tag_equipamento, Quant_fechamento_sec, Quant_abertura_sec, Quant_fechamento_disj, Quant_abertura_disj, Quant_subir_tap, Quant_descer_tap) "
          +
          "Values  ('" + eqp.getCodigo() +
          "', '" + eqp.nomeSeccionadora89mt1b() +
          "', '" + eqp.getQuantFechamento89mt1b() +
          "', '" + eqp.getQuantAbertura89mt1b() +
          "', '" + eqp.getQuantFechamento89mt1b() +
          "', '" + eqp.getQuantAbertura89mt1b() +
          "', '" + eqp.getQuantSubir() +
          "', '" + eqp.getQuantDescer() + "'" +
          ")";
      int resultado = stmt.executeUpdate(query); // Executa o comando SQL
      stmt.close(); // Encerra ambiente conex�o
      con.close(); // Encerra a conex�o
      // JOptionPane.showMessageDialog(null,"Grava��o realizada com sucesso!");
    } catch (SQLException ex) {
      // if (ex.getMessage().equals("General error"))
      // JOptionPane.showMessageDialog(null,"Equipamento j� Cadastrado!");
      // else
      // JOptionPane.showMessageDialog(null, " Dados Inv�lidos! ");
    }
  }

  public void QuantAbertura89mt1b() {
    eqp.setNomeSeccionadora89mt1b();
    eqp.setQuantAbertura89mt1b();
    eqp.setCodigo();

    try {
      query = "INSERT INTO Equipamentos ( Codigo_equipamento, Tag_equipamento, Quant_fechamento_sec, Quant_abertura_sec, Quant_fechamento_disj, Quant_abertura_disj, Quant_subir_tap, Quant_descer_tap) "
          +
          "Values  ('" + eqp.getCodigo() +
          "', '" + eqp.nomeSeccionadora89mt1b() +
          "', '" + eqp.getQuantFechamento89mt1b() +
          "', '" + eqp.getQuantAbertura89mt1b() +
          "', '" + eqp.getQuantFechamento89mt1b() +
          "', '" + eqp.getQuantAbertura89mt1b() +
          "', '" + eqp.getQuantSubir() +
          "', '" + eqp.getQuantDescer() + "'" +
          ")";
      int resultado = stmt.executeUpdate(query); // Executa o comando SQL
      stmt.close(); // Encerra ambiente conex�o
      con.close(); // Encerra a conex�o
      // JOptionPane.showMessageDialog(null,"Grava��o realizada com sucesso!");
    } catch (SQLException ex) {
      // if (ex.getMessage().equals("General error"))
      // JOptionPane.showMessageDialog(null,"Equipamento j� Cadastrado!");
      // else
      // JOptionPane.showMessageDialog(null, " Dados Inv�lidos! ");
    }
  }

  public void QuantFechamento52mt1() {
    eqp.setNomeDisjuntor52mt1();
    eqp.setQuantFechamento52mt1();
    eqp.setCodigo();

    try {
      query = "INSERT INTO Equipamentos ( Codigo_equipamento, Tag_equipamento, Quant_fechamento_sec, Quant_abertura_sec, Quant_fechamento_disj, Quant_abertura_disj, Quant_subir_tap, Quant_descer_tap) "
          +
          "Values  ('" + eqp.getCodigo() +
          "', '" + eqp.nomeDisjuntor52mt1() +
          "', '" + eqp.getQuantFechamento52mt1() +
          "', '" + eqp.getQuantAbertura52mt1() +
          "', '" + eqp.getQuantFechamento52mt1() +
          "', '" + eqp.getQuantAbertura52mt1() +
          "', '" + eqp.getQuantSubir() +
          "', '" + eqp.getQuantDescer() + "'" +
          ")";
      int resultado = stmt.executeUpdate(query); // Executa o comando SQL
      stmt.close(); // Encerra ambiente conex�o
      con.close(); // Encerra a conex�o
      // JOptionPane.showMessageDialog(null,"Grava��o realizada com sucesso!");
    } catch (SQLException ex) {
      // if (ex.getMessage().equals("General error"))
      // JOptionPane.showMessageDialog(null,"Equipamento j� Cadastrado!");
      // else
      // JOptionPane.showMessageDialog(null, " Dados Inv�lidos! ");
    }
  }

  public void QuantAbertura52mt1() {
    eqp.setNomeDisjuntor52mt1();
    eqp.setQuantAbertura52mt1();
    eqp.setCodigo();

    try {
      query = "INSERT INTO Equipamentos ( Codigo_equipamento, Tag_equipamento, Quant_fechamento_sec, Quant_abertura_sec, Quant_fechamento_disj, Quant_abertura_disj, Quant_subir_tap, Quant_descer_tap) "
          +
          "Values  ('" + eqp.getCodigo() +
          "', '" + eqp.nomeDisjuntor52mt1() +
          "', '" + eqp.getQuantFechamento52mt1() +
          "', '" + eqp.getQuantAbertura52mt1() +
          "', '" + eqp.getQuantFechamento52mt1() +
          "', '" + eqp.getQuantAbertura52mt1() +
          "', '" + eqp.getQuantSubir() +
          "', '" + eqp.getQuantDescer() + "'" +
          ")";
      int resultado = stmt.executeUpdate(query); // Executa o comando SQL
      stmt.close(); // Encerra ambiente conex�o
      con.close(); // Encerra a conex�o
      // JOptionPane.showMessageDialog(null,"Grava��o realizada com sucesso!");
    } catch (SQLException ex) {
      // if (ex.getMessage().equals("General error"))
      // JOptionPane.showMessageDialog(null,"Equipamento j� Cadastrado!");
      // else
      // JOptionPane.showMessageDialog(null, " Dados Inv�lidos! ");
    }
  }

  public void QuantAumentoTapmt1() {
    eqp.setNomeTransformadormt1();
    eqp.setQuantSubir();
    eqp.setCodigo();

    try {
      query = "INSERT INTO Equipamentos ( Codigo_equipamento, Tag_equipamento, Quant_fechamento_sec, Quant_abertura_sec, Quant_fechamento_disj, Quant_abertura_disj, Quant_subir_tap, Quant_descer_tap) "
          +
          "Values  ('" + eqp.getCodigo() +
          "', '" + eqp.nomeTransformadormt1() +
          "', '" + eqp.getQuantFechamento52mt1() +
          "', '" + eqp.getQuantAbertura52mt1() +
          "', '" + eqp.getQuantFechamento52mt1() +
          "', '" + eqp.getQuantAbertura52mt1() +
          "', '" + eqp.getQuantSubir() +
          "', '" + eqp.getQuantDescer() + "'" +
          ")";
      int resultado = stmt.executeUpdate(query); // Executa o comando SQL
      stmt.close(); // Encerra ambiente conex�o
      con.close(); // Encerra a conex�o
      // JOptionPane.showMessageDialog(null,"Grava��o realizada com sucesso!");
    } catch (SQLException ex) {
      // if (ex.getMessage().equals("General error"))
      // JOptionPane.showMessageDialog(null,"Equipamento j� Cadastrado!");
      // else
      // JOptionPane.showMessageDialog(null, " Dados Inv�lidos! ");
    }
  }

  public void QuantDiminuirTapmt1() {
    eqp.setNomeTransformadormt1();
    eqp.setQuantDescer();
    eqp.setCodigo();

    try {
      query = "INSERT INTO Equipamentos ( Codigo_equipamento, Tag_equipamento, Quant_fechamento_sec, Quant_abertura_sec, Quant_fechamento_disj, Quant_abertura_disj, Quant_subir_tap, Quant_descer_tap) "
          +
          "Values  ('" + eqp.getCodigo() +
          "', '" + eqp.nomeTransformadormt1() +
          "', '" + eqp.getQuantFechamento52mt1() +
          "', '" + eqp.getQuantAbertura52mt1() +
          "', '" + eqp.getQuantFechamento52mt1() +
          "', '" + eqp.getQuantAbertura52mt1() +
          "', '" + eqp.getQuantSubir() +
          "', '" + eqp.getQuantDescer() + "'" +
          ")";
      int resultado = stmt.executeUpdate(query); // Executa o comando SQL
      stmt.close(); // Encerra ambiente conex�o
      con.close(); // Encerra a conex�o
      // JOptionPane.showMessageDialog(null,"Grava��o realizada com sucesso!");
    } catch (SQLException ex) {
      // if (ex.getMessage().equals("General error"))
      // JOptionPane.showMessageDialog(null,"Equipamento j� Cadastrado!");
      // else
      // JOptionPane.showMessageDialog(null, " Dados Inv�lidos! ");
    }
  }
}