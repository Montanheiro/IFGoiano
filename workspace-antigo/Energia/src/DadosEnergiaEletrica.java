
public class DadosEnergiaEletrica {

	int NumConta;	
	double valorKw, quantidadeConsumida;

	public double CalcularConta(double kw, double consumida){
	
		return kw * consumida;
	}
}
