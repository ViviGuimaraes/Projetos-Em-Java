package parOuImpar;

public class AtivParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int contador = 0;
		  
		while (contador < 100) {
			contador++;
			if (contador % 2 == 0) {
				System.out.println(contador + " - Par;");
				}
				else { System.out.println( contador + " - Impar;");
			}
			
		
		}

	}

}
