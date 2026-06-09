/*******************************************************
 * PROJETO SIMULADOR PARA TREINAMENTO DE OPERADORES DE *
 * SUBESTAÇAO.                                         *
 * PROJETISTA E DESENVOLVEDOR:                         *
 *          CARLOS MARDONIO BEZERRA MARTINS            * 
 *         BACHAREL EM SISTEMAS DE INFORMAÇAO          *
 *                                                     *
 * DATA - 18/08/2006                                   *
 * ATUALIZADOO - 19/08/2008                            *
 *******************************************************
 * MODULO -   GRAVADOR                                 *
 ******************************************************/
import java.io.*;
import java.util.*;

public class Gravador{

	ObjectOutputStream oos;
	String filename;
		
	public Gravador(String arq){
		this.filename=arq;
	}//fim do construtor
	
	public void gravar(Object o){
	 	try{
	 	 	oos = new ObjectOutputStream(new FileOutputStream(filename));
	 	 	oos.writeObject(o);
	 	 	oos.close();
	 	 	System.out.println("gravado com sucesso !");
	    } catch (Exception e) {
	    	System.out.println("Erro ao tentar gravar: "+e);
	    }
	 
	}//fim do metodo gravar

}// fim da classe Gravador