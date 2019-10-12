package com.dxc.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.dxc.pms.dbcon.DBConnection;
import com.dxc.pms.model.Product;


public class ProductDAOImpl implements ProductDAO {

	public ProductDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	Connection connection=DBConnection.getConnection();
	private static final String FETCH_PRODUCT_ALL="select * from product";


	@Override
	public List<Product> getAllProducts() {
		List<Product>allProducts=new ArrayList<Product>();
		try {
			Statement stat=connection.createStatement();
			ResultSet res=stat.executeQuery(FETCH_PRODUCT_ALL);
			while(res.next())
			{
				Product product=new Product();
				product.setProductId(res.getInt(1));
				product.setProductName(res.getString(2));
				product.setQuantityOnHand(res.getInt(3));
				product.setPrice(res.getInt(4));
				allProducts.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  allProducts;
		
			}
	public Product getProduct(int productId) {
		Product product=new Product();
		try {
			PreparedStatement statement=connection.prepareStatement("select * from product where productId=?");
		
		statement.setInt(1, productId);
		ResultSet res=statement.executeQuery();
		res.next();
		
		product.setProductId(res.getInt(1));
		product.setProductName(res.getString(2));
		product.setQuantityOnHand(res.getInt(3));
		product.setPrice(res.getInt(4));
		}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return product;
	}

	@Override
	public void addProduct(Product product) {
		try
		{
		PreparedStatement preparedStatement=
				 connection.prepareStatement("insert into product values(?,?,?,?)");
		preparedStatement.setInt(1, product.getProductId());
		preparedStatement.setString(2, product.getProductName());
		preparedStatement.setInt(3, product.getQuantityOnHand());
		preparedStatement.setInt(4, product.getPrice());
		
		preparedStatement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteProduct(int productId) {
		//allProducts.removeIf(n->n.getProductId()==productId);
		try {
			PreparedStatement statement=
					 connection.prepareStatement("delete from product where productId=?");
			statement.setInt(1, productId);
			statement.executeUpdate();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateProduct(Product product) {
		try{
		 
		 
		PreparedStatement stat=connection.prepareStatement("update product set productName=?,QuantityOnHand=?,price=? where productId=?");
			stat.setInt(3,product.getPrice());
			stat.setString(1,product.getProductName());
			stat.setInt(2,product.getQuantityOnHand());
			stat.setInt(4,product.getProductId());
			
			stat.executeUpdate();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	public boolean isProductExists(int productId) {
		// TODO Auto-generated method stub
		boolean productExists=false;
		try {
			PreparedStatement stat=connection.prepareStatement("select* from product where productId=?");
			stat.setInt(1, productId);
			ResultSet res=stat.executeQuery();
			if(res.next())
				productExists=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return productExists;
	}

}
