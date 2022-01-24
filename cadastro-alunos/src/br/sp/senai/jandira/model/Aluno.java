package br.sp.senai.jandira.model;

public class Aluno {
	
	private String nome;
	private String matricula;
	private Periodo periodo;
	
	public void  setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	
	
	
	
	
}

