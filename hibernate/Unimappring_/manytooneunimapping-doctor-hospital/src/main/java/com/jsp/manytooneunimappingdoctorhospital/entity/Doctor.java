package com.jsp.manytooneunimappingdoctorhospital.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Doctor {

	@Id
	private int id;
	private String name;
	private String spec;
	private long phno;
	
	@ManyToOne
	Hospital hospital;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(int id, String name, String spec, long phno, Hospital hospital) {
		super();
		this.id = id;
		this.name = name;
		this.spec = spec;
		this.phno = phno;
		this.hospital = hospital;
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

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", spec=" + spec + ", phno=" + phno + ", hospital=" + hospital
				+ "]";
	}
}
