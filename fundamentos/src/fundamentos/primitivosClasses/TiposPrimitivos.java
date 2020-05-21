package fundamentos.primitivosClasses;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es do funcion�rio
		
		// -----------Tipos n�mericos inteiro-----------
		byte anosDeEmpresa = 127; // m�ximo 128
		short numeroDeVoos = 32767;  // m�ximo 32768
		
		// Pode utilizar underline  "_" para facilitar na litura do n�mero
		int id = 2_147_483_647; // m�ximo 2147483648
		
		// No LONG quando ultrapassar o valor de um INT, utilizar a letra L no final do n�mero
		long pontosAcumulado = 3_134_845_222L; // m�ximo 9223372036854775808
		
		// -----------Tipos n�mericos reais-----------
		// Ultilizar no final do FLOAT a letra F, para o compilador entender que � um FLOAT
		float salario = 11_445.44F; // m�ximo 4 bytes
		double vendasAcumuladas = 2_991_785_254.08; // m�ximo 8 bytes
		
		// -----------Tipo booleano-----------
		boolean estaDeFerias = true; // ou FALSE
		
		// -----------Tipo caracter-----------
		char status = 'A'; // m�ximo de uma letra
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulado / vendasAcumuladas);
		
		System.out.println(id + ": ganha: " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
