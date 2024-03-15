package mknorn.ticketsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mknorn.ticketsystem.model.Area;

@Repository
public interface AreaRepository extends CrudRepository<Area, Long>{

}
