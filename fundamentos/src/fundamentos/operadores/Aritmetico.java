package fundamentos.operadores;

public class Aritmetico {
	public static void main(String[] args) {
		System.out.println(2 + 3);
		
		//Calculos com números double sempre vai retorna númerois com casas decimais
		var x = 34.56;
		double y = 2.2;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		//Calculos com números inteiros sempre vai retorna númerois inteiros
		int a = 8;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double)b); //Utilizando (CAST), ele retorna o resultado correto
		
		System.out.println(8 % 3); //Retorna o resto da divisão
	}
}
