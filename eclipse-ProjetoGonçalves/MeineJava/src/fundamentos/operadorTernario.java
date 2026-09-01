package fundamentos;

import java.util.Scanner;

public class operadorTernario {
	public static void main(String[] args) {
		
		double media = 8.6;
		String resultadoFinal = media >= 7.0 ? 
				"aprovado" : "em recuperação";
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouporMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouporMedia;
		String resultado = temDesconto ? "sim" : "nao";
		System.out.printf("Tem desconto? %s", resultado);
		
		Scanner entrada = new Scanner(System.in);
		
		String S = new String("2");
		System.out.println("2" == S);
		System.out.println("2".equals(S));
		
		String S1 = entrada.nextLine();
		System.out.println("2" == S1.trim());
		System.out.println("2".equals(S1.trim()));
		
		entrada.close();
	}
}
