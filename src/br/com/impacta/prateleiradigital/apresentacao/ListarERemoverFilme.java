package br.com.impacta.prateleiradigital.apresentacao;

import java.util.Scanner;

import br.com.impacta.prateleiradigital.negocio.Filme;

public class ListarERemoverFilme {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Remover um Filme ***");
		System.out.println("Insira um tilulo:");
		
		Filme filme = new Filme();
		String titulo = scanner.nextLine();
		filme.setTitulo(titulo);
		
		//TODO criar o metodo para buscar o filme e depois excluir
		
		System.out.println("O Filme com o titulo " + 
					filme.getTitulo() + " foi removido com sucesso");
		
	}

}
