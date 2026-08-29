package complete;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {

	
	// tipos primitivos
	//byte => 8 bits => -128 a 127
    //short => 16 bits => -2.147.483.648 a 2.147.483.647
	// int => 32 bites (numero enorme)
	// long => numero maior ainda
	
	  // float => 32 bits => precisao simples
	 //double => 64 bits => precisao dupla
    // string - palavras ou frases
   //char - um univo caractere
	
 //	boolean - true ou false
	
	String str = "Fernanda";
	boolean bool = false;
	
   if(str.isBlank()) {
		System.out.println("Verdadeiro");
	} else if (str == "Fernanda") {
		System.out.println("Fernanda");
	}
   else {
		System.out.println("Falso");
	}
  
 //vetor 
   
   int[] meusNumeros = new int[20];
   int colecaoDeInteiros[] = {1, 2, 3, 4, 5};
   System.out.println(colecaoDeInteiros[0]);
   System.out.println(colecaoDeInteiros.length);
   System.out.println(meusNumeros[1]);
   
   //arrayList
   
   String[] nomesArr = new String[10];
   nomesArr[0] = "Fernanda";
   nomesArr[1] = "teste";
   
   ArrayList<String> nomes = new ArrayList<>();
   nomes.add("Fernanda");
   nomes.add("Leo");
   nomes.add("Joao");
   nomes.add("Maria");
   
//   System.out.println(nomes.get(0));
//   nomes.remove(0);
//   System.out.println(nomes.get(0));
//   
   //loops 
   for(int meuIterador = 0; meuIterador < nomesArr.length; meuIterador++) {
	   System.out.println(nomesArr[meuIterador]);
	   
	   for (String nome : nomes) {
		   System.out.println(nome);
	   }
	   
	int contador = 0;
	while (contador < 0) {
		System.out.println("Estou no while");
		contador++;
		}
	
	//casting
	
	double resultado = 0.0;
	int resultadoInt = (int) resultado;
	
	int meuInt = 10;
	double meuDouble = meuInt;
	
	String meuString = "10";
	int meuInt2 = Integer.parseInt(meuString);
	
	String minhaString = String.valueOf(meuInt2);
	
	
     }
	
  }
	
}

class carro {
	
	String modelo;
	
	public carro(String modelo) {
		this.modelo = modelo;
	};
}