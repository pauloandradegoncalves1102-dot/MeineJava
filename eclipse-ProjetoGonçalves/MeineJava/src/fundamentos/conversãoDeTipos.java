package fundamentos;

public class conversãoDeTipos {
	
	 public static void main(String[] args) {
		
		 double a = 1; // conversão implicita
		 System.out.println(a);
		 
		 float b = 1.0F; // float b = (Float) 1.0; - explicita
		 System.out.println(b);
		 
		 int c = 4;
		 byte d =(byte) c;
		 System.out.println(d);
		 
		 double e = 1;
		 int f = (int) e;
		 System.out.println(f);
		 
		 
	}
}
