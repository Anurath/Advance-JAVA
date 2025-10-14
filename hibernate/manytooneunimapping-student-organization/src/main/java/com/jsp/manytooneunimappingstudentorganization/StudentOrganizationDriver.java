package com.jsp.manytooneunimappingstudentorganization;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.manytooneunimappingstudentorganization.entity.Organization;
import com.jsp.manytooneunimappingstudentorganization.entity.Student;

public class StudentOrganizationDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Organization o1 = new Organization(10, "Sport", "Anurath",50);
		
		
		Student s1 = new Student(101, "Anurath",23, "11/08/2002", o1);
		Student s2 = new Student(102, "Umesh",22, "01/03/2003", o1);
		Student s3 = new Student(103, "Pratik",23, "16/10/2002", o1);
		
		et.begin();
		
		em.persist(s3);
		em.persist(s1);
		em.persist(s2);
		em.persist(o1);
		
		et.commit();
	}
}
