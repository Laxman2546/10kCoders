package com.employye;

public class ProjectEmployee  extends Employeedet{
	private String projectName;
	private String projectRole;
	private int[] prefromanceScores  = new int[2];
	public ProjectEmployee(String employeeName, String employeeId, String department, String projectName,
			String projectRole, int[] prefromanceScores) {
		super(employeeName, employeeId, department);
		this.projectName = projectName;
		this.projectRole = projectRole;
		this.prefromanceScores = prefromanceScores;
		display();
	}
	public void display() {
		System.out.println("Employee Profile Created\n" +
                "Name: " + super.getEmployeeName() + "\n" +
                "Employee ID: " + super.getEmployeeId() + "\n" +
                "Department: " + super.getDepartment() + "\n" +
                "Project Name: " + projectName + "\n" +
                "Project Role: " + projectRole );
		System.out.print("Performance Scores: ");
		for(int scores : prefromanceScores) {
			System.out.print(scores+" ");
		}
		System.out.println();
	}
	public void updateProjectRole(String role) {
				this.projectRole=role;
	}
	public void updateProjectName(String name) {
		if(name == null || name == " ") {
			System.out.println("Enter Valid projectName");
		}
		this.projectName=name;
	}
	public int AverageNumber() {
		int res = 0;
		for(int score : prefromanceScores) {
			res += score;
		}
		res = res/prefromanceScores.length;
		return res;
	}

	
	
}
