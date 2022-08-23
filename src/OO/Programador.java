package OO;

public class Programador extends Funcionario{
	
	String linguagem;
	String sistemaOperacional;
	
	public Programador(String email, int idade, char sexo, String linguagem, String sistemaOperacional) {
		super( email, idade, sexo);
		this.linguagem = linguagem;
		this.sistemaOperacional = sistemaOperacional;
	}


	@Override
	public String toString() {
		return "Programador [linguagem=" + linguagem + ", sistemaOperacional=" + sistemaOperacional + ", email=" + email
				+ ", idade=" + idade + ", sexo=" + sexo +  ", Nome=" + super.getNome() + "]";
	}
	
}
