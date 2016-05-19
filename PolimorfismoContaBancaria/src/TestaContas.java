
public class TestaContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		AplicacaoProgramada ap = new AplicacaoProgramada();
		
		cc.deposita(2000);
		cp.deposita(2000);
		ap.deposita(2000); 
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		ap.atualiza(0.01);
		
		cc.saca(1000, 0.01);
		cp.saca(1000, 0.01);
		ap.saca(1000, 0.01);
		
		Extrato.imprimeCC(cc.valor, cc.taxajuro, cc.saque, cc.cpmf, cc.getSaldo());
		Extrato.imprimeCP(cp.valor, cp.taxajuro, cp.saque, cp.cpmf, cp.getSaldo());
		Extrato.imprimeAP(ap.valor, ap.taxajuro, ap.saque, ap.cpmf, ap.getSaldo());
	}

}
