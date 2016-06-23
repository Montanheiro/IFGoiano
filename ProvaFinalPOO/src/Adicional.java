public class Adicional extends Cartao{
	
	String nomeAdicional; //declarando variaveis
	int numeroAdicional;
	String cnpj;
	
	public Adicional(){ //zerando as variaveis
		super();
		nomeAdicional = "";
		numeroAdicional = 0;
		cnpj = "";
	}
	
	public Adicional(String nome, int numero, double limite,
			String nomeAdicional, int numeroAdicional, String cnpj){ //recebendo por metodo construtor e herdando
		super(nome, numero, limite);
		this.nomeAdicional = nomeAdicional;
		this.numeroAdicional = numeroAdicional;
		this.cnpj = cnpj;
	}
	
	public void verFatura(){ //metodo simples
		System.out.println("Titular: " + titular + 
				"\nCartão titular número: " + numero +
				"\nNome adicional: " + nomeAdicional +
				"\nNúmero do cartão adicional: " + numeroAdicional +
				"\nCNPJ: " + cnpj +
				"\nValor da fatura: R$ " + debitos +
				"\nLimite Disponivel: R$ " + (limite - debitos));
	}
	
}
