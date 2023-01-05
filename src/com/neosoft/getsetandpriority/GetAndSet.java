package com.neosoft.getsetandpriority;

class MyThread extends Thread{
	
}

public class GetAndSet {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread t=new MyThread();
		System.out.println(t.getName());
		t.setName("MyThread");
		System.out.println(t.getName());
		Thread.currentThread().setName("MainThread");
		System.out.println(Thread.currentThread().getName());
	}
}
