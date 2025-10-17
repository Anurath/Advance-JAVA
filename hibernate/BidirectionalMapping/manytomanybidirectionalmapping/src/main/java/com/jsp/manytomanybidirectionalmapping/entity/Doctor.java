package com.jsp.manytomanybidirectionalmapping.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Doctor {

	@Id
	private int id;
	private String name;
	private String specialization;
	
	@ManyToMany
	List<Patient> patient;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", specialization=" + specialization + ", patient=" + patient
				+ "]";
	}
}
