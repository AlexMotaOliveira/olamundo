package cap5lab1;

public class Funcionario {
	
	String nome;  
	String sobrenome;
	String cargo;
	double salario;
	
	public String exibir() {
		
		return "Nome: " + nome +
			   "\n Sobrenome: " + sobrenome + 
			   "\n Cargo: " + cargo +
			   "\n Salario: " + salario;
	}
	 	
}
