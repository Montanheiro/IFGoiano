
public class Principal {

	public static void main(String[] args) {
	
		Dados quadrado = new Dados();
		
		quadrado.setLado(2);
		quadrado.Calculo();
		
		System.out.println("O quadrado com lado: "+ quadrado.getLado() + " tem área: "+ quadrado.getArea());
		

	}

}
