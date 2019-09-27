package day2;
import java.util.Date;

/*
 * 
 */

public class PrintDate
{
    public void display()
    {
    	Date d=new Date();
    	System.out.println(d);
    }
    public static void main(String args[])
    {
    	PrintDate d=new PrintDate();
    	d.display();
    }
}
