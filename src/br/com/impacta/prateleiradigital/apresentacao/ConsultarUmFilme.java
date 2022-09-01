package br.com.impacta.prateleiradigital.apresentacao;

import br.com.impacta.prateleiradigital.controle.FilmeControlador;
import br.com.impacta.prateleiradigital.negocio.Filme;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ConsultarUmFilme {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Consultar um Filme ***");

        System.out.println("*** Insira um genero ***");
        String genero = scanner.nextLine();

        System.out.println("*** Insira o ano ***");
        String ano = scanner.nextLine();

        System.out.println("*** Insira um titulo parcial ***");
        String tituloParcial = scanner.nextLine();

        try {

            int anoConvertido = Integer.parseInt(ano);

            FilmeControlador filmeControlador = new FilmeControlador();
            List<Filme> filmeLista =
                    filmeControlador
                            .consultarFilmes(genero,
                                                anoConvertido,
                                                tituloParcial);

            if (filmeLista.size() > 0) {
                filmeLista.forEach(System.out::println);
            } else {
                System.out.println("Nenhum Filme Encontrado");
            }

        } catch (RuntimeException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
