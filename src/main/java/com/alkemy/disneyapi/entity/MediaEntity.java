package com.alkemy.disneyapi.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "media")
public class MediaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String image;

    private String title;

    @Column(name = "release_date")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate releaseDate;

    private Long rating;

    // (Genre) 1 - N (Media) N - N (Character)

    @ManyToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "genre_id", insertable = false, updatable = false)
    private GenreEntity genre;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "character_media", joinColumns = @JoinColumn(name = "media_id"), inverseJoinColumns = @JoinColumn(name = "character_id"))
    private Set<CharacterEntity> characters = new HashSet<>();


}
