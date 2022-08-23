package olamundo;

public class OlaMundo {

	public static void main(String[] args) {
		
		// comentario de linha
		
		/*
		 * comentario de bloco 
		 */
	
		byte variavelDeByte = 1;
		short variavelDeShort = 1236;
		int varivelDeInteiro = 0;
		long variavelDelong = 1_000_000_000L;
		char variavelDeLetra = 97;
		boolean variavelDeBoolean = false; // true ou false
		float variavelDeFloat = 1236.00f;
		double variavelDeDouble = 12.00;
		
		//varivelDeInteiro = varivelDeInteiro / 10;
		
		varivelDeInteiro /= 10;
		
		
		String cpf = "33633985896";
		
		long somaDeDuasVariaveis = variavelDeByte + variavelDelong;
		
		boolean valicao = 1 == 1;
		
		
		System.out.println("Ola mundo, este é o meu primeiro programa");
		System.out.print("Outra linha \n");
		System.out.println("Mais alguma informação");
		System.out.println(variavelDeByte);
		System.out.println(variavelDeShort);
		System.out.println(varivelDeInteiro);
		System.out.println(variavelDelong);
		System.out.println(variavelDeLetra);
		System.out.println(variavelDeBoolean);
		System.out.println(variavelDeFloat);
		System.out.println(variavelDeDouble);
		System.out.println(cpf);
		
		System.out.println(variavelDeByte + variavelDeShort);
		System.out.println(cpf + somaDeDuasVariaveis);
		System.out.println(somaDeDuasVariaveis);
		System.out.println(cpf + cpf);
		
		/*
		 * + 
		 * -
		 * *
		 * /
		 * ^
		 * % 
		 * >
		 * <
		 * ==
		 */
		
	}

}
