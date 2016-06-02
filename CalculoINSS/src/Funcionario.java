public class Funcionario {

	String nome, cargo;
	private double SalarioBruto = 0;
	double desconto = 0;
	
	public Funcionario(String nome, String cargo){
		this.nome = nome;
		this.cargo = cargo;
	}
	
	public void setSalarioBruto(double SalarioBruto){
		this.SalarioBruto = SalarioBruto;
	}
	public double getSalarioBruto(){
		return SalarioBruto;
	}
	
	public double calcularINSS(){
				
		if(this.SalarioBruto <= 1556.94){
			this.desconto = this.SalarioBruto * 0.08;
		}
		else if(this.SalarioBruto >= 1556.95 && this.SalarioBruto <= 2594.92){
			this.desconto = this.SalarioBruto * 0.09;
		}
		else if(this.SalarioBruto >= 2594.93 && this.SalarioBruto <= 5189.82){
			this.desconto = this.SalarioBruto * 0.11;
		}
		
		return this.desconto;
	}
	
	public double CalcularSalarioLiquido(){
		return this.SalarioBruto - this.desconto;
	}
}
