package br.com.alura.escola.dominio.selo;

import br.com.alura.escola.dominio.aluno.CPF;

public class Selo {

	private CPF cpfDoAluno;
	private String nome;
	
	public Selo(CPF cpf, String nome) {
		this.cpfDoAluno = cpf;
		this.nome = nome;
	}

	public CPF getCpfDoAluno() {
		return cpfDoAluno;
	}

	public String getNome() {
		return nome;
	}
}
