public class Principal {

	public static void main(String[] args) {
		
		double salario = 1200.00, reajuste = Funcionarios.calcular(salario);
		
		Funcionarios.imprime("Joana", "Assistente Administrativa", salario, reajuste , reajuste + salario);
	}
}