package com.jsp.empcrud1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeFetchOperation {

	public static void main(String[] args) {
		
		String url = "jdbc:postgresql://localhost:5432/employee1";
		String user = "postgres";
		String pass = "Anurath@123";
		
		try(Connection con = DriverManager.getConnection(url, user, pass); Scanner sc = new Scanner(System.in);)
		{
			String query =  "SELECT * FROM EMP";
			
			PreparedStatement st = con.prepareStatement(query);
			
			st.execute();
			
			ResultSet rs = st.getResultSet();
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				double sal = rs.getDouble(4);
				String des = rs.getString(5);
				
				System.out.println("ID: "+id+", Name: "+name+", Age: "+age+", Salary: "+sal+", Designation: "+des);
				
			}
			
		}catch(SQLException e)
		{
			System.out.println(e);
		}
	}
}
