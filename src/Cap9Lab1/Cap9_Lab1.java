package Cap9Lab1;

public class Cap9_Lab1 {

	
	public static void main(String[] args) {
		
		RG rgManoel = new RG(123123, "12/08/1962");
		Object manoel = 
				new Professor("Manuel", 
						60 , 
						'M', 
						rgManoel, 
						3000.30f, 
						"Java Programmer");
		
		if(manoel instanceof Pessoa); 
			
		Pessoa pessoa = (Pessoa)manoel;
		
		if(pessoa instanceof Pessoa);
		
		Professor professor = (Professor)manoel;
		
		Pessoa jose = new Aluno("Jose", 
							22, 
							'M', 
							new RG(321321, "12/08/2000"), 
							500.50f, 
							"Java Programmer");
		
		Pessoa maria = new Aluno("Maria", 
				30, 
				'M', 
				new RG(32132103, "12/08/1990"), 
				500.50f, 
				"Java Web");
		
		maria.outroMetodoDoPai(maria);
		
		System.out.println(((Professor) manoel).falar("Olá, classe"));
		System.out.println(jose.falar("Olá, professor"));
		System.out.println(maria.falar("Olá, prof"));
		
		System.out.println("*************************");
		
		((Professor) manoel).mostrarDados();
		jose.mostrarDados();
		maria.mostrarDados();	
	}
	
	
}
