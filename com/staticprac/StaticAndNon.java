package com.staticprac;

class Cricket{
	int totalSixesbyPlayer = 0;
	static int totalIplSixes = 0;
	
	Cricket(){
		totalSixesbyPlayer++;
		totalIplSixes++;
	}
	
	void display() {
		System.out.println("PersonalSixes" + " " +totalSixesbyPlayer+" "+"Total Sixes"+" "+totalIplSixes);
	}
}

public class StaticAndNon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c1 = new Cricket();
		c1.display();
		Cricket c2 = new Cricket();
		c2.display();
		Cricket c3 = new Cricket();
		c3.display();
	}

}
