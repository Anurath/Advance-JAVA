package com.jsp.empcrud;

import java.sql.*;

public class EmployeeDeleteOperation {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/empcrud";
			String username = "postgres";
			String password = "Anurath@123";
			
			Connection  con = DriverManager.getConnection(url,username,password);
			
			Statement st = con.createStatement();
			
			String query = "DELETE FROM employee where id = 101";
			
			st.execute(query);
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
