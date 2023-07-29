package br.com.alura.escola.academico.dominio.aluno;

import java.time.LocalDateTime;
import java.util.Map;

import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.eventos.Evento;
import br.com.alura.escola.shared.dominio.eventos.TipoDeEvento;

public class AlunoMatriculado implements Evento {

	private final CPF cpfDoAluno;
	

	private final LocalDateTime momento;

	public AlunoMatriculado(CPF cpfDoAluno) {
		this.cpfDoAluno = cpfDoAluno;
		this.momento = LocalDateTime.now();
	}
	
	@Override
	public LocalDateTime momento() {
		return this.momento;
	}

	public CPF getCfpDoAluno() {
		return cpfDoAluno;
	}

	@Override
	public TipoDeEvento tipo() {
		return TipoDeEvento.ALUNO_MATRICULADO;
	}

	@Override
	public Map<String, Object> informacoe() {
		return Map.of("cpf", cpfDoAluno);
	}

}
