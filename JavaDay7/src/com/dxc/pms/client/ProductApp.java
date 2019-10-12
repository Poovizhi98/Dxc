package com.dxc.pms.client;

import java.util.Scanner;

import com.dxc.pms.dao.ProductDAO;
import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.model.Product;

public class ProductApp {
	ProductDAO productDAO;
	int choice=0;
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	
	public ProductApp() {
		this.productDAO=new ProductDAOImpl();
		
	}
	public void LaunchProductApp() {
		
		while(true)
		{
			System.out.println("M E N U");
			System.out.println("1.Add product");
			System.out.println("2.Get All Products");
			System.out.println("3.Get products by Product Id");
			System.out.println("4.Delete product by Product Id");
			System.out.println("5.Update products");
			System.out.println("6.E X I T");
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Please enter your choice between 1 to 6");
			choice=scanner.nextInt();
			
			switch(choice) {
			case 1:
				Product product = takeInputProduct(scanner);
				if(!productDAO.isProductExists(product.getProductId()))
				{
					productDAO.addProduct(product);	
				}else
				{
					System.out.println("Product already exists with product id: "+productId);
				}
				
				break;
			case 2:
				System.out.println(productDAO.getAllProducts());
				break;
			case 3:
				System.out.println("Please enter product Id to search");
				productId=scanner.nextInt();
				if(productDAO.isProductExists(productId))
				{
					Product searchedProduct=productDAO.getProduct(productId);	
					System.out.println(searchedProduct);
				}else
				{
					System.out.println("ProductId doesnot exists");
				}
				break;
			case 4:
				System.out.println("Please enter product Id to delete");
				productId=scanner.nextInt();
				if(productDAO.isProductExists(productId))
				{
					productDAO.deleteProduct(productId);
					System.out.println("Product deleted successfully");

				}else
				{
					System.out.println("ProductId doesnot exists");
				}

				break;
			case 5:
				System.out.println("Welcome to product app updation:");
				Product productToUpdate = takeInputProduct(scanner);
				if(productDAO.isProductExists(productToUpdate.getProductId()))
				{
					productDAO.updateProduct(productToUpdate);
					System.out.println("Your product updated successfully");
	
				}else
				{
					System.out.println("ProductId doesnot exists");
				}
				break;
				
			case 6:
				System.out.println("Thanks for using my app");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid number.Please enter number between 1 to 6 only");
				
			}
		}
	}
	private Product takeInputProduct(Scanner scanner) {
		System.out.println("Please enter product Id");
		productId=scanner.nextInt();
		System.out.println("Please enter product Name");
		productName=scanner.next();
		System.out.println("Please enter Quantity");
		quantityOnHand=scanner.nextInt();
		System.out.println("Please enter price of the product");
		price=scanner.nextInt();
		
		Product product=new Product(productId,productName,quantityOnHand,price);
		return product;
	}

}
