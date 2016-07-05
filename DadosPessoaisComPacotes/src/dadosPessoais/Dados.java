package dadosPessoais;

public class Dados implements Pessoa {

	String nome, telefone, cpf;
	
	public void receberDados(String nome, String telefone, String cpf){
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	public void imprimirDados(){
		System.out.println("Nome: " + nome +
				"\nTelefone: " + telefone +
				"\nCPF: " + cpf);
	}
}
