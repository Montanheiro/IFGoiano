public class Principal {
	public static void main(String[] args) {
		
		DadosQuadrado Quadrado = new DadosQuadrado();
		
		Quadrado.ReceberDados(4);
		Quadrado.CalcularArea();
		
		System.out.println("A área de um quadrado com lado '" + Quadrado.lado + "' é: " + Quadrado.area);
	}
}
