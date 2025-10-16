package com.jsp.onttomanymappinghotelbranch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onttomanymappinghotelbranch.entity.Branch;
import com.jsp.onttomanymappinghotelbranch.entity.Hotel;

public class HotelBranchDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Branch b1 = new Branch(101,"Radha","Ram",2300000);
		Branch b2 = new Branch(102,"Garva","Raghu",1000800);
		Branch b3 = new Branch(103,"7/12","Dagdu",900000);
		Branch b4 = new Branch(104,"Gavran","Arun",400000);
		
		List<Branch> list = new ArrayList<Branch>();
		
		list.add(b1);
		list.add(b4);
		list.add(b3);
		list.add(b2);
		
		Hotel h1 = new Hotel(501, "Tiranga", "Namdev", "Dharashiv", list);
		
		et.begin();
		
		em.persist(h1);
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		em.persist(b4);
		
		et.commit();
	}
}
