package com.jsp.jdbccrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonUpdateOperation {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/personcrud";
			String username = "postgres";
			String password = "Anurath@123";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			Statement st = con.createStatement();
			
			String query = "UPDATE person SET name='Pratik' WHERE id = 102";
			
			st.execute(query);
			
			con.close();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}
	}
}
