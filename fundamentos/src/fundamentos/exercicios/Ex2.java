package fundamentos.exercicios;

/* 2. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius. */

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		
		double conversao = fahrenheit * 1.8 + 32 ;
	
		System.out.print("Valor em Celsius: " + conversao);
		
		sc.close();
	}
}
