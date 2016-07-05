package cadastrarDados;
import dadosPessoais.Dados;

public class Principal {

	public static void main(String[] args) {
		Dados pereira = new Dados();

		pereira.receberDados("José Pereira", "9876-5432", "123.456.789-01");
		pereira.imprimirDados();

	}
}
