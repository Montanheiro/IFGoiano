package modelo;

public class Galinha extends Ave{

	public void cisca(){
		System.out.println("Estou ciscando");
	}
	
	public void botarOvo(){
		System.out.println("Tá saindo o Ovo, BIIIIIRL");
	}
	
	@Override
	public void emitaSom() {
		System.out.println("Pó pó pó!");
		
	}
	
	

}
