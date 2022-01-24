package br.sp.senai.jandira;

import br.sp.senai.jandira.frame.copy.frame;

public class Appmain {

	public static void main(String[] args) {
		
		
		// colocar duas barras \\ dentro da String é chamado de escape character
		//é para transformar a caractere em string que ela não é insiderada uma
		
		
		//String caminho = "C:\\Users\\21276441\\Desktop\\testeJava\\aula.txt";
		//String conteudo = " a aula está boa. ";
		//String lorem = " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc maximus dolor est, eget tristique sem aliquet eget. Fusce purus ex, varius in placerat nec, semper id justo. Proin diam odio, interdum a tortor vitae, pellentesque fermentum orci. Quisque eleifend posuere neque, eget pulvinar lacus eleifend at. Curabitur pretium eros in nisl egestas laoreet. Nunc massa velit, blandit at rutrum vel, congue sit amet ex. Morbi a quam in erat commodo dignissim ut vitae turpis. Phasellus vulputate volutpat libero et auctor. Vestibulum quis luctus nibh. Suspendisse placerat massa purus, a mattis quam hendrerit eu. Pellentesque scelerisque lacinia arcu, quis condimentum purus convallis in. Donec quis ex et eros gravida tempus quis ut dolor. Nunc faucibus neque non facilisis faucibus. Nullam at sagittis massa. Etiam at dapibus enim. ";
		
		
		//System.out.println(caminho);
		
		//Arquivo objArquivo = new Arquivo();
		
		
		// o objeto está chamando o método da clase Arquivo para executar 
		// o comando de escrever o caminho 
		
		
		//objArquivo.escrever(caminho, lorem );
		
		//String conteudoArquivo = objArquivo.ler(caminho);
		//conteudoArquivo += "\n" + lorem;
		
		
		//System.out.println(conteudoArquivo);
		
		frame objTela = new frame();
		objTela.setVisible(true);

	}

}
