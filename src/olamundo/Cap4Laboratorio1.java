package olamundo;

import javax.swing.JOptionPane;

public class Cap4Laboratorio1 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Digite um numero");

		int numero = Integer.parseInt(input);
		int divisor = numero;
		int contador = 0;

		while (divisor > 0) {
			if (numero % divisor == 0) {
				contador++;
			}
			divisor--;
		}

		if (contador > 2 || numero < 2) {
			JOptionPane.showMessageDialog(
					null, numero + " : não é primo \n Contador: " + contador);
		} else {
			JOptionPane.showMessageDialog(
					null, numero + " :  é primo  \n Contador: " + contador);
		}
	}
}
