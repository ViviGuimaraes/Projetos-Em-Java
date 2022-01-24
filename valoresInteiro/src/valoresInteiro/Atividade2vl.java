package valoresInteiro;

import java.util.Scanner;

public class Atividade2vl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1, x2, x3;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("VALORES MAIOR E MENOR");
		System.out.println(); 
		
		System.out.print("Digite o valor 1 : ");
		x1 =leitor.nextDouble();
		
		System.out.print("Digite o valor 2 : ");
		x2 =leitor.nextDouble();
		
		System.out.print("Digite o valor 3 : ");
		x3=leitor.nextDouble();
		
		leitor.close();
		
		System.out.println();
		
		if (x1 > x2 && x1 > x3){
			System.out.println("O maior valor é : " + x1);
			}
		
		else if (x2 > x1 && x2 > x3 ) {
				System.out.println("O maior valor é : " + x2);
			}
			
		else {System.out.println("O maior valor é : " + x3);
				}
			
			
		if (x1 < x2 && x1 < x3){
			System.out.println ("O menor valor é : " + x1 );
			}
		else if (x2 < x1 && x2 < x3 ) {
			System.out.println("O menor valor é : " + x2);
		}
		
	else {System.out.println("O menor valor é : " + x3);
			}

	}
}
	


