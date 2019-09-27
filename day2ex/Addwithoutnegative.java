package day2ex;
import java.util.Scanner;

public class Addwithoutnegative {
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
    	if(number1<0)
    	{
    	System.out.println("Don't enter negative numbers");
        System.exit(0);
    	}
    	System.out.println("Please enter number2:");
    	number2=sc.nextInt();
    	if(number2<0)
    	{
    	System.out.println("Don't enter negative numbers");
        System.exit(0);
    	}
    	sum=number1+number2;
    	System.out.println("Your sum is:"+sum);
    
    	
    }
    public static void main(String args[])
    {
    	Addwithoutnegative a=new Addwithoutnegative();
    	a.display();
    }

}
