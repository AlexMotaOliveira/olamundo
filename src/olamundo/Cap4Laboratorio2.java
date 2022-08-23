package olamundo;

public class Cap4Laboratorio2 {

	public static void main(String[] args) {

		Meses mes = Meses.FEVEREIRO;
		
		System.out.println("estrutura co switch ");
		switch (mes) {
		case FEVEREIRO:
			System.out.println("o mes escolhido tem 28/29 dias");
			break;
		case ABRIL:
		case JUNHO:
		case SETEMBRO:
		case NOVEMBRO:
			System.out.println("o mes escolhido tem 30 dias");
			break;
		default:
			System.out.println("o mes escolhido tem 31 dias");
		}
		
		System.out.println("estrutura co if ");
		
		if (mes.equals(Meses.FEVEREIRO)) {
			System.out.println("o mes escolhido tem 28/29 dias");
		}else if (mes.equals(Meses.ABRIL) || 
				  mes.equals(Meses.JUNHO) ||
				  mes.equals("setembro") ||
				  mes.equals("novembro")) {
			System.out.println("o mes escolhido tem 30 dias");
		}else {
			System.out.println("o mes escolhido tem 31 dias");
		}
	}
}
