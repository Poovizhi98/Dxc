package collections;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class CollectionsBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List names=new Vector();
		
		names.add("Arun");
		names.add("Mohan");
		names.add("Rahul");
		names.add("Aliya");
		names.add("Ranveer");
		
		Collections.sort(names);
		System.out.println(names);
		int i=Collections.binarySearch(names, "Arun");
		System.out.println(i);
		

	}

}
