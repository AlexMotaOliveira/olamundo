package br.com.impacta.prateleiradigital.negocio;

public class Filme {

	private int idFilme;
	private String titulo;
	private String diretor;
	private double nota;
	private int duracao;
	private int ano;
	private String genero;
	private int numeroDeVotos;
	private String url;
	
	public Filme() {
		
	}

	public Filme(String titulo,
				String diretores,
				double nota,
				int duracao,
				int ano,
				String genero,
				int numDeVotos,
				String url) {

		this.titulo = titulo;
		this.diretor = diretores;
		this.nota = nota;
		this.duracao = duracao;
		this.ano = ano;
		this.genero = genero;
		this.numeroDeVotos = numDeVotos;
		this.url = url;
	}

	public int getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumeroDeVotos() {
		return numeroDeVotos;
	}

	public void setNumeroDeVotos(int numeroDeVotos) {
		this.numeroDeVotos = numeroDeVotos;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return " titulo= " + titulo +
				"\n diretores=" + diretor +
				"\n nota=" + nota +
				"\n duracao=" + duracao +
				"\n ano=" + ano +
				"\n genero=" + genero +
				"\n numDeVotos=" + numeroDeVotos +
				"\n url=" + url;
	}

	
}
