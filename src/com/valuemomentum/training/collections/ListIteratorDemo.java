package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("jim");
	al.add("btk");
	al.add("aman");
	al.add(1, "john");
	
	System.out.println("Element at 2nd position is :"+al.get(2));
	
	ListIterator<String> itr =al.listIterator();
	
	System.out.println("Traversing elements in forward direction...");
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	System.out.println("Travversing in backward direction.....");
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}

	}

}
