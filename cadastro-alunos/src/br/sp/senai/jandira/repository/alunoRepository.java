package br.sp.senai.jandira.repository;

import br.sp.senai.jandira.model.Aluno;

public class alunoRepository {

	private Aluno[] turma;

	public alunoRepository() {

		turma = new Aluno[32];
	}

	public alunoRepository(int quantidadeAlunos) {

		turma = new Aluno[quantidadeAlunos];
	}

	public void gravar(Aluno aluno, int posicao) {
		turma[posicao] = aluno;
	}

	public Aluno listarAluno(int posicao) {
		return turma[posicao];
	}

	public Aluno[] listarTodos() {
		return turma;
	}

}
