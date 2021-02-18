package com.valuemomentum.training.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

 public static void main(String[] args) {
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1,"JAVA");
hm.put(2,"C++");
hm.put(3,"PYTHON");
hm.put(4,"JAVASCRIPT");
System.out.println("HashMap :"+hm);
String s=hm.get(1);
System.out.println("The value at index 1 :"+s);
System.out.println("The value at index 3 :"+hm.get(3));
System.out.println("Keys of a HashMap :"+hm.keySet());
System.out.println("Values of a HashMap :"+hm.values());
System.out.println("Key/Value pair of an HashMap :"+hm.entrySet());
hm.replace(2,"C#");
System.out.println(hm);
for(Integer key:hm.keySet()) {
System.out.print(key+"-"+hm.get(key));
System.out.println(",");
}
System.out.print("\nEntries: ");
for (Entry<Integer, String> entry : hm.entrySet()) {
System.out.print(entry);
System.out.print(", ");
}
}

}
