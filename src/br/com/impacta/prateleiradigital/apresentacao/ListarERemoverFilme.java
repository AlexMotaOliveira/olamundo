package br.com.impacta.prateleiradigital.apresentacao;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import br.com.impacta.prateleiradigital.controle.FilmeControlador;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class ListarERemoverFilme {

    public static void main(String[] args) {

        try {


            Scanner scanner = new Scanner(System.in);

            System.out.println("*** Remover um Filme ***");
            System.out.println("*** Insira um genero ***");
            String genero = scanner.nextLine();

            System.out.println("*** Insira um titulo parcial ***");
            String tituloParcial = scanner.nextLine();

            System.out.println("*** Insira o ano inicial ***");
            int anoInicial = scanner.nextInt();

            System.out.println("*** Insira o ano final ***");
            int anoFinal = scanner.nextInt();


            List<Filme> listaFilme =
                    new FilmeControlador().consultarFilmes(
                            tituloParcial,
                            genero,
                            anoInicial,
                            anoFinal);

            int count = 0;
            for (Filme cadaFilme: listaFilme) {
                System.out.println("index: " + count);
                System.out.println(cadaFilme);
                count++;
            }


            for (int i = 0; i < listaFilme.size(); i++) {
                System.out.println("index: " + i);
                System.out.println(listaFilme.get(i));
            }

            System.out.println("*** Para excluir um filme insira o id ***");
            int index = scanner.nextInt();

            // excluir o filme informado
            new FilmeControlador().remover(listaFilme.get(index));
            listaFilme.clear();
            listaFilme =
                    new FilmeControlador().consultarFilmes(
                            tituloParcial,
                            genero,
                            anoInicial,
                            anoFinal);

            for (Filme cadaFilme: listaFilme) {
                System.out.println("id Filme: " + cadaFilme.getIdFilme());
                System.out.println(cadaFilme);
            }


        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }

}
