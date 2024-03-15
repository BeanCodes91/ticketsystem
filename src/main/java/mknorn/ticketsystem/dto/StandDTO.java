package mknorn.ticketsystem.dto;

import java.util.Set;

import mknorn.ticketsystem.model.Area;
import mknorn.ticketsystem.model.Game;

public class StandDTO {

	private long standID;
	private String name;
	private Set<Game> games;
	private Set<Area> areas;
	
	
	public StandDTO() {}
	public StandDTO(String name, Set<Area> areas) {
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
