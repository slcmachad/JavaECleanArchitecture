package br.com.alura.escola.shared.dominio.eventos;

import java.time.LocalDateTime;

public interface Evento {

	LocalDateTime momento();
	TipoDeEvento tipo();
}
