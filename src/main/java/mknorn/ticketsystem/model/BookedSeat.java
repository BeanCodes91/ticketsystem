package mknorn.ticketsystem.model;

import jakarta.persistence.*;

@Entity(name = "BOOKEDSEAT")
public class BookedSeat {

	@Id
	@GeneratedValue
	private long bookedSeatID;
	private int number;
	@ManyToOne
	private Block block;
	@ManyToOne
	private Game game;
	
	
	public BookedSeat() {}
	public BookedSeat(int number, Block block, Game game) {
		this.number = number;
		this.block = block;
		this.game = game;
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Block getBlock() {
		return block;
	}
	public void setBlock(Block block) {
		this.block = block;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public long getBookedSeatID() {
		return bookedSeatID;
	}
}
