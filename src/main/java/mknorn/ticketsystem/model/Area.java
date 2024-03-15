package mknorn.ticketsystem.model;

import java.util.Set;

import jakarta.persistence.*;

@Entity(name = "AREA")
public class Area {

	@Id
	@GeneratedValue
	private long areaID;
	private String name;
	private boolean seated;
	private double price;
	@ManyToOne
	private Stand stand;
	@OneToMany
	private Set<Block> blocks;
	
	
	public Area() {}
	public Area(String name, boolean seated, double price, Stand stand) {
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
