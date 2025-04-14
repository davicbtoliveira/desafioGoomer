package com.dcbto.desafioGoomer.entities;

import com.dcbto.desafioGoomer.dto.RestauranteDTO;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_restaurante")
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String endereco;
    private String imgUrl;

    @OneToMany
    @JoinColumn(name = "produto_id")
    private List<Produto> prods = new ArrayList<>();

    public Restaurante(){}

    public Restaurante(Long id, String name, String endereco,String imgUrl) {
        this.id = id;
        this.name = name;
        this.endereco = endereco;
        this.imgUrl = imgUrl;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<Produto> getProds() {
        return prods;
    }

}
