package persistencia;


import entidade.Profissional;

public class ProfissionalDao extends Dao {
	public void cadastrar(Profissional p)throws Exception{
		//abrir conexao
		open();
		
		
		stmt = con.prepareStatement("insert into profissional values(null,?,?,?,?,?,?)");
		stmt.setString(1, p.getNomeProfissional());
		stmt.setString(2, p.getCpfProfissional());
		stmt.setString(3, p.getEmailProfissional());
		stmt.setString(4, p.getCepProfissional());
		stmt.setString(5, p.getTelefoneProfissional());
		stmt.setString(6, p.getEspecialidade());
		
		stmt.execute();
		close();
	}

}
