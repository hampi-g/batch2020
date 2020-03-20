package com.sonata.JavaBean;

public class PrivateInterface implements PrivateIn{
	
	public void Mul(int a, int b) {
		System.out.println("answer by abstract method =");
		System.out.println(a*b);
	}
	public static void main(String args[]) {
		PrivateIn obj = new PrivateInterface();
		obj.add(10, 20);
		obj.mul(20, 30);
	}
	public void mul(int a, int b) {
		
	}

}
