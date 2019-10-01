package javaday4;
public class StudentTest {
		 
	    public static void display(int regno) {
	        System.out.println("Registration No. " + regno);
	    }
	 
	    public static void display(String name) {
	        System.out.println("Name. " + name);
	    }
	 
	    public static void main(String str[]) {
	        Student s1 = new Student("Mary",198);
	        display(s1.getName());
	        display(s1.getRegno());
	    }
	}

