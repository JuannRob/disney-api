package com.alkemy.disneyapi.service;

import com.alkemy.disneyapi.dto.GenreDTO;

import java.util.List;

public interface GenreService {

    GenreDTO save(GenreDTO dto);

    List<GenreDTO> getAllGenres();

    void delete(Long id);
}
