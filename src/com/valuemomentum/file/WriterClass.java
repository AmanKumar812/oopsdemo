package com.valuemomentum.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class WriterClass {

	public static void main(String[] args) {
		try {
			Writer w=new FileWriter("c:/demo/data.txt");
			String content="Curse Btk";
			w.write(content);
			w.close();
			System.out.println("Data Written");
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
