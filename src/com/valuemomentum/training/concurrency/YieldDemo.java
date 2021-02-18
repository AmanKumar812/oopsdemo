package com.valuemomentum.training.concurrency;

//java program to illustrate yield method
class MyThread5 extends Thread
{
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName()+" in control");
		
	}
}
// Driver class
public class YieldDemo {

	public static void main(String[] args) {
		MyThread5 t=new MyThread5();
		t.start();
		
		for(int i=0;i<5;i++)
		{
			//control passes to child thread
			Thread.yield();
			//After execution of child thread Main thread takes over
			System.out.println(Thread.currentThread().getName()+" in control");
			
		}
		
	}

}
