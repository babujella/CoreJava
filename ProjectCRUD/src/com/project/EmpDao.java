package com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDao {
	public static Connection  create() throws ClassNotFoundException, SQLException{
		String uname="root";
		String password="root";
		String url="jdbc:mysql:data";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(uname,password,url);
		return con;
	}
	public void save(Employe e) throws Throwable, SQLException {
		Connection con=EmpDao.create();
		PreparedStatement st=con.prepareStatement("insert into datatable(name,password,country)values(?,?,?)");
		st.setString(1, e.getName());
		st.setString(2, e.getPassword());
		st.setString(3, e.getCountry());
		int status = st.executeUpdate();
		con.close();
	}
	public void update(Employe e) throws ClassNotFoundException, SQLException {
		Connection con=EmpDao.create();
		PreparedStatement st=con.prepareStatement("update datatable set name=?,password=?,country=?");
		st.setString(1, e.getName());
		st.setString(2, e.getPassword());
		st.setString(3, e.getCountry());
		st.setInt(4, e.getId());
		int status = st.executeUpdate();
		con.close();
	}
	public void delete(Employe e) throws ClassNotFoundException, SQLException {
		Connection con=EmpDao.create();
		PreparedStatement st=con.prepareStatement("delete from datatable where id=?");
		st.setInt(1,e.getId());
		con.close();
	}
}
