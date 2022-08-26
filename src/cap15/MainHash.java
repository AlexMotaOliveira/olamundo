package cap15;

public class MainHash {

    public static void main(String[] args) {

        Funcionario funcionario1 =
          new Funcionario(1020, "Alex",
                  "Professor", 1000.00);
        System.out.println(funcionario1);

        Funcionario funcionario2 =
          new Funcionario(1020, "Daiane",
                  "Professor", 1000.00);
        System.out.println(funcionario2);

        System.out.println(funcionario1 == funcionario2);
        System.out.println(funcionario1.equals(funcionario2));

        System.out.println(funcionario1.getNome()
                .equals(funcionario2.getNome()));

        System.out.println(funcionario1.getMatricula()
                .equals(funcionario2.getMatricula()));

    }
}
