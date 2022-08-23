package OO;

public class Funcionario {
	
	private String nome;
	String email;
	int idade;
	char sexo;
	
	public Funcionario( String email, int idade, char sexo) {
		this.email = email;
		this.idade = idade;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", email=" + email + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	public String getNome() {
		return nome;
	}

	
}
