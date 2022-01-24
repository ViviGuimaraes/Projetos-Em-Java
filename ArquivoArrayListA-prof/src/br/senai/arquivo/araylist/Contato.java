package br.senai.arquivo.araylist;

public class Contato {
	
	private String nome;
	private String email;
	private String telefone;
	private String cidade;
	
	public Contato(String nome, String email, String telefone, String cidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cidade = cidade;
	}
	
	public Contato() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
