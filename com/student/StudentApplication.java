package com.student;

import java.util.Scanner;

class StudentDetails{
	private String name;
	private int id;
	private String courseName;
	private double totalMarks;
	public StudentDetails(String name,int id,String courseName, double totalMarks) {
		this.name = name;
		this.id = id;
		this.courseName = courseName;
		this.totalMarks = totalMarks;
		System.out.println("Student Record Created Sucessfully");
	}
	public  double addMarks(double marks ) {
		if(marks < 0) {
			System.out.println("Enter valid marks");
		}
		totalMarks += marks;
		return totalMarks;
	}
	public double getTotalMarks() {
		return totalMarks;
	}
	public String  grade() {
		System.out.println(totalMarks);
		if(totalMarks >= 90) {
				return "Grade A";
		}else if(totalMarks >= 80 && totalMarks <= 89) {
			return "Grade B";
		}else if(totalMarks >= 70 && totalMarks <= 79) {
			return "Grade C";
		}else if(totalMarks >= 60 && totalMarks <= 69) {
			return "Grade D";
		}else {
			return "Fail";
		}
		
	}
}
public class StudentApplication {
	public static void main(String[] args) {
		boolean isRunning = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		String name = sc.nextLine();
		System.out.print("Enter your Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your CourseName: ");
		String courseName = sc.nextLine();
		System.out.print("Enter your First Subject Marks: ");
		long totalMarks = sc.nextLong();
		
		StudentDetails sd = new StudentDetails(name,id,courseName,totalMarks);
		while(isRunning) {
			System.out.println("******************");
			System.out.println("Select your option[1-4]: ");
			System.out.println("1. Add more Subject Marks");
			System.out.println("2. Calculate Grade");
			System.out.println("3. View total Marks");
			System.out.println("4. Exit");
			System.out.print("Enter your option: ");
			int option = sc.nextInt();
			switch(option) {
			case 1 :
				System.out.print("Enter your marks to add: ");
				double marks = sc.nextInt();
				double studentTotalMarks = sd.addMarks(marks);
				System.out.println(name+ " " + "Total marks is"+ " " + studentTotalMarks);
				break;
			case 2:
				String studentGrade = sd.grade();
				System.out.println("your Grade is:" +" "+studentGrade);
				break;
			case 3:
				double total = sd.getTotalMarks();
				System.out.println("your Total Marks is:" + total);
				break;
			case 4:
				System.out.println("Thank You! Result processing completed");
				isRunning = false;
				break;
			default:
				System.out.println("Please Enter a Valid option");
			}
		}
		
	}
}
