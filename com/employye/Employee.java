package com.employye;
import java.util.*;
import com.employye.ProjectEmployee;
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name:");
		String employeeName = sc.nextLine();
		System.out.print("Enter Employee ID:");
		String employeeId = sc.nextLine();
		System.out.print("Enter Employee Department:");
		String department = sc.nextLine();
		System.out.print("Enter Project Name:");
		String projectName = sc.nextLine();
		System.out.print("Enter Project role:");
		String projectRole = sc.nextLine();
		System.out.println("Enter 3 Monthly Performance Scores:");
		int[] scores = new int[3];
		for(int i=0;i<scores.length;i++) {
			System.out.print("Month"+(i+1)+": ");
			scores[i] = sc.nextInt();
		}
		
		ProjectEmployee pe = new ProjectEmployee(employeeName,employeeId,department,projectName,projectRole,scores);
		boolean isRunning  = true;
		while(isRunning) {
			System.out.println("--------MENU--------");
			System.out.println("1. Update Project Role\r\n"
					+ "2. Update Project Name\r\n"
					+ "3. View Employee Profile\r\n"
					+ "4. View Average Performance\r\n"
					+ "5. Exit\r\n"
					);
			System.out.print("Enter your Choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1:
					System.out.print("Enter new project role: ");
					String newProjectRole  = sc.nextLine();
					if(newProjectRole == null || newProjectRole.equals(" ")) {
						System.out.println("Enter Valid Input");
					}else {						
						pe.updateProjectRole(newProjectRole);
					}

					break;
				case 2:
					System.out.print("Enter new project Name: ");
					String newProjectName  = sc.nextLine();
					if(newProjectName == null || newProjectName.equals(" ")) {
						System.out.println("Enter Valid Input");
					}else {						
						pe.updateProjectName(newProjectName);
					}
					break;
				case 3:
					System.out.println("Employee Details: ");
					pe.display();
					break;
				case 4:
					System.out.println("Average Perfromance" +" "+pe.AverageNumber());
					break;
				case 5:	
					System.out.println("Thank you");
					isRunning=false;
					break;
				default:
					System.out.println("Please Enter valid Input");
			}
				
			
		}
		
		
		sc.close();

	}

}
