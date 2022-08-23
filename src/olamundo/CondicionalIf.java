package olamundo;

public class CondicionalIf {

	public static void main(String[] args) {

		int tempoObrigatorioDeTrabalho = 30;
		String sexo = "feminino";

		int tempoDeTrabalho = 24;
		int idade = 55;

		if(sexo.equals("masculino")) {
			if(tempoDeTrabalho >= tempoObrigatorioDeTrabalho && idade >= 60) {
				System.out.println(sexo + " pode se aposentar");
			}else {
				System.out.println(sexo + 
						" precisa trabalhar mais: " 
				+ (tempoObrigatorioDeTrabalho - tempoDeTrabalho) + " anos");
			}
			
		}else {
			if(tempoDeTrabalho >= tempoObrigatorioDeTrabalho - 5 && idade >= 60 -5) {
				System.out.println(sexo + " pode se aposentar");
			}else {
				System.out.println(sexo + 
						" precisa trabalhar mais: " 
				+ (tempoObrigatorioDeTrabalho - 5 - tempoDeTrabalho) + " anos");
			}
		}	
	}
}
