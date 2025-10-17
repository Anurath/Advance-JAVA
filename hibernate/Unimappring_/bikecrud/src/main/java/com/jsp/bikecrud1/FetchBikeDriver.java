package com.jsp.bikecrud1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bikecrud.entity.Bike;

public class FetchBikeDriver {

	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Id of Bike: ");
		int id = sc.nextInt();
		
		Bike b = em.find(Bike.class,id);
		
		System.out.println(b);
	}
}
