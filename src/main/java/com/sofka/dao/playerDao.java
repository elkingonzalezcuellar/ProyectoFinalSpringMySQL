package com.sofka.dao;

import com.sofka.domain.Player;
import org.springframework.data.repository.CrudRepository;


public interface playerDao extends CrudRepository<Player,Integer> {
}
