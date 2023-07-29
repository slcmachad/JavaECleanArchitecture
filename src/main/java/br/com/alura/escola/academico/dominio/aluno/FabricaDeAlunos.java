package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.CPF;

public class FabricaDeAlunos {
	
	private Aluno aluno;
	
	public FabricaDeAlunos comNomeCpfEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}
	
	public FabricaDeAlunos comTelefone(String DDD, String numero) {
		this.aluno.adicionarTelefone(DDD, numero);
		return this;
	}
	
	public Aluno criar() {
		return this.aluno;
	}
	
}
