package exercicioEleicao;

import java.util.Scanner;

public class ApuracaoVotos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		System.out.println("-----------------------------");
		System.out.println("       ELEIÇÃO SINDICAL      ");
		System.out.println("-----------------------------");
		
		Scanner leitor = new  Scanner (System.in);
		
		String candidato1;
		String candidato2;
		String candidato3;
		int votos1;
		int votos2;
		int votos3;
		int votosNulos;
		int votosBrancos;
		int eleitores;
		double percentual1;
		double percentual2;
		double percentual3;
		double resultado1; 
		
		System.out.println("");
		
		System.out.print("Nome do(a) cantidato(a) 1 : ");
		candidato1 = leitor.next();
		
		System.out.print("Nome do(a) cantidato(a) 2 : ");
		candidato2 = leitor.next();
		
		System.out.print("Nome do(a) cantidato(a) 3 : ");
		candidato3 = leitor.next();
		
		System.out.println("");
		
		System.out.println("----------APURAÇÃO-----------");
		
		System.out.println("");
		
		System.out.print("Total de votos para " + candidato1 + ": ");
		votos1 = leitor.nextInt();
		
		System.out.print("Total de votos para " + candidato2 + ": ");
		votos2 = leitor.nextInt();
		
		System.out.print("Total de votos para " + candidato3 + ": ");
		votos3 = leitor.nextInt();
		
		System.out.println("");
		
		System.out.print("Total de votos nulos: ");
		votosNulos = leitor.nextInt();
		
		System.out.print("Total de votos brancos: ");
		votosBrancos = leitor.nextInt();
		
		System.out.print("Total de votos : ");
		resultado1 = votos1 + votos2 + votos3 + votosBrancos + votosNulos;
		System.out.print(resultado1);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("-----------------------------");
		System.out.println("          RESULTADO          ");
		System.out.println("-----------------------------");
		
		System.out.println("");
		
		System.out.print("Total de eleitores: ");
		eleitores = leitor.nextInt();
		
		System.out.println("");
		
		
		System.out.println("Percentual de votos do(a) " + candidato1 + ":");
		
		percentual1 =  ((votos1 * 100)/ resultado1);
		System.out.println(percentual1);
		
		System.out.println("Percentual de votos do(a) " + candidato2 + ":");
		
		percentual2 =  ((votos2 * 100)/ resultado1);
		System.out.println(percentual2);
		
		
		System.out.println("Percentual de votos do(a) " + candidato3 + ":");
		
		percentual3 =  ((votos3 * 100)/resultado1);
		System.out.println(percentual3);
		
		
		System.out.println("");
		
		
		System.out.println("                FIM          ");
		System.out.println("-----------------------------");
	}

}
