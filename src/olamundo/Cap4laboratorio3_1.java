package olamundo;

public class Cap4laboratorio3_1 {

	public static void main(String[] args) {

		for (int ano_copa = 1930; ano_copa <= 2022; ano_copa += 4) {

			if (ano_copa == 1942 || ano_copa == 1946) {
				System.out.println("Antes do continue");
				continue;
			}
			System.out.println("Copas do mundo de " + ano_copa);	
		}
	}
}
