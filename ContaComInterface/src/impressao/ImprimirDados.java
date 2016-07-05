package impressao;

public class ImprimirDados {
	
	public static void receberCalcularImprimir(int conta, double saldo, double lancamento){
		System.out.println("EXTRATO DE CONTA" +
				"\nConta: " + conta +
				"\nSaldo Anterior: " + saldo +
				"\nSaldo Total: " + (saldo + lancamento) + 
				"\n");
	}

}
