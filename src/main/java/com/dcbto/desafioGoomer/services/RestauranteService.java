package com.dcbto.desafioGoomer.services;

import com.dcbto.desafioGoomer.dto.ProdutoDTO;
import com.dcbto.desafioGoomer.dto.RestauranteDTO;
import com.dcbto.desafioGoomer.dto.RestauranteMinDTO;
import com.dcbto.desafioGoomer.entities.Produto;
import com.dcbto.desafioGoomer.entities.Restaurante;
import com.dcbto.desafioGoomer.repositories.ProdutoRepository;
import com.dcbto.desafioGoomer.repositories.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository repo;

    @Autowired
    private ProdutoRepository prodRepo;

    @Transactional(readOnly = true)
    public Page<RestauranteMinDTO> findAllMin(Pageable pageable) {
        Page<Restaurante> result = repo.findAll(pageable);
        return result.map(x -> new RestauranteMinDTO(x));
    }

    @Transactional(readOnly = true)
    public Page<RestauranteDTO> findAll(Pageable pageable) {
        Page<Restaurante> result = repo.findAll(pageable);
        return result.map(x -> new RestauranteDTO(x));
    }

    @Transactional
    public RestauranteDTO insert(RestauranteDTO dto) {
        Restaurante entity = new Restaurante();

        copyDtoToEntity(dto, entity);

        entity = repo.save(entity);
        return new RestauranteDTO(entity);
    }

    @Transactional
    public RestauranteDTO update(Long id, RestauranteDTO dto) {
        Restaurante entity = repo.getReferenceById(id);
        copyDtoToEntity(dto, entity);
        return new RestauranteDTO(entity);
    }

    private void copyDtoToEntity(RestauranteDTO dto, Restaurante entity) {
        entity.setName(dto.getName());
        entity.setEndereco(dto.getEndereco());
        entity.setImgUrl(dto.getImgUrl());
        for (ProdutoDTO p : dto.getProds()) {
            Produto prod = prodRepo.getReferenceById(p.getId());

            entity.getProds().add(prod);
        }
    }
}
