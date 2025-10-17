package com.jsp.bikecrud1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bikecrud.entity.Bike;

public class UpdateBikeDriver {

	
	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Anurath");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		et.begin();
		
		System.out.print("Enter the Bike Id To Modify Information: ");
		int id = sc.nextInt();
		
		Bike b = em.find(Bike.class, id);
		
		System.out.println("Press 1 for Modify Bike Name.");
		System.out.println("Press 2 for Change Bike Price.");
		System.out.println("Press 3 to Modify Bike Country.");
		
		int opt = sc.nextInt();
		sc.nextLine();
		
		switch (opt) {
			case 1:
			{
				System.out.println("Enter New Name Of Bike: ");
				String newName = sc.nextLine();
				b.setName(newName);
				break;
			}
			case 2:
			{
				System.out.println("Enter New Price Of Bike: ");
				double price = sc.nextDouble();
				b.setPrice(price);
				break;
			}
			case 3:
			{
				System.out.println("Enter New Country Of Bike: ");
				String country = sc.nextLine();
				b.setCountry(country);
				break;
			}
		}
		
		et.commit();
	}
}
