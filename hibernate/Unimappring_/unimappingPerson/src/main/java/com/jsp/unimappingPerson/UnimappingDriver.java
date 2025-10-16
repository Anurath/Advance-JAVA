package com.jsp.unimappingPerson;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimappingPerson.entity.PANCard;
import com.jsp.unimappingPerson.entity.Person;

public class UnimappingDriver {

	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Person p1 = new Person(101,"Anurath",23);
		PANCard pn1 = new PANCard("AHCPW8934A","10/08/2023","11/08/2002",p1);
		
		em.persist(pn1);
		em.persist(p1);
		
		et.commit();
	}
}
