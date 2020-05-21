package fundamentos.exercicios;

/* 4. Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor. */

import java.util.Scanner;

public class Ex4 {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor:");
		double valor = sc.nextDouble();
		
		double quadrado = Math.pow(valor, 2); //valor * valor
		
		double cubo = Math.pow(valor, 3); //valor * valor * valor
		
		System.out.print("O valor ao quadrado é: " + quadrado + "\n O valor ao cubo é: " + cubo);
		
		sc.close();
	}

}
