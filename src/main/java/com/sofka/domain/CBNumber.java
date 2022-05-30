package com.sofka.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "cardboard_number")

public class CBNumber implements  Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcardboard_number", nullable = false)
    private Integer idcardboardnumber;
    private Integer number;
    private String letter;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Game.class, optional = false)
    @JoinColumn(name = "idgame", nullable = false)
    @JsonBackReference
    private Game game;
}
