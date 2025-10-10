package com.jsp.employeebatchcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class batchcrud {

	public static void main(String[] args) {
		
		String url = "jdbc:postgresql://localhost:5432/employeebatch";
		String user = "postgres";
		String pass = "Anurath@123";
		
		try(Connection con = DriverManager.getConnection(url, user, pass); Scanner sc = new Scanner(System.in);)
		{
			Statement st = con.createStatement();
			String addquery = "INSERT INTO emp VALUES(1,'Umesh',22)";
			st.addBatch(addquery);
			
			String addquery1 = "INSERT INTO emp VALUES(2,'Pratik',22)";
			st.addBatch(addquery1);
			
			String addquery2 = "INSERT INTO emp VALUES(3,'Anurath',22)";
			st.addBatch(addquery2);
			
			String deleteQuery = "DELETE FROM emp WHERE id = 1";
			st.addBatch(deleteQuery);
			
			String updateQuery = "UPDATE emp SET NAME='Ram' WHERE id = 3";
			st.addBatch(updateQuery);
			
			st.executeBatch();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
}
