package com.jsp.onetomanyunimappinglibrarybook.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book1 {

	@Id
	private int id;
	private String name;
	private String outher;
	private double price;
	
	public Book1() {
		// TODO Auto-generated constructor stub
	}

	public Book1(int id, String name, String outher, double price) {
		super();
		this.id = id;
		this.name = name;
		this.outher = outher;
		this.price = price;
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

	public String getOuther() {
		return outher;
	}

	public void setOuther(String outher) {
		this.outher = outher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", outher=" + outher + ", price=" + price + "]";
	}
}
