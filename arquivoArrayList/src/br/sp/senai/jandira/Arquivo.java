package br.sp.senai.jandira;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	
	/* é u MÉTODO para  CRIA E GRAVA OS DADOS NO ARQUIVO */
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
	
	/*Método para LER DADOS NO ARQUIVO */
	public String ler(String caminho) {
		
		
		// uma variável -atributo
		String conteudo = "";
		
		//uma estrutura  que RECUPERA OS DADOS DO ARQUIVO 
		//E ARMAZENA EM MEMÓRIA PARA A MANIPULAÇÃO
		try {
			
			//ABRE O ARQUIVO
			FileReader arquivo = new FileReader(caminho);
			
			//ARMAZENA O CONTEÚDO DO ARQUIVO EM MEMÓRIA
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
