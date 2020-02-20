package io.team.springbootstarter.player;

import javax.persistence.Entity;
import javax.persistence.Id;

//this class is a player Entity.
@Entity
public class Player {
	
	@Id
	private String number;
	private String name;
	private String Position;
	
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(String number, String name, String position) {
		super();
		this.number = number;
		this.name = name;
		this.Position = position;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	
	

}
