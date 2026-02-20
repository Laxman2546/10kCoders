package com.loops;

public class Forloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("numbers");
		for(int i=1;i<=10;i++) {
			System.out.print(i+ " ");
		}
		System.out.println("");
		System.out.println("Reverse numbers");
		for(int i=10;i>0;i--) {
			System.out.print(i+ " ");
		}
		System.out.println("");
		System.out.println("Even numbers");
		for(int i=1;i<=20;i++) {
			if(i % 2 == 0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println("");
		System.out.println("Odd numbers");
		for(int i=1;i<=15;i++) {
			if(i % 2 == 1) {
				System.out.print(i+ " ");
			}
		}
		System.out.println("");
		System.out.println("Incerased by 5");
		for(int i=5;i<=50;i=i+5) {
			System.out.print(i + " ");
		}
	}

}
