package modelo;

public abstract class Animal {
	
	private String nomeAnimal;
	
	public Animal(String nomeAnimal){
		this.nomeAnimal = nomeAnimal;
	}
	
	public abstract void emitaSom();

	public void print(){
		System.out.println(nomeAnimal);
	}
}
