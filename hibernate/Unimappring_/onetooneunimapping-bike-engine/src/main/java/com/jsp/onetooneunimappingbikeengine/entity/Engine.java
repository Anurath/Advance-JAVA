package com.jsp.onetooneunimappingbikeengine.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {

	@Id
	private int id;
	private int horsepower;
	private double capacity;
	private String type;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}

	public Engine(int id, int horsepower, double capacity, String type) {
		super();
		this.id = id;
		this.horsepower = horsepower;
		this.capacity = capacity;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", horsepower=" + horsepower + ", capacity=" + capacity + ", type=" + type + "]";
	}
	
}
