package com.jsp.onetooneunimappingpersonpan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetooneunimappingpersonpan.entity.Pan;
import com.jsp.onetooneunimappingpersonpan.entity.Person;

public class PersonPanDriver {

	public static void main(String[] args) {
		 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Pan p = new Pan("AHCPW","11/08/2002","11/02/2021","Girlgaon");
		
		Person p1 =  new Person(101, "Anurath", 23, 9373818619l, p);
		
		et.begin();
		
		em.persist(p1);
		em.persist(p);
		
		et.commit();
	}
}
