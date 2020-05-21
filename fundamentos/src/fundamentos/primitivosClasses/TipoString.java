package fundamentos.primitivosClasses;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(3)); // Mostra o caracter na posição informada
		
		// Duas maneira de contatenar
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		System.out.println(s.startsWith("Boa")); // Verifica se a String começa com o parâmetro informado, retornando true ou false 
		System.out.println(s.startsWith("boa")); 
		System.out.println(s.endsWith("Tarde")); // Verifica se a String termina com o parâmetro informado, retornando true ou false 
		System.out.println(s.endsWith("tarde"));
		
		System.out.println(s.equals("boa tarde")); // Verifi se o parâmetro iformado é extamente igual a String, retornando true ou false
		System.out.println(s.equalsIgnoreCase("boa tarde")); // Verifi se o parâmetro iformado é extamente igual a String, ignorando qualquer coisa incluindo acentuação retornando true ou false
		
		System.out.println("Frase qualquer".contains("qual")); // Verifica se o parâmetro informado existe dentro da String
		System.out.println("Frase qualquer".indexOf("qual")); // Verifica em qual posição está o parâmetro informado
		System.out.println("Frase qualquer".substring(6)); // Vai retorna somente a String aparti do parâmetro informado
		System.out.println("Frase qualquer".substring(6,8)); // Vai retorna somente a String que está dentro dos dois parâmetros informado, porém nesse caso só retorna do do 6 ao 7 
		
		
	}
}
