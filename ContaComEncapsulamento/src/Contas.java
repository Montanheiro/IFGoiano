
public class Contas {
	
	private int bancoNumero;
	private String nomeBanco, agencia, cidade, conta, tipoConta, cliente;
	
	double deposito, saldo, saque, rendimento;

	public void conta(int bancoNumero, String nomeBanco, String agencia,
			String cidade, String conta, String tipoConta, String cliente){
		this.bancoNumero = bancoNumero;
		this.nomeBanco = nomeBanco;
		this.agencia = agencia;
		this.cidade = cidade;
		this.conta = conta;
		this.tipoConta = tipoConta; 
		this.cliente = cliente;
	}
	public int getBancoNumero(){
		return bancoNumero;
	}
	
	public String getNomeBanco(){
		return nomeBanco;
	}
	
	public String getAgencia(){
		return agencia;
	}
	
	public String getCidade(){
		return cidade;
	}
	
	public String getConta(){
		return conta;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}

	public String getCliente(){
		return cliente;
	}
	
}
