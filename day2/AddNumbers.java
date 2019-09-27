package day2;

import java.util.Scanner;

public class AddNumbers {
	Scanner sc=new Scanner(System.in);
    int number1;
    int number2;
    int sum;
    // instance variable
    public void display()
    {
    	//local variable
    	System.out.println("Please enter number1:");
    	number1=sc.nextInt();
    	System.out.println("Please enter number2:");
    	number2=sc.nextInt();
    	sum=number1+number2;
    	System.out.println("Your sum is:"+sum);
    
    	
    }
    public static void main(String args[])
    {
    	AddNumbers a=new AddNumbers();
    	a.display();
    }

}
