package com.jsp.empcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeInsertOperation {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/empcrud";
			String username = "postgres";
			String password = "Anurath@123";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			Statement st = con.createStatement();
			
			String query = "INSERT INTO employee VALUES(101,'Anurath',22,34000)";
			
			st.execute(query);
			
			con.close();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}
