
public class Principal {

	public static void main(String[] args) {
			
		Carro carro = new Carro();
		
		System.out.println("Soma: " +
				carro.calcular(5.0, 3.0));
		
		System.out.println("Multipicação: " + 
				carro.calcular(5.0f, 3.0f));
	}

}
