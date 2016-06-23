public class Titular extends Cartao{
	
	String CPF;
	
	public Titular(){ //zerando as variaveis
		super();
		CPF = "";
	}
	
	public Titular(String nome, int numero, double limite, String CPF){ //recebendo por metodo construtor e herdando
		super(nome, numero, limite);
		this.CPF = CPF;
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
				"\nValor da fatura: R$ " + debitos +
				"\nLimite Disponivel: R$ " + (limite - debitos));
	}
}
