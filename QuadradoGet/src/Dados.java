public class Dados {

	private double area, lado;
	
	public void Calculo(){
		 area = lado * lado;
	}
	public void setLado(double lado){
		this.lado = lado;
	}
	public double getLado(){
		return lado;
	}
	public double getArea(){
		return area;
	}	
}
