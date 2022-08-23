package carro;

public class Garagem {

	Carro carroPasseio = new Carro();
	Carro carroUtilitario;
	
	public String exibirGaragem() {
		return "Carro de Passeio: \n" + carroPasseio.exibirCarro() +
				"\n------------------------------------------- \n" +
				"Carro Utilitario: \n" + carroUtilitario.exibirCarro();
	}
}
