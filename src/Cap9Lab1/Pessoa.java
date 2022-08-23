package Cap9Lab1;

public abstract class Pessoa {

	final String umValor = "Um valor qualquer";
	private String nome;
	private int idade;
	private char sexo;
	private RG rg;
	
	public Pessoa(String nome, int idade, char sexo, RG rg) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.rg = rg;
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public char getSexo() {
		return sexo;
	}

	public RG getRg() {
		return rg;
	}

	
	public void outroMetodoDoPai() {
		
	}
	
	public void outroMetodoDoPai(Pessoa pessoa) {
		
	}
	
	
	public abstract String falar(String fala);
	
	public abstract void mostrarDados();
	
	public void getPessoa(Pessoa pessoa) {
		System.out.println(pessoa);
	}
	
	
	public String getUmValor() {
		return umValor;
	}
	
	

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", rg=" + rg + "]";
	}
	
	
}
