package com.dcbto.desafioGoomer.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "categoria")
    private List<Produto> prod = new ArrayList<>();

    public Categoria(Long id, String name, List<Produto> prod) {
        this.id = id;
        this.name = name;
        this.prod = prod;
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

    public List<Produto> getProd() {
        return prod;
    }
}
