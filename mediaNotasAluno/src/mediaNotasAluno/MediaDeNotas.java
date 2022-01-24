package mediaNotasAluno;

import java.util.Scanner;

public class MediaDeNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		double n1, n2, n3, n4, media;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Nome do aluno: ");
		nome = leitor.next();
		
		System.out.print("Nota do 1° Bimestre: ");
		n1 =leitor.nextDouble();
		
		System.out.print("Nota do 2° Bimestre: ");
		n2 =leitor.nextDouble();

		System.out.print("Nota do 3° Bimestre: ");
		n3 =leitor.nextDouble();
		
		System.out.print("Nota do 4° Bimestre: ");
		n4 =leitor.nextDouble();
		
		leitor.close();
		 
		System.out.println();
		
		
		//calcular a média do aluno
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println(" A média do(a) aluno(a) " + nome + " é: " + media);
		
		if (media >= 6 ) {
			System.out.println("----APROVADO----");
		}
			
			else if (media <4) {
				System.out.println("----REPROVADO----");
			}
		
				else   {
					System.out.println("----RECUPERAÇÃO----");
				}
			}
				
		}
	


