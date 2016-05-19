
public class ContaCorrente extends Conta {

	public void atualiza(double taxajuro){
		saldo += saldo * taxajuro;
		this.taxajuro = taxajuro;
	}
	
	public void deposita(double valor){
		saldo += valor;
		this.valor = valor; 
	}

}
