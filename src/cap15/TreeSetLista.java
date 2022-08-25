package cap15;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLista {

    public static void main(String[] args) {


        Set<String> treeSetLista = new TreeSet<>();

        treeSetLista.add("Maria");
        treeSetLista.add("Alex");
        treeSetLista.add("João");

        for (String cadaElemento : treeSetLista) {
            System.out.println(cadaElemento);
        }

        Set<Integer> treeSetListaMegaSena = new TreeSet<>();

        treeSetListaMegaSena.add(05);
        treeSetListaMegaSena.add(60);
        treeSetListaMegaSena.add(34);
        treeSetListaMegaSena.add(28);
        treeSetListaMegaSena.add(19);
        treeSetListaMegaSena.add(03);
        treeSetListaMegaSena.add(03);
        treeSetListaMegaSena.add(03);
        System.out.println();

        for (Integer variavel : treeSetListaMegaSena) {
            System.out.print(variavel + " ");
        }

        treeSetListaMegaSena.clear();
        System.out.println("apaguei a lista da megasena");
        Random random = new Random();

        while (treeSetListaMegaSena.size() < 6) {
            int numeroSorteado = random.nextInt(60) + 1; // 0 até 59 + 1
            treeSetListaMegaSena.add(numeroSorteado);
            System.out.println("mais uma vez: " + numeroSorteado );
        }

        treeSetListaMegaSena
                .forEach(cadaElementoDaLista ->
                    System.out.print(cadaElementoDaLista + " "));

        System.out.println();
        treeSetListaMegaSena
                .stream()
                .filter(integer -> integer <= 0)
                .findFirst()
                .ifPresent(integer -> System.out.println(integer));



    }
}
