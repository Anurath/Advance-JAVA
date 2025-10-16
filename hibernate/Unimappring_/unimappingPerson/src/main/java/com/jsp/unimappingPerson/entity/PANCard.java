package com.jsp.unimappingPerson.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PANCard {

	@Id
	@Column(name="p_no")
	private String p_number;
	
	@Column(name="p_issue_date")
	private String issue_date;
	
	@Column(name="dob")
	private String dob;
	
	@OneToOne
	private Person person;
	
	public PANCard() {
		// TODO Auto-generated constructor stub
	}

	public PANCard(String p_number, String issue_date, String dob, Person person) {
		super();
		this.p_number = p_number;
		this.issue_date = issue_date;
		this.dob = dob;
		this.person = person;
	}

	public String getP_number() {
		return p_number;
	}

	public void setP_number(String p_number) {
		this.p_number = p_number;
	}

	public String getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "PANCard [p_number=" + p_number + ", issue_date=" + issue_date + ", dob=" + dob + ", person=" + person
				+ "]";
	}
	
}
