package com.valuemomentum.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
	Employee e=new Employee();
	e.name="Aman BTK";
	e.address="Pochinki,Erangel";
	e.SSN=5259877;
	e.number=172;
	try {
		FileOutputStream fileOut=new FileOutputStream("c:/demo/employee.ser");
		ObjectOutputStream out=new ObjectOutputStream(fileOut);
		out.writeObject(e);
		out.close();
		fileOut.close();
		System.out.println("Serialized dat is saved in c:/demo/employee.ser");
	}catch(IOException i) {
		i.printStackTrace();
	}

	}

}
