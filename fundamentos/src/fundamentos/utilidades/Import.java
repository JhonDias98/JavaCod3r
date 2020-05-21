package fundamentos.utilidades;

// Os IMPORTS ficam fora da classe
import java.util.Date;

import javax.swing.JButton;

public class Import {
	public static void main(String[] args) {
		java.lang.String b = "Boa Tarde"; // Este é o caminho completo, mas utilizamos apenas o ultimo
		System.out.println(b);
		
		Date d = new Date();
		System.out.println(d);
		
		JButton botao = new JButton();
		System.out.println(botao);
	}
}
