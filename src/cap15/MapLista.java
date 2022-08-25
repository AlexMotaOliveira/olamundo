package cap15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapLista {

    public static void main(String[] args) {
        //chave , valor
        Map<Long, String> mapLista = new TreeMap<>();

        //mapLista.put("chave","valor");
        mapLista.put(26512485933L, "Alex");
        mapLista.put(12586532589L, "Alan");
        mapLista.put(21547853259L, "João");
        mapLista.put(36587452589L, "Maria");
        mapLista.put(23454687625L, "Fernando");

        HashMap<String, Integer> pessoaMap = new HashMap<>();

        String nome = mapLista.get(23454687625L);
        System.out.println(nome);

        mapLista.put(23454687625L, "Daiane");

        nome = mapLista.get(23454687625L);
        System.out.println(nome);

        Map<String, Carro> mapListaCarro = new TreeMap<>();
        Carro carro1 =
                new Carro("Uno", "vermelho", "Fiat");

        mapListaCarro.put("PLJ2365", carro1);

        mapListaCarro
                .put("KJU1236",
                        new Carro("Gol",
                                "branco",
                                "Volkswagen"));

        System.out.println(mapListaCarro.get("PLJ2365"));


        mapListaCarro.entrySet().forEach(
                stringCarroEntry -> System.out.println(stringCarroEntry));



    }
}
