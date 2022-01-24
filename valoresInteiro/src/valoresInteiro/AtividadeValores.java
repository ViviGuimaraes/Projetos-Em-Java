package valoresInteiro;

import java.util.Scanner;

public class AtividadeValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double v1, v2, v3;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("VALORES");
		System.out.println(); 
		
		System.out.print("Digite o valor 1 : ");
		v1 =leitor.nextDouble();
		
		System.out.print("Digite o valor 2 : ");
		v2 =leitor.nextDouble();
		
		System.out.print("Digite o valor 3 : ");
		v3 =leitor.nextDouble();
		
		leitor.close();
		
		System.out.println();
		
		
		if (v1 > v2 && v1 > v3) { 
			System.out.println(" Valor 1 é maior! ");
		}
		else if (v2 > v1 && v2 >v3)  {
			System.out.println(" Valor 2 é maior! ");
		} else {
			System.out.println(" Valor 3 é maior! ");
		}
	}

}
