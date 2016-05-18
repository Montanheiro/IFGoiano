
public class Secretario extends Gerente{

	double auxilioGravata = 0;
	
	public Secretario(String nome, double salario, double gratificacao, double auxilioGravata) {
		super(nome, salario, gratificacao);
		
		this.auxilioGravata = auxilioGravata;
	}
	
	public double CalcularSalarioSecretario(){
		return salario + gratificacao + auxilioGravata;
	}
	
	public void ImprimirDadosSecretario(){
		System.out.println("\nSecretário: " + nome);
		System.out.println("Salário: " + salario);
		System.out.println("Gratificação: " + gratificacao);
		System.out.println("Auxilio Gravata: " + auxilioGravata);
		System.out.println("Salário Total: " + CalcularSalarioSecretario());
	}
}
