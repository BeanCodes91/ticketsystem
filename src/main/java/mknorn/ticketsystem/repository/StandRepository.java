package mknorn.ticketsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mknorn.ticketsystem.model.Stand;

@Repository
public interface StandRepository extends CrudRepository<Stand, Long> {

}
