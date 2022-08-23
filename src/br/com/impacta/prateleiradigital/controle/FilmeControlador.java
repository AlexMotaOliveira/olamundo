package br.com.impacta.prateleiradigital.controle;

import br.com.impacta.prateleiradigital.negocio.Filme;
import br.com.impacta.prateleiradigital.persistencia.FilmeDAO;

public class FilmeControlador  {

    FilmeDAO filmeDAO = new FilmeDAO();


    public void adicionar(String titulo,
                          String diretor,
                          double nota,
                          int ano,
                          String genero,
                          int numeroDeVotos,
                          int duracao,
                          String url) {
        //TODO implementar regra para add um filme
        Filme filme = new Filme(titulo, diretor,
                nota, duracao, ano, genero, numeroDeVotos, url);

        filmeDAO.salvar(filme);
    }

    //sobrecarga de metodo
    public void adicionar(Filme filme) {

        //TODO implementar regra para add um filme
        filmeDAO.salvar(filme);

    }

    public Filme[] consultarFilmes(String tituloParcial,
                                   String genero,
                                   int anoInicial,
                                   int anoFinal) {
        //TODO implementar regra para consultar uma lista de filmes

        return filmeDAO.consultarListaDeFilmes(
                tituloParcial, genero, anoInicial, anoFinal);
    }

    /**
     * exclui um filme
     *
     * @param filme
     */
    public void remover(Filme filme) {
        //TODO implementar a regra para excluir um filme
        filmeDAO.excluir(filme);
    }

    /**
     * Sorteia um filme de acordo com os argumentos,
     * caso não localize um filme é exibido a msg:
     * "Nenhum Filme Encontrado"
     *
     * @param genero
     * @param notaMinima
     * @param numeroDeVotos
     * @return
     */
    public Filme sortear(String genero,
                         String diretor,
                         double notaMinima,
                         int numeroDeVotos) {
        //TODO implementar a regra para escolher um filme
        return filmeDAO.consultarFilme(genero, diretor,
                        notaMinima, numeroDeVotos);
    }

    /**
     * importa uma lista de filmes a partir de um arquivo
     */
    public void importarListaDeFilmes() {
        //TODO implementar a regra para add um filme de cada vez
    }
}
