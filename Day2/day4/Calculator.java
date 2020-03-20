package com.sonata.Lambda;

interface Cal{
	//void SwitchOn();
	void sum(int input);
	//int substract(int i1,int i2);
}


public class Calculator {
	
	public static void main(String args[]) {
		
		//Cal c1 = ()->{System.out.println("Lambda way of Function");};
		//c1.SwitchOn();
		Cal c1 = (int input)->{System.out.println(input);};
		c1.sum(10);
		//Cal c1 = (i1,i2)->{return i2-i1;}
		
		MyFunctionalInterface x1 = ()->{System.out.println("my functional interface");};
		x1.m1();
		x1.m2();
	}

}
