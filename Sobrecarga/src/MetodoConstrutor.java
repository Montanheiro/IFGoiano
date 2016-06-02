public class MetodoConstrutor {

	String nome, funcao, salario;
	
	public MetodoConstrutor(String nome){
		this.nome = nome;
		
		System.out.println(this.nome);	
	}
	public MetodoConstrutor(String nome, String funcao){
		this.nome = nome;
		this.funcao = funcao;
		
		System.out.println(nome + " " + funcao);
	}
	public MetodoConstrutor(String nome, String funcao, String salario){
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
		
		System.out.println(nome + " " + funcao + " " + salario);
	}
}
