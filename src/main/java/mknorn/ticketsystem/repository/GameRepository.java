package mknorn.ticketsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mknorn.ticketsystem.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
