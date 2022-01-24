package br.senai.arquivo.araylist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	
	public DadosContato objDadosContato = new DadosContato(); 
	
	/*
	Cria o arquivo quando esse não exitir grava dados
	no arquivo.
	*/
	public boolean escrever(String caminho, String texto) {
		
		try {
			
			//OBJETO QUE REPRESENTA O ARQUIVO
			FileWriter arquivo = new FileWriter(caminho);
			
			//OBJETO QUE REPRESENTA A MANIPULAÇÃO (ESCREVER) DOS DADOS DO ARQUIVO
			PrintWriter escreverArq = new PrintWriter(arquivo);
			
			escreverArq.append(texto);
			escreverArq.close();
			return true;
			
		}catch(IOException e){
			
			System.out.println("ERRO: " + e.getMessage());
			return false;
					
		}
		
	}
	
	public DadosContato ler(String caminho){
		
		try {
			
			//REPRESENTA O ARQUIVO EM MODO DE LEITURA
			FileReader arquivo = new FileReader(caminho);
			
			//REPRESENTA O DADO DE LEITURA NA MÉMORIA PRINCIPAL DO PROGRAMA.
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			
			String linha = "";
			
			linha = lerArquivo.readLine();
			while(linha != null) {
				
				String[] dadosLinha = linha.split(";");
				
				Contato objContato = new Contato();
				
				objContato.setNome(dadosLinha[0]);
				objContato.setEmail(dadosLinha[1]);
				objContato.setTelefone(dadosLinha[2]);
				objContato.setCidade(dadosLinha[3]);
				
				objDadosContato.cadastrarContato(objContato);
				
				linha = lerArquivo.readLine();
				
			}
			
			arquivo.close();
			return objDadosContato;			

		}catch(IOException e){
			
			System.out.println("ERRO: " + e.getMessage());
			return null;
			
		}
		
	}
	
}
