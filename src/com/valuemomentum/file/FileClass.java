package com.valuemomentum.file;
import java.util.*;
import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) {
		File f=new File("c:/test/hello.txt");
	try {
		
		if(f.createNewFile())
		{
			System.out.println("New file created");
		}else
		{
			System.out.println("File already exists");
		}
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	System.out.println("Name of the file"+f.getName());
	System.out.println("psth of the file:"+f.getPath());
	System.out.println("File last modified:"+new Date(f.lastModified()));
	System.out.println("Parent diretory:"+f.getParent());
	System.out.println("size of file:"+f.length());

	}

}
