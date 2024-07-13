package com.challenge.foro.controller;

import com.challenge.foro.domain.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    // Registro de topicos
    @PostMapping
    public ResponseEntity<DatosRespuestaTopico> registrarTopico(
            @RequestBody @Valid DatosRegistroTopico datosRegistroTopico,
            UriComponentsBuilder uriComponentsBuilder
            ){
        Topico topico = repository.save(new Topico(datosRegistroTopico));
        DatosRespuestaTopico datosRespuestaTopico = new DatosRespuestaTopico(
            topico.getId(),
            topico.getTitulo(),
            topico.getMensaje(),
            topico.getFechaCreacion(),
            topico.getEstado(),
            topico.getCurso(),
            topico.getAutor()
        );
        URI url = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(url).body(datosRespuestaTopico);
    }

    // Listado de los topicos
    @GetMapping
    public ResponseEntity<Page<DatosListadoTopicos>> listadoTopicos(@PageableDefault(size = 3) Pageable paginacion){
        return ResponseEntity.ok(repository.findAll(paginacion).map(DatosListadoTopicos::new));
    }

    // Get detallado por id
    @GetMapping("/{id}")
    public ResponseEntity<DatosRespuestaTopico> retornarDatosTopico(@PathVariable Long id){
        Topico topico = repository.getReferenceById(id);
        DatosRespuestaTopico datosTopicos = new DatosRespuestaTopico(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getEstado(),
                topico.getCurso(),
                topico.getAutor()
        );
        return ResponseEntity.ok(datosTopicos);
    }

    // Borrado por id
    @DeleteMapping("/{id}")
    public ResponseEntity eliminarTopico(@PathVariable Long id){
        Topico topico = repository.getReferenceById(id);
        repository.delete(topico);
        return ResponseEntity.noContent().build();
    }


}
