package br.com.alura.escola.academico.dominio.aluno;

import java.time.LocalDateTime;

import br.com.alura.escola.academico.dominio.Evento;

public class AlunoMatriculado implements Evento {

	private final CPF cfpDoAluno;
	

	private final LocalDateTime momento;

	public AlunoMatriculado(CPF cfpDoAluno) {
		this.cfpDoAluno = cfpDoAluno;
		this.momento = LocalDateTime.now();
	}
	
	@Override
	public LocalDateTime momento() {
		return this.momento;
	}

	public CPF getCfpDoAluno() {
		return cfpDoAluno;
	}

}
