package day2;

import java.util.Scanner;

public class DemoInput
{
	Scanner sc=new Scanner(System.in);
    int age;
    String personName;
    public void display()
    {
    	System.out.println("Please enter your name:");
    	personName=sc.next();
    	System.out.println("Please enter your age:");
    	age=sc.nextInt();
    	System.out.println("Your name is:"+personName);
    	System.out.println("Your age is:"+age);
    
    	
    }
    public static void main(String args[])
    {
    	DemoInput d=new DemoInput();
    	d.display();
    }
}
