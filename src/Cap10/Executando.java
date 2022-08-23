package Cap10;


public class Executando {

	public static void main(String[] args) {

		Eletrodomestico aparelho;
		
		aparelho = new Geladeira();
		aparelho.ligar();
		aparelho.desligar();
		
		System.out.println("****************");
		
		aparelho = new Microondas();
		aparelho.ligar();
		aparelho.desligar();
		
		System.out.println("****************");
		// cast de um primitivo
		long valor = 10;
		int valorInt = (int) valor;
		
		// cast de um objeto
		((Microondas) aparelho).aquecer();
		((Microondas) aparelho).assar();
		
//		Microondas microondas = (Microondas) aparelho;
//		microondas.ligar();
//		microondas.desligar();
//		microondas.aquecer();
//		
//		System.out.println("****************");
//		
//		Geladeira geladeira = (Geladeira)aparelho;
//		geladeira.ligar();
//		geladeira.desligar();
//		geladeira.descongelar();
//		
//		System.out.println("****************");
//		
//		Televisao televisao = (Televisao)aparelho;
//		televisao.ligar();
//		televisao.desligar();
//		televisao.trocarCanal();
		
		Eletrodomestico microondas1, geladeira1, televisao1;
		
		microondas1 = new Microondas();
		geladeira1 = new Geladeira();
		televisao1 = new Televisao();
		
		System.out.println("*******Metodo estatico*********");
		Eletrodomestico.ligarTudo(microondas1,geladeira1,televisao1);
		Eletrodomestico.exibeAlgo("algo para exibir");
		
		microondas1.adicionarTimer();
		geladeira1.adicionarTimer();
		televisao1.adicionarTimer();
		
		System.out.println("*******Metodo default com um private****");
		televisao1.adicionarTimer(30);
	}

}
