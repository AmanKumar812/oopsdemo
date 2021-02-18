package com.valuemomentum.file;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializeDemo {

	public static void main(String[] args) throws Exception {
	Employee e=null;
	try {
		FileInputStream fileIn=new FileInputStream("c:/demo/employee.ser");
		ObjectInputStream in=new ObjectInputStream(fileIn);
		e=(Employee)in.readObject();
		in.close();
		fileIn.close();
		
	}
	catch(ClassNotFoundException c) {
		c.printStackTrace();
		return;
	}
	System.out.println("Deseialized Employee...");
	System.out.println("Name:"+e.name);
	System.out.println("Address:"+e.address);
	System.out.println("SSN:"+e.SSN);//show 0 since SSN is transient
	System.out.println("Number:"+e.number);

	}
}
