package com.payment;

class Payment{
	Double amount;
	Integer transactionLimit;
	public void processPayment(Double amount) {
		this.amount = amount;
	}
	
}
class Credit extends Payment{
	public void processPayment() {
		
	}
}




public class Main {

	public static void main(String[] args) {
		

	}

}
