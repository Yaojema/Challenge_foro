package com.challenge.foro.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        @JsonAlias("fecha_creacion") LocalDate fechaCreacion,
        @NotNull
        Estado estado,
        @NotBlank
        String curso,
        @NotBlank
        String autor
) {
}
