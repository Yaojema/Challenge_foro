package com.challenge.foro.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public record DatosListadoTopicos(
        Long id,
        String titulo,
        String mensaje,
        @JsonProperty("fecha_creacion") LocalDateTime fechaCreacion
) {
    public DatosListadoTopicos(Topico medico) {
        this(
                medico.getId(),
                medico.getTitulo(),
                medico.getMensaje(),
                medico.getFechaCreacion());
    }
}
