package br.com.alura.escola.infra.aluno;

import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos{

	@Override
	public void matricular(Aluno aluno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Aluno buscarPorCpf(CPF cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listarTodosAlunoMatriculados() {
		// TODO Auto-generated method stub
		return null;
	}

}
