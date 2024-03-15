package mknorn.ticketsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mknorn.ticketsystem.model.BookedSeat;

@Repository
public interface BookedSeatRepository extends JpaRepository<BookedSeat, Long> {

}
