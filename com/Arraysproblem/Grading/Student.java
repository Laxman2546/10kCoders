package com.Arraysproblem.Grading;

public class Student {
	int rollNo;
	String name;
	Course[] courses = new Course[3];
	void displayStudentPerformance() {
	    System.out.println("Student Name: " + name);

	    for (int i = 0; i < courses.length; i++) {
	        int sum = 0;
	        for (int j = 0; j < courses[i].marks.length; j++) {
	            sum += courses[i].marks[j];
	        }
	        
	        double courseAvg = sum / 4.0;
	        System.out.println("  Course: " + courses[i].courseName + " | Average: " + courseAvg);
	    }
	}
	
	void diplayPerformance() {
		for(Course course :courses) {
			System.out.println("course name: "+course.courseName);
		}
	}
}

