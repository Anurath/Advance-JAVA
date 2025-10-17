package com.jsp.onetomanybidirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetomanybidirectional.entity.College;
import com.jsp.onetomanybidirectional.entity.Student;

public class CollegeStudentDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		College c1 = new College();
		c1.setId(101);
		c1.setLoc("Pune");
		c1.setName("P K Technical Campus Chakan");
		
		Student s1 = new Student();
		s1.setId(201);
		s1.setName("Anuath");
		s1.setAge(23);
		s1.setGender("Male");
		s1.setCollege(c1);
		
		Student s2 = new Student();
		s2.setId(202);
		s2.setName("Karan");
		s2.setAge(23);
		s2.setGender("Male");
		s2.setCollege(c1);
		
		Student s3 = new Student();
		s3.setId(203);
		s3.setName("Piyush");
		s3.setAge(23);
		s3.setGender("Male");
		s3.setCollege(c1);
		
		List<Student> list = new ArrayList<Student>();
		list.add(s3);
		list.add(s2);
		list.add(s1);
		
		c1.setStudents(list);
		
		et.begin();
		
		em.persist(s3);
		em.persist(s2);
		em.persist(s1);
		em.persist(c1);
		
		et.commit();
		
		
		
		
		
	}
}
