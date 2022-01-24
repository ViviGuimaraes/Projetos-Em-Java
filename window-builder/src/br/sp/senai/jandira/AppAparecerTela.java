package br.sp.senai.jandira;

import br.sp.senai.jandira.model.Cliente;
import br.sp.senai.jandira.model.Usuario;
import br.sp.senai.jandira.ui.FrameCadastroContato;

public class AppAparecerTela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cliente c = new Cliente ();
		
		Usuario u = new Usuario();
		
		FrameCadastroContato tela = new FrameCadastroContato ();
		tela.setVisible(true);
		
		
		
	}

}
