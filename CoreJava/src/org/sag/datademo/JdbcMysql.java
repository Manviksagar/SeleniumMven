package org.sag.datademo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMysql {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/sag", "root", "");

		System.out.println("connection established");
		//to fecth entire table i have created below procedure
		//CallableStatement cal = conn.prepareCall("call sp_test()");
		CallableStatement cal = conn.prepareCall("call sp_sag()");
		ResultSet rs = cal.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getString(1));
			//System.out.println(rs.getInt(1) + "   " + rs.getString(2));
		}
			
		
		/*Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from sag_ta");
		while(rs.next()){
			
			System.out.println(rs.getInt(1)+"   "+rs.getString(2));
			
		}*/
		

	}

}
