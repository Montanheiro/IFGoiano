public class Adicional extends Cartao{
	
	String nomeAdicional;
	int numeroAdicional;
	String CNPJ;
	
	public Adicional(){ //zerando as variaveis
		super();
		nomeAdicional = "";
		numeroAdicional = 0;
		CNPJ = "";
	}
	
	public Adicional(String nome, int numero, double limite,
			String nomeAdicional, int numeroAdicional, String CNPJ){ //recebendo por metodo construtor e herdando
		super(nome, numero, limite);
		this.nomeAdicional = nomeAdicional;
		this.numeroAdicional = numeroAdicional;
		this.CNPJ = CNPJ;
	}
	
	public void verFatura(){ //metodo simples
		System.out.println("Titular: " + titular + 
				"\nCartão titular número: " + numero +
				"\nNome adicional: " + nomeAdicional +
				"\nNúmero do cartão adicional: " + numeroAdicional +
				"\nValor da fatura: R$ " + debitos +
				"\nLimite Disponivel: R$ " + (limite - debitos));
	}
	
}
