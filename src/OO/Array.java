package OO;

public class Array {
	
	int array; // atributo

	public static void main(String[] args) {
		
		int numero = 10;
		String palavra = "qualquer coisa";

		              //  0   1   2   3   4
		int array2[];
		array2 = new int[10]; 
					   
		String array3[] = {"João", "Maria", "Jose"};
		 
		String[] array4 = new String[10];
			
		int array5[] = new int[3];
		
		int[] array6;
		
		array6 = new int[] {1,2,3};
		
		array4[0] = "um nome qualquer";
		
		System.out.println(array3.length);
		System.out.println(array4.length);
		System.out.println(array5.length);
		
		int posicao = 0;
		
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
		
		for (String cadaElemento : array3) {
			System.out.println(cadaElemento);
		}
		
		for (int i = 0; i < array5.length; i++) {
			array5[i] = i; 
			System.out.println(array5[i]);
		}
	}
}
