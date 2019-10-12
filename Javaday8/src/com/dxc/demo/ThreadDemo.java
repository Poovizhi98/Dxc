package com.dxc.demo;

public class ThreadDemo extends Thread{

	   Thread t1;
	   
	public ThreadDemo() {
		t1=new Thread(this);
		t1.start();
		//System.out.println("CONS CALLED "+Thread.currentThread().getName());
	}
	public void run() {
		System.out.println("RUN CALLED "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadDemo();
		System.out.println("MAIN CALLED "+Thread.currentThread().getName());

	}

}
