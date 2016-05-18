
public class Auxiliar extends Funcionario{

	double numHoraTrab = 0;
	double valorHoraTrab = 0;
	double valeTransporte = 0;
	double ticketAlimentacao = 0;
	
	public Auxiliar(String nome, double salario, double numHoraTrab, 
			double valorHoraTrab, double valeTransporte, double ticketAlimentacao) {
		super(nome, salario);

		this.numHoraTrab = numHoraTrab;
		this.valorHoraTrab = valorHoraTrab;
		this.valeTransporte = valeTransporte;
		this.ticketAlimentacao = ticketAlimentacao;
	}
	
	public double CalcularSalarioAuxiliar(){
		salario =  ticketAlimentacao + valeTransporte + (valorHoraTrab * numHoraTrab);
		return salario;
	}
	
	public void ImprimirDadosAuxiliar(){
		System.out.println("\nAuxiliar: " + nome);
		System.out.println("Valor hora trabalhada: " + valorHoraTrab);
		System.out.println("Horas trabalhadas: " + numHoraTrab);
		System.out.println("Ticket alimentação: " + ticketAlimentacao);
		System.out.println("Vale transporte: " + valeTransporte);
		System.out.println("Salário: " + CalcularSalarioAuxiliar());
	}
	
	
}
