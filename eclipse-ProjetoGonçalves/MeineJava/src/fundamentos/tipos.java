package fundamentos;

public class tipos { 
	public static void main(String[] args) {
		// Informações do funcionário
		
		// tipos numéricos inteiros
		
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos Numericos Reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		
		boolean estaDeFerias = false;
		boolean naoEstaDeFerias = true;
		
		//tipo caractere
		
		char status = 'A'; //ativo
		
		//dias de empresa
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numerosDeVoos / 2); // Numero de viagens
		System.out.println(pontosAcumulados / vendasAcumuladas ); //pontos por real
		
		System.out.println(id +": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
	}

}
