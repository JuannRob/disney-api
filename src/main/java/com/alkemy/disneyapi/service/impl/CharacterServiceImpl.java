package com.alkemy.disneyapi.service.impl;

import com.alkemy.disneyapi.dto.CharacterDTO;
import com.alkemy.disneyapi.service.CharacterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {
    @Override
    public CharacterDTO save(CharacterDTO dto) {
        return null;
    }

    @Override
    public List<CharacterDTO> getAllCharacter() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
