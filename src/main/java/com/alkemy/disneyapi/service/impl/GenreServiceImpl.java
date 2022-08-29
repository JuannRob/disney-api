package com.alkemy.disneyapi.service.impl;

import com.alkemy.disneyapi.dto.GenreDTO;
import com.alkemy.disneyapi.entity.GenreEntity;
import com.alkemy.disneyapi.mapper.GenreMapper;
import com.alkemy.disneyapi.repository.GenreRepository;
import com.alkemy.disneyapi.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreMapper genreMapper;

    @Autowired
    private GenreRepository genreRepository;

    public GenreDTO save(GenreDTO dto) {
        GenreEntity entity = genreMapper.genreDTO2Entity(dto);
        GenreEntity savedGenre = genreRepository.save(entity);
        GenreDTO result = genreMapper.genreEntity2DTO(savedGenre);
        return result;
    }

    public List<GenreDTO> getAllGenres() {
        List<GenreEntity> entities = genreRepository.findAll();
        List<GenreDTO> result = genreMapper.genreEntityList2DTOList(entities);
        return result;
    }

    public void delete(Long id) {
        genreRepository.deleteById(id);
    }


}
