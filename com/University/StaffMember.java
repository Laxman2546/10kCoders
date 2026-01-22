package com.University;

public class StaffMember extends Employee{
	private String designation;
	private double overtimeHours;
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public StaffMember(String employeeId, String name, String designation, double overtimeHours) {
		super(employeeId, name);
		this.designation = designation;
		this.overtimeHours = overtimeHours;
	}

	@Override
	double calculateSalary() {
		int baseSalary = 40000;
		double overtimePay = 25 * overtimeHours;
		double staffSalary = baseSalary + overtimePay;
		return staffSalary;
	}
	@Override
	void displayDetails() {
		StaffMember.super.printBasicInfo();
		System.out.println("Designation" + designation  +"\n" +"Overtime Hours:"  + overtimeHours);	
	}
}
	
