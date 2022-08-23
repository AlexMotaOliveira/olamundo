package OO;

public class Cadastro {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	public Cadastro() {
		
	}
	
	public Cadastro(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Cadastro(String nome, String sobrenome, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	public void mostrar() {
		System.out.println(
				" nome: " + nome +
				"\n sobrenome: " + sobrenome );
	}
}
