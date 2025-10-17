package com.jsp.onetoonebidirectionalmapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetoonebidirectionalmapping.entity.Pancard;
import com.jsp.onetoonebidirectionalmapping.entity.Person;

public class PersonPancardDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setId(101);
		p.setAge(23);
		p.setName("Name");
		
		Pancard pc = new Pancard();
		pc.setPanNumber("AHCPW8934A");
		pc.setAddress("Dharashiv");
		pc.setPincode(413534);
		
		p.setPancard(pc);
		pc.setPerson(p);
		
		et.begin();
		
		em.persist(pc);
		em.persist(p);
		
		et.commit();
	}
}
