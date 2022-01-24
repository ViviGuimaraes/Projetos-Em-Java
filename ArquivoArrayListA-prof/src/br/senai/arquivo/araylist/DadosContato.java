package br.senai.arquivo.araylist;

import java.util.ArrayList;

public class DadosContato {
	

	//ATRIBUTOS: 
	ArrayList<Contato> contatos = new ArrayList<Contato>();
	Contato contato = new Contato();
	
	//MÉTODOS:
	public void cadastrarContato(Contato c) {
		contatos.add(c);
	}
	
	public ArrayList<Contato> listarContatos(){
		
		return contatos;
		
	}
	
	public int contarContatos() {
		return contatos.size();
	} 

}









