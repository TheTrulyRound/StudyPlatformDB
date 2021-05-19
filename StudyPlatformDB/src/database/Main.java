package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		getConnection();
	}

	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3333/test";
			String username = "root";
			String password = "Rkd71077498*";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return conn;
		} catch(Exception e) {System.out.println(e);}
		
		return null;
	}
	
}
