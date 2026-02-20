package com.staticvariable;

class CountVariable{
	static int count = 0;
	public static int incremeant() {
		 return count++;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int c1 = new CountVariable().incremeant();

		int c2 = new CountVariable().incremeant();
		
		int c3 = new CountVariable().incremeant();
		
		int c4 = new CountVariable().incremeant();
		
		int c5 = new CountVariable().incremeant();
		System.out.println(CountVariable.count);

	}

}
