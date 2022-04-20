package com.devolopers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstPart {
	public static Connection create() throws ClassNotFoundException, SQLException {
		String uname="root";
		String password="root";
		String url="jdbc:mysql:employee";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(uname,password,url);
		return con;
	}

}

