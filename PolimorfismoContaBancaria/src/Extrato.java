
public class Extrato extends TestaContas{
			
	public static void imprimeCC(double valor, double taxajuro,
			double saque, double cpmf, double saldo){
		
		System.out.println("Extrato para Simples Verificação" +
				"\n=======================================" +
				"\nConta Corrente" +
				"\nDeposito.....: " + valor + 
				"\nRendimento...: " + taxajuro +
				"\nSaque........: " + saque +
				"\nCPMF.........: " + cpmf +
				"\nSaldo........: " + saldo
				);
	}
	
	public static void imprimeCP(double valor, double taxajuro,
			double saque, double cpmf, double saldo){
		
		System.out.println("\nConta Poupança" +
				"\nDeposito.....: " + valor + 
				"\nRendimento...: " + taxajuro +
				"\nSaque........: " + saque +
				"\nCPMF.........: " + cpmf +
				"\nSaldo........: " + saldo
				);
	}
	
	public static void imprimeAP(double valor, double taxajuro,
			double saque, double cpmf, double saldo){ 
		
		System.out.println("\nConta Aplicação Programada" +
				"\nDeposito.....: " + valor + 
				"\nRendimento...: " + taxajuro +
				"\nSaque........: " + saque +
				"\nCPMF.........: " + cpmf +
				"\nSaldo........: " + saldo
				);
	}
	
}
