package com.sonata.JavaBean;
class Outer{

	class Inner{
		public void show() {
			System.out.println("in a nested class method");
		}
	}
}

public class InnerCls {
	public static void main(String args[]) {
		Outer.Inner in = new Outer().new Inner();
		in.show();
	}
}
