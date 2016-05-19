
public class AplicacaoProgramada extends Conta {
	
	public void atualiza(double taxajuro){
		saldo += saldo * taxajuro;
		this.taxajuro = taxajuro;
	}
}
