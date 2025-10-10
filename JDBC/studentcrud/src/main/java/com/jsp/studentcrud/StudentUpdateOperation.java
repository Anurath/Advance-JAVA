package com.jsp.studentcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentUpdateOperation {
	
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			String url = "jdbc:postgresql://localhost:5432/studentcrud";
			String user = "postgres";
			String pass = "Anurath@123";
			
			Connection con = DriverManager.getConnection(url,user,pass);
			
			String query = "UPDATE std set name=? where id =?";
			
			PreparedStatement st = con.prepareStatement(query);
			
				
				System.out.print("Enter the id: ");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter New Name: ");
				String name = sc.nextLine();
				
				st.setInt(2, id);
				st.setString(1, name);
				st.execute();
				
				con.close();
				System.out.println("Data Updated Successfully.");
				
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
