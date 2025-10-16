package com.jsp.manytooneunimapping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class University {

	@Id
	private int id;
	private String name;
	private String location;
	private String uniNum;
	
	public University() {
		// TODO Auto-generated constructor stub
	}

	public University(int id, String name, String location, String uniNum) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.uniNum = uniNum;
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

	public String getUniNum() {
		return uniNum;
	}

	public void setUniNum(String uniNum) {
		this.uniNum = uniNum;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", location=" + location + ", uniNum=" + uniNum + "]";
	}
	
}
