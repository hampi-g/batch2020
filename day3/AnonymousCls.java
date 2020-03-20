package com.sonata.JavaBean;
class Demo{
	void show() {
		System.out.println("I am in show method of super class");
	}
}

public class AnonymousCls {

		//Anonymous class with Demo as base class
		static Demo d = new Demo(){
			void show() {
				super.show();
				System.out.println("I am in a flovor1Demo class");
			}
		};
		
		//An Anonymous class that implements Hello interface
		static Hello h = new Hello() {
			public void show() {
				System.out.println("I am in a anonymous  class");
			}
		};
		public static void main(String[] args) {
			d.show();
			h.show();

	}

}
interface Hello{
	void show();
}