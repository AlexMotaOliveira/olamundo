package OO;

public class Calculadora {
	
	long numero;

	// somar , subtrair, dividir, multiplicar,

	// modificador de acesso
//	public
//	default
//	protected
//  private	
	protected long somar(long valor1, long valor2) {
		long resultado = valor1 + valor2;
		return resultado;
	}

	public long somar(long... lista) {
		long resultado = 0;
		
		for (long l : lista) {
			resultado += l;
			System.out.println("cada numero da lista: " + resultado);
		}
		return resultado;
	}

	public long subtrair(int valor1, int valor2) {
		return valor1 - valor2;
	}
	
	public double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}

	public double subtrair(double valor1, int valor2) {
		return valor1 - valor2;
	}
	
	public double subtrair(int valor1, double valor2) {
		return valor1 - valor2;
	}
	
	public double dividir(double valor1, double valor2) {
		return valor1 / valor2;
	}

	public long multiplicar(long valor1, long valor2) {
		return valor1 * valor2;
	}
	
	public long escolherNumero(long valorEscolhido, long... lista) {
		for (long N : lista) {
			if(N == valorEscolhido) {
				System.out.println("O valor é igual a: " + N);
				return N;
			}
		}
		return 0;
	}
}
