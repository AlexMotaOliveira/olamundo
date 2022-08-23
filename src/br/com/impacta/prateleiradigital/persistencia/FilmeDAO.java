package br.com.impacta.prateleiradigital.persistencia;


import br.com.impacta.prateleiradigital.negocio.Filme;

public class FilmeDAO {

    /**
     * Metodo para persistir o objeto Filme
     * @param filme
     */
    public void salvar(Filme filme){
        //TODO implementar a persistencia do objeto
        System.out.println("Filme salvo com sucesso!!!");
    }

    /**
     * Metodo para excluir um objeto Filme
     * @param filme
     */
    public void excluir(Filme filme){
        //TODO implementar a exclusão do objeto
    }

    /**
     * Metodo para retornar uma lista de Filmes
     * @param tituloParcial
     * @param genero
     * @param anoInicial
     * @param anoFinal
     * @return
     */
    public Filme[] consultarListaDeFilmes(String tituloParcial,
                                          String genero,
                                          int anoInicial,
                                          int anoFinal){
        //TODO implementar a busca de uma lista de filmes
        return null;
    }

    /**
     * Metodo para retornar um Filme
     * @param genero
     * @param diretor
     * @param notaMinima
     * @param numeroDeVotos
     * @return
     */
    public Filme consultarFilme(String genero,
                                String diretor,
                                double notaMinima,
                                int numeroDeVotos){
        Filme filme = new Filme();
        //TODO fazer a consulta ao banco e preencher o objeto filme
        filme.setTitulo("Retorno do BD");
        filme.setGenero(genero);
        filme.setDiretor(diretor);
        filme.setNota(notaMinima);
        filme.setNumeroDeVotos(numeroDeVotos);
        System.out.println("Consulta ao banco realizada com sucesso!!!");
        return filme ;
    }
}
