package com.jsp.unimapping1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrimeMinister {

	@Id
	@Column(name="p_id")
	private int id;
	
	@Column(name="P_name")
	private String name;
	
	@Column(name="p_age")
	private int age;
	
	public PrimeMinister() {
	}

	public PrimeMinister(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PrimeMinister [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
