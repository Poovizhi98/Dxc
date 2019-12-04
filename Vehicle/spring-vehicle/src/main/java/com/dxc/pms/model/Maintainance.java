package com.dxc.pms.model;

import org.springframework.data.annotation.Id;

public class Maintainance {
	@Id
	private int maintainID;
	private String vehicleName;
	private String service;
	private String date;
	private double mileage;
	
		public int getMaintainID() {
		return maintainID;
	}
	public void setMaintainID(int maintainID) {
		this.maintainID = maintainID;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	
public Maintainance(int maintainID, String vehicleName, String service, String date, double mileage) {
		super();
		this.maintainID = maintainID;
		this.vehicleName = vehicleName;
		this.service = service;
		this.date = date;
		this.mileage = mileage;
	}
	
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((date == null) ? 0 : date.hashCode());
	result = prime * result + maintainID;
	long temp;
	temp = Double.doubleToLongBits(mileage);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((service == null) ? 0 : service.hashCode());
	result = prime * result + ((vehicleName == null) ? 0 : vehicleName.hashCode());
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
	Maintainance other = (Maintainance) obj;
	if (date == null) {
		if (other.date != null)
			return false;
	} else if (!date.equals(other.date))
		return false;
	if (maintainID != other.maintainID)
		return false;
	if (Double.doubleToLongBits(mileage) != Double.doubleToLongBits(other.mileage))
		return false;
	if (service == null) {
		if (other.service != null)
			return false;
	} else if (!service.equals(other.service))
		return false;
	if (vehicleName == null) {
		if (other.vehicleName != null)
			return false;
	} else if (!vehicleName.equals(other.vehicleName))
		return false;
	return true;
}
@Override
public String toString() {
	return "Maintainance [maintainID=" + maintainID + ", vehicleName=" + vehicleName + ", service=" + service
			+ ", date=" + date + ", mileage=" + mileage + "]";
}
public Maintainance() {
	super();
}
	
	

}
