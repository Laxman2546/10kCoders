package com.University;


public class UniversityManagementSystem {

	public static void main(String[] args) {
		Employee[] employee = new Employee[4];
		employee[0] = new FacultyMember("F001","John Smith" , 101, 5);
		employee[1] = new StaffMember("S001","Jane Doe" ,"Administrator",20.0);
		employee[2] = new StaffMember("S002","Riya" ,"Incharge",5.0);
		employee[3] = new FacultyMember("F002","Meenu" , 102, 10);
		for(Employee emp : employee) {
			System.out.println("Employee Details:");
			emp.displayDetails();
			double salary = emp.calculateSalary();
			System.out.println("Monthly Salary: " +  salary);
			System.out.println("");
		}
				
	}

}
