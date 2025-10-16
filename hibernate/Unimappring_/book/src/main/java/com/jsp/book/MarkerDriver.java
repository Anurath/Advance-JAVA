package com.jsp.book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.book.entity.Marker;

public class MarkerDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tr = em.getTransaction();
		
		Marker m1 = new Marker("Blue",1,25);
		Marker m2 = new Marker("Pink",2,100);
		Marker m3 = new Marker("Yellow",3,50);
		
		tr.begin();
		
//		save data 
//		em.persist(m1);
//		em.persist(m2);
//		em.persist(m3);
		
//		To Fetch data
//		Marker m = em.find(Marker.class,1);
//		System.out.println(m);
		
//		To Delete data
//		Marker m = em.find(Marker.class, 2);
//		em.remove(m);
		
		Marker m = em.find(Marker.class, 3);
	
		m.setColor("Black");
		m.setPrice(122);
		
		em.merge(m);
		
		tr.commit();
		
	}
}
