package com.inheritance.inheritance2.Employee;

public class Employee {
	String name;
	int baseSalary;
	public Employee(String name,int baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public void calculateSalary() {
		System.out.println("AnnualSalary: "+this.baseSalary * 12);
	}
}
class Manager extends Employee{
	int bonus;
	int numberofEmployeesManaged;
	public Manager(String name, int baseSalary,int bouns,int numberofEmplyeesManaged) {
		super(name, baseSalary);
		this.bonus = bonus;
		this.numberofEmployeesManaged = numberofEmplyeesManaged;
	}
	public void calculateManagerSalary() {
			System.out.println(baseSalary + bonus);
	}
	
}
