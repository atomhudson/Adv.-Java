package com.dhruv.JBDC.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class _1ConnectionwithMySQL {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Warning@09@");
			Statement st = con.createStatement();
			int r = st.executeUpdate("insert into emp_info value('e1','Kaku Singh','Delhi',4500000,23)");
			System.out.println("Success");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
