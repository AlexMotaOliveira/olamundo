package Cap10;

public class Televisao implements Eletrodomestico {

	@Override
	public void ligar() {
		System.out.println("ligando televis�o");
		
	}

	@Override
	public void desligar() {
		System.out.println("desligando televis�o");
		
	}
	
	public void trocarCanal() {
		System.out.println("trocando de canal");
	}

}
