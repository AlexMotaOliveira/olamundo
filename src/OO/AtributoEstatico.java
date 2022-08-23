package OO;

public class AtributoEstatico {

	public static void main(String[] args) {
		
		Classe classeA = new Classe();
		Classe classeB = new Classe();
		Classe classeC = new Classe();
		
		classeA.ano = 2022;
		
		classeA.setClasse("a");
		classeB.setClasse("b");
		classeC.setClasse("c");
		
		System.out.println(classeA);
		System.out.println(classeB);
		System.out.println(classeC);
		
		classeC.ano = 2021;
		
		System.out.println(classeA);
		System.out.println(classeB);
		System.out.println(classeC);
		
		Classe.ano = 2030;
		System.out.println("Atributo estatico ano2: " + Classe.ano2);
		System.out.println("Atributo estatico ano: " + Classe.ano);
	}

}
