package day2;

public class DemoVariables {
	int i=50;
	public void display()
	{
		int j=0;
		if(i<100)
		{
			j=10;
		}
		System.out.println(i+j);
	}
		public static void main(String args[])
		{
			DemoVariables v=new DemoVariables();
			v.display();
		}

}
