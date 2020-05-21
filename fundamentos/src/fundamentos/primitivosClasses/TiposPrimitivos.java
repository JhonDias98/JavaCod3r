package fundamentos.primitivosClasses;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário
		
		// -----------Tipos númericos inteiro-----------
		byte anosDeEmpresa = 127; // máximo 128
		short numeroDeVoos = 32767;  // máximo 32768
		
		// Pode utilizar underline  "_" para facilitar na litura do número
		int id = 2_147_483_647; // máximo 2147483648
		
		// No LONG quando ultrapassar o valor de um INT, utilizar a letra L no final do número
		long pontosAcumulado = 3_134_845_222L; // máximo 9223372036854775808
		
		// -----------Tipos númericos reais-----------
		// Ultilizar no final do FLOAT a letra F, para o compilador entender que é um FLOAT
		float salario = 11_445.44F; // máximo 4 bytes
		double vendasAcumuladas = 2_991_785_254.08; // máximo 8 bytes
		
		// -----------Tipo booleano-----------
		boolean estaDeFerias = true; // ou FALSE
		
		// -----------Tipo caracter-----------
		char status = 'A'; // máximo de uma letra
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulado / vendasAcumuladas);
		
		System.out.println(id + ": ganha: " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
