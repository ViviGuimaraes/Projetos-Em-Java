package br.sp.senai.jandira;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	
	/* � u M�TODO para  CRIA E GRAVA OS DADOS NO ARQUIVO */
	public boolean escrever(String caminho, String conteudo) {
		
		// uam estrutura para 
		try {
			
			FileWriter arquivo = new FileWriter(caminho);
			PrintWriter gravarArquivo = new PrintWriter(arquivo);
			
			gravarArquivo.append(conteudo);
			gravarArquivo.close();
			
			return true;
			
		}catch(IOException e){
			
			System.out.println("ERRO: " + e.getMessage());
			return false;
			
		}
		
	}
	
	/*M�todo para LER DADOS NO ARQUIVO */
	public String ler(String caminho) {
		
		
		// uma vari�vel -atributo
		String conteudo = "";
		
		//uma estrutura  que RECUPERA OS DADOS DO ARQUIVO 
		//E ARMAZENA EM MEM�RIA PARA A MANIPULA��O
		try {
			
			//ABRE O ARQUIVO
			FileReader arquivo = new FileReader(caminho);
			
			//ARMAZENA O CONTE�DO DO ARQUIVO EM MEM�RIA
			BufferedReader conteudoArquivo = new BufferedReader(arquivo);
			
			//RECUPERA OS DADOS DO ARQUIVO
			try {
			String linha = "";
			linha = conteudoArquivo.readLine();
			while(linha != null) {
				
				//conteudo = conteudo + linha;
				conteudo += linha + "\n";
				linha = conteudoArquivo.readLine();
				
			}
			
			conteudoArquivo.close();
			return conteudo;
			
			}catch(IOException e) {
				
				System.out.println("ERRO: " + e.getMessage());
				return "";
				
			}
			
		}catch(FileNotFoundException e){
			
			
			System.out.println("ERRO: " + e.getMessage());
			return "";
		}
		
	}

}
