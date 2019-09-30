package Javaday3;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		System.out.println(p.getProductName());
		
		Product product[] = new Product[5];
		for (int i = 0; i < product.length; i++) {
			product[i]=new Product();
		}
		System.out.println(product[3].getProductName());

	}

}