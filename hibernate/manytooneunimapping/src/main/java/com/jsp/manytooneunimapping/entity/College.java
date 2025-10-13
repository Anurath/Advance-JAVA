package com.jsp.manytooneunimapping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class College {

	@Id
	private int id;
	private String name;
	private String location;
	private int buses;
	
	@ManyToOne
	private University university;
	
	public College() {
		// TODO Auto-generated constructor stub
	}

	public College(int id, String name, String location, int buses, University university) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.buses = buses;
		this.university = university;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getBuses() {
		return buses;
	}

	public void setBuses(int buses) {
		this.buses = buses;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", location=" + location + ", buses=" + buses + ", university="
				+ university + "]";
	}
	
	
}
