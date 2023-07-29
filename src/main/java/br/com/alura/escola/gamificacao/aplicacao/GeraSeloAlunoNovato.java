package br.com.alura.escola.gamificacao.aplicacao;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.eventos.Evento;
import br.com.alura.escola.shared.dominio.eventos.Ouvinte;
import br.com.alura.escola.shared.dominio.eventos.TipoDeEvento;

public class GeraSeloAlunoNovato extends Ouvinte{
	
	private final RepositorioDeSelos repositorioDeSelos;
	

	public GeraSeloAlunoNovato(RepositorioDeSelos repositorioDeSelos) {
		this.repositorioDeSelos = repositorioDeSelos;
	}

	@Override
	protected void reageAo(Evento evento) {
		CPF cpfDoAluno = (CPF) evento.informacoe().get("cpf");
		Selo novato = new Selo(cpfDoAluno, "Novato");
		repositorioDeSelos.adicionar(novato);
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
	}

}
