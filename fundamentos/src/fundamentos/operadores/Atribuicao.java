package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		int a = 3; //Pode receber valores
		int b = a; //Outras vari�veis
		int c = a + b; //express�es entre vari�veis
		
		c += b; // c = c + b
		c -= a; // c = c - a
		c *= b; // c = c * b
		c /= a; // c = c / a
		System.out.println(c);
		
		c %= 2; // c = c % 2; 0 ou 1
		System.out.println(c);
	}
}
