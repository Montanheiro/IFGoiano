package calcularTotalAreaCoberta;
import calcularAreaComodos.CalcularAreaTodosComodos;

public class CalcularTotalArea extends CalcularAreaTodosComodos {
		
	public void areaTotal(){
		
		double soma = sala + quarto + cozinha +
				varanda + areaServico + despensa;
		
		System.out.println("A área total é: " + soma + " mts.");
	}
	
}