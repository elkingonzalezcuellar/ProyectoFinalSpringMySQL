package com.sofka.dao;
import com.sofka.domain.Game;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface gameDao extends CrudRepository<Game,Integer>{


    @Query("select g.status from Game g  where g.status=:status ")
    public Boolean getStatus(@Param("status") Boolean status);

    @Query("select g.idGame from Game g  where g.status=:status ")
    public Integer getIdGame(@Param("status") Boolean status);

    @Query("select g from Game g  where g.idGame=:idGame")
    public Game getGame(@Param("idGame") Integer idGame);

    @Transactional
    @Modifying
    @Query("update Game g set g.status=:newStatus where g.status=:status")
    public void updateStatus(@Param("newStatus") Boolean newStatus,
                             @Param(value="status") Boolean status);
}
