package com.dcbto.desafioGoomer.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    private Restaurante rest;

    public Produto(Long id, String name, Double price, Categoria cat) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoria = cat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria cat) {
        this.categoria = cat;
    }
}
