package com.Arraysproblem.Grading;

public class main {
	public static void main(String[] args) {
		int[] mathMarks = {80, 90, 70, 85};
		int[] scienceMarks = {75, 80, 85, 90};
		int[] englishMarks = {90, 95, 88, 92};
		Student s1 = new Student();
		s1.name = "Lakshamn";

		// 3. Fill the student's course array with 3 distinct Course objects
		s1.courses[0] = new Course("Mathematics", mathMarks);
		s1.courses[1] = new Course("Science", scienceMarks);
		s1.courses[2] = new Course("English", englishMarks);
		s1.diplayPerformance();
		s1.displayStudentPerformance();
	}
}
