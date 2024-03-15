package mknorn.ticketsystem.config;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mknorn.ticketsystem.controller.BlockController;
import mknorn.ticketsystem.dto.BlockDTO;
import mknorn.ticketsystem.model.Block;
import mknorn.ticketsystem.repository.BlockRepository;

@Configuration
@ComponentScan(basePackages = "config")
public class BlockConfiguration {

	@Bean
	public Block block() {
		return new Block();
	}
	
	@Bean
	public BlockController blockController() {
		return new BlockController();
	}
	
	@Bean
	public BlockDTO blockDTO() {
		return new BlockDTO();
	}
	
	@Bean
	public BlockRepository blockRepository() {
		return new BlockRepository() {
			
			@Override
			public <S extends Block> Iterable<S> saveAll(Iterable<S> entities) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <S extends Block> S save(S entity) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Optional<Block> findById(Long id) {
				// TODO Auto-generated method stub
				return Optional.empty();
			}
			
			@Override
			public Iterable<Block> findAllById(Iterable<Long> ids) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Iterable<Block> findAll() {
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
			public void deleteAll(Iterable<? extends Block> entities) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteAll() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void delete(Block entity) {
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
