package mknorn.ticketsystem.config;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

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
			public <S extends Team> Optional<S> findOne(Example<S> example) {
				// TODO Auto-generated method stub
				return Optional.empty();
			}
			
			@Override
			public <S extends Team, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends Team> Page<S> findAll(Example<S> example, Pageable pageable) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends Team> boolean exists(Example<S> example) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public <S extends Team> long count(Example<S> example) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Page<Team> findAll(Pageable pageable) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Team> findAll(Sort sort) {
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
			
			@Override
			public <S extends Team> List<S> saveAll(Iterable<S> entities) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Team> findAllById(Iterable<Long> ids) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Team> findAll() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends Team> S saveAndFlush(S entity) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends Team> List<S> saveAllAndFlush(Iterable<S> entities) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Team getReferenceById(Long id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Team getOne(Long id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Team getById(Long id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void flush() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public <S extends Team> List<S> findAll(Example<S> example, Sort sort) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends Team> List<S> findAll(Example<S> example) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void deleteAllInBatch(Iterable<Team> entities) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteAllInBatch() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteAllByIdInBatch(Iterable<Long> ids) {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
