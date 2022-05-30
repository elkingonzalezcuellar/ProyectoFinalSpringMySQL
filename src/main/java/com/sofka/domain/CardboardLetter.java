package com.sofka.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Data
@Entity
@Table(name = "cardboard_letter")

public class CardboardLetter implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcardboard_letters", nullable = false)
    private Integer idCardboardLetters;
    private Integer b;
    private Integer i;
    private Integer n;
    private Integer g;
    private Integer o;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Player.class, optional = false)
    @JoinColumn(name = "idplayer", nullable = false)
    @JsonBackReference

    private Player player;


}
