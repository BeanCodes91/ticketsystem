package mknorn.ticketsystem.model;

import java.util.Set;

import jakarta.persistence.*;

@Entity(name = "BLOCK")
public class Block {

	@Id
	@GeneratedValue
	private long blockID;
	private int number;
	@ManyToOne
	private Area area;
	@OneToMany
	private Set<BookedSeat> bookedSeats;
	
	
	public Block() {}
	public Block(int number, Area area) {
		this.number = number;
		this.area = area;
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public Set<BookedSeat> getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(Set<BookedSeat> bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	public long getBlockID() {
		return blockID;
	}
}
