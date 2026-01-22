package com.railway;

class Railway{
	int trainNo;
	public Railway(int trainNo) {
		this.trainNo = trainNo;
	}
}
class Ticket extends Railway{
	int ticketNo;
	public Ticket(int ticketNo,int trainNo) {
		super(trainNo);
		this.ticketNo = ticketNo;
	}
}
class SleeperTicket{
	
}

public class Main {
	public static void main(String[] args) {
		
	}
}
