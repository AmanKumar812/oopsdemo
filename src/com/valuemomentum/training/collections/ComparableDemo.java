package com.valuemomentum.training.collections;
import java.util.ArrayList;
import java.util.Collections;

 

public class ComparableDemo {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
ArrayList<Student>al=new ArrayList<Student>();
al.add(new Student(111,"joe",24));
al.add(new Student(1123221,"joxxe",224));
al.add(new Student(112111,"jodse",124));

 

Collections.sort(al);
for(Student st:al) {
    System.out.println(st.rollno+" " +st.name+" "+st.age);
}
}
    }


