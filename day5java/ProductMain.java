package day5java;

import day5java.Product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(10,"Bottle",28,2800);
		Product p2=new Product(10,"Bottle",28,2800);
		Product p3=p1;
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
	}

}

