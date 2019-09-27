package day2ex;

import java.util.Scanner;

public class DetermineLeapYear {
	Scanner sc=new Scanner(System.in);
    int year;
    boolean flag;
    public void display()
    {
    	System.out.println("Please enter a year:");
    	year=sc.nextInt();
    	flag=false;
    	if(year%400==0) 
    		flag=true;
    	else if(year%100==0)
    		flag=false;
    	else if(year%4==0)
    		flag=true;
    	else
    		flag=false;
    	if(flag)
    		System.out.println(year +" is a leap year");
    	else
    		System.out.println(year +"  is not a leap year");
      }
    public static void main(String args[])
    {
    	DetermineLeapYear a=new DetermineLeapYear();
    	a.display();
    }

}
