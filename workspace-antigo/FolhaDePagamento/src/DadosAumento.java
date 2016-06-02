public class DadosAumento {
	
	String nomeFunc, Funcao;
	double salFunc, aumento, salarioNovo;
	
	public void ReceberValores(String nomeFunc, String Funcao, double salFunc){		
				
		 this.nomeFunc = nomeFunc;
		 this.Funcao = Funcao;
		 this.salFunc = salFunc;	
	}
	
	public double CalcularReajuste(){
		
		if (salFunc <= 600)
			aumento = 1.2;
		if (salFunc > 600 && salFunc <= 1500)
			aumento = 1.15;
		if (salFunc > 1500)
			aumento = 1.05;
		return aumento * salFunc;
	}	
}
