package br.com.alura.escola.academico;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.alura.escola.academico.dominio.PublicadorDeEventos;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

	public static void main(String[] args) {
		String nome = "fulano";
		String cpf = "123.456.789-00";
		String email = "abcd@email.com.br";
		
		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());
		
		MatricularAluno matricular = new MatricularAluno(
				new RepositorioDeAlunosEmMemoria(), publicador);
		matricular.executa(new MatricularAlunoDTO(nome, cpf, email));
	}

}
