
public class Crediario {

	double valor, parcelas, valorparcelado;
	
	public void Dados(double valor, double parcelas){
		this.valor = valor;
		this.parcelas = parcelas;
	}
	public double Parcelamento(){
		return valor/parcelas;
	}
}
