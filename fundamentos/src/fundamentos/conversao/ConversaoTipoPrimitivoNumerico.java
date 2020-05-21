package fundamentos.conversao;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		// Forma implicita, n�o a perca de informa��o
		double a = 1; 
		System.out.println(a);
		
		// Forma expl�cita, utilizando (CAST) ocorrer� perca de informa��o, pois float n�o suporta todos os n�meros informados
		float b = (float)1.234525487; 
		System.out.println(b);
		
		// Forma expl�cita (CAST)
		int c = 4; 
		byte d = (byte) c;
		System.out.println(d);
		
		// Forma expl�cita (CAST)
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}
}
