package com.sofka.dao;
import com.sofka.domain.CBNumber;
import org.springframework.data.repository.CrudRepository;


import java.util.List;
public interface cbnumberDao extends CrudRepository<CBNumber,Integer> {
}
