package com.jsp.onttomanymappinghotelbranch.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hotel {

	@Id
	private int id;
	private String name;
	private String owner;
	private String loc;
	
	@OneToMany
	List<Branch> branch;
	
	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	public Hotel(int id, String name, String owner, String loc, List<Branch> branch) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.loc = loc;
		this.branch = branch;
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

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<Branch> getBranch() {
		return branch;
	}

	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", owner=" + owner + ", loc=" + loc + ", branch=" + branch + "]";
	}
}
