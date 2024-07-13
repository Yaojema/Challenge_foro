package com.challenge.foro.domain.topico;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

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
    private LocalDateTime fechaCreacion;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    private String curso;
    private String autor;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fechaCreacion = LocalDateTime.now();
        this.estado = datosRegistroTopico.estado();
        this.curso = datosRegistroTopico.curso();
        this.autor = datosRegistroTopico.autor();
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if(datosActualizarTopico.titulo() !=null ) this.titulo = datosActualizarTopico.titulo();
        if(datosActualizarTopico.mensaje() !=null ) this.mensaje = datosActualizarTopico.mensaje();
        if(datosActualizarTopico.estado() !=null ) this.estado = datosActualizarTopico.estado();
        if(datosActualizarTopico.curso() !=null ) this.curso = datosActualizarTopico.curso();
        if(datosActualizarTopico.autor() !=null ) this.autor = datosActualizarTopico.autor();
    }
}