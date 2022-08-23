package Cap10;

public class Televisao implements Eletrodomestico {

	@Override
	public void ligar() {
		System.out.println("ligando televisão");
		
	}

	@Override
	public void desligar() {
		System.out.println("desligando televisão");
		
	}
	
	public void trocarCanal() {
		System.out.println("trocando de canal");
	}

}
