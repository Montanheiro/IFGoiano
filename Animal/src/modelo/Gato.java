package modelo;

public class Gato extends Mamifero{

	public Gato(String nomeAnimal) {
		super(nomeAnimal);
	}

	public void arranha(){
		System.out.println("Vou te arranhar fdp");
	}
	
	@Override
	public void emitaSom() {
		System.out.println("Miau!");		
	}

}
