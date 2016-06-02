
public class Principal {

	public static void main(String[] args) {
		
		Movimentacao corrente = new Movimentacao();
		Movimentacao poupanca = new Movimentacao();
		Movimentacao aplicacao = new Movimentacao();
		
		corrente.conta(1234, "Caixa Economica", "4481", "Guaraí", "402-4",
				"Conta Corrente", "Vitória Adesivos");
		poupanca.conta(4248, "Santander", "7472-X", "Morrinhos", "85853-6",
				"Conta Poupança", "Professor Pereira");
		aplicacao.conta(4853, "Bradesco", "7592", "Goiatuba", "38559-2",
				"Conta Aplicação Programada", "Mateus");
		
		
		corrente.deposito(2000);
		corrente.extrato();
		
		poupanca.rendimento(200);
		poupanca.deposito(3000);
		poupanca.extrato();
		
		aplicacao.deposito(1000);
		aplicacao.saque(100);
		aplicacao.extrato();

	}

}
