package com.jsp.onetooneunimappingbikeengine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetooneunimappingbikeengine.entity.Bike;
import com.jsp.onetooneunimappingbikeengine.entity.Engine;

public class BikeEngineDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Engine e1 = new Engine(101, 120,1.5, "Petrol");
		
		Bike b1 = new Bike(201,"Hero Honda", "Honda", 120000, e1);
		
		et.begin();
		
		em.persist(b1);
		em.persist(e1);
		
		et.commit();
	}
}
