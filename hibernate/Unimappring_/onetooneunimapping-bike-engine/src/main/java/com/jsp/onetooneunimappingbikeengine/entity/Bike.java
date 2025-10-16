package com.jsp.onetooneunimappingbikeengine.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike {

	@Id
	private int id;
	private String name;
	private String brand;
	private double price;
	
	@OneToOne
	Engine engine;
	
	public Bike() {
		// TODO Auto-generated constructor stub
	}

	public Bike(int id, String name, String brand, double price, Engine engine) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.engine = engine;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", engine=" + engine
				+ "]";
	}
}
