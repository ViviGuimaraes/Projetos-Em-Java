package br.sp.senai.jandira.model;

public enum Periodo {
	
	
	MANHA(" Manh� "),
	TARDE(" Tarde "),
	NOITE(" Noite ");
	
	private String descricao;
	
	private Periodo (String descricao) {
		this.descricao = descricao;
	}
	public String getDecricao() {
		return descricao;
	}

	
	
	
	
}
