package me.boaviagem.giovane.lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/database", "root", "123456");

			return c;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
