package com.alkemy.disneyapi.mapper;

import com.alkemy.disneyapi.dto.CharacterDTO;
import com.alkemy.disneyapi.entity.CharacterEntity;
import org.springframework.stereotype.Component;

@Component
public class CharacterMapper {

    public CharacterEntity charDTO2Entity(CharacterDTO dto){
        CharacterEntity characterEntity = new CharacterEntity();
        characterEntity.setImage(dto.getImage());
        characterEntity.setName(dto.getName());
        characterEntity.setAge(dto.getAge());
        characterEntity.setWeight(dto.getWeight());
        characterEntity.setStory(dto.getStory());
        return characterEntity;
    }

    public CharacterDTO charEntity2DTO(CharacterEntity entity) {
        CharacterDTO characterDTO = new CharacterDTO();
        characterDTO.setId(entity.getId());
        characterDTO.setImage(entity.getImage());
        characterDTO.setName(entity.getName());
        characterDTO.setAge(entity.getAge());
        characterDTO.setWeight(entity.getWeight());
        characterDTO.setStory(entity.getStory());
        return characterDTO;
    }
}
