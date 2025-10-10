package com.jsp.studentcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentInsertOperation {

	public static void main(String[] args) {
		
		try {
			String url = "jdbc:postgresql://localhost:5432/studentcrud";
			String user = "postgres";
			String pass ="Anurath@123";
			Connection con = DriverManager.getConnection(url,user,pass);
			
			String query = "INSERT INTO STD VALUES(?,?,?,?,?)";
			
			PreparedStatement st = con.prepareStatement(query);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("How many data you want to insert: ");
			int count = sc.nextInt();
			
			for(int i=0;i<count;i++)
			{
				System.out.print("Enter Student ID: ");
				int id = sc.nextInt();
				
				System.out.print("Enter Student age: ");
				int age = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter Student Name: ");
				String name = sc.nextLine();
				
				System.out.print("Enter Student School Name: ");
				String sch = sc.nextLine();
				
				System.out.print("Enter Student Address: ");
				String add = sc.nextLine();
				
				st.setInt(1, id);
				st.setString(2,name);
				st.setInt(3, age);
				st.setString(4, sch);
				st.setString(5, add);
				
				st.execute();
				
				System.out.println("Data Inserted...");
			}
		   con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
