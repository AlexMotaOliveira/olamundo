package cap5lab1;

public class cap5lab1 {

	public static void main(String[] args) {


		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "João";
		funcionario1.sobrenome = "da Silva";
		funcionario1.cargo = "Desenvolvedor Java";
		funcionario1.salario = 19_000.99;

		System.out.println(funcionario1 + "\n " + funcionario1.exibir());

		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome = "Alex";
		funcionario2.sobrenome = "da Silva";
		funcionario2.cargo = "Desenvolvedor Java";
		funcionario2.salario = 18_000.99;

		System.out.println(funcionario2 + "\n " + funcionario2.exibir());
	}
}
