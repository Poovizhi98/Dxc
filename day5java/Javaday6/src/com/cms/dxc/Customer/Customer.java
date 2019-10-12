package com.cms.dxc.Customer;

import com.cms.dxc.exception.InvalidBillException;
import com.cms.dxc.exception.InvalidCustomerId;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	public Customer() {
		super();
	}
	public Customer(int customerId, String customerName, String customerAddress, int billAmount) throws InvalidBillException, InvalidCustomerId {
		super();
		checkCustomerId(customerId);
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		checkBillAmount(billAmount);
		
	}
	private void checkCustomerId(int customerId) throws InvalidCustomerId {
		if (customerId<0) 
			throw new InvalidCustomerId("Customer Id cannot be negative");
		else
			this.customerId = customerId;
	}
	private void checkBillAmount(int billAmount) throws InvalidBillException {
		if (billAmount<0) 
			throw new InvalidBillException("Bill amount cannot be negative");
		else
			this.billAmount = billAmount;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) throws InvalidCustomerId {
		checkCustomerId(customerId);
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
	public void setBillAmount(int billAmount) throws InvalidBillException {
		checkBillAmount(billAmount);
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + "]";
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
		Customer other = (Customer) obj;
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
	
	

}
