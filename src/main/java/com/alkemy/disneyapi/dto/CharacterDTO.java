package com.alkemy.disneyapi.dto;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class CharacterDTO {

    private Long id;
    private String image;
    private String name;
    private Long age;
    private BigDecimal weight;
    private String story;
}
