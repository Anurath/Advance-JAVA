package com.jsp.unimapping1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Country {

	@Id
	@Column(name="c_id")
	private int id;
	
	@Column(name="c_name")
	private String name;
	
	@Column(name="c_capital")
	private String capital;
	
	@OneToOne
	PrimeMinister pm ;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}

	public Country(int id, String name, String capital, PrimeMinister pm) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
		this.pm = pm;
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

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public PrimeMinister getPm() {
		return pm;
	}

	public void setPm(PrimeMinister pm) {
		this.pm = pm;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", capital=" + capital + ", pm=" + pm + "]";
	}
	
}
