package OO;

public class MaiorNumero {
	
	public static int maiorNumero(int[] numeros) {
		int maior = 1000;
		
		for (int i : numeros) {
			if(i >= maior) {
				maior = i;
				System.out.println("nova atribuição: " + maior);
			}
		}
		return maior;
	}

}
