package com.dcbto.desafioGoomer.dto;

import com.dcbto.desafioGoomer.entities.Restaurante;

public class RestauranteMinDTO {

    private Long id;
    private String name;
    private String endereco;
    private String imgUrl;

    public RestauranteMinDTO(Long id, String name, String endereco,String imgUrl) {
        this.id = id;
        this.name = name;
        this.endereco = endereco;
        this.imgUrl = imgUrl;
    }

    public RestauranteMinDTO(Restaurante entity){
        id = entity.getId();
        name = entity.getName();
        endereco = entity.getEndereco();
        imgUrl = entity.getImgUrl();
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
}
