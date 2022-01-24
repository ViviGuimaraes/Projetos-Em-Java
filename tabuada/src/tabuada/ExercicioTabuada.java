package tabuada;

import java.util.Scanner;

public class ExercicioTabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner (System.in);
		
		int multi1;
		int multi2;
		int contador = 0;
		int produto;
		
		System.out.println("");
		
		System.out.print(" Qual o multiplicando ? ");
		multi1 =leitor.nextInt();
		
		System.out.println("");
		
		System.out.print(" Qual o máximo de multiplicador ? ");
		multi2 =leitor.nextInt();
		
		System.out.println("");
		
		System.out.println(" TABUADA DO " + multi1);
		System.out.println("----------------------------------");
		System.out.println("");
		
		leitor.close();
		
		
		
		while (contador <= multi2){
			produto = multi1 * contador;
			
			System.out.println(multi1 + " X " + contador  + " = " + produto);
			contador++;
			
			
			System.out.println("----------------------------------");
			}
		}

	}


