package javaday4;

class Employee {
	int salary;
	public void finalize() {
		System.out.println("Employee object reclaimed--FINALIZE CALLED");
	}
}

public class garbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e1=new Employee();
        e1.salary=9000;
        System.out.println("Employee object created");
        Employee e2=new Employee();
        e1=e2;
        System.out.println(e1.salary);
        System.gc();
	}

}
