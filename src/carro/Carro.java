package carro;

public class Carro {


	String modelo;
	double potenciaDoMotor;
	String cor;
	
	public String exibirCarro() {
		return "Modelo: " + modelo +
			   "\n Potencia do Motor: " + potenciaDoMotor +
			   "\n Cor : " + cor;	
	}

}
