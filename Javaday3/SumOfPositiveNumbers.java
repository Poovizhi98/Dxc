package Javaday3;
import java.util.Scanner;

public class SumOfPositiveNumbers {
	Scanner sc=new Scanner(System.in);
	int num=0;
	int sum=0;
	int count=0;
	int choice=0;
	public void display() {
		do {
			System.out.println("Please enter number between 0-100:"+"number"+(++count));
			num=sc.nextInt();
			if(num<0)
			{
			  System.out.println("Negative numbers are not allowed");
			  count--;
			  continue;
			}
			if(num>100)
			{
				break;
			}
			sum+=num;
			System.out.print("Do you want to continue(1 to continue,any number to exit)");
			choice=sc.nextInt();
		}while(choice==1);
		System.out.println("Your sum is:"+ sum);
	}
	
	public static void main(String[] args) {
		SumOfPositiveNumbers s=new SumOfPositiveNumbers();
		s.display();
		System.out.println("Thanks for using my program");
		
	}
	

}
