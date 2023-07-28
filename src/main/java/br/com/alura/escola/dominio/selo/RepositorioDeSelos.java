package br.com.alura.escola.dominio.selo;

import java.util.List;

import br.com.alura.escola.dominio.aluno.CPF;

public interface RepositorioDeSelos {

	void adicionar(Selo selo);
	List<Selo> selosDoAlunoDeCPF(CPF cpf);
}
