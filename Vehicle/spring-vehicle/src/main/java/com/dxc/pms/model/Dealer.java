package com.dxc.pms.model;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="dealer")

public class Dealer {
	
	@Id
	private int dealerId;
	private String dealerName;
	private String dealerEmail;
	private double dealerContactNumber;
	private double dealerPinCode;
	private String dealerAddress;
	

//    @JoinColumn 
//    private User user;
	public Dealer(int dealerId, String dealerName, String dealerEmail, double dealerContactNumber, double dealerPinCode,
			String dealerAddress) {
		super();
		this.dealerId = dealerId;
		this.dealerName = dealerName;
		this.dealerEmail = dealerEmail;
		this.dealerContactNumber = dealerContactNumber;
		this.dealerPinCode = dealerPinCode;
		this.dealerAddress = dealerAddress;
	}
	public Dealer() {
		super();
	}
	public int getDealerId() {
		return dealerId;
	}
	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getDealerEmail() {
		return dealerEmail;
	}
	public void setDealerEmail(String dealerEmail) {
		this.dealerEmail = dealerEmail;
	}
	public double getDealerContactNumber() {
		return dealerContactNumber;
	}
	public void setDealerContactNumber(double dealerContactNumber) {
		this.dealerContactNumber = dealerContactNumber;
	}
	public double getDealerPinCode() {
		return dealerPinCode;
	}
	public void setDealerPinCode(double dealerPinCode) {
		this.dealerPinCode = dealerPinCode;
	}
	public String getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dealerAddress == null) ? 0 : dealerAddress.hashCode());
		long temp;
		temp = Double.doubleToLongBits(dealerContactNumber);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dealerEmail == null) ? 0 : dealerEmail.hashCode());
		result = prime * result + dealerId;
		result = prime * result + ((dealerName == null) ? 0 : dealerName.hashCode());
		temp = Double.doubleToLongBits(dealerPinCode);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Dealer other = (Dealer) obj;
		if (dealerAddress == null) {
			if (other.dealerAddress != null)
				return false;
		} else if (!dealerAddress.equals(other.dealerAddress))
			return false;
		if (Double.doubleToLongBits(dealerContactNumber) != Double.doubleToLongBits(other.dealerContactNumber))
			return false;
		if (dealerEmail == null) {
			if (other.dealerEmail != null)
				return false;
		} else if (!dealerEmail.equals(other.dealerEmail))
			return false;
		if (dealerId != other.dealerId)
			return false;
		if (dealerName == null) {
			if (other.dealerName != null)
				return false;
		} else if (!dealerName.equals(other.dealerName))
			return false;
		if (Double.doubleToLongBits(dealerPinCode) != Double.doubleToLongBits(other.dealerPinCode))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Dealer [dealerId=" + dealerId + ", dealerName=" + dealerName + ", dealerEmail=" + dealerEmail
				+ ", dealerContactNumber=" + dealerContactNumber + ", dealerPinCode=" + dealerPinCode
				+ ", dealerAddress=" + dealerAddress + "]";
	}
	
	
}
