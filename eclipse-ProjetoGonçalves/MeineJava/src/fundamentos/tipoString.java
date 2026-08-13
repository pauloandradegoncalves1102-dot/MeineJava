package fundamentos;

public class tipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!")); // ou
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salário = 12345.987;
		
		System.out.println(
				"Nome: "+ nome + 
				"\nSobrenome: " + sobrenome);
		
		System.out.printf("\nO senhor %s %s tem %d anos e ganha "
				+ "RS%.2f ", nome, sobrenome, idade, salário);
		
		String Frase = String.format("\nO senhor %s %s tem %d anos e "
				+ "ganha RS%.2f +\n\n", nome, sobrenome, idade, salário); // funciona da mesma forma acima 
		
		// ou tambem
		
		String maisUmaFrase = "\nNome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade + 
				"\nsalario: " + salário + "\n\n";
		
		System.out.println(maisUmaFrase);
	}
}
