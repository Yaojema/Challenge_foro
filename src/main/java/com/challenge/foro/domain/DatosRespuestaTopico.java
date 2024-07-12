package com.challenge.foro.domain;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDate fechaCreacion,
        Estado estado,
        String curso,
        String autor
){
}
