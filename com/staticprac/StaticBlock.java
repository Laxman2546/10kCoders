package com.staticprac;

class InitializeStatic{
	static int num;
	static {
		num=25;
	}
	public static void display() {
		System.out.println(num);
	}
}


public class StaticBlock {
 public static void main(String[] args) {
	InitializeStatic.display();
}
}
