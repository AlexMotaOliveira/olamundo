package carro;

public class cap5lab2 {
	
	public static void main(String[] args) {

		Garagem garagem = new Garagem();
	
		garagem.carroPasseio.modelo = "VW Jetta"; 
		garagem.carroPasseio.potenciaDoMotor = 2.3;
		garagem.carroPasseio.cor = "vermelho";
		
		garagem.carroUtilitario = new Carro();
		garagem.carroUtilitario.modelo = "Renault"; 
		garagem.carroUtilitario.potenciaDoMotor = 3.8;
		garagem.carroUtilitario.cor = "branco";
		
		System.out.println(garagem.exibirGaragem());
		
		System.out.println("**********************");
		System.out.println(garagem.carroPasseio.exibirCarro());
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(garagem.carroUtilitario.exibirCarro());
			
	}

}
