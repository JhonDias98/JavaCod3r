package fundamentos.exercicios;

/* 1. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit. */

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		
		double conversao = ( celsius - 32 ) / 1.8;
		
		System.out.print("Valor em Farenheit: " + conversao);
		
		sc.close();
	}
}
