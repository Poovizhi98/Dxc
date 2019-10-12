package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList names=new ArrayList();
        names.add("Suresh1");
        names.add("Suresh2");
        names.add("Suresh3");
        names.add("Suresh4");
        names.add("Suresh5");
        //names.remove(2);
        System.out.println("1."+names.add("Naresh"));
        System.out.println(names);
        System.out.println("2."+names.get(4));
        System.out.println("3."+names.contains("Ram"));
        System.out.println(names.size());
		System.out.println(names.subList(1, 5));
		System.out.println(names.lastIndexOf("Naresh"));
		System.out.println(names.isEmpty());
        
	}

}
