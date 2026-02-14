package com.employye;

public class Employeedet {
	private String employeeName;
	private String employeeId;
	private String department;
	
	public Employeedet(String employeeName, String employeeId, String department) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.department = department;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
}
