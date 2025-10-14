package com.jsp.onetomanyunimappinglibrarybook.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Library {

	@Id
	private int id;
	private String name;
	private String librarain;
	private String loc;
	
	@OneToMany
	List<Book1> book;

	public Library() {
		// TODO Auto-generated constructor stub
	}

	public Library(int id, String name, String librarain, String loc, List<Book1> book) {
		super();
		this.id = id;
		this.name = name;
		this.librarain = librarain;
		this.loc = loc;
		this.book = book;
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

	public String getLibrarain() {
		return librarain;
	}

	public void setLibrarain(String librarain) {
		this.librarain = librarain;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<Book1> getBook() {
		return book;
	}

	public void setBook(List<Book1> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", librarain=" + librarain + ", loc=" + loc + ", book=" + book
				+ "]";
	}
}
