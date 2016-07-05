package calcularAreaComodos;
import calcularOutrasAreas.CalcularDemaisAreas;

public class CalcularAreaTodosComodos extends CalcularDemaisAreas implements Area{
	
	protected double sala, quarto, cozinha;
	
	public void sala(double comprimento, double altura){
		sala = comprimento * altura;
	}
	public void quarto(double comprimento, double altura){
		quarto = comprimento * altura;
	}
	public void cozinha(double comprimento, double altura){
		cozinha = comprimento * altura;
	}

}