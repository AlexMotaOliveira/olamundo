package OO;

public class ExecutarCalculadora extends  Classe{

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
	
		System.out.println("A soma �: " +
				calculadora.somar(10, 20));
		
		System.out.println("A subtra��o �: " +
				calculadora.subtrair(10, 20));
		
		System.out.println("A subtra��o �: " +
				calculadora.subtrair(10.0, 20.0));
		
		System.out.println("A subtra��o �: " +
				calculadora.subtrair(10, 20.0));
		
		System.out.println("A subtra��o �: " +
				calculadora.subtrair(10.0, 20));
		
		System.out.println("A divis�o �: " +
				calculadora.dividir(10, 3));
		
		System.out.println("A multiplica��o �: " +
				calculadora.multiplicar(10, 3));
		
		long valorEscolhido = 10;
		System.out.println("A lista contem o numero: " 
		+ valorEscolhido + " : "  +
				calculadora
				.escolherNumero(10,0,1,2,3,4,5,7,8,9,10,6));
	} 
}
