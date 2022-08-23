package OO;

public class Cap6_Lab3 {

	public static void main(String[] args) {
		
		Aluno joao = new Aluno();
		joao.setNome("João");
		Aluno.contadorDeAlunos++;
		System.out.println(joao.imprimeAluno());
		
		Aluno maria = new Aluno();
		maria.setNome("Maria");
		maria.contadorDeAlunos++;
		System.out.println(maria.imprimeAluno());
		
		Aluno marcos = new Aluno();
		marcos.setNome("Marcos");
		marcos.contadorDeAlunos++;
		System.out.println(marcos.imprimeAluno());
		
		System.out.println("valor estatico da classe: " +
		Aluno.contadorDeAlunos);
		
		System.out.println(joao.imprimeAluno());
		System.out.println(maria.imprimeAluno());
		System.out.println(marcos.imprimeAluno());
	}
}
