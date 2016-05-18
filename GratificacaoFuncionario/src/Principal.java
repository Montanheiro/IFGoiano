
public class Principal {

	public static void main(String[] args) {
		
		Gerente jao = new Gerente("Jao", 1500, 200);
		jao.ImprimirDadosGerente();
		
		Secretario juse = new Secretario("Jusé", 1700, 400, 300);
		juse.ImprimirDadosSecretario();
		
		Auxiliar caique = new Auxiliar("Caique", 0, 30, 300, 300, 300);
		caique.ImprimirDadosAuxiliar();

	}

}
