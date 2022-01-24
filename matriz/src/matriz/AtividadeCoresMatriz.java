package matriz;

import java.util.Scanner;

public class AtividadeCoresMatriz {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String cores[] = new String[10];

		cores[0] = " Azul ";
		cores[1] = " Amarelo ";
		cores [2] = " Vermelho ";
		cores [3] = " Roxo ";
		cores [4] = " Preto ";
		cores [5] = " Verde ";
		cores [6] = " Cinza ";
		cores [7] = " Branco ";
		cores [8] = " Laranja ";
		cores [0] = " Lilás ";
		
		System.out.println(" Escolha uma  cor: 0-Azul, 1- Amarelo, 2-Vermelho, 3-Roxo, 4-Preto, 5-Verde,\r\n"
				+ "6-Cinza, 7-Branco, 8-Laranja e 9-Lilás " );
	}
}
