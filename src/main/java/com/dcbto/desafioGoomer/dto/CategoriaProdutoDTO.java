package com.dcbto.desafioGoomer.dto;

import com.dcbto.desafioGoomer.entities.Produto;

public class CategoriaProdutoDTO {

    private Long id;
    private String name;
    private Double price;

    private CategoriaDTO cat;

    public CategoriaProdutoDTO(Long id, String name, Double price, CategoriaDTO cat) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cat = cat;
    }

    public CategoriaProdutoDTO(Produto entity) {
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        cat = new CategoriaDTO(entity.getCategoria());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public CategoriaDTO getCat() {
        return cat;
    }
}
