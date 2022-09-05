package com.alkemy.disneyapi.dto;

import com.alkemy.disneyapi.entity.MediaEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Data
public class CharacterDTO {

    private Long id;
    private String image;
    private String name;
    private Long age;
    private BigDecimal weight;
    private String story;
    private Set<MediaEntity> medias = new HashSet<>();
}
