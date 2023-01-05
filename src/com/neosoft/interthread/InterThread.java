package com.neosoft.interthread;

class MyThread extends Thread{
	int total=0;
	@Override
	public void run() {
		synchronized (this) {
		System.out.println("in child");
		for(int i=0;i<=100;i++) {
			total=total+i;
		}
		System.out.println("send a notification for waiting thread");
		this.notify();
	}
	}
}

public class InterThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread m=new MyThread();
		m.start();
		synchronized (m) {
			System.out.println("main calling wait method");
			m.wait();
			System.out.println("main thread got notification");
			System.out.println(m.total);
		}
	}
}
