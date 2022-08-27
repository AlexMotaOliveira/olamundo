package br.com.impacta.prateleiradigital.persistencia;


import br.com.impacta.prateleiradigital.negocio.Filme;

import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {

    /**
     * Metodo para persistir o objeto Filme
     *
     * @param filme
     */
    public void salvar(Filme filme) {
        //TODO implementar a persistencia do objeto
        System.out.println("Filme salvo com sucesso!!!");
    }

    public void salvar(List<Filme> filme) {
        //TODO implementar a persistencia do objeto
        int countador = 0;
        while (countador++ < 10) {
            System.out.println("Filme salvo com sucesso!!!");
        }
    }

    /**
     * Metodo para excluir um objeto Filme
     *
     * @param filme
     */
    public void excluir(Filme filme) {
        //TODO implementar a exclusão do objeto
    }

    /**
     * Metodo para retornar uma lista de Filmes
     *
     * @param tituloParcial
     * @param genero
     * @param anoInicial
     * @param anoFinal
     * @return
     */
    public Filme[] consultarListaDeFilmes(String tituloParcial,
                                          String genero,
                                          int anoInicial,
                                          int anoFinal) {
        //TODO implementar a busca de uma lista de filmes
        return null;
    }

    public List<Filme> consultarListaDeFilmes(String genero,
                                              int ano,
                                              String tituloParcial) {

        // TODO implementar a consulta ao BD com os argumentos passados


        // lista mokada para exibir a consulta ao banco
        List<Filme> filmeList = new ArrayList<>();

        filmeList.add(
                new Filme("Terror", "Alex", 10, 120,
                        2022, "terror", 300, "www"));

        filmeList.add(
                new Filme("Terror 2", "Alex", 10, 220,
                        2023, "terror", 500, "www"));

        return filmeList;
    }

    /**
     * Metodo para retornar um Filme
     *
     * @param genero
     * @param diretor
     * @param notaMinima
     * @param numeroDeVotos
     * @return
     */
    public Filme consultarFilme(String genero,
                                String diretor,
                                double notaMinima,
                                int numeroDeVotos) {
        Filme filme = new Filme();
        //TODO fazer a consulta ao banco e preencher o objeto filme
        filme.setTitulo("Retorno do BD");
        filme.setGenero(genero);
        filme.setDiretor(diretor);
        filme.setNota(notaMinima);
        filme.setNumeroDeVotos(numeroDeVotos);
        System.out.println("Consulta ao banco realizada com sucesso!!!");
        return filme;
    }
}
