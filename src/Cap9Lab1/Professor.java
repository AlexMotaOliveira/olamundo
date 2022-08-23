package Cap9Lab1;

public class Professor extends Pessoa{
	
	private float salario;
	private String disciplina;
	
	public Professor(String nome, 
			int idade, 
			char sexo, 
			RG rg, 
			float salario, 
			String disciplina) {
		super(nome, idade, sexo, rg);
		
		this.salario = salario;
		this.disciplina = disciplina;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String falar(String fala) {
		return getNome() + " : " + fala;
	}

	@Override
	public void mostrarDados() {	
		System.out.println("Professor " + 
							"[salario=" + salario + 
							", disciplina=" + disciplina + ", " + 
							"nome=" + getNome() + ", " + 
							"idade=" + getIdade() + 
							", sexo=" + getSexo() + ", " + 
							"rg=" + getRg() + "]");
	}

}
