package com.jsp.manytooneunimappingstudentorganization.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private int age;
	private String dob;
	
	@ManyToOne
	Organization org;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age, String dob, Organization org) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.org = org;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", org=" + org + "]";
	}
}
