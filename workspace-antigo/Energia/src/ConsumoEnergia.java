
public class ConsumoEnergia {

	public static void main(String[] args) {
		
		DadosEnergiaEletrica GastoDeEnergiaEletrica = new DadosEnergiaEletrica();

		GastoDeEnergiaEletrica.NumConta = 2;
		GastoDeEnergiaEletrica.quantidadeConsumida = 102;
		
		if (GastoDeEnergiaEletrica.quantidadeConsumida < 100)
			GastoDeEnergiaEletrica.valorKw = 0.85;
		else
			GastoDeEnergiaEletrica.valorKw = 0.99;
		
		double totalPagar = GastoDeEnergiaEletrica.CalcularConta(GastoDeEnergiaEletrica.valorKw, GastoDeEnergiaEletrica.quantidadeConsumida);
		
		System.out.println("NumConta = " + GastoDeEnergiaEletrica.NumConta + 
				"\nquantidadeConsumida = " + GastoDeEnergiaEletrica.quantidadeConsumida + 
				"\nvalorKw = " + GastoDeEnergiaEletrica.valorKw + 
				"\nTotal da Conta = " + totalPagar);
	}
}