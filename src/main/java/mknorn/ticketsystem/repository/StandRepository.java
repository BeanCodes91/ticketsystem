package mknorn.ticketsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mknorn.ticketsystem.model.Stand;

@Repository
public interface StandRepository extends JpaRepository<Stand, Long> {

}
