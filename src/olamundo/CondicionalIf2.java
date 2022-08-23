package olamundo;

public class CondicionalIf2 {

	public static void main(String[] args) {

		int tempoObrigatorioDeTrabalho = 30;
		String sexo = "outros";

		int tempoDeTrabalho = 24;
		int idade = 55;


		if (sexo.equals("masculino")) {
			if (tempoDeTrabalho >= tempoObrigatorioDeTrabalho && idade >= 60) {
				System.out.println(sexo + " pode se aposentar");
			} else {
				System.out.println(
						sexo + " precisa trabalhar mais: " + (tempoObrigatorioDeTrabalho - tempoDeTrabalho) + " anos");
			}
		} else if (sexo.equals("feminino")) {
			if (tempoDeTrabalho >= tempoObrigatorioDeTrabalho - 5 && idade >= 60 - 5) {
				System.out.println(sexo + " pode se aposentar");
			} else {
				System.out.println(sexo + " precisa trabalhar mais: "
						+ (tempoObrigatorioDeTrabalho - 5 - tempoDeTrabalho) + " anos");
			}

		} else if (sexo.equals("nao_binario")) {
			if (tempoDeTrabalho >= tempoObrigatorioDeTrabalho - 2 && idade >= 60 - 2) {
				System.out.println(sexo + " pode se aposentar");
			} else {
				System.out.println(sexo + " precisa trabalhar mais: "
						+ (tempoObrigatorioDeTrabalho - 2 - tempoDeTrabalho) + " anos");
			}
		} else {

			if (tempoDeTrabalho >= tempoObrigatorioDeTrabalho - 1 && idade >= 60 - 1) {
				System.out.println(sexo + " pode se aposentar");
			} else {
				System.out.println(sexo + " precisa trabalhar mais: "
						+ (tempoObrigatorioDeTrabalho - 1 - tempoDeTrabalho) + " anos");
			}

		}

	}
}
