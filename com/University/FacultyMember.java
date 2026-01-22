package com.University;

public class FacultyMember extends Employee{
	private int departmentCode;
	public int getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}
	private int yearsofService;
	public FacultyMember(String employeeId, String name, int departmentCode, int yearsofService) {
		super(employeeId, name);
		this.departmentCode = departmentCode;
		this.yearsofService = yearsofService;
	}
	@Override
	double calculateSalary() {
		int baseSalary = 50000;
		int experienceBonus = yearsofService * 1000;
		double salary  = baseSalary + experienceBonus;
		return salary;
	}
	@Override
	void displayDetails() {
		FacultyMember.super.printBasicInfo();
		System.out.println("Department Code: " + departmentCode+ "\n" +"Years of Service: " + yearsofService);
	}
	
	
}
