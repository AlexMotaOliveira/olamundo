package Cap10;

public interface Eletrodomestico {
	
	void ligar();
	void desligar();
	
	static void ligarTudo(Eletrodomestico ...lista) {
		for (Eletrodomestico cadaEletrodomestico : lista) {
			cadaEletrodomestico.ligar();
		}
	}
	
	static void exibeAlgo(String algo) {
		System.out.println("exibindo " + algo);
	}
	
	
	default void adicionarTimer() {
		System.out.println("aguardar 10s para desligar");
		desligar();
	}
	
	//sobrecarga de metodo
	default void adicionarTimer(long tempo) {
		metodoPrivado(tempo);
		desligar();
	}
	
	private void metodoPrivado(long tempo) {
		System.out.println("aguardar " + tempo +"s para desligar");
	}
	
}
