package mknorn.ticketsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mknorn.ticketsystem.model.Block;

@Repository
public interface BlockRepository extends CrudRepository<Block, Long> {

}
