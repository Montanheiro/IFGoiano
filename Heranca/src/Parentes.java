import javax.swing.JOptionPane;

public class Parentes extends PF {
	String email;
	
	public Parentes(){
		super();
		email = "";
	}
	public Parentes(String nome, String telefone, String endereco, String RG, String CPF, String email){
		super(nome, telefone, endereco, RG, CPF);
		this.email = email;
	}
	
	public void ImprimirDados(){
		JOptionPane.showMessageDialog(null, nome + "\n" + telefone + "\n" +
				endereco + "\n" + RG + "\n" + CPF + "\n" + email, "Parentes", 0);
	}

}
