package Javaday3ex;
import java.util.Scanner;

public class findProductId {
	 int productId;
	 String productName;
	 int productQuantity;
	 int productPrice;
	 static int pid;
	
    public findProductId(int productId, String productName, int productQuantity, int productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
    }

	public int getProductId() {
		return productId;
	}

	public String toString() {
		return "productDisplay [ productId=" + productId + ", productName=" + productName
				+ ", productQuantity=" + productQuantity + ", productPrice=" + productPrice + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          findProductId pdisplay[]=new findProductId[5];
          pdisplay[0]=new findProductId(1001,"Lakme",200,2000);
          pdisplay[1]=new findProductId(1002,"Ponds",10,500);
          pdisplay[2]=new findProductId(1003,"Colgate",150,1500);
          pdisplay[3]=new findProductId(1004,"Chair",1500,8500);
          pdisplay[4]=new findProductId(1005,"Vim",50,1500);
          Scanner sc=new Scanner(System.in);
          System.out.println("Please enter productId To search:");
      	  pid=sc.nextInt();
      	  int flag=0;
      	  for(int i=0;i<5;i++)
      	  {
      		  if(pdisplay[i].getProductId()==pid)
      		  {
      			  System.out.println(pdisplay[i].toString());
      			  flag=1;
      			  break;
      		  }
      	  }
      	  if(flag==0)
      		  System.out.println("Product Id does not exist");
          
	}

}




