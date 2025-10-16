package com.jsp.unimappingPerson.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	@Column(name="p_id")
	private int id ;
	
	@Column(name="p_name")
	private String name;
	
	@Column(name="P_age")
	private int age;
	
	public Person() {}
	
	public Person(int id, String name, int age)
	{
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
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
