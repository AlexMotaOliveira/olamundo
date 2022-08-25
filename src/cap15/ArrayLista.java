package cap15;

import carro.Carro;

import java.util.ArrayList;
import java.util.List;

public class ArrayLista {

    public static void main(String[] args) {

        // forma mais basica de lista
        // sempre tem as 10 posi��es que foi criado
        int[] array = new int[10];
        array[1] = 5;
        System.out.println("array tem : " + array.length);
        System.out.println("array na posi��o 1 : " + array[1]);

        array = new int[10];

        System.out.println("array na posi��o 1 : " + array[1]);

        List<String> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(100);

        list.add("Alex");  // 0
        list.add("Jo�o");  // 1
        list.add("Maria"); // 2
        list.add("Jose");  // 3


        System.out.println("list na posi��o 3 : " + list.get(3));
        System.out.println("list tem : " + list.size());
        System.out.println("list2 tem : " + list2.size());

        System.out.println("list na posi��o 2 : " + list.get(2));
        list.add(2, "Joana");
        System.out.println("list na posi��o 2 : " + list.get(2));

        list.contains("Alex"); // true ou false


        System.out.println("list tem : " + list.size());
        list.remove("Jose");


        for (Object cadaValor: list) {
            System.out.println(cadaValor);
        }

        System.out.println(list.isEmpty());
        List novaLista = list.subList(0,2);
        System.out.println(novaLista);



        list.clear();
    }
}
