package leitura;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		
		int primeiroNumero;
		int segundoNumero;
		int resultado; 
		String nome;
		
		System.out.print("Qual o primeiro número ?");
		primeiroNumero = leitor.nextInt();
		
		System.out.print("Qual o segundo número ?");
		segundoNumero = leitor.nextInt(); 

		System.out.print("Qual o seu nome ?");
		nome = leitor.next(); 
		
		System.out.println("Olá " + nome);
	  resultado = primeiroNumero + segundoNumero;
	  System.out.print("O resultado é " + resultado);
	
	  
	}
}
	

