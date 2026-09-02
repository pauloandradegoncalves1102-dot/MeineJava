package exercicios;

import java.util.Scanner;

public class FinalExercise {
	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		double divisão = 1.8;
		double diferença = 32;
		System.out.println("Digite a temperatura em °C: ");
		double celsius = Entrada.nextDouble();
		double fahrenheit = (celsius * divisão) + diferença;
		System.out.println(fahrenheit);
		
		//inverso
		
		System.out.println("Digite a temperatura em °F: ");
		float F = (float) Entrada.nextDouble();
		float C = (float) ((F - diferença) / divisão);
		System.out.println(C);
		
		System.out.println("Digite seu peso: ");
		float peso = (float) Entrada.nextDouble();
		System.out.println("Digite sua altura");
		double altura = Entrada.nextDouble();
		double imc = peso/Math.pow(altura, 2);
		System.out.println(imc);
		

		
		if(imc < 18.5) {
			System.out.println("Baixo Peso");
			} else if(imc == 18.5 || imc <= 24.9) {
			System.out.println("Peso Normal");
			} else if(imc == 25 || imc <= 29.9) {
			System.out.println("Sobrepeso");
			} else if(imc == 30|| imc <= 34.9) {
			System.out.println("Obesidade Grau I");
			} else if(imc == 35 || imc <= 39.9) {
			System.out.println("Obesidade Grau II");
			}else if(imc >= 40) {
			System.out.println("Obesidade Grau III");}
		
	

		
		
		Entrada.close();
		
    }
}