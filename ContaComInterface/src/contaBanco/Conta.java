package contaBanco;

public interface Conta {
	
	void receberDados(String nome, String cpf, int conta);
	double calcularSaldo();

}
