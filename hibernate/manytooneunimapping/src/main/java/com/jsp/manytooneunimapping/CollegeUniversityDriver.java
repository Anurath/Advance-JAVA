package com.jsp.manytooneunimapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.manytooneunimapping.entity.College;
import com.jsp.manytooneunimapping.entity.University;

public class CollegeUniversityDriver {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		University u = new University(441,"SPPU","Pune","UNIPUNE001");
		
		College c1 = new College(101, "P K Technical Campus Chakan", "Pune", 15, u);
		
		College c2 = new College(102, "JSPM", "Pune", 50, u);
		
		College c3 = new College(103, "K K Wagh", "Nashik", 25, u);
		
		et.begin();
		
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(u);
		
		et.commit();
	}
}
