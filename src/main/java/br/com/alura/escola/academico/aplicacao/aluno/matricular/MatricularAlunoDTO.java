package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.Email;
import br.com.alura.escola.shared.dominio.CPF;

public class MatricularAlunoDTO {
	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;
	
	public MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {
		this.cpfAluno = cpfAluno;
		this.nomeAluno = nomeAluno;
		this.emailAluno = emailAluno;
	}

	public Aluno criarAluno() {
		return new Aluno(new CPF(cpfAluno), nomeAluno, new Email(emailAluno));
	}
	
}
