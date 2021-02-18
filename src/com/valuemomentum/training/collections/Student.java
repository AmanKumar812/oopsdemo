package com.valuemomentum.training.collections;

public class Student implements Comparable<Student> {
int rollno;
String name;
int age;
public String rollNo;

public Student(int rollno, String name, int age) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.age = age;
}

public int compareTo(Student st)
{
	if(age==st.age)
		return 0;
	else if(age>st.age)
		return 1;
	else 
		return -1;
	
}
}
