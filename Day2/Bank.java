package com.sonata;

public class Bank
{
	int accNo;
	String accName;
	double accBal;
	
	Bank(int no,String name,double bal)
	{
		this.accNo = no;
		this.accName = name;
		this.accBal = bal;
	}
	Bank()
	{
		
	}
	public void deposite()
	{
		System.out.println("bank deposite");
	}
	public void withdraw()
	{
		System.out.println("bank withdrw");
	}
	public void display()
	{
		System.out.println(accNo);
		System.out.println(accName);
		System.out.println(accBal);
	}
	
}
