
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
 * MODULO -   EQUIPAMENTOS                             *
 ******************************************************/
//import javax.swing.*;
import java.sql.*;

import javax.swing.JOptionPane;

public class Equipamentos {
    private int CodigoTotal = 0;
    private int Codigo = 0;
    // private JTextField Codigo1;
    private int CodigoMT = 0;
    private int CodigoMT1 = 0;
    private int CodigoMT11 = 0;
    private int CodigoMT2 = 0;
    private int CodigoMT3 = 0;
    private int CodigoMT4 = 0;
    // private int QuantOperaçoes = 0;
    private String seccionadora89mt1a = "Seccionadora Aberta";
    private String seccionadora89mtra = "Seccionadora Aberta";
    private String seccionadora89mt2a = "Seccionadora Aberta";
    private String seccionadora89mt3a = "Seccionadora Aberta";
    private String seccionadora89mt4a = "Seccionadora Aberta";
    private String seccionadora89l1a = "Seccionadora Aberta";
    private String seccionadora89l2a = "Seccionadora Aberta";
    private String seccionadora89bta = "Seccionadora Aberta";
    private String seccionadora89l1 = "Seccionadora Aberta";
    private String seccionadora89l2 = "Seccionadora Aberta";
    private String seccionadora89ala = "Seccionadora Aberta";
    private String seccionadora89bpa = "Seccionadora Aberta";
    private String seccionadora89al = "Seccionadora Aberta";

    private int QuantFechamento = 0;
    private int QuantFechamento89mt1a = 0;
    private int QuantFechamento89mtra = 0;
    private int QuantFechamento89mt2a = 0;
    private int QuantFechamento89mt3a = 0;
    private int QuantFechamento89mt4a = 0;
    private int QuantFechamento89l1a = 0;
    private int QuantFechamento89l2a = 0;
    private int QuantFechamento89bta = 0;
    private int QuantFechamento89l1 = 0;
    private int QuantFechamento89l2 = 0;
    private int QuantAbertura = 0;
    private int QuantAbertura89mt1a = 0;
    private int QuantAbertura89mtra = 0;
    private int QuantAbertura89mt2a = 0;
    private int QuantAbertura89mt3a = 0;
    private int QuantAbertura89mt4a = 0;
    private int QuantAbertura89l1a = 0;
    private int QuantAbertura89l2a = 0;
    private int QuantAbertura89bta = 0;
    private int QuantAbertura89l1 = 0;
    private int QuantAbertura89l2 = 0;

    private String NomeSeccionadora89mt1a = "";
    private String ManobraSeccionadora89mt1a = "";
    // private String DataSeccionadora89mt1a = "";
    private String NomeSeccionadora89mtra = "";
    private String ManobraSeccionadora89mtra = "";
    // private String DataSeccionadora89mtra = "";
    private String NomeSeccionadora89mt2a = "";
    private String NomeSeccionadora89mt3a = "";
    private String NomeSeccionadora89mt4a = "";
    private String ManobraSeccionadora89mt2a = "";
    private String ManobraSeccionadora89mt3a = "";
    private String ManobraSeccionadora89mt4a = "";
    // private String DataSeccionadora89mt2a = "";
    // private String DataSeccionadora89mt3a = "";
    // private String DataSeccionadora89mt4a = "";
    private String NomeSeccionadora89l1a = "";
    private String ManobraSeccionadora89l1a = "";
    // private String DataSeccionadora89l1a = "";
    private String NomeSeccionadora89l1 = "";
    private String ManobraSeccionadora89l1 = "";
    // private String DataSeccionadora89l1 = "";
    private String NomeSeccionadora89l2a = "";
    private String ManobraSeccionadora89l2a = "";
    // private String DataSeccionadora89l2a = "";
    private String NomeSeccionadora89l2 = "";
    private String ManobraSeccionadora89l2 = "";
    // private String DataSeccionadora89l2 = "";
    private String NomeSeccionadora89bta = "";
    private String ManobraSeccionadora89bta = "";
    // private String DataSeccionadora89bta = "";
    private String Usuario = "";
    private String Data = "";

    private String seccionadora89mt1b = "Seccionadora Aberta";
    private String seccionadora89mtrb = "Seccionadora Aberta";
    private String seccionadora89mt2b = "Seccionadora Aberta";
    private String seccionadora89mt3b = "Seccionadora Aberta";
    private String seccionadora89mt4b = "Seccionadora Aberta";
    private String seccionadora89l1b = "Seccionadora Aberta";
    private String seccionadora89l2b = "Seccionadora Aberta";
    private String seccionadora89btb = "Seccionadora Aberta";
    private String seccionadora89alb = "Seccionadora Aberta";
    private String seccionadora89bpb = "Seccionadora Aberta";
    private int QuantFechamento89mt1b = 0;
    private int QuantFechamento89mtrb = 0;
    private int QuantFechamento89mt2b = 0;
    private int QuantFechamento89mt3b = 0;
    private int QuantFechamento89mt4b = 0;
    private int QuantFechamento89l1b = 0;
    private int QuantFechamento89l2b = 0;
    private int QuantFechamento89btb = 0;
    private int QuantAbertura89mt1b = 0;
    private int QuantAbertura89mtrb = 0;
    private int QuantAbertura89mt2b = 0;
    private int QuantAbertura89mt3b = 0;
    private int QuantAbertura89mt4b = 0;
    private int QuantAbertura89l1b = 0;
    private int QuantAbertura89l2b = 0;
    private int QuantAbertura89btb = 0;
    private String NomeSeccionadora89mt1b = "";
    private String ManobraSeccionadora89mt1b = "";
    // private String DataSeccionadora89mt1b = "";
    private String NomeSeccionadora89mtrb = "";
    private String ManobraSeccionadora89mtrb = "";
    // private String DataSeccionadora89mtrb = "";
    private String NomeSeccionadora89mt2b = "";
    private String NomeSeccionadora89mt3b = "";
    private String NomeSeccionadora89mt4b = "";
    private String ManobraSeccionadora89mt2b = "";
    private String ManobraSeccionadora89mt3b = "";
    private String ManobraSeccionadora89mt4b = "";
    // private String DataSeccionadora89mt2b = "";
    // private String DataSeccionadora89mt3b = "";
    // private String DataSeccionadora89mt4b = "";
    private String NomeSeccionadora89l1b = "";
    private String ManobraSeccionadora89l1b = "";
    // private String DataSeccionadora89l1b = "";
    private String NomeSeccionadora89l2b = "";
    private String ManobraSeccionadora89l2b = "";
    // private String DataSeccionadora89l2b = "";
    private String NomeSeccionadora89btb = "";
    private String ManobraSeccionadora89btb = "";
    // private String DataSeccionadora89btb = "";

    private String disjuntor52mt1 = "Disjuntor Aberto";
    private String disjuntor52mtr = "Disjuntor Aberto";
    private String disjuntor52mt2 = "Disjuntor Aberto";
    private String disjuntor52mt3 = "Disjuntor Aberto";
    private String disjuntor52mt4 = "Disjuntor Aberto";
    private String disjuntor52l1 = "Disjuntor Aberto";
    private String disjuntor52l2 = "Disjuntor Aberto";
    private String disjuntor52bt = "Disjuntor Aberto";
    private String disjuntor52al = "Disjuntor Aberto";
    private String NomeDisjuntor52mt1 = "";
    private String ManobraDisjuntor52mt1 = "";
    // private String DataDisjuntor52mt1 = "";
    private String NomeDisjuntor52mtr = "";
    private String ManobraDisjuntor52mtr = "";
    // private String DataDisjuntor52mtr = "";
    private String NomeDisjuntor52mt2 = "";
    private String NomeDisjuntor52mt3 = "";
    private String NomeDisjuntor52mt4 = "";
    private String ManobraDisjuntor52mt2 = "";
    private String ManobraDisjuntor52mt3 = "";
    private String ManobraDisjuntor52mt4 = "";
    // private String DataDisjuntor52mt2 = "";
    // private String DataDisjuntor52mt3 = "";
    // private String DataDisjuntor52mt4 = "";
    private String NomeDisjuntor52l1 = "";
    private String ManobraDisjuntor52l1 = "";
    // private String DataDisjuntor52l1 = "";
    private String NomeDisjuntor52l2 = "";
    private String ManobraDisjuntor52l2 = "";
    // private String DataDisjuntor52l2 = "";
    private String NomeDisjuntor52bt = "";
    private String ManobraDisjuntor52bt = "";
    // private String DataDisjuntor52bt = "";
    private int QuantFechamento52mt1 = 1;
    private int QuantFechamento52mtr = 1;
    private int QuantFechamento52mt2 = 1;
    private int QuantFechamento52mt3 = 1;
    private int QuantFechamento52mt4 = 1;
    private int QuantFechamento52l1 = 0;
    private int QuantFechamento52l2 = 0;
    private int QuantFechamento52bt = 0;
    private int QuantAbertura52mt1 = 0;
    private int QuantAbertura52mtr = 0;
    private int QuantAbertura52mt2 = 0;
    private int QuantAbertura52mt3 = 0;
    private int QuantAbertura52mt4 = 0;
    private int QuantAbertura52l1 = 0;
    private int QuantAbertura52l2 = 0;
    private int QuantAbertura52bt = 0;

