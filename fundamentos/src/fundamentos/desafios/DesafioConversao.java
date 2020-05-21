package fundamentos.desafios;

import java.util.Scanner;

/*
 Pegar tr�s sal�rios do tipo string, e converte para double, depois calcular a m�dia dos tr�s sal�rios
 Obs: Tomar cuidado caso o usu�rio utilizar v�rgula na entrada dos valores
*/

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro sal�rio");
		String valor1 = sc.next().replace(",", ".");
		
		System.out.println("Informe o segundo sal�rio");
		String valor2 = sc.next().replace(",", ".");
		
		System.out.println("Informe o terceiro sal�rio");
		String valor3 = sc.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("M�dia: " + media);
		
		sc.close();
	}
}
