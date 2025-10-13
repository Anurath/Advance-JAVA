package com.jsp.onetomanyunimapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetomanyunimapping.entity.Company;
import com.jsp.onetomanyunimapping.entity.Employee;

public class CompanyEmployeeDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
        Employee e1 = new Employee(101, "Anurath",40000);
		
		Employee e2 = new Employee(102,"Umesh",50000);
		
		List<Employee> list = new ArrayList();
		
		Company c1 = new Company(201,"XPO","Pune", list);
		
		list.add(e1);
		list.add(e2);
		
		
		et.begin();
		em.persist(c1);
		em.persist(e1);
		em.persist(e2);
		et.commit();
	}
}
