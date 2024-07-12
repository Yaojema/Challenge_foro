package com.challenge.foro.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public record DatosListadoTopicos(
        Long id,
        String titulo,
        String mensaje,
        @JsonProperty("fecha_creacion") LocalDateTime fechaCreacion
) {
    public DatosListadoTopicos(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion());
    }
}
