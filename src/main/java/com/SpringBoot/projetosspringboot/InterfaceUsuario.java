
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
 * MODULO -   INTERFACEUSUARIO                         *
 ******************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceUsuario extends JFrame implements ActionListener {

    // ---- Definiçao dos Objetos a serem Usados
    BDadosUsuario objBDLogin = new BDadosUsuario();

    private JLabel jlLogin;
    private JLabel jlSenha;
    private JLabel jlPerfil;
    private JLabel jlDistancia;
    JLabel gif, projeto, lbindice;

    private JTextField jtfLogin;
    private JPasswordField jtfSenha;
    private JTextField jtfPerfil;

    private JButton bConsultar;
    private JButton bCadastrar;
    private JButton bAlterar;
    private JButton bExcluir;
    private JButton bLimpar;
    private JButton bSair;

    private JPanel jpPainel = new JPanel();

    public InterfaceUsuario() {
        // --- Configuraçao do Frame
        setTitle("Cad. de Usuarios");
        setSize(230, 440);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // setLocation(400,120);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        setResizable(false);

        Icon imagem = new ImageIcon("linha.GIF");
        gif = new JLabel();
        gif.setIcon(imagem);
        jpPainel.add(gif);
        projeto = new JLabel("Cadastro de Usuarios", JLabel.CENTER);
        projeto.setFont(new Font("Arial", 1, 20));
        projeto.setForeground(Color.blue);
        jpPainel.add(projeto);
        container.add(jpPainel);

        // --- Configuraçao dos objetos do Frame
        jlLogin = new JLabel("   Login   ");
        jtfLogin = new JTextField(15);
        jlSenha = new JLabel("   Senha   ");
        jtfSenha = new JPasswordField(15);
        jlPerfil = new JLabel("   Perfil  ");
        jtfPerfil = new JTextField(15);
        jtfLogin.addActionListener(this);
        jlDistancia = new JLabel(
                "                                                                                                           ");

        // --- Definiçao dos Botoes e seus eventos
        bCadastrar = new JButton("Cadastrar");
        bCadastrar.addActionListener(this);
        bAlterar = new JButton("Alterar ");
        bAlterar.addActionListener(this);
        bConsultar = new JButton("Consultar");
        bConsultar.addActionListener(this);
        bExcluir = new JButton(" Excluir");
        bExcluir.addActionListener(this);
        bLimpar = new JButton("  Limpar   ");
        bLimpar.addActionListener(this);
        bSair = new JButton("    Sair   ");
        bSair.addActionListener(this);

        // --- Adicionando os Objetos para o Painel
        jpPainel.add(jlLogin);
        jpPainel.add(jtfLogin);
        jpPainel.add(jlSenha);
        jpPainel.add(jtfSenha);
        jpPainel.add(jlPerfil);
        jpPainel.add(jtfPerfil);
        jpPainel.add(jlDistancia);

        jpPainel.add(bCadastrar);
        jpPainel.add(bAlterar);
        jpPainel.add(bConsultar);
        jpPainel.add(bExcluir);
        jpPainel.add(bLimpar);
        jpPainel.add(bSair);

        getContentPane().add(jpPainel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bConsultar || e.getSource() == jtfLogin) {
            objBDLogin.ConectarBD();
            if (objBDLogin.consultaNome(jtfLogin.getText())) {
                AtualizarTela();
            } else {
                JOptionPane.showMessageDialog(null, "Erro de Consulta!");
            }
        }

        if (e.getSource() == bCadastrar) {
            objBDLogin.ConectarBD();
            String usuario = jtfLogin.getText();
            String senha = new String(jtfSenha.getPassword());
            String perfil = jtfPerfil.getText();
            objBDLogin.cadastraLogin(usuario, senha, perfil);
            limparTela();
        }

        if (e.getSource() == bAlterar) {
            objBDLogin.ConectarBD();
            String usuario = jtfLogin.getText();
            String senha = new String(jtfSenha.getPassword());
            String perfil = jtfPerfil.getText();
            objBDLogin.alteraLogin(usuario, senha, perfil);
            AtualizarTela();
        }

        if (e.getSource() == bExcluir) {
            objBDLogin.ConectarBD();
            String usuario = jtfLogin.getText();
            objBDLogin.excluiLogin(usuario);
            limparTela();
        }

        if (e.getSource() == bSair) {
            dispose(); // fecha a janela
        }

        if (e.getSource() == bLimpar) {
            limparTela();
        }
    }

    public void limparTela() {
        jtfLogin.setText("");
        jtfSenha.setText("");
        jtfPerfil.setText("");
    }

    public void AtualizarTela() {
        jtfLogin.setText(objBDLogin.objLogin.getLogin());
        jtfSenha.setText(objBDLogin.objLogin.getSenha());
        jtfPerfil.setText(objBDLogin.objLogin.getPerfil());
    }

    public static void main(String args[]) {
        InterfaceUsuario interfaceusuario = new InterfaceUsuario();
        interfaceusuario.setVisible(true);
    }
}