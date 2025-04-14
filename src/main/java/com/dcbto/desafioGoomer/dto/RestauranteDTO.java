package com.dcbto.desafioGoomer.dto;


import com.dcbto.desafioGoomer.entities.Produto;
import com.dcbto.desafioGoomer.entities.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class RestauranteDTO {

    private Long id;
    private String name;
    private String endereco;
    private String imgUrl;

    private List<ProdutoDTO> prods = new ArrayList<>();

    public RestauranteDTO(Long id, String name, String endereco,String imgUrl, List<ProdutoDTO> prods) {
        this.id = id;
        this.name = name;
        this.endereco = endereco;
        this.imgUrl = imgUrl;
        this.prods = prods;
    }

    public RestauranteDTO(Restaurante entity) {
        id = entity.getId();
        name = entity.getName();
        endereco = entity.getEndereco();
        imgUrl = entity.getImgUrl();
        for(Produto produto : entity.getProds()) {
            prods.add(new ProdutoDTO(produto));
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public List<ProdutoDTO> getProds() {
        return prods;
    }
}
