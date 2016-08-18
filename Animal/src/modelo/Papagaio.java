package modelo;

public class Papagaio extends Ave{

	public void voa(){
		System.out.println("Estou voando!");
	}
	
	@Override
	public void emitaSom() {
		System.out.println("Urupá!");
		
	}
	
	

}
