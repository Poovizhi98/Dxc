package day5java;

public class Exceptiondemo {
	public void display() {
		System.out.println("Display Started");
		System.out.println("APPLE");
		try {
			System.out.println("BALL");
			//int marks[]=new int[-5];
			System.out.println("CAT");
			char[][] marks = null;
			System.out.println(marks[5]);
		} catch (NegativeArraySizeException e1) {
			System.out.println("Negative array size");
		}
		catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("Array can't be accessed beyond its length");
		}
		System.out.println("Display Ended");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started");
		Exceptiondemo exceptiondemo=new Exceptiondemo();
		exceptiondemo.display();
		System.out.println("Main Ended");
	}

}