    private String transformadormt1 = "";
    private String transformadormtr = "";
    private String transformadormt2 = "";
    private String transformadormt3 = "";
    private String transformadormt4 = "";
    private String NomeTransformadormt1 = "";
    private String ManobraTransformadormt1 = "";
    // private String DataTransformadormt1 = "";
    private String NomeTransformadormtr = "";
    private String ManobraTransformadormtr = "";
    // private String DataTransformadormtr = "";
    private String NomeTransformadormt2 = "";
    private String NomeTransformadormt3 = "";
    private String NomeTransformadormt4 = "";
    private String ManobraTransformadormt2 = "";
    private String ManobraTransformadormt3 = "";
    private String ManobraTransformadormt4 = "";
    // private String DataTransformadormt2 = "";
    // private String DataTransformadormt3 = "";
    // private String DataTransformadormt4 = "";

    private Connection con;
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

    ResultSet rs;
    Statement MeuState;
    Statement st;
    Connection MinhaConexao;

    public Equipamentos() {
    }

    public void setCodigo() {
        ConectarBD(); // Garante que conecta ao PostgreSQL
        if (con == null)
            return;

        try {
            String sql = "SELECT MAX(Codigo) AS max_codigo FROM eventos";
            try (Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(sql)) {

                if (rs.next()) {
                    int codigoAtual = rs.getInt("max_codigo");
                    Codigo = codigoAtual + 1;
                } else {
                    Codigo = 1; // Se a tabela estiver vazia, começa com 1
                }
            }
        } catch (SQLException ex) {
            System.out.println("Problema ao buscar o código: " + ex.getMessage());
        } finally {
            fecharConexao();
        }
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigoMT() {
        CodigoMT = CodigoMT + Codigo + 1;
    }

    public int getCodigoMT() {
        return CodigoMT;
    }

    public void setCodigoTotal() {
        CodigoTotal = Codigo + CodigoMT + 1;
    }

    public int getCodigoTotal() {
        return CodigoTotal;
    }

    public void setCodigoMT1() {
        CodigoMT1 = Codigo + CodigoMT + CodigoTotal;
    }

    public int getCodigoMT1() {
        return CodigoMT1;
    }

    public void setCodigoMT11() {
        CodigoMT11 = CodigoTotal + CodigoMT1;
    }

    public int getCodigoMT11() {
        return CodigoMT11;
    }

    public void setCodigoMT2() {
        CodigoMT2 = CodigoTotal + CodigoMT1 + CodigoMT11;
    }

    public int getCodigoMT2() {
        return CodigoMT2;
    }

    public void setCodigoMT3() {
        CodigoMT3 = CodigoMT1 + CodigoMT2;
    }

    public int getCodigoMT3() {
        return CodigoMT3;
    }

    public void setCodigoMT4() {
        CodigoMT4 = CodigoMT2 + CodigoMT3;
    }

    public int getCodigoMT4() {
        return CodigoMT4;
    }

    public void setQuantFechamento() {
        QuantFechamento = QuantFechamento + 1;
    }

    public int getQuantFechamento() {
        return QuantFechamento;
    }

    public void setQuantAbertura() {
        QuantAbertura = QuantAbertura + 1;
    }

    public int getQuantAbertura() {
        return QuantAbertura;
    }

    // Seccionadoras Barras A
    public void fecharSeccionadora89mt1a() {
        if (seccionadora89mt1a.equals("Seccionadora Aberta"))
            seccionadora89mt1a = "Seccionadora Fechada";
        else if (seccionadora89mt1a.equals("Seccionadora Fechada"))
            seccionadora89mt1a = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89mt1a() {
        if (seccionadora89mt1a.equals("Seccionadora Fechada"))
            seccionadora89mt1a = "Seccionadora Aberta";
        else if (seccionadora89mt1a.equals("Seccionadora Aberta"))
            seccionadora89mt1a = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89mtra() {
        if (seccionadora89mtra.equals("Seccionadora Aberta"))
            seccionadora89mtra = "Seccionadora Fechada";
        else if (seccionadora89mtra.equals("Seccionadora Fechada"))
            seccionadora89mtra = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89mtra() {
        if (seccionadora89mtra.equals("Seccionadora Fechada"))
            seccionadora89mtra = "Seccionadora Aberta";
        else if (seccionadora89mtra.equals("Seccionadora Aberta"))
            seccionadora89mtra = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89mt2a() {
        if (seccionadora89mt2a.equals("Seccionadora Aberta"))
            seccionadora89mt2a = "Seccionadora Fechada";
        else if (seccionadora89mt2a.equals("Seccionadora Fechada"))
            seccionadora89mt2a = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89mt2a() {
        if (seccionadora89mt2a.equals("Seccionadora Fechada"))
            seccionadora89mt2a = "Seccionadora Aberta";
        else if (seccionadora89mt2a.equals("Seccionadora Aberta"))
            seccionadora89mt2a = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89mt3a() {
        if (seccionadora89mt3a.equals("Seccionadora Aberta"))
            seccionadora89mt3a = "Seccionadora Fechada";
        else if (seccionadora89mt3a.equals("Seccionadora Fechada"))
            seccionadora89mt3a = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89mt3a() {
        if (seccionadora89mt3a.equals("Seccionadora Fechada"))
            seccionadora89mt3a = "Seccionadora Aberta";
        else if (seccionadora89mt3a.equals("Seccionadora Aberta"))
            seccionadora89mt3a = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89mt4a() {
        if (seccionadora89mt4a.equals("Seccionadora Aberta"))
            seccionadora89mt4a = "Seccionadora Fechada";
        else if (seccionadora89mt4a.equals("Seccionadora Fechada"))
            seccionadora89mt4a = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89mt4a() {
        if (seccionadora89mt4a.equals("Seccionadora Fechada"))
            seccionadora89mt4a = "Seccionadora Aberta";
        else if (seccionadora89mt4a.equals("Seccionadora Aberta"))
            seccionadora89mt4a = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89l1a() {
        if (seccionadora89l1a.equals("Seccionadora Aberta"))
            seccionadora89l1a = "Seccionadora Fechada";
        else if (seccionadora89l1a.equals("Seccionadora Fechada"))
            seccionadora89l1a = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89l1a() {
        if (seccionadora89l1a.equals("Seccionadora Fechada"))
            seccionadora89l1a = "Seccionadora Aberta";
        else if (seccionadora89l1a.equals("Seccionadora Aberta"))
            seccionadora89l1a = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89ala() {
        if (seccionadora89ala.equals("Seccionadora Aberta"))
            seccionadora89ala = "Seccionadora Fechada";
        else if (seccionadora89ala.equals("Seccionadora Fechada"))
            seccionadora89ala = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89ala() {
        if (seccionadora89ala.equals("Seccionadora Fechada"))
            seccionadora89ala = "Seccionadora Aberta";
        else if (seccionadora89ala.equals("Seccionadora Aberta"))
            seccionadora89ala = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89al() {
        if (seccionadora89al.equals("Seccionadora Aberta"))
            seccionadora89al = "Seccionadora Fechada";
        else if (seccionadora89al.equals("Seccionadora Fechada"))
            seccionadora89al = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89al() {
        if (seccionadora89al.equals("Seccionadora Fechada"))
            seccionadora89al = "Seccionadora Aberta";
        else if (seccionadora89al.equals("Seccionadora Aberta"))
            seccionadora89al = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89bpa() {
        if (seccionadora89bpa.equals("Seccionadora Aberta"))
            seccionadora89bpa = "Seccionadora Fechada";
        else if (seccionadora89bpa.equals("Seccionadora Fechada"))
            seccionadora89bpa = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89bpa() {
        if (seccionadora89bpa.equals("Seccionadora Fechada"))
            seccionadora89bpa = "Seccionadora Aberta";
        else if (seccionadora89bpa.equals("Seccionadora Aberta"))
            seccionadora89bpa = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89l2a() {
        if (seccionadora89l2a.equals("Seccionadora Aberta"))
            seccionadora89l2a = "Seccionadora Fechada";
        else if (seccionadora89l2a.equals("Seccionadora Fechada"))
            seccionadora89l2a = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89l2a() {
        if (seccionadora89l2a.equals("Seccionadora Fechada"))
            seccionadora89l2a = "Seccionadora Aberta";
        else if (seccionadora89l2a.equals("Seccionadora Aberta"))
            seccionadora89l2a = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89l1() {
        if (seccionadora89l1.equals("Seccionadora Aberta"))
            seccionadora89l1 = "Seccionadora Fechada";
        else if (seccionadora89l1.equals("Seccionadora Fechada"))
            seccionadora89l1 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89l1() {
        if (seccionadora89l1.equals("Seccionadora Fechada"))
            seccionadora89l1 = "Seccionadora Aberta";
        else if (seccionadora89l1.equals("Seccionadora Aberta"))
            seccionadora89l1 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89l2() {
        if (seccionadora89l2.equals("Seccionadora Aberta"))
            seccionadora89l2 = "Seccionadora Fechada";
        else if (seccionadora89l2.equals("Seccionadora Fechada"))
            seccionadora89l2 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89l2() {
        if (seccionadora89l2.equals("Seccionadora Fechada"))
            seccionadora89l2 = "Seccionadora Aberta";
        else if (seccionadora89l2.equals("Seccionadora Aberta"))
            seccionadora89l2 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89bta() {
        if (seccionadora89bta.equals("Seccionadora Aberta"))
            seccionadora89bta = "Seccionadora Fechada";
        else if (seccionadora89bta.equals("Seccionadora Fechada"))
            seccionadora89bta = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89bta() {
        if (seccionadora89bta.equals("Seccionadora Fechada"))
            seccionadora89bta = "Seccionadora Aberta";
        else if (seccionadora89bta.equals("Seccionadora Aberta"))
            seccionadora89l1 = "Seccionadora Aberta";
    }

    public void setNomeSeccionadora89mt1a() {
        NomeSeccionadora89mt1a = "Seccionadora 89 MT1-A";
    }

    public void setQuantFechamento89mt1a() {
        QuantFechamento89mt1a = QuantFechamento89mt1a + 1;
    }

    public void setQuantAbertura89mt1a() {
        QuantAbertura89mt1a = QuantAbertura89mt1a + 1;
    }

    public void setManobraSeccionadora89mt1a() {
        ManobraSeccionadora89mt1a = "Bay MT-1";
    }

    public void setNomeSeccionadora89mtra() {
        NomeSeccionadora89mtra = "Seccionadora 89 MTR-A";
    }

    public void setQuantFechamento89mtra() {
        QuantFechamento89mtra = QuantFechamento89mtra + 1;
    }

    public void setQuantAbertura89mtra() {
        QuantAbertura89mtra = QuantAbertura89mtra + 1;
    }

    public void setManobraSeccionadora89mtra() {
        ManobraSeccionadora89mtra = "Bay MT-R";
    }

    public void setNomeSeccionadora89mt2a() {
        NomeSeccionadora89mt2a = "Seccionadora 89 MT2-A";
    }

    public void setQuantFechamento89mt2a() {
        QuantFechamento89mt2a = QuantFechamento89mt2a + 1;
    }

    public void setQuantAbertura89mt2a() {
        QuantAbertura89mt2a = QuantAbertura89mt2a + 1;
    }

    public void setManobraSeccionadora89mt2a() {
        ManobraSeccionadora89mt2a = "Bay MT-2";
    }

    public void setNomeSeccionadora89mt3a() {
        NomeSeccionadora89mt3a = "Seccionadora 89 MT3-A";
    }

    public void setQuantFechamento89mt3a() {
        QuantFechamento89mt3a = QuantFechamento89mt3a + 1;
    }

    public void setQuantAbertura89mt3a() {
        QuantAbertura89mt3a = QuantAbertura89mt3a + 1;
    }

    public void setManobraSeccionadora89mt3a() {
        ManobraSeccionadora89mt3a = "Bay MT-3";
    }

    public void setNomeSeccionadora89mt4a() {
        NomeSeccionadora89mt4a = "Seccionadora 89 MT4-A";
    }

    public void setQuantFechamento89mt4a() {
        QuantFechamento89mt4a = QuantFechamento89mt4a + 1;
    }

    public void setQuantAbertura89mt4a() {
        QuantAbertura89mt4a = QuantAbertura89mt4a + 1;
    }

    public void setManobraSeccionadora89mt4a() {
        ManobraSeccionadora89mt4a = "Bay MT-4";
    }

    public void setNomeSeccionadora89l1a() {
        NomeSeccionadora89l1a = "Seccionadora 89 L1-A";
    }

    public void setQuantFechamento89l1a() {
        QuantFechamento89l1a = QuantFechamento89l1a + 1;
    }

    public void setQuantAbertura89l1a() {
        QuantAbertura89l1a = QuantAbertura89l1a + 1;
    }

    public void setManobraSeccionadora89l1a() {
        ManobraSeccionadora89l1a = "Bay L1";
    }

    public void setNomeSeccionadora89l1() {
        NomeSeccionadora89l1 = "Seccionadora 89 L1";
    }

    public void setQuantFechamento89l1() {
        QuantFechamento89l1 = QuantFechamento89l1 + 1;
    }

    public void setQuantAbertura89l1() {
        QuantAbertura89l1 = QuantAbertura89l1 + 1;
    }

    public void setManobraSeccionadora89l1() {
        ManobraSeccionadora89l1 = "Bay L1";
    }

    public void setNomeSeccionadora89l2a() {
        NomeSeccionadora89l2a = "Seccionadora 89 L2-A";
    }

    public void setQuantFechamento89l2a() {
        QuantFechamento89l2a = QuantFechamento89l2a + 1;
    }

    public void setQuantAbertura89l2a() {
        QuantAbertura89l2a = QuantAbertura89l2a + 1;
    }

    public void setManobraSeccionadora89l2a() {
        ManobraSeccionadora89l2a = "Bay L2";
    }

    public void setNomeSeccionadora89l2() {
        NomeSeccionadora89l2 = "Seccionadora 89 L2";
    }

    public void setQuantFechamento89l2() {
        QuantFechamento89l2 = QuantFechamento89l2 + 1;
    }

    public void setQuantAbertura89l2() {
        QuantAbertura89l2 = QuantAbertura89l2 + 1;
    }

    public void setManobraSeccionadora89l2() {
        ManobraSeccionadora89l2 = "Bay L2";
    }

    public void setNomeSeccionadora89bta() {
        NomeSeccionadora89bta = "Seccionadora 89 BT-A";
    }

    public void setQuantFechamento89bta() {
        QuantFechamento89bta = QuantFechamento89bta + 1;
    }

    public void setQuantAbertura89bta() {
        QuantAbertura89bta = QuantAbertura89bta + 1;
    }

    public void setManobraSeccionadora89bta() {
        ManobraSeccionadora89bta = "Bay BT-A";
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public void setData(String data) {
        Data = data;
    }

    public String seccionadora89mt1a() {
        return seccionadora89mt1a;
    }

    public String seccionadora89mtra() {
        return seccionadora89mtra;
    }

    public String seccionadora89mt2a() {
        return seccionadora89mt2a;
    }

    public String seccionadora89mt3a() {
        return seccionadora89mt3a;
    }

    public String seccionadora89mt4a() {
        return seccionadora89mt4a;
    }

    public String seccionadora89l1a() {
        return seccionadora89l1a;
    }

    public String seccionadora89l2a() {
        return seccionadora89l2a;
    }

    public String seccionadora89ala() {
        return seccionadora89ala;
    }

    public String seccionadora89bpa() {
        return seccionadora89bpa;
    }

    public String seccionadora89bta() {
        return seccionadora89bta;
    }

    public String seccionadora89l1() {
        return seccionadora89l1;
    }

    public String seccionadora89l2() {
        return seccionadora89l2;
    }

    public String seccionadora89al() {
        return seccionadora89al;
    }

    public String nomeSeccionadora89mt1a() {
        return NomeSeccionadora89mt1a;
    }

    public int getQuantFechamento89mt1a() {
        return QuantFechamento89mt1a;
    }

    public int getQuantAbertura89mt1a() {
        return QuantAbertura89mt1a;
    }

    public String manobraSeccionadora89mt1a() {
        return ManobraSeccionadora89mt1a;
    }

    public String nomeSeccionadora89mtra() {
        return NomeSeccionadora89mtra;
    }

    public String manobraSeccionadora89mtra() {
        return ManobraSeccionadora89mtra;
    }

    public int getQuantFechamento89mtra() {
        return QuantFechamento89mtra;
    }

    public int getQuantAbertura89mtra() {
        return QuantAbertura89mtra;
    }

    public String nomeSeccionadora89mt2a() {
        return NomeSeccionadora89mt2a;
    }

    public int getQuantFechamento89mt2a() {
        return QuantFechamento89mt2a;
    }

    public int getQuantAbertura89mt2a() {
        return QuantAbertura89mt2a;
    }

    public String manobraSeccionadora89mt2a() {
        return ManobraSeccionadora89mt2a;
    }

    public String nomeSeccionadora89mt3a() {
        return NomeSeccionadora89mt3a;
    }

    public int getQuantFechamento89mt3a() {
        return QuantFechamento89mt3a;
    }

    public int getQuantAbertura89mt3a() {
        return QuantAbertura89mt3a;
    }

    public String manobraSeccionadora89mt3a() {
        return ManobraSeccionadora89mt3a;
    }

    public String nomeSeccionadora89mt4a() {
        return NomeSeccionadora89mt4a;
    }

    public int getQuantFechamento89mt4a() {
        return QuantFechamento89mt4a;
    }

    public int getQuantAbertura89mt4a() {
        return QuantAbertura89mt4a;
    }

    public String manobraSeccionadora89mt4a() {
        return ManobraSeccionadora89mt4a;
    }

    public int getQuantFechamento89l1a() {
        return QuantFechamento89l1a;
    }

    public int getQuantAbertura89l1a() {
        return QuantAbertura89l1a;
    }

    public String nomeSeccionadora89l1a() {
        return NomeSeccionadora89l1a;
    }

    public String manobraSeccionadora89l1a() {
        return ManobraSeccionadora89l1a;
    }

    public String nomeSeccionadora89l1() {
        return NomeSeccionadora89l1;
    }

    public String manobraSeccionadora89l1() {
        return ManobraSeccionadora89l1;
    }

    public int getQuantFechamento89l1() {
        return QuantFechamento89l1;
    }

    public int getQuantAbertura89l1() {
        return QuantAbertura89l1;
    }

    public String nomeSeccionadora89l2a() {
        return NomeSeccionadora89l2a;
    }

    public int getQuantFechamento89l2a() {
        return QuantFechamento89l2a;
    }

    public int getQuantAbertura89l2a() {
        return QuantAbertura89l2a;
    }

    public String manobraSeccionadora89l2a() {
        return ManobraSeccionadora89l2a;
    }

    public String nomeSeccionadora89l2() {
        return NomeSeccionadora89l2;
    }

    public int getQuantFechamento89l2() {
        return QuantFechamento89l2;
    }

    public int getQuantAbertura89l2() {
        return QuantAbertura89l2;
    }

    public String manobraSeccionadora89l2() {
        return ManobraSeccionadora89l2;
    }

    public String nomeSeccionadora89bta() {
        return NomeSeccionadora89bta;
    }

    public int getQuantFechamento89bta() {
        return QuantFechamento89bta;
    }

    public int getQuantAbertura89bta() {
        return QuantAbertura89bta;
    }

    public String manobraSeccionadora89bta() {
        return ManobraSeccionadora89bta;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getData() {
        return Data;
    }

    // Seccionadoras Barra B
    public void fecharSeccionadora89mt1b() {
        if (seccionadora89mt1b.equals("Seccionadora Aberta"))
            seccionadora89mt1b = "Seccionadora Fechada";
        else if (seccionadora89mt1b.equals("Seccionadora Fechada"))
            seccionadora89mt1b = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89mt1b() {
        if (seccionadora89mt1b.equals("Seccionadora Fechada"))
            seccionadora89mt1b = "Seccionadora Aberta";
        else if (seccionadora89mt1b.equals("Seccionadora Aberta"))
            seccionadora89mt1b = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89mtrb() {
        if (seccionadora89mtrb.equals("Seccionadora Aberta"))
            seccionadora89mtrb = "Seccionadora Fechada";
        else if (seccionadora89mtrb.equals("Seccionadora Fechada"))
            seccionadora89mtrb = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89mtrb() {
        if (seccionadora89mtrb.equals("Seccionadora Fechada"))
            seccionadora89mtrb = "Seccionadora Aberta";
        else if (seccionadora89mtrb.equals("Seccionadora Aberta"))
            seccionadora89mtrb = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89mt2b() {
        if (seccionadora89mt2b.equals("Seccionadora Aberta"))
            seccionadora89mt2b = "Seccionadora Fechada";
        else if (seccionadora89mt2b.equals("Seccionadora Fechada"))
            seccionadora89mt2b = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89mt2b() {
        if (seccionadora89mt2b.equals("Seccionadora Fechada"))
            seccionadora89mt2b = "Seccionadora Aberta";
        else if (seccionadora89mt2b.equals("Seccionadora Aberta"))
            seccionadora89mt2b = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89mt3b() {
        if (seccionadora89mt3b.equals("Seccionadora Aberta"))
            seccionadora89mt3b = "Seccionadora Fechada";
        else if (seccionadora89mt3b.equals("Seccionadora Fechada"))
            seccionadora89mt3b = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89mt3b() {
        if (seccionadora89mt3b.equals("Seccionadora Fechada"))
            seccionadora89mt3b = "Seccionadora Aberta";
        else if (seccionadora89mt3b.equals("Seccionadora Aberta"))
            seccionadora89mt3b = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89mt4b() {
        if (seccionadora89mt4b.equals("Seccionadora Aberta"))
            seccionadora89mt4b = "Seccionadora Fechada";
        else if (seccionadora89mt4b.equals("Seccionadora Fechada"))
            seccionadora89mt4b = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89mt4b() {
        if (seccionadora89mt4b.equals("Seccionadora Fechada"))
            seccionadora89mt4b = "Seccionadora Aberta";
        else if (seccionadora89mt4b.equals("Seccionadora Aberta"))
            seccionadora89mt4b = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89l1b() {
        if (seccionadora89l1b.equals("Seccionadora Aberta"))
            seccionadora89l1b = "Seccionadora Fechada";
        else if (seccionadora89l1b.equals("Seccionadora Fechada"))
            seccionadora89l1b = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89l1b() {
        if (seccionadora89l1b.equals("Seccionadora Fechada"))
            seccionadora89l1b = "Seccionadora Aberta";
        else if (seccionadora89l1b.equals("Seccionadora Aberta"))
            seccionadora89l1b = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89l2b() {
        if (seccionadora89l2b.equals("Seccionadora Aberta"))
            seccionadora89l2b = "Seccionadora Fechada";
        else if (seccionadora89l2b.equals("Seccionadora Fechada"))
            seccionadora89l2b = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89l2b() {
        if (seccionadora89l2b.equals("Seccionadora Fechada"))
            seccionadora89l2b = "Seccionadora Aberta";
        else if (seccionadora89l2b.equals("Seccionadora Aberta"))
            seccionadora89l2b = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89alb() {
        if (seccionadora89alb.equals("Seccionadora Aberta"))
            seccionadora89alb = "Seccionadora Fechada";
        else if (seccionadora89alb.equals("Seccionadora Fechada"))
            seccionadora89alb = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89alb() {
        if (seccionadora89alb.equals("Seccionadora Fechada"))
            seccionadora89alb = "Seccionadora Aberta";
        else if (seccionadora89alb.equals("Seccionadora Aberta"))
            seccionadora89alb = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89bpb() {
        if (seccionadora89bpb.equals("Seccionadora Aberta"))
            seccionadora89bpb = "Seccionadora Fechada";
        else if (seccionadora89bpb.equals("Seccionadora Fechada"))
            seccionadora89bpb = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89bpb() {
        if (seccionadora89bpb.equals("Seccionadora Fechada"))
            seccionadora89bpb = "Seccionadora Aberta";
        else if (seccionadora89bpb.equals("Seccionadora Aberta"))
            seccionadora89bpb = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89btb() {
        if (seccionadora89btb.equals("Seccionadora Aberta"))
            seccionadora89btb = "Seccionadora Fechada";
        else if (seccionadora89btb.equals("Seccionadora Fechada"))
            seccionadora89btb = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89btb() {
        if (seccionadora89btb.equals("Seccionadora Fechada"))
            seccionadora89btb = "Seccionadora Aberta";
        else if (seccionadora89btb.equals("Seccionadora Aberta"))
            seccionadora89btb = "Seccionadora Aberta";
    }

    public void setQuantFechamento89mt1b() {
        QuantFechamento89mt1b = QuantFechamento89mt1b + 1;
    }

    public void setQuantAbertura89mt1b() {
        QuantAbertura89mt1b = QuantAbertura89mt1b + 1;
    }

    public void setNomeSeccionadora89mt1b() {
        NomeSeccionadora89mt1b = "Seccionadora 89 MT1-B";
    }

    public void setManobraSeccionadora89mt1b() {
        ManobraSeccionadora89mt1b = "Bay MT-1";
    }

    public void setQuantFechamento89mtrb() {
        QuantFechamento89mtrb = QuantFechamento89mtrb + 1;
    }

    public void setQuantAbertura89mtrb() {
        QuantAbertura89mtrb = QuantAbertura89mtrb + 1;
    }

    public void setNomeSeccionadora89mtrb() {
        NomeSeccionadora89mtrb = "Seccionadora 89 MTR-B";
    }

    public void setManobraSeccionadora89mtrb() {
        ManobraSeccionadora89mtrb = "Bay MT-R";
    }

    public void setNomeSeccionadora89mt2b() {
        NomeSeccionadora89mt2b = "Seccionadora 89 MT2-B";
    }

    public void setQuantFechamento89mt2b() {
        QuantFechamento89mt2b = QuantFechamento89mt2b + 1;
    }

    public void setQuantAbertura89mt2b() {
        QuantAbertura89mt2b = QuantAbertura89mt2b + 1;
    }

    public int getQuantFechamento89mt2b() {
        return QuantFechamento89mt2b;
    }

    public int getQuantAbertura89mt2b() {
        return QuantAbertura89mt2b;
    }

    public void setManobraSeccionadora89mt2b() {
        ManobraSeccionadora89mt2b = "Bay MT-2";
    }

    public void setNomeSeccionadora89mt3b() {
        NomeSeccionadora89mt3b = "Seccionadora 89 MT3-B";
    }

    public void setQuantFechamento89mt3b() {
        QuantFechamento89mt3b = QuantFechamento89mt3b + 1;
    }

    public void setQuantAbertura89mt3b() {
        QuantAbertura89mt3b = QuantAbertura89mt3b + 1;
    }

    public void setManobraSeccionadora89mt3b() {
        ManobraSeccionadora89mt3b = "Bay MT-3";
    }

    public void setNomeSeccionadora89mt4b() {
        NomeSeccionadora89mt4b = "Seccionadora 89 MT4-B";
    }

    public void setQuantFechamento89mt4b() {
        QuantFechamento89mt4b = QuantFechamento89mt4b + 1;
    }

    public void setQuantAbertura89mt4b() {
        QuantAbertura89mt4b = QuantAbertura89mt4b + 1;
    }

    public void setManobraSeccionadora89mt4b() {
        ManobraSeccionadora89mt4b = "Bay MT-4";
    }

    public void setNomeSeccionadora89l1b() {
        NomeSeccionadora89l1b = "Seccionadora 89 L1-B";
    }

    public void setQuantFechamento89l1b() {
        QuantFechamento89l1b = QuantFechamento89l1b + 1;
    }

    public void setQuantAbertura89l1b() {
        QuantAbertura89l1b = QuantAbertura89l1b + 1;
    }

    public void setManobraSeccionadora89l1b() {
        ManobraSeccionadora89l1b = "Bay L1";
    }

    public void setNomeSeccionadora89l2b() {
        NomeSeccionadora89l2b = "Seccionadora 89 L2-B";
    }

    public void setQuantFechamento89l2b() {
        QuantFechamento89l2b = QuantFechamento89l2b + 1;
    }

    public void setQuantAbertura89l2b() {
        QuantAbertura89l2b = QuantAbertura89l2b + 1;
    }

    public void setManobraSeccionadora89l2b() {
        ManobraSeccionadora89l2b = "Bay L2";
    }

    public void setNomeSeccionadora89btb() {
        NomeSeccionadora89btb = "Seccionadora 89 BT-B";
    }

    public void setQuantFechamento89btb() {
        QuantFechamento89btb = QuantFechamento89btb + 1;
    }

    public void setQuantAbertura89btb() {
        QuantAbertura89btb = QuantAbertura89btb + 1;
    }

    public void setManobraSeccionadora89btb() {
        ManobraSeccionadora89btb = "Bay BT";
    }

    public int getQuantFechamento89mt1b() {
        return QuantFechamento89mt1b;
    }

    public int getQuantAbertura89mt1b() {
        return QuantAbertura89mt1b;
    }

    public String seccionadora89mt1b() {
        return seccionadora89mt1b;
    }

    public int getQuantFechamento89mtrb() {
        return QuantFechamento89mtrb;
    }

    public int getQuantAbertura89mtrb() {
        return QuantAbertura89mtrb;
    }

    public String seccionadora89mtrb() {
        return seccionadora89mtrb;
    }

    public String seccionadora89mt2b() {
        return seccionadora89mt2b;
    }

    public String seccionadora89mt3b() {
        return seccionadora89mt3b;
    }

    public String seccionadora89mt4b() {
        return seccionadora89mt4b;
    }

    public String seccionadora89l1b() {
        return seccionadora89l1b;
    }

    public String seccionadora89l2b() {
        return seccionadora89l2b;
    }

    public String seccionadora89alb() {
        return seccionadora89alb;
    }

    public String seccionadora89bpb() {
        return seccionadora89bpb;
    }

    public String seccionadora89btb() {
        return seccionadora89btb;
    }

    public String nomeSeccionadora89mt1b() {
        return NomeSeccionadora89mt1b;
    }

    public String manobraSeccionadora89mt1b() {
        return ManobraSeccionadora89mt1b;
    }

    public String nomeSeccionadora89mtrb() {
        return NomeSeccionadora89mtrb;
    }

    public String manobraSeccionadora89mtrb() {
        return ManobraSeccionadora89mtrb;
    }

    public String nomeSeccionadora89mt2b() {
        return NomeSeccionadora89mt2b;
    }

    public String manobraSeccionadora89mt2b() {
        return ManobraSeccionadora89mt2b;
    }

    public String nomeSeccionadora89mt3b() {
        return NomeSeccionadora89mt3b;
    }

    public int getQuantFechamento89mt3b() {
        return QuantFechamento89mt3b;
    }

    public int getQuantAbertura89mt3b() {
        return QuantAbertura89mt3b;
    }

    public String manobraSeccionadora89mt3b() {
        return ManobraSeccionadora89mt3b;
    }

    public String nomeSeccionadora89mt4b() {
        return NomeSeccionadora89mt4b;
    }

    public int getQuantFechamento89mt4b() {
        return QuantFechamento89mt4b;
    }

    public int getQuantAbertura89mt4b() {
        return QuantAbertura89mt4b;
    }

    public String manobraSeccionadora89mt4b() {
        return ManobraSeccionadora89mt4b;
    }

    public int getQuantFechamento89l1b() {
        return QuantFechamento89l1b;
    }

    public int getQuantAbertura89l1b() {
        return QuantAbertura89l1b;
    }

    public String nomeSeccionadora89l1b() {
        return NomeSeccionadora89l1b;
    }

    public String manobraSeccionadora89l1b() {
        return ManobraSeccionadora89l1b;
    }

    public String nomeSeccionadora89l2b() {
        return NomeSeccionadora89l2b;
    }

    public int getQuantFechamento89l2b() {
        return QuantFechamento89l2b;
    }

    public int getQuantAbertura89l2b() {
        return QuantAbertura89l2b;
    }

    public String manobraSeccionadora89l2b() {
        return ManobraSeccionadora89l2b;
    }

    public String nomeSeccionadora89btb() {
        return NomeSeccionadora89btb;
    }

    public int getQuantFechamento89btb() {
        return QuantFechamento89btb;
    }

    public int getQuantAbertura89btb() {
        return QuantAbertura89btb;
    }

    public String manobraSeccionadora89btb() {
        return ManobraSeccionadora89btb;
    }

    // ������������������������������������ DISJUNTORES
    // ���������������������������������������
    public void setCodigoDisjuntor() {
        Codigo = Codigo + 1;
    }

    public void setQuantFechamento52mt1() {
        QuantFechamento52mt1 = QuantFechamento52mt1 + 1;
    }

    public void setQuantAbertura52mt1() {
        QuantAbertura52mt1 = QuantAbertura52mt1 + 1;
    }

    public void setNomeDisjuntor52mt1() {
        NomeDisjuntor52mt1 = "Disjuntor 52 MT-1";
    }

    public void setManobraDisjuntor52mt1() {
        ManobraDisjuntor52mt1 = "Bay MT-1";
    }

    public void fecharDisjuntor52mt1() {
        if (disjuntor52mt1.equals("Disjuntor Aberto"))
            disjuntor52mt1 = "Disjuntor Fechado";
        else if (disjuntor52mt1.equals("Disjuntor Fechado"))
            disjuntor52mt1 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52mt1() {
        if (disjuntor52mt1.equals("Disjuntor Fechado"))
            disjuntor52mt1 = "Disjuntor Aberto";
        else if (disjuntor52mt1.equals("Disjuntor Aberto"))
            disjuntor52mt1 = "Disjuntor Aberto";
    }

    public void setQuantFechamento52mtr() {
        QuantFechamento52mtr = QuantFechamento52mtr + 1;
    }

    public void setQuantAbertura52mtr() {
        QuantAbertura52mtr = QuantAbertura52mtr + 1;
    }

    public void setNomeDisjuntor52mtr() {
        NomeDisjuntor52mtr = "Disjuntor 52 MT-R";
    }

    public void setManobraDisjuntor52mtr() {
        ManobraDisjuntor52mtr = "Bay MT-R";
    }

    public void fecharDisjuntor52mtr() {
        if (disjuntor52mtr.equals("Disjuntor Aberto"))
            disjuntor52mtr = "Disjuntor Fechado";
        else if (disjuntor52mtr.equals("Disjuntor Fechado"))
            disjuntor52mtr = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52mtr() {
        if (disjuntor52mtr.equals("Disjuntor Fechado"))
            disjuntor52mtr = "Disjuntor Aberto";
        else if (disjuntor52mtr.equals("Disjuntor Aberto"))
            disjuntor52mtr = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52mt2() {
        NomeDisjuntor52mt2 = "Disjuntor 52 MT-2";
    }

    public void setQuantFechamento52mt2() {
        QuantFechamento52mt2 = QuantFechamento52mt2 + 1;
    }

    public void setQuantAbertura52mt2() {
        QuantAbertura52mt2 = QuantAbertura52mt2 + 1;
    }

    public void setManobraDisjuntor52mt2() {
        ManobraDisjuntor52mt2 = "Bay MT-2";
    }

    public void fecharDisjuntor52mt2() {
        if (disjuntor52mt2.equals("Disjuntor Aberto"))
            disjuntor52mt2 = "Disjuntor Fechado";
        else if (disjuntor52mt2.equals("Disjuntor Fechado"))
            disjuntor52mt2 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52mt2() {
        if (disjuntor52mt2.equals("Disjuntor Fechado"))
            disjuntor52mt2 = "Disjuntor Aberto";
        else if (disjuntor52mt2.equals("Disjuntoraberto"))
            disjuntor52mt2 = "Disjuntoraberto";
    }

    public void setNomeDisjuntor52mt3() {
        NomeDisjuntor52mt3 = "Disjuntor 52 MT-3";
    }

    public void setQuantFechamento52mt3() {
        QuantFechamento52mt3 = QuantFechamento52mt3 + 1;
    }

    public void setQuantAbertura52mt3() {
        QuantAbertura52mt3 = QuantAbertura52mt3 + 1;
    }

    public void setManobraDisjuntor52mt3() {
        ManobraDisjuntor52mt3 = "Bay MT-3";
    }

    public void fecharDisjuntor52mt3() {
        if (disjuntor52mt3.equals("Disjuntor Aberto"))
            disjuntor52mt3 = "Disjuntor Fechado";
        else if (disjuntor52mt3.equals("Disjuntor Fechado"))
            disjuntor52mt3 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52mt3() {
        if (disjuntor52mt3.equals("Disjuntor Fechado"))
            disjuntor52mt3 = "Disjuntor Aberto";
        else if (disjuntor52mt3.equals("Disjuntoraberto"))
            disjuntor52mt3 = "Disjuntoraberto";
    }

    public void setNomeDisjuntor52mt4() {
        NomeDisjuntor52mt4 = "Disjuntor 52 MT-4";
    }

    public void setQuantFechamento52mt4() {
        QuantFechamento52mt4 = QuantFechamento52mt4 + 1;
    }

    public void setQuantAbertura52mt4() {
        QuantAbertura52mt4 = QuantAbertura52mt4 + 1;
    }

    public void setManobraDisjuntor52mt4() {
        ManobraDisjuntor52mt4 = "Bay MT-4";
    }

    public void fecharDisjuntor52mt4() {
        if (disjuntor52mt4.equals("Disjuntor Aberto"))
            disjuntor52mt4 = "Disjuntor Fechado";
        else if (disjuntor52mt4.equals("Disjuntor Fechado"))
            disjuntor52mt4 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52mt4() {
        if (disjuntor52mt4.equals("Disjuntor Fechado"))
            disjuntor52mt4 = "Disjuntor Aberto";
        else if (disjuntor52mt4.equals("Disjuntoraberto"))
            disjuntor52mt4 = "Disjuntoraberto";
    }

    public void setNomeDisjuntor52l1() {
        NomeDisjuntor52l1 = "Disjuntor 52 L1";
    }

    public void setQuantFechamento52l1() {
        QuantFechamento52l1 = QuantFechamento52l1 + 1;
    }

    public void setQuantAbertura52l1() {
        QuantAbertura52l1 = QuantAbertura52l1 + 1;
    }

    public void setManobraDisjuntor52l1() {
        ManobraDisjuntor52l1 = "Bay L1";
    }

    public void fecharDisjuntor52l1() {
        if (disjuntor52l1.equals("Disjuntor Aberto"))
            disjuntor52l1 = "Disjuntor Fechado";
        else if (disjuntor52l1.equals("Disjuntor Fechado"))
            disjuntor52l1 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52l1() {
        if (disjuntor52l1.equals("Disjuntor Fechado"))
            disjuntor52l1 = "Disjuntor Aberto";
        else if (disjuntor52l1.equals("Disjuntor Aberto"))
            disjuntor52l1 = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52l2() {
        NomeDisjuntor52l2 = "Disjuntor 52 L2";
    }

    public void setQuantFechamento52l2() {
        QuantFechamento52l2 = QuantFechamento52l2 + 1;
    }

    public void setQuantAbertura52l2() {
        QuantAbertura52l2 = QuantAbertura52l2 + 1;
    }

    public void setManobraDisjuntor52l2() {
        ManobraDisjuntor52l2 = "Bay L2";
    }

    public void fecharDisjuntor52l2() {
        if (disjuntor52l2.equals("Disjuntor Aberto"))
            disjuntor52l2 = "Disjuntor Fechado";
        else if (disjuntor52l2.equals("Disjuntor Fechado"))
            disjuntor52l2 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52l2() {
        if (disjuntor52l2.equals("Disjuntor Fechado"))
            disjuntor52l2 = "Disjuntor Aberto";
        else if (disjuntor52l2.equals("Disjuntor Aberto"))
            disjuntor52l2 = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52bt() {
        NomeDisjuntor52bt = "Disjuntor 52 BT";
    }

    public void setQuantFechamento52bt() {
        QuantFechamento52bt = QuantFechamento52bt + 1;
    }

    public void setQuantAbertura52bt() {
        QuantAbertura52bt = QuantAbertura52bt + 1;
    }

    public void setManobraDisjuntor52bt() {
        ManobraDisjuntor52bt = "Bay BT";
    }

    public void fecharDisjuntor52bt() {
        if (disjuntor52bt.equals("Disjuntor Aberto"))
            disjuntor52bt = "Disjuntor Fechado";
        else if (disjuntor52bt.equals("Disjuntor Fechado"))
            disjuntor52bt = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52bt() {
        if (disjuntor52bt.equals("Disjuntor Fechado"))
            disjuntor52bt = "Disjuntor Aberto";
        else if (disjuntor52bt.equals("Disjuntor Aberto"))
            disjuntor52bt = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52al() {
        if (disjuntor52al.equals("Disjuntor Aberto"))
            disjuntor52al = "Disjuntor Fechado";
        else if (disjuntor52al.equals("Disjuntor Fechado"))
            disjuntor52al = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52al() {
        if (disjuntor52al.equals("Disjuntor Fechado"))
            disjuntor52al = "Disjuntor Aberto";
        else if (disjuntor52al.equals("Disjuntor Aberto"))
            disjuntor52al = "Disjuntor Aberto";
    }

    public int getQuantFechamento52mt1() {
        return QuantFechamento52mt1;
    }

    public int getQuantAbertura52mt1() {
        return QuantAbertura52mt1;
    }

    public int getQuantFechamento52mtr() {
        return QuantFechamento52mtr;
    }

    public int getQuantAbertura52mtr() {
        return QuantAbertura52mtr;
    }

    public int getQuantFechamento52mt2() {
        return QuantFechamento52mt2;
    }

    public int getQuantAbertura52mt2() {
        return QuantAbertura52mt2;
    }

    public int getQuantFechamento52mt3() {
        return QuantFechamento52mt3;
    }

    public int getQuantAbertura52mt3() {
        return QuantAbertura52mt3;
    }

    public int getQuantFechamento52mt4() {
        return QuantFechamento52mt4;
    }

    public int getQuantAbertura52mt4() {
        return QuantAbertura52mt4;
    }

    public String disjuntor52mt1() {
        return disjuntor52mt1;
    }

    public String nomeDisjuntor52mt1() {
        return NomeDisjuntor52mt1;
    }

    public String manobraDisjuntor52mt1() {
        return ManobraDisjuntor52mt1;
    }

    public String disjuntor52mtr() {
        return disjuntor52mtr;
    }

    public String nomeDisjuntor52mtr() {
        return NomeDisjuntor52mtr;
    }

    public String manobraDisjuntor52mtr() {
        return ManobraDisjuntor52mtr;
    }

    public String nomeDisjuntor52mt2() {
        return NomeDisjuntor52mt2;
    }

    public String disjuntor52mt2() {
        return disjuntor52mt2;
    }

    public String manobraDisjuntor52mt2() {
        return ManobraDisjuntor52mt2;
    }

    public String nomeDisjuntor52mt3() {
        return NomeDisjuntor52mt3;
    }

    public String disjuntor52mt3() {
        return disjuntor52mt3;
    }

    public String manobraDisjuntor52mt3() {
        return ManobraDisjuntor52mt3;
    }

    public String nomeDisjuntor52mt4() {
        return NomeDisjuntor52mt4;
    }

    public String disjuntor52mt4() {
        return disjuntor52mt4;
    }

    public String manobraDisjuntor52mt4() {
        return ManobraDisjuntor52mt4;
    }

    public String disjuntor52l1() {
        return disjuntor52l1;
    }

    public int getQuantFechamento52l1() {
        return QuantFechamento52l1;
    }

    public int getQuantAbertura52l1() {
        return QuantAbertura52l1;
    }

    public String disjuntor52l2() {
        return disjuntor52l2;
    }

    public String disjuntor52al() {
        return disjuntor52al;
    }

    public String disjuntor52bt() {
        return disjuntor52bt;
    }

    public String nomeDisjuntor52l1() {
        return NomeDisjuntor52l1;
    }

    public String manobraDisjuntor52l1() {
        return ManobraDisjuntor52l1;
    }

    public String nomeDisjuntor52l2() {
        return NomeDisjuntor52l2;
    }

    public int getQuantFechamento52l2() {
        return QuantFechamento52l2;
    }

    public int getQuantAbertura52l2() {
        return QuantAbertura52l2;
    }

    public String manobraDisjuntor52l2() {
        return ManobraDisjuntor52l2;
    }

    public String nomeDisjuntor52bt() {
        return NomeDisjuntor52bt;
    }

    public int getQuantFechamento52bt() {
        return QuantFechamento52bt;
    }

    public int getQuantAbertura52bt() {
        return QuantAbertura52bt;
    }

    public String manobraDisjuntor52bt() {
        return ManobraDisjuntor52bt;
    }

    // �������������������������������������������� TRANSFORMADORES
    // ����������������������������������������������������
    private int tapsmt1 = 0;
    private int tapsmt2 = 0;
    private int tapsmtr = 0;
    private int tapsmt3 = 0;
    private int tapsmt4 = 0;
    private int SubirTaps = 0;
    private int DescerTaps = 0;
    private int QuantTaps = 0;

    public void setNomeTransformadormt1() {
        NomeTransformadormt1 = "Transformador MT-1";
    }

    public void setManobraTransformadormt1() {
        ManobraTransformadormt1 = "Bay MT-1";
    }

    public void ligarTransformadormt1() {
        if (transformadormt1.equals("Transformador Desligado"))
            transformadormt1 = "Transformador Ligado";
        else if (transformadormt1.equals("Transformador Ligado"))
            transformadormt1 = "Transformador Ligado";
    }

    public void desligarTransformadormt1() {
        if (transformadormt1.equals("Transformador Ligado"))
            transformadormt1 = "Transformador Desligado";
        else if (transformadormt1.equals("Transformador Desligado"))
            transformadormt1 = "Transformador Desligado";
    }

    public void setNomeTransformadormtr() {
        NomeTransformadormtr = "Transformador MT-R";
    }

    public void setManobraTransformadormtr() {
        ManobraTransformadormtr = "Bay MT-R";
    }

    public void ligarTransformadormtr() {
        if (transformadormtr.equals("Transformador Desligado"))
            transformadormtr = "Transformador Ligado";
        else if (transformadormtr.equals("Transformador Ligado"))
            transformadormtr = "Transformador Ligado";
    }

    public void desligarTransformadormtr() {
        if (transformadormtr.equals("Transformador Ligado"))
            transformadormtr = "Transformador Desligado";
        else if (transformadormtr.equals("Transformador Desligado"))
            transformadormtr = "Transformador Desligado";
    }

    public void setNomeTransformadormt2() {
        NomeTransformadormt2 = "Transformador MT-2";
    }

    public void setManobraTransformadormt2() {
        ManobraTransformadormt2 = "Bay MT-2";
    }

    public void ligarTransformadormt2() {
        if (transformadormt2.equals("Transformador Desligado"))
            transformadormt2 = "Transformador Ligado";
        else if (transformadormt2.equals("Transformador Ligado"))
            transformadormt2 = "Transformador Ligado";
    }

    public void desligarTransformadormt2() {
        if (transformadormt2.equals("Transformador Ligado"))
            transformadormt2 = "Transformador Desligado";
        else if (transformadormt2.equals("Transformador Desligado"))
            transformadormt2 = "Transformador Desligado";
    }

    public void setNomeTransformadormt3() {
        NomeTransformadormt3 = "Transformador MT-3";
    }

    public void setManobraTransformadormt3() {
        ManobraTransformadormt3 = "Bay MT-3";
    }

    public void ligarTransformadormt3() {
        if (transformadormt3.equals("Transformador Desligado"))
            transformadormt3 = "Transformador Ligado";
        else if (transformadormt3.equals("Transformador Ligado"))
            transformadormt3 = "Transformador Ligado";
    }

    public void desligarTransformadormt3() {
        if (transformadormt3.equals("Transformador Ligado"))
            transformadormt3 = "Transformador Desligado";
        else if (transformadormt3.equals("Transformador Desligado"))
            transformadormt3 = "Transformador Desligado";
    }

    public void setNomeTransformadormt4() {
        NomeTransformadormt4 = "Transformador MT-4";
    }

    public void setManobraTransformadormt4() {
        ManobraTransformadormt4 = "Bay MT-4";
    }

    public void ligarTransformadormt4() {
        if (transformadormt4.equals("Transformador Desligado"))
            transformadormt4 = "Transformador Ligado";
        else if (transformadormt4.equals("Transformador Ligado"))
            transformadormt4 = "Transformador Ligado";
    }

    public void desligarTransformadormt4() {
        if (transformadormt4.equals("Transformador Ligado"))
            transformadormt4 = "Transformador Desligado";
        else if (transformadormt4.equals("Transformador Desligado"))
            transformadormt4 = "Transformador Desligado";
    }

    public void setQuantSubir() {

        SubirTaps++;
        QuantTaps++;
    }

    public void setQuantDescer() {
        DescerTaps--;
        QuantTaps--;
    }

    public int getQuantSubir() {
        return SubirTaps;
    }

    public int getQuantDescer() {
        return DescerTaps;
    }

    public void setQuantTaps() {
        QuantTaps = SubirTaps + DescerTaps;
    }

    public int getQuantTaps() {
        return QuantTaps;
    }

    public String getManobraTransformadormt1() {
        return ManobraTransformadormt1;
    }

    public String getLigarTransformadormt1() {
        return transformadormt1;
    }

    public String getDesligarTransformadormt1() {
        return transformadormt1;
    }

    public String getLigarTransformadormtr() {
        return transformadormtr;
    }

    public String getDesligarTransformadormtr() {
        return transformadormtr;
    }

    public String getLigarTransformadormt2() {
        return transformadormt2;
    }

    public String getDesligarTransformadormt2() {
        return transformadormt2;
    }

    public String getLigarTransformadormt3() {
        return transformadormt3;
    }

    public String getDesligarTransformadormt3() {
        return transformadormt3;
    }

    public String getLigarTransformadormt4() {
        return transformadormt4;
    }

    public String getDesligarTransformadormt4() {
        return transformadormt4;
    }

    public void aumentarTapmt1() {
        if (tapsmt1 < 8)
            tapsmt1++;
        if (tapsmt1 < 8)
            transformadormt1 = "Elevado Tap";
    }

    public void diminuirTapmt1() {
        if (tapsmt1 > 0)
            tapsmt1--;
        if (tapsmt1 >= 0)
            transformadormt1 = "Reduzido Tap";
    }

    public String getValorTapmt1() {
        String saida = "";
        switch (tapsmt1) {
            case 0:
                saida = "30.6 kV";
                break;
            case 1:
                saida = "31.1 kV";
                break;
            case 2:
                saida = "31.6 kV";
                break;
            case 3:
                saida = "32.1 kV";
                break;
            case 4:
                saida = "32.5 kV";
                break;
            case 5:
                saida = "33.0 kV";
                break;
            case 6:
                saida = "33.5 kV";
                break;
            case 7:
                saida = "34.0 kV";
                break;
            case 8:
                saida = "34.5 kV";
                break;
        }
        return saida;
    }

    public int getTapsmt1() {
        return tapsmt1;
    }

    public String getMostrarTapsmt1() {
        String mostrar = "";
        switch (tapsmt1) {
            case 0:
                mostrar = "Tap 1";
                break;
            case 1:
                mostrar = "Tap 2";
                break;
            case 2:
                mostrar = "Tap 3";
                break;
            case 3:
                mostrar = "Tap 4";
                break;
            case 4:
                mostrar = "Tap 5";
                break;
            case 5:
                mostrar = "Tap 6";
                break;
            case 6:
                mostrar = "Tap 7";
                break;
            case 7:
                mostrar = "Tap 8";
                break;
            case 8:
                mostrar = "Tap 9";
                break;
        }
        return mostrar;
    }

    public void aumentarTapmtr() {
        if (tapsmtr < 8)
            tapsmtr++;
        if (tapsmtr < 8)
            transformadormtr = "Elevado Tap";
    }

    public void diminuirTapmtr() {
        if (tapsmtr > 0)
            tapsmtr--;
        if (tapsmtr >= 0)
            transformadormtr = "Reduzido Tap";
    }

    public String getValorTapmtr() {
        String saida = "";
        switch (tapsmtr) {
            case 0:
                saida = "30.6 kV";
                break;
            case 1:
                saida = "31.1 kV";
                break;
            case 2:
                saida = "31.6 kV";
                break;
            case 3:
                saida = "32.1 kV";
                break;
            case 4:
                saida = "32.5 kV";
                break;
            case 5:
                saida = "33.0 kV";
                break;
            case 6:
                saida = "33.5 kV";
                break;
            case 7:
                saida = "34.0 kV";
                break;
            case 8:
                saida = "34.5 kV";
                break;
        }
        return saida;
    }

    public int getTapsmtr() {
        return tapsmtr;
    }

    public String getMostrarTapsmtr() {
        String mostrar = "";
        switch (tapsmtr) {
            case 0:
                mostrar = "Tap 1";
                break;
            case 1:
                mostrar = "Tap 2";
                break;
            case 2:
                mostrar = "Tap 3";
                break;
            case 3:
                mostrar = "Tap 4";
                break;
            case 4:
                mostrar = "Tap 5";
                break;
            case 5:
                mostrar = "Tap 6";
                break;
            case 6:
                mostrar = "Tap 7";
                break;
            case 7:
                mostrar = "Tap 8";
                break;
            case 8:
                mostrar = "Tap 9";
                break;
        }
        return mostrar;
    }

    public void aumentarTapmt2() {
        if (tapsmt2 < 8)
            tapsmt2++;
        if (tapsmt2 < 8)
            transformadormt2 = "Elevado Tap";
    }

    public void diminuirTapmt2() {
        if (tapsmt2 > 0)
            tapsmt2--;
        if (tapsmt2 >= 0)
            transformadormt2 = "Reduzido Tap";
    }

    public String getValorTapmt2() {
        String saida = "";
        switch (tapsmt2) {
            case 0:
                saida = "30.6 kV";
                break;
            case 1:
                saida = "31.1 kV";
                break;
            case 2:
                saida = "31.6 kV";
                break;
            case 3:
                saida = "32.1 kV";
                break;
            case 4:
                saida = "32.5 kV";
                break;
            case 5:
                saida = "33.0 kV";
                break;
            case 6:
                saida = "33.5 kV";
                break;
            case 7:
                saida = "34.0 kV";
                break;
            case 8:
                saida = "34.5 kV";
                break;
        }
        return saida;
    }

    public int getTapsmt2() {
        return tapsmt2;
    }

    public String getMostrarTapsmt2() {
        String mostrar = "";
        switch (tapsmt2) {
            case 0:
                mostrar = "Tap 1";
                break;
            case 1:
                mostrar = "Tap 2";
                break;
            case 2:
                mostrar = "Tap 3";
                break;
            case 3:
                mostrar = "Tap 4";
                break;
            case 4:
                mostrar = "Tap 5";
                break;
            case 5:
                mostrar = "Tap 6";
                break;
            case 6:
                mostrar = "Tap 7";
                break;
            case 7:
                mostrar = "Tap 8";
                break;
            case 8:
                mostrar = "Tap 9";
                break;
        }
        return mostrar;
    }

    public void aumentarTapmt3() {
        if (tapsmt3 < 8)
            tapsmt3++;
        if (tapsmt3 < 8)
            transformadormt3 = "Elevado Tap";
    }

    public void diminuirTapmt3() {
        if (tapsmt3 > 0)
            tapsmt3--;
        if (tapsmt3 >= 0)
            transformadormt3 = "Reduzido Tap";
    }

    public String getValorTapmt3() {
        String saida = "";
        switch (tapsmt3) {
            case 0:
                saida = "30.6 kV";
                break;
            case 1:
                saida = "31.1 kV";
                break;
            case 2:
                saida = "31.6 kV";
                break;
            case 3:
                saida = "32.1 kV";
                break;
            case 4:
                saida = "32.5 kV";
                break;
            case 5:
                saida = "33.0 kV";
                break;
            case 6:
                saida = "33.5 kV";
                break;
            case 7:
                saida = "34.0 kV";
                break;
            case 8:
                saida = "34.5 kV";
                break;
        }
        return saida;
    }

    public int getTapsmt3() {
        return tapsmt3;
    }

    public String getMostrarTapsmt3() {
        String mostrar = "";
        switch (tapsmt3) {
            case 0:
                mostrar = "Tap 1";
                break;
            case 1:
                mostrar = "Tap 2";
                break;
            case 2:
                mostrar = "Tap 3";
                break;
            case 3:
                mostrar = "Tap 4";
                break;
            case 4:
                mostrar = "Tap 5";
                break;
            case 5:
                mostrar = "Tap 6";
                break;
            case 6:
                mostrar = "Tap 7";
                break;
            case 7:
                mostrar = "Tap 8";
                break;
            case 8:
                mostrar = "Tap 9";
                break;
        }
        return mostrar;
    }

    public void aumentarTapmt4() {
        if (tapsmt4 < 8)
            tapsmt4++;
        if (tapsmt4 < 8)
            transformadormt4 = "Elevado Tap";
    }

    public void diminuirTapmt4() {
        if (tapsmt4 > 0)
            tapsmt4--;
        if (tapsmt4 >= 0)
            transformadormt4 = "Reduzido Tap";
    }

    public String getValorTapmt4() {
        String saida = "";
        switch (tapsmt4) {
            case 0:
                saida = "30.6 kV";
                break;
            case 1:
                saida = "31.1 kV";
                break;
            case 2:
                saida = "31.6 kV";
                break;
            case 3:
                saida = "32.1 kV";
                break;
            case 4:
                saida = "32.5 kV";
                break;
            case 5:
                saida = "33.0 kV";
                break;
            case 6:
                saida = "33.5 kV";
                break;
            case 7:
                saida = "34.0 kV";
                break;
            case 8:
                saida = "34.5 kV";
                break;
        }
        return saida;
    }

    public int getTapsmt4() {
        return tapsmt4;
    }

    public String getMostrarTapsmt4() {
        String mostrar = "";
        switch (tapsmt4) {
            case 0:
                mostrar = "Tap 1";
                break;
            case 1:
                mostrar = "Tap 2";
                break;
            case 2:
                mostrar = "Tap 3";
                break;
            case 3:
                mostrar = "Tap 4";
                break;
            case 4:
                mostrar = "Tap 5";
                break;
            case 5:
                mostrar = "Tap 6";
                break;
            case 6:
                mostrar = "Tap 7";
                break;
            case 7:
                mostrar = "Tap 8";
                break;
            case 8:
                mostrar = "Tap 9";
                break;
        }
        return mostrar;
    }

    public String nomeTransformadormt1() {
        return NomeTransformadormt1;
    }

    public String manobraTransformadormt1() {
        return ManobraTransformadormt1;
    }

    public String elevadoTapmt1() {
        return transformadormt1;
    }

    public String reduzidoTapmt1() {
        return transformadormt1;
    }

    public String nomeTransformadormtr() {
        return NomeTransformadormtr;
    }

    public String manobraTransformadormtr() {
        return ManobraTransformadormtr;
    }

    public String elevadoTapmtr() {
        return transformadormtr;
    }

    public String reduzidoTapmtr() {
        return transformadormtr;
    }

    public String nomeTransformadormt2() {
        return NomeTransformadormt2;
    }

    public String manobraTransformadormt2() {
        return ManobraTransformadormt2;
    }

    public String elevadoTapmt2() {
        return transformadormt2;
    }

    public String reduzidoTapmt2() {
        return transformadormt2;
    }

    public String nomeTransformadormt3() {
        return NomeTransformadormt3;
    }

    public String manobraTransformadormt3() {
        return ManobraTransformadormt3;
    }

    public String elevadoTapmt3() {
        return transformadormt3;
    }

    public String reduzidoTapmt3() {
        return transformadormt3;
    }

    public String nomeTransformadormt4() {
        return NomeTransformadormt4;
    }

    public String manobraTransformadormt4() {
        return ManobraTransformadormt4;
    }

    public String elevadoTapmt4() {
        return transformadormt4;
    }

    public String reduzidoTapmt4() {
        return transformadormt4;
    }
}