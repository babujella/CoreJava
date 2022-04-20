package com.devolopers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {
	public static boolean insertStudentToDB(Employee emp) throws ClassNotFoundException, SQLException {
		boolean f=false;
		Connection con=FirstPart.create();
		String query="inset into employee(sname,srole,ssalary) values(?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1,emp.getEmployeeName());
		pstmt.setString(2,emp.getEmployeeRole()); 
		return f;
	}
}
