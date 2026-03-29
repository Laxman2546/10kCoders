package com.Arraysproblem.Hospital;

public class HospitalManagement {

	public static void main(String[] args) {
		double[] testData = {12.5,80.5,60.12,120.5,150.8};
		Patient pt = new Patient(121, "Lakshman",testData);
		pt.getAverageResult();
		System.out.println("Is Patient Critical: " + pt.hasCriticalValues());
		pt.displayInformation();
	}

}
