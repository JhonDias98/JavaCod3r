package fundamentos.primitivosClasses;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1); //False
		System.out.println("2".equals(s1)); //Equals compara s� o conte�do
		
		Scanner sc = new Scanner(System.in);
		
		String s2 = sc.nextLine(); //next() n�o considera os espa�os em branco, j� o nextLine() sim
		System.out.println("2" == s2.trim()); //Tira os espa�os em branco
		System.out.println("2".equals(s2.trim()));
		
		sc.close();
	}
}
