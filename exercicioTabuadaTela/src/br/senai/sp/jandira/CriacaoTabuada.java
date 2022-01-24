package br.senai.sp.jandira;

public class CriacaoTabuada {

	private int multiplicando;
	private int multiplicador;

	public void setMultiplicando(int multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicador(int multiplicador) {
		this.multiplicador = multiplicador;
	}

	public double getMultiplicador() {
		return multiplicador;
	}
	
	// ultilizando a Matriz para calcular a tabuada 
	
	public String[] calcularTatubada() {

		String calculo[] = new String[multiplicador + 1];

		// a variável int i é o valor do multiplicador alterado pelo for

		for (int i = 0; i <= multiplicador; i++) {

			int resultado = multiplicando * i;

			calculo[i] = multiplicando + " x " + i + " = " + resultado;
		}
		return calculo;
	}

}
