package com.cms.dxc.Client;

import com.cms.dxc.Customer.Customer;
import com.cms.dxc.exception.InvalidBillException;
import com.cms.dxc.exception.InvalidCustomerId;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=null;
		try {
			customer = new Customer(101,"Anu","Pune",1200);
			customer.setBillAmount(78);
			customer.setCustomerId(-10);
		} catch (InvalidBillException e) {
			System.out.println(e.getMessage());
		} catch (InvalidCustomerId e) {
			e.printStackTrace();
		}
	    System.out.println(customer);
	    System.out.println("Customer program ended");

	}

}
