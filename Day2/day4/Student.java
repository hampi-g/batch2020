package com.sonata.CollectionEx;

public class Student implements Comparable<Student> {
	int stdId;
	String stdName;
	int stdAge;
	public Student(int stdId, String stdName, int stdAge) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAge = stdAge;
	}
	
	public int compareTo(Student st) {
		if(stdAge==st.stdAge)
			return 0;
		else if(stdAge>st.stdAge)
		return 1;
		else 
			return -1;
	}

}
