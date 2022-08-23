package OO;

public class ExecutarCalculadora extends  Classe{

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
	
		System.out.println("A soma é: " +
				calculadora.somar(10, 20));
		
		System.out.println("A subtração é: " +
				calculadora.subtrair(10, 20));
		
		System.out.println("A subtração é: " +
				calculadora.subtrair(10.0, 20.0));
		
		System.out.println("A subtração é: " +
				calculadora.subtrair(10, 20.0));
		
		System.out.println("A subtração é: " +
				calculadora.subtrair(10.0, 20));
		
		System.out.println("A divisão é: " +
				calculadora.dividir(10, 3));
		
		System.out.println("A multiplicação é: " +
				calculadora.multiplicar(10, 3));
		
		long valorEscolhido = 10;
		System.out.println("A lista contem o numero: " 
		+ valorEscolhido + " : "  +
				calculadora
				.escolherNumero(10,0,1,2,3,4,5,7,8,9,10,6));
	} 
}
