package threaddemos;

class PrintClass{
	public static synchronized void PrintNames(String firstName,String lastName) {
		System.out.println("FirstName: "+firstName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("LastName: "+lastName);
	}
}

public class Demo4 extends Thread {
	Thread t1,t2;
	
public Demo4() {
	t1=new Thread(this);
	t1.start();
	t2=new Thread(this);
	t2.start();
}
public void run() {
	PrintClass.PrintNames("Mohan","Sharma");
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo4 demo=new Demo4();
	}

}
