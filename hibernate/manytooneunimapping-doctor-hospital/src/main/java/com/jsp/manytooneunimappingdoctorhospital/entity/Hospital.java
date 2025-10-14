package com.jsp.manytooneunimappingdoctorhospital.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {

	@Id
	private int id;
	private String name;
	private int numberOrDoctors;
	private String loc;
	
	public Hospital() {
		// TODO Auto-generated constructor stub
	}

	public Hospital(int id, String name, int numberOrDoctors, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.numberOrDoctors = numberOrDoctors;
		this.loc = loc;
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

	public int getNumberOrDoctors() {
		return numberOrDoctors;
	}

	public void setNumberOrDoctors(int numberOrDoctors) {
		this.numberOrDoctors = numberOrDoctors;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", numberOrDoctors=" + numberOrDoctors + ", loc=" + loc + "]";
	}
}
