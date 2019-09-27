package day2ex;

import java.util.Scanner;

public class DetermineVowel {
	
	Scanner sc=new Scanner(System.in);
    char c;
    public void display()
    {
    	System.out.println("Please enter a alphabet:");
        c = sc.next().charAt(0);
		
        if(c=='a' || c=='A' || c=='e' || c=='E' ||
        c=='i' || c=='I' || c=='o' || c=='O' ||
        c=='u' || c=='U')
        {
            System.out.print("This is a Vowel");
        }
        else
        {
            System.out.print("This is not a Vowel");
        }
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetermineVowel v=new DetermineVowel();
		v.display();

	}

}
