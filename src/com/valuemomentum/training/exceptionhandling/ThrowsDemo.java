package com.valuemomentum.training.exceptionhandling;

public class ThrowsDemo {
	
	void Division() throws ArithmeticException
	{
		int a=45,b=0,rs;
		rs=a/b;
		System.out.println("\n The result is:"+rs);
	}

	public static void main(String[] args) {
	ThrowsDemo T=new ThrowsDemo();
	try {
		T.Division();
	}
	catch(ArithmeticException Ex)
	{
		System.out.println("\nError:"+Ex.getMessage());
	}
System.out.println("\n End of program");
	}

}
