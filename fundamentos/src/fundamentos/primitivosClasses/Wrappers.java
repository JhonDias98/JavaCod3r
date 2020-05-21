package fundamentos.primitivosClasses;

public class Wrappers {
	public static void main(String[] args) {
		
		// Utilizando a primeira letra maiuscula, deixam de ser tipos primivos, e se tornam classes 
		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; //int
		Long l = 1000000L;
		
		System.out.println(b.byteValue()); // Mostra o valor em byte
		System.out.println(s.toString()); // Converte para String
		
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.25F;
		System.out.println(f);
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); // Converte a String para boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // Converte o bollean para String
		
		Character c = '#';
		System.out.println(c + "...");
	}
}
