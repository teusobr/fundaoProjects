package controle;

import java.util.Date;

import javax.swing.JOptionPane;

import entidade.Cliente;
import entidade.Profissional;
import persistencia.ClienteDao;
import persistencia.ProfissionalDao;
import telas.LerCliente;
import telas.LerProfissional;
import telas.MenuProjeto;


public class Principal {
	public static void main(String[] args) {
		try {
			Cliente prod
			= new Cliente();
			LerCliente ler = new LerCliente();
			MenuProjeto menu = new MenuProjeto();
			ClienteDao pd = new ClienteDao();
			int opc = 0;
			
			Profissional pros
			= new Profissional();
			LerProfissional lec = new LerProfissional();
			MenuProjeto meni = new MenuProjeto();
			ProfissionalDao pdl = new ProfissionalDao();
			
			//Enquanto opc for zero, ele vai fazer o do()
			
			do {
				opc = menu.lerMenu();
				switch (opc) {
				case 1:
					prod.setNomeCliente(ler.nomeCliente());
					prod.setEmailCliente(ler.emailCliente());
					prod.setSenhaCliente(ler.senhaCliente());
					prod.setCpfCliente(ler.cpfCliente());
					prod.setCepCliente(ler.cepCliente());
					prod.setTelefoneCliente(ler.telefoneCliente());
					pd.cadastrar(prod);
					
					
					break;
				
				case 2:
					
					
					
					pros.setNomeProfissional(lec.nomeProfissional());
					pros.setCpfProfissional(lec.cpfProfissional());
					pros.setEmailProfissional(lec.emailProfissional());
					pros.setCepProfissional(lec.cepProfissional());
					pros.setTelefoneProfissional(lec.telefoneProfissional());
					pros.setEspecialidade(lec.especialidade());
					pdl.cadastrar(pros);
					
					
					break;
					
				case 3:
					
					
					
					break;
				
					
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida");
				}
				
				
			}while(opc !=0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
