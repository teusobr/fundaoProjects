package telas;

import javax.swing.JOptionPane;

public class MenuProjeto {
	
	public int lerMenu() {
	try {
	
		String msg = "Menu do Sistema\n[1] - Cadastrar Cliente\n"
				+"[2] - Cadastrar Profissional\n";
		
		int opc = Integer.parseInt(JOptionPane.showInputDialog(msg));
		return opc;
	
	}catch (Exception e) {
	
	
	}
	return 0;
	
	
	}
}
