public class Venda {
	public static void main(String[] args) {
		
		CarrinhoDeCompra CarrinhoDeCompra = new CarrinhoDeCompra();
		CalcularValorProduto CalcularValorProduto = new CalcularValorProduto();
		
		CarrinhoDeCompra.itemCodigo = 1;
		CarrinhoDeCompra.itemNome = "Sandalia";
		CarrinhoDeCompra.itemMarca = "Havaiana";
		CarrinhoDeCompra.itemQuantidade = 2;
		CarrinhoDeCompra.valorProduto = 12.00;
		CalcularValorProduto.frete = 20.00;
		
		CarrinhoDeCompra.CalcularCompra();
		CalcularValorProduto.CalcularValorTotal(CarrinhoDeCompra.totalDaCompra);
		
		System.out.println("Código: " + CarrinhoDeCompra.itemCodigo +
							"\nProduto: " + CarrinhoDeCompra.itemNome +
							"\nMarca: " + CarrinhoDeCompra.itemMarca + 
							"\nQuantidade: " + CarrinhoDeCompra.itemQuantidade + 
							"\nValor unitário: " + CarrinhoDeCompra.valorProduto);
		System.out.printf("\nTotal da Compra: " + CarrinhoDeCompra.totalDaCompra + 
						"\nFrete: " + CalcularValorProduto.frete + 
						"\nValor a pagar: " + CalcularValorProduto.valorTotalPagar);
	}
}