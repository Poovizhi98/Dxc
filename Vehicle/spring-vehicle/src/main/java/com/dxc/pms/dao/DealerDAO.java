package com.dxc.pms.dao;

import java.util.List;
import com.dxc.pms.model.Dealer;

public interface DealerDAO {
	public boolean addDealer(int userId,Dealer dealer);
    public Dealer getDealer(int userId,int dealerId);
    public boolean isDealerExists(int userId,int dealerId);
    public boolean deleteDealer(int userId,int dealerId);
    public boolean updateDealer(int userId,Dealer review);
    public List<Dealer> getAllDealer(int userId);
	public List<Dealer> getAllDealer();
}
