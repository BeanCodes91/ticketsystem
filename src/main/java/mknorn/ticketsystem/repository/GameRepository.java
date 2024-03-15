package mknorn.ticketsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mknorn.ticketsystem.model.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {

}
