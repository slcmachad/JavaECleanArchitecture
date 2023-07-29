package br.com.alura.escola.academico.aplicacao.aluno.matricular;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.eventos.PublicadorDeEventos;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		
		// MOCK -> MOCKITO (IDEIA)
		
		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());
		
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCases = new MatricularAluno(repositorio, publicador);
		
		MatricularAlunoDTO dados = new MatricularAlunoDTO("FULANO", "123.456.789-00", "email@sememail.com");
		useCases.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCpf(new CPF("123.456.789-00"));
		
		assertEquals("FULANO", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf());
		assertEquals("email@sememail.com", encontrado.getEmail());
	}

}
