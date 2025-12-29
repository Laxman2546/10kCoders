package com.inheritance;

class Employee{
	double salary = 50000;
	
}
class Manager extends Employee{
	double bonus = 20000;
	
}

public class Employeeinherit {

	public static void main(String[] args) {
		Manager manager = new Manager();
		double totalSalary = manager.salary + manager.bonus;
		System.out.println("Total salary :"+ totalSalary);
	}

}
