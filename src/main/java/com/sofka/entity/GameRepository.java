package com.sofka.entity;
import com.sofka.dao.gameDao;
import com.sofka.domain.Game;
import java.util.List;

public class GameRepository {
    private gameDao gameDao ;

    public List<Game> getByStatus(Boolean status){
        return  gameDao.findByStatus(status);

    }

    public List<Game> getByIdGame(Integer idGame){
        return  gameDao.findByIdGame(idGame);

    }

}
