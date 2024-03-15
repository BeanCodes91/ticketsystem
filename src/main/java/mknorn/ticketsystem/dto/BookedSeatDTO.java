package mknorn.ticketsystem.dto;

import mknorn.ticketsystem.model.Block;
import mknorn.ticketsystem.model.Game;

public class BookedSeatDTO {

	private long bookedSeatID;
	private int number;
	private Block block;
	private Game game;
	
	
	public BookedSeatDTO() {}
	public BookedSeatDTO(int number, Block block, Game game) {
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
