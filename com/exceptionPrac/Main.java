package com.exceptionPrac;

class Test{
	public static void tiMethod(int num) {
		try {
			System.out.println("10000");
			Handling.tilMethod(num);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Handling{
	public static void tilMethod(int num) {
		try {
			int div = 10000 / num;
			System.out.println("Completed");
		}catch(ArithmeticException e) {
		System.out.println("Airthematic Exception: " + e.getMessage());
	}finally {
		System.out.println("Finally");
		System.out.println("Coders");
	}
}
}

public class Main {
	public static void main(String[] args) {
//		Test.tiMethod(20);
		try { 
			int[] nums = null; 
			nums[0] = 10; 
			} finally {
				System.out.println("hello");
			} 
	}
}

