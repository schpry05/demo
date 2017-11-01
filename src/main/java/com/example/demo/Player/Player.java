package com.example.demo.Player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {
	
	@Id @GeneratedValue
	Long id;
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	
	
	private String name;
	private String position;
	
	public Player()
	{
		super();
	}
	
	
	public Player(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
