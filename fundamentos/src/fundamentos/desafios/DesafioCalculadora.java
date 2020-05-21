package fundamentos.desafios;

/*
 Fazer uma calculadora com as operações básicas, utilizando apena o que foi ensinado
 */

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		double numero1, numero2;
		String operacao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		numero1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		numero2 = sc.nextDouble();
		
		System.out.print("Informe o sinal da operação: ");
		operacao = sc.next();
		
		double resultado = "+".equals(operacao) ? numero1 + numero2 : 0;
		resultado = "-".equals(operacao) ? numero1 - numero2 : resultado;
		resultado = "*".equals(operacao) ? numero1 * numero2 : resultado;
		resultado = "/".equals(operacao) ? numero1 / numero2 : resultado;
		resultado = "%".equals(operacao) ? numero1 / numero2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", numero1, operacao, numero2, resultado);
		sc.close();
		
	}
	
	
}
