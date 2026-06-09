
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
 * MODULO -   INTERFACERELATORIOS                      *
 ******************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
//import java.util.*;
import java.util.Vector;

public class InterfaceRelatorios extends JFrame implements ActionListener {

    // ---- Definiçao dos Objetos a serem Usados
    BDadosAcesso objBDadosEventos = new BDadosAcesso();
    BDOperaçoes objBDOperaçoes = new BDOperaçoes();
    RelatorioDiario RD = new RelatorioDiario();

    JLabel lbConsultarRelatorio;
    private JLabel gif, projeto;

    JPanel jpPainel = new JPanel();

    public InterfaceRelatorios() // --- Configura��o do Frame
    {
        super("Relatorios");
        Container container = getContentPane();
        container.setLayout(new BorderLayout()); // gerenciador de layout

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        JButton bTabelaEventos;
        JButton bRelatorioDiario;
        JButton bTabelaEquipamentos;
        JButton bTabelaOperaçoes;
        JButton bRelatorioGeral;
        JButton bSair;
        // JButton bRetornar;

        JPanel painel = new JPanel();

        Icon imagem = new ImageIcon("linha.GIF");
        gif = new JLabel();
        gif.setIcon(imagem);
        painel.add(gif);
        projeto = new JLabel("Consultar Relatorios", JLabel.CENTER);
        projeto.setFont(new Font("ARIAL", 1, 14));
        projeto.setForeground(Color.blue);
        painel.add(projeto);

        // lbConsultarRelatorio = new JLabel("Consultar Relatórios");
        // lbConsultarRelatorio.setFont(new Font("Arial", 1, 12));
        // lbConsultarRelatorio.setForeground(Color.black);
        // lbConsultarRelatorio.setBounds(20,50,380,40); //Coluna,Linha,Largura,Altura
        // getContentPane().add(lbConsultarRelatorio);

        bTabelaEventos = new JButton("Relatorio de Eventos"); // BOT�O TABELA DE EVENTOS
        bTabelaEventos.setToolTipText("Pressione consultar a Tabela Eventos");
        bTabelaEventos.setMnemonic(KeyEvent.VK_B);
        bTabelaEventos.setActionCommand("Eventos");// define o nome da acao
        bTabelaEventos.setBounds(5, 85, 155, 30); // Coluna,Linha,Largura,Altura
        // bTabelaEventos.setBackground(new Color(180,180,250));
        getContentPane().add(bTabelaEventos);

        bRelatorioDiario = new JButton("Rel. Diario Operaçao");
        bRelatorioDiario.setToolTipText("Pressione para consultar a Tabela Manobras");
        bRelatorioDiario.setMnemonic(KeyEvent.VK_B);
        bRelatorioDiario.setActionCommand("Relatorio Diario");// define o nome da acao
        bRelatorioDiario.setBounds(5, 116, 155, 30); // Coluna,Linha,Largura,Altura
        // bRelatorioDiario.setBackground(new Color(180,180,250));
        getContentPane().add(bRelatorioDiario);

        bTabelaEquipamentos = new JButton("Tab. Equipamentos");
        bTabelaEquipamentos.setToolTipText("Pressione para consultar a tabela Equipamentos");
        bTabelaEquipamentos.setMnemonic(KeyEvent.VK_B);
        bTabelaEquipamentos.setActionCommand("Equipamentos");// define o nome da acao
        bTabelaEquipamentos.setBounds(5, 147, 155, 30); // Coluna,Linha,Largura,Altura
        // bTabelaEquipamentos.setBackground(new Color(180,180,250));
        getContentPane().add(bTabelaEquipamentos);

        bTabelaOperaçoes = new JButton("Tabela de Operaçoes");
        bTabelaOperaçoes.setToolTipText("Pressione para consultar a tabela Operaçoes");
        bTabelaOperaçoes.setMnemonic(KeyEvent.VK_B);
        bTabelaOperaçoes.setActionCommand("Operaçoes");// define o nome da acao
        bTabelaOperaçoes.setBounds(5, 178, 155, 30); // Coluna,Linha,Largura,Altura
        // bTabelaOperaçoes.setBackground(new Color(180,180,250));
        getContentPane().add(bTabelaOperaçoes);

        bRelatorioGeral = new JButton("Rel. Geral Operaçao");
        bRelatorioGeral.setToolTipText("Pressione para consultar a tabela Relatorios");
        bRelatorioGeral.setMnemonic(KeyEvent.VK_B);
        bRelatorioGeral.setActionCommand("Sair");// define o nome da acao
        bRelatorioGeral.setBounds(5, 209, 155, 30); // Coluna,Linha,Largura,Altura
        // bRelatorioGeral.setBackground(new Color(180,180,250));
        getContentPane().add(bRelatorioGeral);

        bSair = new JButton("         Sair         "); // BOT�O SAIR
        bSair.setForeground(Color.black);// cor do titulo do bot�o
        bSair.setEnabled(true);
        bSair.setToolTipText("Pressione para Sair");
        bSair.setMnemonic(KeyEvent.VK_B);
        bSair.setActionCommand("Sair");// define o nome da acao
        bSair.setBounds(5, 240, 155, 30); // Coluna,Linha,Largura,Altura
        // bSair.setBackground(new Color(180,180,250));
        getContentPane().add(bSair);

        container.add(painel);

        setSize(180, 320);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        bTabelaEventos.addActionListener(new ActionListener() // A��o do bot�o Gravar
        {
            public void actionPerformed(ActionEvent evt) {
                {
                    TbEActionPerformed(evt);
                }

            }
        });

        bTabelaOperaçoes.addActionListener(new ActionListener() // A��o do bot�o Gravar
        {
            public void actionPerformed(ActionEvent evt) {
                {
                    TbOActionPerformed(evt);
                }

            }
        });

        bTabelaEquipamentos.addActionListener(new ActionListener() // A��o do bot�o Gravar
        {
            public void actionPerformed(ActionEvent evt) {
                {
                    TbEQActionPerformed(evt);
                }
            }
        });

        bRelatorioDiario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ROActionPerformed(evt);
            }
        });

        bRelatorioGeral.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RGActionPerformed(evt);
            }
        });

        bSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setVisible(false);
            }
        });
    }

    private void TbEActionPerformed(ActionEvent evt) {
        new TabelaEquipamentos().setVisible(true);
        setVisible(false);
        // this.hide();
    }

    private void TbEQActionPerformed(ActionEvent evt) {
        new TabelaEquipamentos().setVisible(true);
        setVisible(false);
        // this.hide();
    }

    // --- Metodo que aglutina os eventos dos Botoes
    public void actionPerformed(ActionEvent e) {
    }

    private void ROActionPerformed(ActionEvent evt) {
        new RelatorioDiario().setVisible(true);
        setVisible(false);
        // this.hide();
    }

    private void RGActionPerformed(ActionEvent evt) {
        new RelatorioGeral().setVisible(true);
        setVisible(false);
        // this.hide();
    }

    public class TabelaEventos extends JFrame {

        private Connection conexao;
        private JTable tab;

        public TabelaEventos() {

            setTitle("Tabela de Eventos");
            setSize(800, 570);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(false);

            JButton btRetornar = new JButton("Retornar");
            btRetornar.setFont(new Font("Dialog", Font.BOLD, 16));
            btRetornar.setBounds(350, 510, 103, 31);
            add(btRetornar);

            btRetornar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    btRetornarActionPerformed(evt);
                }
            });

            try {
                Class.forName("org.postgresql.Driver");
                conexao = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/meubanco",
                        "postgres",
                        "Felipe15anos");
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados: " + ex.getMessage());
                return;
            }
            buscaTabela();
        }

        private void buscaTabela() {
            try (Statement st = conexao.createStatement();
                    ResultSet res = st.executeQuery("SELECT * FROM eventos")) {

                ResultSetMetaData rsmd = res.getMetaData();

                Vector<String> cabecalho = new Vector<>();
                for (int i = 1; i <= rsmd.getColumnCount(); ++i) {
                    cabecalho.add(rsmd.getColumnName(i));
                }

                Vector<Vector<String>> linhas = new Vector<>();
                while (res.next()) {
                    linhas.add(proximaLinha(res, rsmd));
                }

                tab = new JTable(linhas, cabecalho);
                JScrollPane scroller = new JScrollPane(tab);
                scroller.setBounds(10, 10, 760, 490);
                getContentPane().add(scroller);

                validate();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao buscar dados da tabela: " + e.getMessage());
            }
        }

        private Vector<String> proximaLinha(ResultSet rs, ResultSetMetaData rsmd) {
            Vector<String> linhaAtual = new Vector<>();
            try {
                for (int i = 1; i <= rsmd.getColumnCount(); ++i) {
                    linhaAtual.add(rs.getString(i));
                }
            } catch (SQLException e) {
                linhaAtual.add("Erro");
            }
            return linhaAtual;
        }

        private void btRetornarActionPerformed(ActionEvent evt) {
            new InterfaceRelatorios().setVisible(true);
            setVisible(false);
        }
    }

    public class TabelaOperaçoes extends JFrame {
        private Connection conexao;
        private JTable tab;

        public TabelaOperaçoes() {
            setTitle("Tabela de Operações");
            setSize(800, 570);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(false);
            setLayout(new BorderLayout());

            JButton btRetornar = new JButton("Retornar");
            btRetornar.setFont(new Font("Dialog", Font.BOLD, 16));
            JPanel painelInferior = new JPanel();
            painelInferior.add(btRetornar);
            add(painelInferior, BorderLayout.SOUTH);

            btRetornar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    btRetornarActionPerformed(evt);
                }
            });

            try {
                Class.forName("org.postgresql.Driver");
                conexao = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/meubanco",
                        "postgres",
                        "Felipe15anos");
                buscaTabela();
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(this, "❌ Driver PostgreSQL não encontrado!", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "❌ Erro de conexão com o banco: " + e.getMessage(), "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        private void buscaTabela() {
            try (Statement st = conexao.createStatement();
                    ResultSet res = st.executeQuery("SELECT * FROM operacoes")) {

                Vector<String> cabecalho = new Vector<>();
                Vector<Vector<String>> linhas = new Vector<>();

                ResultSetMetaData rsmd = res.getMetaData();
                int colunas = rsmd.getColumnCount();

                for (int i = 1; i <= colunas; i++) {
                    cabecalho.add(rsmd.getColumnName(i));
                }

                while (res.next()) {
                    linhas.add(proximaLinha(res, rsmd));
                }

                tab = new JTable(linhas, cabecalho);
                JScrollPane scroller = new JScrollPane(tab);
                add(scroller, BorderLayout.CENTER);
                revalidate();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "❌ Erro ao buscar dados: " + e.getMessage(), "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        private Vector<String> proximaLinha(ResultSet rs, ResultSetMetaData rsmd) {
            Vector<String> linhaAtual = new Vector<>();
            try {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    linhaAtual.add(rs.getString(i)); // Trata todos os tipos como string
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "❌ Erro ao processar linha: " + e.getMessage(), "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
            return linhaAtual;
        }

        private void btRetornarActionPerformed(ActionEvent evt) {
            new InterfaceRelatorios().setVisible(true);
            this.dispose(); // Fecha a janela atual corretamente
        }
    }

    private void TbOActionPerformed(ActionEvent evt) {
        new TabelaOperaçoes().setVisible(true);
        setVisible(false);
        // this.hide();
    }

    public class TabelaEquipamentos extends JFrame {
        private Connection conexao;
        private JTable tab;

        public TabelaEquipamentos() {

            setTitle("Tabela de Equipamentos");
            setSize(800, 570);
            setLocationRelativeTo(null);
            setResizable(false);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLayout(new BorderLayout());

            JButton btRetornar = new JButton("Retornar");
            btRetornar.setFont(new Font("Dialog", Font.BOLD, 16));

            JPanel painelInferior = new JPanel();
            painelInferior.add(btRetornar);
            add(painelInferior, BorderLayout.SOUTH);

            btRetornar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    btRetornarActionPerformed(evt);
                }
            });

            try {
                Class.forName("org.postgresql.Driver");
                conexao = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/meubanco",
                        "postgres",
                        "Felipe15anos");
                buscaTabela();
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(this, "❌ Driver PostgreSQL não encontrado!", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "❌ Erro ao conectar com o banco: " + e.getMessage(), "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        private void buscaTabela() {
            try (Statement st = conexao.createStatement();
                    ResultSet res = st.executeQuery("SELECT * FROM equipamentos")) {

                Vector<String> cabecalho = new Vector<>();
                Vector<Vector<String>> linhas = new Vector<>();

                ResultSetMetaData rsmd = res.getMetaData();
                int colunas = rsmd.getColumnCount();

                for (int i = 1; i <= colunas; i++) {
                    cabecalho.add(rsmd.getColumnName(i));
                }

                while (res.next()) {
                    linhas.add(proximaLinha(res, rsmd));
                }

                tab = new JTable(linhas, cabecalho);
                JScrollPane scroller = new JScrollPane(tab);
                add(scroller, BorderLayout.CENTER);
                revalidate();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "❌ Erro ao buscar dados: " + e.getMessage(), "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        private Vector<String> proximaLinha(ResultSet rs, ResultSetMetaData rsmd) {
            Vector<String> linhaAtual = new Vector<>();
            try {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    linhaAtual.add(rs.getString(i)); // Trata todos os tipos como String
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "❌ Erro ao processar linha: " + e.getMessage(), "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
            return linhaAtual;
        }

        private void btRetornarActionPerformed(ActionEvent evt) {
            new InterfaceRelatorios().setVisible(true);
            this.dispose(); // Fecha a janela corretamente
        }
    }

    public static void main(String args[]) {
        InterfaceRelatorios IO = new InterfaceRelatorios();
        IO.setVisible(true);
    }
}