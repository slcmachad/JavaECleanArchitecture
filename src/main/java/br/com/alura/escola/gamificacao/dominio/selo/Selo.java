package br.com.alura.escola.gamificacao.dominio.selo;

import br.com.alura.escola.shared.dominio.CPF;

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
