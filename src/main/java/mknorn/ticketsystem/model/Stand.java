package mknorn.ticketsystem.model;

import java.util.Set;

import jakarta.persistence.*;

@Entity(name = "STAND")
public class Stand {

	@Id
	@GeneratedValue
	private long standID;
	private String name;
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(name = "GAME_STAND_MAPPING", joinColumns = @JoinColumn(name = "standId"), inverseJoinColumns = @JoinColumn(name = "gameId"))
	private Set<Game> games;
	@OneToMany
	private Set<Area> areas;
	
	
	public Stand() {}
	public Stand(String name, Set<Area> areas) {
		this.name = name;
		this.areas = areas;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Game> getGames() {
		return games;
	}
	public void setGames(Set<Game> games) {
		this.games = games;
	}
	public Set<Area> getAreas() {
		return areas;
	}
	public void setAreas(Set<Area> areas) {
		this.areas = areas;
	}
	public long getStandID() {
		return standID;
	}
}
