package matriz;

public class TesteArray {
public static void main (String[]args) {
	
	int notas[] = new int [4];
	
	notas [0] = 8;
	notas[1] = 7;
	notas [2] = 10;
	notas [3] = 6; 
	
	double resultadoSoma= notas[2] + notas [0];
	System.out.println(resultadoSoma);
	
	System.out.println(notas[3]);
	notas [3] = 9;
	System.out.println(notas[3]);
	
	String linguagens [] = new String [5];
	
	linguagens [0] = " Ronaldo ";
	linguagens [1] = " Foi ";
	linguagens [2] = " ao mercado ";
	linguagens [3] = " comprar ";
	linguagens [4] = " uva ";
	
	System.out.println(linguagens [0] + linguagens [1] + linguagens [2] + linguagens [3] + linguagens [4]);
	
	System.out.println(linguagens.length);
	
	int i = 0;
	
	while (i < linguagens.length) {
	System.out.println(linguagens[i]);
	i++;
	}
	
	
	System.out.println("иииииииииииии");
	for (int contador = 0; contador < linguagens.length; contador ++ )
	System.out.println(linguagens[contador]);
}


}
