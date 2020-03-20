package com.sonata.CollectionEx;

import java.util.ArrayList;
import java.util.Collections;

public class CompareEx {
	
	public static void main(String args[]) {
		ArrayList<Student> n1 = new ArrayList<>();
		n1.add(new Student(105,"hampi",21));
		n1.add(new Student(106,"bhagya",23));
		n1.add(new Student(107,"sonu",25));
		
		
		Collections.sort(n1);
		for(Student n2:n1)
		{
			System.out.println(n2.stdAge+" "+n2.stdId+" "+n2.stdName);
		}
		
		
	}

}
