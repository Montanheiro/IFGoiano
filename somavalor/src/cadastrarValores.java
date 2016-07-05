
public class cadastrarValores {

	public static void main(String[] args) {
		
		valoresClasse ref = new valoresClasse();

		ref.a = 5;
		ref.b = 8;
		ref.c = ref.a + ref.b;
		
		System.out.println("Total = "+ ref.c);
		
		
	}

}
