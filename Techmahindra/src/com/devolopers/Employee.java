package com.devolopers;

public class Employee {
	private int id;
	private String name;
	private String role;
	private String salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, String role, String salary) {
		super();
		id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	public Employee(String name, String role, String salary) {
		super();
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	public String getEmployeeName() {
		// TODO Auto-generated method stub
		return null;
	}
}