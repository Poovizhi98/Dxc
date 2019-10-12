package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set panNumbers=new HashSet();
		panNumbers.add("Rahul");
		panNumbers.add("Jaya");
		panNumbers.add("Zoya");
		panNumbers.add("Rohit");
		panNumbers.add("Arun");
		panNumbers.add("Uday");
		System.out.println(panNumbers);
		
		Iterator i=panNumbers.iterator();
		while(i.hasNext())
		{
			String str=(String) i.next();
	        if(str.charAt(0)=='R')
	        	System.out.println(str);		
		}
		

	}

	private static int charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
