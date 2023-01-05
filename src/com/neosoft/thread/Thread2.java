package com.neosoft.thread;

class MyThread1 extends Thread{
	@Override
	public void start() {
		super.start();
		System.out.println("Start method");
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread"+i);
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {
		MyThread1 t=new MyThread1();
		t.start();
		for(int j=0;j<10;j++) {
			System.out.println("Main Thread"+j);
		}
	}
}

