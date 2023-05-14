package com.devsuperior.gmlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.gmlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
