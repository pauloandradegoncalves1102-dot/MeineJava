package fundamentos;

import java.util.Scanner;

public class operadoresRelacionais {
	public static void main(String[] args) {
		
		Scanner sacan = new Scanner(System.in);
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 != 7);
		
		System.out.println("Digite a nota: ");
		double nota = sacan.nextDouble();
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7 ;
		
		if(passouPorMedia) {
			System.out.println("Aprovado");
		} else { System.out.println("Reprovado");
		
	}
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		System.out.println("Tem desconto? " + temDesconto);
		
		
	sacan.close();
	}
	

}
