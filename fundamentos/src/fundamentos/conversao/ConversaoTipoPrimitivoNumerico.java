package fundamentos.conversao;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		// Forma implicita, não a perca de informação
		double a = 1; 
		System.out.println(a);
		
		// Forma explícita, utilizando (CAST) ocorrerá perca de informação, pois float não suporta todos os números informados
		float b = (float)1.234525487; 
		System.out.println(b);
		
		// Forma explícita (CAST)
		int c = 4; 
		byte d = (byte) c;
		System.out.println(d);
		
		// Forma explícita (CAST)
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}
}
