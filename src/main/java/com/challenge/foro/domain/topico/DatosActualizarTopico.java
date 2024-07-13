package com.challenge.foro.domain.topico;

public record DatosActualizarTopico(
        String titulo,
        String mensaje,
        Estado estado,
        String curso,
        String autor
) {
}
