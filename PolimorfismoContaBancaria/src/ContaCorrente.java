
public class ContaCorrente extends Conta {

	public void atualiza(double taxajuro){
		saldo += saldo * taxajuro;
	}
	
	public void deposita(double valor){
		saldo += valor;
	}
}
