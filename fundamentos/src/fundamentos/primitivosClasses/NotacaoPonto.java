package fundamentos.primitivosClasses;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom Dia X"; // String n�o � um tipo primitivo
		
		s = s.toUpperCase(); // Converte para letra maiuscular
		s = s.replace("X", "Senhora"); // Troca uma palavra j� existente por outra nova
		s = s.concat("!!!"); // concatena com outra string
		System.out.println(s);
		
		
		System.out.println("Jonathan".toUpperCase()); // Pode ser usado dentro do sysout
		
		String y = "Bom dia Y".
				replace("Y", "Jonathan")
				.toLowerCase(); // Converte para letra minuscular
		System.out.println(y);
		
		// Tipos primitivos n�o tem o operador "."
	}
}
