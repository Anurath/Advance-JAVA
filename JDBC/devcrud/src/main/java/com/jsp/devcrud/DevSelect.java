package com.jsp.devcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.postgresql.Driver;

public class DevSelect {
	
	public static void main(String[] args) {
		Driver d = new Driver();
		
		try {
			
			DriverManager.registerDriver(d);
			String url = "jdbc:postgresql://localhost:5432/devcrud";
			String username = "postgres";
			String password = "Anurath@123";
			
            Connection con = DriverManager.getConnection(url,username,password);
			
			Statement st = con.createStatement();
			
			String query = "SELECT * FROM dev";
			
			st.execute(query);
			
			ResultSet rs  = st.getResultSet();
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				int sal = rs.getInt(4);
				String des = rs.getString(5);
				System.out.println("Id :"+id+" name: "+name+" age: "+age+" sal: "+sal+" des: "+des);
			}
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
