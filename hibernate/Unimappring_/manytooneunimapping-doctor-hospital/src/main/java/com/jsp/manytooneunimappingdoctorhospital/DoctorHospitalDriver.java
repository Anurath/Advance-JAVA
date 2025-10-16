package com.jsp.manytooneunimappingdoctorhospital;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.manytooneunimappingdoctorhospital.entity.Doctor;
import com.jsp.manytooneunimappingdoctorhospital.entity.Hospital;

public class DoctorHospitalDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Hospital h1 = new Hospital(100,"Susan Hospital", 1000, "Pune");
		
		Doctor d1 = new Doctor(501,"Ram", "Cardiologist", 23423423423l, h1);
		Doctor d2 = new Doctor(502,"Arun", "Orthopedic", 534534534l, h1);
		Doctor d3 = new Doctor(503,"Karan", "Nueorologist", 7566743423l, h1);
		
		et.begin();
		
		em.persist(d3);
		em.persist(d2);
		em.persist(d1);
		em.persist(h1);
		
		et.commit();
		
	}
}
