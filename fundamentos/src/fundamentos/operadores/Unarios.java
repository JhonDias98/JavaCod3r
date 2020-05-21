package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		/*
		 * Tem uma regra de preced�ncia
		 * Quando coloca os operador antes da vari�vel, no caso do a, o ++ ser� incrementado a vari�vel, e s� depois vai fazer a compara��o
		 * J� no b, ele primeiro far� a compara��o, e s� depois o -- ser� decrementado
		 */
		System.out.println(++a == b--); 
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
