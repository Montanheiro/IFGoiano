public class VendaAtacado {

	int codigoItem;
	String DescricaoItem;
	double valorCusto, valorAtacado, valorVarejo;
	
	public void ReceberDados(int codigoItem, String DescricaoItem, double valorCusto){
		this.codigoItem = codigoItem;
		this.DescricaoItem = DescricaoItem;
		this.valorCusto = valorCusto;
	}
	public void CalcularNoAtacado(){
		valorAtacado = valorCusto * 1.3;
	}
	public void CalcularVendaUnitario(){
		valorVarejo = valorCusto * 1.6;
	}
}
