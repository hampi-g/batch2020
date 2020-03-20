package com.sonata;

public class StaticEx 
{
	//static variable
	static int a = 10;
	static int b;
	
	//static block
	 static
	 {
		 System.out.println("static block will execute first");
		 b=a*50;
	 }
	 
	 //static method
	 
	 static void m1()
	 {
		 System.out.println("this is static method");
	 }
	 
	 public static void main(String args[])
	 {
		 
		 //calling the m1() without creating
		 m1();
		 System.out.println("main method is executed");
		 System.out.println("value of a is :"+a);
		 System.out.println("value of b is :"+b);
	 }

}
