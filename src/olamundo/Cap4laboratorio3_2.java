package olamundo;

public class Cap4laboratorio3_2 {

	private static int ano = 1930;
	private static int contador;

	public static void main(String[] args) {

		for (int i = 1; ano <= 2022; i++) {

			if (ano != 1942 && ano != 1946) {
				System.out.println(ano);
			}
			ano += 4;
		}
	}
}
