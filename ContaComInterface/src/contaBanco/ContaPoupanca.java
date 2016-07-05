package contaBanco;
import cliente.DadosPessoais;

public class ContaPoupanca extends DadosPessoais implements Conta {
	
	private int conta;
	private double saldo, lancamento;
	
	public void receberDados(String nome, String cpf, int conta){
		setNome(nome);
		setCpf(cpf);
		this.conta = conta;
	}
	
	public int getConta(){
		return conta;
	}
	
	public void setLancamento(double lancamento){
		this.lancamento = lancamento;
	}
	public double getLancamento(){
		return lancamento;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	public double getSaldo(){
		return saldo;
	}
	
	public double calcularSaldo(){
		return lancamento + saldo;
	}
}
