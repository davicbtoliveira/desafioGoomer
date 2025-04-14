package com.dcbto.desafioGoomer.controllers;

import com.dcbto.desafioGoomer.dto.ProdutoDTO;
import com.dcbto.desafioGoomer.dto.RestauranteDTO;
import com.dcbto.desafioGoomer.dto.RestauranteMinDTO;
import com.dcbto.desafioGoomer.services.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

    @Autowired
    private RestauranteService service;

    @GetMapping("/min")
    public ResponseEntity<Page<RestauranteMinDTO>> findAllMin(Pageable pageable) {
        return ResponseEntity.ok().body(service.findAllMin(pageable));
    }

    @GetMapping("")
    public ResponseEntity<Page<RestauranteDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok().body(service.findAll(pageable));
    }

    @PostMapping("")
    public ResponseEntity<RestauranteDTO> insert(@RequestBody RestauranteDTO dto) {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RestauranteDTO> update(Long id, RestauranteDTO dto) {
        dto = service.update(id, dto);
        return ResponseEntity.ok(dto);
    }

}
