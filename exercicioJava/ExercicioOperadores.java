package exercicios;

public class ExercicioOperadores {
	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); //math.pw = elevar a potência
		double c = Math.pow(a, 3);
		

		System.out.println(b);
		System.out.println(c);
		
		//próximo exercício:
		
		// ((6 *(3+2))]² / 3 * 2) - ((1-5) * (2 - 7)² / 2)³ / 10³
		// -> (150 - 100)³ / 10³ --> 50³ / 10³ --> 125
		
		int six = 6;
		int tree = 3;
		int two = 2;
		int one = 1;
		int five = 5;
		int seven = 7;
		int ten = 10;
		
		double result = six * (tree + two);
		result = Math.pow(result, 2) / (tree * two);
		
		double secondResult = (one - five) * (two - seven) / 2;
		secondResult = Math.pow(secondResult, 2); 
		
		double thirdResult = result - secondResult;
		
		double fourthResult = Math.pow(thirdResult, 3);
		fourthResult = fourthResult / Math.pow(ten, 3);
				
		System.out.println(result);
		System.out.println(secondResult);
		System.out.println(thirdResult);
		System.out.println(fourthResult);
		
		
	}
}
