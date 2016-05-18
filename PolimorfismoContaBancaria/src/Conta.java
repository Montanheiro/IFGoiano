public class Conta {

	protected double saldo;
	
	public void deposita(double valor){
		saldo += valor;
	}
	public void saca(double valor){
		saldo -= valor;
	}
	public void atualiza(double taxajuro){
		saldo += saldo * taxajuro;
	}
	public double getSaldo(){
		return saldo;
	}
}
