
public class Principal {

	public static void main(String[] args) {
		
		Crediario Crediario = new Crediario();
		Produto Produto = new Produto();
		
		Produto.codigo = 1;
		Produto.nome = "Sandalia";
		Produto.marca = "Havaiana";
		
		Crediario.Dados(1200, 4);
		Crediario.valorparcelado = Crediario.Parcelamento();
		
		System.out.println("Código: " + Produto.codigo +
							"\nProduto: " + Produto.nome +
							"\nMarca: " + Produto.marca +
							"\nValor Total: " + Crediario.valor +
							"\nValor de cada parcela: " + Crediario.valorparcelado +
							"\nParcelas: " + Crediario.parcelas);		
	}
}
