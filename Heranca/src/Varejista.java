import javax.swing.JOptionPane;

public class Varejista extends PJ {
	
	String CF;
	
	public Varejista(){
		super();
		CF = "";
	}
	public Varejista(String nome, String telefone, String endereco, String CNPJ, String IE, String CF){
		super(nome, telefone, endereco, CNPJ, IE);
		this.CF = CF;
	}
	public void ImprimirDados(){
		JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nTelefone: " + telefone + "\nEndereço: "+
				endereco + "\nCNPJ: " + CNPJ + "\nIE: " + IE + "\nCF: " + CF, "Varejista", 0);
	}

}
