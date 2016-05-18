
public class TestaContas {

	public static void main(String[] args) {
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		c.saca(1000);
		cc.saca(1000);
		cp.saca(1000);
		
		System.out.println("Conta: " + c.getSaldo());
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}

}
