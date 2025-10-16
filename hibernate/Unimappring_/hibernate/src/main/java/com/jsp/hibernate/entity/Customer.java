package com.jsp.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private int id;
	private String name;
	private int age;
	private long phno;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int id, String name, int age, long phno) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phno = phno;
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
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", phno=" + phno + "]";
	}
	
	
	

}
