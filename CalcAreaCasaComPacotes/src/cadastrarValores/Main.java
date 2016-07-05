package cadastrarValores;
import calcularTotalAreaCoberta.CalcularTotalArea;

public class Main {

	public static void main(String[] args) {
		
		CalcularTotalArea casa = new CalcularTotalArea();	
		
		casa.sala(20, 10);
		casa.quarto(8, 4);
		casa.quarto(9,3);
		casa.cozinha(10, 5);
		casa.varanda(15, 5);
		casa.areaServico(20, 10);
		casa.despensa(4, 4);
		
		casa.areaTotal();

	}
}