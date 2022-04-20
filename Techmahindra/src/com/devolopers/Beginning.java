package com.devolopers;

import java.sql.SQLException;
import java.util.Scanner;

public class Beginning {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		boolean b=true;
		Scanner sc=new Scanner(System.in);
		while(b) {
			System.out.println("Enter 1- to add Employe"
					+ "Enter 2-to Delete Employee"
					+ "Enter 3- to display Employee"
					+ "Enter 4- exit");
			System.out.println("Enter ur option :");
			int num=Integer.parseInt(sc.next());
			if(num==1) {
				System.out.println("Enter Employee name :");
				String name=sc.next();
				System.out.println("Enter Employee role :");
				String role=sc.next();
				System.out.println("Enter Employee's Salary :");
				String salary=sc.next();
				Employee emp=new Employee(name,role,salary);
				EmployeeDao.insertStudentToDB(emp);
				System.out.println(emp);
			}
			else if(num==2) {
				
			}
			else if(num==3) {
				
			}
			else if(num==4) {
				
				break;
			}
		}
	}

}
