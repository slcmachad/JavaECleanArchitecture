package br.com.alura.escola.aplicacao.aluno.matricular;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		
		// MOCK -> MOCKITO (IDEIA)
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCases = new MatricularAluno(repositorio);
		
		MatricularAlunoDTO dados = new MatricularAlunoDTO("FULANO", "123.456.789-00", "email@sememail.com");
		useCases.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCpf(new CPF("123.456.789-00"));
		
		assertEquals("FULANO", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf());
		assertEquals("email@sememail.com", encontrado.getEmail());
	}

}
