package com.University;

public abstract class Employee {
	private String employeeId;
	private String name;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(String employeeId,String name) {
		this.employeeId = employeeId;
		this.name = name;
	}
	 abstract double calculateSalary();
	 abstract void displayDetails();
	 public void printBasicInfo() {
		 System.out.println("ID: " + employeeId);
		 System.out.println("Name: "+name);
	 }
}
