package com.dcbto.desafioGoomer.dto;

import com.dcbto.desafioGoomer.entities.Categoria;
import com.dcbto.desafioGoomer.entities.Produto;

public class CategoriaDTO {

    private Long id;
    private String name;

    public CategoriaDTO(Long id, String name, ProdutoDTO prod) {
        this.id = id;
        this.name = name;
    }

    public CategoriaDTO(Categoria entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
