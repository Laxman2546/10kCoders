package com.staticprac;

class StudentDetails{
	String name;
	static String schoolName = "Sat gyan high school";
	StudentDetails(String name){
		this.name = name;
		System.out.println(name + "," + schoolName);
	}
	
}


public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails s1 = new StudentDetails("Lakshman");
		StudentDetails s2 = new StudentDetails("Vandana");
	}

}
