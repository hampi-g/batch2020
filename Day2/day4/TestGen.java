package com.sonata.Lambda;

public class TestGen {
	
	//Generic with method
	public static <E> void simpleArray(E[] elements) {
		for(E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		EmpGn<String> gn = new EmpGn<String>();
		gn.add("abc");
		System.out.println(gn.get());
		
		Integer[] a1 = {10,20,30,40,50};
		simpleArray(a1);
	}

}
