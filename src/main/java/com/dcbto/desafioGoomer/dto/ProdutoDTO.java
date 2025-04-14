package com.dcbto.desafioGoomer.dto;

import com.dcbto.desafioGoomer.entities.Produto;

public class ProdutoDTO {

    private Long id;
    private String name;
    private Double price;
    private String departmentName;

    private RestauranteDTO rest;

    public ProdutoDTO(Long id, String name, Double price, CategoriaDTO cat, RestauranteDTO rest) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.departmentName = cat.getName();
        this.rest = rest;
    }

    public ProdutoDTO(Produto entity) {
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        departmentName = entity.getCategoria().getName();
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

    public String getDepartmentName() {
        return departmentName;
    }

    public RestauranteDTO getRest() {
        return rest;
    }
}
