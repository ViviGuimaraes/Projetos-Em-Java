package br.senai.arquivo.araylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		DadosContato objDadosContato = new DadosContato();
		Arquivo objeArquivo = new Arquivo();
		
		String caminho = "C:\\Users\\sn1071423\\Desktop\\CONTATO\\contatos.txt";
		
		//OBJETOS DE CONTATO PARA TESTE:
		Contato contato1 = new Contato("Ana da Silva", "ana.silva@gmail.com", "1111-2222", "Jandira");
		Contato contato2 = new Contato("Maria Eduardo", "maria.eduarda@gmail.com", "3333-4444", "Barueri");
		Contato contato3 = new Contato("João da Silva", "joao.silva@gmail.com", "5555-6666", "Osasco");
		Contato contato4 = new Contato("Carlos Alberto", "carlos.alberto@gmail.com", "7777-8888", "Itapevi");
		
		//TESTE DE CADASTRO DE CONTATOS:
		objDadosContato.cadastrarContato(contato1);
		objDadosContato.cadastrarContato(contato2);
		objDadosContato.cadastrarContato(contato3);
		objDadosContato.cadastrarContato(contato4);
		
		
		//PERCORRE O ARRAYLIST DE CONTATOS E GRAVA OS DADOS NO ARQUIVO TXT:
		
		//1º EXEMPLO
//		ArrayList<Contato> listagem = objDadosContato.listarContatos();
//		for(Contato contato : listagem) {
//			System.out.println("NOME: " + contato.getNome() + 
//					           "E-MAIL: " + contato.getEmail() + 
//					           "TELEFONE: " + contato.getTelefone() + 
//					           "CIDADE: " + contato.getCidade());
//		}
		
		//2º EXEMPLO
		String texto = "";
		for(Contato contato : objDadosContato.listarContatos()) {
//			System.out.println(contato.getNome() + ";" + 
//					           contato.getEmail() + ";" + 
//					           contato.getTelefone() + ";" +
//					           contato.getCidade());
			
			texto += contato.getNome() + ";" + 
			         contato.getEmail() + ";" + 
			         contato.getTelefone() + ";" +
			         contato.getCidade() + "\n";
			
		}
		
		System.out.println(texto);
		
		objeArquivo.escrever(caminho, texto);
		
		System.out.println("TOTAL DE CONTATOS CADASTRADOS: " + objDadosContato.contarContatos());
		
	}

}












