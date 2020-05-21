package fundamentos.utilidades;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom"); // Utilizando PRINT, o console não ira pular uma linha para próxima informação
		System.out.print(" dia!\n"); // Neste caso é só usar o \n, que irá pular uma linha
		
		System.out.println("Bom"); // Utilizando PRINTLN, o console ira pular uma linha para próxima informação
		System.out.println("dia!");
		
		System.out.printf("Telefone: (%d) %d - %d %n", 11, 91234,5678); // Utilizando PRINTF para formatação, %d para números inteiros e %n para quebra de linhas
		System.out.printf("Salário: %.2f%n", 1466.5872); // %f para números reias e .2 antes do para difinir quantas casas decimais terá
		
		System.out.printf("Nome: %s%n", "Jonathan"); // %s para string
		
		
		Scanner entrada = new Scanner(System.in); // Scanner é utilizado para leitura de dados, System.in = entrada, System.out = saída
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine(); // Espera o usuário digitar algo no terminal, nextLine para String
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt(); // nextInt para números inteiro
		
		
		System.out.println(nome + " " + sobrenome + ", idade: " + idade);
		
		entrada.close(); // .close para fechar o recurso do Scanner
	}
}
