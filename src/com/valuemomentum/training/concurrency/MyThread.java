package com.valuemomentum.training.concurrency;

public class MyThread extends Thread {

	public static void main(String[] args) {
		MyThread objex=new MyThread();
		objex.create();
		System.out.println("This is the main Thread");

	}
	public void create() {
		Thread objth=new Thread(this);
		objth.start();
	}
	public void run() {
		while(true) {
			try {
				System.out.println("This is the child thread");
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
		}
	}

}
}
