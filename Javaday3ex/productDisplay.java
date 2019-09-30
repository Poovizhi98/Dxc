package Javaday3ex;
import java.util.Scanner;

public class productDisplay {
	Scanner sc=new Scanner(System.in);
	 int productId;
	 String productName;
	 int productQuantity;
	 int productPrice;

	public void display() {
		System.out.println("Please enter productId:");
    	productId=sc.nextInt();
    	if(productId<0)
    	{
    		System.out.println("Product Id won't be negative"); 
    		System.exit(0);
    	}
    	System.out.println("Please enter productName:");
    	productName=sc.next();
    	System.out.println("Please enter Product Quantity:");
    	productQuantity=sc.nextInt();
    	if(productQuantity<0)
    	{
    		System.out.println("Product Quantity won't be negative"); 
    		System.exit(0);
    	}
    	System.out.println("Please enter Product price:");
    	productPrice=sc.nextInt();
    	if(productPrice<0)
    	{
    		System.out.println("Product Price won't be negative"); 
    		System.exit(0);
    	}
    	
    	
	}
	
	@Override
	public String toString() {
		return "productDisplay [ productId=" + productId + ", productName=" + productName
				+ ", productQuantity=" + productQuantity + ", productPrice=" + productPrice + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          productDisplay pdisplay[]=new productDisplay[5];
          for(int i=0;i<5;i++)
          {
        	  pdisplay[i]=new productDisplay();
        	  pdisplay[i].display();
          }
          System.out.println("These are the products entered by you:");
          for(int i=0;i<5;i++)
          {
          System.out.println(pdisplay[i].toString());
          }
	}

}
