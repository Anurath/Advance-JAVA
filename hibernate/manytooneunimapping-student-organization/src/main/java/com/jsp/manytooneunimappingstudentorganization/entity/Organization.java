package com.jsp.manytooneunimappingstudentorganization.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Organization {

	@Id
	private int id;
	private String name;
	private String head;
	private int members;
	
	public Organization() {
		// TODO Auto-generated constructor stub
	}

	public Organization(int id, String name, String head, int members) {
		super();
		this.id = id;
		this.name = name;
		this.head = head;
		this.members = members;
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

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", head=" + head + ", members=" + members + "]";
	}
}
