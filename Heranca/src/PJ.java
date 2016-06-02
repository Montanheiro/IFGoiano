public class PJ extends Pessoa{
	
	String CNPJ;
	String IE;
	
	public PJ(){
		super();
		CNPJ = "";
		IE = "";
	}
	
	public PJ(String nome, String telefone, String endereco, String CNPJ, String IE){
		super(nome, telefone, endereco);
		this.CNPJ = CNPJ;
		this.IE = IE;
	}
		
}
