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
		 * Tem uma regra de precedência
		 * Quando coloca os operador antes da variável, no caso do a, o ++ será incrementado a variável, e só depois vai fazer a comparação
		 * Já no b, ele primeiro fará a comparação, e só depois o -- será decrementado
		 */
		System.out.println(++a == b--); 
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
