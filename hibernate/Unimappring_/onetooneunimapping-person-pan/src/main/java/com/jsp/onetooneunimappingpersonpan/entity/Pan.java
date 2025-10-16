package com.jsp.onetooneunimappingpersonpan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pan {

	@Id
	private String panNumber;
	private String dob;
	private String issue_date;
	private String address;
	
	public Pan() {
		// TODO Auto-generated constructor stub
	}

	public Pan(String panNumber, String dob, String issue_date, String address) {
		super();
		this.panNumber = panNumber;
		this.dob = dob;
		this.issue_date = issue_date;
		this.address = address;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Pan [panNumber=" + panNumber + ", dob=" + dob + ", issue_date=" + issue_date + ", address=" + address
				+ "]";
	}
}
