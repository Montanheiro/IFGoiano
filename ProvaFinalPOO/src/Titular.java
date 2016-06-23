public class Titular extends Cartao{
	
	String cpf;
	
	public Titular(){ //zerando as variaveis
		super();
		cpf = "";
	}
	
	public Titular(String nome, int numero, double limite, String cpf){ //recebendo por metodo construtor e herdando
		super(nome, numero, limite);
		this.cpf = cpf;
	}
	
	private int pontos = 0; //criando varivel protegida, encapsulamento
	
	public void setPontos(int pontos){ //criando set para encapsulamento
		this.pontos = pontos;
	}
	public int getPontos(){ //criando get para encapsulamento
		return pontos;
	}
	
	public void verFatura(){ //metodo simples
		System.out.println("Titular: " + titular + 
				"\nCartão número: " + numero +
				"\nCPF: " + cpf +
				"\nValor da fatura: R$ " + debitos +
				"\nLimite Disponivel: R$ " + (limite - debitos));
	}
}
