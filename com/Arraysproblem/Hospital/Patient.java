package com.Arraysproblem.Hospital;

import java.util.Iterator;

public class Patient {
	int patientId;
	String name;
	double[] testResults = new double[5];
	
	public Patient(int patientId,String name,double[] testResults) {
		this.patientId = patientId;
		this.name = name;
		this.testResults = testResults;
	}
	public void getAverageResult() {
		int sum = 0;
		for(int i=0;i<testResults.length;i++) {
			sum += testResults[i];
		}
		System.out.println("Average: "+ sum/testResults.length);
	}
	public boolean hasCriticalValues() {
		System.out.println("-------------------------------------");
		for(int i=0;i<testResults.length;i++) {
			if(testResults[i] < 50) {
				return true;
			}
		}
		return false;
	}
	public void displayInformation() {
		System.out.println("-------------------------------------");
		System.out.println("Patient Details: ");
		System.out.println("Patiend id: "+ this.patientId+ "\n"+"Patient name: " + this.name);
		System.out.print("Test Results: ");
		for(int i=0;i<testResults.length;i++) {
			System.out.print(testResults[i] + " ");
	   }
	}
}
