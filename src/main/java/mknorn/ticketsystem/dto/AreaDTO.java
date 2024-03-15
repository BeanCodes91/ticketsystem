package mknorn.ticketsystem.dto;

import java.util.Set;

import mknorn.ticketsystem.model.Block;
import mknorn.ticketsystem.model.Stand;

public class AreaDTO {

	private long areaID;
	private String name;
	private boolean seated;
	private double price;
	private Stand stand;
	private Set<Block> blocks;
	
	
	public AreaDTO() {}
	public AreaDTO(String name, boolean seated, double price, Stand stand) {
		this.name = name;
		this.seated = seated;
		this.price = price;
		this.stand = stand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSeated() {
		return seated;
	}
	public void setSeated(boolean seated) {
		this.seated = seated;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Stand getStand() {
		return stand;
	}
	public void setStand(Stand stand) {
		this.stand = stand;
	}
	public Set<Block> getBlocks() {
		return blocks;
	}
	public void setBlocks(Set<Block> blocks) {
		this.blocks = blocks;
	}
	public long getAreaID() {
		return areaID;
	}
}
