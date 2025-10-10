package com.jsp.devcrud;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DevInsert {
	
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/devcrud";
			String username = "postgres";
			String password = "Anurath@123";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			Statement st = con.createStatement();
			
			String query = "INSERT INTO dev VALUES(105,'Umesh',23,74000,'Developer')";
			
			st.execute(query);
			
			con.close();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
