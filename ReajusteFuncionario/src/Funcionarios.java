public class Funcionarios {

	String nome, funcao;
	double salarioAtual, reajuste, salarioNovo;
	
	public static double calcular(double salarioAtual){
		return (salarioAtual * 0.1);
	}
	public static void imprime(String nome, String funcao, double salarioAtual, double reajuste, double salarioNovo){
		System.out.println("Nome: " + nome + 
							"\nFunção: " + funcao + 
							"\nSalário Atual: " + salarioAtual +
							"\nValor Reajuste: " + reajuste +
							"\nSalário Novo: " + salarioNovo);
	}
}