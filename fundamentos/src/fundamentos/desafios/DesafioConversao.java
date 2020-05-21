package fundamentos.desafios;

import java.util.Scanner;

/*
 Pegar três salários do tipo string, e converte para double, depois calcular a média dos três salários
 Obs: Tomar cuidado caso o usuário utilizar vírgula na entrada dos valores
*/

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salário");
		String valor1 = sc.next().replace(",", ".");
		
		System.out.println("Informe o segundo salário");
		String valor2 = sc.next().replace(",", ".");
		
		System.out.println("Informe o terceiro salário");
		String valor3 = sc.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("Média: " + media);
		
		sc.close();
	}
}
