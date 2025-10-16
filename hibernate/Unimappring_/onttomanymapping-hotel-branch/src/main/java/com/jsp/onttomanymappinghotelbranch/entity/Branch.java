package com.jsp.onttomanymappinghotelbranch.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {

	@Id
	private int id;
	private String name;
	private String onwer;
	private double revenue;
	
	public Branch() {
		// TODO Auto-generated constructor stub
	}

	public Branch(int id, String name, String onwer, double revenue) {
		super();
		this.id = id;
		this.name = name;
		this.onwer = onwer;
		this.revenue = revenue;
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

	public String getOnwer() {
		return onwer;
	}

	public void setOnwer(String onwer) {
		this.onwer = onwer;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + ", onwer=" + onwer + ", revenue=" + revenue + "]";
	}
}
