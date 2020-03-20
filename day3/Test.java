package com.sonata.JavaBean;

public class Test {
	public static void main(String args[])
	{
		Address a1 = new Address();
				a1.setCity("bang");
				a1.setPin(560027);
				a1.setState("kan");
				
				 Student s1 = new  Student ();
				 s1.setStdId(123);
				 s1.setStdMarks(99);
				 s1.setStdName("abc");
				 s1.setObj(a1);
				 System.out.println(s1);
		
	}

}
