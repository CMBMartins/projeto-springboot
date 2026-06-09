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
 * MODULO -   PERFIL                                   *
 ******************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Perfil extends JFrame implements ActionListener 
{

// ---- Definiçao dos Objetos a serem Usados 
    BDadosUsuario objBDLogin = new BDadosUsuario();
    //SimuladorViewS tv = new SimuladorViewS();
   
	private JLabel jlLogin;
	private JLabel jlSenha;
	private JLabel jlPerfil;
	private JLabel gif, projeto, lbindice;
	
	private JTextField     jtfLogin;
	private JPasswordField jtfSenha;
	private JTextField     jtfPerfil;
	//private JTextField     tfUsuario;
	
	private JButton bConsultar;
	private JButton bSair;
	
	private JPanel  jpPainel = new JPanel();
	
	public Perfil() 
	{
          //  --- Configuraçao do Frame
		  setTitle("Efetuar Login");
	      setSize(220,340);
	      setLocation(400,200);     
	      Container container = getContentPane ();
		  container.setLayout(new BorderLayout());
		  setResizable(false);
		  
		  Icon imagem = new ImageIcon ( "linha.GIF" ); 
          gif = new JLabel();
          gif.setIcon ( imagem );
          jpPainel.add(gif);
          projeto = new JLabel("Efetuar Login", projeto.CENTER);
          projeto.setFont(new Font("Arial", 1, 26));
          projeto.setForeground(Color.blue);
          jpPainel.add(projeto);
          container.add(jpPainel);
	   	  
	   	  //  --- Configuraçao dos objetos do Frame
		  jlLogin = new JLabel ("   Login   "); jtfLogin = new JTextField      (16);
		  jlSenha = new JLabel ("   Senha   "); jtfSenha = new JPasswordField  (16);
		  jlPerfil = new JLabel("   Perfil  "); jtfPerfil = new JTextField     (16);
		  jtfPerfil.addActionListener (this);
		   		  
		  // --- Definiçao dos Botoes e seus eventos
		  bConsultar    = new JButton("Autenticar");    bConsultar.addActionListener (this);
		  bSair         = new JButton("     Sair    "); bSair.addActionListener      (this);
	      	      
	      // --- Adicionando os Objetos para o Painel
	      jpPainel.add(jlLogin);      jpPainel.add(jtfLogin);
	      jpPainel.add(jlSenha);      jpPainel.add(jtfSenha);
	      jpPainel.add(jlPerfil);     jpPainel.add(jtfPerfil);
	     	       
	      jpPainel.add(bConsultar);
	      jpPainel.add(bSair); 
	            
          getContentPane().add(jpPainel);
       }
	    
	    public void actionPerformed(ActionEvent e)	
	    {
	        if (e.getSource()== bConsultar || e.getSource()== jtfPerfil)
	        {
	            objBDLogin.ConectarBD();
    	        String         login = jtfLogin.getText();
    	        String         senha = new String(jtfSenha.getPassword());
    	        String         perfil = jtfPerfil.getText();
    	            	            	       
    	     if (objBDLogin.consultaLogin(login, senha, perfil)) 
    	     {   setVisible(false);   	             
    	         jtfLogin.setText(login);
    	         jtfSenha.setText(senha);
    	         jtfPerfil.setText(perfil);
    	         setVisible(true);
				 new InterfaceUsuario().setVisible(true);   	      
    	     }    	       	    
    	      else
    	      {
    	          JOptionPane.showMessageDialog(null,"Login ou Senha Invalidos!");
    	      }
    	     }
    	   	  
    	    if (e.getSource()== bSair) 
    	    {
    		    setVisible(false);
            }
        }     
        
    	public static void main(String args[])
    	{   
			Perfil perfil = new Perfil();
            perfil.setVisible(true);	        
	     }            
}