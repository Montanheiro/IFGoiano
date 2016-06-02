
public class PF extends Pessoa{

	String RG;
	String CPF;
	
	public PF(){
		super();
		RG = "";
		CPF = "";
	}
	
	public PF(String nome, String telefone, String endereco, String RG, String CPF){
		super(nome, telefone, endereco);
		this.RG = RG;
		this.CPF = CPF;
	}
}
