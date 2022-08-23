package br.com.impacta.prateleiradigital.negocio;

public class Filme {
	
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
		return "Filme [titulo=" + titulo + ", diretores=" + diretor + ", nota=" + nota + ", duracao=" + duracao
				+ ", ano=" + ano + ", genero=" + genero + ", numDeVotos=" + numeroDeVotos + ", url=" + url + "]";
	}

	
}
