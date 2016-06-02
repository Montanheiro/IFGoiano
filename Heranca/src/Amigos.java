import javax.swing.JOptionPane;

public class Amigos extends PF {
	String blog;
	
	public Amigos(){
		super();
		blog = "";
	}
	
	public Amigos(String nome, String telefone, String endereco, String RG, String CPF, String blog){
		super(nome, telefone, endereco, RG, CPF);
		this.blog = blog;
	}
	public void ImprimirDados(){
		JOptionPane.showMessageDialog(null,nome + "\n" + telefone + "\n" +
				endereco + "\n" + RG + "\n" + CPF + "\n" + blog, "Amigos", 0);
	}
}
