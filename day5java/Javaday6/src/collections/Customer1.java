package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Customer1 implements Comparable<Customer1>{

	int customerId;
	String customerName;
	String customerAddress;
	int billAmount;
	public Customer1() {
		super();
	}
	public Customer1(int customerId, String customerName, String customerAddress, int billAmount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billAmount;
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer1 other = (Customer1) obj;
		if (billAmount != other.billAmount)
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\nCustomer1 [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + "]";
	}
	
	public static void main(String[] args) {
	   List<Customer1> customers = customerData();
	   
	  /* Iterator<Customer1>i=customers.iterator();
	   while(i.hasNext())
	   {
		   System.out.println(i.next());
	   }*/
	   printCustomerData("Before Sorting",customers);
	   
	   Collections.sort(customers);
	   printCustomerData("After Sorting",customers);

	   	   
	}
	private static void printCustomerData(String message,List<Customer1> customers) {
		System.out.println(message);
		System.out.println(customers);
	}
	private static List<Customer1> customerData() {
		   Customer1 customer1 = new Customer1(1,"Poovizhi","Dharmapuri",200);
		   Customer1 customer2 = new Customer1(2,"Jaya","Pune",876);
		   Customer1 customer3 = new Customer1(3,"Arun","Lucknow",5678);
		   Customer1 customer4 = new Customer1(4,"Mohit","Bangalore",1000);
		   Customer1 customer5 = new Customer1(5,"Harish","Chennai",2000);
		   
		   List<Customer1>customers=new ArrayList<Customer1>(); 
		   
		   customers.add(customer1);
		   customers.add(customer2);
		   customers.add(customer3);
		   customers.add(customer4);
		   customers.add(customer5);
		   customers.add(new Customer1(6,"Maya","Raipur",890));
		   return customers;
	}
	@Override
	public int compareTo(Customer1 o) {
		// TODO Auto-generated method stub
		if(this.customerName.compareTo(o.customerName)>0)
		    return 0;
		else
			return -1;
	}
	
	
	
	
}
