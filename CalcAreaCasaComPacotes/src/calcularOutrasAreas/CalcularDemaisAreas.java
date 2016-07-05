package calcularOutrasAreas;

public class CalcularDemaisAreas implements Area {
	
	protected double varanda, areaServico, despensa;
	
	public void varanda(double comprimento, double altura){
		varanda = comprimento * altura;
	}
	public void areaServico(double comprimento, double altura){
		areaServico = comprimento * altura;
	}
	public void despensa(double comprimento, double altura){
		despensa = comprimento * altura;
	}

}