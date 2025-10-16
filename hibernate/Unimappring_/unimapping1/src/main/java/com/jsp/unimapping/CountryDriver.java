package com.jsp.unimapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimapping1.entity.Country;
import com.jsp.unimapping1.entity.PrimeMinister;

public class CountryDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		PrimeMinister pm = new PrimeMinister(101,"Narendra Modi",75);
		
		Country c1 = new Country(501,"India","New Delhi",pm);
		
		em.persist(c1);
		em.persist(pm);
		
		et.commit();
	}
}
