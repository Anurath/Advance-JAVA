package com.jsp.bikecrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bike_data")
public class Bike {

	@Id
	@Column(name="b_id")
	private int id;
	
	private String name;
	
	@Column(name="b_price")
	private double price;
	
	@Column(name="b_mileage")
	private double mileage;
	
	@Column(name="b_country")
	private String country;
	
	public Bike() {
		// TODO Auto-generated constructor stub
	}

	public Bike(int id,String name, double price, double mileage, String country) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.mileage = mileage;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", price=" + price + ", mileage=" + mileage + ", country="
				+ country + "]";
	}
}
