package cap15;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExemploStream {

    public static void main(String[] args) {

        List<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario(1020, "Alex", "Professor", 1000.00));
        lista.add(new Funcionario(1021, "Maria", "Professor", 10000.00));
        lista.add(new Funcionario(1022, "João", "Analista", 500.00));
        lista.add(new Funcionario(1023, "Jose", "Desenvolvedor", 3256.00));
        lista.add(new Funcionario(1024, "Afonso", "Desenvolvedor", 1259.00));
        lista.add(new Funcionario(1025, "Alan", "Desenvolvedor", 4000.00));
        lista.add(new Funcionario(1026, "Daiane", "Analista", 7000.00));
        lista.add(new Funcionario(1027, "Fabio", "Coordenador", 3000.00));
        lista.add(new Funcionario(1028, "Daiane", "Analista", 2000.00));
        lista.add(new Funcionario(1029, "Juan", "Vendedor", 8000.00));
        lista.add(new Funcionario(1030, "Artur", "Desenvolvedor", 15000.00));

        lista.forEach(funcionario -> System.out.println(funcionario));

        List novaLista = lista
                .stream()
                .filter(funcionario ->
                        funcionario.getCargo().equals("Vendedor")).collect(Collectors.toList());

        System.out.println("______filtro da lisya por cargo e ondenada por nome_________");
        lista
                .stream()
                .filter(funcionario ->
                        funcionario.getCargo().equals("Desenvolvedor"))
                .sorted((f1, f2) -> f1.getNome().compareTo(f2.getNome()))
                .skip(1)
                .limit(3)
                .forEach(funcionario ->
                        System.out.println(funcionario)
                );

        System.out.println("______filtro da lista por salario_________");

        lista.stream()
                .filter(funcionario -> funcionario.getSalario() > 5000)
                .forEach(funcionario -> System.out.println(funcionario));

        System.out.println("______tamanho da lista com count_________");

        long tamanhoLista= lista.stream()
                .filter(funcionario -> funcionario.getSalario() > 5000)
                        .count();

        System.out.println(tamanhoLista);

        System.out.println("______funcionario com menor salario_________");

        System.out.println(lista.stream()
                .min((o1, o2) -> o1.getSalario().compareTo(o2.getSalario()))
                .get().getSalario());

        System.out.println("______funcionario com maior salario_________");

        System.out.println(lista.stream()
                .max((o1, o2) -> o1.getSalario().compareTo(o2.getSalario()))
                .get().getSalario());

        Optional<Funcionario> funcionario = null;

        funcionario.ifPresent(f -> f.setCargo("Desenvolvedor"));

        if (funcionario == null){
            funcionario = Optional.of(new Funcionario());
        }

        System.out.println();
    }
}
