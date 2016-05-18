
public class Gerente extends Funcionario{

	double gratificacao = 0;
	
	public Gerente(String nome, double salario, double gratificacao) {
		super(nome, salario);
		
		this.gratificacao = gratificacao;
	}
	
	public double CalcularSalarioGerente(){
		return salario + gratificacao;
	}

	public void ImprimirDadosGerente(){
		System.out.println("\nGerente: " + nome);
		System.out.println("Salário: " + salario);
		System.out.println("Gratificação: " + gratificacao);
		System.out.println("Salário Total: " + CalcularSalarioGerente());
	}
}
