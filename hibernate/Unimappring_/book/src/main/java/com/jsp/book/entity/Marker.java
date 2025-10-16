package com.jsp.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marker_data")
public class Marker {
	@Id
	@Column(name = "m_id")
	private int id;
	
	@Column(name = "m_color")
	private String color;
	
	@Column(name="m_price")
	private double price;
	
	public Marker() {
		// TODO Auto-generated constructor stub
	}

	public Marker(String color, int id, double price) {
		super();
		this.color = color;
		this.id = id;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String name) {
		this.color = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Marker [name=" + color + ", id=" + id + ", price=" + price + "]";
	}
	
	
}
