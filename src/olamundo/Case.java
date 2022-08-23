package olamundo;

public class Case {

	public static void main(String[] args) {
		
	
		String sexo2 = "masculino";
		
		switch (sexo2) {
		case "masculino": 
			System.out.println("masculino");
			break;
		case "feminino": 	
			System.out.println("feminino");
			break;
		case "nao_binario": 	
			System.out.println("nao_binario");
			break;
		default:
			System.out.println("default");
			
		}
	}
}
