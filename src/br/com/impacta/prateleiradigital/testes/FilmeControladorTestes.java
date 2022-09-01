package br.com.impacta.prateleiradigital.testes;

import br.com.impacta.prateleiradigital.controle.FilmeControlador;
import br.com.impacta.prateleiradigital.negocio.Filme;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;


public class FilmeControladorTestes {


    @Test
    public void validarSortearFilmeNaoNulo() throws SQLException {
        Filme filme = new Filme();
        filme.setGenero("terror");
        filme.setDiretor("Alex");
        filme.setNota(10);
        filme.setNumeroDeVotos(300);

        Filme filmeDAO = new FilmeControlador().sortear(filme);
        Assert.assertNotNull(filmeDAO);
    }

    @Test
    public void validarSortearFilmeENulo() throws SQLException {
        Filme filme = null;

        System.out.println("Hello World!");

        Filme filmeDAO = new FilmeControlador().sortear(filme);
        Assert.assertNull(filmeDAO);
    }
}
