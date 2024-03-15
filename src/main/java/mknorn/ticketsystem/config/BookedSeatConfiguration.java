package mknorn.ticketsystem.config;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mknorn.ticketsystem.controller.BookedSeatController;
import mknorn.ticketsystem.dto.BookedSeatDTO;
import mknorn.ticketsystem.model.BookedSeat;
import mknorn.ticketsystem.repository.BookedSeatRepository;

@Configuration
@ComponentScan(basePackages = "config")
public class BookedSeatConfiguration {

	@Bean
	public BookedSeat bookedSeat() {
		return new BookedSeat();
	}
	
	@Bean
	public BookedSeatController bookedSeatController() {
		return new BookedSeatController();
	}
	
	@Bean
	public BookedSeatDTO bookedSeatDTO() {
		return new BookedSeatDTO();
	}
	
	@Bean
	public BookedSeatRepository bookedSeatRepository() {
		return new BookedSeatRepository() {
			
			@Override
			public <S extends BookedSeat> Iterable<S> saveAll(Iterable<S> entities) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends BookedSeat> S save(S entity) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Optional<BookedSeat> findById(Long id) {
				// TODO Auto-generated method stub
				return Optional.empty();
			}
			
			@Override
			public Iterable<BookedSeat> findAllById(Iterable<Long> ids) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Iterable<BookedSeat> findAll() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean existsById(Long id) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void deleteById(Long id) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteAllById(Iterable<? extends Long> ids) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteAll(Iterable<? extends BookedSeat> entities) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteAll() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void delete(BookedSeat entity) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public long count() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
}
