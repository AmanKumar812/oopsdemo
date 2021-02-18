package com.valuemomentum.file;

import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

 

public class BufferedWriterDemo{ 
public static void main(String args[]) { 

 

// Writing to a file using BufferedWriter in Java 

 

try { 
FileWriter writer = new FileWriter("Hello.txt",true); //true -append, false -clear existing content and add new data
BufferedWriter bwr = new BufferedWriter(writer);  

 

bwr.write("James"); 
bwr.write("\n"); // bwr.newLine();
bwr.write("Hobert"); 
bwr.close(); 

 

System.out.println("succesfully written to a file"); } 
catch (IOException ioe) { 
ioe.printStackTrace(); 

 

}
 } 
}