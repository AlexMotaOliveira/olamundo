package OO;

public class Aluno {

	private String nome;
	public static int contadorDeAlunos;
	
	
	public Aluno() {
	}
	
	public Aluno(String nome) {
		this.nome = nome;
		contadorDeAlunos++;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String imprimeAluno() {
		return "nome: " + nome + 
				"\nContador de alunos: " + contadorDeAlunos;
	}

}
