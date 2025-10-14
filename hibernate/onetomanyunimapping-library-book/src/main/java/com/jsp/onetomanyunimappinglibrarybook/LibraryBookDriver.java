package com.jsp.onetomanyunimappinglibrarybook;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetomanyunimappinglibrarybook.entity.Book1;
import com.jsp.onetomanyunimappinglibrarybook.entity.Library;

public class LibraryBookDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Book1 b1 = new Book1(101,"Wings Of Fire", "APJ Abdul Kalam",120);
		Book1 b2 = new Book1(102,"Godan", "Munshi Premchand",220);
		Book1 b3 = new Book1(103,"Partition Of India", "DR. B R Ambedkar",180);
		
		List<Book1> list = new ArrayList<Book1>();
		
		list.add(b3);
		list.add(b2);
		list.add(b1);
		
		Library l1 = new Library(201, "Savitribai Phule Library", "XYZ", "Pune", list);
		
		et.begin();
		
		em.persist(l1);
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		
		et.commit();
		
	}
}
