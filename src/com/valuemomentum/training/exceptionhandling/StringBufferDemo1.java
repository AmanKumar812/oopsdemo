package com.valuemomentum.training.exceptionhandling;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("JamesGosling");
		int l=str.length();
		System.out.println("The length of string is"+l);
		
		System.out.println("capacity"+str.capacity());
		System.out.println("Substring:"+str.substring(0,4));//returns string fro starting index to length-1
		
		str.replace(5, 10, "java");
		System.out.println(str);
		
		str.delete(2, 5);
		System.out.println(str);
		System.out.println("reversed string:"+str.reverse());
	}

}
