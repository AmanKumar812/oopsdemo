package com.valuemomentum.training.collections;
import java.util.*;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		
		al.add("Jim");
		al.add("Micheal");
		al.add("James");
		al.add("Andy");
		
		System.out.println(al);// normal
		
		//traversing elements using iterator
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println(al.get(1));
		al.add(3, "Btk");//adding elements at specified index
		al.remove(0);//deletes at 0
		al.set(1,"Curse");//replace at ondex
		
		
		//using for each
		System.out.println("***using for each :");
		for(String i:al)
		{
			System.out.println(i);
		}

	}

}
