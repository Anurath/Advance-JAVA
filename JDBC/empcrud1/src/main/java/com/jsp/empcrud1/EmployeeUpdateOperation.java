package com.jsp.empcrud1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeUpdateOperation {

	public static void main(String[] args) {
		
		String url = "jdbc:postgresql://localhost:5432/employee1";
		String user = "postgres";
		String pass = "Anurath@123";
		
		try(Connection con = DriverManager.getConnection(url,user,pass); Scanner sc = new Scanner(System.in);)
		{
			String query = "UPDATE emp SET name =? WHERE ID=?";
			
			PreparedStatement st = con.prepareStatement(query);
			
			System.out.print("Enter Name You want to change: ");
			String name = sc.nextLine();
			
			System.out.print("Enter Id: ");
			int id = sc.nextInt();
			
			st.setString(1, name);
			st.setInt(2,id);
			
			st.execute();
			
			System.out.println("Data Updated Successfully.");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
