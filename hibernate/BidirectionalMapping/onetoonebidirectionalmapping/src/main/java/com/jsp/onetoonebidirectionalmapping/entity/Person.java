package com.jsp.onetoonebidirectionalmapping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int id;
	private String name;
	private int age;
	
	@OneToOne
	private Pancard pancard;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, int age, Pancard pancard) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.pancard = pancard;
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

	public Pancard getPancard() {
		return pancard;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", pancard=" + pancard + "]";
	}
}
