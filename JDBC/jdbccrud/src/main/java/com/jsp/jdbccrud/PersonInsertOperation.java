package com.jsp.jdbccrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PersonInsertOperation {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/personcrud";
			String username = "postgres";
			String password = "Anurath@123";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			Statement st  = con.createStatement();
			
			String query = "INSERT INTO person VALUES(103,'Pratik',24)";
			st.execute(query);
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
