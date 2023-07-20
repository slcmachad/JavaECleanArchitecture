package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Telefone;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class,
            () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
            () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
            () -> new Telefone("1", "123456789"));
    }
}
