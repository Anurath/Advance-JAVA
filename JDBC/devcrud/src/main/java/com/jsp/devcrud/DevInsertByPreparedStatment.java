package com.jsp.devcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DevInsertByPreparedStatment {
	
	
	public static void main(String[] args) {
		
		
		try {
			String ur = "jdbc:postgresql://localhost:5432/devcrud?user=postgres&password=Anurath@123";
			
			Connection con = DriverManager.getConnection(ur);
			
			String query = "INSERT INTO dev VALUES(?,?,?,?,?)";
			
			PreparedStatement st = con.prepareStatement(query);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("How many data you want to add: ");
			int count = sc.nextInt();
			
			for(int i=0;i<count;i++)
			{
				System.out.print("Enter ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter salary: ");
				int sal = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter designation: ");
				String des = sc.nextLine();
				
				st.setInt(1, id);
				st.setString(2,name);
				st.setInt(3, age);
				st.setInt(4,sal);
				st.setString(5, des);
				
				st.execute();
				
				System.out.println("Data Inserted......");
			
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
