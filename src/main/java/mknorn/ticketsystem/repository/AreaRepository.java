package mknorn.ticketsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mknorn.ticketsystem.model.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long>{

}
