public class Salario {
	public static void main(String[] args) {
		
		DadosFuncionario Funcionario = new DadosFuncionario();
		
		Funcionario.nome = "Alberto";
		Funcionario.funcao = "Vendedor";
		Funcionario.salarioAtual = 1350.50;
		Funcionario.CalcularSalario();
		
		System.out.println("Nome: " + Funcionario.nome + 
							"\nFunção: " + Funcionario.funcao + 
							"\nSalário Atual: " + Funcionario.salarioAtual + 
							"\nNovo Salário: " + Funcionario.novoSalario);
		
		Funcionario.nome = "Fernando";
		Funcionario.funcao = "Gerente";
		Funcionario.salarioAtual = 3200.50;
		Funcionario.CalcularSalario();
		
		System.out.println("\nNome: " + Funcionario.nome + 
							"\nFunção: " + Funcionario.funcao + 
							"\nSalário Atual: " + Funcionario.salarioAtual + 
							"\nNovo Salário: " + Funcionario.novoSalario);
	}
}