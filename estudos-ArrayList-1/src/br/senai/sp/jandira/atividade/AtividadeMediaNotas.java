package br.senai.sp.jandira.atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeMediaNotas {

	Scanner leitor;

	ArrayList<Double> ArrayNotas = new ArrayList<Double>();

	public void Media() {

		Scanner leitor = new Scanner(System.in);
	}

	public void ReceberNotas() {
		
		System.out.println("Digite uma nota :   se quiser parar digite P/p");
		Double  nota = leitor.nextDouble();
		
		for ( nota <= 0; ) {
			System.out.println();
		}
		
		leitor.close();
		}

}
