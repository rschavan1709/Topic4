package com.neosoft.thread;

public class VolatileKeyword {
	private static volatile int a=10;
	public static void main(String[] args) {
		
		new A().start();
		new B().start();
	}
	static class A extends Thread {
		@Override
		public void run() {
			a=a*10;
			System.out.println(a);
		}
	}
	static class B extends Thread {
		
		@Override
		public void run() {
			a=a+40;
			System.out.println(a);
		}
	}
}
