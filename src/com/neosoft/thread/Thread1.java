package com.neosoft.thread;


class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread"+i);
		}
	}
}

public class Thread1 {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		//t.start();
		t.run();
		for(int j=0;j<10;j++) {
			System.out.println("Main Thread"+j);
		}
	}
}
