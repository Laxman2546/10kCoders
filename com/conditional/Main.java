package com.conditional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num  = 25;
		System.out.println(num % 2 == 0);
		
		if(num > 18) {
			System.out.println("Eligible for vote");
		}else {
			System.out.println("Not Eligible for vote");
		}
	}

}
