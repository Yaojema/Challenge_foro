package com.challenge.foro.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        @JsonProperty("fecha_creacion") LocalDate fechaCreacion,
        Estado estado,
        String curso,
        String autor
){
}
