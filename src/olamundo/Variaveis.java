package olamundo;

import OO.Calculadora;

public class Variaveis {
	
	static int variavelNaClasse = 10;
	
	public static void main(String[] args) {
		
	int numero = 10;
	
	System.out.println("numero vale: " + numero);
	
	numero = 20;
	 
	short numeroShort = (short) numero;
	
	System.out.println("numero vale: " + numero);
	
	numero = numero + 50;
	
	numero += 50;
	
	System.out.println("numero vale: " + numero);
	
	numero = 1;
	
	System.out.println("numero vale: " + numero);
	
	
	byte tipobyte = 120;
	
	long tipoLong = 1;
	
	tipobyte += (byte)tipoLong;	
	
	System.out.println(variavelNaClasse);
	
	Long tipoLongWrapper = (long) 10;
	 
	
	tipoLongWrapper.compareTo((long) 10);	
	
	boolean comparacao = tipoLongWrapper == 10;
	
	double divisao = 3.0 / 2.0;
	System.out.println("divisão: " + divisao);
	
	Double resto = 3.0 % 2.0;
	System.out.println("resto: " + resto);
	
	boolean eParOuImpar1 = 1 > 1;
	System.out.println("boolean : " + eParOuImpar1);
	boolean eParOuImpar2 = !(1 > 1);
	System.out.println("boolean : " + eParOuImpar2);
	
	System.out.println("tipobyte : " + tipobyte);
	System.out.println("tipoLong : " + tipoLong);
	boolean outraValidacao = !(tipobyte < 10) || tipoLong < 20; 
	int a = 10 , b = 20, c = 30, d = 50;
	long e;
	
	long f,g,h,i;
	
	e = 30;
	f = 2;
	
	System.out.println("boolean : " + outraValidacao);
	
	
	Calculadora calculadora = new Calculadora();
	calculadora.somar(10, 20);
	
	}

}
