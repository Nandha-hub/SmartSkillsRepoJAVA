package org.bank;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("Deposit Percentage is 2.5%");

	}
	
	public static void main(String[] args) {
		AxisBank a =new AxisBank();
		a.deposit();
		a.fixed();
		a.savings();

	}

}
