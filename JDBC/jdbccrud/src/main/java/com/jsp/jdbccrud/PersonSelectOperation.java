package com.jsp.jdbccrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonSelectOperation {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/personcrud";
			String user = "postgres";
			String password = "Anurath@123";
			
			Connection con = DriverManager.getConnection(url,user,password);
			
			Statement st = con.createStatement();
			
			String query = "SELECT * FROM person";
			
			boolean res = st.execute(query);
			
			ResultSet rs = st.getResultSet();
			while(rs.next())
			{
				System.out.print("Id: "+ rs.getInt(1)+" Name: "+rs.getString(2)+" Age: "+rs.getInt(3));
				System.out.println();
			}
			
			con.close();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}
	}
}
