public class CarrinhoDeCompra {

	int itemCodigo;
	String itemNome, itemMarca;
	double itemQuantidade, valorProduto, totalDaCompra;
	
	public void CalcularCompra(){
		totalDaCompra = valorProduto * itemQuantidade;
	}
}
