public class Titular extends Cartao{
	
	public Titular(){
		super();
	}
	
	public Titular(String nome, int numero, double limite){ //recebendo por metodo construtor e herdando
		super(nome, numero, limite);
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
