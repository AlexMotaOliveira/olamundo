package olamundo;

public class Laboratorio2 {
	
	public static void main(String[] args) {
		
		int valor = 9;
		System.out.println(valor % 2);
		boolean condicao = valor % 2 == 0;
		System.out.println(condicao);
		String resultado = condicao  ? "Par" : "Impar";
		System.out.println(resultado);
		
		System.out.println(valor % 2 == 0 ? "Par" : "Impar");
	}

}
