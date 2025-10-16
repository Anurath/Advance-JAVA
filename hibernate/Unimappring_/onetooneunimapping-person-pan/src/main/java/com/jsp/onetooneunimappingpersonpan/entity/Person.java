package com.jsp.onetooneunimappingpersonpan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int id;
	private String name;
	private int age;
	private long phno;
	
	@OneToOne
	private Pan pan;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, int age, long phno, Pan pan) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.pan = pan;
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

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public Pan getPan() {
		return pan;
	}

	public void setPan(Pan pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", phno=" + phno + ", pan=" + pan + "]";
	}
}
