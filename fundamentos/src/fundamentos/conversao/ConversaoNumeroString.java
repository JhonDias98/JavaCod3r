package fundamentos.conversao;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); // Converteu para string, e mostrará o total de caracter
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); // Mesma coisa do de cima, porém de primitivo, foi para classe
		
		System.out.println(("" + num1).length()); // Outra maneira de converter número para string, utilizando (("" + X))
		System.out.println(("" + num2));
	}
}
