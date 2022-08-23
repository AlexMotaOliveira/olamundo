package br.com.impacta.prateleiradigital.apresentacao;

import java.util.Scanner;

import br.com.impacta.prateleiradigital.negocio.Filme;

public class SortearFilme {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Filme filme = new Filme();
		
		System.out.println("*** Sortear um Filme ***\n");
		System.out.println("Insira um gênero:");
		filme.setGenero(scanner.nextLine());
		System.out.println("Insira uma nota:");
		filme.setNota(scanner.nextDouble()); 
		System.out.println("Insira um número minimo de votos:");
		filme.setNumeroDeVotos(scanner.nextInt());
		
		//TODO criar o metode de buscar a lista de filmes 
		//TODO validar se os dados fora inseridos para 
		//     a busca dos filmes
		
		if(false) {
			
		}else {
			System.out.println("Nenhum Filme Encontrado com os dados: \n" + filme );
		}
		
	}

}
