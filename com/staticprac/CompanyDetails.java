package com.staticprac;

class Company{
	public static String companyName = "Velura Foundations";
	public static void display() {
		System.out.println(companyName);
	}
}

public class CompanyDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company.display();
		Company.companyName="Velura pvt.Ltd";
		Company.display();
	}

}
