package fundamentos.exercicios;

/* 5. Criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea. */

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
	   
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Digite a base:");
		double base = sc.nextDouble();
		
		System.out.println("Digite a altura:");
		double altura = sc.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A �rea do Tri�ngulo �: " + area);
		
		sc.close();
	}

}
