package OO;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		double [][] notas = new double[4][3];
		
		notas[0][0] = 7.5;
		
		notas[0][1] = 10.0;
		notas[0][2] = 3.7;
		
		notas[1][0] = 7.7;
		notas[1][1] = 0.0;
		notas[1][2] = 9.7;
		
		notas[2][0] = 7.9;
		notas[2][1] = 9.0;
		notas[2][2] = 6.7;
		
		notas[3][0] = 9.5;
		notas[3][1] = 5.0;
		notas[3][2] = 1.7;
		
		System.out.println(notas.length);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("primeiro for: " + i);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("segundo for: " + j);
				System.out.println("nota " + j + ": " +notas[i][j]);
			}
		}
		
		int aluno = 0;
		for (double[] ds : notas) {
			aluno++;
			for (double d : ds) {
				System.out.println("Aluno " + aluno + " nota: " + d);
			}
		}
	}
}
