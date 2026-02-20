package com.staticvariable;

class CountVariable{
	static int count = 0;
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
			int count =  CountVariable.count+1;
			System.out.println(CountVariable.count);

	}

}
