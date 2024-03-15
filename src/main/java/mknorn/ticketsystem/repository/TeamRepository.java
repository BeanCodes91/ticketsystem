package mknorn.ticketsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mknorn.ticketsystem.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

}
