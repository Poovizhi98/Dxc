package threaddemos;

public class Demo3 extends Thread{
	Thread t1,t2;
	
public Demo3(int i) {
	setName(i+"");
	Thread.currentThread().setName("M");
	if(i==3)
	{
		setPriority(10);
	}
	start();
}
public void run() {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("RUN CALLED "+Thread.currentThread().getName());
}
	
public static void main(String[] args) {
		for (int i = 1; i <=3; i++) {
			// TODO Auto-generated method stub
			new Demo3(i);
		}
	System.out.println("MAIN CALLED BY "+Thread.currentThread().getName());
	}

}
