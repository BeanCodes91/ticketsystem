package mknorn.ticketsystem.dto;

import java.util.Set;

import mknorn.ticketsystem.model.Game;

public class TeamDTO {

	private long teamID;
	private String name;
	private Set<Game> games;
	
	
	public TeamDTO() {}
	public TeamDTO(String name) {
		this.name = name;
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
	public long getTeamID() {
		return teamID;
	}
}
