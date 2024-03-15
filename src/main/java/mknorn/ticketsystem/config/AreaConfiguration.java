package mknorn.ticketsystem.config;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mknorn.ticketsystem.controller.AreaController;
import mknorn.ticketsystem.dto.AreaDTO;
import mknorn.ticketsystem.model.Area;
import mknorn.ticketsystem.repository.AreaRepository;

@Configuration
@ComponentScan(basePackages = "config")
public class AreaConfiguration {

	@Bean
	public Area area() {
		return new Area();
	}
	
	@Bean
	public AreaController areaController() {
		return new AreaController();
	}
	
	@Bean
	public AreaDTO areaDTO() {
		return new AreaDTO();
	}
	
	@Bean 
	public AreaRepository areaRepository() {
		return new AreaRepository() {
			
			@Override
			public <S extends Area> Iterable<S> saveAll(Iterable<S> entities) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends Area> S save(S entity) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Optional<Area> findById(Long id) {
				// TODO Auto-generated method stub
				return Optional.empty();
			}
			
			@Override
			public Iterable<Area> findAllById(Iterable<Long> ids) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Iterable<Area> findAll() {
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
			public void deleteAll(Iterable<? extends Area> entities) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteAll() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void delete(Area entity) {
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
