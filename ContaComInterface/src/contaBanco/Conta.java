package contaBanco;

public interface Conta {
	
	void ReceberDados(String nome, String cpf, int conta);
	double CalcularSaldo();

}
