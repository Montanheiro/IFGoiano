import javax.swing.JOptionPane;

public class Atacadista extends PJ {
	
	String NF;
	
	public Atacadista(){
		super();
		NF = "";
	}
	
	public Atacadista(String nome, String telefone, String endereco, String CNPJ, String IE, String NF){
		super(nome, telefone, endereco, CNPJ, IE);
		this.NF = NF;
	}
	
	public void ImprimirDados(){
		JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nTelefone: " + telefone + "\nEndereço: "+
				endereco + "\nCNPJ: " + CNPJ + "\nIE: " + IE + "\nNF: " + NF, "Atacadista", 0);
	}

}
