package com.jsp.devcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.postgresql.Driver;

public class DevDelete {
	
	public static void main(String[] args) {
		Driver d = new Driver();
		
		try {
			
			DriverManager.registerDriver(d);
			String url = "jdbc:postgresql://localhost:5432/devcrud";
			String username = "postgres";
			String password = "Anurath@123";
			
            Connection con = DriverManager.getConnection(url,username,password);
			
			Statement st = con.createStatement();
			
			String query = "DELETE FROM dev WHERE id=101";
			
			st.execute(query);
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
