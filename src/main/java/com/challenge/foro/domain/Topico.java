package com.challenge.foro.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensaje;
    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    private String curso;
    private String autor;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fechaCreacion = datosRegistroTopico.fechaCreacion();
//        this.fechaCreacion = LocalDate.now();
        this.estado = datosRegistroTopico.estado();
        this.curso = datosRegistroTopico.curso();
        this.autor = datosRegistroTopico.autor();
    }
}
