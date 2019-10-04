package com.dxc.psngr.dao;

import java.util.List;

import com.dxc.psngr.model.Passenger;

public interface PassengerDAO {
    public void addPassenger(Passenger passenger);
	public Passenger getPassenger(int pnrNumber);
	public List<Passenger> getAllPassengers();
	public void deletePassenger(int pnrNumber);
	public void updatePassenger(Passenger passenger);
	
}
