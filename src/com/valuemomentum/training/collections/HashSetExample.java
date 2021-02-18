package com.valuemomentum.training.collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
	
		HashSet<String> hset=new HashSet<String>();
		
		hset.add("apple");
		hset.add("mango");
		hset.add("orange");
		hset.add("grapes");
		hset.add("fig");
		
		// addition of duplicate elemnts
		hset.add("apple");
		hset.add("mango");
		//addition of null values
		hset.add(null);
		hset.add(null);
		//displaying hash set elements
		System.out.println(hset);
		

	}

}
