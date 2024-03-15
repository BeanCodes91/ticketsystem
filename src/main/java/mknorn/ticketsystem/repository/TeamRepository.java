package mknorn.ticketsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mknorn.ticketsystem.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
