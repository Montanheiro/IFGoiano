import javax.swing.JOptionPane;

public class CadastraPessoa {

	public static void main(String[] args) {
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n\n 1 - Pessoa física\n 2 - Pessoa Jurídica"));
		
		String nome = JOptionPane.showInputDialog("Digite o nome");
		String telefone = JOptionPane.showInputDialog("Digite o telefone");
		String endereco = JOptionPane.showInputDialog("Digite o endereço");
		
		if(opcao == 1){
			
			String RG = JOptionPane.showInputDialog("Digite o RG");
			String CPF = JOptionPane.showInputDialog("Digite o CPF");
			int opcaoPF = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n\n1 - Amigos\n2 - Parentes"));
			
			if (opcaoPF == 1){
				String blog = JOptionPane.showInputDialog("Digite o blog");
				
				Amigos objAmigos = new Amigos(nome, telefone, endereco, RG, CPF, blog);
				objAmigos.ImprimirDados();
			}
			
			if(opcaoPF == 2){
				String email = JOptionPane.showInputDialog("Digite o email");
				Parentes objParentes = new Parentes(nome, telefone, endereco, RG, CPF, email);
				
				objParentes.ImprimirDados();
			}
		}
		if(opcao == 2){
			String CNPJ = JOptionPane.showInputDialog("Digite o CNPJ");
			String IE = JOptionPane.showInputDialog("Digite a Inscrição Estadual");
			int opcaoFilial = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n\n1 - Atacadista\n2 - Varejista"));
			
			if(opcaoFilial == 1){
				String NF = JOptionPane.showInputDialog("Digite o número da Nota Fiscal");
					
				Atacadista objAtacadista = new Atacadista(nome, telefone, endereco, CNPJ, IE, NF);
				objAtacadista.ImprimirDados();
			}
			if(opcaoFilial == 2){
				String CF = JOptionPane.showInputDialog("Digite o número da Cupom Fiscal");
				
				Varejista objVarejista = new Varejista(nome, telefone, endereco, CNPJ, IE, CF);
				objVarejista.ImprimirDados();
			}
			
		}
	}
}
