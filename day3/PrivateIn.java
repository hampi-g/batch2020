package com.sonata.JavaBean;

public interface PrivateIn {
	public abstract void mul(int a, int b);
	
	public default void add(int a, int b) {
		//private method inside default method
		sub(a,b);
		System.out.println(a + b);
	}
	private void sub(int a,int b) {
		System.out.println("Answer by private method=");
		System.out.println(a-b);
	}

}
