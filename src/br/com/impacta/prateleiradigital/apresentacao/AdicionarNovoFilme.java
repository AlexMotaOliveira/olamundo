package br.com.impacta.prateleiradigital.apresentacao;

import java.net.URI;
import java.util.Scanner;

import br.com.impacta.prateleiradigital.controle.FilmeControlador;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class AdicionarNovoFilme {
	
	public static void main(String[] args) {

		try {

			Scanner scanner = new Scanner(System.in);

			System.out.println("*** Adicionar um Filme ***");

			System.out.println("Digite um titulo: ");
			String titulo = scanner.nextLine();

			System.out.println("Digite um diretor: ");
			String diretor = scanner.nextLine();

			System.out.println("Digite uma nota: ");
			double nota = Double.parseDouble(scanner.nextLine());

			System.out.println("Digite a dura��o do filme: ");
			int duracao = Integer.parseInt(scanner.nextLine());

			System.out.println("Digite o ano de lan�amento: ");
			int ano = Integer.parseInt(scanner.nextLine());

			System.out.println("Digite um g�nero: ");
			String genero = scanner.nextLine();

			System.out.println("Digite o n�mero de votos: ");
			int numeroDeVotos = Integer.parseInt(scanner.nextLine());

			System.out.println("Digite a url para acessar o filme: ");
			String url = scanner.nextLine();

			Filme filme = new Filme(titulo, diretor,
					nota, duracao, ano, genero, numeroDeVotos, url);

			// instancia e uso do objeto ao mesmo tempo
			new FilmeControlador().adicionar(filme);

			// outra forma de instanciar e utilizar os metodos da classe
			FilmeControlador filmeControlador = new FilmeControlador();

			filmeControlador.adicionar(titulo, diretor,
					nota, ano, genero, numeroDeVotos, duracao, url);

			System.out.println(filme);

		}catch (NumberFormatException e) {
			System.out.println("Insira um numero ao inves de um texto");
		}
	}
}
