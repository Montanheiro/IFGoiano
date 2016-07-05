package dadosPessoais;

public class Dados implements Pessoa {

	String nome, telefone, cpf;
	
	public void ReceberDados(String nome, String telefone, String cpf){
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	public void ImprimirDados(){
		System.out.println("Nome: " + nome +
				"\nTelefone: " + telefone +
				"\nCPF: " + cpf);
	}
}
