package com.amdocs.PropertySearchSystem.DOA;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
	
public Connection getConnection() {
		
		String dbUrl = "jdbc:mysql://localhost:3306/world";
		String username = "root";
		String password = "root";
		try {
			
			return DriverManager.getConnection(dbUrl,username,password); //connec
		}
		catch(Exception e) {
			System.out.println("Error in ConnectionClass....!");
		}
		return null;
	}

}
