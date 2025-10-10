package com.jsp.studentcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StudentFetchOperation {

	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			String url = "jdbc:postgresql://localhost:5432/studentcrud";
			String user = "postgres";
			String pass = "Anurath@123";
			
			Connection con = DriverManager.getConnection(url, user, pass);
			
			String query = "SELECT * FROM std where id=?";
			
			System.out.println("Enter Student ID to Show Data: ");
			int id = sc.nextInt();
			
			PreparedStatement st = con.prepareStatement(query);
			
			st.setInt(1, id);
			
			st.execute();
			
			ResultSet rs = st.getResultSet();
			
			while(rs.next())
			{
				int ids = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String scl = rs.getString(4);
				String add = rs.getString(5);
				System.out.println("Id :"+ids+" name: "+name+" age: "+age+" sal: "+scl+" des: "+add);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
