package persistencia;

import entidade.Cliente;

public class ClienteDao extends Dao {
	public void cadastrar(Cliente p)throws Exception{
		//abrir conexao
		open();
		
		
		stmt = con.prepareStatement("insert into cliente values(null,?,?,?,?,?,?)");
		stmt.setString(1, p.getNomeCliente());
		stmt.setString(2, p.getEmailCliente());
		stmt.setString(3, p.getSenhaCliente());
		stmt.setString(4, p.getCpfCliente());
		stmt.setString(5, p.getCepCliente());
		stmt.setString(6, p.getTelefoneCliente());
		
		stmt.execute();
		close();
	}

	
		
	}