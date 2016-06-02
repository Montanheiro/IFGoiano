public class Principal {

	public static void main(String[] args) {
		
		Funcionario objFuncionario = new Funcionario("Jose", "Professor");
		objFuncionario.setSalarioBruto(1550);
		objFuncionario.calcularINSS();
		
		ContraCheque.imprimeContraCheque(objFuncionario);
		
	}

}
