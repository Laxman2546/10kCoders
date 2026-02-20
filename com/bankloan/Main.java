package com.bankloan;

class LoanApproval{
//	Double salary;
//	int creditScore;
//	public LoanApproval(Double salary, int creditScore) {
//		super();
//		this.salary = salary;
//		this.creditScore = creditScore;
//		checkLoanApproval(salary, creditScore);
//	}
	public String checkLoanApproval(Double salary, int creditScore) {
		if(salary >= 80000 && creditScore > 750) {
			return "Loan approved immediately";
		}else if(salary >50000 && salary < 80000 && creditScore >650 && creditScore <750) {
			return "co-signer Required";
		}
		return "Loan Rejected";
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanApproval lk = new LoanApproval();
		System.out.println(lk.checkLoanApproval(85000.0, 800));
	}

}
