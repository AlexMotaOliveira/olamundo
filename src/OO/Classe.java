package OO;

public class Classe {
	
	private String classe;
	public static int ano;
	final static int ano2 = 2023;
	
	public String getClasse() {
		return classe;
	}
	
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	@Override
	public String toString() {
		return "Classe [classe=" + classe + 
				" ano= "+ ano + 
				" ano2= "+ ano2 +"]";
	}
	
	
	

}
