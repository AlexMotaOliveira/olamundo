package Cap10;

public class Geladeira implements Eletrodomestico {

	private String freezer;
	
	//sobreescrita de metodo
	public void ligar() {
		System.out.println("ligando geladeira");
	}

	public void desligar() {
		System.out.println("desligando geladeira");
	}
	
	public void descongelar() {
		System.out.println("decongelando o frango");
	}

}
