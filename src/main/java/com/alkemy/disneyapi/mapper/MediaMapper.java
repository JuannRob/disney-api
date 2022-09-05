package com.alkemy.disneyapi.mapper;


import com.alkemy.disneyapi.dto.BasicMediaDTO;
import com.alkemy.disneyapi.dto.CharacterDTO;
import com.alkemy.disneyapi.dto.MediaDTO;
import com.alkemy.disneyapi.entity.MediaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Component
public class MediaMapper {

    @Autowired
    private CharacterMapper characterMapper;

    public MediaEntity mediaDTO2Entity(MediaDTO dto){
        MediaEntity mediaEntity = new MediaEntity();
        mediaEntity.setImage(dto.getImage());
        mediaEntity.setTitle(dto.getTitle());
        mediaEntity.setCreationDate(this.string2LocalDate(dto.getCreationDate()));
        mediaEntity.setRating(dto.getRating());
        return mediaEntity;
    }

    private MediaDTO mediaEntity2DTO(MediaEntity entity){
        MediaDTO mediaDTO = new MediaDTO();
        mediaDTO.setId(entity.getId());
        mediaDTO.setImage(entity.getImage());
        mediaDTO.setTitle(entity.getTitle());
        mediaDTO.setCreationDate(entity.getCreationDate().toString());
        mediaDTO.setRating(entity.getRating());
        return mediaDTO;
    }

    private List<BasicMediaDTO> mediaEntitySet2BasicDTOList(Collection<MediaEntity> entities){
        List<BasicMediaDTO> dtos = new ArrayList<>();
        BasicMediaDTO basicMediaDTO;
        for (MediaEntity entity : entities){
            basicMediaDTO = new BasicMediaDTO();
            basicMediaDTO.setId(entity.getId());
            basicMediaDTO.setImage(entity.getImage());
            basicMediaDTO.setTitle(entity.getTitle());
            basicMediaDTO.setCreationDate(entity.getCreationDate().toString());
            dtos.add(basicMediaDTO);
        }
            return dtos;
    }

    private LocalDate string2LocalDate(String stringDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(stringDate, formatter);
        return date;
    }
}
