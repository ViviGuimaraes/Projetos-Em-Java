package br.senai.ArrayList.media;

import java.util.ArrayList;
import java.util.Scanner;

public class Media {

	Scanner sc;

	ArrayList<Double> arrNotas = new ArrayList<Double>();

	private double soma;
	private double media;
	
	//método construtor:
	
		public Media() {

		sc = new Scanner(System.in);

		/*
		 * arrNotas.add(6.0); arrNotas.add(5.4); arrNotas.add(9.5); arrNotas.add(9.5);
		 */

	}

	public void recebernotas() {
		int cont = 1;
		while (cont <= 4) {
			System.out.println(" digite a " + cont + "º Nota : " );
			arrNotas .add(sc.nextDouble());
			cont ++;
		}
	}

	public void exibirNotas() {
		for (int i = 0; i < arrNotas.size(); i++) {

			System.out.println(" Nota " + i + ": " + arrNotas.get(i));
		}
	}

	public double calcularMedia() {

		arrNotas.forEach(nota -> {

			soma += nota;
		});
		media = soma / 4;
		return media;

	}
}
