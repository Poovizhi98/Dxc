package day2ex;

import java.util.Scanner;

public class SwapTwoNumbers {
	Scanner sc=new Scanner(System.in);
    int number1;
    int number2;
    public void display()
    {
    	System.out.println("Please enter number1:");
    	number1=sc.nextInt();
    	System.out.println("Please enter number2:");
    	number2=sc.nextInt();
    	number1=number1+number2;
    	number2=number1-number2;
    	number1=number1-number2;
    	System.out.println("First number is :"+number1);
    	System.out.println("Second number is :"+number2);
     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SwapTwoNumbers s=new SwapTwoNumbers();
         s.display();
	}

}
