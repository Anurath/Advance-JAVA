package com.jsp.book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.book.entity.Book;

public class BookDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Book b1 = new Book(1,"Wings Of Fire",143,200);
		
		et.begin();
		
		em.persist(b1);
		
		et.commit();
	}
}
