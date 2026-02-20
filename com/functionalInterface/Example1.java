package com.functionalInterface;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Employee{
	private String empName;
	private String empDesg;
	private double empSalary;
	public Employee(String empName, String empDesg, double empSalary) {
		super();
		this.empName = empName;
		this.empDesg = empDesg;
		this.empSalary = empSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
}

public class Example1 {
	public static void main(String[] args) {
		Predicate<Employee> empData = new Predicate<Employee>() {
				public boolean test(Employee emp) {
					return emp.getEmpSalary() > 10000;
				}
		};
		Consumer<Employee> consumer = new Consumer<Employee>() {
			public void accept(Employee emp) {
				System.out.println(emp.getEmpName() +" "+ emp.getEmpDesg() +" "+ emp.getEmpSalary());
			}
		};
		
		Employee emp = new Employee("Ramu","Hero",30000.0);
		Employee emp2 = new Employee("Ragavi","Heroine",100000.0);
		Employee emp3 = new Employee("Raghu","Lightman",5000.0);
		
		Employee[] employees = {emp,emp2,emp3};
		for(Employee employee:employees) {
			if(empData.test(employee)) {
				employee.setEmpSalary(employee.getEmpSalary() + (employee.getEmpSalary() * 0.1));
				consumer.accept(employee);
			}else {
				System.out.println(employee.getEmpName()+ " " + "salary is below 10000");
			}
		}
	}

}
