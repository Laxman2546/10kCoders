package com.staticprac;


class CountIncrement{
	static int count = 0;
}

public class Count {

	public static void main(String[] args) {
	
		 new CountIncrement().count++;
		 new CountIncrement().count++;
		System.out.println(CountIncrement.count);
		new CountIncrement().count++;
		System.out.println(CountIncrement.count);
	}

}
