package com.dxc.pms.service;

import java.util.List;

import com.dxc.pms.model.Dealer;


public interface DealerService {
	public boolean addDealer(int userId,Dealer dealer);
    public Dealer getDealer(int userId,int dealerId);
    public boolean isDealerExists(int userId,int dealerId);
    public boolean deleteDealer(int userId,int dealerId);
    public boolean updateDealer(int userId,Dealer review);
    public Dealer getAllDealer(int userId);
}
