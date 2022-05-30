package com.sofka.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "game")
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idgame", nullable = false,length = 200)
    private Integer idGame;
    private Boolean status;
    private String winner;

    @OneToMany(
            fetch = FetchType.LAZY,
            targetEntity = CBNumber.class,
            cascade = CascadeType.REMOVE,
            mappedBy = "game"
    )
    @JsonManagedReference
    private List<CBNumber> CBNumber = new ArrayList<>();

    @OneToMany(
            fetch = FetchType.LAZY,
            targetEntity = Player.class,
            cascade = CascadeType.REMOVE,
            mappedBy = "game"
    )
    @JsonManagedReference
    private List<Player> player = new ArrayList<>();
}