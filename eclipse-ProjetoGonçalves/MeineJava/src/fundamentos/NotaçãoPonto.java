package fundamentos;

public class NotaçãoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase(); // deixar tudo maiúsuculo
		s = s.concat("!!!"); // adicona texto
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase()); 
		// é possivel ou armazenar numa variavel
		
		String x = "Leo".toUpperCase();
		System.out.println(x); // outra forma de fazer
		
		String y = "Bom dia X"
				.replace("X", "Guilherme")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
		
		
	}

}
