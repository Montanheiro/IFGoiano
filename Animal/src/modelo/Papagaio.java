package modelo;

public class Papagaio extends Ave{

	public Papagaio(String nomeAnimal) {
		super(nomeAnimal);
		// TODO Auto-generated constructor stub
	}

	public void voa(){
		System.out.println("Estou voando!");
	}
	
	@Override
	public void emitaSom() {
		System.out.println("Urupá!");
		
	}
	
	

}
