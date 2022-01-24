package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.CriacaoTabuada;

public class TesteResultadoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CriacaoTabuada  x = new CriacaoTabuada ();
		CriacaoTabuada  v = new CriacaoTabuada ();
		
		x.setMultiplicador(10);
		x.setMultiplicando(70);
		
		
		v.setMultiplicador(10);
		v.setMultiplicando(50);
		
		System.out.println("");
		System.out.println(" ---- Tabuada X -----");
		System.out.println("");
		
		String tabuadax[] = x.calcularTatubada();
		
		for (int i = 0; i < tabuadax.length; i++) {
		System.out.println(tabuadax[i]);
		}
		
		System.out.println("");
		System.out.println(" ---- Tabuada V -----");
		System.out.println("");
		
		String tabuadav[] = v.calcularTatubada();
		
		for (int i = 0; i < tabuadav.length; i++) {
		System.out.println(tabuadax[i]);
		}
	}

}
