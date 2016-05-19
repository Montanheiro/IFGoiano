public class Conta {

	protected double saldo;
	double valor, cpmf, taxajuro, saque;
	
	public void deposita(double valor){
		saldo += valor;
		this.valor = valor;
	}
	public void saca(double valor, double cpmf){
		saldo -= valor * cpmf;
		this.cpmf = cpmf;
		saque = valor;
	}
	public void atualiza(double taxajuro){
		saldo += saldo * taxajuro;
		this.taxajuro = taxajuro;
	}
	public double getSaldo(){
		return saldo;
	}
}
