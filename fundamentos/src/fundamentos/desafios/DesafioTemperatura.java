package fundamentos.desafios;

public class DesafioTemperatura {
	public static void main(String[] args) {
		//(°F - 32) * 5/9 = °C
		final double DIVISAO = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * DIVISAO;
		System.out.println("Resultado: " + celsius + "°C.");
		
		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * DIVISAO;
		System.out.println("Resultado: " + celsius + "°C.");
	}
}
