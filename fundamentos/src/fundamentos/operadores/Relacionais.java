package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		int a = 97;
		int b = 'a'; // Quando usa aspas simples, ele vai pegar a posição da letra a dentro da tabela unicode, sendo assim, vai retornar true
		System.out.println(a == b); //== é comparação 
		
		System.out.println(3 > 4); //Maior
		System.out.println(3 >= 3); //Maior ou igual
		System.out.println(3 < 4); //Menor
		System.out.println(30 <= 4); //Menor ou igual
		System.out.println(30 != 4); //Diferente
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
 