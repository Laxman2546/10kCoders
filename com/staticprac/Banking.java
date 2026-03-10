package com.staticprac;


class BankAccount{
	static int intrestRate = 25;
	int balanace = 250;
	
	public static void changeIntrest(int intrest) {
			intrestRate = intrest;
			System.out.println("New intrestRate :" + intrestRate);
	}
}

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BankAccount().changeIntrest(52);

	}

}
