package com.sofka.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "player")
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;



    @Id
    @Column(name = "idplayer", nullable = false,length = 200)
    private Integer idPlayer;



    @OneToMany(
            fetch = FetchType.LAZY,
            targetEntity = CardboardLetter.class,
            cascade = CascadeType.REMOVE,
            mappedBy = "player"
    )
    @JsonManagedReference
    private List<CardboardLetter> CardboardLetter = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Game.class, optional = false)
    @JoinColumn(name = "idgame")
    @JsonBackReference
    private Game game;

}