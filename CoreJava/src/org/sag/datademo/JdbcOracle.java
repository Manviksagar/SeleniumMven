package org.sag.datademo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOracle {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","sag");
	 System.out.println("connection established");
	 Statement st=con.createStatement();
	 
	 
		
		
		
	}

}
