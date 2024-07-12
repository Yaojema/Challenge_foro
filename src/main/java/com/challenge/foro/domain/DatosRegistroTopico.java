package com.challenge.foro.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        @JsonAlias("fecha_creacion") LocalDate fechaCreacion,
        @NotBlank
        Estado estado,
        @NotBlank
        String curso,
        @NotBlank
        String autor
) {
}
