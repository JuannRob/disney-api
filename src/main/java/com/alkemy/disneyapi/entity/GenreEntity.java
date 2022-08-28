package com.alkemy.disneyapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "genre")
public class GenreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String image;

    @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL)
    private Set<MediaEntity> medias = new HashSet<>();

}
