package br.com.impacta.prateleiradigital.controle;

import br.com.impacta.prateleiradigital.negocio.Filme;
import br.com.impacta.prateleiradigital.persistencia.FilmeDAO;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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

    public List<Filme> consultarFilmes(String tituloParcial,
                                   String genero,
                                   int anoInicial,
                                   int anoFinal) throws SQLException {


        return filmeDAO.consultarListaDeFilmes(
                tituloParcial, genero, anoInicial, anoFinal);
    }

    public List<Filme> consultarFilmes(String genero,
                                      int ano,
                                      String  tituloParcial) throws SQLException {
        //TODO implementar regra para consultar uma lista de filmes

        return filmeDAO.consultarListaDeFilmes(
                genero, ano, tituloParcial);
    }

    /**
     * exclui um filme
     *
     * @param filme
     */
    public void remover(Filme filme) throws SQLException {
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
                         int numeroDeVotos) throws SQLException {
        //TODO implementar a regra para escolher um filme
        return filmeDAO.consultarFilme(genero, diretor,
                        notaMinima, numeroDeVotos);
    }

    public Filme sortear(Filme filme) throws SQLException {
           return filmeDAO
                   .consultarFilme(filme.getGenero(),
                           filme.getDiretor(),
                           filme.getNota(),
                           filme.getNumeroDeVotos());
    }

    /**
     * importa uma lista de filmes a partir de um arquivo
     */
    public void importarListaDeFilmes(String caminhoDoArquivo)
            throws SQLException, IOException {

        Vector<Filme> filmeList = new Vector<>();

        File file = new File(caminhoDoArquivo);
        FileReader fileReader = new FileReader(file);
        BufferedReader bR = new BufferedReader(fileReader);

        String linha;
        bR.readLine();
        while ((linha = bR.readLine()) != null) {
            String[] array = linha.split(";");
            Filme filme = new Filme();
            filme.setTitulo(array[0]);
            filme.setDiretor(array[1]);
            filme.setNota(Double.parseDouble(array[2]));
            filme.setDuracao(Integer.parseInt(array[3]));
            filme.setAno(Integer.parseInt(array[4]));
            filme.setGenero(array[5]);
            filme.setNumeroDeVotos(Integer.parseInt(array[6]));
            filme.setUrl(array[7]);
            System.out.println(filme);
            System.out.println();

            filmeList.add(filme);
        }

        Thread thread = new Thread(() -> {
            try {
                filmeDAO.salvar(filmeList.get(0));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });


    }
}
