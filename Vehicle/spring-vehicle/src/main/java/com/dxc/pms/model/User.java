package com.dxc.pms.model;

import java.util.List;

import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
@Id
	private int userId;
	private String userName;
	private String email;
	private double contactNumber;
	private int pinCode;
	private String password;
	
	private List<Maintainance> maintainace;

    @OneToMany
    private Dealer dealer;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(double contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public List<Maintainance> getMaintainace() {
		return maintainace;
	}

	public void setMaintainace(List<Maintainance> maintainace) {
		this.maintainace = maintainace;
	}
	

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public User(int userId, String userName, String email, double contactNumber, int pinCode, String password,
			List<Maintainance> maintainace, Dealer dealer) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.pinCode = pinCode;
		this.password = password;
		this.maintainace = maintainace;
		this.dealer = dealer;
	}

	public User() {
		super();
		this.userId = 0;
		this.userName = "NA";
		this.email = "NA";
		this.contactNumber = 0;
		this.pinCode = 0;
		this.maintainace = null;
		this.password = "NA";
	}
	
	

	public User(int userId, String userName, String email, double contactNumber, int pinCode,
			List<Maintainance> maintainace, Dealer dealer) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.pinCode = pinCode;
		this.maintainace = maintainace;
		this.dealer = dealer;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", contactNumber="
				+ contactNumber + ", pinCode=" + pinCode + ", password=" + password + ", maintainace=" + maintainace
				+ ", dealer=" + dealer + "]";
	}

}
