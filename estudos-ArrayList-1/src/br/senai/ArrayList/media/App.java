package br.senai.ArrayList.media;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Media objMedia = new Media();
		objMedia.exibirNotas();
		objMedia.recebernotas();
		
		System.out.println("____________________________________");
		System.out.println(" Média final : " + objMedia.calcularMedia());

	}

}
