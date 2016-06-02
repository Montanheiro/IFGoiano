public class ContraCheque {
	
	public static void imprimeContraCheque(Funcionario funcionario) {
		System.out.println("_______________________________________");
		System.out.println("Funcionário: " + funcionario.nome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("_______________________________________");
		System.out.println("Salário Bruto: " + funcionario.getSalarioBruto());
		System.out.println("Desconto INSS: " + funcionario.desconto);
		System.out.println("Salário Líquido: " + funcionario.CalcularSalarioLiquido());
		
	}
}