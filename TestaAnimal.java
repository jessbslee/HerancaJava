package Heranca;

public class TestaAnimal {

	public static void main(String[] args) {
		
	Cachorro dog = new Cachorro();
	Cavalo c1 = new Cavalo();
	Pregui�a p1 = new Pregui�a();
	
	dog.setNome("Dengo");
	dog.setIdade(14);
	
	dog.dados();
	System.out.println();
	
	c1.setNome("Cavalo");
	c1.setIdade(6);
	c1.dados();
	System.out.println();
	
	p1.setNome("Pregui�a");
	p1.setIdade(20);
	System.out.println();
	
	p1.dados();
	
	
	
	
	}

}
