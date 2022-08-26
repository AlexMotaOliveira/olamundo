package cap15;

import java.util.ArrayList;

public class Cap15_Lab2 {

    public static void main(String[] args) {

        ArrayList<Estudante> estudanteArrayList = new ArrayList<>();
        // adicionando na lista e instanciando o objeto
        estudanteArrayList.add(new
              Estudante(
                "Joana", 8.5, 8.5));

        // instanciando o objeto e depois inserindo na lista
        Estudante estudante2 = new Estudante("Antônio", 6.0, 9.0);
        estudanteArrayList.add(estudante2);

        estudanteArrayList.add(new Estudante("Mariana", 7.5, 9.0));
        estudanteArrayList.add(new Estudante("Ricardo", 7.0, 6.0));
        estudanteArrayList.add(new Estudante("Gustavo", 9.0, 10.0));

        estudanteArrayList.forEach(qualquerNome ->
                qualquerNome.setMedia(
                        (qualquerNome.getNotaMatematica() +
                                qualquerNome.getNotaPortugues()) / 2)
                );

        estudanteArrayList.forEach(e ->
                        System.out.println(e.getNome() +
                                " media: " + e.getMedia())
                );
    }
}
