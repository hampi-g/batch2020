package com.sonata.JavaBean;

public interface BankInterface {
	public double withdraw(double amount);
	public double deposite(double amount);
	
	//can be overriden
	
	default void newMethod() {
		System.out.println("newly added default method");
	}
	
	//can not ne override
	
	static void anothenewMethod() {
		System.out.println("newly added static method");
	}
}
