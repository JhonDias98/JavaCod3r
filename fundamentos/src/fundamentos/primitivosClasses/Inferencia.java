package fundamentos.primitivosClasses;

public class Inferencia {
	public static void main(String[] args) {
		
		//Quando utiliza VAR, o Java automaticamente faz a inferencia do tipo da variável
		double a = 4.5;
		System.out.println(a);
		
		var b = 50;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5; vai ocorrer um erro, pois a variável c ta sendo usada como String
		
		double d; //variável foi declarada
		d = 123.45; //variável foi inicializada
		System.out.println(d); //usada
		
		/*
		 * var e;
		 * e = 123; vai ocorrer um erro, com VAR tem que declarar e inicializar na mesma linha
		*/
		
		var e = 123;
		System.out.println(e);
	}
}
