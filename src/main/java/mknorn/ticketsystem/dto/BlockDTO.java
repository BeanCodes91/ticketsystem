package mknorn.ticketsystem.dto;

import java.util.Set;

import mknorn.ticketsystem.model.Area;
import mknorn.ticketsystem.model.BookedSeat;

public class BlockDTO {

	private long blockID;
	private int number;
	private Area area;
	private Set<BookedSeat> bookedSeats;
	
	
	public BlockDTO() {}
	public BlockDTO(int number, Area area) {
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
