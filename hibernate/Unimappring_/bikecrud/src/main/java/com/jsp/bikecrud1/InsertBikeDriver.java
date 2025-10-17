package com.jsp.bikecrud1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bikecrud.entity.Bike;

public class InsertBikeDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Bike Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Bike Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Price Of Bike: ");
		double price = sc.nextDouble();
		
		System.out.print("Enter Bike Mileage: ");
		double mileage = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Enter the Country: ");
		String country = sc.nextLine();
		
		Bike b1 = new Bike(id,name,price,mileage,country);
		
		et.begin();
		
		em.persist(b1);
		
		et.commit();
	}
}
