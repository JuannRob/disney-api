package com.alkemy.disneyapi.dto;

import com.alkemy.disneyapi.entity.CharacterEntity;
import com.alkemy.disneyapi.entity.GenreEntity;
import lombok.Data;
import java.util.HashSet;
import java.util.Set;

@Data
public class MediaDTO {

    private Long id;
    private String image;
    private String title;
    private String creationDate;
    private Long rating;
    private Set<GenreEntity> genres = new HashSet<>();
    private Set<CharacterEntity> characters = new HashSet<>();

}
