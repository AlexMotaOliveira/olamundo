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

	@Override
	public String toString() {
		return "Carro{" +
				"modelo='" + modelo + '\'' +
				", potenciaDoMotor=" + potenciaDoMotor +
				", cor='" + cor + '\'' +
				'}';
	}
}
