package Cap9Lab1;

public final class Aluno extends Pessoa {

	
	private float mensalidade;
	private String curso;
	
	public Aluno(String nome, int idade, char sexo, RG rg, float mensalidade, String curso) {
		super(nome, idade, sexo, rg);
		this.mensalidade = mensalidade;
		this.curso = curso;
	}
	
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	public void outroMetodoDoPai(Pessoa pessoa, String string) {
		System.out.println("Classe Aluno" + pessoa);
	}

	@Override
	public String falar(String fala) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		
	}
	
}
