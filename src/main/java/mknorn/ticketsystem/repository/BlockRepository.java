package mknorn.ticketsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mknorn.ticketsystem.model.Block;

@Repository
public interface BlockRepository extends JpaRepository<Block, Long> {

}
