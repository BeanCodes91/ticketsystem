package mknorn.ticketsystem.config;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mknorn.ticketsystem.controller.GameController;
import mknorn.ticketsystem.dto.GameDTO;
import mknorn.ticketsystem.model.Game;
import mknorn.ticketsystem.repository.GameRepository;

@Configuration
@ComponentScan(basePackages = "config")
public class GameConfiguration {

	@Bean
	public Game game() {
		return new Game();
	}
	
	@Bean
	public GameController gameController() {
		return new GameController();
	}
	
	@Bean
	public GameDTO gameDTO() {
		return new GameDTO();
	}
	
	@Bean
	public GameRepository gameRepository() {
		return new GameRepository() {
			
			@Override
			public <S extends Game> Iterable<S> saveAll(Iterable<S> entities) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends Game> S save(S entity) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Optional<Game> findById(Long id) {
				// TODO Auto-generated method stub
				return Optional.empty();
			}
			
			@Override
			public Iterable<Game> findAllById(Iterable<Long> ids) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Iterable<Game> findAll() {
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
			public void deleteAll(Iterable<? extends Game> entities) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteAll() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void delete(Game entity) {
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
