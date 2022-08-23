package Cap10;

public class Microondas implements Eletrodomestico {

	@Override
	public void ligar() {
		System.out.println("ligando microondas");

	}

	@Override
	public void desligar() {
		System.out.println("desligando microondas");
	}

	public void aquecer() {
		System.out.println("aquecendo o frango");
	}

	public void assar() {
		System.out.println("assando o frango");
	}

}
