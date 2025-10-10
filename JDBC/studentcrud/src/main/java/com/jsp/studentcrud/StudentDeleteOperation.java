package com.jsp.studentcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentDeleteOperation {
	
	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
			
			String url = "jdbc:postgresql://localhost:5432/studentcrud";
			String user = "postgres";
			String pass = "Anurath@123";
			
			Connection con = DriverManager.getConnection(url, user, pass);
			
			String query = "DELETE FROM std where id=?";
			
			PreparedStatement st = con.prepareStatement(query);
			
			System.out.print("Enter the Student ID to Delete Data: ");
			int id  = sc.nextInt();
			
			st.setInt(1, id);
			
			st.execute();
			
			System.out.println("Data Removed Successfully");
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
