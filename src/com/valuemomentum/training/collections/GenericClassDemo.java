package com.valuemomentum.training.collections;
class Sample<T>//Generic class
{
	private T data;
	
	public Sample(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	
}

public class GenericClassDemo {

	public static void main(String[] args) {
		
		Sample<Integer> s1=new Sample<Integer>(15);
		//s1.setData(15);//
		System.out.println(s1.getData());//Display data from generic
		
		Sample<String> s2=new Sample<String>("Java Generics");
		//s2.setData("Java Generics");//
		System.out.println("Display from generic class of type string"+s2.getData());

	}

}
