package com.operations;
import java.util.Scanner;
public class OperatorsAssignment {
	static Scanner sc = new Scanner(System.in);
	public static void calculate() {
		System.out.print("Enter number1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter number2: ");
		int num2 = sc.nextInt();
		num1 = ++num1;
		num2 = num2++;
		System.out.println("Pre-increment: " + num1);
		System.out.println("Post-increment: " + num2);
	}
	public static void checkAge() {
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		if(age >= 18 && id > 0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	public static String convertBintoDec(int num) {
		String res = "";
		while(num > 0) {
			int rem = num % 2;
			res = rem + res;
			num = num / 2;
		}
		return res;
	}
	public static void bitwise() {
		System.out.print("Enter number1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter number2: ");
		int num2 = sc.nextInt();
		System.out.println("--------------------------------------");
		System.out.println("Binary Format");
		System.out.println("And operation: " + convertBintoDec((num1 & num2)));
		System.out.println("Or operation: " + convertBintoDec((num1 | num2)));
		System.out.println("Xor operation: " + convertBintoDec((num1 ^ num2)));
		System.out.println("left shift operation: " + convertBintoDec((num1 << 1)));
		System.out.println("Right shift operation: " + convertBintoDec((num2 >> 1)));
		System.out.println("--------------------------------------");
		System.out.println("Decimal Format");
		System.out.println("And operation: " + (num1 & num2));
		System.out.println("Or operation: " + (num1 | num2));
		System.out.println("Xor operation: " + (num1 ^ num2));
		System.out.println("left shift operation: " + (num1 << 1));
		System.out.println("Right shift operation: " + (num2 >> 1));
	}
	public static void compound() {
		System.out.print("Enter Score: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Bonus: ");
		int num2 = sc.nextInt();
		
		System.out.println("Addition " + (num1+=num2));
		System.out.println("subtraction: " + (num1-=num2));
		System.out.println("Multiplication: " + (num1*=num2));
		System.out.println("Division: " + (num1/=num2));
		System.out.println("Percentage: " + (num1%=num2));
	}
	public static void complex() {
		System.out.print("Enter number1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter number2: ");
		int num2 = sc.nextInt();
		System.out.print("Enter number3: ");
		int num3 = sc.nextInt();
		if((num1>num2)&& (num2 > num3) ||(num1!=num3)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	public static void main(String[] args) {
		boolean isTrue = true;
		while(isTrue) {
			System.out.print("1. calculate\n2. check age and id\n3.bitwise operators\n4.compound assignment\n5.complex logic\n");
			System.out.print("Choose the number: ");
			int choice  = sc.nextInt();
			switch(choice) {
			case 1:
				calculate();
				break;
			case 2:
				checkAge();
				break;
			case 3:
				bitwise();
				break;
			case 4:
				compound();
			case 5:
				complex();
			case 6:
				isTrue=false;
				break;
			default:
				System.out.println("Input invallid");
			}
		}
	
	}

}
