package com.challenge.foro.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        @JsonProperty("fecha_creacion") LocalDateTime fechaCreacion,
        Estado estado,
        String curso,
        String autor
){
}
