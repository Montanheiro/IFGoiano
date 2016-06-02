
public class Movimentacao extends Contas{
	
	public void deposito(double valor){
		deposito += valor;
		saldo += valor;
	}
	public void saque(double valor){
		saque += valor;
		saldo -= valor;
	}
	public void rendimento(double valor){
		rendimento += valor;
		saldo += valor;
	}
	
	public void extrato(){
		System.out.println("Extrato para Simples Verificação" +
				"\n=======================================================\n" +
				getTipoConta() +
				"\nCliente: " + getCliente() +
				"\n=======================================================\n" +
				"Banco Numero\tNome Banco\tAgência\t\tConta\n" + 
				getBancoNumero()+ "\t\t" + getNomeBanco() + "\t" + getAgencia() + "\t\t" + getConta() +
				"\n\nDeposito......: " + deposito +
				"\nRendimento....: " + rendimento +
				"\nSaque.........: " + saque +
				"\nSaldo:........: " + saldo + "\n");
	}
}