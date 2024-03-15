package mknorn.ticketsystem.model;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;

@Entity(name = "GAME")
public class Game {

	@Id
	@GeneratedValue
	private long gameID;
	private Date gameDate;
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(name = "GAME_TEAM_MAPPING", joinColumns = @JoinColumn(name = "gameId"), inverseJoinColumns = @JoinColumn(name = "teamId"))
	private Set<Team> teams;
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(name = "GAME_STAND_MAPPING", joinColumns = @JoinColumn(name = "gameId"), inverseJoinColumns = @JoinColumn(name = "standId"))
	private Set<Stand> stands;
	@OneToMany
	private Set<BookedSeat> bookedSeats;
	
	
	public Game() {}
	public Game(Date gameDate, Set<Team> teams) {
		this.gameDate = gameDate;
		this.teams = teams;
	}
	
	
	public Date getGameDate() {
		return gameDate;
	}
	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}
	public Set<Team> getTeams() {
		return teams;
	}
	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}
	public Set<Stand> getStands() {
		return stands;
	}
	public void setStands(Set<Stand> stands) {
		this.stands = stands;
	}
	public Set<BookedSeat> getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(Set<BookedSeat> bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	public long getGameID() {
		return gameID;
	}
}
