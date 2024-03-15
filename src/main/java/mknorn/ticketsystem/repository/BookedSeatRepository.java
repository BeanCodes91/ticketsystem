package mknorn.ticketsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mknorn.ticketsystem.model.BookedSeat;

@Repository
public interface BookedSeatRepository extends CrudRepository<BookedSeat, Long> {

}
