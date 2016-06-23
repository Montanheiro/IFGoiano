public class Cartao {
		
	String titular;
	int numero; 
	double limite, debitos;

	public Cartao(){ //zerando as variaveis
		titular = "";
		numero = 0;
		limite = 0;
	}
	
	public Cartao(String titular, int numero, double limite){ //recebendo por metodo construtor
		this.titular = titular;
		this.numero = numero;
		this.limite = limite;
	}
	
	public void lancarDebito(double valor){
		if (valor < (limite - debitos)){ //checando de o titular possui limite
			
			debitos += valor;
			
		}else{
			System.out.println("Titular sem limite");
		}
	}
	
	public void lancarDebito(double valor, double fator){ // usando polimorfismo, compra em moeda estrageira
		if (valor < (limite - debitos)){ //checando de o titular possui limite
			
			debitos += valor * fator;
			
		}else{
			System.out.println("Titular sem limite");
		}
	}
	
	public void pagarFatura(){ //metodo simples
		debitos = 0;
		System.out.println("Fatura paga!\n");
	}
}
