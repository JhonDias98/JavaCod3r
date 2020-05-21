package fundamentos.primitivosClasses;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(3)); // Mostra o caracter na posi��o informada
		
		// Duas maneira de contatenar
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		System.out.println(s.startsWith("Boa")); // Verifica se a String come�a com o par�metro informado, retornando true ou false 
		System.out.println(s.startsWith("boa")); 
		System.out.println(s.endsWith("Tarde")); // Verifica se a String termina com o par�metro informado, retornando true ou false 
		System.out.println(s.endsWith("tarde"));
		
		System.out.println(s.equals("boa tarde")); // Verifi se o par�metro iformado � extamente igual a String, retornando true ou false
		System.out.println(s.equalsIgnoreCase("boa tarde")); // Verifi se o par�metro iformado � extamente igual a String, ignorando qualquer coisa incluindo acentua��o retornando true ou false
		
		System.out.println("Frase qualquer".contains("qual")); // Verifica se o par�metro informado existe dentro da String
		System.out.println("Frase qualquer".indexOf("qual")); // Verifica em qual posi��o est� o par�metro informado
		System.out.println("Frase qualquer".substring(6)); // Vai retorna somente a String aparti do par�metro informado
		System.out.println("Frase qualquer".substring(6,8)); // Vai retorna somente a String que est� dentro dos dois par�metros informado, por�m nesse caso s� retorna do do 6 ao 7 
		
		
	}
}
