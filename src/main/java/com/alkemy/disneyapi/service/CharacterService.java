package com.alkemy.disneyapi.service;

import com.alkemy.disneyapi.dto.CharacterDTO;
import com.alkemy.disneyapi.dto.GenreDTO;

import java.util.List;

public interface CharacterService {

    CharacterDTO save(CharacterDTO dto);

    List<CharacterDTO> getAllCharacter();

    void delete(Long id);
}
