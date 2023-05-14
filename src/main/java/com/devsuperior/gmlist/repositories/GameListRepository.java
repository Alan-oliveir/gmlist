package com.devsuperior.gmlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.gmlist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
