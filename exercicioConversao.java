package exercicios;

import javax.swing.JOptionPane;

public class exercicioConversao {
	public static void main(String[] args) {
		
		String Salario1 = JOptionPane.showInputDialog("Digite o primeiro salário: ");
		Salario1.replace(",", ".");
		
		String Salario2 = JOptionPane.showInputDialog("Digite o segundo salário: ");
		Salario2.replace(",", ".");
		
		double one = Double.parseDouble(Salario1);
		double two = Double.parseDouble(Salario2);
		
		double media = one + two /2;
		
		System.out.println("A média é: " + media);
	}
}
