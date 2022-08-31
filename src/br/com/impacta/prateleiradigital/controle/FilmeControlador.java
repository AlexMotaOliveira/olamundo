package br.com.impacta.prateleiradigital.controle;

import br.com.impacta.prateleiradigital.negocio.Filme;
import br.com.impacta.prateleiradigital.persistencia.FilmeDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeControlador  {

    FilmeDAO filmeDAO = new FilmeDAO();


    public void adicionar(String titulo,
                          String diretor,
                          double nota,
                          int ano,
                          String genero,
                          int numeroDeVotos,
                          int duracao,
                          String url) throws SQLException {
        //TODO implementar regra para add um filme
        Filme filme = new Filme(titulo, diretor,
                nota, duracao, ano, genero, numeroDeVotos, url);

        filmeDAO.salvar(filme);
    }

    //sobrecarga de metodo
    public void adicionar(Filme filme) throws SQLException {

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

    public List<Filme> consultarFilmes(String genero,
                                      int ano,
                                      String  tituloParcial) {
        //TODO implementar regra para consultar uma lista de filmes

        return filmeDAO.consultarListaDeFilmes(
                genero, ano, tituloParcial);
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

    public Filme sortear(Filme filme) {
       if (filme != null){
           return filmeDAO
                   .consultarFilme(filme.getGenero(),
                           filme.getDiretor(),
                           filme.getNota(),
                           filme.getNumeroDeVotos());
       }else {
          return null;
       }
    }

    /**
     * importa uma lista de filmes a partir de um arquivo
     */
    public void importarListaDeFilmes(String caminhoDoArquivo) {
        //TODO implementar a regra para add um filme de cada vez
        // vericar o caminho do arquivo e ler os dados
        // criar uma lista de Filme com os dados do arquivo
        // salvar uma lista de filmes no banco de dados

        // Iterar/forEach a lista e salvar cada um dos objetos
        List<Filme> filmeList = new ArrayList<>();
//        filmeList.forEach(filme -> filmeDAO.salvar(filme));

        // salvar uma lista inteira no BD de uma unica vez
        filmeDAO.salvar(filmeList);
    }
}
