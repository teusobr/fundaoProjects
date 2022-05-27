package entidade;

public class Profissional {
	
	
	
	@Override
	public String toString() {
		return "Profissional [idProfissional=" + idProfissional + ", nomeProfissional=" + nomeProfissional
				+ ", cpfProfissional=" + cpfProfissional + ", emailProfissional=" + emailProfissional
				+ ", cepProfissional=" + cepProfissional + ", telefoneProfissional=" + telefoneProfissional
				+ ", especialidade=" + especialidade + "]";
	}
	private Integer idProfissional;
	private String nomeProfissional;
	private String cpfProfissional;
	private String emailProfissional;
	private String cepProfissional;
	private String telefoneProfissional;
	private String especialidade;
	
	
	public Profissional(Integer idProfissional, String nomeProfissional, String cpfProfissional,
			String emailProfissional, String cepProfissional, String telefoneProfissional, String especialidade) {
		super();
		this.idProfissional = idProfissional;
		this.nomeProfissional = nomeProfissional;
		this.cpfProfissional = cpfProfissional;
		this.emailProfissional = emailProfissional;
		this.cepProfissional = cepProfissional;
		this.telefoneProfissional = telefoneProfissional;
		this.especialidade = especialidade;
	}


	public Profissional() {
		// TODO Auto-generated constructor stub
	}


	public Integer getIdProfissional() {
		return idProfissional;
	}


	public void setIdProfissional(Integer idProfissional) {
		this.idProfissional = idProfissional;
	}


	public String getNomeProfissional() {
		return nomeProfissional;
	}


	public void setNomeProfissional(String nomeProfissional) {
		this.nomeProfissional = nomeProfissional;
	}


	public String getCpfProfissional() {
		return cpfProfissional;
	}


	public void setCpfProfissional(String cpfProfissional) {
		this.cpfProfissional = cpfProfissional;
	}


	public String getEmailProfissional() {
		return emailProfissional;
	}


	public void setEmailProfissional(String emailProfissional) {
		this.emailProfissional = emailProfissional;
	}


	public String getCepProfissional() {
		return cepProfissional;
	}


	public void setCepProfissional(String cepProfissional) {
		this.cepProfissional = cepProfissional;
	}


	public String getTelefoneProfissional() {
		return telefoneProfissional;
	}


	public void setTelefoneProfissional(String telefoneProfissional) {
		this.telefoneProfissional = telefoneProfissional;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
}
