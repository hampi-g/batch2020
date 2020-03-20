package com.sonata.JavaBean;

public class SavingAcc implements BankInterface{
	SavingAcc(){
		
	}
	public static void main(String args[]) {
		SavingAcc s1 = new SavingAcc();
		BankInterface b1 = new SavingAcc();
		b1.newMethod();
		BankInterface.anothenewMethod();
		
	}
	public double withdraw(double amount) {
		return 0;
	}
	public double deposite(double amount) {
		return 0;
	}

}
