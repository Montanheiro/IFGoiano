import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("============== PARAMETROS DO SISTEMA ===============");
		System.out.print("Digite a nota mínima para atingir a média: ");
		double notaMinima = input.nextDouble();
		System.out.print("Digite a quantidade de bimestres: ");
		int bimestres = input.nextInt();
		System.out.print("Digite a quantidade de alunos: ");
		int alunos = input.nextInt();
		
		String aluno[] = new String[alunos];
		double notas[][] = new double[alunos][bimestres];
		double media[] = new double[alunos];
		
		System.out.println("\n================ DADOS PARA CALCULO ================");
		for(int i = 0; i < alunos; ++i){
			System.out.print("\nDigite o nome do " + (i+1) + "° aluno: ");
			aluno[i] = input.next();
			for(int j = 0; j < bimestres; ++j){
				System.out.print("Digite a nota do aluno " + aluno[i] + 
						" no " + (j + 1) + "º bimestre: ");
				notas[i][j] = input.nextDouble();				
			}
		}
		
		for(int i = 0; i < alunos; ++i){
			for(int j = 0; j < bimestres; ++j){
				media[i] += notas[i][j];
			}
			media[i] = media[i] / bimestres;
		}
		
		System.out.println("\n================ RESULTADOS FINAIS ================");
		for(int i = 0; i < alunos; ++i){
			System.out.print("Aluno: " + aluno[i] + 
					"\tMédia: " + media[i] + "\tSituação: ");
			if(media[i] >= notaMinima){
				System.out.println("Aprovado");
			}else{
				System.out.println("Reprovado");
			}
		}
	}
}
