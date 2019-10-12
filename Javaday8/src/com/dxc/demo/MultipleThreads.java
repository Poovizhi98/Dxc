package com.dxc.demo;

public class MultipleThreads extends Thread{
	 Thread t1;
	 Thread t2;
	 public MultipleThreads() {
			t1=new Thread(new Music());
			t1.setName("1");
			t1.start();
			t2=new Thread(new Score());
			t2.setName("2");
			t2.start();
			System.out.println("CONS CALLED "+Thread.currentThread().getName());
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread tt=Thread.currentThread();
		tt.setName("BOSS");
		new MultipleThreads();
		System.out.println("MAIN CALLED "+Thread.currentThread().getName());

	}

}
	 class Music extends Thread{
		 public void run() {
			 System.out.println("MUSIC CALLED BY: "+Thread.currentThread().getName());
			 
		 }
	 }
	 
	 class Score extends Thread{
		 public void run() {
			 System.out.println("SCORE CALLED BY: "+Thread.currentThread().getName());
			 
		 }
	 }
