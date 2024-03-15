package mknorn.ticketsystem.model;

import java.util.Set;

import jakarta.persistence.*;

@Entity(name = "TEAM")
public class Team {

	@Id
	@GeneratedValue
	private long teamID;
	private String name;
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(name = "GAME_TEAM_MAPPING", joinColumns = @JoinColumn(name = "teamId"), inverseJoinColumns = @JoinColumn(name = "gameId"))
	private Set<Game> games;
	
	
	public Team() {}
	public Team(String name) {
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
