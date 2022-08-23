package OO;

public class Cap6_Lab3_2 {
	
	public static void main(String[] args) {
		
		Aluno joao = new Aluno("João");
		System.out.println(joao.imprimeAluno());
		
		Aluno maria = new Aluno();
		maria.setNome("Maria");
		maria.contadorDeAlunos++;
		Aluno.contadorDeAlunos++;
		System.out.println(maria.imprimeAluno());
		
		System.out.println(joao.imprimeAluno());
		System.out.println(maria.imprimeAluno());
		
	}

}
