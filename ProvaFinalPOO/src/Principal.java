
public class Principal {

	public static void main(String[] args) {
		
		Titular mastercard = new Titular("Lucas", 435535, 3000.00,
				"XXX.XXX.XXX-XX"); //criando objeto
		
		mastercard.lancarDebito(199.98);
		mastercard.lancarDebito(199.00, 3.44); //compra em dolar com polimorfismo
		mastercard.setPontos(2); //adicionado pontos ao cliente com encapsulamento
		
		mastercard.verFatura();
		mastercard.getPontos(); //recuperando os pontos encapsulados
		mastercard.pagarFatura();

		Adicional visa = new Adicional("Lucas", 435535, 3000.00, "Empresa",
				435536, "XX.XXX.XXX/XXXX-XX"); //criando objeto
		
		visa.lancarDebito(9.92);
		visa.lancarDebito(121.00, 3.84); //compra em euro com poliformismo
		
		visa.verFatura();
		visa.pagarFatura();
	}

}

/*
	REGRA DE NEGÓCIO
Sistema para cartão de crédito

Classe Cartao contém os valores e metodos comuns
a todos os cartões de créditos do sistema

Classe Adicional é herdada de Cartao e tem além das
variavais comuns o nome e número de cartão do cliente
do usuário do cartao adicional.
Cartão adicional é destinado a empresas.

Classe Titular é herdada de Cartao e aceita pontos para
que o cliente possa trocar por beneficios.
Cartão titular é destinado a pessoas físicas.
*/