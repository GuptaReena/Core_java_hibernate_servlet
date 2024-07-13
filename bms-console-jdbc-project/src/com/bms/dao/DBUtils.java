package com.bms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	static Connection conn;
	
	//Step 1: Load Drivers
	
	static {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	//Step 2 : Establish Connection
	
	public static Connection makeConnection() {
		
		String connectionUrl = "jdbc:mysql://localhost:3306/bmsdb";
		String userName = "root";
		String password = "root";
		
		try {
			// Here we are using singleton design pattern to return the same connection			
			if(conn == null) {
			conn = DriverManager.getConnection(connectionUrl, userName, password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return conn;
	}
	
	//Step 4: close the connection
	
	public void termination() {
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
