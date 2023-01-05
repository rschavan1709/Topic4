package com.neosoft.runnable;

public class ThreadDemo {
	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		for(int j=0;j<10;j++) {
			System.out.println("Main Thread"+j);
		}
	}

}
