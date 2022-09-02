package br.com.impacta.prateleiradigital.persistencia;


import br.com.impacta.prateleiradigital.negocio.Filme;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FilmeDAO {

    /**
     * Metodo para persistir o objeto Filme
     *
     * @param filme
     */
    public void salvar(Filme filme) throws SQLException {
        String sqlQuery =
                "INSERT INTO impacta.filme VALUES (?,?,?,?,?,?,?,?,?)";

        PreparedStatement preStm =
                getConnection().prepareStatement(sqlQuery);

        preStm.setNull(1, Types.INTEGER);
        preStm.setString(2, filme.getTitulo());
        preStm.setString(3, filme.getDiretor());
        preStm.setDouble(4, filme.getNota());
        preStm.setInt(5, filme.getDuracao());
        preStm.setInt(6, filme.getAno());
        preStm.setString(7, filme.getGenero());
        preStm.setInt(8, filme.getNumeroDeVotos());
        preStm.setString(9, filme.getUrl());

        int row = preStm.executeUpdate();
        preStm.close();
        System.out.println("quantidade de linhas inseridas: " + row);
    }

    public void salvar(List<Filme> filme) throws SQLException {
        for (Filme cadaFilme : filme) {
            salvar(cadaFilme);
        }
    }

    /**
     * Metodo para excluir um objeto Filme
     *
     * @param filme
     */
    public void excluir(Filme filme) throws SQLException {
        String sqlQuery =
                "DELETE FROM filme WHERE idFilme= ?";

        PreparedStatement preStm =
                getConnection().prepareStatement(sqlQuery);

        preStm.setInt(1, filme.getIdFilme());
        preStm.executeUpdate();
        preStm.close();
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
    public List<Filme> consultarListaDeFilmes(String tituloParcial,
                                              String genero,
                                              int anoInicial,
                                              int anoFinal) throws SQLException {

        String sqlQuery;
        if (genero.equals("") && tituloParcial.equals("")) {
            sqlQuery = "SELECT * FROM impacta.filme ";
        } else {
            sqlQuery =
                    "SELECT * FROM impacta.filme " +
                            "where genero like \"%" + genero + "%\"" +
                            "and titulo like \"%" + tituloParcial + "%\"" +
                            "and ano between " + anoInicial + " and " + anoFinal +
                            " order by titulo, numerodevotos desc";

        }

        Statement statement = getConnection().createStatement();
        ResultSet result = statement.executeQuery(sqlQuery);

        List<Filme> listaFilme = new ArrayList<>();
        while (result.next()) {
            Filme filme = new Filme();
            filme.setIdFilme(result.getInt("idFilme"));
            filme.setTitulo(result.getString("titulo"));
            filme.setDiretor(result.getString("diretor"));
            filme.setNota(result.getDouble("nota"));
            filme.setDuracao(result.getInt("duracao"));
            filme.setAno(result.getInt("ano"));
            filme.setGenero(result.getString("genero"));
            filme.setNumeroDeVotos(result.getInt("numerodevotos"));
            filme.setUrl(result.getString("url"));

            listaFilme.add(filme);
        }

        return listaFilme;
    }

    public List<Filme> consultarListaDeFilmes(String genero,
                                              int ano,
                                              String tituloParcial) throws SQLException {

        String sqlQuery = null;
        if (genero.equals("") && ano < 1900 && tituloParcial.equals("")) {
            sqlQuery = "SELECT * FROM impacta.filme ";
        } else {
            sqlQuery =
                    "SELECT * FROM impacta.filme " +
                            "where genero like \"%" + genero + "%\"" +
                            "and ano = \"" + ano + "\"" +
                            "and titulo like \"%" + tituloParcial + "%\"";

        }

        Statement statement = getConnection().createStatement();
        ResultSet result = statement.executeQuery(sqlQuery);

        List<Filme> listaFilme = new ArrayList<>();
        while (result.next()) {
            Filme filme = new Filme();
            filme.setTitulo(result.getString("titulo"));
            filme.setDiretor(result.getString("diretor"));
            filme.setNota(result.getDouble("nota"));
            filme.setDuracao(result.getInt("duracao"));
            filme.setAno(result.getInt("ano"));
            filme.setGenero(result.getString("genero"));
            filme.setNumeroDeVotos(result.getInt("numerodevotos"));
            filme.setUrl(result.getString("url"));

            listaFilme.add(filme);
        }

        return listaFilme;
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
                                int numeroDeVotos) throws SQLException {


        String sqlQuery = null;
        if (genero.equals("") && diretor.equals("") &&
                notaMinima < 0 && numeroDeVotos < 0) {
            sqlQuery = "SELECT * FROM impacta.filme ";
        } else {
            sqlQuery =
                    "SELECT * FROM impacta.filme " +
                            "where genero like \"%" + genero + "%\"" +
                            "and diretor like \"%" + diretor + "%\"" +
                            "and nota >= \"" + notaMinima + "\"" +
                            "and numerodevotos >= \"" + numeroDeVotos + "\"";

        }

        Statement statement = getConnection().createStatement();
        ResultSet result = statement.executeQuery(sqlQuery);

        List<Filme> listaFilme = new ArrayList<>();
        while (result.next()) {
            Filme filme = new Filme();
            filme.setTitulo(result.getString("titulo"));
            filme.setDiretor(result.getString("diretor"));
            filme.setNota(result.getDouble("nota"));
            filme.setDuracao(result.getInt("duracao"));
            filme.setAno(result.getInt("ano"));
            filme.setGenero(result.getString("genero"));
            filme.setNumeroDeVotos(result.getInt("numerodevotos"));
            filme.setUrl(result.getString("url"));

            listaFilme.add(filme);
        }

        if (listaFilme.size() > 0) {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(listaFilme.size());
            return listaFilme.get(numeroAleatorio);
        }

        return null;
    }

    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/impacta";
        String usuario = "root";
        String senha = "Imp@ct@";

        return DriverManager.getConnection(url, usuario, senha);
    }
}
