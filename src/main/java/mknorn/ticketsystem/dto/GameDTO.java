package mknorn.ticketsystem.dto;

import java.util.Date;
import java.util.Set;

import mknorn.ticketsystem.model.BookedSeat;
import mknorn.ticketsystem.model.Stand;
import mknorn.ticketsystem.model.Team;

public class GameDTO {

	private long gameID;
	private Date gameDate;
	private Set<Team> teams;
	private Set<Stand> stands;
	private Set<BookedSeat> bookedSeats;
	
	
	public GameDTO() {}
	public GameDTO(Date gameDate, Set<Team> teams) {
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
