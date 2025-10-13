package com.jsp.onetomanyunimapping.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {

	@Id
	private int id;
	
	private String name;
	
	private String loc;
	
	@OneToMany
	private List<Employee> employee;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(int id, String name, String loc, List<Employee> employee) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.employee = employee;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", loc=" + loc + ", employee=" + employee + "]";
	}
	
	
	
}
