package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado"; // ? e : é como se fosse o IF e ELSE
		String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;
		System.out.println("O aluno está " + resultadoFinal);
		
		//Outra maneira
		double media2 = 4.6;
		String resultadoFinal2 = media2 >= 7.0 ? "aprovado" : media2 >= 5.0 ? "em recuperação" : "reprovado";
		System.out.println("O aluno está " + resultadoFinal2);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.println("Tem desconto? " + resultado);
	}
}
