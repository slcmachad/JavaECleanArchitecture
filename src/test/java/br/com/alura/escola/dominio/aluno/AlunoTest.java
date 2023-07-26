package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTest {

	private Aluno aluno;
	
	@BeforeEach
	void beforeEach() {
		this.aluno = new Aluno(new CPF("123.456.789-00"), "fulano", new Email("fulano@email.com"));
	}
	
	@Test
	void deveriaPermitirAdicionar1Telefone() {
		this.aluno.adicionarTelefone("51","123456789");
		assertEquals(1, this.aluno.getTelefones().size());
	}

	@Test
	void deveriaPermitirAdicionar2Telefone() {
		this.aluno.adicionarTelefone("51","12345678");
		this.aluno.adicionarTelefone("51","12345677");
		assertEquals(2, this.aluno.getTelefones().size());
	}
	

}
