package com.jsp.onetoonebidirectionalmapping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard {

	@Id
	private String panNumber;
	private String address;
	private int pincode;
	
	@OneToOne
	private Person person;
	
	public Pancard() {
		// TODO Auto-generated constructor stub
	}

	public Pancard(String panNumber, String address, int pincode, Person person) {
		super();
		this.panNumber = panNumber;
		this.address = address;
		this.pincode = pincode;
		this.person = person;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Pancard [panNumber=" + panNumber + ", address=" + address + ", pincode=" + pincode + ", person="
				+ person + "]";
	}
}
