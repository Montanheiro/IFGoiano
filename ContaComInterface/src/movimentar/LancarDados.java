package movimentar;
import impressao.ImprimirDados;
import contaBanco.ContaCorrente;
import contaBanco.ContaPoupanca;

public class LancarDados {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.ReceberDados("José Pereira", "111.222.333-44", 438358);
		cc.setSaldo(1000.00);
		cc.setLancamento(100.00);
		ImprimirDados.ReceberCalcularImprimir(cc.getConta(), cc.getSaldo(), cc.getLancamento());
		
		ContaPoupanca cp = new ContaPoupanca();
		
		cp.ReceberDados("Lucas Montanheiro", "999.888.777-66", 495834);
		cp.setSaldo(400.00);
		cp.setLancamento(400.00);
		ImprimirDados.ReceberCalcularImprimir(cp.getConta(), cp.getSaldo(), cp.getLancamento());	
	}
}