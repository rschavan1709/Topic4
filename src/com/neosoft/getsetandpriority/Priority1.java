package com.neosoft.getsetandpriority;

class MyThread1 extends Thread{
	
}

public class Priority1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		MyThread1 t=new MyThread1();
		System.out.println(t.getPriority());
	}
}
