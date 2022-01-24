import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {

		String texto1 = " rodrigão";
		String texto2 = " Vitinho  ";
		String texto3 = "  professor Cristiano   ";

		// criação de um objeto do tipo ARRAYLIST de string

		ArrayList<String> dados = new ArrayList<String>();

		// adicionando valores no arraylist dados :

		dados.add(texto1);
		dados.add(texto2);
		dados.add(texto3);
		dados.add("Cláudio");

		// removendo elementos de um arraylist
		// dados.remove(1);

		if (dados.isEmpty()) {
			System.out.println(" o aaray está vazio ");
		} else {
			System.out.println(" o array possui dados : " + dados.size());
			System.out.println(" o array possui dados : " + dados);

			System.out.println("");
			System.out.println(" Indice 0: " + dados.get(0));
			System.out.println(" Indice 1: " + dados.get(1));
			System.out.println(" Indice 2: " + dados.get(2));
			System.out.println(" Indice 3: " + dados.get(3));

			System.out.println("");
		}

		// manipulando arraylist com o uso de loops de repetição

		// loop for :
		System.out.println("___________________ Loop For____________________");
		System.out.println("");

		for (int i = 0; i < dados.size(); i++) {
			System.out.println(" indice : " + i + " valor : " + dados.get(i));
		}

		// loop foreach:
		System.out.println("");
		System.out.println("___________________ Loop Foreach_______________");
		System.out.println("");
		
		for (String dado : dados) {

			System.out.println(" Valor : " + dado);

		}
		
		//método foreach:
		
		System.out.println("");
		System.out.println("___________________ Método Foreach vom lambda_______________");
		System.out.println("");
		
		dados.forEach(dado->{
			System.out.println(" Valor : " + dado);
		});
	}

}
