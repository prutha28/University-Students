package com.prutha.university.clients;

import java.sql.Connection;

import com.prutha.university.utils.MySQLConnection;

public class DBClient {

	public static void main( String[] args){
		Connection conn = MySQLConnection.getConnectionInstance();
	}
	
}
