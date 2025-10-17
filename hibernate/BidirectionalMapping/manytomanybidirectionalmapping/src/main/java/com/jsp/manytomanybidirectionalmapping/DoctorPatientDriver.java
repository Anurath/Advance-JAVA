package com.jsp.manytomanybidirectionalmapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.manytomanybidirectionalmapping.entity.Doctor;
import com.jsp.manytomanybidirectionalmapping.entity.Patient;

public class DoctorPatientDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Doctor d1 = new Doctor();
		d1.setId(101);
		d1.setName("Gavde");
		d1.setSpecialization("General");
		
		Doctor d2 = new Doctor();
		d1.setId(102);
		d1.setName("Bhosle");
		d1.setSpecialization("Neurologist");
		
		Doctor d3 = new Doctor();
		d1.setId(103);
		d1.setName("Nene");
		d1.setSpecialization("Orthopedic");
		
		List<Doctor> docList1 = Arrays.asList(d1,d2);
		List<Doctor> docList2 = Arrays.asList(d1,d3);
		
		Patient p1 = new Patient();
		p1.setId(201);
		p1.setName("Umesh");
		p1.setDisease("Fracture");
		
		Patient p2 = new Patient();
		p2.setId(202);
		p2.setName("Pratik");
		p2.setDisease("Fever");
		
		Patient p3 = new Patient();
		p3.setId(203);
		p3.setName("Ram");
		p3.setDisease("Pnumonia");
		
		List<Patient> pitList1 = Arrays.asList(p1,p2);
		List<Patient> pitList2 = Arrays.asList(p1,p3);
		
		d1.setPatient(pitList1);
		d2.setPatient(pitList1);
		d3.setPatient(pitList2);
		
		
		p1.setDoctor(docList1);
		p2.setDoctor(docList1);
		
		et.begin();
		
		em.persist(d1);
		em.persist(d2);
		em.persist(d3);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		et.commit();
		
		
		
		
	}
}
