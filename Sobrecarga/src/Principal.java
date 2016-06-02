public class Principal {
	public static void main(String[] args) {
		MetodoSimples salario = new MetodoSimples();
		
		System.out.println(salario.calcular(2, 3));
		System.out.println(salario.calcular(2.5, 3));
		
		MetodoConstrutor funcionario1 = new MetodoConstrutor("João");
		MetodoConstrutor funcionario2 = new MetodoConstrutor("João", "Pedreiro");
		MetodoConstrutor funcionario3 = new MetodoConstrutor("João", "Pedreiro", "1.500,00");
	}
}
