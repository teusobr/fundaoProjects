package telas;

import java.util.Date;

import javax.swing.JOptionPane;

public class LerProfissional {
/*Método para ler os dados do usuário
 * Toda entrada de dados deve ser do tipo String
 * 
 * private Integer idProduto;
	private String nome;
	private Integer estoque;
	private Double preco; 
	private Date validade;*/
	
	public String lerId() {
		return JOptionPane.showInputDialog("Informe o ID");
	}
	
	public String nomeProfissional() {
		return JOptionPane.showInputDialog("Informe o nome");
	}
	
	
	public String cpfProfissional() {
		return JOptionPane.showInputDialog("Informe o CPF");
	}
	
	public String emailProfissional() {
		return JOptionPane.showInputDialog("Informe o e-mail ");
	}
	
	public String cepProfissional() {
		return JOptionPane.showInputDialog("Informe o Cep");
	}
	
	public String telefoneProfissional() {
		return JOptionPane.showInputDialog("Informe o Telefone");
	}
	
	public String telefoneCliente() {
		return JOptionPane.showInputDialog("Informe o Telefone");
	}
	
	public String especialidade() {
		return JOptionPane.showInputDialog("Informe a especialidade");
	}


	
	
}
	
