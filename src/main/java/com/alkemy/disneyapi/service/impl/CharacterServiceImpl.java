package com.alkemy.disneyapi.service.impl;

import com.alkemy.disneyapi.dto.CharacterDTO;
import com.alkemy.disneyapi.entity.CharacterEntity;
import com.alkemy.disneyapi.mapper.CharacterMapper;
import com.alkemy.disneyapi.repository.CharacterRepository;
import com.alkemy.disneyapi.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterMapper characterMapper;

    @Autowired
    private CharacterRepository characterRepository;
    @Override
    public CharacterDTO save(CharacterDTO dto) {

        CharacterEntity entity = characterMapper.charDTO2Entity(dto);
        CharacterEntity savedChar = characterRepository.save(entity);
        CharacterDTO result = characterMapper.charEntity2DTO(savedChar);
        return result;

    }

    @Override
    public List<CharacterDTO> getAllCharacter() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
