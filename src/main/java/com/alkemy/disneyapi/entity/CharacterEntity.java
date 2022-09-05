package com.alkemy.disneyapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "charact")
public class CharacterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String image;

    private String name;

    private Long age;

    private BigDecimal weight;

    private String story;

    @ManyToMany(mappedBy = "characters")
    private Set<MediaEntity> medias = new HashSet<>();
}
