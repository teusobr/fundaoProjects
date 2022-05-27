package telas;

import java.util.Date;

import javax.swing.JOptionPane;

public class LerCliente {
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
	
	public String nomeCliente() {
		return JOptionPane.showInputDialog("Informe o nome");
	}
	
	
	public String emailCliente() {
		return JOptionPane.showInputDialog("Informe o E-mail");
	}
	
	public String senhaCliente() {
		return JOptionPane.showInputDialog("Informe a Senha");
	}
	
	public String cpfCliente() {
		return JOptionPane.showInputDialog("Informe o CPF");
	}
	
	public String cepCliente() {
		return JOptionPane.showInputDialog("Informe o Cep");
	}
	
	public String telefoneCliente() {
		return JOptionPane.showInputDialog("Informe o Telefone");
	}

	
	
}
	
