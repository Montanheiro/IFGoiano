
public class cadastrarDadosTri {

	public static void main(String[] args) {
		
		dadosTriangulo dt = new dadosTriangulo();
		
		dt.b = 5.5f;
		dt.h = 5;
		
		dt.area = (dt.b * dt.h)/2;
		
		System.out.println("Area do triangulo eh " + dt.area);
		
	}

}
