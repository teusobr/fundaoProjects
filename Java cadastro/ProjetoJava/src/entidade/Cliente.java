package entidade;

import java.util.Date;

public class Cliente {
	
	private Integer idCliente;
	private String nomeCliente;
	private String emailCliente;
	private String senhaCliente;
	private String cpfCliente;
	private String cepCliente;
	private String telefoneCliente;
	
	
	
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", emailCliente=" + emailCliente
				+ ", senhaCliente=" + senhaCliente + ", cpfCliente=" + cpfCliente + ", cepCliente=" + cepCliente
				+ ", telefoneCliente=" + telefoneCliente + "]";
	}



	public Cliente(Integer idCliente, String nomeCliente, String emailCliente, String senhaCliente, String cpfCliente,
			String cepCliente, String telefoneCliente) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.senhaCliente = senhaCliente;
		this.cpfCliente = cpfCliente;
		this.cepCliente = cepCliente;
		this.telefoneCliente = telefoneCliente;
	}



	public Cliente() {
		// TODO Auto-generated constructor stub
	}



	public Integer getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}



	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public String getEmailCliente() {
		return emailCliente;
	}



	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}



	public String getSenhaCliente() {
		return senhaCliente;
	}



	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}



	public String getCpfCliente() {
		return cpfCliente;
	}



	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}



	public String getCepCliente() {
		return cepCliente;
	}



	public void setCepCliente(String cepCliente) {
		this.cepCliente = cepCliente;
	}



	public String getTelefoneCliente() {
		return telefoneCliente;
	}



	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
	
	
}
