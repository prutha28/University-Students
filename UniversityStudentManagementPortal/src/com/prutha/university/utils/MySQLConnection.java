package com.prutha.university.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

	private static Connection conn = null;
	
	private static final String USERNAME = "prutha";
	private static final String PASSWORD = "root";
	private static final String DRIVER_URL = "jdbc:mysql://localhost:8889/universitydb";
	
	public static Connection getConnectionInstance(){
		
		if( conn == null ){
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				System.out.println("Problem in loading the driver for MYSQL.");
			}
			try {
				conn = DriverManager.getConnection(DRIVER_URL, USERNAME, PASSWORD);
				System.out.println("Connected!");
			} catch (SQLException e) {
				System.out.println("Problem in establishing connection.");
				closeConnection();
			}
		}
		
		return conn;
	}

	public static void closeConnection(){
		
		if( conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
