public class Venda {
	public static void main(String[] args) {
		
		VendaAtacado VendaAtacado = new VendaAtacado();
		
		VendaAtacado.ReceberDados(1, "Sandalia Havaiana", 10);
		VendaAtacado.CalcularNoAtacado();
		VendaAtacado.CalcularVendaUnitario();
		
		System.out.println("Código: " + VendaAtacado.codigoItem +
							"\nDescrição: " + VendaAtacado.DescricaoItem +
							"\nValor Atacado: " + VendaAtacado.valorAtacado + 
							"\nValor Varejo: " + VendaAtacado.valorVarejo);
	}
}