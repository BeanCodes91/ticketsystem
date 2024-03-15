package mknorn.ticketsystem.config;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mknorn.ticketsystem.controller.TeamController;
import mknorn.ticketsystem.dto.TeamDTO;
import mknorn.ticketsystem.model.Team;
import mknorn.ticketsystem.repository.TeamRepository;

@Configuration
@ComponentScan(basePackages = "config")
public class TeamConfiguration {

	@Bean
	public Team team() {
		return new Team();
	}
	
	@Bean
	public TeamController teamController() {
		return new TeamController();
	}
	
	@Bean
	public TeamDTO teamDTO() {
		return new TeamDTO();
	}
	
	@Bean
	public TeamRepository teamRepository() {
		return new TeamRepository() {
			
			@Override
			public <S extends Team> Iterable<S> saveAll(Iterable<S> entities) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends Team> S save(S entity) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Optional<Team> findById(Long id) {
				// TODO Auto-generated method stub
				return Optional.empty();
			}
			
			@Override
			public Iterable<Team> findAllById(Iterable<Long> ids) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Iterable<Team> findAll() {
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
			public void deleteAll(Iterable<? extends Team> entities) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteAll() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void delete(Team entity) {
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
