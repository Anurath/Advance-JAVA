package com.jsp.book.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	int id;
	String name;
	double price;
	int page;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String name, double price, int page) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.page = page;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", page=" + page + "]";
	}

}
