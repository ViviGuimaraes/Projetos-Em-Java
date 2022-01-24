import java.util.Scanner;

public class ForTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("");
		System.out.println(" ..... TESTE WHILE......");
		System.out.println("");

		int y = 0;

		while (y <= 10) {
			System.out.println(y + " Usando o While ");
			y++;
		}


		System.out.println("");
		System.out.println(" ..... TESTANDO FOR ......");
		System.out.println("");

		// ultilizando o comando For
		for (int x = 0; x < 10; x++) {
			System.out.println(x + " Apredendo o For ");
		}

		System.out.println("");
		System.out.println(" ..... TABUADA DO 8 ......");
		System.out.println("");

		// a variante M é o multiplicador do número 8 logo tamém será o contador do lupin

		for (int M = 0; M < 11; M++) {
			System.out.println(" 8 x " + M + " = " + M * 8);

		}
		
		System.out.println("");
		System.out.println(" ..... TESTANDO FOR COM String ......");
		System.out.println(""); 
		
		// Comando for com String "respostas em letras ou palavras"
		
		Scanner leitor = new Scanner (System. in);
		String resposta = "s";
		
		
		for (int p = 0; resposta.equalsIgnoreCase("S"); p++ ) {
			System.out.println( " Linha " + p);
			System.out.println(" Quer continuar (S/N) ? ");
			resposta = leitor.next();
			
		}

	}

}
