package com.sofka.dao;
import com.sofka.domain.CardboardLetter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import java.util.List;
public interface cardboardDao extends CrudRepository<CardboardLetter,Integer>{
    @Query(value="select c from CardboardLetter c where c.player.idPlayer=:idPlayer")
    public List<CardboardLetter> randomNumber(@Param("idPlayer")Integer idPlayer);
}
