package com.neosoft.getsetandpriority;

class MyThread2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread"+i);
		}
	}
}
public class Priority2 {
	public static void main(String[] args) {
		MyThread2 t=new MyThread2();
		t.setPriority(9);
		System.out.println(t.getPriority());
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread"+i);
		}
	}
}
