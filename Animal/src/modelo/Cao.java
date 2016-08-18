package modelo;

public class Cao extends Mamifero{

	public void abaneRabo(){
		System.out.println("Abanando o rabo!");
	}
	
	@Override
	public void emitaSom() {
		
		System.out.println("Au au!");	
		
		MeuPlayer.reproduza("dog.wav");
	}

}
