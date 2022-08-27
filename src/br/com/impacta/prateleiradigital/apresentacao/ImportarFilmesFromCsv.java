package br.com.impacta.prateleiradigital.apresentacao;

import br.com.impacta.prateleiradigital.controle.FilmeControlador;

import java.util.Scanner;

public class ImportarFilmesFromCsv {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Importar arquivo ***");
		System.out.println("Insira o nome do arquivo: ");
		String caminhoDoArquivo = scanner.nextLine();

		try{
			new FilmeControlador().importarListaDeFilmes(caminhoDoArquivo);
			System.out.println("Filmes importados com sucesso!!!");

		}catch (RuntimeException e){
			System.out.println(e);
		}
	}

}
