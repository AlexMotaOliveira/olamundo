package olamundo;

public class Cap4Laboratorio2_1 {
	
	public static void main(String[] args) {
		
		int numero = 10;
		int contador = 0;
		
		for (int divisor = 1; divisor <= numero || divisor == 1; divisor++) {
			System.out.println( 
					numero + " % " + divisor + "= " + numero % divisor );

			if(numero % divisor == 0) {
				contador = contador + 1;
			}
		}
		
		
		if(contador > 2 || numero < 2) {
			System.out.println(numero + " : não é primo");
		}else {
			System.out.println(numero + " :  é primo");
		}
		System.out.println("Contador: " + contador++);
	}
}
