
public class Media {

	public static void main(String[] args) 
	{

	Aluno ref = new Aluno();
	
	ref.nome = "Caique";
	ref.disciplina = "POO";
	
	ref.nota1 = 8.5f;
	ref.nota2 = 6.9f;
	ref.nota3 = 4.8f;
	ref.nota4 =	9;
	
	ref.media = (ref.nota1 + ref.nota2 + ref.nota3 + ref.nota4)/4;
	
	System.out.println("A media do aluno: " + ref.nome + " na disciplina " + ref.disciplina + " é: " + ref.media);

	if (ref.media >= 7){
	
		System.out.println("O aluno foi aprovado");
		
	} else {
		System.out.println("O aluno foi reprovado");
		
	}

	}

}
