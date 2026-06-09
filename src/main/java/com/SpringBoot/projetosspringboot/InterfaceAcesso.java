
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceAcesso extends JFrame implements ActionListener {

    // ---- Definiçao dos Objetos a serem Usados
    BDUsuario objBDLogin = new BDUsuario();
    CadastramentoDVDS dvds = new CadastramentoDVDS();

    private JLabel jlLogin;
    private JLabel jlSenha;

    private JLabel gif, projeto, lbindice;

    private JTextField jtfLogin;
    private JPasswordField jtfSenha;

    private JButton bConsultar;
    private JButton bSair;

    private JPanel jpPainel = new JPanel();

    public InterfaceAcesso() {
        // --- Configura��o do Frame
        setTitle("EfetuarLogin");
        setSize(200, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        Icon imagem = new ImageIcon("linha.GIF");
        gif = new JLabel();
        gif.setIcon(imagem);
        jpPainel.add(gif);
        projeto = new JLabel("Efetuar Login", JLabel.CENTER);
        projeto.setFont(new Font("Dialog", Font.ITALIC, 28));
        projeto.setForeground(Color.blue);
        jpPainel.add(projeto);
        container.add(jpPainel);

        // --- Configura��o dos objetos do Frame
        jlLogin = new JLabel("   Login   ");
        jtfLogin = new JTextField(16);
        jlSenha = new JLabel("   Senha   ");
        jtfSenha = new JPasswordField(16);
        jtfLogin.addActionListener(this);

        // --- Defini��o dos Bot�es e seus eventos
        bConsultar = new JButton("Autenticar");
        bConsultar.addActionListener(this);
        bSair = new JButton("     Sair    ");
        bSair.addActionListener(this);

        // --- Adicionando os Objetos para o Painel
        jpPainel.add(jlLogin);
        jpPainel.add(jtfLogin);
        jpPainel.add(jlSenha);
        jpPainel.add(jtfSenha);

        jpPainel.add(bConsultar);
        jpPainel.add(bSair);

        getContentPane().add(jpPainel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bConsultar) {
            objBDLogin.ConectarBD();
            String login = jtfLogin.getText();
            String senha = new String(jtfSenha.getPassword());

            if (objBDLogin.ConsultaLogin(login, senha)) {
                setVisible(false);
                dvds.tfUsuario.setText(login);
                jtfSenha.setText(senha);

                setVisible(false);
                dvds.setVisible(true);
                dvds.tfUsuario.setText(login);
            } else {
                JOptionPane.showMessageDialog(null, "Login ou Senha Invalidos!");
            }
        }

        if (e.getSource() == bSair) {
            setVisible(false);
        }
    }

    public static void main(String args[]) {
        JFrame InterfaceAcesso = new InterfaceAcesso();

        InterfaceAcesso.setVisible(true);

        WindowListener x = new WindowAdapter()

        {
            public void WindowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        InterfaceAcesso.addWindowListener(x);
    }
}