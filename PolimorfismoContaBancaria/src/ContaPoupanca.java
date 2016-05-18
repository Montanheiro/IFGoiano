
public class ContaPoupanca extends Conta{

	public void atualiza(double taxajuro){
		saldo += saldo * taxajuro * 2;
	}
}
