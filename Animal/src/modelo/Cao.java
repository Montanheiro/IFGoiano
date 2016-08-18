package modelo;

public class Cao extends Mamifero{

	public Cao(String nomeAnimal) {
		super(nomeAnimal);
	}

	public void abaneRabo(){
		System.out.println("Abanando o rabo!");
	}
	
	@Override
	public void emitaSom() {
		
		System.out.println("Au au!");	
		
		MeuPlayer ipad = new MeuPlayer("dog.wav");
		ipad.start();
	}

}
