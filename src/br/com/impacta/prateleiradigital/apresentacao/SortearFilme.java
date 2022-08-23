package br.com.impacta.prateleiradigital.apresentacao;

import java.util.Scanner;

import br.com.impacta.prateleiradigital.controle.FilmeControlador;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class SortearFilme {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Filme filme = new Filme();
		
		System.out.println("*** Indicar um Filme ***\n");
		System.out.println("Insira um gênero:");
		filme.setGenero(scanner.nextLine());
		System.out.println("Insira um diretor:");
		filme.setDiretor(scanner.nextLine());
		System.out.println("Insira uma nota:");
		filme.setNota(scanner.nextDouble()); 
		System.out.println("Insira um número minimo de votos:");
		filme.setNumeroDeVotos(scanner.nextInt());
		
		//TODO criar o metode de buscar a lista de filmes 
		//TODO validar se os dados fora inseridos para 
		//     a busca dos filmes

		if(filme.getNota() > 3) {
			Filme filmeDAO = new FilmeControlador().sortear(filme);
			System.out.println(filmeDAO);
		}else {
			System.out.println("Nenhum Filme Encontrado com os dados: \n" + filme );
		}
	}

//	O filtro pode ser deixado vazio. Neste caso todos os filmes devem
//	ser exibidos na lista ordenados por título e paginado a cada 50 ocorrências
//
//	Dados que podem ser inseridos no filtro:
//	gênero,diretor ano, titulo parcial

}
