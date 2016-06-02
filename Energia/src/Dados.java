public class Dados {

	private int numConta;
	private double valorKw, quantidadeConsumida;
	
	public void CalcularConta(int numConta, double quantidadeConsumida){
		
		this.numConta = numConta;
		this.quantidadeConsumida = quantidadeConsumida;
		
		if (quantidadeConsumida < 100)
			valorKw = 0.85;
		else
			valorKw = 0.99;
		
		System.out.println("NumConta = " + this.numConta + 
				"\nquantidadeConsumida = " + this.quantidadeConsumida + 
				"\nvalorKw = " + valorKw + 
				"\nTotal da Conta = " + valorKw * this.quantidadeConsumida);
	}
}
