package cap15;

import java.util.HashMap;

public class Cap15_Lab1 {

    public static void main(String[] args) {

        HashMap<String, Integer>  pessoaMap = new HashMap<>();

        pessoaMap.put("Alex", 18);
        pessoaMap.put("Maria", 25);
        pessoaMap.put("João", 40);
        pessoaMap.put("Jose", 60);

        System.out.println("-- Pessoa --");
        System.out.println("Alex : " + pessoaMap.get("Alex"));
        System.out.println("Maria : " + pessoaMap.get("Maria"));
        System.out.println("João : " + pessoaMap.get("João"));
        System.out.println("Jose : " + pessoaMap.get("Jose"));

        System.out.println();

        pessoaMap.put("Jose", 100);


        pessoaMap.forEach((nome, idade) ->
                System.out.println(nome + " : " + idade));
    }
}
