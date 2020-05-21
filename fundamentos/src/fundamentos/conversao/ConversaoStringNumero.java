package fundamentos.conversao;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		
		// Fazendo aparecer uma caixa de dialogo, solicitando uma entrada de dados para o usu�rio
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro n�mero"); 
		String valor2 = JOptionPane.showInputDialog("Digite o primeiro n�mero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1); // Convetendo string para n�mero
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma: " + soma);
		System.out.println("M�dia: " + soma / 2);
	}
}
