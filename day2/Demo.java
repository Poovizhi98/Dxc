package day2;

public class Demo {
	byte b;
	short s;
	int a;
	long l;
	float fl;
	double d;
	char alphabet='G';
	boolean married;
	public void display()
	{
		System.out.println("Default value of byte is :" +b);
		System.out.println("Default value of short is :" +s);
		System.out.println("Default value of int is :" +a);
		System.out.println("Default value of long is :" +l);
		System.out.println("Default value of float is :" +fl);
		System.out.println("Default value of double is :" +d);
		System.out.println("Default value of char is :" +alphabet);
		System.out.println("Default value of boolean is:" +married);
	}
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.display();
	}
	

}
