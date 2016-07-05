package calcularAreaComodos;
import calcularOutrasAreas.CalcularDemaisAreas;

public class CalcularAreaTodosComodos extends CalcularDemaisAreas {
	
	protected double sala, quarto, cozinha;
	
	public void sala(double comprimento, double altura){
		sala = comprimento * altura;
		System.out.println(varanda);
	}
	public void quarto(double comprimento, double altura){
		quarto = comprimento * altura;
	}
	public void cozinha(double comprimento, double altura){
		cozinha = comprimento * altura;
	}

}


//efetua o calculo da sala, quarto e cozinha, pois os mesmos tem tamanho diferentes. 